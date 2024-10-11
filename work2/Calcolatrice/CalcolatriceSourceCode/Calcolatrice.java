public class Calcolatrice {

    /**
     * Return the sum of two int input a and b.
     * 
     * > add(1, 2)
     * "3"
     * > add(2, 1)
     * "3"
     * > add(20, -2)
     * "18"
     * > add(2, -3)
     * "-1"
     * > add(-2, 3)
     * "1"
     * > add(-20, 2)
     * "-18"
     * > add(-1, -2)
     * "-3"
     * > add(-2, -1)
     * "-3"
     * > add(1, 0)
     * "1"
     * > add(0, 1)
     * "1"
     * > add(0, 0)
     * "0"
     * > add(1, -1)
     * "0"
     */
    public int add(int a, int b) {
        System.out.println("Metodo somma chiamato con a = " + a + " e b = " + b);
        return a + b;
    }

    /**
     * Return the difference between the two input a and b.
     * 
     * > subtract(5, 3)
     * "2"
     * > subtract(3, 5)
     * "-2"
     * > subtract(3, 0)
     * "3"
     * > subtract(0, 3)
     * "-3"
     * > subtract(-2, 1)
     * "-3"
     * > subtract(-1, 2)
     * "-3"
     * > subtract(2, -1)
     * "3"
     * > subtract(1, -2)
     * "3"
     * > subtract(-3, -5)
     * "2"
     * > subtract(-5, -3)
     * "-2"
     * > subtract(5, 5)
     * "0"
     * > subtract(0, 0)
     * "0"
     */
    public int subtract(int a, int b) {
        System.out.println("Metodo sottrazione chiamato con a = " + a + " e b = " + b);
        return a - b;
    }

    /**
     * Return the product of two int input a and b.
     * 
     * > multiply(2, 3)
     * "6"
     * > multiply(3, 2)
     * "6"
     * > multiply(2, 0)
     * "0"
     * > multiply(0, 2)
     * "0"
     * > multiply(2, -4)
     * "-8"
     * > multiply(4, -2)
     * "-8"
     * > multiply(-3, 5)
     * "-15"
     * > multiply(-5, 3)
     * "-15"
     * > multiply(-4, -3)
     * "12"
     * > multiply(-3, -4)
     * "12"
     * > multiply(0, 0)
     * "0"
     */
    public int multiply(int a, int b) {
        System.out.println("Metodo moltiplica chiamato con a = " + a + " e b = " + b);    
        return a * b;
    }

    /**
     * Return the division of double input a and b.
     * 
     * > divide(3, 2)
     * "1.5"
     * > divide(2, 4)
     * "0.5"
     * > divide(0, 1)
     * "0"
     * > divide(1, 0)
     * "IllegalArgumentException"
     * > divide(-1, 2)
     * "-0.5"
     * > divide(-2, 1)
     * "-2.0"
     * > divide(15, -3)
     * "-5.0"
     * > divide(3, -15)
     * "-0.2"
     * > divide(-2, -4)
     * "0.5"
     * > divide(-4, -2)
     * "2.0"
     * > divide(0, 0)
     * "IllegalArgumentException"
     */
    public double divide(double a, double b) {
        System.out.println("Metodo dividi chiamato con a = " + a + " e b = " + b);
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return a / b;
    }

    /**
     * Return the product of all positive integers less than or equal to the input n.
     * 
     * > factorial(5)
     * "120"
     * > factorial(8)
     * "40320"
     * > factorial(2)
     * "2"
     * > factorial(3)
     * "6"
     * > factorial(1)
     * "1"
     * > factorial(0)
     * "1"
     * > factorial(-5)
     * "IllegalArgumentException"
     * > factorial(-1)
     * "IllegalArgumentException"
     */
    public int factorial(int n) {
        System.out.println("Metodo fattoriale chiamato con a = " + a + " e b = " + b);
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