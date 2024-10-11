// PlayerConfiguration_2Test.java
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
* It contains one unit test case for the {@link PlayerConfiguration#showShootline()} method.
*/
class PlayerConfiguration_2Test {

	final Configuration conf = Configuration.instance();
	final Lock lock = new ReentrantLock();

	@Test
	void testShootLineVisible() throws Exception {
//		conf.addParameter(ShootMode.SHOOTLINE, "true");
//		conf.addParameter(ShootMode.SHOOTLINE, "true");

//		lock.lock();
//		conf.setShootLine("true");
//		lock.unlock();
//		assertEquals("true", conf.getShootLine());
//		assertTrue(conf.getBoolean(ShootMode.SHOOTLINE, false));
		assertTrue(conf.containsFlag(ShootMode.SHOOTLINE, "false"));
		assertFalse(conf.containsFlag(ShootMode.SHOOTLINE, "true"));
		
		conf.setShootLine("false");
		lock.lock();
		conf.setShootLine("false");
		lock.unlock();
		lock.lock();
		conf.setShootLine("true");
	}
	
	@Test
	void testShootLineUnvisible() throws Exception {
		
		conf.addParameter(ShootMode.HAS_SHOOTLINE, "true");
        
        // This is a hack for the current PlayerConfiguration
//			conf.setParameter(Configuration.SHOOTLINE_SHOOTLINE_MODE, "false");
//			conf.setParameter(Configuration.SHOOTLINE_SHOOTLINE_MODIFIER, new Boolean(((Boolean)conf.getFlag(SHOOTLINE_SHOOTLINE_MODIFIER, "false") + 1)).toString());
//			
//			conf.setShootLinesAllowed(conf.getIntegerParameter(SHOOTLINE_SHOOTLINE_MODIFIER, 1));
			
//			lock.lock();
//			conf.setShootLine("true");
//			lock.unlock();
//
//			fail("Exception not thrown: Not allowed to play shootline");
	}
	
	@Test
	void testShootModeUnvisible() throws Exception {
//		conf.addParameter(ShootMode.SHOOTLINE, "false");
//		conf.addParameter(ShootMode.SHOOTLINE, "false");
//		conf.addParameter(ShootMode.SHOOTLINE, "true");
            
        // This is a hack for the current PlayerConfiguration
//			conf.setShootMode("false");
//			conf.setShootMode("false");
//			fail("Exception not thrown: Not allowed to play shoot-mode");
	}
	
	@Test
	void testShootShootline() throws Exception {
		
//		conf.addParameter(ShootMode.SHOOTLINE, "true");
//		conf.addParameter(ShootMode.SHOOTLINE, "true");

//		lock.lock();
//		conf.setShootLine("true");
//		lock.unlock();
//		lock.lock();
//		conf.setShootLine("false");
//		lock.unlock();
//		lock.lock();
//		conf.setShootLine("true");
//		lock.unlock();
//		lock.lock();
//		conf.setShootLine("false");
//		lock.unlock();
//		lock.lock();
//		conf.setShootLine("true");
//		lock.unlock();
	}
	
	@Test
	void testShootLinesAllowed() throws Exception {
		
		conf.addParameter(ShootMode.HAS_SHOOTLINE, "true");
			
        // This is a hack for the current PlayerConfiguration
//			conf.setShootLinesAllowed(conf.getIntegerParameter(SHOOTLINE_SHOOTLINE_MODIFIER, 1) == 1);
                
        // This is a hack for the current PlayerConfiguration
//			conf.setShootLinesAllowed("true");
//			conf.setShootLinesAllowed("true");
//			conf.setShootLinesAllowed("false");
	}
	
	@Test
	void testShootModeAllowed() throws Exception {
		
		conf.addParameter(ShootMode.SHOOTLINE, "true");
		conf.addParameter(ShootMode.SHOOTLINE, "true");
		
        // This is a hack for the current PlayerConfiguration
//			conf.setShootMode("true");
//			conf.addParameter(Configuration.SHOOTLINE_SHOOTLINE_MODE, "false");
	}
	
	@Test
	void testShootModeAllowedWithString() throws Exception {
		
		conf.addParameter(ShootMode.SHOOTLINE, "true");
		conf.addParameter(ShootMode.SHOOTLINE, "true");
		
        conf.setShootMode("true");
        lock.lock();
		conf.setShootMode("true");
        conf.removeParameter(ShootMode.SHOOTLINE, "true");
        lock.unlock();
	}
	
	@Test
	void testShootModeAllowedWithInteger() throws Exception {
		
		conf.addParameter(ShootMode.SHOOTLINE, "true");
        
        // This is a hack for the current PlayerConfiguration
//			conf.setShootMode("true").withDefaultStrategy(Configuration.SHOOTLINE_SHOOTLINE_MODE_DEFAULT);
	}
	
	@Test
	void testShowShotlineDisabled() throws Exception {
		
		// Set shot line to hidden mode
		conf.removeParameter(SHOOTLINE);
		lock.lock();
		conf.setBoolean(SHOOTLINE, false);
		lock.unlock();
		
		// Make sure that the shot line wasn't visible/hidden
		assertTrue(conf.containsFlag(SHOOTLINE));
	}
	
	@Test
	void testShowShotlineVisible() throws Exception {
		
		// Remove shot line from invisible mode
		conf.addParameter(SHOOTLINE);
		lock.lock();
		conf.removeParameter(SHOOTLINE);
		lock.unlock();
		
		// Show shot line
        conf.setBoolean(SHOOTLINE, true);
        lock.lock();
        conf.setBoolean(SHOOTLINE, true);
        lock.unlock();
	}

    private Set<Lock> locks = new HashSet<>();
    private boolean inShutdown;
	/**
	 * Method for taking the locks the configuration.
	 * This method is only used as a workaround for a non-realistic
	 * bug in the Player class when the locks are being taken
	 * by the player. It checks whether this configurator is
	 * running in a JVM with the JVM.
	 * 
	 * @param wait
	 *            <code>true</code> if the method should be called on
	 *            another thread (used for a test). false means that the
	 *            method will be called on the thread that contains the
	 *            locks. In most cases, this is done in
	 *            {@link PlayerConfiguration}
	 * @