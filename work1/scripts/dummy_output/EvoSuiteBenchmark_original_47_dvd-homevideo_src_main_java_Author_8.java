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
		
    //private static String m_FileString = "authorTestFile.txt";
    private int m_NumOfPlayers = 1;
    private int m_FileCount = 1;

	/**
	 * create a new instance of AuthorTest
	 */
	public AuthorTest() {
		// TODO Auto-generated constructor stub
	}
	
	/*
    * Check if the user selected the number of players in the input
		 * file. If the file doesn't exist it will try to create it and return
		 * False
		 * @return  True if the file's created successfully, false if the file
		 * doesn't exist
	 */
    public boolean CreateFileCount(InputStream input) {
        String  retstr = "\nfileNotFound: ";
        buff.clear();
        
        for(int i=0; i < 5; i++) {
        	buff.append(input.readLine());
        }
        input.close();   // Close the Input Stream
        return (buff.toString().equals(retstr));
    }
	
	
	/*
    * If the user does not press enter in the enter
    * it will try to get the current player number.
		 * @return  The current number of the player
		 */
    public String GetCurrentPlayer() {    // In this method we create a dummy object, we just return the number
        String  retstr = "\nplayerNotFound: ";
        return (retstr);
    }
    private String m_File = "samples/author.dvdauthor.mpg";

    /**
     * Creates a new instance of AuthorTest
     * @see
     */
    public String m_FilePath() {
    	return m_File;
    }
    
    
    /**
     * Main Program body.
     * If the test fails, the argument passed to this method will be the error
     * text which will be overwritten by the function
	 * 
	 * @param args
	 */
    public static void main(String[] args) {

    }
        
    /**
     * The test's purpose is to generate a series of "player.samples"
     * files.  On success it will call the class {@link CreateFileCount} 
     * to generate the "player.samples" files with correct player number and 
     * a new FileWriter object and a new BufferedWriter object to contain
     * the output.  
     * @return  Return true if a file is created.  Return false if there are no
     * samples to be generated
	 * @throws IOException
     */
	public boolean GenTestInput() {
		
		String newFile = m_BaseErr + "Error: ";

		PrintStream outfile = null;
        
		File file = new File(m_File);
		
		try {
			file.createNewFile();
			outfile = new PrintStream(new FileWriter(file, true));
		}
		catch(IOException ioe) {
			return false;
		}
		
        
		try {
			outfile.print(newFile);
		} 
		catch (IOException ioe) {
			outfile.close();
			return false;
		}
		
		outfile.close();
		file.delete();

		// Now we write all the samples with the playernumber, we expect 
		// to find the output FilePath. 
		return (m_FilePath() == file.toString());
	}

	
	
	
	
}