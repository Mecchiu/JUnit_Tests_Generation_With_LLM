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
/**
		* The number of documents in the set to be tested.
		*/
	int testSet[];

		{
			testSet =
				new int[] {0, 1};
		}

		{
			testSet =
				new int[] {1};
		}

		/**
		* Iterates through the set of documents and checks
		* their frequency.
		*/
	@Test
	void documentCount() {
		DocumentSet result = new DocumentSet();
		for(int i=0; i<testSet.length;i++)
			result.register(getDocument(testSet[i]));
		assertEquals(testSet[0], result.documentCount());
	}

		/**
		* Iterates through the set of documents and checks
		* their frequency.
		*/
	@Test
	void characterFrequency() {
		DocumentSet result = new DocumentSet();
		for(int i=0;i<testSet.length;i++)
			result.register(getDocument(testSet[i]));
		result.characterFrequency();
		assertTrue(result.contains(getDocument(0)));
		assertFalse(result.contains(getDocument(1)));
	}

		/**
		* Iterates through the set of documents and checks their frequency.
		*/
	@Test
	void wordFrequency( ) {
		DocumentSet result = new DocumentSet();
		for (int i=0;i<testSet.length;i++)
			result.register(getDocument(testSet[i]));
		result.wordFrequency();
		assertTrue(result.contains(getDocument(0)));
		assertTrue(result.contains(getDocument(1)));
		assertTrue(result.contains(getDocument(2)));
		assertTrue(result.contains(getDocument(3)));
		assertTrue(result.contains(getDocument(4)));
		assertTrue(result.contains(getDocument(5)));
		assertTrue(result.contains(getDocument(6)));
		assertTrue(result.contains(getDocument(7)));
		assertTrue(result.contains(getDocument(8)));
		assertTrue(result.contains(getDocument(9)));
		assertTrue(result.contains(getDocument(10)));
		assertTrue(result.contains(getDocument(11)));
		assertTrue(result.contains(getDocument(12)));
		assertTrue(result.contains(getDocument(13)));
		assertTrue(result.contains(getDocument(14)));
	}

		/**
		* Iterates through the set, checking the frequency of documents
		*  with given indexes in the document with the lowest order.
		*/
	@Test
	void order() {
		DocumentSet result = new DocumentSet();
		for (int i=0;i<testSet.length/4-1;i++)
			result.register(getDocument(testSet[i]));
		result.order(0);
		assertTrue(result.contains(getDocument(testSet[0])));
		assertTrue(result.contains(getDocument(testSet[1])));
		assertTrue(result.contains(getDocument(testSet[2])));
		assertTrue(result.contains(getDocument(testSet[3])));
		assertTrue(result.contains(getDocument(testSet[4])));
	}

		/**
		* Iterates through the set, checking the frequency of documents
		*  with given counts in the document with the lowest order.
		*/
	@Test
	void orderByFrequency( ) {
		DocumentSet result = new DocumentSet();
		for (int i=0;i<testSet.length;i++)
			result.register(getDocument(testSet[i]));
		result.orderByFrequency(documents.size());
		assertEquals(testSet[0], result.getDocument(0));
		assertEquals(testSet[1], result.getDocument(1));
		assertEquals(testSet[2], result.getDocument(2));
		assertEquals(testSet[3], result.getDocument(3));
		assertEquals(testSet[4], result.getDocument(4));
	}

	/**
       * Iterates through the set, checking the frequency of documents
       *  with given counts in the document with given weight.
       */
	@Test
	void weightedOrder( ) {
		DocumentSet result = new DocumentSet();
		for (int i=0;i<testSet.length;i++)
			result.register(getDocument(testSet[i]));
		result.weightedOrder(documents);
		assertEquals(testSet[0], result.getDocument(0));
		assertEquals(testSet[1], result.getDocument(1));
		assertEquals(testSet[2], result.getDocument(2));
		assertEquals(testSet[3], result.getDocument(3));
		assertEquals(testSet[4], result.getDocument(4));
	}

	/**
        Set of test vectors.
       */
        static Vector testVectors[] = {
        };

}

class Event {
    int type;        /**< Type of occurrence (0 for ordinary,
                             1 for event,
                             2 for occurrence of text.) */
    int frequency;   /**< Frequency in bits, which is equal to
                         the sum of occurrence bits of text within
                         document. */
    int frequencyInt;/**< Frequency in integer bits.
                         (not bitwise-equivalent to frequency)*/
    int weight;   /**< Text weight. */

    /**
     * Generates and returns an {@link OrderedSet} of events from the set of documents
     * represented by