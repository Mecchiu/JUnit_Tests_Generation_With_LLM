// _FailResponse_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _FailResponse}.
* It contains one unit test case for the {@link _FailResponse#getTypeDesc()} method.
*/
class _FailResponse_1Test {
		
        private final String _value = null;
        private final java.lang.String _type = null;

         private final java.lang.String _xmlString;

        public final javax.xml.namespace.QName TYPE = new javax.xml.namespace.QName("http://tempuri.org/", "FailResponse");
        
        public _FailResponse_1Test(String _value, java.lang.String _type, String _xmlString) {
            this._value = _value;
            this._type = _type;
            this._xmlString = _xmlString;
        }
        
        @Test
        public final void testGetTypeDesc() {
           
            assertEquals(_type, TYPE.getName());
        }

        @Test
        public final void testValue() {
           assertEquals(_value, this._value);
        }

        @Test
        public final void testXmlString() {
            assertEquals(_xmlString, this._xmlString);
        }

        @Test
        public final void testGetXMLName_1() {
           assertEquals(_xmlString, this._xmlString);
        }

}