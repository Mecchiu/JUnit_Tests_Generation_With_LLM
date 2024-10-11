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
		private SBMLFilter sbmlFilter;

		private SBMLFilter_0Test() {
			sbmlFilter = new SBMLFilter();
		}

		/**
    * @throws IOException Thrown if any I/O exception occurs.
		*/
    @Test(expected = IllegalArgumentException.class)
    public void test_file_exists_no_sbml() throws IOException {
        sbmlFilter.accept(new File("test"));
    }

    /**
     * Test method for {@link sbmlFilter.accept(File)}.
     */
    @Test
    public void test_file_exists() {
        //File doesn't exists (since it does not use the system fileSystem as the input)
		/*
        sbmlFilter = new SBMLFilter();
        sbmlFilter.accept(new File("test"));
		*/
        assertTrue(sbmlFilter.accept(new File("test")));
        assertFalse(sbmlFilter.accept(new File("test.xml")));
	}

    /**
     * Test method for {@link sbmlFilter.accept(File)}.
     */
    @Test(expected = IllegalStateException.class)
    public void test_no_file() {
        sbmlFilter.accept(new File());
    }

    /**
     * Test method for {@link sbmlFilter.accept(File)}.
     */
    @Test
    public void test_file_exists_non_read() {
        /*
            sbmlFilter = new SBMLFilter();
            sbmlFilter.accept(new File("test"));
		*/
        CyFileFilter.accept(new File("test"));
	}

    /**
     * Test method for {@link sbmlFilter.accept(File)}.
     */
    @Test
    public void test_file_exists_read() {
        assertTrue(sbmlFilter.accept(new File("test")));
		assertTrue(sbmlFilter.accept(new File("test.xml")));
        assertFalse(sbmlFilter.accept(new File("nonread")));
        assertFalse(sbmlFilter.accept(new File("testnotexist")));
	}

    /**
     * Test method for {@link sbmlFilter.accept(File)}.
     */
    @Test(expected = IOException.class)
    public void test_file_exists_IOE() {
        sbmlFilter.accept(new File("/tmp/test"));
    }
    /**
     * Test method for {@link sbmlFilter.accept(File)}.
     */
    @Test(expected = IllegalStateException.class)
    public void test_file_exists_illegal_state_error() {
        sbmlFilter.accept(new File("/tmp/test"));
    }

    /**
     * Test method for {@link sbmlFilter.accept(File)}.
     */
    @Test
    public void test_file_exists_not_exist() {
        assertFalse(sbmlFilter.accept(new File("test")));
		assertFalse(sbmlFilter.accept(new File("test.xml")));
		assertFalse(sbmlFilter.accept(new File("nonexist")));
        assertFalse(sbmlFilter.accept(new File("testnotexist")));
	}

    /**
     * Test method for {@link SBMLException#getMessage()}.
     */
    @Test
    public void test_exception_no_message() {
        try {
            sbmlFilter.accept(new File("test"));
        }
        catch (SBMLException ex) {
            String a = ex.getMessage();
		
    		assertEquals("No message found, did you forget to pass an exception?", "SBML filter didn't return anything!", ex.getMessage());
			return;
		}
    	
        fail("No exception was thrown.");
    }
}