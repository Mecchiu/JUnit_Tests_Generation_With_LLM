// JniInchiStructure_3Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#getAtom(int)} method.
*/
class JniInchiStructure_3Test {
		
	/**
    * Run the test with both Java versions and JVMDebugger debug methods.
    * <b>ATTENTION:</b> This method is <b>NOT</b> an integration test because it is run
    * as one test run only, with the purpose of test the debug method by default.
    */
    @Test
    void runWithBothVersionOnly() {

        assertNotNull(new JniInchiStructure().getFingerprint());
        assertNotNull(new JniInchiStructure().getUserName());
    }

	/**
    * Run the test.
    *
    * @param versionVersion JniVersion
    * @return List
    */
	public List<byte[]> generateTestFingerprints(JniVersion version) {
        List<byte[]> fingerprints = new ArrayList<>();

		if(version == JniVersion.Nano) {
			// test default method
			Fingerprint f = new Fingerprint(new byte[0], 0);
			assertTrue(f.generate() == 0);
			fingerprints.add(f.bytes());
		}

		// test user-defined method
		int atomLength = 9;
		jniInchiStructure.getAtom(atomLength).fingerprint(fingerprints);
		return fingerprints;
	}
	
	// Run without JVMDebugger and JNI version
	@Test
	void runWithoutDebuggerJNIVersion() {
		assertNotNull(new JniInchiStructure().getFingerprint());
		assertNull(new JniInchiStructure().getUserName());

		// test default method
		jniInchiStructure.getFingerprint("a");
		assertNotNull(new JniInchiStructure().getFingerprint());

                // assert that default and user defined method can be called
		jniInchiStructure.getAtom(9).setUserName("JniTestUserName");
		// assert all callbacks by default method and can be called from the
		// default method
		jniInchiStructure.getAtom(0).setUserName("JniTestUserName");
		// assert user defined JNI version can be called in debug mode.
		jniInchiStructure.getAtom(12).setUserName("JniTestUserName");
	}
}