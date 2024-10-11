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
	* Test data: null.
	* Expected result: 0.
	*/
	@Test
	void testDateToMilliseconds_null() {
		Date date = null;
		long result = Functions.dateToMilliseconds(date);
		assertEquals(0, result);
	}
	
	/**
	* Test case for {@link Functions#dateToMilliseconds(Date)} method.
	* Test data: a date.
	* Expected result: the date in milliseconds.
	*/
	@Test
	void testDateToMilliseconds_date() {
		Date date = new Date();
		long result = Functions.dateToMilliseconds(date);
		assertEquals(date.getTime(), result);
	}
}
```

## How to use it

### Prerequisites

* Java 8
* Maven 3

### Build

```
mvn clean install
```

### Run

```
mvn test
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.