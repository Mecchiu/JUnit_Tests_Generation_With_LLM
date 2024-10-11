// ArrayOfStringTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains one unit test case for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfStringTest {
		  ArrayOfStringTest() {
		  } 

        ArrayOfStringTest(String[] testString) {
            if (testString == null) {
                throw new java.lang.IllegalArgumentException("testString can't be null");
            }
            this.string = testString;
        }
}