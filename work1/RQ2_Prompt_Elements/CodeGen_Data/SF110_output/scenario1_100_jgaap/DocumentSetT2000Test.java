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

    /**
     * Unit test
     * Check whether the documentSet properly returns a correct total number of document.
     * @see DocumentSet#documentCount
     */
    @Test
    void checkDocumentCount() {
        DocumentSet documentSet = new DocumentSet ();
        assertEquals (documents.size(), documentSet.documentCount());
    }

	/**
	 * Test method for {@link DocumentSet#getDocument(int)}.
	 */
	@Test
    void getDocument() {
        Document document = new Document("Title");
        //document.author = new Author("author", "name");
        DocumentSet documentSet = new DocumentSet (4, 2);
        List<Document> list = new ArrayList<Document>(4);
        documentSet.add (document);

        assertNotNull(documentSet.getDocument (1));
        assertTrue (documentSet.getDocument (1).getBody ());

        list.add (document);

        documentSet.add (document);

        for (int i = 0; i < documentSet.documentCount(); i=i+1) {
            assertEquals (documentSet.getDocument (i), list.get(i));
        }

        assertEquals(null, null, 
                        documentSet.remove (1));
        assertEquals (4, documentSet.documentCount());
        
    }

    /**
     * Test method for {@link #getAll(Hashtable)} method.
     */
    @Test
    void getAllDocument() {
        DocumentSet documentSet = new DocumentSet (4, 2);

        List<Document> allList = new ArrayList<Document> (4);
        documentSet.getAll (allList);

        assertTrue (allList.size() == 4);
        assertTrue (Arrays.equals (documentSet.getAll ().toArray(), allList.toArray (allList.toArray (new Document [] {}))));

        documentSet.add (new Document ("Test doc"));
        Hashtable keyList = new Hashtable (4);
        keyList.put ("test", "1");
        Vector vector = documentSet.getAll (keyList);
        assertTrue (vector.size() == 4);
        assertTrue (Arrays.equals (documentSet.getAll ().toArray (), vector
                       .toArray (vector.toArray (new Document [] {}))) ||
                        Arrays.equals (vector.toArray (), documentSet.getAll ().toArray (keyList.keySet ().toArray (new String [] {}))));
    }

    /**
     * Test method for {@link #documentSet()} method.
     */
    @Test
    void getSetDocument() {
        DocumentSet documentSet = new DocumentSet (2, 2);
        documentSet.documentSet();

    }
}

// DocumentSetTest.java
