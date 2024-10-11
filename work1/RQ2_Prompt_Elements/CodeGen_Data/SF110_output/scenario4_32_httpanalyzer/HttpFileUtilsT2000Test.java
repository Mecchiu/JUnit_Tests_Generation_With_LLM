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
// HttpFileUtilsTest.java
		// [mainView] Http analyzer
		// [mainView] Http analyzer
		// [view] Http analyzer
		/**
		* <pre>
		* HttpFileUtilsTest.java
		* </pre>
		*/
        @Test
                @Category(org.junit.jupiter.api.Test.Classes.Integration.class)
        public void testCases(){
		        HttpFileUtils f1 = new HttpFileUtils();
                    assertNotNull(f1.getAnalyzer());
                    assertNotNull(f1.getLogger());
                        assertNotNull(f1.getProperties());
		        HttpFileUtils f2 = new HttpFileUtils();
                    assertNull(f2.getAnalyzer());
                    assertNull(f2.getLogger());
                        assertNotNull(f2.getProperties());

			final JFrame mainFrame = new JFrame();
			final JFrame view = new JFrame();

            assertNull(mainFrame);
			assertEquals("httpanalyzerview", mainFrame.getTitle());
            assertEquals("httpanalyzerview", view.getTitle());

            mainFrame.add(new JLabel("Hello"));

            //
                // getHttpAnalyzer()
                //
			HttpAnalyzerView a1 = f1.getHttpAnalyzer();

			// this is a test for the createAnalyzer method
			// and the setProperties (setUp() methods), to make sure nothing breaks
			assertNotNull(a1);
			assertNotNull(a1.getName());

			//
            // getLogger()
            //
			Logger logger = f1.getLogger();
			assertNotNull(logger);
			assertNotNull(logger.getHandlers()[0]);

			//
                // getAnalyzer()
                //
			HttpAnalyzerView a2 = f2.getAnalyzer();
			assertNotNull(a1);

			// now we can call the getProperty() method because it takes into account
			// system properties.
			assertNotNull(a2.getProperty("TEST", System.getProperty("property", "")));
			assertNotNull(a2.getProperty("TEST", null));
			assertEquals("value", a2.getProperty("TEST", ""));
			assertEquals("value1", a2.getProperty("TEST", ""));

			//
        // test addFile()
        //
             JFileChooser jfc = new JFileChooser();
             File testTemplate = new File("template");     
             File testDir = new File("/Users/vlad");
             File testDirSrc = new File("/Users/vlad/src");
             File testDirArch = new File("/Users/vlad/Arch");
             File testFile = new File("/Users/vlad/D1/src/template/my_template.xsl");

             File[] fileList = new File[1];

             jfc.showSaveDialog(view);
             jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
             fileList[0]= jfc.getSelectedFile();

             fileList = jfc.getSelectedFiles();

             if (fileList == null) {
                 System.err.println("JFileChooser.setSelectedFiles returned null!");
             }
                 fileList[0] = testTemplate;
                 jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                 fileList = jfc.getSelectedFiles();

             assertNotNull(fileList);
             assertArrayEquals("template", new String[] {"template"}, fileList);

             f2.addFileToDirectory(testDir, testFile, fileList);
             f2.addFileToDirectory(testDirSrc, testDirArch, fileList);
             f2.addFileToDirectory(testFile, testTemplate, fileList);

             // Now, we can get the analyizer for this directory!
             HttpAnalyzerView a3 = f2.getAnalyzer();
             assertNotNull(a3);

             // now we can call the getProperty() method because it takes into account
             // system properties.
             assertNotNull(a3.getProperty("TEST", System.getProperty("property", "")));
             assertEquals("TEST_FILE