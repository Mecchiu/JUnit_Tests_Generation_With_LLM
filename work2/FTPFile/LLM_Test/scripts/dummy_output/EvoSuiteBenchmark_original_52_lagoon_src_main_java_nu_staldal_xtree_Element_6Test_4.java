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
		static final String E_PREFIX = "Prefix";
		static final String E_ABS  = "abs";
		static final String E_NS   = "NS";
		static final String E_NAMESPACE = "namespace";
        static final String E_NAMESPACES = "Namespaces";
		static final String E_NS_PREFIX = "NSPrefix";
		static final String E_NS_ABS  = "NSAbs";
		static final String E_NS_NS   = "NSNS";
		static final String E_NS_NSNS = "NSNSNs";
		static final Vector V_PREFIX    = new Vector<Attribute>();
		static final Vector V_ABS  = new Vector<Attribute>();
		static final Vector V_NS   = new Vector<Attribute>();
		static final Vector V_NAMESPACE = new Vector<Attribute>();
		static final Vector V_NAMESPACES = new Vector<Attribute>();
		static final Vector V_NS_PREFIX = new Vector<Attribute>();
        static final Vector V_NS_NS = new Vector<Attribute>();
        static final Vector V_NS_NSNS = new Vector<Attribute>();
		/**
		 * Constructor test class of XTree
		 */
		@Test
		public void constructorTest() throws Exception {
			try {
				Element e = new Element("E");
				assertEquals("E", e.tagName());
				assertNull(e.getAttribute("Prefix"));
				assertNull(e.getAttribute("NS"));
				assertNull(e.getValue());
				Vector V = V_PREFIX;
				e.setAttribute("Prefix", V.elementAt(0));
				Attr a = new Attr(V.elementAt(0),"NameSpacePrefix",true);
				a.setValue("ns_prf");
				e.appendChild(a);
				assertNull(e.getAttributeNode(0));
				e.setPrefixes(V);
				a = new Attr(e,"Prefix",false);
				V_PREFIX.remove(0);
				e.appendChild(a);
				a = new Attr(V.elementAt(0),"NSPrefix",true);
				a.setValue("ns2_prf");
				e.appendChild(a);
				a = new Attr(e,"NS",false);
				V_NS.remove(0);
				e.appendChild(a);
				a = new Attr(V.elementAt(0),"Ns",false);
				V_NS.remove(0);
				e.appendChild(a);
				a = new Attr(V.elementAt(0),"NS.NS.NSNSNs.NSNSNoNoNoNSNoNoNSNoNsNSNoNoNsNoNoNoNS.NS.NS.NS.NS",false);
				a.setValue("ns3_prf");
				e.appendChild(a);
				e.getAttributes();
			} catch (Exception e) {
				throw e;
			}
		}



	/**
	 * Attribute class of XTree
	 */
		private static class Attr implements NodeAttribute, SaxSerializable {

			/**
			 * Constructor test class of Attr
			 */
			Attr(Object o) {
				super(o);
			}

			public String getName() { return "<"+tagName()+">"; }
			public Class<Object> getType() { return null; }
			public void serialize(Node n, OutputElement e, AbstractDocument d)
				throws SAXException
			{
				AttributesImpl a = new AttributesImpl();

				a.addAttribute(0,"Name",n.nodeName(),n.getPrimaryType());
				a.addAttribute(0,"NamespacePrefix",n.getAttributeNS(
					"namespace", "ns_prf"), n.getPrimaryType());
				a.addAttribute(0,"Namespace",n.getAttributeNS(
					"namespace", "ns2_prf"), n.getPrimaryType());
				a.addAttribute(0,"Ns",n.getAttributeNS(
					"namespace", "ns3_prf"), n.getPrimaryType());
				a.addAttribute(0,"NsNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNo",
					n.getPrimaryType());
				a.addAttribute(0,"NsNsNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNo",
					n.getPrimaryType());

				a.addAttribute(0,"NsNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNo",
					n.getPrimaryType());
				a.addAttribute(0,"NsNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNo",
					n.getPrimaryType());
				a.addAttribute(0,"NSNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNo",
					n.getPrimaryType());

				a.addAttribute(0,"NSNs",n.nodeNS(
					"ns_prf",V_NS_PREFIX, n.getValue(),
					"ns_prf",V_NS_NS, n.getValue(),
					"ns_ns", V_NS_NS, n.getValue(),
					"namespace",V_NAMESPACE, n.getValue(), "ns", "namespaces",n.getValue(),
					"ns.ns.nsNS.NSNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNoNo",
                                n.getPrimaryType()));
				e.setAttribute(0, a);
			}

			public NodeValue getValue() {
				return (NodeValue)(get(0));
			}

			public void setValue(Node lhs) {
				((Node)lhs).setAttr(0, (Vector)null);
			}

			public void setDefaultValue(Node lhs) {
				NodeValue v = (NodeValue)lhs;
				if (v.nodeType() == Node.TEXT_NODE)
					((NodeValue)lhs).setText(v.getNodeValue());
				else
					((NodeValue)lhs).setText(v.getAttribute("default").getNodeValue());
			}
}
}