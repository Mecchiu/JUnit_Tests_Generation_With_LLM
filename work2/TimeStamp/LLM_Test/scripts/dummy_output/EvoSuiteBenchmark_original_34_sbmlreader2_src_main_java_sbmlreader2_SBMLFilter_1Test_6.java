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
		static {
			if (!File.separatorChars.equals("\\")) {
				System.setProperty("file.separator", "/");
			}
		}

	
	
	
	   Test getTestObject(String fileName);		

	@Test
	public void testGetReader() {
		//Test1
		int i = 0;
		SBMLFilter filter = new SBMLFilter();
		String[] testArray = new SBMLFilter_1Test().getTestObject(testArray);
		assertEquals(filter.getFileExtensions().length, testArray.length);
		
	}
	@Test
	public void testAccept() {
		//Test1
		int i = 0;
		SBMLFilter filter = new SBMLFilter();
		assertTrue(filter.accept(new File(testArray[i])));
		i++;
		assertTrue(filter.accept(new File(testArray[i])));
		i++;
		assertFalse(filter.accept(new File(testArray[i])));
		
	}
	@Test
	public void testAcceptAll() {
		//Test1
		int i = 0;
		SBMLFilter filter = new SBMLFilter();
		assertTrue(filter.accept(new File(testArray[i])));
		i++;
		assertTrue(filter.accept(new File(testArray[i])));
		assertFalse(filter.accept(new File(testArray[i])));
		
	}
	@Test
	public void testGetFileExtensions() {
		//Test1
		int i = 0;
		SBMLFilter filter =  new SBMLFilter();
		
		String[] testArraySbml = new SBMLFilter_1Test().getTestObject(testArraySbml);
		
		String[] testArray = testArraySbml.clone();
		System.out.println("testArray: " + testArraySbml.toString());
		String[] testArrayTest = new String[testArraySbml.length];
		for (int x=0;x< testArray.length;x++)
			testArray[x]=testArraySbml[x];
		
		assertEquals(filter.getFileExtensions().length, testArray.length);
		assertTrue(filter.accept(new File(testArray[1])));
		assertTrue(filter.accept(new File(testArray[2])));
		assertTrue(filter.accept(new File(testArray[3])));
		assertFalse(filter.accept(new File(testArray[4])));
						

	}

}
//SBMLFilter_1Test.java