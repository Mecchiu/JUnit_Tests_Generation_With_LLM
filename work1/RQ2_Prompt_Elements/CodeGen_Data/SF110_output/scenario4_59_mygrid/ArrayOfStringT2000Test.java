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
    public void test0(){
        ArrayOfString arrayOfString = new ArrayOfString();
		
            assertNull(arrayOfString.getString());
    }

}
