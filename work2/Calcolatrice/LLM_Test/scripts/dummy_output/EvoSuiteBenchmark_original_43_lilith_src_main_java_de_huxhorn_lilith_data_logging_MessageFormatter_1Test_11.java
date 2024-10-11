// MessageFormatter_1Test.java
package de.huxhorn.lilith.data.logging;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MessageFormatter}.
* It contains one unit test case for the {@link MessageFormatter#countArgumentPlaceholders(String)} method.
*/
class MessageFormatter_1Test {
		
  @Test
    void test_countArgumentPlaceholders( ) throws Exception
	{
		final String messagePattern = "The \"%\" is '%' in '${args:%1}'.";
		
		final int result = countArgumentPlaceholders( messagePattern );
		assertEquals( 1, result );
	}

}