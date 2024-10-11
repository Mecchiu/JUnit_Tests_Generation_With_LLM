// ArrayOfString_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains one unit test case for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfString_2Test {
		
	@Test
    public void getTypeDescTest(){
            ArrayOfString arrayOfString = new ArrayOfString();
            assertEquals(arrayOfString.getTypeDesc(), ArrayOfString.class.getCanonicalName());
    }

}