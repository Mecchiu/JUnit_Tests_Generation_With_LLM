// Solve1Test.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve1}.
* It contains one unit test case for the {@link Solve1#solve(int)} method.
*/
class Solve1Test {
  private static final int N = 1000;
		  // Variables
		  private static int[] a = new int[N];  // array of integers
		  private static int maxValue = 11111111;  // max value of the array
		  int sum = 0;  // sum of all the digits of the array
		  // constructors

        /**
         * Constructor with initial values.
         *
         * @param a integer array to initialize variables to
         * @param max the value that a array can have
         * @throws IllegalArgumentException is bad parameters in constructor
         */
        public Solve1Test(int[] a, int max) throws IllegalArgumentException{
            // check parameter correctness
            if (a.length!= N)
                throw new IllegalArgumentException("Parameter a wrong size.");
            if (max!= maxValue)
                throw new IllegalArgumentException("Parameter max wrong.");
            //check initial values
            for (int i = 0; i < N; i++) {
                if (a[i] > max)
                    throw new IllegalArgumentException("Parameter i wrong");
                a[i] = 0;
            }
            // initialize variables to 0
            for (int i = 0; i <= N; i++) {
                a[i] = 0;
            }
        }

        /**
         * Constructor with integer parameters and the value of the maximum.
         *
         * @param max numeric value to initialize variables to
         * @throws IllegalArgumentException  bad parameters in constructor
         */
        public Solve1Test(int max) throws IllegalArgumentException {
            // check parameter correctness
            if (max == 0)
                throw new IllegalArgumentException("Parameter max wrong");
            //check initial values
            maxValue = max;
            for (int i = 0; i < N; i++) {
                a[i] = 0;
            }
        }
       
        //@Test
        /**
         * Tests {@link Solve1#solve(int)}
         * Using integer values to set array with integers.
         */
        @Test
        void testIntegerSet() {
            Solve1 solver = new Solve1();
            solver.solve(N);
            System.out.println("Array value before the method is ");
            System.out.println(solver.sol);
            // compare result value with actual for testing
            assertEquals(sum, solver.sol);
        }

       //@Test
        /**
         * Tests {@link Solve1#solve(int)}
         * Using integer numbers to set array with numbers.
         */
        @Test
        void testIntegersSet() {
            Solve1 solver = new Solve1(N);
            solver.solve(N);
            System.out.println("Array value before the method is ");
            System.out.println(solver.sol);
            // compare result value with actual for testing
            assertEquals(sum, solver.sol);
        }

        //@Test
        /**
         * Tests {@link Solve1#solve(int)}
         * Using max value as a parameter with numbers.
         */
        @Test
        void testMaxValueSet() {
            Solve1 solver = new Solve1(maxValue);
            solver.solve(N);
            System.out.println("Array value before the method is ");
            System.out.println(solver.sol);
            // compare result value with actual for testing
            assertEquals(sum, solver.sol);
        }

        private static void assertContains(int s, int expected) {
            assertEquals(expected, a[s]);
        }
}
