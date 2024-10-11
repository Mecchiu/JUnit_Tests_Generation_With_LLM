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
Class<InputStream> inputStream = InputStream.class;
		Class<OutputStream> outputStream = OutputStream.class;

		public DocumentTest() throws IOException {
		}

		public void setUp() throws IOException {
			inputStream = FileInputStream.class;
			outputStream = FileOutputStream.class;
		}

	@Test
	void testStringify() throws IOException {
	assertEquals(
			"  name  \n"
			   + "  author\n"
			   + "  file  \n",
			Document.stringify()
			);
	assertTrue(new FileInputStream("dummy").getFile().exists());
	}
}