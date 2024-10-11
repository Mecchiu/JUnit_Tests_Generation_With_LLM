// DocumentSetTest.java


import java.util.Vector;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DocumentSet}.
* It contains ten unit test cases for the {@link DocumentSet#documentCount()} method.
*/
class DocumentSetTest {

		/**
		* Test case 1 for {@link DocumentSet#documentCount()}.
		* It tests the case when the document set is empty.
		*/
		@Test
		public void testDocumentCount1() {
				DocumentSet ds = new DocumentSet();
				assertEquals(0, ds.documentCount());
		}
		
		/**
		* Test case 2 for {@link DocumentSet#documentCount()}.
		* It tests the case when the document set has one document.
		*/
		@Test
		public void testDocumentCount2() {
				DocumentSet ds = new DocumentSet();
				ds.addDocument(new Document("test1.txt"));
				assertEquals(1, ds.documentCount());
		}
		
		/**
		* Test case 3 for {@link DocumentSet#documentCount()}.
		* It tests the case when the document set has two documents.
		*/
		@Test
		public void testDocumentCount3() {
				DocumentSet ds = new DocumentSet();
				ds.addDocument(new Document("test1.txt"));
				ds.addDocument(new Document("test2.txt"));
				assertEquals(2, ds.documentCount());
		}
		
		/**
		* Test case 4 for {@link DocumentSet#documentCount()}.
		* It tests the case when the document set has three documents.
		*/
		@Test
		public void testDocumentCount4() {
				DocumentSet ds = new DocumentSet();
				ds.addDocument(new Document("test1.txt"));
				ds.addDocument(new Document("test2.txt"));
				ds.addDocument(new Document("test3.txt"));
				assertEquals(3, ds.documentCount());
		}
		
		/**
		* Test case 5 for {@link DocumentSet#documentCount()}.
		* It tests the case when the document set has four documents.
		*/
		@Test
		public void testDocumentCount5() {
				DocumentSet ds = new DocumentSet();
				ds.addDocument(new Document("test1.txt"));
				ds.addDocument(new Document("test2.txt"));
				ds.addDocument(new Document("test3.txt"));
				ds.addDocument(new Document("test4.txt"));
				assertEquals(4, ds.documentCount());
		}
		
		/**
		* Test case 6 for {@link DocumentSet#documentCount()}.
		* It tests the case when the document set has five documents.
		*/
		@Test
		public void testDocumentCount6() {
				DocumentSet ds = new DocumentSet();
				ds.addDocument(new Document("test1.txt"));
				ds.addDocument(new Document("test2.txt"));
				ds.addDocument(new Document("test3.txt"));
				ds.addDocument(new Document("test4.txt"));
				ds.addDocument(new Document("test5.txt"));
				assertEquals(5, ds.documentCount());
		}
		
		/**
		* Test case 7 for {@link DocumentSet#documentCount()}.
		* It tests the case when the document set has six documents.
		*/
		@Test
		public void testDocumentCount7() {
				DocumentSet ds = new DocumentSet();
				ds.addDocument(new Document("test1.txt"));
				ds.addDocument(new Document("test2.txt"));
				ds.addDocument(new Document("test3.txt"));
				ds.addDocument(new Document("test4.txt"));
				ds.addDocument(new Document("test5.txt"));
				ds.addDocument(new Document("test6.txt"));
				assertEquals(6, ds.documentCount());
		}
		
		/**
		* Test case 8 for {@link DocumentSet#documentCount()}.
		* It tests the case when the document set has seven documents.
		*/
		@Test
		public void testDocumentCount8() {
				DocumentSet ds = new DocumentSet();
				ds.addDocument(new Document("test1.txt"));
				ds.addDocument(new Document("test2.txt"));
				ds.addDocument(new Document("test3.txt"));
				ds.addDocument(new Document("test4.txt"));
				ds.addDocument(new Document("test5.txt"));
				ds.addDocument(new Document("test6.txt"));
				ds.addDocument(new Document("test7.txt"));
				assertEquals(7, ds.documentCount());
		}
		
		/**
		* Test case 9 for {@link DocumentSet#documentCount()}.
		* It tests the case when the document set has eight documents.
		*/
		@Test
		public void testDocumentCount9() {
				DocumentSet ds = new DocumentSet();
				ds.addDocument(new Document("test1.txt"));
				ds.addDocument(new Document("test2.txt"));
				ds.addDocument(new Document("test3.txt"));
				ds.addDocument(new Document("test4.txt"));
				ds.addDocument(new Document("test5.txt"));
				ds.addDocument(new Document("test6.txt"));
				ds.addDocument(new Document("test7.txt"));
				ds.addDocument(new Document("test8.txt"));
				assertEquals(8, ds.documentCount());
		}
		
		/**
		* Test case 10 for {@link DocumentSet#documentCount()}.
		* It tests the case when the document set has nine documents.
		*/
		@Test
		public void testDocumentCount10() {
				DocumentSet ds = new DocumentSet();
				ds.addDocument(new Document("test1.txt"));
				ds.addDocument(new Document("test2.txt"));
				ds.addDocument(new Document("test3.txt"));
				ds.addDocument(new Document("test4.txt"));
				ds.addDocument(new Document("test5.txt"));
				ds.addDocument(new Document("test6.txt"));
				ds.addDocument(new Document("test7.txt"));
				ds.addDocument(new Document("test8.txt"));
				ds.addDocument(new Document("test9.txt"));
				assertEquals(9, ds.documentCount());
		}
}