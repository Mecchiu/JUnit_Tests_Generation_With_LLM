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
/**
		 * @param jFrame parent
  		 */
                public HttpFileUtilsTest(final JFrame jFrame){
                this.jFrame = jFrame;
        }
        private final JFrame jFrame;

    /**
     * Test method
     *  @throws java.lang.Exception
     */
    @Test
    public void testSavedEntity() throws Exception {
        doTestSavedEntity("D:/TestFileSystem.jsp", "/D:/TestFileSystem.txt");
    }

    /**
     * Test method
     *  @throws java.lang.Exception
     */
    @Test
    public void testSavedEntity2() throws Exception {
        doTestSavedEntity("/D:/TestFileSystem.jsp", "/D:/TestFileSystem.txt");
    }

	private void doTestSavedEntity(String relativePath, String fileName) throws Exception {
        final Properties p = new Properties();
        final RandomAccessFile randomFile = new RandomAccessFile(relativePath + fileName, "r");
        randomFile.seek(randomFile.length()-256);
		randomFile.write("Testing file content".getBytes());
        randomFile.seek(0);
        HttpEntity e=null;
        try { e = httpEntityFromJSP(fileName); }
        catch (FileNotFoundException ignore) { /*not in test case*/ }
        catch (IOException ignore) { /*not in test case*/ }
        finally { randomFile.close(); }
        saveEntity(e, fileName);
        assertNotNull("null returned from save Entity.", e);
        
        e=null;
        try { e = httpEntityFromJBL(new File(relativePath)); }
        catch (FileNotFoundException ignore) { /*not in test case*/ }
        catch (IOException ignore) { /*not in test case*/ }
        finally { assertNotNull("null returned from save Entity.", e); }
        
           
        assertTrue("Content did not match the file content.", equalStringOnContent(new File("/D:/TestFileSystem.txt"), e.getContent()));
        assertFalse("Content did not match the file content.", equalStringOnContent(new File("/D:/TestFileSystem.JSP"), e.getContent()));
    }
    
    private HttpEntity httpEntityFromJSP(String fileName) throws FileNotFoundException, IOException {
        final InputStream in = new FileInputStream(fileName);
        try {
            return new HttpEntityEnclosingStream(httpEntityFromIOS(in));
        } finally {
            in.close();
        }
    }
    
    private HttpEntity httpEntityFromIOS(InputStream inputStream) throws IOException {
        final byte[] buffer = new byte [2048];
        final HttpEntity entity = new BasicHttpEntityEnclosingStream(inputStream);
        int written = -1;
        try {
			    written = inputStream.read(buffer);
		} catch(IOException e) {
            // ignore
        } finally {
            entity.setContentLengthLong(written);
        }
        return entity;
    }
    
    private void assertNotNull(String message, Object result) {
        if (result == null) {
            throw new AssertionError(message);
        }
    }
    
    private boolean equalStringOnContent(File file, String expectedString) throws IOException {
        final StringBuilder text = new StringBuilder();
        final PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
        try {
            boolean first = true;
            pw.print("<PRE>");
            while ((first=true) && (text.length() <= 1024)) {
                pw.println(file.toString());
                if ("</PRE>".equals(first=false, text.length() > 1024? text.toString().replace("\n", "").toString() : "")) {
                    first = false;
                }
                
                text.append("<BR>".toString());
            }
            System.out.println(file.toString());
		} finally {
            pw.close();
        }
        
        final String string = text.toString().replace("\n","<BR>");
        return string.equals(expectedString);
    }
}

