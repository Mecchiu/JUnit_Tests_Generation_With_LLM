// StringXorTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringXor}.
* It contains one unit test case for the {@link StringXor#stringXor(String, String)} method.
*/
class StringXorTest {
// Unit tests should not implement any methods.
	@Test
    public void testClass() {
        assertNotNull("StringXorTest.testClass() returned null.", StringXor.class);
	}

	/**
	* Test if no exceptions are thrown.
	*/
	@Test
    public void testMethod(){
        String a = "A";
        String b = "B";
		StringXor tester =	StringXor.stringXor(a, b);
        assertNotNull(StringXorTest.class.getName() + StringXorTest.testMethod + "()");
    }

	/**
	* Test if methods which takes only one string argument execute correctly.
	*/
	@Test
    public void testMethod1(){
		String s = "A";
		String a = "A";
		assertEquals("stringXorTest.testMethod.A.java:6: Method 'testMethod1' should have no effect.",
				StringXorTest.testMethod1(s, a) + "", StringXor.stringXor(s, a));
	}

	/**
	* Test if methods which take two strings input run correctly.
	*/
	@Test
    public void testMethod2(){
		String s = "A";
        String b = "B";
		assertEquals("stringXorTest.testMethod.D.java:6: Method 'testMethod2' should have no effect.",
				StringXorTest.testMethod2(s, b) + "", StringXor.stringXor(s, b));
	}

	/**
	* Test if methods which take three strings input run correctly.
	*/
	@Test
    public void testMethod3(){
		String s = "A";
		String b = "B";
		String c = "C";
		assertEquals("stringXorTest.testMethod.E.java:6: Method 'testMethod3' should have no effect.",
				StringXorTest.testMethod3(s, b, c) + "", StringXor.stringXor(s, b, c));
	}

	/**
	* Test if methods which take four strings input run correctly.
	*/
	@Test
    public void testMethod4(){
		String s = "A";
        String b = "A";
		String c = "B";
		String d = "C";
		assertEquals("stringXorTest.testMethod.F.java:6: Method 'testMethod4' should have no effect.",
				StringXorTest.testMethod4(s, b, c, d) + "", StringXor.stringXor(s, b, c, d));
	}

}









