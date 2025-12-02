import java.util.Scanner;

public class NameToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        try {
            String part = name.substring(0, 3);
            int num = Integer.parseInt(part);
            System.out.println(num);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Input must contain at least 3 characters");
        } catch (NumberFormatException e) {
            System.out.println("First three characters must be numeric");
        }
    }

}

