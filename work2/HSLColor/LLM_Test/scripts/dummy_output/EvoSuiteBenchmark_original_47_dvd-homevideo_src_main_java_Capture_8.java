// CaptureTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Capture}.
* It contains one unit test case for the {@link Capture#init()} method.
*/
class CaptureTest {
		private int m_Minutes;
		private int m_Seconds;

		/**
		 * Constructer for CaptureTest.java
		 * @param   min     The amount of time in minuts
		 * @param   sec     The amount of time in seconds
		 */
		public CaptureTest(int min, int sec) {
			m_Minutes = min;
			m_Seconds = sec;
		}

		/**
		 * Basic test method of CaptureTest.java
		 * @throws UnsupportedOperationException
		 */
		@Test
		public void basicTest() throws UnsupportedOperationException{

			String testname = CaptureTest.class.getName() + this::test;

			init();

			JOptionPane.showMessageDialog(null,
                    "Click the button in the test field below to capture audio and video for 2.0", 
					"2.0 Capturing",
					JOptionPane.ERROR_MESSAGE);


			try {
                Thread.sleep(m_Seconds);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			new Capture(m_Minutes, m_Seconds, null).run();
		}

		/**
		 * Creates a test field to test the {@code init()} method of {@link CaptureTest}.
		 */
		protected String test() {
			
			String name = "CaptureTest";
			String test = CaptureTest.class.getName();
			String base = "Capture Test";

			new CaptureTest(
                    m_Minutes - 10,
                    m_Seconds - 20
            ).init();

			try {
				Thread.sleep(m_Seconds * 1.5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			new CaptureTest(
                    m_Minutes - 10,
                    m_Seconds
            )
			.init();
			
			new CaptureTest(
                    m_Minutes - 10,
                    m_Seconds - 20
            ).init();

            System.gc();

			Thread.sleep(m_Seconds * 1.5);

            // check that no error occured by timer
            assertTrue(null!= m_GUI.getError());

            // check that the base name was reset correctly
            assertTrue("name not reset ",
                       test.compareTo(base) == 0);

			// clear the base field
			new CaptureTest(
                    m_Minutes - 10,
                    m_Seconds
            )
			.setBase(null);

			new CaptureTest(
                    m_Minutes - 10,
                    m_Seconds - 10
            ).setBase(null);

            return test;
		}

		/**
		 * Checks that the {@code Runnable} has been set to the appropriate
		 * thread.
		 */
		private void checkTest()
		{
            assertEquals("Test not set correctly.",
                        this.test(), this.getTest());
		}
        
	private void assertTrue(boolean condition)
	{
	    if (!condition) {
	        throw new RuntimeException("test result not true.");
	    }
	}

    private String newInputName = null;
    /**
     * Creates a new instance of CaptureTest
     */
    public CaptureTest() {
    }

    private String createInputFileName(String rootFolder, String testName) {
    	assertNotNull("createInputFileName() is never null", newInputName);
        String test = testName + ".dvgrab";
        return new InputStreamReader(System.in).readLine().replaceAll(" ", "\r");
    	new InputStreamReader(System.in).close();
    	String input = "\"" + test + "\"";
    	String output = System.getProperty("user.dir") + "/out/capture_" + test + ".dvgrab" + System.getProperty("file.separator");
    	File file;
        if ((file = new File(rootFolder, output)) == null) {
            file = new File(System.getProperty("user.dir") + "/out/capture_" + test);
        }
        file.deleteOnExit();

    	// check if file doesnt exist
    	assertTrue("createInputFileName() should return false", file.exists());
        try {
            createNewFile(file);
        }
        catch(Exception e ) {
            System.err.println("Unable to create file: "+file.getAbsolutePath());
            e.printStackTrace();
        }
        return input;
   }

   /**
    * Create a new file in a temp folder
    * @param fileName
    */
    private void createNewFile(File tempdir)
    {
        String fileName = newInputName + ".dvgrab";
        try {
            FileWriter fw = new FileWriter(fileName);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("\"" + System.getProperty("user.dir") + "/temp/out/"+fileName);
            bw.close();
            fw.close();
        }
        catch(FileNotFoundException e) {
            System.err.println("Unable to create file: "+e.getMessage());
            e.printStackTrace();
        }
    }

    /** Run the test
     * @throws UnsupportedOperationException */
    @Test
    public void createInputFile() throws UnsupportedOperationException{
}
}