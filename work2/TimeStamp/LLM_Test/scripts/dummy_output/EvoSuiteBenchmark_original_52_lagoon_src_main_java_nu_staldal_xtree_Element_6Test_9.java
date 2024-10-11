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
		static final String name[] = {
				"", 
				">" 
		};
		static final String content[] = {
				">",
				"<a>1<b1>2<b2>3</b2></b1>4</a>"
		};
		static final String name2[] = {
				">",
				"<a>2<b1>1</b1>3</b1>4</a>"
		};
	static final String docNS[] = {
		"<!DOCTYPE test [ "+"content+']>',
        "<test test=\"content\" ns=\"http://www.staldal.org\"><a>1<b1>2<b2>3</b2></b1>4</a></test>"
	};	
		public Element_6Test(Tree tree) {
					addNamespaces(tree, docNS);
			}
		public Elem get(int i) {
					return new Element(name[i], new DummyNode("content["+i+"]"), this);
				}
	public Elem get2(int i) {
					return new Element(name2[i], new DummyNode("content["+i+"]"), this);
				}
	public static void addNamespaces(Tree tree, String[] ns) {
				for (int i=0; i<ns.length; i++){
					tree.setNamespaceNameSpace(ns[i],
							tree.getRootElement().getNamespace()
							);
					}
			}
	boolean isTest(Elem elem) {
		return "test".equals(elem.getLocalName());
			}
			public class DummyNode extends Node{
			Elem myElem;
				public DummyNode(String str) {
						myElem = new Element(str, this);
				}
				public void setText(String name, String text){
						Elem e = new Element(name, this);
						e.setText(text);
				}
			public DummyNode(URL url) throws Exception{
					set(0,new Elem(url.getFile(), this));
				}
		}
public Element_6Test() {
	}
}
// Element_7Test.java