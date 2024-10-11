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
* It contains ten unit test cases for the {@link JniInchiWrapper#checkInchi(String, boolean)} method.
*/
class JniInchiWrapperTest {

	/**
	* Test case for the {@link JniInchiWrapper#checkInchi(String, boolean)} method.
	* It tests the case when the input InChI is null.
	* Expected: {@link IllegalArgumentException}.
	*/
	@Test
	void testCheckInchi_1() {
		assertThrows(IllegalArgumentException.class, () -> {
			JniInchiWrapper.checkInchi(null, true);
		});
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#checkInchi(String, boolean)} method.
	* It tests the case when the input InChI is empty.
	* Expected: {@link JniInchiException}.
	*/
	@Test
	void testCheckInchi_2() {
		assertThrows(JniInchiException.class, () -> {
			JniInchiWrapper.checkInchi("", true);
		});
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#checkInchi(String, boolean)} method.
	* It tests the case when the input InChI is not valid.
	* Expected: {@link JniInchiException}.
	*/
	@Test
	void testCheckInchi_3() {
		assertThrows(JniInchiException.class, () -> {
			JniInchiWrapper.checkInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H", true);
		});
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#checkInchi(String, boolean)} method.
	* It tests the case when the input InChI is valid.
	* Expected: {@link INCHI_STATUS#OKAY}.
	*/
	@Test
	void testCheckInchi_4() {
		assertEquals(INCHI_STATUS.OKAY, JniInchiWrapper.checkInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1", true));
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#checkInchi(String, boolean)} method.
	* It tests the case when the input InChI is valid.
	* Expected: {@link INCHI_STATUS#OKAY}.
	*/
	@Test
	void testCheckInchi_5() {
		assertEquals(INCHI_STATUS.OKAY, JniInchiWrapper.checkInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1", false));
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#checkInchi(String, boolean)} method.
	* It tests the case when the input InChI is valid.
	* Expected: {@link INCHI_STATUS#OKAY}.
	*/
	@Test
	void testCheckInchi_6() {
		assertEquals(INCHI_STATUS.OKAY, JniInchiWrapper.checkInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1", true));
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#checkInchi(String, boolean)} method.
	* It tests the case when the input InChI is valid.
	* Expected: {@link INCHI_STATUS#OKAY}.
	*/
	@Test
	void testCheckInchi_7() {
		assertEquals(INCHI_STATUS.OKAY, JniInchiWrapper.checkInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1", false));
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#checkInchi(String, boolean)} method.
	* It tests the case when the input InChI is valid.
	* Expected: {@link INCHI_STATUS#OKAY}.
	*/
	@Test
	void testCheckInchi_8() {
		assertEquals(INCHI_STATUS.OKAY, JniInchiWrapper.checkInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1", true));
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#checkInchi(String, boolean)} method.
	* It tests the case when the input InChI is valid.
	* Expected: {@link INCHI_STATUS#OKAY}.
	*/
	@Test
	void testCheckInchi_9() {
		assertEquals(INCHI_STATUS.OKAY, JniInchiWrapper.checkInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1", false));
	}
	
	/**
	* Test case for the {@link JniInchiWrapper#checkInchi(String, boolean)} method.
	* It tests the case when the input InChI is valid.
	* Expected: {@link INCHI_STATUS#OKAY}.
	*/
	@Test
	void testCheckInchi_10() {
		assertEquals(INCHI_STATUS.OKAY, JniInchiWrapper.checkInchi("InChI=1S/C6H6/c1-2-4-6-5-3-1/h1-6H/q+1", true));
	}
}