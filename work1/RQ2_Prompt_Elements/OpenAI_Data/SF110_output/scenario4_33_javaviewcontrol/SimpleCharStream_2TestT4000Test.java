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
	* It tests the method with a null value.
	*/
	@Test
	void testGetImage_1() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0, 0);
		String result = simpleCharStream.GetImage();
		assertEquals("", result);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetImage()} method.
	* It tests the method with a null value.
	*/
	@Test
	void testGetImage_2() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0);
		String result = simpleCharStream.GetImage();
		assertEquals("", result);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetImage()} method.
	* It tests the method with a null value.
	*/
	@Test
	void testGetImage_3() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null);
		String result = simpleCharStream.GetImage();
		assertEquals("", result);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetImage()} method.
	* It tests the method with a null value.
	*/
	@Test
	void testGetImage_4() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, null, 0, 0, 0);
		String result = simpleCharStream.GetImage();
		assertEquals("", result);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetImage()} method.
	* It tests the method with a null value.
	*/
	@Test
	void testGetImage_5() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0, 0);
		String result = simpleCharStream.GetImage();
		assertEquals("", result);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetImage()} method.
	* It tests the method with a null value.
	*/
	@Test
	void testGetImage_6() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, null, 0, 0);
		String result = simpleCharStream.GetImage();
		assertEquals("", result);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetImage()} method.
	* It tests the method with a null value.
	*/
	@Test
	void testGetImage_7() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0);
		String result = simpleCharStream.GetImage();
		assertEquals("", result);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetImage()} method.
	* It tests the method with a null value.
	*/
	@Test
	void testGetImage_8() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, null);
		String result = simpleCharStream.GetImage();
		assertEquals("", result);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetImage()} method.
	* It tests the method with a null value.
	*/
	@Test
	void testGetImage_9() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null);
		String result = simpleCharStream.GetImage();
		assertEquals("", result);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetImage()} method.
	* It tests the method with a null value.
	*/
	@Test
	void testGetImage_10() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, null, 0, 0, 0);
		String result = simpleCharStream.GetImage();
		assertEquals("", result);
	}
}

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
	* It tests the method with a null value.
	*/
	@Test
	void testGetSuffix_1() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0, 0);
		char[] result = simpleCharStream.GetSuffix(0);
		assertEquals(null, result);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a null value.
	*/
	@Test
	void testGetSuffix_2() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0);
		char[] result = simpleCharStream.GetSuffix(0);
		assertEquals(null, result);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a null value.
	*/
	@Test
	void testGetSuffix_3() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null);
		char[] result = simpleCharStream.GetSuffix(0);
		assertEquals(null, result);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a null value.
	*/
	@Test
	void testGetSuffix_4() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, null, 0, 0, 0);
		char[] result = simpleCharStream.GetSuffix(0);
		assertEquals(null, result);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a null value.
	*/
	@Test
	void testGetSuffix_5() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0, 0);
		char[] result = simpleCharStream.GetSuffix(0);
		assertEquals(null, result);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a null value.
	*/
	@Test
	void testGetSuffix_6() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, null, 0, 0);
		char[] result = simpleCharStream.GetSuffix(0);
		assertEquals(null, result);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a null value.
	*/
	@Test
	void testGetSuffix_7() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0);
		char[] result = simpleCharStream.GetSuffix(0);
		assertEquals(null, result);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a null value.
	*/
	@Test
	void testGetSuffix_8() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, null);
		char[] result = simpleCharStream.GetSuffix(0);
		assertEquals(null, result);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a null value.
	*/
	@Test
	void testGetSuffix_9() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null);
		char[] result = simpleCharStream.GetSuffix(0);
		assertEquals(null, result);
	}
	
	/**
	* Test case for {@link SimpleCharStream#GetSuffix(int)} method.
	* It tests the method with a null value.
	*/
	@Test
	void testGetSuffix_10() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, null, 0, 0, 0);
		char[] result = simpleCharStream.GetSuffix(0);
		assertEquals(null, result);
	}
}

// SimpleCharStream_4Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains ten unit test cases for the {@link SimpleCharStream#Done()} method.
*/
class SimpleCharStream_4Test {
		
	/**
	* Test case for {@link SimpleCharStream#Done()} method.
	* It tests the method with a null value.
	*/
	@Test
	void testDone_1() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0, 0);
		simpleCharStream.Done();
	}
	
	/**
	* Test case for {@link SimpleCharStream#Done()} method.
	* It tests the method with a null value.
	*/
	@Test
	void testDone_2() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0);
		simpleCharStream.Done();
	}
	
	/**
	* Test case for {@link SimpleCharStream#Done()} method.
	* It tests the method with a null value.
	*/
	@Test
	void testDone_3() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null);
		simpleCharStream.Done();
	}
	
	/**
	* Test case for {@link SimpleCharStream#Done()} method.
	* It tests the method with a null value.
	*/
	@Test
	void testDone_4() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, null, 0, 0, 0);
		simpleCharStream.Done();
	}
	
	/**
	* Test case for {@link SimpleCharStream#Done()} method.
	* It tests the method with a null value.
	*/
	@Test
	void testDone_5() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0, 0);
		simpleCharStream.Done();
	}
	
	/**
	* Test case for {@link SimpleCharStream#Done()} method.
	* It tests the method with a null value.
	*/
	@Test
	void testDone_6() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, null, 0, 0);
		simpleCharStream.Done();
	}
	
	/**
	* Test case for {@link SimpleCharStream#Done()} method.
	* It tests the method with a null value.
	*/
	@Test
	void testDone_7() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0);
		simpleCharStream.Done();
	}
	
	/**
	* Test case for {@link SimpleCharStream#Done()} method.
	* It tests the method with a null value.
	*/
	@Test
	void testDone_8() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, null);
		simpleCharStream.Done();
	}
	
	/**
	* Test case for {@link SimpleCharStream#Done()} method.
	* It tests the method with a null value.
	*/
	@Test
	void testDone_9() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null);
		simpleCharStream.Done();
	}
	
	/**
	* Test case for {@link SimpleCharStream#Done()} method.
	* It tests the method with a null value.
	*/
	@Test
	void testDone_10() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, null, 0, 0, 0);
		simpleCharStream.Done();
	}
}

// SimpleCharStream_5Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains ten unit test cases for the {@link SimpleCharStream#adjustBeginLineColumn(int, int)} method.
*/
class SimpleCharStream_5Test {
		
	/**
	* Test case for {@link SimpleCharStream#adjustBeginLineColumn(int, int)} method.
	* It tests the method with a null value.
	*/
	@Test
	void testAdjustBeginLineColumn_1() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0, 0);
		simpleCharStream.adjustBeginLineColumn(0, 0);
	}
	
	/**
	* Test case for {@link SimpleCharStream#adjustBeginLineColumn(int, int)} method.
	* It tests the method with a null value.
	*/
	@Test
	void testAdjustBeginLineColumn_2() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0);
		simpleCharStream.adjustBeginLineColumn(0, 0);
	}
	
	/**
	* Test case for {@link SimpleCharStream#adjustBeginLineColumn(int, int)} method.
	* It tests the method with a null value.
	*/
	@Test
	void testAdjustBeginLineColumn_3() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null);
		simpleCharStream.adjustBeginLineColumn(0, 0);
	}
	
	/**
	* Test case for {@link SimpleCharStream#adjustBeginLineColumn(int, int)} method.
	* It tests the method with a null value.
	*/
	@Test
	void testAdjustBeginLineColumn_4() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, null, 0, 0, 0);
		simpleCharStream.adjustBeginLineColumn(0, 0);
	}
	
	/**
	* Test case for {@link SimpleCharStream#adjustBeginLineColumn(int, int)} method.
	* It tests the method with a null value.
	*/
	@Test
	void testAdjustBeginLineColumn_5() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, 0, 0, 0);
		simpleCharStream.adjustBeginLineColumn(0, 0);
	}
	
	/**
	* Test case for {@link SimpleCharStream#adjustBeginLineColumn(int, int)} method.
	* It tests the method with a null value.
	*/
	@Test
	void testAdjustBeginLineColumn_6() {
		SimpleCharStream simpleCharStream = new SimpleCharStream(null, null, 0, 0);
		simpleCharStream.adjustBeginLineColumn(0, 0);
	}
	
	/**
	* Test case for {@link SimpleCharStream#adjustBeginLineColumn(int,