// FlipCaseTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FlipCase}.
* It contains one unit test case for the {@link FlipCase#flipCase(String)} method.
*/
class FlipCaseTest {

	/**
	* test the flipCase(String) method
	*/
	@Test
	public void testFlipCase( ) {
		assertEquals("", "", FlipCase.flipCase(""));
		assertEquals("", "", FlipCase.flipCase(" "));
		assertNull(FlipCase.flipCase(""));
	}
	
	/**
	*
	*/
	@Test
	public void testFlipCaseOfAllChars() {
		assertEquals("", "", FlipCase.flipCase(""));
		assertEquals("", "", FlipCase.flipCase(" "));
		assertEquals("", "", FlipCase.flipCase("a"));
		assertEquals("", "", FlipCase.flipCase("ab"));
		assertEquals("", "", FlipCase.flipCase("ab "));
		assertEquals("", "", FlipCase.flipCase("aaaaa"));
	}
	
	/**
	*
	*/
	@Test
	public void testFlipCaseOfAllCharsCaseInsensitive() {
		assertEquals("", "", FlipCase.flipCase(""));
		assertEquals("", "", FlipCase.flipCase(" "));
		assertEquals("", "", FlipCase.flipCase("A"));
		assertEquals("", "", FlipCase.flipCase("Ab"));
		assertEquals("", "", FlipCase.flipCase("Abc"));
		assertEquals("", "", FlipCase.flipCase("AbCa"));
		assertEquals("", "", FlipCase.flipCase("AbcAAA"));
	}
	
	/**
	*
	*/
	@Test
	public void testFlipCaseOfNarrowingChars() {
		assertEquals("", "\u0000", FlipCase.flipCase(""));
		assertEquals("", "\u0000", FlipCase.flipCase(" "));
		assertEquals("", "\u0000", FlipCase.flipCase("a"));
		assertEquals("", "\u0000", FlipCase.flipCase("ab"));
		assertEquals("", "\u0000", FlipCase.flipCase("abcd"));
	}
	
	/**
	*
	*/
	@Test
	public void testFlipCaseOfNarrowingCharsCaseInsensitive() {
		assertEquals("", "\u0000", FlipCase.flipCase(""));
		assertEquals("", "\u0000", FlipCase.flipCase(" "));
		assertEquals("", "\u0000", FlipCase.flipCase("A"));
		assertEquals("", "\u0000", FlipCase.flipCase("Ab"));
		assertEquals("", "\u0000", FlipCase.flipCase("Abc"));
		assertEquals("", "\u0000", FlipCase.flipCase("AbCa"));
	}
	
}
