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
	* This test case checks if the method returns true when the output destination is not null.
	*/
	@Test
	public void testAddOutputDestination_NotNull() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		assertTrue(fileFollower.addOutputDestination(outputDestination));
	}
	
	/**
	* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the output destination is null.
	*/
	@Test
	public void testAddOutputDestination_Null() {
		FileFollower fileFollower = new FileFollower();
		assertFalse(fileFollower.addOutputDestination(null));
	}
	
	/**
	* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns true when the output destination is not null and the file follower has no output destinations.
	*/
	@Test
	public void testAddOutputDestination_NotNull_NoOutputDestinations() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		assertTrue(fileFollower.addOutputDestination(outputDestination));
	}
	
	/**
	* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns true when the output destination is not null and the file follower has one output destination.
	*/
	@Test
	public void testAddOutputDestination_NotNull_OneOutputDestination() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination);
		assertTrue(fileFollower.addOutputDestination(outputDestination));
	}
	
	/**
	* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns true when the output destination is not null and the file follower has two output destinations.
	*/
	@Test
	public void testAddOutputDestination_NotNull_TwoOutputDestinations() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		assertTrue(fileFollower.addOutputDestination(outputDestination));
	}
	
	/**
	* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns true when the output destination is not null and the file follower has three output destinations.
	*/
	@Test
	public void testAddOutputDestination_NotNull_ThreeOutputDestinations() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		assertTrue(fileFollower.addOutputDestination(outputDestination));
	}
	
	/**
	* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns true when the output destination is not null and the file follower has four output destinations.
	*/
	@Test
	public void testAddOutputDestination_NotNull_FourOutputDestinations() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		assertTrue(fileFollower.addOutputDestination(outputDestination));
	}
	
	/**
	* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns true when the output destination is not null and the file follower has five output destinations.
	*/
	@Test
	public void testAddOutputDestination_NotNull_FiveOutputDestinations() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		assertTrue(fileFollower.addOutputDestination(outputDestination));
	}
	
	/**
	* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns true when the output destination is not null and the file follower has six output destinations.
	*/
	@Test
	public void testAddOutputDestination_NotNull_SixOutputDestinations() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		assertTrue(fileFollower.addOutputDestination(outputDestination));
	}
	
	/**
	* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns true when the output destination is not null and the file follower has seven output destinations.
	*/
	@Test
	public void testAddOutputDestination_NotNull_SevenOutputDestinations() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		assertTrue(fileFollower.addOutputDestination(outputDestination));
	}
	
	/**
	* Test case for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns true when the output destination is not null and the file follower has eight output destinations.
	*/
	@Test
	public void testAddOutputDestination_NotNull_EightOutputDestinations() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination);
		assertTrue(fileF