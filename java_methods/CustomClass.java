public class CustomClass {
    public static void main(String[] args) {
        // Call static methods directly
        staticMethod1();
        staticMethod2();

        // Create an object to trigger constructor and call non-static method
        CustomClass obj = new CustomClass();
        obj.nonStaticMethod();
    }

    // Constructor
    public CustomClass() {
        System.out.println("Constructor called.");
    }

    // Non-static method
    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }

    // Static method 1
    public static void staticMethod1() {
        System.out.println("This is static method 1.");
    }

    // Static method 2
    public static void staticMethod2() {
        System.out.println("This is static method 2.");
    }

    // ✅ Main method to demonstrate all features
    
}
