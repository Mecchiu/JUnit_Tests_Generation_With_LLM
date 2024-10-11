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
		
    /**
     * Reads audio and video from a dv camcorder.
     */
    public static void main(String[] args) {
        junit.textui.TestRunner.run(CaptureTest.class);
    }

    /**
     * Reads audio and video from a dv camcorder
     */
    public void DV_Capture() {

        String tempdir = "/home/smr/Temp/junit-testdata/capture";
        Runtime.getRuntime().exec("dvgrab  -quiet  "+tempdir);

        String file = tempdir + File.separator + "capture.webcam";

        StringBuffer sb = new StringBuffer();
        sb.append("<html width=" + (2 * 60) + "><body>");
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file));
			writer.write("Hello, World");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        writer.write("<p>Hello, World</p>");
        writer.write("</body>");
        writer.flush();
        writer.close();

        String line ;

        try {
			  new FileReader(file);
		  } catch (FileNotFoundException e) {
        	  e.printStackTrace();
		  }
		  try {
			System.setErr(new StdErr());
			System.setOut(new StdOut());
          BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		  } catch (IOException e) {
			  e.printStackTrace();
		  }

        // Get the contents of the file.
        try {
        line = reader.readLine();
        } catch (IOException e) {
          e.printStackTrace();
        }

        // Now get rid of the pesky \n from the first line, which will
        // be the header.
        line = line.replaceAll("\n", "");

        // Get the first 2 lines.
        String[] data = line.split("\\s+");
        String firstLine = data[1];
        String secondLine =  data[data.length - 2];

        // Now read the captured data into a stringbuffer as bytes
        StringTokenizer tokens = new StringTokenizer(firstLine, "\n");
        StringBuffer sbStr = new StringBuffer();
        while (tokens.hasMoreTokens()) {
          sbStr.append(tokens.nextToken());
          sbStr.append("\n");

        }

        // Print to System.out
        System.err.println(sbStr.toString());

        // Write data to the file
        writer.write(sbStr.toString());

    }
}