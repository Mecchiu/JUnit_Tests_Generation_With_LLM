// AuthorTest.java


import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Author}.
* It contains one unit test case for the {@link Author#CreateDVDFileStructure(GUI)} method.
*/
class AuthorTest {
		private final int m_Volume = 100;
		private final String m_Title = "dvdauthor -x vmgm.xml";
		private final String m_AuthorName = "dvdauthor -x vmgm.xml";

				/**
				* Create the authorTest
				* @param   GUI This is the GUI object used to check and play
				*/
//		public static void main(String[] args) {
//		   AuthorTest authorTest = new AuthorTest();
//		   /*
                new
                AuthorTest
                ().testAuthorCreatingDVD()
                // This is the test. The last element will be the file containing this function.
//		   .testAuthorCreatingDVD();
//
//		    return;
//
//		}
		/**
		* Constructor for test1.
		* This method creates a new AuthorTest.
		*/
		AuthorTest() {
		}

	/**
	* Constructor for test2.
	* This method creates a new AuthorTest.
	* @param   arg This parameter may be specified, if it is set to null
	*               it will use default values
	*/
	AuthorTest(String arg) {
//		System.out.println(arg);
	}

	/**
	* Test method for {@link Author#CreateDVDFileStructure(GUI)}.
	*/
	@Test
	public void testAuthorCreatingDVD() {

		System.out.println("authorTest.testAuthorCreatingDVD");
		GUI g = new GUI();

		StringBuilder sb = new StringBuilder();

		try {
			/* This is the test for CreateDVDFileStructure() */
			AuthorTest ad = new AuthorTest("Test1");

			AuthorTest.testAuthorCreatingDVD();

		} catch (NoSuchElementException nse) {
			sb.append(m_AuthorName + " is not an author.");
		}

		g.writeStatusInfo("Author", "Author '" + sb.toString() + "' created.");

		try {
			g.writeStatusInfo("Author", "Author '" + m_AuthorName + "' generated.");
		} catch (Exception e) {}

	}

	/**
         * Tests if two objects of different types are equal but are of different types.
         * @param  ob  {@link String}
         *, @param  ao   {@link String}
         * @return       {@code true} or {@code false}
         */
        @Test
	public boolean testAuthorCreatingDVD() {
		System.out.println("authorTest.testAuthorCreatingDVD");

		GUI g = new GUI();


		StringBuilder sb = new StringBuilder();

		try {
			/* This is the test for CreateDVDFileStructure() */
			AuthorTest c = new AuthorTest("Test2");

			AuthorTest n = new AuthorTest("Test1");

			AuthorTest r = new AuthorTest("Test2");

			AuthorTest.testAuthorCreatingDVD();

		} catch (NoSuchElementException nse) {
			System.out.println("An error occurred in test1: " + nse.toString());

			return false;
		} catch (Exception e) {
			System.out.println("An error occurred in test1, and we got exception: " + e.toString());
			return false;
		}

		g.writeStatusInfo("Author", "Author '" + sb.toString() + "' created.");

        try {

        g.writeStatusInfo("Author", "Author '" + m_AuthorName + "' generated.");

        } catch (Exception e) {}

        return true;
	}

        @Test
	public void runTests() throws IllegalArgumentException, IllegalStateException, FileNotFoundException, FileExistsException, IOException {
            /* This is the test for CreateDVDFileStructure() */
        try {
			AuthorTest.testAuthorCreatingDVD();

        } catch (Exception e) {
            System.out.println("An error occurred in test1, and we got exception: " + e.toString());
        }

        //This causes an exception
        System.exit(0);

    }


        /**
         * This method runs a test using CreateDVDFileStructure()
         * in conjunction with the current GUI.
         */
        @Test
        public void testAuthorCreatingDVD() {

                Console();
                System.out.println("authorTest.testAuthorCreatingDVD");

				try {
					GUI g = new GUI();


					AuthorTest.testAuthorCreatingDVD();

				} catch (Exception e) {
					System.out.println("An error occurred in test1, and we got exception: " + e.toString());
				}


				//This causes an exception
				System.exit(0);

        }



}