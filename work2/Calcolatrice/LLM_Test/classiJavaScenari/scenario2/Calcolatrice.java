public class Calcolatrice {

    /**
     * Return the sum of two int input a and b.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Return the difference between the two input a and b.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Return the product of two int input a and b.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Return the division of double input a and b.
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }

    /**
     * Return the product of all positive integers less than or equal to the input n.
     */
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}