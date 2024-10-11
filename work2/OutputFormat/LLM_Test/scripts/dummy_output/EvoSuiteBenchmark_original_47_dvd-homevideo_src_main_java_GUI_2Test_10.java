// GUI_2Test.java


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
* It contains one unit test case for the {@link GUI#ErrorCheck(String)} method.
*/
class GUI_2Test {
		
    // TODO: Write this
	String filePath = "/home/ssanner/Document Files/DVDHomeVideo" ;
	String fileName = "ErrorTest.vhd";
	String fileName2 = "ErrorTest.snd";
	String fileName3 = "ErrorTest.rvw" ;
	String path = "res/homevideo/dv-homevideo";
    String fileName12 = "homevideo.rif" ;
    int dvd_id = 0 ;

		/**
		* @param args to be passed to run the test
		*/
    public static void main(String args[]) {
                    System.exit(new GUI_2Test().test(args));
            }
    	
        @Test
            void test_ErrorCheck_1() throws FileNotFoundException {
                final Thread thr = new Thread(() -> {
                while (true) {
                        try {
                          javax.swing.JOptionPane.showConfirmDialog(
                                  null,  "This will exit, did you want to continue?",
                                  "Test for error", JOptionPane.YES_NO_OPTION,
                                  JOptionPane.WARNING_MESSAGE);
                            //System.out.println("In test_ErrorCheck_1");
                            if (javax.swing.JOptionPane.showConfirmDialog(null, "Continue", "OK", JOptionPane.YES_OPTION,
                                  JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION) {
                                //System.out.println("In test_ErrorCheck_1");
                                //javax.swing.JOptionPane.showMessageDialog(null, "Test successful");
            		   System.exit(0);
                    	return;
           		}
                    } catch (Throwable e) {
                        System.out.println("Failed a test");
                    }
                }

            }   );
        // javax.swing.JOptionPane.showConfirmDialog(null, "Test for error", "OK", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);  
        // System.out.println(" In test_ErrorCheck_1");
        
     // TODO: test for new error messages from "ErrorCheck.py" file
    }

    @Test
    void test() throws FileNotFoundException {
        //String path = "res/homevideo/dv-homevideo";
        String path = "/home/ssanner/Documents" ;

        assertNull(GUI.ErrorCheck("file.mp3"));
    }  

        @Test
    void test_ErrorCheck_2() throws IOException{


       	String path = "res/homevideo/dv-homevideo";

        BufferedReader br= new BufferedReader(new FileReader(path));
        String str="";
        String line="";
        while ( (line=br.readLine())!= null ) {
            str = str + line;
        }

        System.out.println(str);

        assertTrue(str.startsWith("Error check for homevideo.mkv"));
        assertTrue(ErrorCheck(path+"/homevideo.mkv"));

    } 


    @Test
    void test_ErrorCheck_3() throws FileNotFoundException {
        String path = "res/homevideo/dv-homevideo";

        assertEquals(ErrorCheck(path+"/homevideo.mkv"), true);
    }

    @Test
    void test_ErrorCheck_4() throws IOException {


       String path = "/home/ssanner/homevideo/dv-homevideo";

        String fileName = "/home/ssanner/homevideo/dv-homevideo.mkv";
        File f= new File(fileName);
        System.out.println(f);

        BufferedReader br= new BufferedReader(new FileReader(fileName));
        File tempDir=new File(path);
        tempDir.mkdir();
        f = new File(fileName+"");
        int flag= tempDir.list().length;
        int num =0;

        for (String entry : tempDir.list()){
            if(entry.toLowerCase().endsWith(".mkv"))
                {num++;
                }

        }


        if(num<=flag) {
               System.out.println("List not in directory:" + fileName.substring(0,-1));
               return;
           }


       try {
            int returnFlag=ErrorCheck(fileName);
            System.err.println("Flag:" + returnFlag);
        }
        catch (RuntimeException e) {
            System.err.println("Fail.");
        }

    }


    /**
     * Test that checks for error in the output stream of homevideo.mkv
     *
     **/
    @Test
    void test_ErrorCheck_5_2() throws IOException{

        System.out.println("test_ErrorCheck_5_2");


        System.out.println("ErrorCheck Check for homevideo.mkv");

        //this is just a test to ensure a file is read properly
        File f=new File("/home/ssanner/homevideo/dv-homevideo.mkv");
        f=new File(f.getPath() );

        f.delete();

        f.deleteOnExit();

        //File f=new File("res/homevideo/dv-homevideo.mkv");

        File f2= new File(f.getPath()+".mkv");

        assertTrue(f2.exists());
    }

}