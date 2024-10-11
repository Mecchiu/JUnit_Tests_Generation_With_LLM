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
		* Test case for {@link Document#stringify()} method.
		* It checks if the method returns the correct string.
		*/
		@Test
		void testStringify() {
				Document doc = new Document();
				doc.procText = new Vector<Integer>();
				doc.procText.add(97);
				doc.procText.add(98);
				doc.procText.add(99);
				assertEquals("abc", doc.stringify());
		}
}