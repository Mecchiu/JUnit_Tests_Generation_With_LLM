// HttpFileUtils_0Test.java
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
* It contains ten unit test cases for the {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
*/
class HttpFileUtils_0Test {

		/**
		* Test case for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* Test data: entity = null, fileName = "test.txt".
		* Expected result: IOException.
		*/
		@Test
		void testSaveEntity_0() {
				HttpEntity entity = null;
				String fileName = "test.txt";
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				assertThrows(IOException.class, () -> {
						httpFileUtils.saveEntity(entity, fileName);
				});
		}
		
		/**
		* Test case for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* Test data: entity = new HttpEntity(), fileName = "test.txt".
		* Expected result: IOException.
		*/
		@Test
		void testSaveEntity_1() {
				HttpEntity entity = new HttpEntity();
				String fileName = "test.txt";
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				assertThrows(IOException.class, () -> {
						httpFileUtils.saveEntity(entity, fileName);
				});
		}
		
		/**
		* Test case for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* Test data: entity = new HttpEntity(), fileName = "test.txt".
		* Expected result: IOException.
		*/
		@Test
		void testSaveEntity_2() {
				HttpEntity entity = new HttpEntity();
				String fileName = "test.txt";
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				assertThrows(IOException.class, () -> {
						httpFileUtils.saveEntity(entity, fileName);
				});
		}
		
		/**
		* Test case for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* Test data: entity = new HttpEntity(), fileName = "test.txt".
		* Expected result: IOException.
		*/
		@Test
		void testSaveEntity_3() {
				HttpEntity entity = new HttpEntity();
				String fileName = "test.txt";
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				assertThrows(IOException.class, () -> {
						httpFileUtils.saveEntity(entity, fileName);
				});
		}
		
		/**
		* Test case for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* Test data: entity = new HttpEntity(), fileName = "test.txt".
		* Expected result: IOException.
		*/
		@Test
		void testSaveEntity_4() {
				HttpEntity entity = new HttpEntity();
				String fileName = "test.txt";
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				assertThrows(IOException.class, () -> {
						httpFileUtils.saveEntity(entity, fileName);
				});
		}
		
		/**
		* Test case for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* Test data: entity = new HttpEntity(), fileName = "test.txt".
		* Expected result: IOException.
		*/
		@Test
		void testSaveEntity_5() {
				HttpEntity entity = new HttpEntity();
				String fileName = "test.txt";
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				assertThrows(IOException.class, () -> {
						httpFileUtils.saveEntity(entity, fileName);
				});
		}
		
		/**
		* Test case for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* Test data: entity = new HttpEntity(), fileName = "test.txt".
		* Expected result: IOException.
		*/
		@Test
		void testSaveEntity_6() {
				HttpEntity entity = new HttpEntity();
				String fileName = "test.txt";
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				assertThrows(IOException.class, () -> {
						httpFileUtils.saveEntity(entity, fileName);
				});
		}
		
		/**
		* Test case for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* Test data: entity = new HttpEntity(), fileName = "test.txt".
		* Expected result: IOException.
		*/
		@Test
		void testSaveEntity_7() {
				HttpEntity entity = new HttpEntity();
				String fileName = "test.txt";
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				assertThrows(IOException.class, () -> {
						httpFileUtils.saveEntity(entity, fileName);
				});
		}
		
		/**
		* Test case for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* Test data: entity = new HttpEntity(), fileName = "test.txt".
		* Expected result: IOException.
		*/
		@Test
		void testSaveEntity_8() {
				HttpEntity entity = new HttpEntity();
				String fileName = "test.txt";
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				assertThrows(IOException.class, () -> {
						httpFileUtils.saveEntity(entity, fileName);
				});
		}
		
		/**
		* Test case for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* Test data: entity = new HttpEntity(), fileName = "test.txt".
		* Expected result: IOException.
		*/
		@Test
		void testSaveEntity_9() {
				HttpEntity entity = new HttpEntity();
				String fileName = "test.txt";
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				assertThrows(IOException.class, () -> {
						httpFileUtils.saveEntity(entity, fileName);
				});
		}
		
}

// HttpFileUtils_1Test.java
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
* It contains ten unit test cases for the {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
*/
class HttpFileUtils_1Test {
		
		/**
		* Test case for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* Test data: entity = null, fileName = "test.txt".
		* Expected result: IOException.
		*/
		@Test
		void testSaveEntity_0() {
				HttpEntity entity = null;
				String fileName = "test.txt";
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				assertThrows(IOException.class, () -> {
						httpFileUtils.saveEntity(entity, fileName);
				});
		}
		
		/**
		* Test case for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* Test data: entity = new HttpEntity(), fileName = "test.txt".
		* Expected result: IOException.
		*/
		@Test
		void testSaveEntity_1() {
				HttpEntity entity = new HttpEntity();
				String fileName = "test.txt";
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				assertThrows(IOException.class, () -> {
						httpFileUtils.saveEntity(entity, fileName);
				});
		}
		
		/**
		* Test case for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* Test data: entity = new HttpEntity(), fileName = "test.txt".
		* Expected result: IOException.
		*/
		@Test
		void testSaveEntity_2() {
				HttpEntity entity = new HttpEntity();
				String fileName = "test.txt";
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				assertThrows(IOException.class, () -> {
						httpFileUtils.saveEntity(entity, fileName);
				});
		}
		
		/**
		* Test case for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* Test data: entity = new HttpEntity(), fileName = "test.txt".
		* Expected result: IOException.
		*/
		@Test
		void testSaveEntity_3() {
				HttpEntity entity = new HttpEntity();
				String fileName = "test.txt";
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				assertThrows(IOException.class, () -> {
						httpFileUtils.saveEntity(entity, fileName);
				});
		}
		
		/**
		* Test case for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* Test data: entity = new HttpEntity(), fileName = "test.txt".
		* Expected result: IOException.
		*/
		@Test
		void testSaveEntity_4() {
				HttpEntity entity = new HttpEntity();
				String fileName = "test.txt";
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				assertThrows(IOException.class, () -> {
						httpFileUtils.saveEntity(entity, fileName);
				});
		}
		
		/**
		* Test case for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* Test data: entity = new HttpEntity(), fileName = "test.txt".
		* Expected result: IOException.
		*/
		@Test
		void testSaveEntity_5() {
				HttpEntity entity = new HttpEntity();
				String fileName = "test.txt";
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				assertThrows(IOException.class, () -> {
						httpFileUtils.saveEntity(entity, fileName);
				});
		}
		
		/**
		* Test case for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* Test data: entity = new HttpEntity(), fileName = "test.txt".
		* Expected result: IOException.
		*/
		@Test
		void testSaveEntity_6() {
				HttpEntity entity = new HttpEntity();
				String fileName = "test.txt";
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				assertThrows(IOException.class, () -> {
						httpFileUtils.saveEntity(entity, fileName);
				});
		}
		
		/**
		* Test case for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* Test data: entity = new HttpEntity(), fileName = "test.txt".
		* Expected result: IOException.
		*/
		@Test
		void testSaveEntity_7() {
				HttpEntity entity = new HttpEntity();
				String fileName = "test.txt";
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				assertThrows(IOException.class, () -> {
						httpFileUtils.saveEntity(entity, fileName);
				});
		}
		
		/**
		* Test case for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* Test data: entity = new HttpEntity(), fileName = "test.txt".
		* Expected result: IOException.
		*/
		@Test
		void testSaveEntity_8() {
				HttpEntity entity = new HttpEntity();
				String fileName = "test.txt";
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				assertThrows(IOException.class, () -> {
						httpFileUtils.saveEntity(entity, fileName);
				});
		}
		
		/**
		* Test case for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* Test data: entity = new HttpEntity(), fileName = "test.txt".
		* Expected result: IOException.
		*/
		@Test
		void testSaveEntity_9() {
				HttpEntity entity = new HttpEntity();
				String fileName = "test.txt";
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				assertThrows(IOException.class, () -> {
						httpFileUtils.saveEntity(entity, fileName);
				});
		}
		
}

// HttpFileUtils_2Test.java
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
import java.util.logging.Level