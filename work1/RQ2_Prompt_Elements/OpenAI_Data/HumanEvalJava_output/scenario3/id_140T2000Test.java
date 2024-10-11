// FixSpacesTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FixSpaces}.
* It contains ten unit test cases for the {@link FixSpaces#fixSpaces(String)} method.
*/
class FixSpacesTest {
	@Test
			void testFixSpaces() {
				assertEquals("Example", FixSpaces.fixSpaces("Example"));
				assertEquals("Example_1", FixSpaces.fixSpaces("Example 1"));
				assertEquals("_Example_2", FixSpaces.fixSpaces(" Example 2"));
				assertEquals("_Example-3", FixSpaces.fixSpaces(" Example   3"));
				assertEquals("Mudasir_Hanif_", FixSpaces.fixSpaces("Mudasir Hanif "));
				assertEquals("Yellow_Yellow__Dirty__Fellow", FixSpaces.fixSpaces("Yellow Yellow  Dirty  Fellow"));
				assertEquals("Exa-mple", FixSpaces.fixSpaces("Exa   mple"));
				assertEquals("-Exa_1_2_2_mple", FixSpaces.fixSpaces("   Exa 1 2 2 mple"));
				assertEquals("Hello_World", FixSpaces.fixSpaces("Hello World"));
				assertEquals("Hello_World", FixSpaces.fixSpaces("Hello World"));
			}
}