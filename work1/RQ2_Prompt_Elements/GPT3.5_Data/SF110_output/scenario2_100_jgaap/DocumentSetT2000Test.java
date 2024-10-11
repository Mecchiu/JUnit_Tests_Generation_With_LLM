public class DocumentSetTest {

    /**
     * Test case to check if documentCount() returns 0 for an empty DocumentSet.
     */
    @Test
    public void testDocumentCountEmpty() {
        DocumentSet docSet = new DocumentSet();
        assertEquals(0, docSet.documentCount());
    }

    /**
     * Test case to check if documentCount() returns the correct count for a DocumentSet with one document.
     */
    @Test
    public void testDocumentCountOne() {
        DocumentSet docSet = new DocumentSet();
        docSet.addDocument(new Document("Document 1"));
        assertEquals(1, docSet.documentCount());
    }

    /**
     * Test case to check if documentCount() returns the correct count for a DocumentSet with multiple documents.
     */
    @Test
    public void testDocumentCountMultiple() {
        DocumentSet docSet = new DocumentSet();
        docSet.addDocument(new Document("Document 1"));
        docSet.addDocument(new Document("Document 2"));
        docSet.addDocument(new Document("Document 3"));
        assertEquals(3, docSet.documentCount());
    }

    /**
     * Test case to check if documentCount() returns the correct count after removing a document from a DocumentSet.
     */
    @Test
    public void testDocumentCountAfterRemove() {
        DocumentSet docSet = new DocumentSet();
        Document doc1 = new Document("Document 1");
        Document doc2 = new Document("Document 2");
        docSet.addDocument(doc1);
        docSet.addDocument(doc2);
        docSet.removeDocument(doc1);
        assertEquals(1, docSet.documentCount());
    }

    /**
     * Test case to check if documentCount() returns the correct count after adding and removing documents from a DocumentSet.
     */
    @Test
    public void testDocumentCountAddRemove() {
        DocumentSet docSet = new DocumentSet();
        Document doc1 = new Document("Document 1");
        Document doc2 = new Document("Document 2");
        Document doc3 = new Document("Document 3");
        docSet.addDocument(doc1);
        docSet.addDocument(doc2);
        docSet.removeDocument(doc1);
        docSet.addDocument(doc3);
        assertEquals(2, docSet.documentCount());
    }

    /**
     * Test case to check if documentCount() returns the correct count after adding and removing the same document from a DocumentSet.
     */
    @Test
    public void testDocumentCountAddRemoveSame() {
        DocumentSet docSet = new DocumentSet();
        Document doc1 = new Document("Document 1");
        docSet.addDocument(doc1);
        docSet.removeDocument(doc1);
        docSet.addDocument(doc1);
        docSet.removeDocument(doc1);
        assertEquals(0, docSet.documentCount());
    }

    /**
     * Test case to check if documentCount() returns the correct count after adding and removing multiple documents from a DocumentSet.
     */
    @Test
    public void testDocumentCountAddRemoveMultiple() {
        DocumentSet docSet = new DocumentSet();
        Document doc1 = new Document("Document 1");
        Document doc2 = new Document("Document 2");
        Document doc3 = new Document("Document 3");
        Document doc4 = new Document("Document 4");
        docSet.addDocument(doc1);
        docSet.addDocument(doc2);
        docSet.addDocument(doc3);
        docSet.addDocument(doc4);
        docSet.removeDocument(doc1);
        docSet.removeDocument(doc3);
        assertEquals(2, docSet.documentCount());
    }

    /**
     * Test case to check if documentCount() returns the correct count after adding and removing multiple documents, including duplicates, from a DocumentSet.
     */
    @Test
    public void testDocumentCountAddRemoveDuplicates() {
        DocumentSet docSet = new DocumentSet();
        Document doc1 = new Document("Document 1");
        Document doc2 = new Document("Document 2");
        Document doc3 = new Document("Document 3");
        docSet.addDocument(doc1);
        docSet.addDocument(doc2);
        docSet.addDocument(doc3);
        docSet.addDocument(doc1);
        docSet.addDocument(doc2);
        docSet.removeDocument(doc1);
        docSet.removeDocument(doc2);
        assertEquals(1, docSet.documentCount());
    }

    /**
     * Test case to check if documentCount() returns the correct count after adding and removing multiple documents, including duplicates, from a DocumentSet.
     */
    @Test
    public void testDocumentCountAddRemoveDuplicates2() {
        DocumentSet docSet = new DocumentSet();
        Document doc1 = new Document("Document 1");
        Document doc2 = new Document("Document 2");
        Document doc3 = new Document("Document 3");
        docSet.addDocument(doc1);
        docSet.addDocument(doc2);
        docSet.addDocument(doc3);
        docSet.addDocument(doc1);
        docSet.addDocument(doc2);
        docSet.removeDocument(doc1);
        docSet.removeDocument(doc2);
        docSet.addDocument(doc3);
        assertEquals(2, docSet.documentCount());
    }
}