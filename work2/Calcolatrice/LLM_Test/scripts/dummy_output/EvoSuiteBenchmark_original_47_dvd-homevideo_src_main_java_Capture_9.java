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
		public CaptureTest() {
		}

		/**
		 * Initialize the class and test a fresh capture
		 */
	@Test
	public void init() throws Exception {
	Capture p = new Capture();

	//test valid input.
	File f = new File("fname");
	p.dvgrab = "dvgrab -autosplit --size 0 --format raw --opendml --buffers 200 dv/fname-";

	try {
		//Capture.main() does nothing for a simple valid input, otherwise the
		//command will fail the test and the user is asked to re-run.
		p.dvgrab = "dvgrab -autosplit --size 0 --format raw --opendml --buffers 200 dv/fname-";

		FileWriter fw = new FileWriter("temp.vid");
		String s = null;

		//Capture.Vide_Capture() does nothing for a simple valid input, otherwise the
		//command will fail the test and the user is asked to re-run.
		p.dvgrab = "dvgrab -autosplit --size 0 --format raw --opendml --buffers 200 dv/fname-";

		// Capture.Vide_Capture() does nothing for a simple valid input, otherwise the
		//command will fail the test and the user is asked to re-run.
		p.dvgrab = "dvgrab -autosplit --size 0 --format raw --opendml --buffers 200 dv/fname-";

		s = p.dvgrab;

		//Capture.Audio_Capture() does nothing for a simple valid input, otherwise the
		//command will fail the test and the user is asked to re-run.
		p.dvgrab = "dvgrab -autosplit --size 0 --format raw --opendml --buffers 200 dv/fname-";

		// Capture.Audio_Capture() does nothing for a simple valid input, otherwise the
		//command will fail the test and the user is asked to re-run.
		p.dvgrab = "dvgrab -autosplit --size 0 --format raw --opendml --buffers 200 dv/fname-";

		// Capture.Vide_Capture() only does some basic validation
		s = p.dvgrab;
		
		fw.append("file/test.vid -f video -n 30 -p 10");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream("test.vid")));
		StringBuffer sb = new StringBuffer(s);
		System.out.println(s);
		String[] lines = br.readLine().split("\n");
		
		StringTokenizer st = new StringTokenizer(lines[2]);
		while(st.hasMoreTokens()) {
			assertEquals("line 2", sb.toString(), st.nextToken());
			sb.setLength(0);
			sb.append(lines[1]);
		}

		// Capture.Audio() only does basic validation
		// sb = Capture.Audio_Capture("file/test.vid -p 10")
		s = p.dvgrab;
		
		br = new BufferedReader(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream("test.vid")));
		lines = br.readLine().split("\n");
		for (int i = 1; i < lines.length; i++) {
			if(lines[i].endsWith("mp3")) {
				assertEquals("mp3 line line 2: ",lines[2].substring(0, lines[2].length() - 2), lines[1]);
			}
		}
		
		// Capture.Vide_Capture() only does basic validation
		s = p.dvgrab;
		
		lines = p.dvgrab.split("\n");
		for (int i = 1; i < lines.length; i++) {
			if(lines[i].endsWith("mp3")) {
				assertEquals("mp3 line line 2: ",lines[2].substring(0, lines[2].length() - 2), lines[1]);
			}
		}
		
		// Capture.File() tests basic validation of filestreams.
		// sb = Capture.File_Capture("file/test.vid")
		s = Capture.File_Capture("file/test.vid");
		/*
		s = Capture.File_Capture("file/dvgrab.bin")
		sb = Capture.File_Capture("file/dvgrab.bin")
		*/
		
		
	} catch (FileNotFoundException e) {
                  System.out.println("Error - file/test.fne not found: " + e.getMessage());
                  p.Error = true;
                throw new RuntimeException(e);
	} catch (IOException e) {
                System.out.println("Error - IOException " + e.getMessage());
                p.Error = true;
                throw new RuntimeException(e);
	}
	}
}