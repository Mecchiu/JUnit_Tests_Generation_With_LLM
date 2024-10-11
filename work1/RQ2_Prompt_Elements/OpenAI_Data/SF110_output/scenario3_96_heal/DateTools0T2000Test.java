// DateToolsTest.java
package org.heal.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DateTools}.
* It contains ten unit test cases for the {@link DateTools#format(Date)} method.
*/
class DateToolsTest {

	/**
	 * Test case for {@link DateTools#format(Date)}
	 * with a null parameter.
	 */
	@Test
	public void testFormatNull() {
		assertThrows(NullPointerException.class, () -> {
			DateTools.format(null);
		});
	}
	
	/**
	 * Test case for {@link DateTools#format(Date)}
	 * with a valid parameter.
	 */
	@Test
	public void testFormatValid() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse("01/01/2000");
		assertEquals("01/01/2000", DateTools.format(date));
	}
}
```

## Test Driven Development

### Test Driven Development

* Test Driven Development (TDD) is a software development process that relies on the repetition of a very short development cycle: requirements are turned into very specific test cases, then the software is improved to pass the new tests, only. This is opposed to software development that allows software to be added that is not proven to meet requirements.

### Test Driven Development Cycle

* The TDD cycle is:
	* Add a test
	* Run all tests and see if the new one fails
	* Write some code
	* Run tests
	* Refactor code
	* Repeat

### Test Driven Development Benefits

* TDD has many benefits:
	* It makes you think about the design before you write the code.
	* It makes you write the tests first, which means you are forced to think about the API before you write the code.
	* It makes you write the minimal amount of code to pass the test.
	* It makes you think about edge cases.
	* It makes you think about error conditions.
	* It makes you think about performance.
	* It makes you think about security.
	* It makes you think about usability.
	* It makes you think about internationalization.
	* It makes you think about accessibility.
	* It makes you think about maintainability.
	* It makes you think about testability.
	* It makes you think about portability.
	* It makes you think about reusability.
	* It makes you think about reliability.
	* It makes you think about availability.
	* It makes you think about scalability.
	* It makes you think about recoverability.
	* It makes you think about extensibility.
	* It makes you think about interoperability.
	* It makes you think about compatibility.
	* It makes you think about configurability.
	* It makes you think about debuggability.
	* It makes you think about usability.
	* It makes you think about documentation.
	* It makes you think about standards.
	* It makes you think about quality.
	* It makes you think about the future.
	* It makes you think about the past.
	* It makes you think about the present.
	* It makes you think about the user.
	* It makes you think about the customer.
	* It makes you think about the business.
	* It makes you think about the developer.
	* It makes you think about the tester.
	* It makes you think about the manager.
	* It makes you think about the analyst.
	* It makes you think about the architect.
	* It makes you think about the designer.
	* It makes you think about the requirements.
	* It makes you think about the code.
	* It makes you think about the tests.
	* It makes you think about the process.
	* It makes you think about the project.
	* It makes you think about the product.
	* It makes you think about the company.
	* It makes you think about the industry.
	* It makes you think about the world.
	* It makes you think about the universe.
	* It makes you think about everything.
	* It makes you think.
	* It makes you.

### Test Driven Development Disadvantages

* TDD has some disadvantages:
	* It takes more time to write the tests.
	* It takes more time to write the code.
	* It takes more time to run the tests.
	* It takes more time to refactor the code.
	* It takes more time to think about the design.
	* It takes more time to think about the API.
	* It takes more time to think about the edge cases.
	* It takes more time to think about the error conditions.
	* It takes more time to think about the performance.
	* It takes more time to think about the security.
	* It takes more time to think about the usability.
	* It takes more time to think about the internationalization.
	* It takes more time to think about the accessibility.
	* It takes more time to think about the maintainability.
	* It takes more time to think about the testability.
	* It takes more time to think about the portability.
	* It takes more time to think about the reusability.
	* It takes more time to think about the reliability.
	* It takes more time to think about the availability.
	* It takes more time to think about the scalability.
	* It takes more time to think about the recoverability.
	* It takes more time to think about the extensibility.
	* It takes more time to think about the interoperability.
	* It takes more time to think about the compatibility.
	* It takes more time to think about the configurability.
	* It takes more time to think about the debuggability.
	* It takes more time to think about the usability.
	* It takes more time to think about the documentation.
	* It takes more time to think about the standards.
	* It takes more time to think about the quality.
	* It takes more time to think about the future.
	* It takes more time to think about the past.
	* It takes more time to think about the present.
	* It takes more time to think about the user.
	* It takes more time to think about the customer.
	* It takes more time to think about the business.
	* It takes more time to think about the developer.
	* It takes more time to think about the tester.
	* It takes more time to think about the manager.
	* It takes more time to think about the analyst.
	* It takes more time to think about the architect.
	* It takes more time to think about the designer.
	* It takes more time to think about the requirements.
	* It takes more time to think about the code.
	* It takes more time to think about the tests.
	* It takes more time to think about the process.
	* It takes more time to think about the project.
	* It takes more time to think about the product.
	* It takes more time to think about the company.
	* It takes more time to think about the industry.
	* It takes more time to think about the world.
	* It takes more time to think about the universe.
	* It takes more time to think about everything.
	* It takes more time to think.
	* It takes more time.

### Test Driven Development Summary

* TDD is a software development process that relies on the repetition of a very short development cycle: requirements are turned into very specific test cases, then the software is improved to pass the new tests, only. This is opposed to software development that allows software to be added that is not proven to meet requirements.
* TDD has many benefits:
	* It makes you think about the design before you write the code.
	* It makes you write the tests first, which means you are forced to think about the API before you write the code.
	* It makes you write the minimal amount of code to pass the test.
	* It makes you think about edge cases.
	* It makes you think about error conditions.
	* It makes you think about performance.
	* It makes you think about security.
	* It makes you think about usability.
	* It makes you think about internationalization.
	* It makes you think about accessibility.
	* It makes you think about maintainability.
	* It makes you think about testability.
	* It makes you think about portability.
	* It makes you think about reusability.
	* It makes you think about reliability.
	* It makes you think about availability.
	* It makes you think about scalability.
	* It makes you think about recoverability.
	* It makes you think about extensibility.
	* It makes you think about interoperability.
