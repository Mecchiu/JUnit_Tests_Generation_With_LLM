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

    public java.lang.String getValue() {
        return value;
    }

    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContextElement))
            return false;
        ContextElement other = (ContextElement) obj;
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && ((this.name == null && other.getName() == null) || (this.name != null && this.name.equals(other.getName()))) && ((this.type == null && other.getType() == null) || (this.type != null && this.type.equals(other.getType()))) && ((this.value == null && other.getValue() == null) || (this.value != null && this.value.equals(other.getValue())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(ContextElement.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ContextElement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType, _xmlType, typeDesc);
    }
}

// ContextElement_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains ten unit test cases for the {@link ContextElement#getTypeDesc()} method.
*/
class ContextElement_2Test {
		
	/**
	* Test case for the {@link ContextElement#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		ContextElement contextElement = new ContextElement();
		assertNotNull(contextElement.getTypeDesc());
	}
}

// ContextElement_3Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*

/**
* Test class of {@link ContextElement}.
* It contains ten unit test cases for the {@link ContextElement#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class ContextElement_3Test {
		
	/**
	* Test case for the {@link ContextElement#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	*/
	@Test
	void testGetSerializer() {
		ContextElement contextElement = new ContextElement();
		assertNotNull(contextElement.getSerializer("", null, null));
	}
}

// ContextElement_4Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*

/**
* Test class of {@link ContextElement}.
* It contains ten unit test cases for the {@link ContextElement#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class ContextElement_4Test {
		
	/**
	* Test case for the {@link ContextElement#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	*/
	@Test
	void testGetDeserializer() {
		ContextElement contextElement = new ContextElement();
		assertNotNull(contextElement.getDeserializer("", null, null));
	}
}

// ContextElement_5Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*

/**
* Test class of {@link ContextElement}.
* It contains ten unit test cases for the {@link ContextElement#equals(java.lang.Object)} method.
*/
class ContextElement_5Test {
		
	/**
	* Test case for the {@link ContextElement#equals(java.lang.Object)} method.
	*/
	