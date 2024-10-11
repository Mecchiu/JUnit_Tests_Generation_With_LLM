// DocumentTest.java


import java.io.*;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Document}.
* It contains one unit test case for the {@link Document#stringify()} method.
*/
class DocumentTest {
		private static final int INITIAL_SIZE = 8192;
		private String fileLocation;
		private int count;

		// Test class for strings and lines of text that can be read as a
		//  text file
		public DocumentTest(String f) throws IOException {
			fileLocation = f;
			count = INITIAL_SIZE;
		}
		// Reads text from a local file
		public void readText(String f) throws IOException{
    	Vector<Character> chars = new Vector<>();
			InputStream fis = new FileInputStream(f);
			Reader reader = new InputStreamReader(fis);
    	reader.read();
    	StringBuilder sb = new StringBuilder();
    	String line;
    	while((line = reader.readLine())!= null) {
    	    sb.append(line);
    	    chars.addElement(line.charAt(0));
    	}
    	chars.trimToSize();
    	System.out.println(sb.toString());
    	this.count = chars.size();
	}
		// Write text to a remote file
		public void writeText(String f) throws IOException{
    	Writer w = new OutputStreamWriter(new FileOutputStream(f), "UTF-8");
    	System.out.println("Writing\t" + f + "\t\t" + f.length());

    	w.write(FileWriter.SEPARATOR.charAt(0));
    	for (char c : f.toCharArray()) {
    	    w.write(c);
    	}
    	w.close();
    	System.out.println("\t" + f + "\t\t" + f.length());
		}
		private void assertEquals(String msg, String s1, String s2) {
			assertEquals(msg, s1, s2);
		}
		/**
		* Tests writing a string to a file
		*/
    public void testString() {
		try {
			FileOutputStream fos = new FileOutputStream(fileLocation);

			// FileWriter.SEPARATOR will write \n if there is no
			//	line terminator defined. Therefore, we have to add one 
			String s = "This is a really long string that should include the line 
			  terminator and whitespace characters.";

			Integer lastSize = new Integer();
			fos.write(FSEndHeader.length(s == null)? FileWriter.SEPARATOR.charAt(0) : s.length());
			for (String line : s.split("\n")) {
				fos.write(FileWriter.SEPARATOR.charAt(0));
				fos.write(line.getBytes("UTF-8"));
				fos.write(FSEndHeader.length(s==null)+FSEndHeader.length(line)+FileWriter.SEPARATOR.charAt(0));
				assertEquals(FSEndHeader.length(s==null)+FSEndHeader.length(line),"", line);
				lastSize = getInt(lastSize);
			}
			fos.write(FSEndHeader.length(s == null)+FSEndHeader.length(s+""), FileWriter.SEPARATOR.charAt(0));
			assertEquals(FSEndHeader.length(s==null)+FSEndHeader.length(s)+FileWriter.SEPARATOR.charAt(0), "", s);
			assertEquals(lastSize.toString(), "", s);

			// Now write multiple lines; each line will contain one or more
			//  whitespaces.
			fos.write(FSEndHeader.length(s == null)? FileWriter.SEPARATOR.charAt(0) : s.length());
			for (String line : s.split("\n")) {
				fos.write(FileWriter.SEPARATOR.charAt(0));
				fos.write(line.getBytes("UTF-8"));
			}
			fos.write(FSEndHeader.length(s==null)+FSEndHeader.length(s+"\n"),
				FileWriter.SEPARATOR.charAt(0));
			assertEquals(FSEndHeader.length(null)+FSEndHeader.length(s+"\n"), fos.getBuffer().toString());
			lastSize = new Integer();
			fos.write(FSEndHeader.length(s==null)+FSEndHeader.length(s)
			+ FSEndHeader.length(s+"\n")+FSEndHeader.length(s));
			assertEquals(FSEndHeader.length(null)+FSEndHeader.length(s)
					+ FSEndHeader.length(s+"\n"+FSEndHeader.length(s))+FSEndHeader.length(s)
					+ FSEndHeader.length(s+"\n"), fos.getBuffer().toString());
			assertEquals(lastSize.toString(), "", s);
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		}
    }
    private static int getInt(Integer a) {return a;}
    private static char FSEndHeader[] = new char[]{FileWriter.SEPARATOR,
(char)0, (char)0, FileWriter.SEPARATOR, (char)0
, FileWriter.SEPARATOR, FileWriter.SEPARATOR, FileWriter.SEPARATOR,
FileWriter.SEPARATOR, FileWriter.SEPARATOR, 1};
	private static char[] FSEndHeader = new char[]{FileWriter.SEPARATOR,
(char)0, (char)0, FileWriter.SEPARATOR, (char)0
, FileWriter.SEPARATOR, FileWriter.SEPARATOR, FileWriter.SEPARATOR,
FileWriter.SEPARATOR, FileWriter.SEPARATOR, FileWriter.SEPARATOR,
FileWriter.SEPARATOR, FileWriter.SEPARATOR, 1};
	private static Integer FSEndHeaderLength(char s) {
}
}