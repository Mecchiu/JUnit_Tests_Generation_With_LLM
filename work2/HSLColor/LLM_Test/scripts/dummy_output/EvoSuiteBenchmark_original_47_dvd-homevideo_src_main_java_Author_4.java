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
		   
	/**
		* Creates a new instance of AuthorTest
		*/
	public AuthorTest() {
	}
	
	/**
     * Test of CreateDVDFileStructure method, of class Author.
     */
    @Test
    public void testCreateDVDFileStructure() throws IOException, 
			         FileNotFoundException {
		File file = new File("dvdauthor.xml");
        BufferedReader reader = new BufferedReader(new InputStreamReader(Author.class.getResourceAsStream("AuthorTest/AuthorTest.xml"))); 
        System.out.println("Testing CreateDVDFileStructure...");
        int s=0;
        while (reader.ready())
            s++;
        reader.close();
        Author.CreateDVDFileStructure(new GUI(file));
        assertTrue("CreateDVDFileStructure successful!",s>=3);
        System.out.println("Testing CreateDVDFileStructure with test data : " + file.getName());
    }
        
	/**
     * Test of main method of class Author.
     * 
     */
	@Test
    public void testMain(){
    	System.out.println("Testing Main Method");
    	BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        /*String s = */System.in.readLine();
    }
    
    /**
     * Test method for {@link Author#CreateDVDFileStructure(GUI)}.
     * @throws IOException
     * @throws FileNotFoundException
     */
    @Test(expected = FileNotFoundException.class)
    public void testException() throws IOException, FileNotFoundException {
        /*
     *     This creates a file  for test execution.
     */
        File file = new File("dvdauthor.xml");
        String s = "dvdauthor.xml"; 
        System.out.println("Testing CreateDVDFileStructure with test data : " + file.getName());
        
        /*
     *     1. Execute the command that would create a DVD
     */
    }
    
    /**
     * Test method for {@link Author#CreateDVDFileStructure(GUI)}.
     * @throws FileNotFoundException
     * @throws IOException
     */
    @Test(expected = FileNotFoundException.class)
    public void testError() throws FileNotFoundException, IOException {
        /*
         *     1. Execute the command that would create a DVD
         */
        File file = new File("dvdauthor.xml");
        String s = "dvdauthor.xml"; 
        System.out.println("Testing CreateDVDFileStructure with test data : " + file.getName());
        
        /*
         *     2. Execute the command that would create a DVD
         */
    }
    
    /**
     * Test method for {@link Author#CreateDVDFileStructure(GUI)}.
     * @throws FileNotFoundException
     * @throws IOException
     */
    @Test
    public void testError2() throws FileNotFoundException, IOException {
        /*
         *     1. Execute the command that would create a DVD
         */
        File file = new File("dvdauthor.xml");
        String s = "dvdauthor.xml"; 
        System.out.println("Testing CreateDVDFileStructure with test data : " + file.getName());
        
        /*
         *     2. Execute the command that would create a DVD
         */
        new Author().CreateDVDFileStructure(new GUI());
    }
    
    /**
     * Test of errorOutput method, of class Author.
     */
    @Test
    public void testErrorLog() throws IOException {
        String s = "";
        PrintStream ps = new PrintStream(new FileWriter(System.err));
        System.setOut(ps);
        System.out.println("Testing errorOutput method...");
        
        System.out.println("Test errorOutput");
        s = "The line for Error Output will follow.";
        ps = new PrintStream(new FileWriter(System.err));
        throw new RuntimeException(s);
        System.out.println("Test errorOutput with message");
        s = "Test errorOutput - the line for Error Output will follow.";

        String s1 = System.getProperty("user.dir");
        assertTrue(s1 + " is not the current directory.",s1.endsWith("/media"));
        try {
		System.out.println("Test errorOutput with message 2");
		throw new RuntimeException("Test errorOutput with message 2.");
	}
	catch(Exception e){
		
	}
    }
}