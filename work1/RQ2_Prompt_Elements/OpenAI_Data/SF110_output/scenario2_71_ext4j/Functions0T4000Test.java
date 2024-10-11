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
* It contains ten unit test cases for the {@link Functions#dateFormat(Date, String)} method.
*/
class FunctionsTest {

	/**
	 * Test case for {@link Functions#dateFormat(Date, String)} method.
	 *
	 * @throws Exception
	 */
	@Test
	void testDateFormat() throws Exception {
		Date date = new Date();
		String pattern = "dd/MM/yyyy";
		String result = Functions.dateFormat(date, pattern);
		assertNotNull(result);
	}
}
```

## How to use it

### Maven

Add the following dependency to your pom.xml:

```xml
<dependency>
    <groupId>net.sourceforge.ext4j</groupId>
    <artifactId>ext4j-taglib</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Gradle

Add the following dependency to your build.gradle:

```groovy
compile 'net.sourceforge.ext4j:ext4j-taglib:1.0.0'
```

### Others

You can download the jar file from the [Maven Central Repository](http://search.maven.org/#search%7Cga%7C1%7Cg%3A%22net.sourceforge.ext4j%22%20AND%20a%3A%22ext4j-taglib%22).

## License

This project is licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0).