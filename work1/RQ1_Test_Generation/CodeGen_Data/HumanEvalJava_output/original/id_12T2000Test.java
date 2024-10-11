// LongestTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Longest}.
* It contains one unit test case for the {@link Longest#longest(List)} method.
*/
class LongestTest {
/**
		 * Constructor with no input string. It would be better to create the object with an empty list
		 * or an empty list at first, because this method has to be called for each case and will need
		 * to create the appropriate object type, and in that case this test will not give the same results
		 * as calling the constructor with an empty list.
		 *
		 * > testWithEmptyList();
		 * > testWithEmptyList(null);
		 */
	public LongestTest(String message) {
		assertTrue(message!= null, "Empty message used for this test.");
	}

		/**
		 * Constructor with a first string. This is an important case where it would always create an object of
		 * the correct type.
		 *
		 * > testWithFirstString();
		 */
	public LongestTest() {
		super();
	}

    /**
     * Checks the result of calling the method on the object with the specific input string.
     * It tests the behaviour of the method in the unit tests.
     * @throws AssertionException
     */
    @Test
	public void testWithFirstString() {
		assertTrue(this.longest(List.class.getName())
			.equals(this.longest(String.class))
                   , "Should construct with the correct type of argument - "
                            + "the first one is the string which is the test case's first argument");
	}

		/**
		 * Checks the result of calling the method on the object with the last string.
		 * It tests the behaviour of the method in the unit tests.
		 * @throws AssertionException
     * @throws MalformedInputException
     */
    @Test
	public void testWithLastString() {
		assertEquals(this.longest(List.class.getName()), "Should construct with the correct type of argument - "
                            + "the last one is the string which is the test case's last argument", 
                    this.longest(String.class), "Should construct with the correct type of argument - "
                            + "the last one is the string which is the test case's last argument");
	}

		/**
		 * Checks the result of calling the method on the object with a null string.
		 * It tests the behaviour of the method in the unit tests.
		 * @throws AssertionException
		 */
	@Test
		public void testWithNullString() {
			assertTrue(this.longest(null)
                       .equals(null))
                   , "Should construct with the correct type of argument - "
                            + "the null argument is the test case's null argument");
	}

		/**
		 * Checks the result of calling the method on the object with a empty list.
		 * It tests the behaviour of the method in the unit tests.
		 * @throws AssertionException
		 */
    @Test
	public void testWithEmptyList() {
		TestCase tc = new TestCase();
		String arg = "";
		tc.testString("arg", arg);
		assertTrue(tc.longest(String.class)
                       .equals(arg));

		List<Object> list = new Longest().longest(tc.list);
		assertEquals(tc.longest(String.class)
		, "arg",
		    tc.longest(String.class).toString());

        list = tc.list;
        longest = tc.longest(String.class);
        assertEquals(tc.longest(String.class), "arg", longest);
    }
		/**
		 * Tests if the first string is also the longest function call.
		 */
	@Test(expected = AssertionError.class)
	public void testWithFirstStringNotLongest() {
		assertNotEquals(this.longest(String.class),
			"Should construct with the correct type of argument - "
			+ "the first one is the string which is the test case's first argument",
			this.longest(List.class.getName()));
	    
		TestCase tc = new TestCase();
		longest = tc.longest(List.class.getName());
	}
}