import java.util.Scanner;

public class LeapYear {

    // ✅ Static main method for direct execution
    public static void main(String[] args) {
        LeapYear checker = new LeapYear();
        checker.checkLeapYear();
    }

    public void checkLeapYear() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year you entered is a leap year.");
        } else {
            System.out.println("The year you entered is not a leap year.");
        }
    }

    
}
