// SolveTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve}.
* It contains one unit test case for the {@link Solve#solve(String)} method.
*/
class SolveTest {

		@Test
		public void test() {
			String s = "";
			solve(s);
			solve(s);
			String p = s;
			solve(p);
			assertEquals(s,p, Solve.solve(s));

			p = "abc";
			solve(p);
			p = "abc" + p;
			solve(p);
			p = "abc" + p + "abc";
			assertEquals(s,p, Solve.solve(p));

			p = "abc" + s; //p is 'abc'
			solve(p);
			s = "abc" + s;
			p = "abc" + s + "abc";
			solve(p);
			p = "abc" + s + "abc" + p;
			assertEquals(s,p, Solve.solve(p));
			p = "abc" + s + "abc" + s;
			solve(p);
			s = "abc" + s + "abc" + s + "abc" + s;
			p = p + "abc" + s + "abc" + p + "abc" + p;
			assertEquals(s,p, Solve.solve(p));

			p = "acb" + s; //p is 'cab'
			solve(p);
			p = "acb" + s;
			solve(p + "acb" + p + p);
			assertNotSame(p, s);
			p = "acb" + s;
			solve(p + "acb" + p + p + p);
			assertNotSame(p, s);
			p = "acb" + s + "dcb" + s;
			assertEquals(s,p);

			p = s;
			s = "acb";
			p = s + p;
			assertNotSame(s, p);

			p = p + s;
			assertNotSame(p, s);

			p = s;
			s = "acnb" + s + s;
			p = "cab";
			solve(p);
			s = "acb";
			p = p + s;
			p = p + s;
			g = p;
			p = p + s + p;
			assertEquals(g,p);

			solve("bc" + p);
			assertSame("bc" + p, Solve.solve("bc" + p));//p now matches the string
			solve("bc" + p + "bc" + s);
			assertEquals("cab", Solve.solve("cab"));
			assertThrowing(Solve.class, "Solve.solve(String)", AssertionError.class);

			try {
				new Solve().solve("cab" + s + "bc" + s);
				fail("Should throw a solvable exception for abc" + s + s + "bc");
			} catch (SolvableException ex) {
				// success
				assertEquals("" + s, ex.getArgument());
			}
		}
}
