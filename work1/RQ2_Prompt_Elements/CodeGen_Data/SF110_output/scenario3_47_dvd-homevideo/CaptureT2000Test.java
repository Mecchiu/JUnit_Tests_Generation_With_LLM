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
	 * Default constructor
	 */
	CaptureTest() {
	}

	/**
	 * Tests if the function returns a success value between 0 and 1
	 * on the expected value and 1 on the actual value. 
	 */
	@Test
	public void testCapture() throws IOException {
		

		// Read sample file
		String samplePath = "/Users/sam.kord/Downloads/MyDVD/Sample.txt";
		File sampleFile = new File(samplePath);
			
		// Create files
		BufferedWriter outFile = new BufferedWriter(new FileWriter(sampleFile.getPath()));
		BufferedWriter outVideoFile = new BufferedWriter(new FileWriter("/Users/sam.kord/Downloads/MyDVD/Media2"));
		BufferedWriter outAudioFile = new BufferedWriter(new FileWriter("/Users/sam.kord/Downloads/MyDVD/Media1"));
		BufferedWriter errStream = new BufferedWriter(new FileWriter("/Users/sam.kord/Downloads/MyDVD/error"));
		outVideoFile.write(sampleFile.getPath());
		outVideoFile.write("\n");
		outAudioFile.write(sampleFile.getPath());
		outAudioFile.write("\n");
		outStream.write("\n");
		outStream.write("");
		
		// Capture
		this.init();
		
		
		
		// Get number of frames
		int frames = 0;
		
		// Read the input file
		File f = new File("/Users/sam.kord/Downloads/MyDVD/Media2");
		FileInputStream fin = new FileInputStream(f);
		String line;
		
		// Read the header line from the input file
		do {
			line = fin.readLine();
			
		}
		while(this.getError() &&!line.equals(""));
				
		// Skip the header to the end
		while(!fin.readLine().equals(""));
		
		frames = Integer.parseInt(line.substring(7).trim());
		
		if (this.getError()) {
			// Failed to read the number of frames to read, so show the error message.
			System.err.println(JOptionPane.showMessageDialog(null, "Error read", "Error", JOptionPane.ERROR_MESSAGE));
			
			// Show the error messages as well
			System.err.println(this.getErrors());
			this.getErrors();
			
		
		}
		
		// Close the streams
		fin.close();
		
		// Close the streams
		outFile.close();
		outVideoFile.close();
		outAudioFile.close();
		
		if (this.getError()) {
			// Show the error messages as well
			System.err.println(this.getErrors());
			this.getErrors();
		}

		if (frames > 100) {
			// Should be able to read every frame
			this.getVideoCapture();
		} else {
			// Reads every frame of more than 100 ms
			// This may happen if the video doesn't have enough frames to read 
			// from it.  Read 100 ms to see if we could read as many as possible.
			this.getVideoCapture();
		}
		
		// Wait for the capture done function
		int loop = 0;
		
		while (loop < 1000) {
			boolean done = this.getVideoCapture();
			
			
			if (this.getError()) {
				if (!done) {
					System.err.println(System.currentTimeMillis() + " error");
					this.getErrors();
					System.err.println(System.currentTimeMillis() + " error");
				}
			}
			
			if (done) {
				System.out.println(System.currentTimeMillis() + " successfully read");
				break;
			}
			
			while(System.currentTimeMillis() < 10000) {
				this.getVideoCapture();				
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
			
			loop++;
		}
		
		this.getVideoCapture();
	}
	
	/**
	 * @return
	 */
	public boolean getError() {
		BufferedReader err = null;
		BufferedReader out = null;
		BufferedWriter errStream = null;
		
		// Wait for the output stream
		
		try {
			out = new BufferedReader(new InputStreamReader(System.in));
			throw new Exception("Stopped waiting");
		} catch (FileNotFoundException e) {
			System.err.println(e);
	    } catch (IOException e) {
			System.err.println(e);
			throw new RuntimeException(e);
		} catch (Exception e) {
			System.err.println(e);
			throw new RuntimeException(e);
		}

		try {
			err = new BufferedReader(new InputStreamReader(System.in));
			throw new Exception("Stopped waiting");
		} catch (FileNotFoundException e) {
			System.err.println(e);
	    } catch (IOException e) {
			System.err.println(e);
			throw new RuntimeException(e);
		} catch (Exception e) {
			System.err.println(e);
			throw new RuntimeException(e);
		}
		
		try {
			errStream = new BufferedWriter(new FileWriter("/Users/sam.kord/Downloads/MyDVD/error"));
		} catch (FileNotFoundException e) {
			System.err.println(e);
	    } catch (IOException e) {
			System.err.println(e);
	    } catch (Exception e) {
			System.err.println(e);
			throw new RuntimeException(e);
		}
		
		while (true) {
			if (err.skipLine().equals("")) {
				break;
			}
			
			if (!err.readLine().equals("")) {
				return true;
			}
		}
		
		if (out.skipLine().equals("")) {
			return false;
		}
		
		System.err.println("Stopped reading file: " + out.skipLine());
		
		try {
			errStream.write(out.skipLine());
			
			String errLine;
			if (!err.readLine().equals("ERROR:")) {
				errLine = err.readLine();
			}

				
		} catch (Exception e) {
			System.err.println(e);
			