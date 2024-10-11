// DocumentSetTest.java


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
class DocumentSetTest {
		final static int NUM_DOCUMENTS = 100000;

    @Test
	public void test() throws UnsupportedEncodingException {	
		// Construct a DocumentSet with 1000 documents
		DocumentSet d = new DocumentSet(1000);
		assertTrue(d.documentCount() == 1000);

		// Construct a DocumentSet with 250 documents
		d = new DocumentSet(250);
		assertTrue(d.documentCount() == 250);

		// Construct a DocumentSet with 50 documents
		d = new DocumentSet(50);
		assertTrue(d.documentCount() == 50);

		// Construct a DocumentSet with 150 documents
		d = new DocumentSet(150);
		assertTrue(d.documentCount() == 150);

		// Construct a DocumentSet with 200 documents
		d = new DocumentSet(200);
		assertTrue(d.documentCount() == 200);

		// Construct a DocumentSet with 100 documents
		d = new DocumentSet(100);
		assertTrue(d.documentCount() == 100);

		// Construct a DocumentSet with 1 document
		d = new DocumentSet();
		assertTrue(d.documentCount() == 1);
	}

	@Test
	public void testC() throws UnsupportedEncodingException {
		String documentString = "/usr/lib/foo/1.jsp";

		// Set up a set of documents in the set of 1000 documents
		DocumentSet d = (DocumentSet)getDocument(documentString);
		
		// Ensure that the set of documents has been set properly
		assertTrue(d.documentCount() == 1000);

		// Remove documents 100 - 1000 from the set
		for (int i=100; i<100+d.documentCount(); i++) {
			d.deleteDocument(i);
		}
		
		// Ensure that the set of documents has the same content
		d.characterFrequency();
	}

	@Test
	public void testW() throws UnsupportedEncodingException {	
		// Test the frequency of characters within the set
		char[] chars = getTestChars();

		// Set up a set of documents in the set of 1000 documents
		DocumentSet d = new DocumentSet(chars);

		// Ensure that the set of documents has been set properly
		assertTrue(d.characterFrequency()["foo"] == 1);
		char[] charArray = d.characterFrequency().keySet().toArray();
		assertTrue(charArray.length == NUM_NAMES_WITH_UNASSIGNED);

		// Remove documents 100 - 1000
		for (int i=100; i<100+chars.length; i++) {
			d.deleteDocument(i);
		}
		d.characterFrequency();
		assertTrue(d.characterFrequency().keySet().toArray().length == charArray.length);
	}

	CharArray cArray = new CharArray(NUM_NAMES_WITH_UNASSIGNED);
	IntArray intArray
		= new IntArray(Number::intValue, NUM_NAMES_WITH_UNASSIGNED);
	StringArray strArray
		= new StringArray(NUM_NAMES_WITH_UNASSIGNED, NUM_NAMES_UNASSIGNED);
	int[][] intIntArray = new int[2][][];
	String[][] strStrArray = new String[2][][];

	public int[][] test(int[][] arr1) {
	}

	public int[][] test(int[][] arr2) {
	}

	byte[][] test(byte[][] arr) {
	}

	void main(String[] args){	
		// Test the frequencies of Characters within the set
		CharArray charArray = (CharArray)cArray;
		Vector<String> names = cArray.nameVector();
		System.out.println("All Characters:");

		for (int i=0; i<names.size(); i++) {
			System.out.printf("%s,%d\n", names.get(i), Character.valueOf(names.get(i).charAt(0)));
		}

		System.out.println("All Codes:");
		System.out.println(getSystemCodeFrequency());

		System.out.println("All Names:");
		for (int i=0; i<names.size(); i++) {
			System.out.println("\t "+i +":" + "\t\t: " + names.get(i) + "\n");
		}
	}

	@Test
	public void testAll() {
		try {
			main(null);
		} catch (Exception exc) {
			System.out.println("Main Exception" + exc);
		}
	}
	
	@Test
	public void test1() {
		try {
			main(getSystemChars(true));
		} catch (Exception exc) {
			System.out.println("Main Exception" + exc);
		}
	}

	@Test
	public void test2() {
		try {
			main(getSystemChars(false));
		} catch (Exception exc) {
			System.out.println("Main Exception" + exc);
		}
	}

	@Test
	public void testGetSystemChars() {
}
}