// JniInchiStructure_5Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#getStereo0D(int)} method.
*/
class JniInchiStructure_5Test {
		private final List<String> inchi = new ArrayList<String>();
		
		static {
			inchi.add("4AAE2F12A");
		}
		
		@Test
		public void test() {
			JniInchiStereo0D st0 = new JniInchiStereo0D(
					new JniInchiParity(inchi));
			assertEquals("Invalid stereo parity - default value.",0/*default value*/,st0.getStereo());

			st0 = st0.removeStereo();
			assertEquals("Invalid stereo parity - removal with removed stereo.",0/*default value*/,st0.getStereo());
			st0.setStereo(new JniInchiStereo0D(new JniInchiParity(inchi)));
			assertNotNull("Incorrect stereo parity",st0.getStereo());
			assertEquals("Invalid stereo parity - new set stereo",new JniInchiParity(inchi),st0.getStereo());
			
			st0 = new JniInuchiStereo0D(new JniInchiParity(inchi));
			assertEquals("Invalid stereo parity - new set stereo",new JniInchiStereo0D(new JniInchiParity(inchi)),st0.getStereo());

			st0.clear();
			assertNull("Trying to clear, should be null",st0.getStereo());

			JniInchiStereo0D st3 = new JniInchiStereo0D(
					new JniInchiParity(new JniInchiStereo0D()));
			st3.setStereo(st0.buildStereo());
			assertEquals("Incorrect stereo parity - 1st parameter set to correct value",new JniInchiStereo0D().setStereo(new JniInchiStereo0D),st0.getStereo());

			JniInchiStereo0D st0b = new JniInchiStereo0D(
					new JniInchiParity(new JniInchiStereo0D(new JniInchiStereo0D())));
			assertNotNull("Trying to set to another structure",st0b.getStereo());
			assertEquals("Invalid stereo parity - second set",1,st0b.getStereo().getStereoParity());

			st0b.setStereo(new JniInchiStereo0D(new JniInchiParity(new JniInchiStereo0D(new JniInchiStereo0D())),0));
			assertEquals("Invalid stereo parity - second set to new stereo",0,st0.getStereo().getStereoParity());
			
			JniInchiStereo0D st2 = new JniInchiStereo0D(
					new JniInchiParity(new JniInchiStereo0D(new JniInchiStereo0D(new JniInchiStereo0D()))));
			st2.setStereo(new JniInchiStereo0D(new JniInchiParity(new JniInchiStereo0D(new JniInchiStereo0D(new JniInchiStereo0D())))));
			assertEquals("Invalid stereo parity - second set to new stereo",new JniInchiParity(new JniInchiStereo0D(new JniInchiStereo0D(new JniInchiStereo0D(new JniInchiStereo0D(new JniInchiStereo0D()))))),st2.getStereo());

			st0 = st0b.merge(st0);
			assertEquals("Invalid stereo parity - two merged structures",st0b.getStereo().getStereoParity(),st0b.getStereo().getStereoParity());
		}
}