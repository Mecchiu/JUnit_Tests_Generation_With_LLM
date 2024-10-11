// MessageFormatter_3Test.java
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
* It contains one unit test case for the {@link MessageFormatter#identityToString(Object)} method.
*/
class MessageFormatter_3Test {
		
	private static final SimpleDateFormat DEFAULT_FORMATTER = new SimpleDateFormat("dd-MM-yy yyyy", Locale.US);

	// --------------------------------------------------------------- //
	//	Fields
	// --------------------------------------------------------------- //
	private static final String MSG1 = "I'm message1!";
	private static final String MSG2 = "I'm message2!";

	private static final Set<Character> CHARS_TO_CHECK = new HashSet<>();
}