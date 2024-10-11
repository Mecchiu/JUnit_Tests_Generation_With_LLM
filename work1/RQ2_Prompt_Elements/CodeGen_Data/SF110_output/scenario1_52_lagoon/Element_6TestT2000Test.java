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
@Test
		public void test_numberOfNamespaceMappings() {
			/*
			 * Test case for element number of namespace mappings.
			 */
			int case1 = 1;
			AttributesImpl attr = new AttributesImpl();
			Element element = new Element("element");
			element.setAttributeNS(NS_URI, "ns1", "name1");
			element.setAttributeNS(NS_URI, "ns2", "name2");
			element.setAttributeNS(NS_URI, "namespaces1", "http://ns1");
			element.setAttributeNS(NS_URI, "abcd14e", "name3");
			element.setNamespaceURI(NS_URI);
			NamespaceMappings mappings = new NamespaceMappings(NS_URI);
			int count1 = 0;
			for (int indexNamespaceMapping = 0;
				indexNamespaceMapping < numberOfNamespaceMappings();
				indexNamespaceMapping++
				) {
			    if (namespacePrefixes.get(indexNamespaceMapping)!= null) {
			    	count1++;
			    	assertEquals(11, indexNamespaceMapping);
			    	assertEquals("ns1", mappings.get(nsPrefixes.get(indexNamespaceMapping)));
			    	assertEquals(NS_URI, mappings.get(nsPrefixes.get(indexNamespaceMapping)));
			    	if (count1 >= case1) {break; }
			    }
			}
			assertEquals(case1, count1);
			assertFalse(element.hasChildElements());
			StringBuilder case1ElementName = new StringBuilder();
			case1ElementName.append("element");
			case1ElementName.append("element");
			Element element2 = new Element(case1ElementName.toString());
			for (int indexNsPrefix : namespacePrefixes) {
				case1ElementName.append(",");
				case1ElementName.append(indexNsPrefix);
			}
			Vector<Element> children = new Vector<>();
			case1ElementName.append("children");
			Vector<Element> children2 = new Vector<>();
			Vector<String> namespaces = new Vector<String>();
			Vector<Element> elements = new Vector<Element>();
			Vector<String> namespaces1 = new Vector<String>();
			StringBuilder sb = new StringBuilder();
			sb.append(element.toXML());
			if (element.content!=
				sb.toString()) {
			    fail("Content of the children of the element should not be different for the two case: ");
			}
			assertTrue(element.hasChildElements());
			int count2 = 0;
			for (int index = 0;
				index < (element.getChildElementCount());
				index++)
			{
				Element childElement = element.getChildElement(index);
			    case1ElementName.append(",");
			    case1ElementName.append("element " + Integer.toString(count2));
			    case1ElementName.append(": ");
			    case1ElementName.append(childElement.toXML());
				namespaces.add(childElement.getNamespaceURI());
				if (childElement instanceof Element) {
					case1ElementName.append(".");
					case1ElementName.append(((Element)childElement).toXML());
					//	case1ElementName.append(" with XML ");
					//	case1ElementName.append(((Element)childElement).toXMLWithNamespaces());
				}
				if (childElement.toXMLWithNamespaces().toString().length() > 0) {
					case1ElementName.append(".");
					case1ElementName.append(childElement.toXMLWithNamespaces());
				}
				case1ElementName.charAt(Integer.toString(count2) + 3);
				if (childElement.toXMLWithNamespaces().toString().length() > 0) {
					case1ElementName.append(".");
					case1ElementName.append(childElement.toXMLWithNamespaces());
				}
				//	if (!StringUtils.equals(case1ElementName.toString(), childElement.toXMLWithNamespaces().toString())) {
						//fail("Element namespaces is not the same for case: \"" + case1ElementName.toString() + "\" and " + childElement.toXMLWithNamespaces().toString());
				//}
				default:
					/*
					 * Default case.
					 */
					assertFalse("XML content of the children of the element should not be equal to XML with name in case: \"" + case1ElementName.toString() + "\". The case is \"" + case1ElementName.toString() + "\".", case1ElementName.toString().equals(childElement.toXMLWithNamespaces().toString()));
				}
				//	case1ElementName.append(" with namespace: \"" + childElement.getNamespaceURI() + "\".");
				if (namespaces.size() > 0 && mappings.get(namespaces.get(namespaces.size() - 1))!= null) {
					namespaces1.add(namespaces.get(namespaces.size() - 1));
				}
				for (int namespaceIndex = 0;
					namespaceIndex < namespacePrefixes.size();
					namespaceIndex++)
				{
					if (namespaces1.get(namespaceIndex)!= null) {
						namespaces1.add(namespaces.get(namespaceIndex));
					}
				}
				case1ElementName.append(" with URI: \"" + childElement.getNamespaceURI() + "\".");
				case1ElementName.append(".");
				case1ElementName.append("." + childElement.toXML());
				case1ElementName.append(".");
				case1ElementName.append("." + childElement.toXMLWithNamespaces().toString());
				case1ElementName.append(".\n\n");
				children.add(childElement);
				elements.add(element);
				namespaces.add(getNamespace(childElement));
				children2.add(childElement);
				elements2.add((Element)childElement2);
				elements2.add(childElement);
				children2.add((Element)childElement2);
				if (childElement.getAttributeNS(NS_URI, INDEX)!= null) {
					case1ElementName.append(" index: ");
					case1ElementName.append(childElement.getAttributeNS(NS_URI, INDEX));
					children2.add(childElement);
					elements2.add(childElement);
				}
				children2.add((Element)childElement2);
				if (childElement2.getAttributeNS(NS_URI, INDEX)!= null) {
					case1ElementName.append(" index: ");
					case1ElementName.append(childElement2.getAttributeNS(NS_URI, INDEX));
					children2.add(childElement2);
					elements2.add(childElement2);
				}
				if (!childElement.getAttributeValue(ATTR_NAMESPACE).equals(null)
					&&!namespaces.get(namespaces.size() - 1).equals(getNamespace(childElement)))
				{
					break;
				}
			}
			assertEquals(case1ElementName.toString(), element.toXML());
			assertEquals(case1ElementName.to