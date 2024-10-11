// JniInchiStructure_2Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#addStereo0D(JniInchiStereo0D)} method.
*/
class JniInchiStructure_2Test {
		
	/**
	 * Test method for {@link net.sf.jniinchi.JniInchiStructure#addStereo0D(JniInchiStereo0D)}.
	 */
	@Test
	public void testAddStereo0D() {
		JniInchiStructure instance = new JniInchiStructure();
		instances.add( instance );
		// instance.addStereo0D( new JniStereo0D( 0D, 0D, 0D, 0D ) );
		List<JniStereo> expected = new ArrayList<  JniStereo>();
		expected.add( new JniStereo( 0, 0, 0, 0 ) );
		expected.add( new JniStereo( 0, 0, 0, 1 ) );
		expected.add( new JniStereo( 0, 0, 1, 0 ) );
		expected.add( new JniStereo( 0, 0, 1, 1 ) );
		expected.add( new JniStereo( 0, 1, 0, 0 ) );
		expected.add( new JniStereo( 0, 1, 0, 1 ) );
		expected.add( new JniStereo( 0, 1, 1, 0 ) );
		expected.add( new JniStereo( 0, 1, 1, 1 ) );
		assertEquals( expected, instance.getStereoAtoms() );
	}

	/**
	 * Test method for {@link net.sf.jniinchi.JniInchiStructure#addStereo0D(JniInchiStereo0D, net.sf.jniinchi.JniInchiStereo)}.
	 */
	@Test
	public void testAddStereo0DAndAddAlphabetOfParities() {
		JniStereo stereo0D = new JniStereo( 0, 0, 0, 0 );
		List<JniInchiParity> expected = new ArrayList<  JniInchiParity>();
		expected.add( new JniInchiParity( 1, 0, 0 ) );
		expected.add( new JniInchiParity( 1, 0, 1 ) );
		expected.add( new JniInchiParity( 1, 1, 0 ) );
		expected.add( new JniInchiParity( 1, 1, 1 ) );
		expected.add( new JniInchiParity( 0, 0, 0 ) );
		expected.add( new JniInchiParity( 0, 0, 1 ) );
		expected.add( new JniInchiParity( 0, 1, 0 ) );
		expected.add( new JniInchiParity( 0, 1, 1 ) );
		expected.add( new JniInchiParity( 1, 0, 0 ) );
		expected.add( new JniInchiParity( 1, 0, 1 ) );
		expected.add( new JniInchiParity( 1, 1, 0 ) );
		expected.add( new JniInchiParity( 1, 1, 1 ) );
		expected.add( new JniInchiParity( 0, 0, 0 ) );
		expected.add( new JniInchiParity( 0, 0, 1 ) );
		expected.add( new JniInchiParity( 0, 1, 0 ) );
		expected.add( new JniInchiParity( 0, 1, 1 ) );
		expected.add( new JniInchiParity( 1, 0, 0 ) );
		expected.add( new JniInchiParity( 1, 0, 1 ) );
		expected.add( new JniInchiParity( 1, 1, 0 ) );
		expected.add( new JniInchiParity( 1, 1, 1 ) );
		expected.add( new JniInchiParity( 0, 0, 0 ) );
		expected.add( new JniInchiParity( 0, 0, 1 ) );
		expected.add( new JniInchiParity( 0, 1, 0 ) );
		expected.add( new JniInchiParity( 0, 1, 1 ) );
		expected.add( new JniInchiParity( 1, 0, 0 ) );
		expected.add( new JniInchiParity( 1, 0, 1 ) );
		expected.add( new JniInchiParity( 1, 1, 0 ) );
		expected.add( new JniInchiParity( 1, 1, 1 ) );
		expected.add( new JniInchiParity( 0, 0, 0 ) );
		expected.add( new JniInchiParity( 0, 0, 1 ) );
		expected.add( new JniInchiParity( 0, 1, 0 ) );
		expected.add( new JniInchiParity( 0, 1, 1 ) );
		expected.add( new JniInchiParity( 1, 0, 0 ) );
		expected.add( new JniInchiParity( 1, 0, 1 ) );
		expected.add( new JniInchiParity( 1, 1, 0 ) );
		expected.add( new JniInchiParity( 1, 1, 1 ) );

		JniInchiStereo0D stereo0D1 = new JniInchiStereo0D( 2, 0, 0 );
		List<JniInchiParity> expected1 = new ArrayList<  JniInchiParity>();
		expected1.add( new JniInchiParity( 2, 0, 0 ) );
		expected1.add( new JniInchiParity( 2, 0, 1 ) );
		expected1.add( new JniInchiParity( 2, 1, 0 ) );
		expected1.add( new JniInchiParity( 2, 1, 1 ) );

		List<JniInchiStereo> expectedStereo = new ArrayList<  JniInchiStereo>();
		expectedStereo.add( stereo0D );
		expectedStereo.add( stereo0D1 );
		expectedStereo.add( new JniInchiStereo( 0, 0, 0 ) );
		expectedStereo.add( new JniInchiStereo( 0, 0, 1 ) );
		expectedStereo.add( new JniInchiStereo( 0, 1, 0 ) );
		expectedStereo.add( new JniInchiStereo( 0, 1, 1 ) );
		expectedStereo.add( new JniInchiStereo( 1, 0, 0 ) );
		expectedStereo.add( new JniInchiStereo( 1, 0, 1 ) );
		expectedStereo.add( new JniInchiStereo( 1, 1, 0 ) );
		expectedStereo.add( new JniInchiStereo( 1, 1, 1 ) );

		List<JniInchiParity> unexpected = new ArrayList<  JniInchiParity>();
		unexpected.add( new JniInchiParity( 2, 0, 0 ) );
		unexpected.add( new JniInchiParity( 2, 0, 1 ) );
		unexpected.add( new JniInchiParity( 2, 1, 0 ) );
		unexpected.add( new JniInchiParity( 2, 1, 1 ) );

		List<JniInchiParity> unexpected2 = new ArrayList<  JniInchiParity>();
}
}