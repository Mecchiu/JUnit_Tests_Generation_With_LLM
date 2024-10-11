// Element_0Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#lookupAttribute(String, String)} method.
*/
class Element_0Test {
		
	private static XMLImpl XMLImplTest = new XMLImplTest();

	@Test
	public void testLookupAttribute() throws Exception {
		
		// @TODO attribute xmlns="" is not a valid namesapce
		
		// test attribute xmlns="""
		// System.out.println( XMLImplTest.lookupAttribute("","xmlns",null));  // Exception expected
		
		// System.out.println( XMLImplTest.lookupAttribute("","xmlns","")); // Exception expected
		// </pre>
	}

	@Test
	public void testGetName() throws Exception {
		
		// test getName()
		
		// Test value: null
		System.out.println(XMLImplTest.getName(null));
		// </pre>
	}

	@Test
	public void testGetAttributeValue() throws Exception {
		
		// test getAttributeValue()
		
		// Test value: ""
		System.out.println(XMLImplTest.getAttributeValue("", null));
		// </pre>
	}

	@Test
	public void testGetAttributeType() throws Exception {
		
		// test getAttributeType()
		
		// Test value: null
		System.out.println(XMLImplTest.getAttributeType(null));
		// </pre>
	}

	@Test
	public void testCreate() throws Exception {
		
		// test create()
		
		// Test value: null
		Vector<Nodes> result = XMLImplTest.create("<node><child xmlns=\"ns1\" xmlns:ns2=\"ns2\" xmlns:ns4=\"ns3\"/>");
		// </pre>
		Nodes children = result.get(0);
		
        Nodes child1 = new Nodes();
        Nodes child2 = new Nodes();
        Nodes child3 = new Nodes();
        
        child1.addChild(child2);
        child1.addChild(child3);
        
        System.out.println(XMLImplTest.getNodeValue(result, this));
        
        assertNotNull(children.node);
        assertNotNull(result.get(0));
        
        System.out.println(result.size());
        
        assertTrue(child1.node == "0");
        assertTrue(child3.node == "0"); 
        
        assertEquals(3,result.size());
        assertTrue(child1.node == "1");
        assertTrue(child2.node == "1");
        assertTrue(child3.node == "1");
        
        assertEquals(2,result.size());
        assertTrue(child1.node == "2");
        assertTrue(child2.node == "2");
        assertTrue(child3.node == "2");
        
        int count = 0;
        Collection<Nodes> children2 = getChildren2(NodesType.ELEMENT);
        for(Nodes child : children){
        	System.out.println("child node.text="+child.getNodeValue(child));
        	count++;
        }
        System.out.println("count="+count);
        assertEquals(2, count);
  }  
  
  public static class XMLImplTest {

  	public static Vector<Nodes> create(String xml){
		Vector<Nodes> result = new Vector<Nodes>();
		result.add(new Element("element").getAttributes().getValueAttri().getValue().toString());
		if((xml == null) || (xml.isEmpty())){
			xml = "";//xml = NodesType.ELEMENT.xmlToHtml(0,0);
			xml = xml.toLowerCase();
		}
		result.add(new Element(xml).getAttributes().getValueAttri().getValue().toString());
		return result;
		
	}
  	
  	public static Vector<Nodes> getChildren2(NodesType... childTypes) {
  		Vector<Nodes> result = create("<child>"+"<attribute>text=\""+(String) childTypes[0].node+"\" /></child>");
  		result.add(new Element("child").getAttributes().getValueAttri().getValue().toString());
		return result;
	}
	
	
	public static Nodes getNode(Element element, NodesType... childTypes) {
		Vector<Nodes> result = create("<child>"+"<attribute>text=\""+(String) childTypes[0].node+"\" /></child>");
		result.add(new Element("child").getAttributes().getValueAttri().getValue().toString());
		for(int i=1; i< (childTypes.length -1);i++) {
			try {
				return element.getNode(childTypes[i], result, null);
			}catch (Exception ex){ 
				throw new RuntimeException("error finding element", ex);
			}
		}
		return null;
	}
	 
  	public static Vector<Nodes> getChildren2(NodesType element, NodesType nodeType, String... childTypes) {
		Vector<Nodes> result = create("<child>"+"<node>"+"<attribute>"+"text=\""+result.get(1).getAttributes().getValueAttri().getValue().toString()+"\" /></node>"+"</child>");
//		for (int i=-1;i<=2;i++) {
//		try {
//			result.add(getNode(element,childTypes));
//		}catch (Exception ex) {
//			throw new RuntimeException("error finding node", ex);
//		} 
//		} 
//		return result;
		return create("<child>"+"<node>"+"<attribute>"+"text=\""+result.get(0).getAttributes().getValueAttri().getValue().toString()+"\" /></node>"+"</child>");
	}
  	
  	public static Vector<Nodes> getChildren2(NodeType nodeType, String... childNames) {
		Vector<Nodes> result = create("<child>"+"<child>"+"<attribute>"+"xmlns=\"http://www.w3.org/1999/xhtml\">"+"<value>text=\""+result.get(1).getAttributes().getValueAttri().getValue().toString()+"\" /></node>"+"</child>"+"</child>"+"</child>");
//		if (result.get(0).getAttributes().getValueAttri()!= null) {
//			for (String childName : childNames) {
//				if (result.get(1).getAttributes().getValueAttri().getValue()!= null) {
//					result.get(1).getAttributes().getValueAttri().getValue().setValue(result.get(1).getAttributes().getValueAttri().getValue().getValue() + "." + childName);
//				}
//			} 
//		}
		return result;
	}
  	
}
}