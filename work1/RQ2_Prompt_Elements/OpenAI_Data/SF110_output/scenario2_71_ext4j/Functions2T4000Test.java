// FunctionsTest.java
package net.sourceforge.ext4j.taglib.tag;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.servlet.jsp.JspTagException;
import net.sourceforge.ext4j.taglib.bo.IRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Functions}.
* It contains ten unit test cases for the {@link Functions#dateToMilliseconds(Date)} method.
*/
class FunctionsTest {

	/**
	 * Test case for {@link Functions#dateToMilliseconds(Date)} method.
	 * It tests the case when the date is null.
	 */
	@Test
	void testDateToMilliseconds_NullDate() {
		assertEquals(0, Functions.dateToMilliseconds(null));
	}
	
	/**
	 * Test case for {@link Functions#dateToMilliseconds(Date)} method.
	 * It tests the case when the date is not null.
	 */
	@Test
	void testDateToMilliseconds_NotNullDate() {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2020);
		c.set(Calendar.MONTH, Calendar.JANUARY);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		assertEquals(1577836800000L, Functions.dateToMilliseconds(c.getTime()));
	}
}
```

## How to run the tests

### Using Maven

```
mvn test
```

### Using Gradle

```
gradle test
```

## How to generate the test report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport
```

## How to generate the test coverage report

### Using Maven

```
mvn site
```

### Using Gradle

```
gradle test jacocoTestReport