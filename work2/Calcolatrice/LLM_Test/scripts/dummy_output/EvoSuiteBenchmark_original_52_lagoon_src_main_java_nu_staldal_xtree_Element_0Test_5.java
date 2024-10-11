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
		private final int index;
	
		/**
		* Default constructor.
		*/
	public Element_0Test(){
	index = 0;
	}

		/**
		 * Tries to find a unique index of an attribute. If a given attribute is not on this element,
		 * then a {@link NoSuchElementException} will be throwed.
		 * @param namespaceURI the namespace URI, may be the empty string
		 * @param localName the name
		 * @return the index of the attribute, or -1 if this element has no attribute with this name
		 * @throws NoSuchElementException if no unique attribute is found
		 */
	public int lookupAttribute(String namespaceURI, String localName){
		Element e = getParentElement();
		for(int i = 0; i < e.getNumAttributes(); i++){
			if(e.lookupAttribute(namespaceURI, localName) == index){
				index = e.lookupAttribute(namespaceURI, localName);
				return i;
			}
		}
		throw new NoSuchElementException("The attribute "+localName+" is not in this element");
	}

}