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
		* Test method for
		* {@link net.sf.jnati.deploy.NativeLibraryLoader#loadLibrary(java.lang.String, java.lang.String, java.lang.String)}.
		*/
		@Test
		void testLoadLibrary(){
			reinitLibs();

			String[] loadedLibs = NativeLibraryLoader.load(LIBRARY_NAME, LIBRARY_ID, LIBRARY_VER);
			assertTrue(loadedLibs.length > 0);

			for(int i = 0; i < loadedLibs.length; i++){
				assertTrue(loadedLibs[i].startsWith(LIBRARY_ID+"  "));				
				assertTrue(loadedLibs[i].endsWith(LIBRARY_VER));
			}
		}
		
		/**
		* Test method for
		* {@link net.sf.jnati.deploy.NativeLibraryLoader#loadLib(java.lang.String, java.lang.String, java.lang.String)}.
		*/
		@Test
		void testLoadLibWithLibLoader(){
			String inchi = "InChI1";			
			try {
				checkInchi(inchi, true);				      
			} catch(JniInchiException jne) {
				jne.printStackTrace();
				System.exit(2);				
			}
			String stublib = "/home/sam/Desktop/Stub/net/stublibrary.jar";

			String[] loadedLibs = NativeLibraryLoader.load(LIBRARY_NAME, LIBRARY_ID, LIBRARY_VER, stublib);
			assertTrue(loadedLibs.length > 0);

			for (int i = 0; i < loadedLibs.length; i++) {
				assertTrue(loadedLibs[i].startsWith(LIBRARY_ID+"  "));				
				assertTrue(loadedLibs[i].endsWith(LIBRARY_VER));
			}
		}
		
		/**
		 * Tests if the system library list is loaded correctly. An error should not be
		 * expected because the number of entries in the list is 0 or more. 
		 */
		@Test
		void testLoadLibList() throws TimeoutException, InterruptedException, NativeCodeException {
			List<Long> ids = NativeLibraryLoader.load();			
			assertTrue(ids.size() > 0);

			String[] loadedLibs = NativeLibraryLoader.load(LIBRARY_NAME, LIBRARY_ID, LIBRARY_VER);
			assertTrue(loadedLibs.length > 0);

			for (long i = 0; i < loadedLibs.length; i++) {
				assertTrue(loadedLibs[i].startsWith(LIBRARY_ID+"  "));				
				assertTrue(loadedLibs[i].endsWith(LIBRARY_VER));
			}
		}

		/**
		 * @throws TimeoutException if the {@link JniInchiWrapper#checkInchi(String, boolean)} method will
		 *                          return "invalid data"
		 * @throws InterruptedException if the {@link JniInchiWrapper#checkInchi(String, boolean)} method will
		 *                          return "invalid data"
		 * @throws NativeCodeException if the {@link JniInchiWrapper#checkInchi(String, boolean)} method will
		 *                          return "invalid data"
		 */
		@Test
		void testMissingSystemLib() throws TimeoutException, InterruptedException, NativeCodeException {
				JniInchiWrapper jni = new JniInchiWrapper();
				jni.checkInchi("1",true);				

		}
		
		/**
		 * @throws MalformedInchiException if the {@link JniInchiWrapper#checkInchi(String, boolean)} method will
		 *                          return null or unexpected exception
		 */
		@Test
		void testNonExistentSystemLib() throws MalformedInchiException {
			JniInchiWrapper jni = new JniInchiWrapper();
			jni.checkInchi("1x",false);
		}
}