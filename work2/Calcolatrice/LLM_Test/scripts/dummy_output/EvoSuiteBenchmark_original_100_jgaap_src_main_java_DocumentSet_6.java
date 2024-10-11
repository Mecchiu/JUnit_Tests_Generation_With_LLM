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
	     * A generic test method that iterates over all objects with
	     * the given type.  The result is printed to stdout.
	     * 
	     * @param t_type the type of the objects to be tested
	     */
	public static void main(String[] args) {
		String filename;
		DocumentSetTest t = new DocumentSetTest(2557);
		Document d;
		for(int i = 0; i < 100; ++i) {
			filename = "TestDoc" + i;
			d = t.getDocument(i);
			System.out.println("filename=   " + filename);
			System.out.println("documme count = " + t.documentCount());
			System.out.println("doc=      " + d);
			System.out.println(d);				
			
		}
	}
	
	/**
	     * A generic test class used for the set to and from events,
	     * which has the expected frequency.  The input and output vectors
	     * will have the expected frequency in place of null.
	     */
	private static class TestCase {
		
		Hashtable expected = null;
		Hashtable out = null;
		
		public TestCase(String title, Hashtable expected, Hashtable out) {
			this.expected = expected;
			this.out = out;
		}
		
		// Returns the key being inserted into the expected map
		public String getKey(int index) {
			return (String)this.expected.get(Integer.valueOf(index));
		}
		
		// Gets the value from the frequency map
		public String getValue(int index) {
			return (String)this.out.get(Float.valueOf(Float.intBitsToFloat(index)));
		}
		
		// Returns an array which may be the same as passed in, unless
		//  out is given
		public Document[] getArray(int n) {
			Vector<String> array = new Vector<String>();
			for (int i = 0; i < n; ++i) {
				array.add(testString());
			}
			return array == null? null : array.toArray(new String[0]);
		}
		
		String testString() {
			String result = "";
			for (int i = 0; i < this.out.size(); ++i) {
				if (i!= 0)
					result += ",";
				String key = this.getKey(i);
				String value = this.getValue(i);
				if (expected!= null)
					assertEquals(expected.get(key), value);
				else {
					assertEquals(key, result + key + "=" + value);
				}
			}
			return result;
		}
		
		
		
		int testNumber(int in, int n) {
			return in + "-" + n + "-.".length();
		}
		
	}
	
	
	/**
	     * A test class for the DocumentSet as a singleton.  This is used
	     *  for the testing of a single DocumentSet.  The only object
	     *  that can be initialized is an empty-object that
	     *  has no information.
	     *  The value should be a list of key/value pairs, with that
	     *  value being inserted into the expected table.
	     */
	private static class DocumentSetTestSingle extends DocumentSetTest {

		public DocumentSetTestSingle(String key) {
			super(key);
			expected = new Hashtable();
		}

		public String toXML() {
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < get().size(); ++i) {
				sb.append("<" + getKey(i) + " id='" + i + "' ");
				if (get().get(i).equals(""))
					sb.append("/>");
				else
					sb.append(" value='" + getValue(i) + "' ");
					
			}
			return ("<" + getKey() + "/>" + sb + "</" + getKey() + ">");
		}                
		
		public void register(String value) {
			Document d = new Document();
			Hashtable expected = new Hashtable();
			expected.put(Integer.valueOf(0), value);
			d.setAll(expected);
			super.register(d);
		}
	}
	
	
	private  boolean verbose = true;
	private  java.util.logging.Logger log = java.util.logging.Logger.getLogger(this.getClass().getName());
	
	/**
	     * Creates a new empty DocumentSet.
	     */
	public DocumentSet() {
		this.frequency = new Hashtable();
		this.documentCount();
	}
	
	/**
	     * Register the given object with the set of documents by a set
	     *  of documents.
	     */
	public DocumentSet register(Document d) {
		if (!(d instanceof Document))
			throw new IllegalArgumentException();
		register(d, d);
		return this;
	}

	/**
	     * Register the given object with the set, with an array of the given size
	     */
	public DocumentSet register(Document d, Document d2) {
		if (!(d instanceof Document))
			throw new IllegalArgumentException();
		if (!(d2 instanceof Document))
			throw new IllegalArgumentException();
		register(d, d2, d);
		return this;
	}

	
	/**
	     * Returns the size of the set, in order
	     */
}