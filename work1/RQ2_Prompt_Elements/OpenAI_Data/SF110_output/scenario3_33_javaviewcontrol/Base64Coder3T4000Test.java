// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decodeString(String)} method.
*/
class Base64CoderTest {

	@Test
	void testDecodeString() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
}

// Base64Coder.java
package com.pmdesigns.jvc.tools;

public class Base64Coder {

    /**
     * Decodes a string from Base64 format.
     *
     * @param s a Base64 String to be decoded.
     * @return A String containing the decoded data.
     * @throws IllegalArgumentException if the input is not valid Base64 encoded data.
     */
    public static String decodeString(String s) {
        return new String(decode(s));
    }
}

// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decodeString(String)} method.
*/
class Base64CoderTest {
		
	@Test
	void testDecodeString() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString1() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString2() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString3() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString4() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString5() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString6() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString7() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString8() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString9() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
}

// Base64Coder.java
package com.pmdesigns.jvc.tools;

public class Base64Coder {

    /**
     * Decodes a string from Base64 format.
     *
     * @param s a Base64 String to be decoded.
     * @return A String containing the decoded data.
     * @throws IllegalArgumentException if the input is not valid Base64 encoded data.
     */
    public static String decodeString(String s) {
        return new String(decode(s));
    }
    
    /**
     * Decodes a byte array from Base64 format.
     *
     * @param s a Base64 String to be decoded.
     * @return An array containing the decoded data bytes.
     * @throws IllegalArgumentException if the input is not valid Base64 encoded data.
     */
    public static byte[] decode(String s);
}

// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decodeString(String)} method.
*/
class Base64CoderTest {
		
	@Test
	void testDecodeString() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString1() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString2() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString3() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString4() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString5() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString6() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString7() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString8() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString9() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
}

// Base64Coder.java
package com.pmdesigns.jvc.tools;

public class Base64Coder {

    /**
     * Decodes a string from Base64 format.
     *
     * @param s a Base64 String to be decoded.
     * @return A String containing the decoded data.
     * @throws IllegalArgumentException if the input is not valid Base64 encoded data.
     */
    public static String decodeString(String s) {
        return new String(decode(s));
    }
    
    /**
     * Decodes a byte array from Base64 format.
     *
     * @param s a Base64 String to be decoded.
     * @return An array containing the decoded data bytes.
     * @throws IllegalArgumentException if the input is not valid Base64 encoded data.
     */
    public static byte[] decode(String s) {
        return decode(s.toCharArray());
    }
}

// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decodeString(String)} method.
*/
class Base64CoderTest {
		
	@Test
	void testDecodeString() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString1() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString2() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString3() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString4() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString5() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString6() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString7() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString8() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString9() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
}

// Base64Coder.java
package com.pmdesigns.jvc.tools;

public class Base64Coder {

    /**
     * Decodes a string from Base64 format.
     *
     * @param s a Base64 String to be decoded.
     * @return A String containing the decoded data.
     * @throws IllegalArgumentException if the input is not valid Base64 encoded data.
     */
    public static String decodeString(String s) {
        return new String(decode(s));
    }
    
    /**
     * Decodes a byte array from Base64 format.
     *
     * @param s a Base64 String to be decoded.
     * @return An array containing the decoded data bytes.
     * @throws IllegalArgumentException if the input is not valid Base64 encoded data.
     */
    public static byte[] decode(String s) {
        return decode(s.toCharArray());
    }
    
    /**
     * Decodes a byte array from Base64 format.
     * No blanks or line breaks are allowed within the Base64 encoded data.
     *
     * @param in a character array containing the Base64 encoded data.
     * @return An array containing the decoded data bytes.
     * @throws IllegalArgumentException if the input is not valid Base64 encoded data.
     */
    public static byte[] decode(char[] in);
}

// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decodeString(String)} method.
*/
class Base64CoderTest {
		
	@Test
	void testDecodeString() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString1() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString2() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString3() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString4() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString5() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString6() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString7() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString8() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
	
	@Test
	void testDecodeString9() {
		String s = "";
		String expected = "";
		String actual = Base64Coder.decodeString(s);
		assertEquals(expected, actual);
	}
}

// Base64Coder.java
package com.pmdesigns.jvc.tools;

public class Base64Coder {

    /**
     * Decodes a string from Base64 format.
     *
     * @param s a Base64 String to be decoded.
     * @return A String containing