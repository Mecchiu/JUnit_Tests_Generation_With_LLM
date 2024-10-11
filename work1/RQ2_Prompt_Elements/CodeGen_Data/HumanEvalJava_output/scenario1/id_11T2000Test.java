// StringXorTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringXor}.
* It contains one unit test case for the {@link StringXor#stringXor(String, String)} method.
*/
class StringXorTest {

	/**
	 * Tests 1 unit test case for {@link StringXor#stringXor(String, String)}.
	
	* <ol>
	* <li>The test method
	* </ol>
	*/
	@Test
    public void stringXorTest1(){
        assertEquals(3, new StringXor().stringXor("Hello, World!", "Hello, World!"));
    }
    	
/*    @Test
    public void stringXorTest2(){
        assertEquals(7, new StringXor().stringXor("Hello, World!", "Hello World!"));
    }*/
}
