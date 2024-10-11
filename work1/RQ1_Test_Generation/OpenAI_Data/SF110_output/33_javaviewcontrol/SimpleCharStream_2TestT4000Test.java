// SimpleCharStream_2Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains ten unit test cases for the {@link SimpleCharStream#GetImage()} method.
*/
class SimpleCharStream_2Test {

	/**
	* Test case for {@link SimpleCharStream#GetImage()} method.
	* It tests the method with a string of length 1.
	*/
	@Test
	void testGetImage_1() {
		String input = "a";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertEquals(input, stream.GetImage());
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetImage()} method.
	* It tests the method with a string of length 2.
	*/
	@Test
	void testGetImage_2() {
		String input = "ab";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertEquals(input, stream.GetImage());
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetImage()} method.
	* It tests the method with a string of length 3.
	*/
	@Test
	void testGetImage_3() {
		String input = "abc";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertEquals(input, stream.GetImage());
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetImage()} method.
	* It tests the method with a string of length 4.
	*/
	@Test
	void testGetImage_4() {
		String input = "abcd";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertEquals(input, stream.GetImage());
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetImage()} method.
	* It tests the method with a string of length 5.
	*/
	@Test
	void testGetImage_5() {
		String input = "abcde";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertEquals(input, stream.GetImage());
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetImage()} method.
	* It tests the method with a string of length 6.
	*/
	@Test
	void testGetImage_6() {
		String input = "abcdef";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertEquals(input, stream.GetImage());
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetImage()} method.
	* It tests the method with a string of length 7.
	*/
	@Test
	void testGetImage_7() {
		String input = "abcdefg";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertEquals(input, stream.GetImage());
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetImage()} method.
	* It tests the method with a string of length 8.
	*/
	@Test
	void testGetImage_8() {
		String input = "abcdefgh";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertEquals(input, stream.GetImage());
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetImage()} method.
	* It tests the method with a string of length 9.
	*/
	@Test
	void testGetImage_9() {
		String input = "abcdefghi";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertEquals(input, stream.GetImage());
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetImage()} method.
	* It tests the method with a string of length 10.
	*/
	@Test
	void testGetImage_10() {
		String input = "abcdefghij";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertEquals(input, stream.GetImage());
	}
	
}
/* JavaCC - OriginalChecksum=d9128cf5d82a12eb06ed3b6fa19acc59 (do not edit this line) */

// SimpleCharStream_3Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains ten unit test cases for the {@link SimpleCharStream#GetSuffix(int)} method.
*/
class SimpleCharStream_3Test {
		
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a string of length 1.
	*/
	@Test
	void testGetSuffix_1() {
		String input = "a";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertArrayEquals(input.toCharArray(), stream.GetSuffix(1));
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a string of length 2.
	*/
	@Test
	void testGetSuffix_2() {
		String input = "ab";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertArrayEquals(input.toCharArray(), stream.GetSuffix(2));
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a string of length 3.
	*/
	@Test
	void testGetSuffix_3() {
		String input = "abc";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertArrayEquals(input.toCharArray(), stream.GetSuffix(3));
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a string of length 4.
	*/
	@Test
	void testGetSuffix_4() {
		String input = "abcd";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertArrayEquals(input.toCharArray(), stream.GetSuffix(4));
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a string of length 5.
	*/
	@Test
	void testGetSuffix_5() {
		String input = "abcde";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertArrayEquals(input.toCharArray(), stream.GetSuffix(5));
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a string of length 6.
	*/
	@Test
	void testGetSuffix_6() {
		String input = "abcdef";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertArrayEquals(input.toCharArray(), stream.GetSuffix(6));
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a string of length 7.
	*/
	@Test
	void testGetSuffix_7() {
		String input = "abcdefg";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertArrayEquals(input.toCharArray(), stream.GetSuffix(7));
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a string of length 8.
	*/
	@Test
	void testGetSuffix_8() {
		String input = "abcdefgh";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertArrayEquals(input.toCharArray(), stream.GetSuffix(8));
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a string of length 9.
	*/
	@Test
	void testGetSuffix_9() {
		String input = "abcdefghi";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertArrayEquals(input.toCharArray(), stream.GetSuffix(9));
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a string of length 10.
	*/
	@Test
	void testGetSuffix_10() {
		String input = "abcdefghij";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertArrayEquals(input.toCharArray(), stream.GetSuffix(10));
	}
	
}
/* JavaCC - OriginalChecksum=d9128cf5d82a12eb06ed3b6fa19acc59 (do not edit this line) */

// SimpleCharStream_4Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains ten unit test cases for the {@link SimpleCharStream#GetSuffix(int)} method.
*/
class SimpleCharStream_4Test {
		
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a string of length 1.
	*/
	@Test
	void testGetSuffix_1() {
		String input = "a";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertArrayEquals(input.toCharArray(), stream.GetSuffix(1));
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a string of length 2.
	*/
	@Test
	void testGetSuffix_2() {
		String input = "ab";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertArrayEquals(input.toCharArray(), stream.GetSuffix(2));
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a string of length 3.
	*/
	@Test
	void testGetSuffix_3() {
		String input = "abc";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertArrayEquals(input.toCharArray(), stream.GetSuffix(3));
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a string of length 4.
	*/
	@Test
	void testGetSuffix_4() {
		String input = "abcd";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertArrayEquals(input.toCharArray(), stream.GetSuffix(4));
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a string of length 5.
	*/
	@Test
	void testGetSuffix_5() {
		String input = "abcde";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertArrayEquals(input.toCharArray(), stream.GetSuffix(5));
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a string of length 6.
	*/
	@Test
	void testGetSuffix_6() {
		String input = "abcdef";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertArrayEquals(input.toCharArray(), stream.GetSuffix(6));
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a string of length 7.
	*/
	@Test
	void testGetSuffix_7() {
		String input = "abcdefg";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertArrayEquals(input.toCharArray(), stream.GetSuffix(7));
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a string of length 8.
	*/
	@Test
	void testGetSuffix_8() {
		String input = "abcdefgh";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertArrayEquals(input.toCharArray(), stream.GetSuffix(8));
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a string of length 9.
	*/
	@Test
	void testGetSuffix_9() {
		String input = "abcdefghi";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.BeginToken();
		assertArrayEquals(input.toCharArray(), stream.GetSuffix(9));
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a string of length 10.
	*/
	@Test
	void testGetSuffix_10() {
		String input = "abcdefghij";
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(input));
		stream.