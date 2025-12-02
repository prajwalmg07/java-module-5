import java.util.Scanner;

public class ArraySizeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("Array allocated with size " + size);
        } catch (NegativeArraySizeException e) {
            System.out.println("Invalid array size");
        }
    }
}
