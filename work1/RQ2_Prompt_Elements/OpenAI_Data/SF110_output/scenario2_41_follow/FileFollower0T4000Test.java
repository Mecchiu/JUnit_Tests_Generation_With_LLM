// FileFollowerTest.java
package ghm.follow;

import ghm.follow.io.OutputDestination;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileFollower}.
* It contains ten unit test cases for the {@link FileFollower#addOutputDestination(OutputDestination)} method.
*/
class FileFollowerTest {

	/**
	* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns true when the outputDestination is not null.
	*/
	@Test
	public void testAddOutputDestination_1() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination() {
			@Override
			public void print(String string) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		};
		boolean result = fileFollower.addOutputDestination(outputDestination);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the outputDestination is null.
	*/
	@Test
	public void testAddOutputDestination_2() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = null;
		boolean result = fileFollower.addOutputDestination(outputDestination);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the outputDestination is not null and the outputDestinations list is empty.
	*/
	@Test
	public void testAddOutputDestination_3() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination() {
			@Override
			public void print(String string) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		};
		fileFollower.outputDestinations = new ArrayList<OutputDestination>();
		boolean result = fileFollower.addOutputDestination(outputDestination);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the outputDestination is not null and the outputDestinations list is not empty.
	*/
	@Test
	public void testAddOutputDestination_4() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination() {
			@Override
			public void print(String string) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		};
		fileFollower.outputDestinations = new ArrayList<OutputDestination>();
		fileFollower.outputDestinations.add(outputDestination);
		boolean result = fileFollower.addOutputDestination(outputDestination);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the outputDestination is not null and the outputDestinations list is not empty.
	*/
	@Test
	public void testAddOutputDestination_5() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination() {
			@Override
			public void print(String string) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		};
		fileFollower.outputDestinations = new ArrayList<OutputDestination>();
		fileFollower.outputDestinations.add(outputDestination);
		boolean result = fileFollower.addOutputDestination(outputDestination);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the outputDestination is not null and the outputDestinations list is not empty.
	*/
	@Test
	public void testAddOutputDestination_6() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination() {
			@Override
			public void print(String string) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		};
		fileFollower.outputDestinations = new ArrayList<OutputDestination>();
		fileFollower.outputDestinations.add(outputDestination);
		boolean result = fileFollower.addOutputDestination(outputDestination);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the outputDestination is not null and the outputDestinations list is not empty.
	*/
	@Test
	public void testAddOutputDestination_7() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination() {
			@Override
			public void print(String string) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		};
		fileFollower.outputDestinations = new ArrayList<OutputDestination>();
		fileFollower.outputDestinations.add(outputDestination);
		boolean result = fileFollower.addOutputDestination(outputDestination);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the outputDestination is not null and the outputDestinations list is not empty.
	*/
	@Test
	public void testAddOutputDestination_8() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination() {
			@Override
			public void print(String string) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		};
		fileFollower.outputDestinations = new ArrayList<OutputDestination>();
		fileFollower.outputDestinations.add(outputDestination);
		boolean result = fileFollower.addOutputDestination(outputDestination);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the outputDestination is not null and the outputDestinations list is not empty.
	*/
	@Test
	public void testAddOutputDestination_9() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination() {
			@Override
			public void print(String string) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		};
		fileFollower.outputDestinations = new ArrayList<OutputDestination>();
		fileFollower.outputDestinations.add(outputDestination);
		boolean result = fileFollower.addOutputDestination(outputDestination);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the outputDestination is not null and the outputDestinations list is not empty.
	*/
	@Test
	public void testAddOutputDestination_10() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination() {
			@Override
			public void print(String string) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		};
		fileFollower.outputDestinations = new ArrayList<OutputDestination>();
		fileFollower.outputDestinations.add(outputDestination);
		boolean result = fileFollower.addOutputDestination(outputDestination);
		assertFalse(result);
	}
}

// OutputDestination.java
package ghm.follow.io;

/**
 * Interface for classes that can receive Strings from instances of
 * {@link FileFollower}.
 *
 * @see FileFollower
 * @author <a href="mailto:greghmerrill@yahoo.com">Greg Merrill</a>
 */
public interface OutputDestination {

    /**
     * Print the given String.
     *
     * @param string String to be printed
     */
    public void print(String string);
}

// OutputDestinationTest.java
package ghm.follow.io;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputDestination}.
* It contains ten unit test cases for the {@link OutputDestination#print(String)} method.
*/
class OutputDestinationTest {
		
	/**
	* Test case for {@link OutputDestination#print(String)} method.
	* This test case checks if the method returns true when the string is not null.
	*/
	@Test
	public void testPrint_1() {
		OutputDestination outputDestination = new OutputDestination() {
			@Override
			public void print(String string) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		};
		String string = "test";
		boolean result = outputDestination.print(string);
		assertTrue(result);
	}
	
	/**
	* Test case for {@link OutputDestination#print(String)} method.
	* This test case checks if the method returns false when the string is null.
	*/
	@Test
	public void testPrint_2() {
		OutputDestination outputDestination = new OutputDestination() {
			@Override
			public void print(String string) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		};
		String string = null;
		boolean result = outputDestination.print(string);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link OutputDestination#print(String)} method.
	* This test case checks if the method returns false when the string is not null and the string is empty.
	*/
	@Test
	public void testPrint_3() {
		OutputDestination outputDestination = new OutputDestination() {
			@Override
			public void print(String string) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		};
		String string = "";
		boolean result = outputDestination.print(string);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link OutputDestination#print(String)} method.
	* This test case checks if the method returns false when the string is not null and the string is empty.
	*/
	@Test
	public void testPrint_4() {
		OutputDestination outputDestination = new OutputDestination() {
			@Override
			public void print(String string) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		};
		String string = "";
		boolean result = outputDestination.print(string);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link OutputDestination#print(String)} method.
	* This test case checks if the method returns false when the string is not null and the string is empty.
	*/
	@Test
	public void testPrint_5() {
		OutputDestination outputDestination = new OutputDestination() {
			@Override
			public void print(String string) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		};
		String string = "";
		boolean result = outputDestination.print(string);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link OutputDestination#print(String)} method.
	* This test case checks if the method returns false when the string is not null and the string is empty.
	*/
	@Test
	public void testPrint_6() {
		OutputDestination outputDestination = new OutputDestination() {
			@Override
			public void print(String string) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		};
		String string = "";
		boolean result = outputDestination.print(string);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link OutputDestination#print(String)} method.
	* This test case checks if the method returns false when the string is not null and the string is empty.
	*/
	@Test
	public void testPrint_7() {
		OutputDestination outputDestination = new OutputDestination() {
			@Override
			public void print(String string) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		};
		String string = "";
		boolean result = outputDestination.print(string);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link OutputDestination#print(String)} method.
	* This test case checks if the method returns false when the string is not null and the string is empty.
	*/
	@Test
	public void testPrint_8() {
		OutputDestination outputDestination = new OutputDestination() {
			@Override
			public void print(String string) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		};
		String string = "";
		boolean result = outputDestination.print(string);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link OutputDestination#print(String)} method.
	* This test case checks if the method returns false when the string is not null and the string is empty.
	*/
	@Test
	public void testPrint_9() {
		OutputDestination outputDestination = new OutputDestination() {
			@Override
			public void print(String string) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		};
		String string = "";
		boolean result = outputDestination.print(string);
		assertFalse(result);
	}
	
	/**
	* Test case for {@link OutputDestination#print(String)} method.
	* This test case checks if the method returns false when the string is not null and the string is empty.
	*/
	@Test
	public void testPrint_10() {
		OutputDestination outputDestination = new OutputDestination() {
			@Override
			public void print(String string) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		};
		String string = "";
		boolean result = outputDestination.print(string);
		assertFalse(result);
	}
}