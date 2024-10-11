// BfTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Bf}.
* It contains ten unit test cases for the {@link Bf#bf(String, String)} method.
*/
class BfTest {
			/**
			* Test case 1: planet1 and planet2 are correct planet names.
			* Expected result: a tuple containing all planets whose orbits are located between the orbit of planet1 and the orbit of planet2, sorted by the proximity to the sun.
			*/
			@Test
			void testCase1() {
				List<Object> expected = new ArrayList<Object>();
				expected.add("Venus");
				expected.add("Earth");
				expected.add("Mars");
				List<Object> actual = Bf.bf("Mercury", "Jupiter");
				assertEquals(expected, actual);
			}

			/**
			* Test case 2: planet1 and planet2 are correct planet names.
			* Expected result: a tuple containing all planets whose orbits are located between the orbit of planet1 and the orbit of planet2, sorted by the proximity to the sun.
			*/
			@Test
			void testCase2() {
				List<Object> expected = new ArrayList<Object>();
				expected.add("Earth");
				expected.add("Mars");
				expected.add("Jupiter");
				expected.add("Saturn");
				List<Object> actual = Bf.bf("Venus", "Uranus");
				assertEquals(expected, actual);
			}

			/**
			* Test case 3: planet1 and planet2 are correct planet names.
			* Expected result: a tuple containing all planets whose orbits are located between the orbit of planet1 and the orbit of planet2, sorted by the proximity to the sun.
			*/
			@Test
			void testCase3() {
				List<Object> expected = new ArrayList<Object>();
				expected.add("Mars");
				expected.add("Jupiter");
				expected.add("Saturn");
				expected.add("Uranus");
				expected.add("Neptune");
				List<Object> actual = Bf.bf("Earth", "Mercury");
				assertEquals(expected, actual);
			}

			/**
			* Test case 4: planet1 and planet2 are correct planet names.
			* Expected result: a tuple containing all planets whose orbits are located between the orbit of planet1 and the orbit of planet2, sorted by the proximity to the sun.
			*/
			@Test
			void testCase4() {
				List<Object> expected = new ArrayList<Object>();
				expected.add("Jupiter");
				expected.add("Saturn");
				expected.add("Uranus");
				expected.add("Neptune");
				List<Object> actual = Bf.bf("Mars", "Mercury");
				assertEquals(expected, actual);
			}

			/**
			* Test case 5: planet1 and planet2 are correct planet names.
			* Expected result: a tuple containing all planets whose orbits are located between the orbit of planet1 and the orbit of planet2, sorted by the proximity to the sun.
			*/
			@Test
			void testCase5() {
				List<Object> expected = new ArrayList<Object>();
				expected.add("Saturn");
				expected.add("Uranus");
				expected.add("Neptune");
				List<Object> actual = Bf.bf("Jupiter", "Mercury");
				assertEquals(expected, actual);
			}

			/**
			* Test case 6: planet1 and planet2 are correct planet names.
			* Expected result: a tuple containing all planets whose orbits are located between the orbit of planet1 and the orbit of planet2, sorted by the proximity to the sun.
			*/
			@Test
			void testCase6() {
				List<Object> expected = new ArrayList<Object>();
				expected.add("Uranus");
				expected.add("Neptune");
				List<Object> actual = Bf.bf("Saturn", "Mercury");
				assertEquals(expected, actual);
			}

			/**
			* Test case 7: planet1 and planet2 are correct planet names.
			* Expected result: a tuple containing all planets whose orbits are located between the orbit of planet1 and the orbit of planet2, sorted by the proximity to the sun.
			*/
			@Test
			void testCase7() {
				List<Object> expected = new ArrayList<Object>();
				expected.add("Neptune");
				List<Object> actual = Bf.bf("Uranus", "Mercury");
				assertEquals(expected, actual);
			}

			/**
			* Test case 8: planet1 and planet2 are correct planet names.
			* Expected result: a tuple containing all planets whose orbits are located between the orbit of planet1 and the orbit of planet2, sorted by the proximity to the sun.
			*/
			@Test
			void testCase8() {
				List<Object> expected = new ArrayList<Object>();
				expected.add("Earth");
				expected.add("Mars");
				expected.add("Jupiter");
				expected.add("Saturn");
				expected.add("Uranus");
				expected.add("Neptune");
				List<Object> actual = Bf.bf("Venus", "Mercury");
				assertEquals(expected, actual);
			}

			/**
			* Test case 9: planet1 and planet2 are correct planet names.
			* Expected result: a tuple containing all planets whose orbits are located between the orbit of planet1 and the orbit of planet2, sorted by the proximity to the sun.
			*/
			@Test
			void testCase9() {
				List<Object> expected = new ArrayList<Object>();
				expected.add("Mars");
				expected.add("Jupiter");
				expected.add("Saturn");
				expected.add("Uranus");
				expected.add("Neptune");
				List<Object> actual = Bf.bf("Earth", "Venus");
				assertEquals(expected, actual);
			}

			/**
			* Test case 10: planet1 and planet2 are correct planet names.
			* Expected result: a tuple containing all planets whose orbits are located between the orbit of planet1 and the orbit of planet2, sorted by the proximity to the sun.
			*/
			@Test
			void testCase10() {
				List<Object> expected = new ArrayList<Object>();
				expected.add("Jupiter");
				expected.add("Saturn");
				expected.add("Uranus");
				expected.add("Neptune");
				List<Object> actual = Bf.bf("Mars", "Venus");
				assertEquals(expected, actual);
			}
}