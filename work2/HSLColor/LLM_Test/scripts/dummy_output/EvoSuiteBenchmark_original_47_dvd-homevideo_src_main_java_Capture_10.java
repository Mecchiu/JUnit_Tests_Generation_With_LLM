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
		
    // Create a local file for testing output
    private static final String dvFileName = 
      "CaptureTest.java";
    private static final String dvFile = 
      File.createTempFile("dvFile", ".dv").getAbsolutePath();
    private static final String DvcamcorderFilename = 
      File.createTempFile("DvcamcorderFilename", ".dv").getPath();

    void Capture_Test() {

        Capture instance  = new Capture(7, 15, null);
        instance.start();
        instance.join();

        instance.init();

		//check error
		String strMessage = m_GUI.checkTextMessage(dvFileName, m_Minutes, m_Seconds);
		System.err.println(strMessage);
		System.out.println("Error occured: " + strMessage);

		//Check to see if a file is in the proper path. if wrong then error message
		assertEquals(String.format("File name \"%1$s\" is wrong.",dvFile)+"",
			dvFile, dvFileName);
		
		//check to see if file is in proper location
		File f = new File(DvcamcorderFilename);
		assertEquals("File is not a valid file! File:"+f.getAbsolutePath(), "true",
			f.exists());

		//Check to see if the file is readable
		assertTrue("File is not readable! File:"+f.getAbsolutePath(),
			f.canRead());

		//Check to see if the file is writable
		assertFalse("File is not writable! File:"+f.getAbsolutePath(),
			f.canWrite());
		

		//Check to see if both arguments are set
		File f1 = new File(dvFile);
		String str1 = "File:"+f1.getAbsolutePath();
		System.err.println(str1);
		assertNotNull("Unable to create a new File for capture test",
			f1);

		//Check to see if both arguments are non-null
		File f2 = null;
		String str2 = null;
		boolean flag =  f1==null;
		try{
			assertNotNull("Unable to create a new File for capture test", f1);
			assertNotNull("Unable to create a new File for capture test", f2);
			str2 = m_GUI.checkTextMessage(f2.toString(), m_Minutes, m_Seconds);
		}catch(Exception e){
			fail("There was another error");
		}
		flag = (flag &&!str2.equals(""));
		
		//Check to see if both arguments are equal
		if(flag) {
			str1 =m_GUI.checkTextMessage(f1.toString(), m_Minutes, m_Seconds);
			assertNotNull("Unable to create a new File for capture test", f1);
			str2 =m_GUI.checkTextMessage(f2.toString(), m_Minutes, m_Seconds);
		}

		//System.err.println("Results: "+str2+"\n\t"+str1);

		//Write a file with two tokens in the form: "test" and "test"
		//(the first is used as the filename)
		FileWriter fw1 = null;
		BufferedWriter bw1 = null;
		try{
			bw1 = new BufferedWriter(new FileWriter(f1,true));
			bw1.write(String.format("%1$tb%1$t2 %1$tS ", new Date()));
			bw1.newLine();
			bw1.write("test");
			bw1.newLine();

		}catch(Exception e){
			System.err.println("Could not generate a new file");
			e.printStackTrace();
		}
		
		try {
			fw1 = new FileWriter(DvFileName, true);
			bw1 = new BufferedWriter(fw1);
			bw1.write("This message will be the filename.");
			bw1.newLine();
			bw1.write("This message will be the message of the second attempt.");
			bw1.newLine();
		} catch(Exception e) {
			fail("Error creating new file: " + e.getMessage());
		}		

		//Check to see if the file was written correctly.
		try {
			bw1 = new BufferedWriter(fw1);
			bw1.write("Test");
			bw1.newLine();
			bw1.close();
			bw1.write(String.format("No error occurred! File: %1$s",f1.getAbsolutePath()));
			bw1.newLine();
		}
		catch(Exception e)
			{
			System.err.println(e.getMessage());
		}

		//Check the date-time stamp.
		assertEquals("Unable to parse file timestamp", "2015-02-02 04:14:59.23",
			DvcamcorderFilename);
	}

}