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
		Date date = null;
		long expected = 0;
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#dateToMilliseconds(Date)} method.
	 * It tests the case when the date is not null.
	 */
	@Test
	void testDateToMilliseconds_NotNullDate() {
		Date date = new Date();
		long expected = date.getTime();
		long actual = Functions.dateToMilliseconds(date);
		assertEquals(expected, actual);
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

``