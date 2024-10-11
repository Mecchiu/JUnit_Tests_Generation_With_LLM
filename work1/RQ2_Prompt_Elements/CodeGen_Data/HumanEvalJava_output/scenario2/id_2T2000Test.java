// TruncateNumberTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TruncateNumber}.
* It contains one unit test case for the {@link TruncateNumber#truncateNumber(Double)} method.
*/
class TruncateNumberTest {

	@Test
	void truncateNumber(){
    	assertEquals(1.234567, truncateNumber(1.234564567));
    	assertEquals(3 , truncateNumber(3.0));
    	assertEquals(2 , truncateNumber(2.0));
    	assertEquals( 0.1234, truncateNumber(0.1235));
    }

	@Test
	void truncateNumberExha2(){
    	Double num = 1.234564567;
    	Integer result = truncateNumber(num);
    	assertEquals(Double.valueOf(1.234567), result);
    
	}
}

// TruncateNumberTest.java