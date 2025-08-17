import java.util.Scanner;

public class Methods {

    // Main method
    public static void main(String[] args) {
        Methods obj = new Methods();
        obj.findMinMax();
    }

    // Method to find the smallest and largest of three numbers
    public void findMinMax() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        int smallest = num1;
        int largest = num1;

        // Check for smallest
        if (num2 < smallest) smallest = num2;
        if (num3 < smallest) smallest = num3;

        // Check for largest
        if (num2 > largest) largest = num2;
        if (num3 > largest) largest = num3;

        // Display results
        System.out.println("The smallest number: " + smallest);
        System.out.println("The largest number: " + largest);
        System.out.println(largest + " is your largest and " + smallest + " is the smallest number.");
    }
}
