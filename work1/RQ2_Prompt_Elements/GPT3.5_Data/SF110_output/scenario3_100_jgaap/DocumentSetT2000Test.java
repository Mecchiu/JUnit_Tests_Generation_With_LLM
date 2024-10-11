public class DocumentSetTest {

    /**
     * Test case to check if documentCount() returns 0 for an empty DocumentSet.
     */
    @Test
    public void testDocumentCountEmptySet() {
        DocumentSet documentSet = new DocumentSet();
        assertEquals(0, documentSet.documentCount());
    }

    /**
     * Test case to check if documentCount() returns the correct count for a DocumentSet with one document.
     */
    @Test
    public void testDocumentCountOneDocument() {
        DocumentSet documentSet = new DocumentSet();
        documentSet.addDocument(new Document("Document 1"));
        assertEquals(1, documentSet.documentCount());
    }

    /**
     * Test case to check if documentCount() returns the correct count for a DocumentSet with multiple documents.
     */
    @Test
    public void testDocumentCountMultipleDocuments() {
        DocumentSet documentSet = new DocumentSet();
        documentSet.addDocument(new Document("Document 1"));
        documentSet.addDocument(new Document("Document 2"));
        documentSet.addDocument(new Document("Document 3"));
        assertEquals(3, documentSet.documentCount());
    }

    /**
     * Test case to check if documentCount() returns the correct count after removing a document from the DocumentSet.
     */
    @Test
    public void testDocumentCountAfterRemovingDocument() {
        DocumentSet documentSet = new DocumentSet();
        Document document1 = new Document("Document 1");
        Document document2 = new Document("Document 2");
        documentSet.addDocument(document1);
        documentSet.addDocument(document2);
        documentSet.removeDocument(document1);
        assertEquals(1, documentSet.documentCount());
    }

    /**
     * Test case to check if documentCount() returns the correct count after adding and removing multiple documents from the DocumentSet.
     */
    @Test
    public void testDocumentCountAfterAddingAndRemovingMultipleDocuments() {
        DocumentSet documentSet = new DocumentSet();
        Document document1 = new Document("Document 1");
        Document document2 = new Document("Document 2");
        Document document3 = new Document("Document 3");
        documentSet.addDocument(document1);
        documentSet.addDocument(document2);
        documentSet.addDocument(document3);
        documentSet.removeDocument(document2);
        documentSet.addDocument(new Document("Document 4"));
        assertEquals(3, documentSet.documentCount());
    }

    /**
     * Test case to check if documentCount() returns the correct count after adding and removing the same document multiple times from the DocumentSet.
     */
    @Test
    public void testDocumentCountAfterAddingAndRemovingSameDocument() {
        DocumentSet documentSet = new DocumentSet();
        Document document1 = new Document("Document 1");
        documentSet.addDocument(document1);
        documentSet.removeDocument(document1);
        documentSet.addDocument(document1);
        documentSet.removeDocument(document1);
        assertEquals(0, documentSet.documentCount());
    }

    /**
     * Test case to check if documentCount() returns the correct count after adding and removing multiple documents with the same name from the DocumentSet.
     */
    @Test
    public void testDocumentCountAfterAddingAndRemovingDocumentsWithSameName() {
        DocumentSet documentSet = new DocumentSet();
        Document document1 = new Document("Document 1");
        Document document2 = new Document("Document 1");
        documentSet.addDocument(document1);
        documentSet.addDocument(document2);
        documentSet.removeDocument(document1);
        assertEquals(1, documentSet.documentCount());
    }

    /**
     * Test case to check if documentCount() returns the correct count after adding and removing documents with different names from the DocumentSet.
     */
    @Test
    public void testDocumentCountAfterAddingAndRemovingDocumentsWithDifferentNames() {
        DocumentSet documentSet = new DocumentSet();
        Document document1 = new Document("Document 1");
        Document document2 = new Document("Document 2");
        documentSet.addDocument(document1);
        documentSet.addDocument(document2);
        documentSet.removeDocument(document1);
        assertEquals(1, documentSet.documentCount());
    }

    /**
     * Test case to check if documentCount() returns the correct count after adding and removing documents with null names from the DocumentSet.
     */
    @Test
    public void testDocumentCountAfterAddingAndRemovingDocumentsWithNullNames() {
        DocumentSet documentSet = new DocumentSet();
        Document document1 = new Document(null);
        Document document2 = new Document(null);
        documentSet.addDocument(document1);
        documentSet.addDocument(document2);
        documentSet.removeDocument(document1);
        assertEquals(1, documentSet.documentCount());
    }
}