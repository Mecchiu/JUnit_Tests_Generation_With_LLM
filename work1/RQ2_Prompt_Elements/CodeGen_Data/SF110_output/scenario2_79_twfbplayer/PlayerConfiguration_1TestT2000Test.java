// PlayerConfiguration_1Test.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains one unit test case for the {@link PlayerConfiguration#showMoveTargets()} method.
*/
class PlayerConfiguration_1Test {

	/**
	 * Check {@link Configuration#showMoveTargets()} is not called after instantiation.
	 * @throws Exception Exception.
	 */
	@Test
	public void testShow_moveTargets() throws Exception {
		Set<String> ln = new HashSet<>();
		Set<String> lmn = new HashSet<>();
		
        Configuration.showMoveTargets();
		ln = new HashSet<>();
		ln.add("a text");
		ln.add("a text");
		ln.add("an arbitrary string");
		ln.add("an arbitrary string");
		ln.add("one of the other ln");
        Configuration.showMoveTargets();
		
		ln = new HashSet<String>();
		ln.add("no tesstag");
		ln.add("a string with two entries");
        ln.add(Configuration.MOVETARGETS_NOMOVETARGETFILE);
		Configuration.showMoveTargets();
		
        ln = new HashSet<String>();
        ln.add(Configuration.MOVETARGETS_NOMOVETARGETFILE2);
        ln.add("one of the other ln");
		Configuration.showMoveTargets();
	}
	/**
	 * Check the code used by {@link Configuration#MOVETARGETS_NOMOVETARGETSUBSCRIBE}
	 * @throws Exception Exception.
	 */
	//FIXME @Test
	@Test
	public void testNomovetarget() throws Exception {
		Configuration.NOMOVETARGETFILE = Configuration.MOVETARGETS_NOMOVETARGETFILE;
		Configuration.NOMOVETARGETFILE2 = Configuration.MOVETARGETS_NOMOVETARGETFILE2;
		Configuration.NOMOVETARGETFILE3 = Configuration.MOVETARGETS_NOMOVETARGETFILE3  ;
		Configuration.NOMOVETARGETSUBSCRIBE = Boolean.TRUE;
		
        Configuration.showMoveTargets();
		
		assertEquals("0", Configuration.MOVETARGETS_NOMOVETARGETSUBSCRIBE);
		assertEquals("an arbitrary string with 2 entries", Configuration.MOVETARGETS_NOMOVETARGETFILE);
	}
   
}