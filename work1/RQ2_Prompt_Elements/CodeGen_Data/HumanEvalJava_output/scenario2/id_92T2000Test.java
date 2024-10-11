// AnyIntTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AnyInt}.
* It contains one unit test case for the {@link AnyInt#anyInt(Number, Number, Number)} method.
*/
class AnyIntTest {
 
  /**
    * Test for {@link AnyInt#anyInt(Number, Number, Number)}.
    * This method should be implemented in test cases file.
    */
    @Test
    void anyInt_1() {
        assertEquals("", 0, ((Integer) new Integer(0) ).intValue() );
  }

}