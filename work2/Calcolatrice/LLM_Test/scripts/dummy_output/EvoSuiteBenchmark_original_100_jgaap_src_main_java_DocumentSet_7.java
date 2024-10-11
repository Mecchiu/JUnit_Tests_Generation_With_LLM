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
		
	private DocumentSet set;
	
	public DocumentSetTest() {

	}
	
	public DocumentSetTest(DocumentSet set) {

		this.set = set;
	}	
	
	@Test
	public void testCount() {
		set.register(new Document("a"));
		set.register(new Document("b"));
		set.register(new Document("c"));
		set.register(new Document("d"));
		set.register(new Document("e"));
		assertEquals(7,set.documentCount());
		assertEquals(4,set.getDocument(0).getCharsRead());
	}
	
	@Test
	public void testRegisterEmpty() {
		set.register(new Document("a"));
		set.register(new Document("b"));
		assertEquals(0,set.documentCount());
		set.registerEmpty();
		assertEquals(1,set.documentCount());
	}
	
	@Test
	public void testAll() {
		set.register(new Document("a"));
		set.register(new Document("b"));
		set.register(new Document("a"));
		set.registerEmpty();
		set.register(new Document("c"));
		set.register(new Document("d"));
		set.register(new Document("e"));
		assertEquals(4,set.documentCount());
		assertEquals(2,set.getDocument(0).getCharsRead());
		assertEquals(1,set.getDocument(1).getCharsRead());
		assertEquals(1,set.getDocument(2).getCharsRead());
		assertEquals(1,set.getDocument(3).getCharsRead());
	}
		
	@Test
	public void testRegEx() {
		String s = "b:1:c:1:d:1:e:2:f:";
		set.register(s);
		set.register(Document.create("1"));
		set.register(Document.create("11"));
		set.register(Document.create("10"));
		set.register(Document.create("99"));
		set.register(Document.create("98"));
		assertEquals(2,set.documentCount());
		
		Vector<Document> results = new Vector<Document>();
		results.add(set.getDocument(0));
		results.add(set.getDocument(1));
		results.add(set.getDocument(2));
		results.add(set.getDocument(3));
		results.add(set.getDocument(4));
		set.registerRegEx(1, "1", s+"123");
		assertEquals(1,set.documentCount());
		assertEquals(1,results.size());
		set.registerReg(s+"1", 1 );
		set.registerReg(s+"2", 2 );
		set.registerReg(s+"3", 3 );
		set.registerReg(s+"1",  1 ); // matches 1
		set.registerReg(s+"100", 100 ); // matches 100
		assertEquals(11,set.documentCount());
		assertTrue(set.contains(set.getDocument(0)));
		assertTrue(set.contains(set.getDocument(1)));
		assertTrue(set.contains(set.getDocument(2)));
		assertEquals(2,set.getDocument(3).getCharsRead());
		assertEquals(3,set.getDocument(4).getCharsRead());
		assertEquals(1,results.size());
		set.registerRegEx(4, "1", s+"345");
		assertEquals(2,set.documentCount());
		assertTrue(set.contains(set.getDocument(0)));
		assertTrue(set.contains(set.getDocument(1)));
		assertTrue(results.contains(set.getDocument(2)));
	}
}