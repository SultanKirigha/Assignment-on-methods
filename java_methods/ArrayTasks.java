import java.util.Scanner;

public class ArrayTasks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[15];
        int[] reversed = new int[15];
        int sum = 0, product = 1;

        System.out.println("Enter 15 integers:");
        for (int i = 0; i < 15; i++) {
            array[i] = input.nextInt();
            sum += array[i];
            product *= array[i];
        }

        // a) Print array
        System.out.print("Array: ");
        for (int num : array) System.out.print(num + " ");
        System.out.println();

        // b) Search value
        System.out.print("Enter number to search: ");
        int search = input.nextInt();
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                System.out.println("Number found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Number not found in this array.");

        // c) Reverse array
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        System.out.print("Reversed array: ");
        for (int num : reversed) System.out.print(num + " ");
        System.out.println();

        // d) Sum and product
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
