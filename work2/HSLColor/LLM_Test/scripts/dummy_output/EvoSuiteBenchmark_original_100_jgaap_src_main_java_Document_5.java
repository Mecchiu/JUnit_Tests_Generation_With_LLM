// DocumentTest.java


import java.io.*;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Document}.
* It contains one unit test case for the {@link Document#stringify()} method.
*/
class DocumentTest {
		/**
		 * Test the {@link  Document#getProcessedText().toString()} method.  Should have the following string representation*
		 */
		public void testProcessedText() throws Exception {
            Vector<Character> rawText = new Vector<>(8);
            char[] text = "We are all done.  Thank you, you will see ";
            rawText.add(text[0]);
            rawText.add(text[1]);
            rawText.add(text[2]);
            rawText.add(text[3]);
            rawText.add(text[4]);
            rawText.add(text[5]);
            rawText.add(text[6]);
            rawText.add(text[7]);
            Document doc = new Document("test.txt");
            doc.getProcessedText().add(rawText.get(7));
			assertEquals("We are all done. " + rawText.get(0) + ", " + rawText.get(1) + ", " + rawText.get(2) + ", " + rawText.get(3) + "\n\n" / test.txt, doc.stringify());
		}


		/**
			** Test the {@link Document#readText()} method.  Should have the following array of characters*
			*/
		public void testReadText() throws Exception {
            InputStream is = new ByteArrayInputStream("This is how we say " + "you.".getBytes("UTF-8"));
            Document doc = new Document(is);
            assertEquals("That is how we say " + "you.",doc.toString());
		}

	}