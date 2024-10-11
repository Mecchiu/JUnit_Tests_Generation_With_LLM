// Element_4Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeType(int)} method.
*/
class Element_4Test {
		// Class specific test case for Element_4Test
}

// Parsing_4Attributes.java

// class definition for NodeWithChildren
public class Parsing_4Attributes extends NodeWithChildren {
						// Class specific test case for Parsing_4Attributes
		//
        // Constructors
    public Parsing_4Attributes(Location loc, String data, Vector children,
                                int numElements,
                                boolean hasChildren) throws SAXException {
        super(loc, data, children, numElements, hasChildren);
    }

    // Default constructor
    public Parsing_4Attributes(int pos) {
        super(null, data, null, numElements, false);
        childIndex = pos;
    }

	  /**
   * @return whether this is a comment or comment-element.
   */
    public int getType() {
        return Element.COMMENT;
    }

    // getAttributeType
	public String getAttributeType(int index) throws IndexOutOfBoundsException {
		if (index == 0) return "CDATA";
		else if (index == 1) return "ID";
		else if (index == 2) return "IDREF";
		else if (index == 3) return "IDREFS";
		else if (index == 4) return "NMTOKEN";
		else if (index == 5) return "NMTOKENS";
		else if (index == 7) return "ENTITY";
		else if (index == 8) return "ENTITIES";
		else throw new IndexOutOfBoundsException("Cannot access attribute type");
	}

	    // hasChild
        public boolean hasChild() {
            return children!=null;
        }

        // child
	    public NodeWithChildren getChild() {
	        if (isText) return null;
	        else return new StringNodeWithChildren(name + "." + data, getData());
        }

        // isText
	public boolean isText() {
	    return true;
	}

        /**
     * setChild with new child.
     * @param child The child to be set.
     */
	public void setChild(NodeWithChildren child) {
		children = (ElementWithChildren) child;
	}

        // setName
	public void setName(Node name) {
		this.name = name;
	}

	    // setData
	public void setData(char[] data) {
		init(data, 0, data.length);
		
	}

	    // getLocation
        public Location getLocation(boolean withNamespaceDecls) {
            return new Location(getLocationString(),
                                this, -1, -1, -1, true, withNamespaceDecls);
        }

	    // getLocation
	    public Node getLocation() {
	        return this;
	    }

	     public String getLocationString() {
	        if (getName() == null) return null;
		else return getName().toString();
	    }

	    public NodeWithChildren getNamespace() {
	        return null;
	    }

        /**
     * setNamespace
	*/
	public void setNamespace(String prefix, String uri) {
	}

	    int childIndex;
	    public NodeWithChildren getChildAtIndex(int index) {
	        return null;
	    }

	    public void removeChildAtIndex(int index) {}

        // addChildAfter
	public Element addChildAfter(Node child) {
		throw new UnsupportedOperationException();
	}

	public void removeChildAfter(Node child) {
		throw new UnsupportedOperationException();
	}

	public Element addChildAtIndex(Node child, int index) {
		throw new UnsupportedOperationException();
	}

	public Vector getAttributes() {
		throw new UnsupportedOperationException();
	}

        // getElementAttributes
        public String getElementAttribute(int index) {
            return (index < 0 || index == childIndex? "" : getValue() + ",");
        }


        public void setElementAttribute(int index, String value) {
            throw new UnsupportedOperationException();
        }

        public void addAttributes(String key, String value) {
            throw new UnsupportedOperationException();
        }

        public void addAttributes(Attributes atts) {
            throw new UnsupportedOperationException();
        }

        public void removeAttribute(String key) {
            throw new UnsupportedOperationException();
        }

        public void clearAttributes() {
            throw new UnsupportedOperationException();
        }

        public void setAttributeType(String key, String value) {
            throw new UnsupportedOperationException();
        }

        public String hasAttribute(String key) {
            return null;
        }


}