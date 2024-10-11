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
		
    /* Name of the tests and methods used in this class. */
    private static final String MODULE_NAME = "Author";
    private static final String TEST_FILE = "AuthorFile.java";
	private static final String EXP_VGM = TEST_FILE.replaceFirst("TESTING", "VGM");

	/**
	 * Test for calling CreateDVDFileStructure function.
	 */
    @Test
    void Test001() throws FileNotFoundException, IOException {
    	/* Creates a new instance of AuthorTest */
    	Author test = new Author();
    	OutputStream m_ost = new FileOutputStream("Author.java");
    	test.SetOutput(new PrintStream(m_ost));

    	InputStreamReader m_ir = new BufferedReader(new InputStreamReader(System.in));
        File F = new File(".");
        File E;

        try {
            String s1;
            while ((s1 = m_ir.readLine())!= null) {
            	E = new File(F, s1);

            	test.CreateDVDFileStructure(F.getName().toString());
                m_ost.close();
            }
        } catch (FileNotFoundException e1) {
        	// OK
        }
    }

// Create a test to be run.

		
	/**
	 * The test for CreateDVDFileStructure function.
	 * Each input string parameter to the function is converted to a
	 * delimited StringTokenizer using a split() operation, using only
	 * the first item in the input string as the first token.
	 */
	@Test
	void Test002() throws IOException, NoSuchElementException{
		
		StringTokenizer s1 = null;

		BufferedReader br = null;
		try {
		    File F;
		    // Create a Test file, we need to check if it exists and the format.
		    F = new File("test.txt");
		    System.out.println("Testing file: "+F.getName());
		    // Creates a reader for the file. InputStreamReader is used to see the text we want.
		    InputStreamReader fhri = new BufferedReader(new InputStreamReader(new FileInputStream(F)));

		    String s2;
		    while ((s2 = fhri.readLine())!= null) {
		    	s1 = new StringTokenizer(s2, "\n"); // Split on the '\n'
		    	System.out.println(s1.nextToken()); // Returns 1st item
		    }

			// The StringTokenizer gives us the first token as the first token. This is required.
			// TODO: Create a BufferedReader so that I can read all of the string at once.
		    
			boolean e = false;
			StringTokenizer s4 = null;
			while ((s4 = s1)!= null &&! e){
				StringTokenizer st = new StringTokenizer(s4.nextToken());
				if(st!=null){
					if(st.hasMoreTokens()){
						System.out.println("Starting string:  "+st.nextToken());
						System.out.println("This is  a   String with a comment:");
						st=new StringTokenizer(st.nextToken());
						while (st.hasMoreTokens() &&!e) {
							if(st.nextToken()!= "" && st.hasMoreTokens()) {
								if(st.nextToken()!= "<!--"[0]) {
									System.out.println("  '"+st.nextToken()+"':");
									// System.out.println( st.nextToken());
									s4=new StringTokenizer(st.nextToken());
									s4.nextToken(); // This is required
									e=true;
								} else {
								}
							} else {
							}
						}
					}
				} else {
					System.out.println("This  String has no comment.  Starting string:  "+st.nextToken());
					st=new StringTokenizer(st.nextToken());
					while (st.hasMoreTokens() && e) {
						if(st.nextToken()!= "<!--"[0]) {
							e=false;
						} else {
						}
					}
				}
				
			}

			if(!e) {
				System.out.println("TODO: Error!  Expected error condition.");
				assertTrue(0); // Assert that Test001 is not to be run
	    	}
		} finally {
			try {
				if (br!=null) br.close (); // Closing the file
				fhri.close(); // Closing the file
			} catch (IOException ioe) {
				assertTrue(0); // Assert that Test001 is not to be run
	    	}
		}
	}

// Create a Test to be run.

	@Test
	void Test003() throws FileNotFoundException, IOException, NoSuchElementException{
		File f;
    	FileOutputStream out = new FileOutputStream("DVDFiles.txt");
    	System.out.println("Testing file: "+"DVDFiles.txt");
    	f = new File("DVDFiles.txt");
    	StringTokenizer t = new StringTokenizer(EXP_VGM);
    	String last = t.nextToken();
    	if(last == "END") {
    		System.out.println("END test.");
    		System.out.println("Testing file: "+"DVDFiles.txt");
    	} else {
    		String t1 = t.nextToken();
    		if(t.hasMoreTokens()) {
    			System.out.println("> " + t1 );
    		}
    		if(t.hasMoreTokens()) {
    			String next = t.nextToken();
    			if(next.contains("\"")) t1=next.substring(0, 3); //Remove the \" so that its the key
    			System.out.println(t1);
    			f.mkdir();
    		} else {
    			System.out.println("Expecting key in: "+EXP_VGM+"  at line 1");
    		}
    	}
	
    	PrintStream pw = new BufferedWriter(new FileWriter(f, false));
}
}