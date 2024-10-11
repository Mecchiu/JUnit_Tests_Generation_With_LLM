// ConvertTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.StringIndexOutOfBoundsException;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Convert}.
* It contains one unit test case for the {@link Convert#init()} method.
*/
class ConvertTest {
		ConvertTest() {
		}
		
		/**
		 * Tests the initial condition, the stream and return value
		 * to satisfy the requirements of the function.
		 */
		@Test
		public void testInit() {
			if (! init()) {
				throw new IllegalStateException("init() failed");
			}
			if (! checkFile()) {
				throw new IllegalStateException("checkFile() failed");
			}
			System.out.println("Passed testInit()...");
		}

        /**
         * Tests to see if a file exists.
         */
        private boolean checkFile() {
            File f1 = new File("file1.mp4");
            boolean result =  f1.exists();
        	System.out.println (result);
            result =  result && f1.isFile();
            return result;
        }
		
		/**
		* Tests to see if an inputstream isn't null.
		*/
		private boolean checkStream() {
        	StringTokenizer tokens = new StringTokenizer("inputstream");
		    boolean result =  tokens.hasMoreTokens();
        	System.out.println (result);
            result = result && tokens.nextToken()!= null;
            return result;
        }
        
        /**
         * Test of the unit test.
         */
        @Test
        public void test() {
            if (!init()) {
                throw new IllegalStateException("init() failed");
            }
        }
}