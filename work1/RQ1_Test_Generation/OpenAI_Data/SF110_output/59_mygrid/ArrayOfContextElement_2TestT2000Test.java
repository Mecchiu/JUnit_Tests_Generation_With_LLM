// ArrayOfContextElement_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfContextElement}.
* It contains ten unit test cases for the {@link ArrayOfContextElement#getTypeDesc()} method.
*/
class ArrayOfContextElement_2Test {

	/**
	* Test case for the {@link ArrayOfContextElement#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		ArrayOfContextElement arrayOfContextElement = new ArrayOfContextElement();
		assertNotNull(arrayOfContextElement.getTypeDesc());
	}
}

// ArrayOfContextElement_3Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfContextElement}.
* It contains ten unit test cases for the {@link ArrayOfContextElement#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class ArrayOfContextElement_3Test {
		
	/**
	* Test case for the {@link ArrayOfContextElement#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	*/
	@Test
	void testGetSerializer() {
		ArrayOfContextElement arrayOfContextElement = new ArrayOfContextElement();
		assertNotNull(arrayOfContextElement.getSerializer("", null, null));
	}
}

// ArrayOfContextElement_4Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfContextElement}.
* It contains ten unit test cases for the {@link ArrayOfContextElement#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class ArrayOfContextElement_4Test {
		
	/**
	* Test case for the {@link ArrayOfContextElement#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	*/
	@Test
	void testGetDeserializer() {
		ArrayOfContextElement arrayOfContextElement = new ArrayOfContextElement();
		assertNotNull(arrayOfContextElement.getDeserializer("", null, null));
	}
}

// ArrayOfContextElement_5Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfContextElement}.
* It contains ten unit test cases for the {@link ArrayOfContextElement#equals(java.lang.Object)} method.
*/
class ArrayOfContextElement_5Test {
		
	/**
	* Test case for the {@link ArrayOfContextElement#equals(java.lang.Object)} method.
	*/
	@Test
	void testEquals() {
		ArrayOfContextElement arrayOfContextElement = new ArrayOfContextElement();
		assertTrue(arrayOfContextElement.equals(arrayOfContextElement));
	}
}

// ArrayOfContextElement_6Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfContextElement}.
* It contains ten unit test cases for the {@link ArrayOfContextElement#hashCode()} method.
*/
class ArrayOfContextElement_6Test {
		
	/**
	* Test case for the {@link ArrayOfContextElement#hashCode()} method.
	*/
	@Test
	void testHashCode() {
		ArrayOfContextElement arrayOfContextElement = new ArrayOfContextElement();
		assertNotNull(arrayOfContextElement.hashCode());
	}
}

// ArrayOfContextElement_7Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfContextElement}.
* It contains ten unit test cases for the {@link ArrayOfContextElement#getContextElement()} method.
*/
class ArrayOfContextElement_7Test {
		
	/**
	* Test case for the {@link ArrayOfContextElement#getContextElement()} method.
	*/
	@Test
	void testGetContextElement() {
		ArrayOfContextElement arrayOfContextElement = new ArrayOfContextElement();
		assertNotNull(arrayOfContextElement.getContextElement());
	}
}

// ArrayOfContextElement_8Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfContextElement}.
* It contains ten unit test cases for the {@link ArrayOfContextElement#setContextElement(mygrid.web.ContextElement[])} method.
*/
class ArrayOfContextElement_8Test {
		
	/**
	* Test case for the {@link ArrayOfContextElement#setContextElement(mygrid.web.ContextElement[])} method.
	*/
	@Test
	void testSetContextElement() {
		ArrayOfContextElement arrayOfContextElement = new ArrayOfContextElement();
		arrayOfContextElement.setContextElement(new ContextElement[] {new ContextElement()});
	}
}

// ArrayOfContextElement_9Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfContextElement}.
* It contains ten unit test cases for the {@link ArrayOfContextElement#getContextElement(int)} method.
*/
class ArrayOfContextElement_9Test {
		
	/**
	* Test case for the {@link ArrayOfContextElement#getContextElement(int)} method.
	*/
	@Test
	void testGetContextElement() {
		ArrayOfContextElement arrayOfContextElement = new ArrayOfContextElement();
		assertNotNull(arrayOfContextElement.getContextElement(0));
	}
}

// ArrayOfContextElement_10Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfContextElement}.
* It contains ten unit test cases for the {@link ArrayOfContextElement#setContextElement(int, mygrid.web.ContextElement)} method.
*/
class ArrayOfContextElement_10Test {
		
	/**
	* Test case for the {@link ArrayOfContextElement#setContextElement(int, mygrid.web.ContextElement)} method.
	*/
	@Test
	void testSetContextElement() {
		ArrayOfContextElement arrayOfContextElement = new ArrayOfContextElement();
		arrayOfContextElement.setContextElement(0, new ContextElement());
	}
}

// ContextElement.java
/**
 * ContextElement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */
package mygrid.web;

public class ContextElement implements java.io.Serializable {

    private java.lang.String name;

    private java.lang.String type;

    private java.lang.String value;

    public ContextElement() {
    }

    public ContextElement(java.lang.String name, java.lang.String type, java.lang.String value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getType() {
        return type;
    }

    public void setType(java.lang.String type) {
        this.type = type;
    }

    public