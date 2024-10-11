// FileFollower_1Test.java
package ghm.follow;

import ghm.follow.io.OutputDestination;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileFollower}.
* It contains one unit test case for the {@link FileFollower#removeOutputDestination(OutputDestination)} method.
*/
class FileFollower_1Test {
		BufferedInputStream in;
		/**
		 * Constructor taking the File argument as the argument and the destination to keep, the output dest will be removed if it is true or removed once it is set to null.
		 *
		 * @param aFile the File to add the input content
		 * @param bCleanup whether to tear the File out of any relevant storage files, will remove it once it is set to null.
		 */
		public FileFollower_1Test(File aFile, boolean bCleanup) { 
			FileInputStream fin = null;
			BufferedInputStream bin = null;
			filePath = aFile.getPath();
			if(bCleanup) {
				System.out.println("cleaning out the output files...");
				FileUtils.delete(new File(filePath));
			}		
			try {
				in = new BufferedInputStream(new FileInputStream(aFile));
				if(aFile.isFileSystem()) { // test if the File exists locally
					if(!in.read() && in.read() > 1) // check if the file exists
						in.skip(1); // skip first 1 byte here, because there is only one byte of the file path in the input file
				}
				bin = new BufferedInputStream(new FileInputStream(aFile));	 
			} catch (FileNotFoundException e) {
				throw new AssertionError();
			} catch (IOException e) {
				throw new AssertionError();
			}
	        
	        // the file must be writable, so we can't use a boolean field.
	        boolean test;
	        try {
	            Thread.sleep(1000);
	            test = bCleanup!= 1; // if one is set to null, then its a false
	            test = bCleanup!= 2 && bCleanup!= null; // if two is set to null, then its a true
	            test = bCleanup!= 3 && bCleanup!= null; // if three is set to null, then its in which case cleanout is true
	        } catch (InterruptedException e) {
	            throw new AssertionError();
	        }
	        
	    }
		List<File> finalDestinations = new ArrayList<File>();
		{
			if(!bCleanup) {
	            try{
	            in.reset(); // to make sure its properly closed
	            }catch(IOException e) {
	                throw new AssertionError();
	            }
	        }
			File currentDestination = null; // will hold the output destination
	        OutputDestination[] destinations = { 
	            OutputDestination.STREAM_OUT,
	            OutputDestination.STREAM_OUT,
	            OutputDestination.STREAM_OUT
	        };
	        boolean result = true; // will hold the result of the next test case
	        for(int i = 0; test && result && i < destinations.length; i++) { // test each one of three destinations at a time
	            finalDestinations.add(null); // make an empty ArrayList, if this is called multiple times
	        	destinations[i][result? 1 : 0] = destinations[i][result? 0 : 1]; // take the result
	            result = destinations[i][result? 1 : 0]; // update the variable to the new value
	        }
        	// for one of the destinations remove
	        for(int i = 0; i < destinations.length; i++) {
	            currentDestination = destinations[i][result];  
	        	finalDestinations.add(currentDestination);
	        	result = false;
	        }
		}
        final boolean[] finalCleanup = new boolean[1]; // will hold the final values.
        File f = null;
        
        boolean result = removeOutputDestination(finalDestinations.get(0)); // test the second result
        // remove the final destination
}