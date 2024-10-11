// Element_3Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeLocalName(int)} method.
*/
class Element_3Test {
		
	/**
	 * Get the name of the attribute at the specified index.
	 *
	 * @param index the index as returned from {@link #lookupAttribute}
	 * @return the localName,
	 *         or <code>null</code> if index is -1
	 * @throws IndexOutOfBoundsException if no such attribute exist.
	 */
	String getAttributeLocalName(int index) throws IndexOutOfBoundsException;
	
	/**
	 * Test the lookup with an invalid index.
	 */
	@Test
	public void invalidIndex() {
		String str = 
			"<element xmlns=\u00c9>";
		Element element = new Element();
		try {
			element.lookupAttribute(str + attr(str, "empty"));
			fail("expected IndexOutOfBoundsException");
		} catch (IndexOutOfBoundsException e) {
			//expected
		}
	}
	
	//Testcase for the method lookupAttribute.
	
	private AttributesImpl attr(String tag, String val) {
		AttributesImpl attr = new AttributesImpl();
		String[] atts = tag.split("\\|");
		for(int i=atts.length-1; i>=0; --i)
			attr.addAttribute(atts[i], val);
		return attr;
	}
	
	/**
	 * Test the lookup with a good index.
	 */
	@Test
	public void goodIndex() {
		String str = 
			"<element xmlns=\u00c9 "
			+ "/>"
			+ "<a id=\u00cb"
			+ ">foo</a>";
		Element element = new Element();
		element.lookupAttribute(str);
		Vector<String> attrs = element.getAttributeNames();
		assertEquals("Attribute should be [a id=][id]", 1, attrs.size());
		assertEquals("Attribute should be [b id=][id]", "id", attrs.firstElement());
	}
	
	@Test
	public void attributeNames() {
		String str =
			"<element xmlns:ns=\"http://ecg.uci.edu/ns/ecg/ns/0/1\">"
			+ "<a:v id=\"a1\">foo</a:v></element>";
		Element elems = new Element();
		elems.lookupAttribute(str+"/a:v");
		assertEquals("ns element with invalid target", "ns:a1", elems.getAttribute("tag"));
	}
	
	/**
	 * Test case for {@link Element#getAttributeNames()}.
	 */
	@Test
	public void attributeNames() {
		String str1 = 
			"<element xmlns:ns=\"http://ecg.uci.edu/ns/ecg/ns/0/1\">"
			+ "<a:v id=\"a1\">foo</a:v>";
		String str2 = 
			"<element xmlns:ns=\"http://ecg.uci.edu/ns/ecg/ns/0/1\">";
		String str3 = 
			"<a:v id=\"a2\">";
		String str4 = 
			"</a:v>.*";
		String str5 = "</a:v>";
		String str6 =
				"<a:v id=\"a3\" attribute name=\"test1\">\n"
				+ "foo\n"
				+ "</a:v>\n"
				+ ".*\n"
				+ "</a:v>\n";
		String str3a = "";
		String str6a = "";
		String str5e = "\n";
		
		EBCallback<String[]> c = new EBCallback<>(str1, elems.getAttributeNames);
		EBCallback<String[]> ca = new EBCallback<>(str2, elems.getAttributeNames());
		EBCallback<String[]> cd = new EBCallback<>(str3, elems.getAttributeNames());
		EBCallback<String[]> cc = new EBCallback<>(str6, elems.getAttributeNames());
		EBCallback<String[]>caa = new EBCallback<>(str3a, elems.getAttributeNames());
		EBCallback<String[]> ch = new EBCallback<>(str6a, elems.getAttributeNames());
		EBCallback<String[]> cb = new EBCallback<>(str5e, elems.getAttributeNames());
		//System.err.println(c.size());
		
		Vector<String> vc = new Vector<String>();
		try {
			while(c.step(cb)) {
				String[] a = c.value;
				String[] ca = caa.value;
				String[] cd = cc.value;
				String[] cc = ccb.value;
				String[] caa = caa.value;
				//System.err.println(va);
				assertEquals("Number of results",
						a.length + caa.length,
						c.size());
				//System.out.println(va);
				if (a!=null){
					for (int i = 0; i < a.length; i++) {
					vc.add(a[i]);
					}
				}
				if (ca!=null){
					for (int i = 0; i < caa.length; i++) {
					va.add("a" + i);
					vc.add(caa[i]);
					}
				}
				if (cd!=null){
					for (int i = 0; i < cd.length; i++) {
					va.add("b" + i);
					vc.add(cd[i]);
					}
				}
				//if (ca!=null){
				//vc.print();
				//assertEquals("Results mismatch.", va.size(), c.size());
				//v.add("\n----------------");
				//for (int i = 0; i < c.size(); i++) {
				//	v.add(c.value[i]);
				//	v.add("\n");
				//}
				//assertEquals("Text not equal.", va.size(), v.size());
				//v.add("\n");
				//assertTrue("Text not equal.", v.equals(vl));
				}else {
				}
			}
		}finally {
			cb.release();
			cd.release();
			caa.release();
			ca.release();
			ch.release();
			cb.release();
			cd.release();
			cc.release();
			caa.release();
			ch.release();
		}
	}

}