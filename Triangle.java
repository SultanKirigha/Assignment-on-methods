import java.util.Scanner;

public class Triangle {

    // ✅ Static main method to run the program
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.getDimensions();
        triangle.computeArea();
        triangle.displayArea();
    }

    double base, height, area;

    public void getDimensions() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        base = input.nextDouble();
        System.out.print("Enter height: ");
        height = input.nextDouble();
    }

    public void computeArea() {
        area = 0.5 * base * height;
    }

    public void displayArea() {
        System.out.println("Area of triangle: " + area);
    }

}
