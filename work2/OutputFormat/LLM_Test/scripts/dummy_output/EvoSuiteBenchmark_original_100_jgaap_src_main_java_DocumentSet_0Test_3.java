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
* It contains one unit test case for the {@link DocumentSet#documentCount()} method.
*/
class DocumentSet_0Test {
		static int SIZE = 20;

		@Test
	public void testSize() {
		for (int i = 0; i < documentCount(); i++)
			assertEquals("DocumentSet_0Test.testSize.  Should be equal to documentCount()", documentCount(), SIZE);
	}

	/**
	 *  Counts all the documents contained in the DocumentSet
	 *  that have the given key
	 */
		public int count(String key) {
			Vector<Enumeration> v = elements();
			int t = 0;

			Enumeration e = null;

			while (e.hasMoreElements()) {
				String p = (String) e.nextElement();
				if (key.equals(p))
					t++;
			}

			return t;
		}

	/**
	 * Test the {@link DocumentSet#count} method with multiple keys
	 */
		public int multiple_key_count(String... keys) {
			return count(keys[0]);
		}

		/**
	 * Test the {@link DocumentSet#freq} method
	 */
		public int frequency() {
			return count(".. ").intValue();
		}

		/**
	 * Test the {@link DocumentSet#frequency} method with multiple keys
                */
		public void multkey() {
			assertEquals("freq  ", frequency(), 1);
		}

		/**
	 * Test the documents in the set
	 * @return a Vector of {@link Document} objects containing the documents in this set
	 */
		public Vector test() {
			Vector all = new Vector();
			Vector all2 = new Vector();
			all2.add(new Document("Baz"));

            Vector lista = new Vector();
            lista.add(new Document("Baz"));
            lista.add(new Document("Baz"));

			all.addAll(lista);

			all2.add(new Document("Baz"));
			all2.add(new Document("Baz"));

			all.addAll(all2);

			all2.add(new Document("Baz"));
			all.add(new Document("Baz"));

}
}