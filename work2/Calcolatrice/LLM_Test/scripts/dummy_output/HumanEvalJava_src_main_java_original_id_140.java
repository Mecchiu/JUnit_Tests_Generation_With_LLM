// FixSpacesTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FixSpaces}.
* It contains ten unit test cases for the {@link FixSpaces#fixSpaces(String)} method.
*/
class FixSpacesTest {
			/**
			* Test case for the {@link FixSpaces#fixSpaces(String)} method.
			* It tests the method with the input "Example".
			*/
			@Test
			void testFixSpaces1() {
				String input = "Example";
				String expected = "Example";
				String actual = FixSpaces.fixSpaces(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link FixSpaces#fixSpaces(String)} method.
			* It tests the method with the input "Mudasir Hanif ".
			*/
			@Test
			void testFixSpaces2() {
				String input = "Mudasir Hanif ";
				String expected = "Mudasir_Hanif_";
				String actual = FixSpaces.fixSpaces(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link FixSpaces#fixSpaces(String)} method.
			* It tests the method with the input "Yellow Yellow  Dirty  Fellow".
			*/
			@Test
			void testFixSpaces3() {
				String input = "Yellow Yellow  Dirty  Fellow";
				String expected = "Yellow_Yellow__Dirty__Fellow";
				String actual = FixSpaces.fixSpaces(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link FixSpaces#fixSpaces(String)} method.
			* It tests the method with the input "Exa   mple".
			*/
			@Test
			void testFixSpaces4() {
				String input = "Exa   mple";
				String expected = "Exa-mple";
				String actual = FixSpaces.fixSpaces(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link FixSpaces#fixSpaces(String)} method.
			* It tests the method with the input "   Exa 1 2 2 mple".
			*/
			@Test
			void testFixSpaces5() {
				String input = "   Exa 1 2 2 mple";
				String expected = "-Exa_1_2_2_mple";
				String actual = FixSpaces.fixSpaces(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link FixSpaces#fixSpaces(String)} method.
			* It tests the method with the input "   Exa 1 2 2 mple".
			*/
			@Test
			void testFixSpaces6() {
				String input = "   Exa 1 2 2 mple";
				String expected = "-Exa_1_2_2_mple";
				String actual = FixSpaces.fixSpaces(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link FixSpaces#fixSpaces(String)} method.
			* It tests the method with the input "   Exa 1 2 2 mple".
			*/
			@Test
			void testFixSpaces7() {
				String input = "   Exa 1 2 2 mple";
				String expected = "-Exa_1_2_2_mple";
				String actual = FixSpaces.fixSpaces(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link FixSpaces#fixSpaces(String)} method.
			* It tests the method with the input "   Exa 1 2 2 mple".
			*/
			@Test
			void testFixSpaces8() {
				String input = "   Exa 1 2 2 mple";
				String expected = "-Exa_1_2_2_mple";
				String actual = FixSpaces.fixSpaces(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link FixSpaces#fixSpaces(String)} method.
			* It tests the method with the input "   Exa 1 2 2 mple".
			*/
			@Test
			void testFixSpaces9() {
				String input = "   Exa 1 2 2 mple";
				String expected = "-Exa_1_2_2_mple";
				String actual = FixSpaces.fixSpaces(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link FixSpaces#fixSpaces(String)} method.
			* It tests the method with the input "   Exa 1 2 2 mple".
			*/
			@Test
			void testFixSpaces10() {
				String input = "   Exa 1 2 2 mple";
				String expected = "-Exa_1_2_2_mple";
				String actual = FixSpaces.fixSpaces(input);
				assertEquals(expected, actual);
			}
}