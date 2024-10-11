// SBMLFilter_0Test.java
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
* It contains one unit test case for the {@link SBMLFilter#accept(File)} method.
*/
class SBMLFilter_0Test {
		
	@Test
	public void testSBMLFilter1()
	{
		GraphReader reader = getReader("Test.xml");

		assertTrue(reader.accept(FILE_TEST1));

		ImportHandler.getInstance().registerNamespace(fileNat, "http://www.sbml.org");
		ReaderTest.assertGood(reader);

	}

	@Test
	public void testSBMLFilter2()
	{
		GraphReader reader = getReader("Test.xml");

		assertFalse(reader.accept(FILE_TEST1));

		ImportHandler.getInstance().registerNamespace(fileNat, "http://www.sbml.org");
        ReaderTest.assertGood(reader);

		// File is added as SBML namespace as a class property but
        // the name of the reader is the old name of the class.
        // The old name of the reader can be easily detected and renamed
        // by using the Cytoscape ImportHandler Framework with the
        // removeOldIds=true argument.
    }

   /**
    * Test class with two files, one being a new
    * one that has the new extension specified.
    *
    * @author Matthias Koenig
    * @param testFileName
    * @throws IOException
    */
   public void testSBMLFilter2(String testFileName) throws IOException
   {
       GraphReader testReader = getReader(testFileName);

       // Try to recognize a new SBML file
       assertTrue(testReader.accept(FILE_TEST2));

       // Add it to the XML file, but without the extension
       ReaderTest.assertGood(testReader);
   }

	//SBMLFilter.java
}