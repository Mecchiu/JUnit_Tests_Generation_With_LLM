// JniInchiWrapper_1Test.java
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
* It contains one unit test case for the {@link JniInchiWrapper#checkInchi(String, boolean)} method.
*/
class JniInchiWrapper_1Test {
		
	@Test
	public void test1() throws JniInchiException, InterruptedException {
		String inchi1 = "0 A 1";
		String inchi2 = "0 A 1 C";
		String inchi3 = "0 S 0";
		
		int expectedResult = 0;
		INCHI_STATUS actualResult = null;
		try {
			actualResult = JniInchiWrapper.checkInchi(inchi1, true);
		} catch (INCHI_STATUS_ERROR err) {
			if (err.getCode() == 0) {
				expectedResult = 4;
				continue;
			}
			actualResult = err.getStatus();
		}
		
		if (expectedResult == 0) {
			System.out.println(inchi1);
		} else if (expectedResult == 1) {
			System.out.println(inchi2);
		} else if (expectedResult == 2) {
			System.out.println(inchi3);
		}
		assertEquals(expectedResult, actualResult);
	}


	
	// JniInchiWrapper.checkInchi(String inchi1, boolean strict)

	@Test
	public void test2() throws JniInchiException, InterruptedException {
		int inchi1 = 5;
		int inchi2 = 6;
		int inchi3 = 7;
		String inchi4 = "0 A1 C2";
		
		INCHI_STATUS actualResult = null;
		try {
			actualResult = JniInchiWrapper.checkInchi(inchi1, true);
		} catch (INCHI_STATUS_ERROR err) {
			if (err.getCode() == 0) {
				System.out.println(inchi1);
			} else {
				System.out.println(inchi1+" failed because "+err.getMessage());
				actualResult = err.getStatus();
			}
		}
		
		assertEquals(expectedResult, actualResult);
	}

	
	// JniInchiWrapper.addAtom(String inchi)

	@Test
	public void test3() throws JniInchiException, InterruptedException {
		String inchi1 = "0 A 1";
		String inchi2 = "0 A 1 C";
		String inchi3 = "0 S 0";
		
		INCHI_STATUS actualResult = null;
		try {
			actualResult = JniInchiWrapper.addAtom(inchi1);
			
			expectedResult = 0;
		} catch (INCHI_STATUS_ERROR err) {
			if (err.getCode() == 0) {
				expectedResult = 4;
			}
			actualResult = err.getStatus();
		}
		
		assertEquals(expectedResult, actualResult);
	}
	
	
	// JniInchiWrapper.addBond(String inchi)

	@Test
	public void test4() throws JniInchiException, InterruptedException {
		String inchi1 = "0 A 1";
		String inchi2 = "0 A 1 C";
		String inchi3 = "0 S 0";
		
		INCHI_STATUS actualResult = null;
		try {
			actualResult = JniInchiWrapper.addBond(inchi1, true);
			
			expectedResult = 0;
		} catch (INCHI_STATUS_ERROR err) {
			if (err.getCode() == 0) {
				expectedResult = 4;
			}
			actualResult = err.getStatus();
		}
		
		assertEquals(expectedResult, actualResult);
	}
	
	
	// JniInchiWrapper.addParity(String inchi)
	
	@Test
	public void test5() throws JniInchiException, InterruptedException {
		String inchi1 = "0 A 1";
		String inchi2 = "0 A 1 C";
		String inchi3 = "0 S 0";

		INCHI_STATUS actualResult = null;
		try {
			actualResult = JniInchiWrapper.addParity(inchi1, true);
			expectedResult = 0;
		} catch (INCHI_STATUS_ERROR err) {
			if (err.getCode() == 0) {
				expectedResult = 4;
			}
			actualResult = err.getStatus();
		} catch(NativeCodeException err) {
			if (err.getCode() == 0) {
				expectedResult = 5;
			}
			actualResult = err.getStatus();
		}

		assertEquals(expectedResult, actualResult);
		
	}
	
	
	// JniInchiWrapper.generateInchi()
	
	@Test
	public void test6() throws JniInchiException, InterruptedException {
		String inchi = null;
		LOCK lock = new ReentrantLock(true);
		try {
			lock.lock();
			String inchiExpected = "0A 1 B0 B1 C 0";
			
			inchi = JniInchiWrapper.generateInchi(inchiExpected);
			actualResult = null;
			expectedResult = inchiExpected;
		} catch (NativeCodeException err) {
			if (err.getCode()!= 0) {
				System.out.println(err.getMessage());
			}
			actualResult = err.getStatus();
		} finally {
			lock.unlock();
		}
		
		assertEquals(expectedResult, actualResult);
	}
	
	// JniInchiWrapper
}