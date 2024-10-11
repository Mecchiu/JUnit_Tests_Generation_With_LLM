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

	/**
		 * Test of getShootline method, of class PlayerConfiguration.
		 */
	@Test
	public void testGetShootline() {
		Configuration configToTest = null;
		
		/// Test for getShootline() method, no params given.
		//Test that getShootline(false) has no effect.
        configToTest = new Configuration();
        assertFalse("getShootline(false) is expected to fail", configToTest.showShootline());
		
		/// Test for getShootline() method, params given.
		configToTest = new Configuration(Configuration.SHOW_SHOOTLINE);
		assertFalse("getShootline(false) is expected to fail", configToTest.showShootline());
		
		/// Test for getShootline(true) is not expected to fail.
		configToTest = new Configuration(Configuration.SHOW_SHOOTLINE, true);
		assertTrue("getShootline(true) is expected to fail", configToTest.showShootline());
		
		/// Test for getShootline(true) is expected to work.
		configToTest = new Configuration(Configuration.SHOW_SHOOTLINE, false);
		assertEquals("getShootline(true) is expected to return null", null, configToTest.getShootline());
		Config.SHOW_SHOOTLINE = true;
		configToTest = new Configuration(Configuration.SHOW_SHOOTLINE, true);
		assertEquals("getShootline(true) is expected to return null", null, configToTest.getShootline());
	}


    /**
     * This method is a unit test for the {@link PlayerConfiguration#showShootline()} method.
     */
    @Test
    public void testGetShowShootline() {
        Configuration configToTest = null;
		
		/// Test for getShowShootline() method, no param.
		//Test that getShowShootline(false) has no effect.
        configToTest = new Configuration();
        assertFalse("getShowShootline(false) is expected to fail", configToTest.showShootline());

		/// Test for getShowShootline(true) is not expected to fail.
		configToTest = new Configuration(Configuration.SHOW_SHOOTLINE, true);
		assertTrue("getShowShootline(false) is expected to fail", configToTest.showShootline());
		
		/// Test for getShowShootline(true) is expected to work.
		configToTest = new Configuration(Configuration.SHOW_SHOOTLINE, true);
		assertEquals("getShowShootline(true) is expected to return null", null, configToTest.getShowShootline());

        /// Test for getShowShootline(true) is expected to work.
        configToTest = new Configuration(Configuration.SHOW_SHOOTLINE, true, PlayerConfiguration.Configuration.SHOW_SHOOTLINE);
        assertEquals("getShowShootline(true) is expected to return null", null, configToTest.getShowShootline());
    }
	
	
	/**
	 *
	 */
	  public static class Configuration implements Cloneable {
	          protected static final Lock lock = new ReentrantLock(true);
	          private Boolean showShootline;
	          private Set<Integer> parametersSets = new HashSet<>();
	          
	          public Configuration() {
	              throw new UnsupportedOperationException("Unable to create instantiation of PlayerConfiguration, please implement PlayerConfiguration_2Test.Configuration");
	          }
	          
	          public Configuration(Boolean showShootline){
	              this.showShootline = showShootline;
	          }
	          
	          @Override
	          public PlayerConfiguration clone() throws CloneNotSupportedException {
	                return new PlayerConfiguration_2Test();
	                                       
	          }
	
	          public Set<Integer> getParametersSets() {
	                return parametersSets;
	          }

	          public void setParametersSets(Set<Integer> paramSetsToSet) {
	                lock.lock();
	                try {
	                    parametersSets = paramSetsToSet;
	                }
	                finally {
	                    lock.unlock();
	                }
	          }
	
	          public void addParameter(Integer paramInt) {
	                   synchronized(this) {
	                        parametersSets = new HashSet<>(parametersSets);
	                  }
	                  parametersSets.add(Integer.valueOf(paramInt));
	          }
	          
	          public boolean isParameterSet(Integer integer) {
	    	          synchronized(this) {
	                        return parametersSets.contains(integer);
	                       }
	          }
	          
	          public boolean isShootlineAvailable(){
	            	  return!isParameterSet(Configuration.PLAYER_SHOOTLINE);
	          }
	          
	          public boolean isShootlineSetTo(Integer shootline) {
	                lock.lock();
	                try {
	                    return showShootline.equals(Boolean.valueOf(shootline));
	                }
	                finally {
	                    lock.unlock();
	                }      
	          }
	  }
}