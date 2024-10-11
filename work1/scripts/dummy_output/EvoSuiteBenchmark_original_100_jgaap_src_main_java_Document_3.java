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
		private static final int MAX_SIZE = 1024;

		private String filename;
		private String line = null;

		private int index = -1;

		private int start=0;
		private int lineCount=0;

		public DocumentTest() {
			filename = "documentTest.java";

			try {
				line = new File(filename).readLine();
				while ((start>=-1) && (end>=0) && (line.length()>start)) {
					start = getSpace(line, start);
					lineCount++;
					line = line.substring(start);
					start = getSpace(line, start);
				}
			}
			catch (IOException e) {}
		}

	@Test
    public void testReadText() throws Exception {
		StringBuilder b = new StringBuilder("Here are some text I've read:");
		Document doc = new Document(filename);
		doc.readText(b.toString());
		assertTrue(b+" should be parsed as a document!",b.equals(doc.toString()));
		assertEquals(b.toString(), getSize(b.toString()), documentLength(b.toString()));
		assertEquals(b.toString(), doc.getSize(), documentLength(b.toString()));
		assertTrue(b+" should be stored in array!",b.toString().equals(doc.toString()));
		assertEquals(b.toString(), doc.getSize(), documentLength(b.toString()));
		assertEquals(b.toString(), b.length(), b.toString().length());
		assertTrue(b+" should be equal!",b.equals(doc.toString()));
	}

	@Test
    public void testProcessedText() throws Exception {
		Document doc = new Document(filename);
		doc.processedText = new Vector<>(MAX_SIZE);
		doc.processedText.add(new Character('a'));
		doc.processedText.add(new Character('r'));
		String rawText = doc.toString();
		doc.setProcessedText(doc.processedText);
		doc.processedText = null;;
}
}