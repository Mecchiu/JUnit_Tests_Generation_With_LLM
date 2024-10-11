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
		* Test case for {@link DocumentSet#documentCount()} method.
		* It tests the case when the document set is empty.
		*/
		@Test
		public void testDocumentCountEmpty() {
				DocumentSet ds = new DocumentSet();
				assertEquals(0, ds.documentCount());
		}
		
		/**
		* Test case for {@link DocumentSet#documentCount()} method.
		* It tests the case when the document set has one document.
		*/
		@Test
		public void testDocumentCountOne() {
				DocumentSet ds = new DocumentSet();
				ds.register(new Document("test.txt"));
				assertEquals(1, ds.documentCount());
		}
		
		/**
		* Test case for {@link DocumentSet#documentCount()} method.
		* It tests the case when the document set has two documents.
		*/
		@Test
		public void testDocumentCountTwo() {
				DocumentSet ds = new DocumentSet();
				ds.register(new Document("test.txt"));
				ds.register(new Document("test2.txt"));
				assertEquals(2, ds.documentCount());
		}
		
		/**
		* Test case for {@link DocumentSet#documentCount()} method.
		* It tests the case when the document set has three documents.
		*/
		@Test
		public void testDocumentCountThree() {
				DocumentSet ds = new DocumentSet();
				ds.register(new Document("test.txt"));
				ds.register(new Document("test2.txt"));
				ds.register(new Document("test3.txt"));
				assertEquals(3, ds.documentCount());
		}
		
		/**
		* Test case for {@link DocumentSet#documentCount()} method.
		* It tests the case when the document set has four documents.
		*/
		@Test
		public void testDocumentCountFour() {
				DocumentSet ds = new DocumentSet();
				ds.register(new Document("test.txt"));
				ds.register(new Document("test2.txt"));
				ds.register(new Document("test3.txt"));
				ds.register(new Document("test4.txt"));
				assertEquals(4, ds.documentCount());
		}
		
		/**
		* Test case for {@link DocumentSet#documentCount()} method.
		* It tests the case when the document set has five documents.
		*/
		@Test
		public void testDocumentCountFive() {
				DocumentSet ds = new DocumentSet();
				ds.register(new Document("test.txt"));
				ds.register(new Document("test2.txt"));
				ds.register(new Document("test3.txt"));
				ds.register(new Document("test4.txt"));
				ds.register(new Document("test5.txt"));
				assertEquals(5, ds.documentCount());
		}
		
		/**
		* Test case for {@link DocumentSet#documentCount()} method.
		* It tests the case when the document set has six documents.
		*/
		@Test
		public void testDocumentCountSix() {
				DocumentSet ds = new DocumentSet();
				ds.register(new Document("test.txt"));
				ds.register(new Document("test2.txt"));
				ds.register(new Document("test3.txt"));
				ds.register(new Document("test4.txt"));
				ds.register(new Document("test5.txt"));
				ds.register(new Document("test6.txt"));
				assertEquals(6, ds.documentCount());
		}
		
		/**
		* Test case for {@link DocumentSet#documentCount()} method.
		* It tests the case when the document set has seven documents.
		*/
		@Test
		public void testDocumentCountSeven() {
				DocumentSet ds = new DocumentSet();
				ds.register(new Document("test.txt"));
				ds.register(new Document("test2.txt"));
				ds.register(new Document("test3.txt"));
				ds.register(new Document("test4.txt"));
				ds.register(new Document("test5.txt"));
				ds.register(new Document("test6.txt"));
				ds.register(new Document("test7.txt"));
				assertEquals(7, ds.documentCount());
		}
		
		/**
		* Test case for {@link DocumentSet#documentCount()} method.
		* It tests the case when the document set has eight documents.
		*/
		@Test
		public void testDocumentCountEight() {
				DocumentSet ds = new DocumentSet();
				ds.register(new Document("test.txt"));
				ds.register(new Document("test2.txt"));
				ds.register(new Document("test3.txt"));
				ds.register(new Document("test4.txt"));
				ds.register(new Document("test5.txt"));
				ds.register(new Document("test6.txt"));
				ds.register(new Document("test7.txt"));
				ds.register(new Document("test8.txt"));
				assertEquals(8, ds.documentCount());
		}
		
		/**
		* Test case for {@link DocumentSet#documentCount()} method.
		* It tests the case when the document set has nine documents.
		*/
		@Test
		public void testDocumentCountNine() {
				DocumentSet ds = new DocumentSet();
				ds.register(new Document("test.txt"));
				ds.register(new Document("test2.txt"));
				ds.register(new Document("test3.txt"));
				ds.register(new Document("test4.txt"));
				ds.register(new Document("test5.txt"));
				ds.register(new Document("test6.txt"));
				ds.register(new Document("test7.txt"));
				ds.register(new Document("test8.txt"));
				ds.register(new Document("test9.txt"));
				assertEquals(9, ds.documentCount());
		}
		
		/**
		* Test case for {@link DocumentSet#documentCount()} method.
		* It tests the case when the document set has ten documents.
		*/
		@Test
		public void testDocumentCountTen() {
				DocumentSet ds = new DocumentSet();
				ds.register(new Document("test.txt"));
				ds.register(new Document("test2.txt"));
				ds.register(new Document("test3.txt"));
				ds.register(new Document("test4.txt"));
				ds.register(new Document("test5.txt"));
				ds.register(new Document("test6.txt"));
				ds.register(new Document("test7.txt"));
				ds.register(new Document("test8.txt"));
				ds.register(new Document("test9.txt"));
				ds.register(new Document("test10.txt"));
				assertEquals(10, ds.documentCount());
		}
}