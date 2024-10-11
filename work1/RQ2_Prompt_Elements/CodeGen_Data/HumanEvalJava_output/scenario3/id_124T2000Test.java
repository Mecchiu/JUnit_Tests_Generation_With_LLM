// ValidDateTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ValidDate}.
* It contains one unit test case for the {@link ValidDate#validDate(String)} method.
*/
class ValidDateTest {

	@Test
    public void whenValidDateStringIsExistsThenItIsValidated() {
		assertTrue("The value is not equal to an empty string",
                        ValidDate.validDate(""));
	}
	
	@Test
  public void whenValidDateStringIsNotExistsThenItIsNotValidated() {
		assertFalse("The value is equal to an empty string",
                        ValidDate.validDate(""));
	}
}
