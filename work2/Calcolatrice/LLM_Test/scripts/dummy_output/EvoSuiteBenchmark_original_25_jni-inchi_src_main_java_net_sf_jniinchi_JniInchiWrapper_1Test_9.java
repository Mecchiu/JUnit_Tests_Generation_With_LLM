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
		 
	/**
	 * Test method for {@link net.sf.jnati.deploy.NativeLibraryLoader#loadLibrary(java.net.URL)}.
	 * @throws JniInchiException
	 */
	
	@Test
	public void testJniInchiWrapper_1() throws NativeCodeException {
        final String LIB_FILE = new String("libinthai2.jar");
        final String LIBS = "libinthai2.library";
        
		final String INCHIS = "/hf/data/inchi/inchi";
		final List<String> ilist = NativeLibraryLoader.loadFromURL(LIB_FILE);
		if(ilist == null) {
            throw new NativeCodeException(NativeCodeException.NOT_IN_FILE);
        } else {   
			assertEquals("Library File Does Not Match Expected Library File", ilist, this.loadLibrary(LIBS));
			this.generateInchi(INCHIS);
			assertEquals("Inchi Text Does Not Match Expected Inchi Text", this._getStringInchi(), inchiTest);
		}
        }
        
		@Test
		public void testJniInchiWrapper_2() throws TimeoutException, InterruptedException, JniInchiException, LockException, NativeCodeException {
            final String LIB_FILE = new String("libinthai2.jar");
            final String LIBS = "libinthai2.library";
            String _test = new String("");
            
			String _inchi = this._getStringInchi();
	        
    		this.addAtom1();
    		this.addBond1();
    		this.addParity1();	
    		this.addAtom2();
    		this.addBond2();
    		this.addParity2();
    		this.addAtom3();
    		this.addBond3();
    		this.addParity3();
            
            // TODO: add tests to set up and check a result of the test
            
    		_test = this._getStringInchi();
            
            assertFalse("Inchi 2 Test: Expected Invalid Inchi String", inchiTest.equals(_test));
            assertTrue("Inchi 2 Test: invalid Inchi String", _test.equalsOrIs("inchi not valid"));
			
			this.addAtom1();
			this.addBond1();
			this.addParity1();

            _test = this._getStringInchi();
            
            assertTrue("Inchi 2 Test: Expected Valid Inchi String",!_test.equals(_test));
            
            this.addAtom2();

        	this.addBond2();
        	this.addParity2();

        	_test = this._getStringInchi();

        	assertTrue("Inchi 2 Test: Expected Valid Inchi String",!_test.equals(_test));
            	
            this.addAtom3();
        	this.addBond3();

            _test = this._getStringInchi();

            assertTrue("Inchi 3 Test: Expected Not Valid Inchi String", _test.equalsOrIs("not valid"));

            this.generateInchi(INCHIS);

        	this.addBond1();
        	this.addBond2();
        	this.addBond3();

            _test = this._getStringInchi();

            assertFalse("Inchi 3 Test: Expect Failed", _test.equalsOrIs("failed to convert Inchi from version 2"));
			
		}
		
		private String _getStringInchi() {

			try {
    			final StringBuilder sb = new StringBuilder();
			    final StringTokenizer st = new StringTokenizer(this.inchiTest, " \t");
			    while(st.hasMoreTokens()) {
				    sb.append(st.nextToken());
			    }
    			
				return sb.toString();
			} catch (InstantiationException e) {
    			throw new NativeCodeException(NativeCodeException.INIT_FAILED);
			}
		}
		
		

}