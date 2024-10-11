// GUI_1Test.java


//import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileFilter;
import java.awt.Color;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GUI}.
* It contains one unit test case for the {@link GUI#MessageBox(String)} method.
*/
class GUI_1Test {
		
    /* *************************************
  * test code
  * *************************************/
	@Test
    public void test1() throws Exception {
		
        /*
         * This unit test does very little testing of our 
         * classes. We have to make sure we're passing 
         * the input in the right order when the text 
         * is returned to the user. 
         */
        String aString = "I am an international text";
        String result =GUI.MessageBox("This is a test");
        assertEquals(aString, result);
        
     }
	@Test
    public void test2() throws Exception {
    	JFileChooser chooser = new JFileChooser();
		String filename = "dvd-homevideo";
		chooser.setCurrentDirectory(new File("."));
		File testFile = chooser.showDialog(null, "Test file");
		String filename = testFile.getName();
		String testPath = filename.substring(3);
		chooser.setCurrentDirectory(new File(filename));
		
		FileReader in = new FileReader(testFile);
		String testString = "";
		int c;
		while((c = in.read())!= -1) {
			testString += c;
		}
		in.close();
		String retString = testString.replace("\r", "").trim();
		assertTrue(retString.toString().equals(filename));
        
		/*
		** Test
		*/
        File testFileParent = new File(".");
        String testFileParentPath = testFileParent.getCanonicalPath();
        String testPath = filename.substring(3);
        chooser = JFileChooser.chooseFile("Test file", myTestFile1, FileFilter.accept("pdf", "dvd")) ;
        testFile = chooser.getSelectedFile();
        String testFilePath = testFile.getCanonicalPath();
        System.out.println(testFilePath);
        String testStringParent = testString.split("\\|")[0];
        assertTrue(testStringParent.equals(testFileParentPath));
        String testFileText = testFile.getCanonicalPath();
        System.out.println(testFilePath);
        System.out.println(testStringParent);
        //assertTrue(testFileParent.renameTo(new File(testPath+"/"+testFileParentPath)));
        
		/*
		** Test
		*/
        File testFileChild1 = new File("test1.txt");
        String testFileChild1Path = testFileChild1.getCanonicalPath();
        String testStringChild1 = "I am a text in my file";
        chooser = JFileChooser.chooseFile("Test file", testFileChild1);
        testFile = chooser.getSelectedFile();
        String testFilePathChild1 = testFile.getCanonicalPath();
        System.out.println(testFilePathChild1);
        System.out.println(testFileChild1Path);
        //assertTrue(testFileChild1.renameTo(new File(testPath+"/"+testFileChild1Path)));
        boolean done = false;
        while (!done ){
        	String testStringChild1New = "This is text";
        	System.out.println("Text is " + testStringChild1);
        	String testStringChild1 = "The text is " + testStringChild1New;
        	String testString1 = "The text is " + testStringChild1New;
            InputStreamReader in = null;
            try {
            	in = new InputStreamReader(System.in);
            } catch (FileNotFoundException ex) {
            	System.out.println(ex);
            	in = null;
            	fail("Problem with input stream.");
            } 
            //String text = null;
            //String text = new StringBuffer(1024).append(testStringChild1).append(testStringChild1New).toString(); // for test2_2
            //testStringChild1 = new String(text);
            in.reset();
            int c;
            while ((c = in.read())!= -1) {
            	System.out.println(c);
            }
            System.out.println(c);
            System.out.println(testStringChild1);
            System.out.println(testString1);
            done = true;
        }
        
		/*
		** Test
		*/
        File testFileChild2 = new File("test2.txt");
        String testFileChild2Path = testFileChild2.getCanonicalPath();
        System.out.println(testFileChild2Path);        
        System.out.println(testFileChild2);
        System.out.println(testFileChild2Path+" and "+testFileChild2Path);
        boolean done2 = false;
}
}