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
		
	public DocumentSetTest() {
	}

    @Test
    public void testDocumentCount(){
        Hashtable<Integer, Collection<Document>> h = new Hashtable<Integer, Collection<Document>>();
        Document d = new Document("Test", new String[] { "ab", "ad", "cde", "ef", 
       		                  "gfg", "hhi" 
                });
        h.put(d.number, new Vector<Document>());
        assertEquals(h.documentCount(), 1);
        d = new Document("Test", new String[] { "ghij", "klmn", "op" });
        assertEquals(h.documentCount(), 2);
        d = new Document("");
        assertEquals(h.documentCount(), 0);
        d = new Document("Test", new String[] { "1", "2", "3" });
        assertEquals(h.documentCount(), 2);
        d = new Document("");
        assertEquals(h.documentCount(), 0);        
    }
	
    @Test
    public void testRemove(){
        Hashtable<String, Collection<Document>> h = new Hashtable<String, Collection<Document>>();
        h.put("TESTdoc", new Vector<Document>());
        h.put("TESTER", new Hashtable<String, Vector<Document>>());
        h.put("TESTdoc1", new Hashtable<String, Vector<Document>>());
        
        assertEquals(h.remove("TESTdoc").get(0).number, 1);
        assertTrue(String.class.isAssignableFrom(h.get("TESTER").get(0).classType));
        assertEquals(h.remove("TESTER").get(0).stringValue, "test1");
        assertEquals(h.remove("TESTER").get(0).number, 0);

        assertSame(h.remove("TESTdoc1"), h.get("TESTdoc"));
        assertTrue(String.class.isAssignableFrom(h.get("TESTdoc1").classType));
        assertFalse(h.remove("TESTdoc1"));
        assertTrue(h.size() == 3);
        Collection<Document> c = h.get("TESTdoc1");
        assertEquals(c.get(0).number, 0);
        assertNull(c.get(1));
        assertArrayEquals(new String[]{}, c.toArray());
        
        
        assertTrue(h.containsKey("TESTdoc"));
        assertFalse(h.containsKey("TESTER"));
        assertTrue(h.containsValue("test1"));
        assertFalse(h.containsValue("test1"));
        c.add(new Document("TESTER", new ArrayList<String>()));
        assertTrue(h.containsValue("TESTdoc1"));
        c.remove(new Document("TESTER", new ArrayList<String>()));
        assertNull(h.remove("TESTdoc1"));
        assertTrue(h.containsValue("test1"));
        c.add(new Document("TESTdoc", new ArrayList<String>()));
    }
	
	@Test
	public void testPut(){
		Hashtable<String, Collection<Document>> h = new Hashtable<String, Collection<Document>>();
		Document d = new Document("Test");
		Collection<Document> c = new HashSet<Document>();
		
		h.put("test1", c);
		h.put("test2", c);
		
		assertTrue(h.containsKey("test1"));
		assertTrue(h.containsKey("test2"));
		
		assertEquals(h.put("test1", c).get(0).number, 0);
        assertTrue(String.class.isAssignableFrom(h.get("test1").classType));
        assertFalse(h.containsKey("test2"));
        c.add(d);
		assertEquals(h.put("test2", c).get(0).number, 1);
        assertTrue(String.class.isAssignableFrom(h.get("test2").classType));
        assertFalse(h.containsKey("test1"));
        c.add(d);
        assertEquals(h.put("test1", c).get(0).number, 1);
        assertTrue(String.class.isAssignableFrom(h.get("test1").classType));
        assertFalse(h.containsKey("test2"));
    }
	
	@Test
    public void testPut2(){
        Hashtable<String, Collection<Document>> h = new Hashtable<String, Collection<Document>>();
        h.put("test1", new Hashtable<String,Vector<Document>>());
        h.put("test2", new Hashtable<String,Vector<Document>>());
        
        Document d = new Document("Test");
        Collection<Document> c = new HashSet<Document>();
        
        h.put("test1", c);
        h.put("test2", c);
        
        StringTokenizer st = new StringTokenizer("test1 test2");
        assertTrue(h.put("test1", c));
        c.add(d);
        h.put("test1", c);
        assertTrue(h.put("test1", c).get(0).number == 1);
        c.add(d);
        assertTrue(h.put("test2", c));
        c.add(d);
        assertTrue("test1 test2 test2 test2".equals(h.put("test1", c).toString()));
    }
	
	@Test
	public void testRemoveAll(){
}
}