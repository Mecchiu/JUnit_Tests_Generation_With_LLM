// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64CoderTest {

	@Test
	void testEncodeString() {
		assertEquals("", Base64Coder.encodeString(""));
		assertEquals("Zg==", Base64Coder.encodeString("f"));
		assertEquals("Zm8=", Base64Coder.encodeString("fo"));
		assertEquals("Zm9v", Base64Coder.encodeString("foo"));
		assertEquals("Zm9vYg==", Base64Coder.encodeString("foob"));
		assertEquals("Zm9vYmE=", Base64Coder.encodeString("fooba"));
		assertEquals("Zm9vYmFy", Base64Coder.encodeString("foobar"));
		assertEquals("Zm9vYmFyZg==", Base64Coder.encodeString("foobarf"));
		assertEquals("Zm9vYmFyZm8=", Base64Coder.encodeString("foobarfo"));
		assertEquals("Zm9vYmFyZm9v", Base64Coder.encodeString("foobarfoo"));
	}
}

// Base64Coder.java
package com.pmdesigns.jvc.tools;

public class Base64Coder {

    /**
     * Encodes a string into Base64 format.
     * No blanks or line breaks are inserted.
     *
     * @param s a String to be encoded.
     * @return A String with the Base64 encoded data.
     */
    public static String encodeString(String s) {
        return new String(encode(s.getBytes()));
    }
}

// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64CoderTest {
		
	@Test
	void testEncodeString() {
		assertEquals("", Base64Coder.encodeString(""));
		assertEquals("Zg==", Base64Coder.encodeString("f"));
		assertEquals("Zm8=", Base64Coder.encodeString("fo"));
		assertEquals("Zm9v", Base64Coder.encodeString("foo"));
		assertEquals("Zm9vYg==", Base64Coder.encodeString("foob"));
		assertEquals("Zm9vYmE=", Base64Coder.encodeString("fooba"));
		assertEquals("Zm9vYmFy", Base64Coder.encodeString("foobar"));
		assertEquals("Zm9vYmFyZg==", Base64Coder.encodeString("foobarf"));
		assertEquals("Zm9vYmFyZm8=", Base64Coder.encodeString("foobarfo"));
		assertEquals("Zm9vYmFyZm9v", Base64Coder.encodeString("foobarfoo"));
	}
}

// Base64Coder.java
package com.pmdesigns.jvc.tools;

public class Base64Coder {

    /**
     * Encodes a string into Base64 format.
     * No blanks or line breaks are inserted.
     *
     * @param s a String to be encoded.
     * @return A String with the Base64 encoded data.
     */
    public static String encodeString(String s) {
        return new String(encode(s.getBytes()));
    }
}

// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64CoderTest {
		
	@Test
	void testEncodeString() {
		assertEquals("", Base64Coder.encodeString(""));
		assertEquals("Zg==", Base64Coder.encodeString("f"));
		assertEquals("Zm8=", Base64Coder.encodeString("fo"));
		assertEquals("Zm9v", Base64Coder.encodeString("foo"));
		assertEquals("Zm9vYg==", Base64Coder.encodeString("foob"));
		assertEquals("Zm9vYmE=", Base64Coder.encodeString("fooba"));
		assertEquals("Zm9vYmFy", Base64Coder.encodeString("foobar"));
		assertEquals("Zm9vYmFyZg==", Base64Coder.encodeString("foobarf"));
		assertEquals("Zm9vYmFyZm8=", Base64Coder.encodeString("foobarfo"));
		assertEquals("Zm9vYmFyZm9v", Base64Coder.encodeString("foobarfoo"));
	}
}

// Base64Coder.java
package com.pmdesigns.jvc.tools;

public class Base64Coder {

    /**
     * Encodes a string into Base64 format.
     * No blanks or line breaks are inserted.
     *
     * @param s a String to be encoded.
     * @return A String with the Base64 encoded data.
     */
    public static String encodeString(String s) {
        return new String(encode(s.getBytes()));
    }
}

// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64CoderTest {
		
	@Test
	void testEncodeString() {
		assertEquals("", Base64Coder.encodeString(""));
		assertEquals("Zg==", Base64Coder.encodeString("f"));
		assertEquals("Zm8=", Base64Coder.encodeString("fo"));
		assertEquals("Zm9v", Base64Coder.encodeString("foo"));
		assertEquals("Zm9vYg==", Base64Coder.encodeString("foob"));
		assertEquals("Zm9vYmE=", Base64Coder.encodeString("fooba"));
		assertEquals("Zm9vYmFy", Base64Coder.encodeString("foobar"));
		assertEquals("Zm9vYmFyZg==", Base64Coder.encodeString("foobarf"));
		assertEquals("Zm9vYmFyZm8=", Base64Coder.encodeString("foobarfo"));
		assertEquals("Zm9vYmFyZm9v", Base64Coder.encodeString("foobarfoo"));
	}
}

// Base64Coder.java
package com.pmdesigns.jvc.tools;

public class Base64Coder {

    /**
     * Encodes a string into Base64 format.
     * No blanks or line breaks are inserted.
     *
     * @param s a String to be encoded.
     * @return A String with the Base64 encoded data.
     */
    public static String encodeString(String s) {
        return new String(encode(s.getBytes()));
    }
}

// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64CoderTest {
		
	@Test
	void testEncodeString() {
		assertEquals("", Base64Coder.encodeString(""));
		assertEquals("Zg==", Base64Coder.encodeString("f"));
		assertEquals("Zm8=", Base64Coder.encodeString("fo"));
		assertEquals("Zm9v", Base64Coder.encodeString("foo"));
		assertEquals("Zm9vYg==", Base64Coder.encodeString("foob"));
		assertEquals("Zm9vYmE=", Base64Coder.encodeString("fooba"));
		assertEquals("Zm9vYmFy", Base64Coder.encodeString("foobar"));
		assertEquals("Zm9vYmFyZg==", Base64Coder.encodeString("foobarf"));
		assertEquals("Zm9vYmFyZm8=", Base64Coder.encodeString("foobarfo"));
		assertEquals("Zm9vYmFyZm9v", Base64Coder.encodeString("foobarfoo"));
	}
}

// Base64Coder.java
package com.pmdesigns.jvc.tools;

public class Base64Coder {

    /**
     * Encodes a string into Base64 format.
     * No blanks or line breaks are inserted.
     *
     * @param s a String to be encoded.
     * @return A String with the Base64 encoded data.
     */
    public static String encodeString(String s) {
        return new String(encode(s.getBytes()));
    }
}

// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64CoderTest {
		
	@Test
	void testEncodeString() {
		assertEquals("", Base64Coder.encodeString(""));
		assertEquals("Zg==", Base64Coder.encodeString("f"));
		assertEquals("Zm8=", Base64Coder.encodeString("fo"));
		assertEquals("Zm9v", Base64Coder.encodeString("foo"));
		assertEquals("Zm9vYg==", Base64Coder.encodeString("foob"));
		assertEquals("Zm9vYmE=", Base64Coder.encodeString("fooba"));
		assertEquals("Zm9vYmFy", Base64Coder.encodeString("foobar"));
		assertEquals("Zm9vYmFyZg==", Base64Coder.encodeString("foobarf"));
		assertEquals("Zm9vYmFyZm8=", Base64Coder.encodeString("foobarfo"));
		assertEquals("Zm9vYmFyZm9v", Base64Coder.encodeString("foobarfoo"));
	}
}

// Base64Coder.java
package com.pmdesigns.jvc.tools;

public class Base64Coder {

    /**
     * Encodes a string into Base64 format.
     * No blanks or line breaks are inserted.
     *
     * @param s a String to be encoded.
     * @return A String with the Base64 encoded data.
     */
    public static String encodeString(String s) {
        return new String(encode(s.getBytes()));
    }
}

// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64CoderTest {
		
	@Test
	void testEncodeString() {
		assertEquals("", Base64Coder.encodeString(""));
		assertEquals("Zg==", Base64Coder.encodeString("f"));
		assertEquals("Zm8=", Base64Coder.encodeString("fo"));
		assertEquals("Zm9v", Base64Coder.encodeString("foo"));
		assertEquals("Zm9vYg==", Base64Coder.encodeString("foob"));
		assertEquals("Zm9vYmE=", Base64Coder.encodeString("fooba"));
		assertEquals("Zm9vYmFy", Base64Coder.encodeString("foobar"));
		assertEquals("Zm9vYmFyZg==", Base64Coder.encodeString("foobarf"));
		assertEquals("Zm9vYmFyZm8=", Base64Coder.encodeString("foobarfo"));
		assertEquals("Zm9vYmFyZm9v", Base64Coder.encodeString("foobarfoo"));
	}
}

// Base64Coder.java
package com.pmdesigns.jvc.tools;

public class Base64Coder {

    /**
     * Encodes a string into Base64 format.
     * No blanks or line breaks are inserted.
     *
     * @param s a String to be encoded.
     * @return A String with the Base64 encoded data.
     */
    public static String encodeString(String s) {
        return new String(encode(s.getBytes()));
    }
}

// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64CoderTest {
		
	@Test
	void testEncodeString() {
		assertEquals("", Base64Coder.encodeString(""));
		assertEquals("Zg==", Base64Coder.encodeString("f"));
		assertEquals("Zm8=", Base64Coder.encodeString("fo"));
		assertEquals("Zm9v", Base64Coder.encodeString("foo"));
		assertEquals("Zm9vYg==", Base64Coder.encodeString("foob"));
		assertEquals("Zm9vYmE=", Base64Coder.encodeString("fooba"));
		assertEquals("Zm9vYmFy", Base64Coder.encodeString("foobar"));
		assertEquals("Zm9vYmFyZg==", Base64Coder.encodeString("foobarf"));
		assertEquals("Zm9vYmFyZm8=", Base64Coder.encodeString("foobarfo"));
		assertEquals("Zm9vYmFyZm9v", Base64Coder.encodeString("foobarfoo"));
	}
}

// Base64Coder.java