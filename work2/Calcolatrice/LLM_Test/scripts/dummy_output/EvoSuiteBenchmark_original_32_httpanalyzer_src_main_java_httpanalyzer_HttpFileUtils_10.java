// HttpFileUtilsTest.java
package httpanalyzer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.Calendar;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import org.apache.http.HttpEntity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpFileUtils}.
* It contains one unit test case for the {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
*/
class HttpFileUtilsTest {
		private final RandomAccessFile file;
			private final PrintWriter printWriter;
			private final Properties properties;
			private final PrintWriter readWriter;
			private final Calendar cal = Calendar.getInstance();

		/**
		 * Constructor for instantiation of {@link HttpFileUtilsTest}.
		 */
				public HttpFileUtilsTest() {
 		try {
 		     file = new RandomAccessFile("my_files", "rw");
 		 }
 		catch (IOException e) {
			// I don't think there has been a problem for this test at the
			// moment, but it would be better to just exit program.
			e.printStackTrace();
			System.exit(1);
		}
 
 		try {
	    }
	    catch (IOException e){
	    }

	    try {
	    }
	    catch (IOException e) {
	    }

		try {
			properties = new Properties();
			properties.put("host", "www.google.com");
			properties.put("port", "80");
		}
		catch (Exception e) {
			e.printStackTrace();
			//System.exit(1);
		}

		properties.put("file", "fileName");
		properties.put("userid", "userid");
		properties.put("passwd", "passwd");
		properties.put("protetext", "text\r\ndoubleblahblahblah");
		properties.put("protetext2", "text2doubleblahblahblah");
		properties.put("protetext3", "text\r\ndoubleblahblah\noDoubleBlahblah");
		properties.put("protetext4", "text\r\ndoubleblahblah\noDoubleBlahBlah");
		properties.put("protetext5", "text\r\ndoubleblahblah\noDoubleBlahBlah\noDoubleBlahBlah");
		properties.put("port", "0");
		properties.put("file_readonly", "false");
		properties.put("auto_checkout", "true");
		properties.put("auto_cleanup", "false");
	// We want to use 3rd party libraries


		final String path = "D:\\myfile.txt";

	    systemOut.println("Path is "+path);
	    systemOut.println("Testing to get content of file: " + path);
	    
	    try {
		    final HttpEntity entity = new StringMessage().getEntityFromStream(new RandomAccessFile(path, "r/"), properties);
		    file.seek(0);
	    
		    writeEntity(entity, file);
		}
	    catch (Exception ex) {
			System.out.print(ex);
		}
	    

	    try {
		    FileInputStream theFile = new FileInputStream(path);
	    
		    InputStream reader = theFile.getContents();
		    file.setLength(0);
		    printWriter = new PrintWriter(file, "UTF-8", "ignore");
		    readWriter = new PrintWriter(printWriter);
		    
		    writeEntity(new StringEntity("Hello again from the file."), reader);
		    
		    readWriter.close();
		    writeEntity(new StringEntity(readWriter.toString()),  theFile);
		    
		    theFile.close();
	    }
	    catch (Exception ex) {
			//System.out.print(ex);
    		ex.printStackTrace();
		}
	}
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("My Frame");

		frame.setSize(512, 512);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new HttpFileUtilsTest());

		frame.pack();
		frame.setVisible(true);
	}

	/**
	 * @param aHttpEntity
	 * @param file the output stream, must be opened in append mode
	 */
	public void writeEntity(HttpEntity aHttpEntity, RandomAccessFile file) throws IOException {
		// Create a HttpEntity in append mode
		HttpEntity responseEntity = new StringEntity("test");
}
}