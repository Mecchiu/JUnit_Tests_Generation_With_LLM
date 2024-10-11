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
		
	public DocumentSet_0Test() {
        frequency = new Hashtable();
	}

	public void test() {
		new DocumentSet(documents, frequency);
	}

	/**
	* Test class of {@link DocumentSet}.<P>
	* Contains one unit test case for {@link DocumentSet#register(Document)}<P> called from the
	* method {@link DocumentSet#register(Document)}<P> method.
	*/
	@Test
    public void test_0() {
		DocumentSet d = new DocumentSet();
		d.register(documents.elementAt(0));

        assertEquals(1, d.documentCount());
        assertEquals(1, d[0].documentCount());
        assertEquals(1, d.mostCommon(3));
        
    }

}

//end