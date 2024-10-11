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
		private final int MIN_SIZE = 10;
		private DocumentSet set = new DocumentSet();
		private Vector<String> tokens = new Vector<String>();
		
		private void initializeDocumentSet(int nTokens) {
			Hashtable<String, Integer> freq = new Hashtable<String, Integer>();
			Hashtable<String, Integer> count = new Hashtable<String, Integer>();
			int i;
			for (i = 0; i < nTokens; i++) {
				String token = ((String) tokens.elementAt(i)).trim();
				ArrayList<Character> pt = new ArrayList<Character>(2);
				boolean tokenFound = false;
				for (int j = 0; j < tokens.size(); j++) {
					if (token.equals(tokens.elementAt(j))) {
						pt.add(token.charAt(0));
						pt.add(token.charAt(1));
						tokenFound = true;
					}
				}
				if (!tokenFound)
					token = "[not_found]";
				pt.clear();
				pt.add(' ');
				tokens.setElementAt(token, i);
				freq.put(token, new Integer(1));
				count.put(token, new Integer(1));
			}
			set.register(((DocumentSet) frequency.clone()).getDocument(set.documentCount()));
			set.register(((DocumentSet) freq.clone()).getDocument(set.documentCount()));
			for (i = 1; i < MAX_SIZE; i++) set.register(((DocumentSet) freq.clone()).getDocument(set.documentCount()));
		}

		void verifyNumberOfDocumentsKnown() {
			assertEquals("Hashtable is not updated properly", set.documentCount(), count.size());
			for (int i = 1; i <= MAX_SIZE; i++) {
				if (i == set.documentCount()) {
					assertTrue("DocumentSet should have at least 1 document", count.size() >= 1);
					assertEquals(i, count.get("[]"));
				} else {
					assertTrue("DocumentSet should not be at least 1 document", count.size() >= 1);
				}
			}
		}

		private Vector<String> getTokens() {
			return tokens;
		}

		public DocumentSet getDocumentSet() {
			return set;
		}


}