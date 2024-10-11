// DocumentSet_0Test.java


/**
 *  DocumentSet.java
 *   Caleb Astey - 2007
 */
import java.util.Vector;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DocumentSet}.
* It contains one unit test case for the {@link DocumentSet#documentCount()} method.
*/
class DocumentSet_0Test {
		private DocumentSet docset = new DocumentSet();
		private Document doc;
		private String string, string2;

	@Test
		public void testString() {
			doc = new Document();
			doc.setNumber("Number:");
			doc.setProcessed((boolean)true);
			doc.setContent("Content:");

			docset.addSource(doc);
			docset.setDocumentSize(10);
			docset.setDocumentStart(1);
			vector = docset.getProcessedText();
			assertEquals(10, vector.size());
			assertTrue(vector.elementAt(7).equals("Number"));
			assertTrue(vector.elementAt(9).equals("Content"));

			docset.setDocumentSize(-1);
			vector = docset.getProcessedText();
			assertEquals(10, vector.size());
			assertTrue(vector.elementAt(6).equals("Number"));
			assertTrue(vector.elementAt(8).equals("Content"));

			String out = docset.toString();
			assertEquals(out, string2, "Incorrect result for DocumentSet.documentCount().");
		}

		@Test
		public void testGetSize() {
			docset.addSource(doc);
			documentCount();
			assertEquals("2", docset.getDocumentSize());
		}
}