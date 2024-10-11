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
		fileFollower.outputDest