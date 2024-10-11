// Test case 1: Test if documentCount() returns 0 for an empty DocumentSet
@Test
public void testDocumentCountEmpty() {
    DocumentSet ds = new DocumentSet();
    assertEquals(0, ds.documentCount());
}

// Test case 2: Test if documentCount() returns the correct count for a DocumentSet with one document
@Test
public void testDocumentCountOne() {
    Document d = new Document("Test Document");
    DocumentSet ds = new DocumentSet(d);
    assertEquals(1, ds.documentCount());
}

// Test case 3: Test if documentCount() returns the correct count for a DocumentSet with multiple documents
@Test
public void testDocumentCountMultiple() {
    Document d1 = new Document("Test Document 1");
    Document d2 = new Document("Test Document 2");
    DocumentSet ds = new DocumentSet();
    ds.register(d1);
    ds.register(d2);
    assertEquals(2, ds.documentCount());
}

// Test case 4: Test if documentCount() returns the correct count after adding and removing a document
@Test
public void testDocumentCountAddRemove() {
    Document d1 = new Document("Test Document 1");
    Document d2 = new Document("Test Document 2");
    DocumentSet ds = new DocumentSet();
    ds.register(d1);
    ds.register(d2);
    ds.documents.remove(0);
    assertEquals(1, ds.documentCount());
}

// Test case 5: Test if documentCount() returns the correct count after adding and clearing all documents
@Test
public void testDocumentCountAddClear() {
    Document d1 = new Document("Test Document 1");
    Document d2 = new Document("Test Document 2");
    DocumentSet ds = new DocumentSet();
    ds.register(d1);
    ds.register(d2);
    ds.documents.clear();
    assertEquals(0, ds.documentCount());
}

// Test case 6: Test if documentCount() returns the correct count after adding and replacing a document
@Test
public void testDocumentCountAddReplace() {
    Document d1 = new Document("Test Document 1");
    Document d2 = new Document("Test Document 2");
    Document d3 = new Document("Test Document 3");
    DocumentSet ds = new DocumentSet();
    ds.register(d1);
    ds.register(d2);
    ds.documents.set(0, d3);
    assertEquals(2, ds.documentCount());
}

// Test case 7: Test if documentCount() returns the correct count after adding and inserting a document
@Test
public void testDocumentCountAddInsert() {
    Document d1 = new Document("Test Document 1");
    Document d2 = new Document("Test Document 2");
    Document d3 = new Document("Test Document 3");
    DocumentSet ds = new DocumentSet();
    ds.register(d1);
    ds.register(d2);
    ds.documents.add(1, d3);
    assertEquals(3, ds.documentCount());
}

// Test case 8: Test if documentCount() returns the correct count after adding and removing all documents
@Test
public void testDocumentCountAddRemoveAll() {
    Document d1 = new Document("Test Document 1");
    Document d2 = new Document("Test Document 2");
    DocumentSet ds = new DocumentSet();
    ds.register(d1);
    ds.register(d2);
    ds.documents.removeAllElements();
    assertEquals(0, ds.documentCount());
}

// Test case 9: Test if documentCount() returns the correct count after adding and removing a document multiple times
@Test
public void testDocumentCountAddRemoveMultiple() {
    Document d1 = new Document("Test Document 1");
    Document d2 = new Document("Test Document 2");
    DocumentSet ds = new DocumentSet();
    ds.register(d1);
    ds.register(d2);
    ds.documents.remove(0);
    ds.documents.remove(0);
    ds.documents.add(d1);
    ds.documents.add(d2);
    assertEquals(2, ds.documentCount());
}

// Test case 10: Test if documentCount() returns the correct count after adding and replacing all documents
@Test
public void testDocumentCountAddReplaceAll() {
    Document d1 = new Document("Test Document 1");
    Document d2 = new Document("Test Document 2");
    Document d3 = new Document("Test Document 3");
    DocumentSet ds = new DocumentSet();
    ds.register(d1);
    ds.register(d2);
    ds.documents.set(0, d3);
    ds.documents.set(1, d3);
    assertEquals(2, ds.documentCount());
}
}