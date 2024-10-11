// BurnTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Burn}.
* It contains one unit test case for the {@link Burn#BurnToDVD(GUI)} method.
*/
class BurnTest {
		@Test
		public void testBurn() throws Exception {
			 // create the test file
			FileWriter fw;
			BufferedWriter BW;
			try {
				FileWriter fw = new FileWriter(
					"temp/DVD/BurnToDemo/Burn" +
					Test.class.getName() +
					".txt");
				BufferedReader inBuff = new BufferedReader(
					new InputStreamReader(System.in));
				assertEquals(2, inBuff.readLine().split(",")[0].split(" ")[0].trim().length());
				BW = new BufferedWriter(fw);
				//burnToDemo
				BW.write("BurnToDemo --DVD -speed=0 -Z /dev/system");
				BW.newLine();
				BW.flush();
				//test it
				assertEquals(true, Burn.BurnToDVD("BurnToDemo --DVD -speed=0 -Z /dev/system"));

				}
			catch (NullPointerException ex) {
				System.err.println("The BufferedReader and FileWriter classes " +
	"are required by Burn.");
				return;
			}
			catch (Exception ex)
			{
				System.err.println("An unknown exception occured:" + ex.getMessage());
				return;
			}
				FW = new FileWriter("BurnToDemo.txt");
				/*write out the message about Burn to dem to test the error "Burn" is
				thrown if in the process of burning
				the file is read from a file that has not been set up yet.
				The test case of BurnToDVD(GUI) checks to see if the
				"-" option has been used during creation of the test file.
				For a list of options, see the Burn documentation at 
				"Burns" in an appendix of the Burn documentation.
				If not found, will not burn to a DVD.
				For this case I think it was previously tested to check that a
				read at the burn command would actually cause the dvd file
				to be read, with no errors, even though the test file was
				read on write.
				In order for this to work the dvd-home needs to run the
				"-dvd-homevideo" command (but the default is dvd-homevideo).
				I have not found a way to determine the command - which one to use.
				However, for now we'll just go with this behavior for this
				case, so that the test file can be created from scratch - no
				files have it.
				*/

				BW.write("BurnToDemo --DVD -speed=1 ; -dvd-homevideo temp/DVD/Burn" +
			" --DVD -speed=0 -Z /dev/system");
				BW.newLine();
				BW.flush();

				assertEquals(true, false);
			}
}