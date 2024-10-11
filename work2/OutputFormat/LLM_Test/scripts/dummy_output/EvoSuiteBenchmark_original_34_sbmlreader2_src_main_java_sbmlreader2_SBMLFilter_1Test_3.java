// SBMLFilter_1Test.java
package sbmlreader2;

import cytoscape.data.ImportHandler;
import cytoscape.data.readers.GraphReader;
import cytoscape.util.CyFileFilter;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SBMLFilter}.
* It contains one unit test case for the {@link SBMLFilter#getReader(String)} method.
*/
class SBMLFilter_1Test {
		private GraphReader reader1;
		private GraphReader reader2;

/** Test case body for {@link SBMLFilter_1#getReader(String)} method. */
    @Test
	public void test() throws IOException, InterruptedException {

	File file1;
	File file2;
/*	{
	File file;
	file = new File("C:/Users/Test/Desktop/test.xml");
	InputStream input = file.toURI().toURL().openStream();
	InputStream input1 = file.getAbsoluteFile().toURI().toURL().openStream();
	reader1 = SBMLFilter.getReader(String.valueOf(input1));
	file2 = new File("C:/Users/Test/Desktop/test.xml");
	InputStream input2 = file2.getAbsoluteFile().toURI().toURL().openStream();
	reader2 = SBMLFilter.getReader(String.valueOf(input2));
	}
*/
/*	assertNotNull(reader1);
	assertNotNull(reader2);
	assertTrue(reader1.isFile());
	assertTrue(reader2.isFile());
	*/
    }


}