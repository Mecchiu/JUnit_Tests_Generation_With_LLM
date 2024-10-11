java
import static org.junit.jupiter.api.Assertions.assertEquals;

class DocumentSet_0Test {

    @Test
    void testDocumentCountEmptySet() {
        DocumentSet documentSet = new DocumentSet();
        assertEquals(0, documentSet.documentCount());
    }

    @Test
    void testDocumentCountSingleDocument() {
        Document document = new Document("Sample text");
        DocumentSet documentSet = new DocumentSet(document);
        assertEquals(1, documentSet.documentCount());
    }

    @Test
    void testDocumentCountMultipleDocuments() {
        Document document1 = new Document("Text 1");
        Document document2 = new Document("Text 2");
        DocumentSet documentSet = new DocumentSet();
        documentSet.register(document1);
        documentSet.register(document2);
        assertEquals(2, documentSet.documentCount());
    }

    @Test
    void testDocumentCountAfterRegister() {
        Document document = new Document("Sample text");
        DocumentSet documentSet = new DocumentSet(document);
        documentSet.register(new Document("New text"));
        assertEquals(2, documentSet.documentCount());
    }

    @Test
    void testDocumentCountAfterMultipleRegisters() {
        Document document = new Document("Sample text");
        DocumentSet documentSet = new DocumentSet(document);
        documentSet.register(new Document("New text"));
        documentSet.register(new Document("Another text"));
        assertEquals(3, documentSet.documentCount());
    }

    @Test
    void testDocumentCountAfterRegisterAndRemove() {
        Document document = new Document("Sample text");
        DocumentSet documentSet = new DocumentSet(document);
        Document newDocument = new Document("New text");
        documentSet.register(newDocument);
        documentSet.documents.remove(newDocument);
        assertEquals(1, documentSet.documentCount());
    }

    @Test
    void testDocumentCountAfterClear() {
        Document document = new Document("Sample text");
        DocumentSet documentSet = new DocumentSet(document);
        documentSet.register(new Document("New text"));
        documentSet.register(new Document("Another text"));
        documentSet.documents.clear();
        assertEquals(0, documentSet.documentCount());
    }

    @Test
    void testDocumentCountAfterClearEmptySet() {
        DocumentSet documentSet = new DocumentSet();
        documentSet.documents.clear();
        assertEquals(0, documentSet.documentCount());
    }

    @Test
    void testDocumentCountAfterClearSingleDocument() {
        Document document = new Document("Sample text");
        DocumentSet documentSet = new DocumentSet(document);
        documentSet.documents.clear();
        assertEquals(0, documentSet.documentCount());
    }
}
