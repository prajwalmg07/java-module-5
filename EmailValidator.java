import java.util.Scanner;

class InvalidEmailException extends Exception {
    InvalidEmailException(String msg) {
        super(msg);
    }
}

public class EmailValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        try {
            if (!email.contains("@"))
                throw new InvalidEmailException("Invalid Email");
            System.out.println("Valid Email");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }
}
