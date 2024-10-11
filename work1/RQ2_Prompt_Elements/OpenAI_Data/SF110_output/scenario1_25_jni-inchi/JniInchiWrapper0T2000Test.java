// JniInchiWrapperTest.java
package net.sf.jniinchi;

import net.sf.jnati.NativeCodeException;
import net.sf.jnati.deploy.NativeLibraryLoader;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiWrapper}.
* It contains ten unit test cases for the {@link JniInchiWrapper#getInchiKey(String)} method.
*/
class JniInchiWrapperTest {

	/**
	* Test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
	* It tests the case when the input is null.
	*/
	@Test
	void testGetInchiKey_1() throws Exception {
		assertThrows(IllegalArgumentException.class, () -> {
			JniInchiWrapper.getInchiKey(null);
		});
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
	* It tests the case when the input is empty.
	*/
	@Test
	void testGetInchiKey_2() throws Exception {
		assertThrows(IllegalArgumentException.class, () -> {
			JniInchiWrapper.getInchiKey("");
		});
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
	* It tests the case when the input is a space.
	*/
	@Test
	void testGetInchiKey_3() throws Exception {
		assertThrows(IllegalArgumentException.class, () -> {
			JniInchiWrapper.getInchiKey(" ");
		});
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
	* It tests the case when the input is a tab.
	*/
	@Test
	void testGetInchiKey_4() throws Exception {
		assertThrows(IllegalArgumentException.class, () -> {
			JniInchiWrapper.getInchiKey("\t");
		});
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
	* It tests the case when the input is a new line.
	*/
	@Test
	void testGetInchiKey_5() throws Exception {
		assertThrows(IllegalArgumentException.class, () -> {
			JniInchiWrapper.getInchiKey("\n");
		});
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
	* It tests the case when the input is a carriage return.
	*/
	@Test
	void testGetInchiKey_6() throws Exception {
		assertThrows(IllegalArgumentException.class, () -> {
			JniInchiWrapper.getInchiKey("\r");
		});
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
	* It tests the case when the input is a form feed.
	*/
	@Test
	void testGetInchiKey_7() throws Exception {
		assertThrows(IllegalArgumentException.class, () -> {
			JniInchiWrapper.getInchiKey("\f");
		});
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
	* It tests the case when the input is a vertical tab.
	*/
	@Test
	void testGetInchiKey_8() throws Exception {
		assertThrows(IllegalArgumentException.class, () -> {
			JniInchiWrapper.getInchiKey("\u000B");
		});
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
	* It tests the case when the input is a backspace.
	*/
	@Test
	void testGetInchiKey_9() throws Exception {
		assertThrows(IllegalArgumentException.class, () -> {
			JniInchiWrapper.getInchiKey("\b");
		});
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
	* It tests the case when the input is a valid InChI.
	*/
	@Test
	void testGetInchiKey_10() throws Exception {
		assertEquals("XLYOFNOQVPJJNP-UHFFFAOYSA-N", JniInchiWrapper.getInchiKey("InChI=1S/C6H12O6/c7-1-2-3(8)4(9)5(10)6(11)12-2/h2-11H,1H2/t2-,3-,4+,5-,6-/m1/s1"));
	}
}