// MeanAbsoluteDeviationTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MeanAbsoluteDeviation}.
* It contains one unit test case for the {@link MeanAbsoluteDeviation#meanAbsoluteDeviation(List)} method.
*/
class MeanAbsoluteDeviationTest {

  /**
  * Test of getMeanAbsoluteDeviation method, of class MeanAbsoluteDeviation.
*/
  @Test
  void getMeanAbsoluteDeviationCorrectAnswerExpection() {
      assertEquals("correct answer",meanAbsoluteDeviation(-2.3, 1.3), meanAbsoluteDeviation((Double) null));
  }
  public void testGetMeanAbsoluteDeviation_listOfEmptyInputs() {
    
    
    assertEquals("List of 0 input value",0.0, meanAbsoluteDeviation(List.of()), 1.0e-10);
  }
  public void testGetMeanAbsoluteDeviation_listOfSmallInputsNoElement() {
    
    
    assertEquals("List of 0 input value",0.0, meanAbsoluteDeviation(List.of(0.0)), 1.0e-10);
  }
	
	public void testGetMeanAbsoluteDeviation_listOfSmallInputsSmallerThanOne() {
		
		List<Double> list = List.of(0.0, 0.1);
		
		assertEquals("List of 0 input value",0.0, meanAbsoluteDeviation(list), 1.0e-10);
		
	}
	
	public void testGetMeanAbsoluteDeviation_listOfSmallInputsBiggerThanOne() {
		
		List<Double> list = List.of(0.1, 0.2);
		
		assertEquals("List of 0 input value",0.0, meanAbsoluteDeviation(list), 1.0e-10);

}
}
