// Element_6Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#numberOfNamespaceMappings()} method.
*/
class Element_6Test {

	/**
	 * Test method.
	 */
	@Test
	public void testEquals() {
		Element e1 = make("<e id ='123'>x</e>");
		Element e2 = make("<e id ='123'>x</e>");
		Element e3 = make("<e id ='123'>y</e>");
		Element e4 = make("<e id ='123'>z</e>");
		Element e5 = make("<e id ='456'>x</e>");
		Element e6 = new Element("z");
		EqualityTester equality = new EqualityTester();
		
		equality.add(e1, e1);
		equality.add(e5, e1);
		
		assertEquals(false, equals(e3, e1));
		assertEquals(true, equals(e6, e1));
		assertEquals(true, equals(e4, e5));
		assertEquals(false, equals(e4, e6));
		
	}
	

	/**
	 * Add one element.
	 * @return the inserted element
	 */
	private Element make(String string) throws TransformerException {
		if (string.indexOf("\r\n ")==-1){
			Element p = new Element("p"+string.charAt(0)+"p"+string.charAt(1)+"p"+string.charAt(2));
			return p;
		}
		
		if(string.charAt(0)=="\r"&&string.charAt(1)=="r"){ //\x0A\r\n
			Element p = new Element("b"+(string.charAt(1)+1)+"b"+(string.charAt(2)+1));
			p.setText(string.substring(string.indexOf("\r\n"),string.length()));
			return p;
		}
		
		Element p = new Element("\uffff");
		p = p.setText(string.substring(string.indexOf('p'),string.length()));
		return p;
	}
	
	@Test
	public void testGetElementID(){
		String s = "<e id='a'>x</e><e id='b'>y</e>";
		String p = "<e id='a'>p1</e><e id='b'>p2</e>";
		
		Elements e = Elements.getElements(s);
		Elements e1 = Elements.getElements(s);
		assertEquals("<e id='a'>p1</e>", e1.getItem(0).getText());
		assertEquals("e", e.getItem(1).getType());
		
		assertEquals("x", e1.getItem(0).getChildItem().getText());
		assertEquals("p", e1.getItem(1).getChildItem().getText());
		assertEquals("y", e1.getItem(2).getText());
		
		assertNull(e1.getItem(3));
	}
	
	@Test
	public void testGetChildElementID(){
		String s = "<e id ='a'>" +
				"<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
				"<e>x</e>" +
				"<e id ='b'>y</e>" +
				"<e id ='c'>z</e>" +
				"</e>";
		String p = "<e id='b'>" +
				"<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
				"<e>b</e>" +
				"</e>";
		String q = "<e id ='c'>z</e>" ;
		String p1 = "<e id='c'>z</e>" ;
		String p2 = "<e id='c'>z</e>";
		
		Vector<String> v = Elements.extractElementIDs(s);
		Elements e = Elements.getElements(p);
		Elements e2 = Elements.getElements(p1);
		Elements e3 = Elements.getElements(p2);
		
		Elements f= Elements.getElements(p2);
		Elements f1= Elements.getElements(p1);
		Elements f2= Elements.getElements(p2);
		
		assertEquals("1p", e1.getItem(0).getChildItem().getContent());
		assertEquals("2p", e2.getItem(0).getChildItem().getContent());
		assertEquals("3p", e3.getItem(0).getChildItem().getContent());
		
		assertEquals("a", e1.getItem(0).getChildItem().getNextItem().getContent());
		assertEquals("b", e2.getItem(0).getChildItem().getNextItem().getContent());
		assertEquals("c", e3.getItem(0).getChildItem().getNextItem().getContent());
		
		assertEquals("1p", e1.getItem(1).getNextItem().getContent());
		assertNull(e2.getItem(1));
		assertEquals("3p", e3.getItem(v.size()-1).getNextItem().getContent());
		
		
		AttributesImpl attr = new AttributesImpl();
		attr.addAttribute("id", "b", "http://www.w3.org/2000/WSGIT_COMPONENT_ID", null);
		attr.addAttribute("id", "c", "http://www.w3.org/2000/WSGIT_COMPONENT_ID", null);
		
		Elements element = Elements.extractElementIDs(p);
		Vector<String> u = Elements.getElementIDsInOrder(b, e);
		Elements eu = Elements.getElements(e2);
		Elements ev = Elements.getElements(e3);
		
		
		AttributesImpl attrs = new AttributesImpl();
		
		
		Elements list = Elements.getElements(p2);
		Elements jj = Elements.getElements(p2);
		Elements ij = Elements.getElements(p2);
		Elements d = Elements.getElements(q);
		
		
		assertEquals("1p", list.getItem(0).getChildItem().getContent());
		assertEquals("2p", jj.getItem(0).getChildItem().getContent());
		assertEquals("3p", ij.getItem(0).getChildItem().getContent());
		
		assertEquals("1p", list.getItem(1).getChildItem().getContent());
		assertNull(list.getItem(3));
		assertEquals("3p", ij.getItem(1).getChildItem().getNextItem().getContent());
		assertNull(uj.getItem(u.size()-1));
		assertEquals("b", ej.getItem(0).getChildItem2().getContent());
		
		assertEquals("a", ej.getItem(list.size()-1).getChildItem().getContent());
		assertNull(ej.getItem(0));
		assertArrayEquals(new String[]{"b", "c"}, attrs.getKeySet());
	}
	
}
