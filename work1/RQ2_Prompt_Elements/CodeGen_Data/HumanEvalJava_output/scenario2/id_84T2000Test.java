// Solve1Test.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve1}.
* It contains one unit test case for the {@link Solve1#solve(int)} method.
*/
class Solve1Test {
@Test
		public void test() {
      	System.out.println("solve1");
        //Solve1.java
        int N = 1000000;

        String ret = Solve1.solve(N);
        check("The string is 1000000000000000000", ret, "2");


      	System.out.println("solve1-1");
        //Solve1.java
        N = 7; //0
        ret = Solve1.solve(N);
        check("The string is 10", ret, "2");

      	System.out.println("solve1-11");
        //Solve1.java
        N = 30;
        ret = Solve1.solve(N);
        check("The string is 25", ret, "3");

      	System.out.println("solve1-12");
        //Solve1.java
        N = 100; //0
        ret = Solve1.solve(N);
        check("The string is 1000000000000000000", ret, "2");
     }
     
	static void check(String expected, String actual, String expectedResult) {
        assertEquals("solve1: Expected and actual are " + expected + " but actual is "
                + actual, expected, actual);
        assertEquals("solve1: Actual result should not differ from " + expectedResult,
                expectedResult, actualResult);
	}
}
