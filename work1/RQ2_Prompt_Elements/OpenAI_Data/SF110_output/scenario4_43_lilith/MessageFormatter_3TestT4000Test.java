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
* It contains ten unit test cases for the {@link MessageFormatter#identityToString(Object)} method.
*/
class MessageFormatter_3Test {

		@Test
		public void testIdentityToString() {
				assertEquals("null", MessageFormatter.identityToString(null));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString("test"));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new String("test")));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuilder("test")));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuffer("test")));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuilder("test").toString()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuffer("test").toString()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuilder("test").toString().intern()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuffer("test").toString().intern()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuilder("test").toString().intern().intern()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuffer("test").toString().intern().intern()));
		}
}

// MessageFormatter_4Test.java
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
* It contains ten unit test cases for the {@link MessageFormatter#identityToString(Object)} method.
*/
class MessageFormatter_4Test {
		
		@Test
		public void testIdentityToString() {
				assertEquals("null", MessageFormatter.identityToString(null));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString("test"));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new String("test")));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuilder("test")));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuffer("test")));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuilder("test").toString()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuffer("test").toString()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuilder("test").toString().intern()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuffer("test").toString().intern()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuilder("test").toString().intern().intern()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuffer("test").toString().intern().intern()));
		}
}

// MessageFormatter_5Test.java
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
* It contains ten unit test cases for the {@link MessageFormatter#identityToString(Object)} method.
*/
class MessageFormatter_5Test {
		
		@Test
		public void testIdentityToString() {
				assertEquals("null", MessageFormatter.identityToString(null));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString("test"));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new String("test")));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuilder("test")));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuffer("test")));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuilder("test").toString()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuffer("test").toString()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuilder("test").toString().intern()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuffer("test").toString().intern()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuilder("test").toString().intern().intern()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuffer("test").toString().intern().intern()));
		}
}

// MessageFormatter_6Test.java
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
* It contains ten unit test cases for the {@link MessageFormatter#identityToString(Object)} method.
*/
class MessageFormatter_6Test {
		
		@Test
		public void testIdentityToString() {
				assertEquals("null", MessageFormatter.identityToString(null));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString("test"));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new String("test")));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuilder("test")));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuffer("test")));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuilder("test").toString()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuffer("test").toString()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuilder("test").toString().intern()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuffer("test").toString().intern()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuilder("test").toString().intern().intern()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuffer("test").toString().intern().intern()));
		}
}

// MessageFormatter_7Test.java
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
* It contains ten unit test cases for the {@link MessageFormatter#identityToString(Object)} method.
*/
class MessageFormatter_7Test {
		
		@Test
		public void testIdentityToString() {
				assertEquals("null", MessageFormatter.identityToString(null));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString("test"));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new String("test")));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuilder("test")));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuffer("test")));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuilder("test").toString()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuffer("test").toString()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuilder("test").toString().intern()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuffer("test").toString().intern()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuilder("test").toString().intern().intern()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuffer("test").toString().intern().intern()));
		}
}

// MessageFormatter_8Test.java
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
* It contains ten unit test cases for the {@link MessageFormatter#identityToString(Object)} method.
*/
class MessageFormatter_8Test {
		
		@Test
		public void testIdentityToString() {
				assertEquals("null", MessageFormatter.identityToString(null));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString("test"));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new String("test")));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuilder("test")));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuffer("test")));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuilder("test").toString()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuffer("test").toString()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuilder("test").toString().intern()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuffer("test").toString().intern()));
				assertEquals("java.lang.String@" + Integer.toHexString("test".hashCode()), MessageFormatter.identityToString(new StringBuilder("test").toString().intern().intern()