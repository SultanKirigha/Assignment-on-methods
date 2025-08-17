import java.util.Scanner;

public class UnitAverage {

    // ✅ Static main method to run the class directly
    public static void main(String[] args) {
        UnitAverage averageCalculator = new UnitAverage();
        averageCalculator.calculateAverage();
    }

    public void calculateAverage() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks for Java Programming: ");
        double java = input.nextDouble();

        System.out.print("Enter marks for Networking: ");
        double networking = input.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double maths = input.nextDouble();

        double avg = (java + networking + maths) / 3;

        System.out.println("\nMarks for Java Programming: " + java);
        System.out.println("Marks for Networking: " + networking);
        System.out.println("Marks for Maths: " + maths);
        System.out.println("The average is: " + avg);
    }

    
}
