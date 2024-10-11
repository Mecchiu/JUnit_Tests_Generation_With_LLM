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
static final String INCHI_FILE = "../src/test/resources/file.inchi";
	public static TestSuite suite() {
		TestSuite ts = new TestSuite();
		assertNotNull(INCHI_FILE);
		List<JniInchiWrapper> wrappers = NativeLibraryLoader.load("JniInchiWrapper");
		for (JniInchiWrapper wrapper : wrappers) {
            wrappers.remove(wrapper);
        }

        // Create the default wrapper
        JniInchiWrapper w = new JniInchiWrapper();
        w.setParams(INCHI_FILE);
        ts.addTest(createTestGroup(w));

		return ts;
	}
	
	/**
	 * @see TestGroup
	 */
	private static TestSuite createTestGroup(JniInchiWrapper wrapper) {
		TestSuite ts = new TestSuite();
        java.util.List<String> params = new java.util.ArrayList<>();
        {
            java.util.StringTokenizer st = new java.util.StringTokenizer(wrapper.getParams(), ",");
            params.addAll(st.nextToken().split(","));
            params.addAll(st.nextToken().split(","));
        }

        ts.addTest(runTest(wrapper, params));
        return ts;
	}
	/**
	 * @see TestCase
	 */
	private static TestGroup createTestGroup(JniInchiWrapper wrapper, java.util.List<String> params) {
        return createTestGroup(wrapper);
	}
	private Test(TestGroup group) {
		this.group = group;
	}

	private final TestGroup group;

	private final JniInchiWrapper wrapper;


	/**
	 * Test the {@link JniInchiWrapper#CheckINCHI} method.
	 * @throws JniInchiException
	 * @throws NativeCodeException
	 * @throws TimeoutException
	 */
	private Test(final JniInchiWrapper wrapper) throws NativeCodeException, NativeCodeException, TimeoutException {

        try {
			checkInchi(INCHI_FILE, true);
			System.out.println(INCHI_FILE);
			INCHI_STATUS retStatus = checkInchi(INCHI_FILE, false);
			checkSuccess(retStatus);
		} catch (NativeCodeException e) {
			System.out.println(e);
			assertNull(wrapper.getParams());
		} catch (TimeoutException e) {
			assertNull(wrapper.getParams());
		}

        this.wrapper = new JniInchiWrapper(InchiUtil.getInchiFile(wrapper.getParams()));
	}
	/**
	 * @return the group object
	 */
	private final TestGroup getGroup() {
		return group;
	}
	/**
	 * @return the wrapper object
	 */
	protected final JniInchiWrapper getWrapper() {
		return wrapper;
	}
	/**
	 * Runs the test
	 */
	protected void run() {
		wrapper.getLock();
		try {
			// TODO: do we need one?
			INCHI_STATUS retStatus = checkInchi;
			
			INCHI_STATUS retStatus0;
			INCHI_STATUS retStatus1;
			INCHI_STATUS retStatus2;
			INCHI_STATUS retStatus3;
			INCHI_STATUS retStatus4;
			INCHI_STATUS retStatus5;
			INCHI_STATUS retStatus6;
			INCHI_STATUS retStatus7;
			INCHI_STATUS retStatus8;
			REENTRANT_LOCK retLock;
			boolean ret1, ret2, ret3, ret4, ret5;
			
			retLock = new ReentrantLock();
			Thread t = new Thread(new Runnable() {

				public void run() {
					retLock.lock();
					try {
						retStatus1 = checkInchi;
					} finally {
						retLock.unlock();
					}
				}
			});
			
			t.start();
			try (Thread.sleep(750L)) {
				retLock.lock();
				try {
					retStatus0 = checkInchi;
				} finally {
					retLock.unlock();
				}
			}
			Thread.sleep(20000L);
			
			if (retStatus0!= retStatus1) {
				throw new NativeCodeException("Failed checkInchi. Expected: " + retStatus1 
						+ " Actual: " + retStatus0);
			}
			
			if (retStatus0 == INCHI_STATUS.CHECK_FILE_EXIST) {
				throw new NativeCodeException("Check file exists: " + INCHI_FILE);
			}
			if (retStatus0 == INCHI_STATUS.CHECK_INCHI_FILE_EXISTS) {
				throw new NativeCodeException("Check InChI exists: " + INCHI_FILE);
			}
			
			t.join();
			
			ret1 = (retStatus1 == INCHI_STATUS.SUCCESS);
			ret2 = (retStatus2 == INCHI_STATUS.SUCCESS);
			ret3 = (retStatus3 == INCHI_STATUS.SUCCESS);
			ret4 = (retStatus4 == INCHI_STATUS.SUCCESS);
			ret5 = (retStatus5 == INCHI_STATUS