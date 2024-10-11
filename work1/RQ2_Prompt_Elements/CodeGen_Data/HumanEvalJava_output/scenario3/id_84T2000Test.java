// Solve1Test.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve1}.
* It contains one unit test case for the {@link Solve1#solve(int)} method.
*/
class Solve1Test {
public final Solve1Test(){
			System.out.println("Starting Solve1Test");
		}
		@Test
		public void solve(int N) {
			assertEquals("a1",N,Solve1.solve(N));
		}
}


class Solve1Test2 {
		public static void main(String[] args) {
	}

	static String a1 = "1";

	@Test
		public void solve(int N) {
		assertEquals("a1",N, Solve1.solve(N));
	}
	@Test
	public void solve2() {
		int N = 100;
		while(N-- > 0){
			System.out.println("N: " + N);
			System.out.println("N/a1: " + N/a1);
		}
		assertTrue(a1 == Solve1.solve(N/a1));
		N = 1;
		while(N-- > 0){
			System.out.println("N: " + N);
			N/a1 = "10";
			System.out.println("New N/a1: " + N/a1);
		}
		assertEquals("1",N, Solve1.solve(1));
	}
}

// Solve1Test2.java
