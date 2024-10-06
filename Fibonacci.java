import java.util.Scanner;

class Fibonacci {
    public static int fib(int n) {
        if (n < 0 || n > 45) {
            throw new IllegalArgumentException("Input must be between 0 and 45");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 45: ");
        
        int n = scanner.nextInt();
        System.out.println("Fibonacci of " + n + " is: " + fib(n));
        
        scanner.close();
    }
}
