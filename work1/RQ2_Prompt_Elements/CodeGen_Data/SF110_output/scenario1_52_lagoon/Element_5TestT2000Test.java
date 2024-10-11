// Element_5Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeValue(int)} method.
*/
class Element_5Test {
@Test
		public void getAttributeValue() throws Exception {
			Element element = new Element();
			//element.setAttributeValue("some attribute");
			assertEquals(new URLImpl("http://example.com/hello.txt","testtext").toString(), element.getAttributeValue("name"));
		}
    @Test
		public void testNamespace() throws Exception {
		ClassLoader c = this.getClass().getClassLoader();

			AttributesImpl attrValue = new AttributesImpl() {{
				addAttribute("namespace", "http://www.w3.org/XML/1998/namespace","xmlns");
			}};

			Element element = new Element("test","/",attrValue);

			assertNotNull(element.getNamespace());

		String s = element.getNamespace();
		System.out.println(s);

			ClassLoader cl = element.getClassLoader();

                        URL url = new URLImpl("http://www.w3.org/XML/1998/namespace","xmlns","test","hello.txt");
                        
			StringWriter writer = new StringWriter();
			StreamSource ssource = new StreamSource(url,writer);
			SAXParserFactory spf = SAXParserFactory.newInstance();
			try {
					ElementParser parser = new ElementParser(ssource);
					parser.parse(new StreamSource(spf.newStreamHandler(writer)));
			}
			catch (Exception e) {
					e.printStackTrace();
				}

			NodeList nl = element.elements();

            for(int i=0; i<nl.getLength(); i++)
			{
				Node child = nl.item(i);

				System.out.println(child);

			}
		}
    public static class VectorTest {

                String name = "class1";
                
                public String getName() throws Exception {
                        return name;
                }
                public void setName(String name) throws Exception {
                        this.name = name;
                }
                public Element_1Test() throws Exception {
                        Element child = new Element_1();
                        assertNull(name);
                        child.setName("a");
                        assertEquals("a", child.getName());
                }
                public Element_6Test newElement(int index) throws Exception {
                        Element child = new Element_6(index);
                        assertEquals(String.valueOf(index), child.getName());
                        assertEquals("1"+index, child.getAttributeValue("name"));
                        assertNull(child.getAttributeValue("a"));
                        return child;
                }
                public Element_7 newElement() throws Exception {
                        Element child = new Element_7(null);
                        assertEquals("7", child.getName());
                        assertNull(child.getAttributeValue("name"));
                        assertNull(child.getAttributeValue("a"));
                        return child;
                }
                public class Element_1 {
                        public int f( int index ) throws Exception {
                                return 0;
                        }
                        public int e(int index) throws Exception {
                                return 0;
                        }
                }
                public class Element_6 {

                        public int f( int index ) throws Exception {
                                return 0;
                        }
                        public int e(int index) throws Exception {
                                return 0;
                        }
                }
                public class Element_7 {

                        public int f( int index ) throws Exception {
                                return 0;
                        }
                        public int e(int index) throws Exception {
                                return 0;
                        }
                }
                public class Element_1Test {

                        public int f( int index ) throws Exception {
                                return 0;
                        }
                        public int e( int index ) throws Exception {
                                return 0;
                        }
                }
        }
		