// Functions_1Test.java
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
* It contains ten unit test cases for the {@link Functions#addS(String)} method.
*/
class Functions_1Test {

	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the input string is null.
	 */
	@Test
	void testAddS_1() {
		String input = null;
		String expected = null;
		String actual = Functions.addS(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the input string is empty.
	 */
	@Test
	void testAddS_2() {
		String input = "";
		String expected = "";
		String actual = Functions.addS(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testAddS_3() {
		String input = "a";
		String expected = "a's";
		String actual = Functions.addS(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testAddS_4() {
		String input = "A";
		String expected = "A's";
		String actual = Functions.addS(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testAddS_5() {
		String input = "z";
		String expected = "z's";
		String actual = Functions.addS(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testAddS_6() {
		String input = "Z";
		String expected = "Z's";
		String actual = Functions.addS(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testAddS_7() {
		String input = "0";
		String expected = "0's";
		String actual = Functions.addS(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testAddS_8() {
		String input = "9";
		String expected = "9's";
		String actual = Functions.addS(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testAddS_9() {
		String input = "James";
		String expected = "James'";
		String actual = Functions.addS(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#addS(String)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testAddS_10() {
		String input = "Daniel";
		String expected = "Daniel's";
		String actual = Functions.addS(input);
		assertEquals(expected, actual);
	}
}

// Functions_2Test.java
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
* It contains ten unit test cases for the {@link Functions#capFirstLetters(String)} method.
*/
class Functions_2Test {
		
	/**
	 * Test case for {@link Functions#capFirstLetters(String)} method.
	 * It tests the case when the input string is null.
	 */
	@Test
	void testCapFirstLetters_1() {
		String input = null;
		String expected = null;
		String actual = Functions.capFirstLetters(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#capFirstLetters(String)} method.
	 * It tests the case when the input string is empty.
	 */
	@Test
	void testCapFirstLetters_2() {
		String input = "";
		String expected = "";
		String actual = Functions.capFirstLetters(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#capFirstLetters(String)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testCapFirstLetters_3() {
		String input = "a";
		String expected = "A";
		String actual = Functions.capFirstLetters(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#capFirstLetters(String)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testCapFirstLetters_4() {
		String input = "A";
		String expected = "A";
		String actual = Functions.capFirstLetters(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#capFirstLetters(String)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testCapFirstLetters_5() {
		String input = "z";
		String expected = "Z";
		String actual = Functions.capFirstLetters(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#capFirstLetters(String)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testCapFirstLetters_6() {
		String input = "Z";
		String expected = "Z";
		String actual = Functions.capFirstLetters(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#capFirstLetters(String)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testCapFirstLetters_7() {
		String input = "0";
		String expected = "0";
		String actual = Functions.capFirstLetters(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#capFirstLetters(String)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testCapFirstLetters_8() {
		String input = "9";
		String expected = "9";
		String actual = Functions.capFirstLetters(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#capFirstLetters(String)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testCapFirstLetters_9() {
		String input = "James";
		String expected = "James";
		String actual = Functions.capFirstLetters(input);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#capFirstLetters(String)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testCapFirstLetters_10() {
		String input = "Daniel";
		String expected = "Daniel";
		String actual = Functions.capFirstLetters(input);
		assertEquals(expected, actual);
	}
}

// Functions_3Test.java
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
* It contains ten unit test cases for the {@link Functions#cutWordCR(String, int)} method.
*/
class Functions_3Test {
		
	/**
	 * Test case for {@link Functions#cutWordCR(String, int)} method.
	 * It tests the case when the input string is null.
	 */
	@Test
	void testCutWordCR_1() {
		String input = null;
		int maxLength = 0;
		String expected = null;
		String actual = Functions.cutWordCR(input, maxLength);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#cutWordCR(String, int)} method.
	 * It tests the case when the input string is empty.
	 */
	@Test
	void testCutWordCR_2() {
		String input = "";
		int maxLength = 0;
		String expected = "";
		String actual = Functions.cutWordCR(input, maxLength);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#cutWordCR(String, int)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testCutWordCR_3() {
		String input = "a";
		int maxLength = 0;
		String expected = "a";
		String actual = Functions.cutWordCR(input, maxLength);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#cutWordCR(String, int)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testCutWordCR_4() {
		String input = "A";
		int maxLength = 0;
		String expected = "A";
		String actual = Functions.cutWordCR(input, maxLength);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#cutWordCR(String, int)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testCutWordCR_5() {
		String input = "z";
		int maxLength = 0;
		String expected = "z";
		String actual = Functions.cutWordCR(input, maxLength);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#cutWordCR(String, int)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testCutWordCR_6() {
		String input = "Z";
		int maxLength = 0;
		String expected = "Z";
		String actual = Functions.cutWordCR(input, maxLength);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#cutWordCR(String, int)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testCutWordCR_7() {
		String input = "0";
		int maxLength = 0;
		String expected = "0";
		String actual = Functions.cutWordCR(input, maxLength);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#cutWordCR(String, int)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testCutWordCR_8() {
		String input = "9";
		int maxLength = 0;
		String expected = "9";
		String actual = Functions.cutWordCR(input, maxLength);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#cutWordCR(String, int)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testCutWordCR_9() {
		String input = "James";
		int maxLength = 0;
		String expected = "James";
		String actual = Functions.cutWordCR(input, maxLength);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link Functions#cutWordCR(String, int)} method.
	 * It tests the case when the input string is a single character.
	 */
	@Test
	void testCutWordCR_10() {
		String input = "Daniel";
		int maxLength = 0;
		String expected = "Daniel";
		String actual = Functions.cutWordCR(input, maxLength);
		assertEquals(expected, actual);
	}
}

// Functions_4Test.java
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
* It contains ten unit test cases for the {@link Functions#cutWordCRText(String, int)} method.
*/
class Functions_4Test {
		
	/**
	 * Test case for {@link Functions#cutWordCRText(String, int)} method.
	 * It tests the case when the input string is null.
	 */
	@Test
	void testCutWordCRText_1() {
		String input = null;
		int maxLength = 0;
		String expected = null;
		String actual = Functions.cutWordCRText(input, maxLength);
		assert