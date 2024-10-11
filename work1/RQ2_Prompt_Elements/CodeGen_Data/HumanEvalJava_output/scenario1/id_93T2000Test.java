// EncodeTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encode}.
* It contains one unit test case for the {@link Encode#encode(String)} method.
*/
class EncodeTest {

    /**
     * Test case for {@link Encode#encode(String)}.
     * It defines one test case for the {@link Encode#encode(String)} method.
     * @throws Exception is thrown in case of any errors.
     */
    @Test
    public void testEncode() throws Exception {
        // test case 1
        String original = "this is a test, I didn't use the standard for it. "
        + "Please refer to the following page:";
        String expected = "this is a test, I didn't use the standard for it. ";
        assertEquals(expected,Encode.encode(original));
        
        // test case 2
        original = "this is a test, I didn't use the standard for it. "
        + "Please refer to the following page:";
        expected = "this is a test, I didn't use the standard for it. ";
        assertEquals(expected,Encode.encode(original));
        
        // test case 3
        original = "THIS IS A TEST, IS NOT USED FOR IT. "
        + "Please refer to the following page:";
        expected = "THIS IS A TEST, IS NOT USED FOR IT. ";
        assertEquals(expected,Encode.encode(original));
        
        // test case 4
        original = "THIS IS A TEST, IS USED FOR IT. "
        + "Please refer to the following page:";
        expected = "THIS IS A TEST, IS USED FOR IT. ";
        assertEquals(expected,Encode.encode(original));
        
        // test case 5
        original = " THIS IS A TEST,";
        expected = "THIS IS A TEST,";
        assertEquals(expected,Encode.encode(original));
    }
	
}
