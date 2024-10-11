// DocumentTest.java


import java.io.*;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Document}.
* It contains ten unit test cases for the {@link Document#stringify()} method.
*/
class DocumentTest {
		
	/**
	* Test case for {@link Document#stringify()}.
	* It tests if the method returns the correct string.
	*/
	@Test
	void testStringify() {
		Document doc = new Document();
		String expected = "This is a test string.";
		String actual = doc.stringify();
		assertEquals(expected, actual);
	}
}