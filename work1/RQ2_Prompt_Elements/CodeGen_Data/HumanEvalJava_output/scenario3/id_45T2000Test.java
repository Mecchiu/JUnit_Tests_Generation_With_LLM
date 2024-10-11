// TriangleAreaTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriangleArea}.
* It contains one unit test case for the {@link TriangleArea#triangleArea(int, int)} method.
*/
class TriangleAreaTest {

  /**
   * Test cases of {@link TriangleArea#triangleArea(int, int)} method.
   */
  @Test
  void test_triangleArea() {
    assertEquals(7.5, (Double) new TriangleArea().triangleArea(2, 2)); 
  } 	
}