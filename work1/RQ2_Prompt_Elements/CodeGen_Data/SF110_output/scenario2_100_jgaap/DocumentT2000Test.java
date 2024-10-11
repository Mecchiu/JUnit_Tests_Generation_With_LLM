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
         * Test method for {@link Document#Document(String)}.
         */
        @Test
        public void testDocumentS() {
            String s = "hello";
            Document doc = Document.Document(s);
            assertEquals(s, stringify());
            assertEquals(new Document(s), doc);
        }

        /**
         * Test method for {@link Document#Document(String)}.
         */
        @Test
        public void testDocument() {
            String s = "hello world";
            Document doc = Document.Document(s);
            assertEquals(s, stringify());
            assertEquals(new Document(s), doc);
        }

        /**
         * Test method for {@link Document#readTextFile(String)}
         */
        @Test
        public void testDocumentReadTextFile() throws IOException {
            File f = new File("testdata/test3");
            Reader reader = new FileReader(f);
            Document doc = Document.readTextFile(reader);
            assertEquals(f, f);
            assertEquals(f.length(), doc.length());
            assertEquals(f, new File(f.getParent()));
            assertEquals(2, doc.toString().length());
        }

        /**
         * Test method for {@link Document#writeTextFile(String)}
         */
        @Test
        public void testDocumentWriteTextFile() throws IOException {
            Writer writer = new FileWriter(new File("testdata/test3"));
            Document doc = new Document(writer);
            String s = "test";
            assertEquals(s, doc.stringify());
            assertEquals(new Document(s), doc);
            doc = new Document();
            assertEquals(s, doc.stringify());
            assertNull(doc.writeTextFile("textx"));
        }

        /**
         * Test method for {@link Document#isValid(String)}.
         */
        @Test
        public void testDocumentIsValid() {
            Document doc = new Document();
            assertTrue(doc.isValid("something"));
            doc = new Document("");
            assertFalse(doc.isValid("something"));
            doc = new Document("");
            assertTrue(doc.isValid("something<anything>"));
        }


        /**
         * Test method for {@link Document#getTextFile(int)}.
         */
        @Test
        public void testDocumentGetTextFile() throws DocumentException {
            Vector textVector = new Vector();
            Document doc = Document.getTextFile(textVector);
            assertNull(doc.writeTextFile("textx"));
        }

	  /** Test doc = null Test */
	  @Test
	  public void testInvalidFile() throws DocumentException {
	    Vector textVector = new Vector();
	    Document doc = Document.createTextFile("invalidfile");
	    String s = "invalidfile";
	    Document.stringify(s, textVector);
	    assertTrue("File can't be null", doc.isValid(s));
	    assertNull("File can't be null", doc.writeTextFile(s));
	  }

	  /** Test doc = null Test */
	  @Test
	  public void testLineEnding() throws DocumentException {
	    Vector textVector = new Vector();
	    Document doc = Document.createTextFile("lineendings.txt");
	    String s = "invalidfile";
	    Document.stringify(s, textVector);
	    assertTrue("File can't be null", doc.isValid(s));
	    assertNull("File can't be null", doc.writeTextFile(s));
	  }

    }

}
