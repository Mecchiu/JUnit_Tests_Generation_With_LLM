// ArrayOfStringTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains one unit test case for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfStringTest {
		      
    private String[] string;

   
    /**
     * setter for string
     */
    public void setString(java.lang.String[] string) {
        this.string=string;
    }

     
    /**
     * 
     * @return the string
     */
    public java.lang.String[] getString() {
        return string;
    }


                /**
                     * @param string
                     */
                public void setString(java.lang.String string) {
        this.string=string;
     }


     
    /**
     * Method getTypeDesc.
     * 
     * @return the typeDesc
     */
    public org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

                private org.apache.axis.description.TypeDesc typeDesc = null;

            public org.apache.axis.description.TypeDesc getTypeDesc() {
                return typeDesc;
            }

            /**
             * Get Custom Serializer
             */
            public org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
                return org.apache.axis.encoding.ser.BeanSerializerFactory.getSerializer(
                    java.lang.Class.forName(_javaType),_xmlType);
            }

            /**
             * Get Custom Deserializer
             */
            public org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
                return org.apache.axis.encoding.DeserializerFactory.getDeserializer(
                    java.lang.Class.forName(_javaType), _xmlType);
            }
}