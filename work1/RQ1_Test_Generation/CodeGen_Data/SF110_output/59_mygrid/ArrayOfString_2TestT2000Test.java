// ArrayOfString_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains one unit test case for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfString_2Test {
// ArrayOfString.java
/**
 * ArrayOfString.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */
package mygrid.web;

public class ArrayOfString implements java.io.Serializable {

    private java.lang.String[] string;

    public ArrayOfString() {
    }

    public java.lang.String[] getString() {
        return string;
    }

    public void setString(java.lang.String[] string) {
        this.string = string;
    }

    public java.lang.String getString(int i) {
        return string[i];
    }

    public void setString(int i, java.lang.String value) {
        this.string[i] = value;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArrayOfString))
            return false;
        ArrayOfString other = (ArrayOfString) obj;
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (__equalsCalc!= null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && ((this.string == null && other.getString() == null) || (this.string!= null && java.util.Arrays.equals(this.string, other.getString())));
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
        if (getString()!= null) {
            for (int i = 0; i < java.lang.reflect.Array.getLength(getString()); i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getString(), i);
                if (obj!= null &&!obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(ArrayOfString.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("string");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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

// ArrayOfString_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains one unit test case for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfString_2Test {
		
	private ArrayOfString objectUnderTest;
	
	
	/**
	* Test of getTypeDesc method, of class ArrayOfString.
	*/
	@Test
    public void testGetTypeDesc() {
        // TODO Auto-generated method stub
        assertNotNull("The test fails!!!",objectUnderTest.getTypeDesc());
    }

	/**
	* Test of clone method, of class ArrayOfString.
	*/
	@Test
    public void testClone() throws java.lang.Throwable {
        objectUnderTest = new ArrayOfString();
		ArrayOfString _clone = null;
        try {
            _clone = (ArrayOfString) objectUnderTest.clone();
        }
        catch (java.lang.CloneNotSupportedException e) {
            e.printStackTrace();
        }
        assertNotNull(
            "Clone of ArrayOfString must not throws exception, since it is not supposed to have thrown",
            _clone
                        );
    }

	/**
	* Test of isNull method, of class ArrayOfString.
	*/
	@Test
    public void testIsNull() throws java.lang.Throwable {
        // TODO Auto-generated method stub
        assertNotNull(
    "The test fails!!!",objectUnderTest.isNull());
    }

	/**
	* Test of getStringValue method, of class ArrayOfString.
	*/
	@Test
    public void testGetStringValue() throws java.lang.Throwable {
        // TODO Auto-generated method stub
        ArrayOfString _getString = new ArrayOfString();
        _getString.setString(java.lang.String.class.getName());
        assertNotNull(
            "The test fails!!!",_getString.getString() );
    }

	/**
	* Test of setString method, of class ArrayOfString.
	*/
	@Test
    public void testSetString() throws java.lang.Throwable {
        // TODO Auto-generated method stub
        Object objectUnderTest = new ArrayOfString();
        objectUnderTest.setString("test");
        ArrayOfString _getString = new ArrayOfString();
        ArrayOfString valueRetval = _getString.setString(value);
        assertNotNull(
            "The test fails!!!",valueRetval.getString() );
    }

	/**
	* Test of addString method, of class ArrayOfString.
	*/
	@Test
    public void testAddString() throws java.lang.Throwable {
        // TODO Auto-generated method stub
        ArrayOfString _getString = new ArrayOfString();
        _getString.setString(value);
        objectUnderTest.addString(_getString);
        ArrayOfString _getString2 = new ArrayOfString();
        _getString2.setString(value);
        objectUnderTest.addString(_getString2);
        ArrayOfString _getString3 = new ArrayOfString();
        _getString3.setString(value);
        objectUnderTest.addString(_getString3);
        ArrayOfString _getString4 = new ArrayOfString();
        _getString4.setString(value);
        objectUnderTest.addString(_getString4);
        ArrayOfString _getString5 = new ArrayOfString();
        _getString5.setString(value);
        objectUnderTest.addString(_getString5);
        ArrayOfString _getString6 = new ArrayOfString();
        _getString6.setString(value);
        objectUnderTest.addString(_getString6);
        ArrayOfString _getString7 = new ArrayOfString();
        _getString7.setString(value);
        objectUnderTest.addString(_getString7);
        ArrayOfString _getString8