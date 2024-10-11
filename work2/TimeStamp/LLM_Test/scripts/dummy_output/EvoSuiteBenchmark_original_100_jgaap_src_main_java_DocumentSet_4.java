// DocumentSetTest.java


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
class DocumentSetTest {
		
        public static final int MAX_DOCUMENT_LENGTH = 5000000;
        public static final int FUZZY_THRESHOLD = 10;

		public DocumentSetTest() {
		}

		@Test
		public void testSimpleSet()
				throws Exception {
				DocumentSet ds = new DocumentSet();
				// this will be used to collect the words in the entire set
				Vector<Document> words = new Vector<Document>();

				// create the set of documents by randomly filling the whole set
				ds.setDocumentCount(words.size());
				for (int i = 0; i < MAX_DOCUMENT_LENGTH; i++) {
					// make sure the document can be represented as a vector
					assertTrue(words.size() > 20);
					Document d =  ds.getDocument(StringUtil.generateRandomIndex(fuzzyThreshold()));

					ds.register(d);
                    words.add(d);
				}
				assertEquals(words.size(), ds.documentCount());
				// make sure the entire set was represented by a string
				assertEquals(StringUtil.asString(words),
							  StringUtil.asString(ds.getDocumentString()));
				// make sure the set was actually a copy
				assertEquals(words, new Vector(words));
				
		}
		
		@Test
		public void testRandomSet()
				throws Exception {

				DocumentSet ds = new DocumentSet();
				Document d;
				// this will be used to collect the words in the entire set
				Vector<Document> words = new Vector<Document>();

				// create the set of documents by randomly filling the whole set
				ds.setDocumentCount(1000); // more than the max allowed!
				for (int i = 1; i <= FUZZY_THRESHOLD; i++) {
					d =  ds.getDocument(StringUtil.generateRandomIndex(fuzzyThreshold()));
					words.add(d);
				}
				assertEquals(words.size(), ds.documentCount());
				// make sure the entire set was represented by a string
				assertEquals(StringUtil.asString(words),
							  StringUtil.asString(ds.getDocumentString()));
				// make sure the set was actually a copy
				assertEquals(words, new Vector(words));
				
		}
        
        private Vector<Document> createDocumentVector() {
                Vector<Document> docs = new Vector<Document>();

                for (int i = 0; i < 100000; i++) {
                        Document d = new Document();
                        Vector<NamedWord> nw = d.generateNamedWords();
                        Vector<NamedWord> empty = d.generateNamedWords();

                        for (int j = 0; j < 5; j++) {
                                for (int k = 0; k < 5; k++) {
                                        // replace the first 5 named words
                                        NamedWord newWord = new NamedWord();
                                        for (int l = 0; l < 5; l++) {
                                                if (l == k)
                                                        newWord.nWords()++;
                                        }
                                        newWord.name("test" + Integer.toString(i + j));
                                        newWord.addWord(nw[l]);
                                        newWord.addWord(empty[l]);
                                        newWord.addWord(nv[l]);
                                        newWord.addWord(ew[l]);
                                        docs.add(newWord);
                                }
                        }
                }
                return docs;
        }

}