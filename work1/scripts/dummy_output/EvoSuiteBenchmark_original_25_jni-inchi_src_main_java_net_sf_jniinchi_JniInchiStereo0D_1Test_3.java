// JniInchiStereo0D_1Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains one unit test case for the {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_1Test {
		//============================================================
		// Test method 
	@Test
	public void canCreateDoublebondStereo0D( ) throws JNIException{
		assertNotNull( JniInchiStereo0D.createNewDoublebondStereo0D( null, null, null, null, null ) );
		}
	//============================================================
}