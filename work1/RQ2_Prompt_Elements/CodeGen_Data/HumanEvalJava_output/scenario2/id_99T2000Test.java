// ClosestIntegerTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClosestInteger}.
* It contains one unit test case for the {@link ClosestInteger#closestInteger(String)} method.
*/
class ClosestIntegerTest {

  @Test
  public void closest() {
    assertEquals(ClosestInteger.closestInteger("-14.5"), ClosestInteger.closestInteger("10"));
    assertEquals(ClosestInteger.closestInteger("-14.5"), ClosestInteger.closestInteger("14.5"));
    assertEquals(ClosestInteger.closestInteger("-14.5"), ClosestInteger.closestInteger("-14.5"));
		assertTrue(ClosestInteger.closestInteger("+14.5").equals(ClosestInteger.closestInteger("+14.5")));
		assertTrue(ClosestInteger.closestInteger("+14.5").equals(ClosestInteger.closestInteger("+14")));
  }
}
//ClosestIntegerTest.java