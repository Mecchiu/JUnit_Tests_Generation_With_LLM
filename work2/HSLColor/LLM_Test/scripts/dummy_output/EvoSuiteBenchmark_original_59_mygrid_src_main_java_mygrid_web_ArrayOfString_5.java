// ArrayOfStringTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains one unit test case for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfStringTest {
		
    @Test
    public void testGetTypeDesc() {
        ArrayOfString obj = new ArrayOfString();
        String[] str = {"str1", "str2"};
        obj.setString((java.lang.String[]) str);
        typeDesc = obj.getTypeDesc();
        assertEquals(java.lang.Object.class, typeDesc.toString());
    }
    
}