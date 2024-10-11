// DocumentSet_0Test.java


/**
 *  DocumentSet.java
 *   Caleb Astey - 2007
 */
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
class DocumentSet_0Test {

		/**
		* Test case for {@link DocumentSet#documentCount()}.
		*/
		@Test
		void testDocumentCount_0() {
				DocumentSet ds = new DocumentSet();
				assertEquals(0, ds.documentCount());
		}
		
		/**
		* Test case for {@link DocumentSet#documentCount()}.
		*/
		@Test
		void testDocumentCount_1() {
				DocumentSet ds = new DocumentSet();
				ds.register(new Document("test"));
				assertEquals(1, ds.documentCount());
		}
		
		/**
		* Test case for {@link DocumentSet#documentCount()}.
		*/
		@Test
		void testDocumentCount_2() {
				DocumentSet ds = new DocumentSet();
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				assertEquals(2, ds.documentCount());
		}
		
		/**
		* Test case for {@link DocumentSet#documentCount()}.
		*/
		@Test
		void testDocumentCount_3() {
				DocumentSet ds = new DocumentSet();
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				assertEquals(3, ds.documentCount());
		}
		
		/**
		* Test case for {@link DocumentSet#documentCount()}.
		*/
		@Test
		void testDocumentCount_4() {
				DocumentSet ds = new DocumentSet();
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				assertEquals(4, ds.documentCount());
		}
		
		/**
		* Test case for {@link DocumentSet#documentCount()}.
		*/
		@Test
		void testDocumentCount_5() {
				DocumentSet ds = new DocumentSet();
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				assertEquals(5, ds.documentCount());
		}
		
		/**
		* Test case for {@link DocumentSet#documentCount()}.
		*/
		@Test
		void testDocumentCount_6() {
				DocumentSet ds = new DocumentSet();
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				assertEquals(6, ds.documentCount());
		}
		
		/**
		* Test case for {@link DocumentSet#documentCount()}.
		*/
		@Test
		void testDocumentCount_7() {
				DocumentSet ds = new DocumentSet();
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				assertEquals(7, ds.documentCount());
		}
		
		/**
		* Test case for {@link DocumentSet#documentCount()}.
		*/
		@Test
		void testDocumentCount_8() {
				DocumentSet ds = new DocumentSet();
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				assertEquals(8, ds.documentCount());
		}
		
		/**
		* Test case for {@link DocumentSet#documentCount()}.
		*/
		@Test
		void testDocumentCount_9() {
				DocumentSet ds = new DocumentSet();
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				assertEquals(9, ds.documentCount());
		}
		
		/**
		* Test case for {@link DocumentSet#documentCount()}.
		*/
		@Test
		void testDocumentCount_10() {
				DocumentSet ds = new DocumentSet();
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				ds.register(new Document("test"));
				assertEquals(10, ds.documentCount());
		}
		
}

// DocumentSet_1Test.java


/**
 *  DocumentSet.java
 *   Caleb Astey - 2007
 */
import java.util.Vector;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DocumentSet}.
* It contains ten unit test cases for the {@link DocumentSet#getDocument(int)} method.
*/
class DocumentSet_1Test {
		
		/**
		* Test case for {@link DocumentSet#getDocument(int)}.
		*/
		@Test
		void testGetDocument_0() {
				DocumentSet ds = new DocumentSet();
				assertEquals(null, ds.getDocument(0));
		}
		
		/**
		* Test case for {@link DocumentSet#getDocument(int)}.
		*/
		@Test
		void testGetDocument_1() {
				DocumentSet ds = new DocumentSet();
				ds.register(new Document("test"));
		