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
		* Test method of {@link Document#DocumentTest}.
		*/
    @Test
    public void testDocumentStringify() {
        String d1 = new String("This is a document");
        String d2 = new String(d1.toCharArray());
        String d3 = d1;             // same results

        // Test different result strings
        String s1 = new String("Here is a document");
        String s2 = s1.toCharArray();
        String s3 = s1;             // and, I presume this is wrong
        
        // Test different result strings with one set
        String s4 = new String("Here is a document with the '\\'' prefix.");
        String s5 = s4.setPrefix("'" );
        String s6 = s4;             // this is fine because the set prefix is removed
        
        // Try it with the same result strings; same type and one set
        assertEquals(s1,s2);
        String s7 = s4.setPrefix("'");
        String s8 = s4;
        
        // Test different result strings with the result type and one set
        assertEquals(s3,s4);
        assertEquals(s5,s4);
        assertEquals(s6,s4);
    }
}


// MainTest.java

import java.io.*;
import java.util.Scanner;

/**
* Test class of {@link Document}.
* It contains one unit test case for the {@link Document#stringify()} method.
*/
class MainTest {
	// Data for testing
	final TextFile mTFF = new TextFile();

	// Create test {@link Document}
        Document d;

        /**
         * Test method of {@link Document#MainTest}.
         *
         * @throws IOException For problem with opening and reading in the test file.
         * @throws ParserException For problems with parsing of the test file.
         */
	@Test
	void testMain() throws IOException, ParserException {
		// Test file without the expected number of documents stored.
		assertEquals(1, getCount());
		String s = mTFF.lookup(3);
		assertEquals("Here is a document", s);

		// Delete test {@link Document} from the database
		System.out.print("Deleting test {@link Document}");
		mTFF.delete(3);
	}

	// Get the number of expected {@link Document}s written.
        public int getCount() {
            int count = 0;

            TextElement elt;
            while ((elt = mTFF.lookup(++count, 4, 7))!= null) { 
                // Skip over all text elements between the ':' and the end of document sequence.
                // For that to work, need to escape the sequence ':'. (i.e. '\\') in the 'text' string.
                String s = elt.string;
                s = s.trim();
                if (s.length() > 1) {
                    String ch = s.charAt(0);
                    if (ch.equals("\\") && s.length() > 2) {
                        s = s.substring(1, s.length()-1);
                    }
                }

                Element elt2 = new Element(s);             // for testing

                // Process the element and test result
                if (elt2 == null) {            // not text element
                    continue;                   // skip this test (no idea why this would get hit)
                }

                if (elt2.getElementType()!= ElementType.TEXT || 
                   elt2.getText() == null) {    // not another text element
                    continue;                   // skip this test (should be a text element)
                }

                // Skip the element
                s = s.trim();

                // Skip over whitespace
                while (s.length() > 0 && s.charAt(s.length()-1) <='') {
                    s = s.substring(s.length()-1);
                }

                // Make sure that the delimiter is not contained in the text element.
                if (s.contains(":")) {
                    Element elt = new Element(s, null, 1);       // test delimiter

                    String str = s.length() < 5? elt.getText() : s;
                    int i = 3;                           // skip delimiter text
                    while (i < s.length()) {               // skip delimiter text up to end of file
                        str = str.substring(i,(i+5)-s.length());      // test delimiter and delimiter
                        i = i + 5;
                        if (str.length() == 0)               // if no more text in file and delimiter is not contained, add it back
                            str = "Here is a document with the :'s leading whitespace and \"\'';";
                    }

                    if (!str.equals(":'")) {           // it should not end at the start of string
                        System.out.println("Error: File contains whitespace at: " + i);
                        System.out.println("     s = " + s);
                        System.out.println("     str = " + str);
                        System.out.println("   str = " + str.replace('"', '\\'));
                        System.out.println("----------------------------------------------------------------");
                        assertTrue(false, str);                // it should not end at the end of string
                    }

                    // Test that it was not empty
                    str = s.length() < 5? elt.getText() : s;
                    if (str.length() == 0) {
                        System.out.println("Error: File contains no text at: " + i);
                        System.out.println("     s = " + s);
                        System.out.println("     str = " + str);
                        System.out.println("   str = " + str.replace('"', '\\'));
                        System.out.println("----------------------------------------------------------------");
                        assertTrue(false, str);                // it should not end at the end of string
                    }

                    // Test for the new array test
                    if (str.charAt(1)!= 't') {           // testing for "T"
                        System.out.println("Error: File does not contain 't'");
                        System.out.println("     s = " + s);
                        System.out.println("     str = " + str);
                        System.out.println("   str = " + str.replace('"', '\\'));
                        System.out.println("----------------------------------------------------------------");
                        assertTrue(false, str);                // it should not end at the end of string
                    }
                    assertTrue(false, 'y' == elt.getElementType());
                    // Add the test to the expected count
                    count++;
                }
            }

	    return count;
    }

	// Test file input by using the standard System.in.readLine() method
        public static void main (String[] args) {
	    File f = new File("D:\\Documents\\");
            Document doc = new Document(new Scanner(System.in));
            doc.test();
        }

}
