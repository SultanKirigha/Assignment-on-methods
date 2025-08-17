public class FibonacciEvenSum {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int sum = 0;

        while (b <= 4000000) {
            if (b % 2 == 0) sum += b;
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("Sum of even Fibonacci numbers under 4 million: " + sum);
    }
}
