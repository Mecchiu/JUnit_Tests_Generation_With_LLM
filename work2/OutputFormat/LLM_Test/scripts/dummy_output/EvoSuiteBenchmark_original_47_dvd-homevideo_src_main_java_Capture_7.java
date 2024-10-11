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
		static String dvgrab;
	
	protected static void Dvgrab() {
                try {
                        dvgrab = FileSystemView.getView().getNativeSeparator();
                        System.out.println("\n" + dvgrab + "   -  -  " + "\n");
                } catch (IOException ex) {
                        fail("Test failed");
                }
        }
		

	   private static void test(String fileSuffix, int min, int sec, GUIPrinterDVDVideo gpwv) throws IOException {

//		    System.out.println("Starting capture test " + min + " " + sec);

//		    Dvgrab(fileSuffix);
//		    Dvgrab(fileSuffix, min, sec);
//
//		    Dvgrab(fileSuffix);
//
//		    Dvgrab(fileSuffix, min, sec, gpwv);
//
//		    Dvgrab(fileSuffix);
//
//		
//		
//		
//		
//	    	String in = "";
//	    	System.out.println("File:" + fileSuffix + "\n");
//	    	//File f = new File(fileSuffix);
//	    	//f = f.getAbsoluteFile();
//	    	
//	    	FileReader in = new FileReader(fileSuffix);
//	    	BufferedReader data = new BufferedReader(in);
//
//
//	    	  	String theLine;
//	    	  	boolean bExit;
//	    	  	//boolean bExit = true;	//If true then we exit the program after successfully capturing
//	    	  	int i = 0;
//	    	  	while ((theLine = data.readLine())!= null) {
//	    	  	 i++;
//	    	    in.close();
//	    	      m_GUI = gpwv;
//
//    	    	  	while ((theLine = data.readLine())!= null) {
//    	    	  		data.close();
//    	    	  	}
//    	    	  	i = 0;
//    	    	  	
//    	    	  	File videoFile = new File(fileSuffix);
//    	    	  	VideoComponent testVc = new VideoComponent(videoFile);
//	    	  	    testVc.pack();
//	    	  	    bExit = true;
//	    	  	}

//	    	  	in.close();
//	    	  	m_GUI = gpwv;
                   //m_GUI = gpwv;
		
		
//			if (dvgrab!= "dvgrab --autosplit --output-format png --opendml" + "" + " --size 10 --format pnhv_file-") {     
//			            System.out.println("\nTESTING: Dvgrab - Not using a video file:" + fileSuffix + "  ERROR: " + dvgrab + "  -  " + "\n");    
//			return;
//			}
}
}