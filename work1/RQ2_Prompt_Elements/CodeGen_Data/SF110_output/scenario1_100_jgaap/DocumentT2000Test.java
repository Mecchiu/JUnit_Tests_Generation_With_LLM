// DocumentTest.java


import java.io.*;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Document}.
* It contains one unit test case for the {@link Document#stringify()} method.
*/
class DocumentTest {

	private String data = "";
	private Document document;
	
	/**
	 *  Create a Document object
	 *  @param the Data to be stored in the Document.
	 */
	public DocumentTest(String theData) {
		document = new Document();
		StringReader theDataReader = null;
		theDataReader = new StringReader(theData);
		document.procText = new Vector();
		document.procSubStr = new Vector();
		document.procSubStrRef = new Vector();
		document.procSubStrRefRef = new Vector();
		document.procSubStrRefRef.addElement();
		document.procSubStr = new Vector();
		document.procText = new Vector();
		document.procSubStrRef = new Vector();
		document.procSubStrRefRef = new Vector();
		document.procSubStrRefRef.addElement();
		document.procSubStrRefRef.addElement();
		document.procSubStrRefRefRef = new Vector();
		document.procSubStrRefRefRef = new Vector();
		document = null;
		
	}
	
	/**
	 *  Test method for {@link Document#stringify()}.
	 */
	@Test
	public void testStringify() {
		document = new Document();
		String ret = document.stringify();
		assertTrue("Document.stringify() throws an exception in valid cases", ret.equals(""));
		assertTrue("Document.stringify() throws an exception in invalid cases", ret.indexOf("")>0);
	}

	/**
	*  Test method for {@link Document#stringifyToStream()}.
	*/
	@Test
	public void testStringifyToStream()  {
		document = new Document();
		StringReader stream = null;
		stream = new StringReader(document.stringifyToStream());
		Document doc = null;
		try{
			doc = new Document();
			doc.stringifyToStream();
		}
		catch(IOException ioex){
			assertTrue("Document.stringifyToStream() throws an exception in valid cases", true);
		}
		document = StringUtil.createDocument();
		document.stringifyToStream();
		Document doc2 = StringUtil.createDocument();
		doc2.stringifyToStream();
		stream.close();
		stream = null;
		testEquals(new String(doc.stringifyToStream()), new String(doc2.stringifyToStream()));
	}
	
	public void testEquals(String data, String data2){
		assertTrue("Document.stringify() returns false when data == null", data.equals(data));
		assertTrue("Document.stringify() returns false when data!= null", data.equals(data2));
		assertTrue("Document.stringify() returns true when data.equals(data2)", data.equals(data));
		assertTrue("Document.stringify() returns false when data!= data", data.equals(data2));
		assertFalse("Document.stringify() returns true when data!= data2", data.equals(0));
	}
	
	
	/**
	*  Test method for {@link Document#stringifySubStr(String)}.
	*/
	@Test
	public void testStringifySubStr()  {
		String ret = document.stringifySubStr(0, 1);
		assertTrue("Document.stringifySubStr() throws an exception in valid cases", ret.indexOf("0")>=0);
		assertTrue("Document.stringifySubStr() throws an exception in valid cases", ret.indexOf("0")==0);
		String ret2 = document.stringifySubStrRef.elementAt(0);
		assertTrue("Document.stringifySubStrRef() throws an exception in valid cases", ret2.indexOf("0")>=0);
		assertTrue("Document.stringifySubStrRef() throws an exception in valid cases", ret2.indexOf("0")==0);
		assertTrue("Document.stringifySubStrRef() throws an exception in valid cases", ret2.indexOf("0")!=0);
	}
	
	/**
	*  Test method for {@link Document#stringifySubStrRef(Vector)}.
	*/
	@Test
	public void testStringifySubStrRef()  {
		Vector ret = document.stringifySubStrRef;
		assertTrue("Document.stringifySubStrRef() throws an exception in valid cases", ret.size()>0);
		for (int i=0; i<ret.size(); i++) {
			String ret1 = (String) ret.elementAt(i);
			ret1 = document.stringifySubStrRefRef.elementAt(i);
			assertTrue("Document.stringifySubStrRefRef() does not throw an exception in valid cases", ret1.equals(ret.elementAt(i)));
		}
		Vector newarray = new Vector();
		newarray.addElement("test");
		newarray.addElement("test");
		ret = newarray;
		ret = document.stringifySubStrRef.elementAt(0);
		assertTrue("Document.stringifySubStrRefRef() throws an exception in valid cases", ret.size()>0);
		assertTrue(ret.size()==2);
		assertTrue("Document.stringifySubStrRefRef() throws an exception in valid cases", ret.get(0).equals("test"));
		assertTrue("Document.stringifySubStrRefRef() throws an exception in valid cases", ret.get(1).equals("test"));
	}
	
	/**
	*  Test method for {@link Document#procText()}.
	*/
	@Test
	public void testProcText()  {
		Vector ret = document.procText;
		assertTrue("Document.procText() throws an exception in valid cases", ret.size()>0);
		for (int i=0; i<ret.size(); i++) {
			assertTrue("Document.procText() does not return an empty array in the correct case", ret.elementAt(i).equals(""));
		}
		Vector newarray = new Vector();
		newarray.addElement("test");
		newarray.addElement("test");
		ret = newarray;
		assertTrue("Document.procText() returns an empty array in an invalid case", ret.size()==3);
		ret.remove(1);
		assertTrue("Document.procText() doesn't take an argument in an invalid case", ret.size()==2);
	}
	
	/**
	*  Test method for {@link Document#procSubStr()}.
	*/
	@Test
	public void testProcSubStr()  {
		Vector ret = document.procSubStr;
		assertTrue("Document.procSubStr() throws an exception in valid cases", ret.size()>0);
		for (int i=0; i<ret.size(); i++) {
			assertTrue("Document.procSubStr() returns an empty array in the correct case", ret.elementAt(i).equals(""));
		}
		
		Vector newarray = new Vector();
		newarray.addElement("test");
		newarray.addElement("test");
		ret = newarray;
		ret = document.procSubStr;
		assertTrue("Document.procSubStr() returns an empty array in an invalid case", ret.size()==3);
		ret.remove(1);
		assertTrue("Document.procSubStr() doesn't take an argument in an invalid case", ret.size()==2);
	}
	
	/**
	*  Test method for {@link Document#procSubStrRef()}.
	*/
	@Test
	public void testProcSubStrRef()  {
		Vector ret = document.procSubStrRefRef;
		assertTrue("Document.procSubStrRef() throws an