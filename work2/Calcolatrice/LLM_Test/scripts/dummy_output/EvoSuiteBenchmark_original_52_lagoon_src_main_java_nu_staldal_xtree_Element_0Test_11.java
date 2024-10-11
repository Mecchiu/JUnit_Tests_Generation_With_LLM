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
		
	/**
	 * Constructor to create the new {@link Element_0Test} instance.
	 * @param tag the tag name
	 * @param content the tag's content
	 */
	public Element_0Test(String tag, String content) {
			this.tag = tag;
			this.content = content;
	}
	/**
	 * Get the xml tag name.
	 * @return the tag name
	 */  
	public String getTag() {
			return tag;
	}
	/**
	 * Get the content of the tag.
	 * @return the content of the tag.
	 */  
	public String getContent() {
			return content;
	}	  
  private final String	tag;
  private final String	content;

  /*
   * Constructor. 
   * @see #Element(String, String)
   * @see #Element(String, String, String)
   */
  Element_0Test(String tag) {
		 this(tag, "");
	}
  Element_0Test(String tag, String content) {
		 this.tag = tag;
		 this.content = content;
	}
	/*
	 * Constructor. 
	 * @see #Element(String)
	 */
  Element_0Test(String tag, Vector v) {
		super();
		this.tag = tag;
		this.content = null;
		this.children = v;
	}
	/**
	 * Set the content of the element.
	 * @param content the content of the tag.
	 */
	public void setContent(String content) {
		this.content = content;
	}
  /**
	 * Get the content of this xml tag.
	 * @return the content.
	 */  
	public String getContent() {
		return content;
	}	  
  private Vector children = new Vector();

  /**
   * Add another element child to this one.
   * @param c the element child.
   */
  public void addChild(Node c) {
  	children.addElement(c);
  }

  /**
   * Lookup the index of an attribute to this element.  
   * @param namespaceURI the namespace URI, may be the empty string
   * @param localName the name
   * @return the index of the attribute, or -1 if no such attribute exists
   */
  public int lookupAttribute(String namespaceURI, String localName);
	/**
	 * This method calls {@link Node#update} on this object and its children.
	 */
   public void update();
	/**
	 * This method calls {@link Node#read} on the child element node.
	 */
   public String read();
	/**
	 * This method calls {@link Node#readAll} on the child element node.
	 * @return the XML Content.
	 */
   public String readAll();
	/**
	 * This method calls {@link Node#setContent} on the child element node.
	 * @param content the XML Content.
	 */
   public void setContentTagValue(String content);


    public static Test suite() {
        final Test suite = new TestSuite();
        
        suite.addTestSuite(Element_0_Test.class);
        
        
        return suite;
    }
	   protected Class<? extends org.xml.sax.ContentHandler> contentHandlerClass = null;
	   protected Class<? extends org.xml.sax.ErrorHandler> errorHandlerClass = null;
	   
	// Element_1Test.java
	/**
	 * Get the class of the content handler to be used by methods in the {@link #contentHandlerClass}.
	 * @return The class of the content handler.
	 */
	protected Class<? extends org.xml.sax.ContentHandler> getContentHandlerClass() {
		return contentHandlerClass;
	}

	// Element_2Test.java
	/**
	 * Get the class of the error handler to be used by methods in the {@link #errorHandlerClass}.
	 * @return The error handler class.
	 */
	protected Class<? extends org.xml.sax.ErrorHandler> getErrorHandlerClass() {
		return errorHandlerClass;
	}

}