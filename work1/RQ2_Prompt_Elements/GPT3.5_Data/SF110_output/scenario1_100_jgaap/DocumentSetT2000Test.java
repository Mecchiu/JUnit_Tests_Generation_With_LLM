// Here's an example implementation of the DocumentSetTest class with ten unit test cases for the documentCount() method:

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DocumentSetTest {

    @Test
    void testEmptyDocumentSet() {
        DocumentSet set = new DocumentSet();
        assertEquals(0, set.documentCount());
    }

    @Test
    void testSingleDocumentSet() {
        DocumentSet set = new DocumentSet();
        set.addDocument(new Document("Hello world!"));
        assertEquals(1, set.documentCount());
    }

    @Test
    void testMultipleDocumentSet() {
        DocumentSet set = new DocumentSet();
        set.addDocument(new Document("Hello world!"));
        set.addDocument(new Document("Goodbye world!"));
        assertEquals(2, set.documentCount());
    }

    @Test
    void testDuplicateDocuments() {
        DocumentSet set = new DocumentSet();
        Document doc = new Document("Hello world!");
        set.addDocument(doc);
        set.addDocument(doc);
        assertEquals(2, set.documentCount());
    }

    @Test
    void testNullDocument() {
        DocumentSet set = new DocumentSet();
        set.addDocument(null);
        assertEquals(0, set.documentCount());
    }

    @Test
    void testRemoveDocument() {
        DocumentSet set = new DocumentSet();
        Document doc = new Document("Hello world!");
        set.addDocument(doc);
        set.removeDocument(doc);
        assertEquals(0, set.documentCount());
    }

    @Test
    void testRemoveNonexistentDocument() {
        DocumentSet set = new DocumentSet();
        Document doc = new Document("Hello world!");
        set.removeDocument(doc);
        assertEquals(0, set.documentCount());
    }

    @Test
    void testAddNullDocument() {
        DocumentSet set = new DocumentSet();
        set.addDocument(null);
        assertEquals(0, set.documentCount());
    }

    @Test
    void testAddMultipleNullDocuments() {
        DocumentSet set = new DocumentSet();
        set.addDocument(null);
        set.addDocument(null);
        assertEquals(0, set.documentCount());
    }

    @Test
    void testAddAndRemoveDocuments() {
        DocumentSet set = new DocumentSet();
        Document doc1 = new Document("Hello world!");
        Document doc2 = new Document("Goodbye world!");
        set.addDocument(doc1);
        set.addDocument(doc2);
        set.removeDocument(doc1);
        assertEquals(1, set.documentCount());
    }
}