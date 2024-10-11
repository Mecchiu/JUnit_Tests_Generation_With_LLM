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
* It contains ten unit test cases for the {@link FileFollower#removeOutputDestination(OutputDestination)} method.
*/
class FileFollowerTest {

	/**
	* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns true when the output destination is removed.
	*/
	@Test
	public void testRemoveOutputDestination() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination);
		assertTrue(fileFollower.removeOutputDestination(outputDestination));
	}
	
	/**
	* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the output destination is not removed.
	*/
	@Test
	public void testRemoveOutputDestination() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		assertFalse(fileFollower.removeOutputDestination(outputDestination));
	}
	
	/**
	* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the output destination is null.
	*/
	@Test
	public void testRemoveOutputDestination() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = null;
		assertFalse(fileFollower.removeOutputDestination(outputDestination));
	}
	
	/**
	* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the output destination is not present in the list.
	*/
	@Test
	public void testRemoveOutputDestination() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		OutputDestination outputDestination1 = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination);
		assertFalse(fileFollower.removeOutputDestination(outputDestination1));
	}
	
	/**
	* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the output destination is not present in the list.
	*/
	@Test
	public void testRemoveOutputDestination() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		OutputDestination outputDestination1 = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination1);
		assertFalse(fileFollower.removeOutputDestination(outputDestination1));
	}
	
	/**
	* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the output destination is not present in the list.
	*/
	@Test
	public void testRemoveOutputDestination() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		OutputDestination outputDestination1 = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination1);
		assertFalse(fileFollower.removeOutputDestination(outputDestination1));
	}
	
	/**
	* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the output destination is not present in the list.
	*/
	@Test
	public void testRemoveOutputDestination() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		OutputDestination outputDestination1 = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination1);
		assertFalse(fileFollower.removeOutputDestination(outputDestination1));
	}
	
	/**
	* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the output destination is not present in the list.
	*/
	@Test
	public void testRemoveOutputDestination() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		OutputDestination outputDestination1 = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination1);
		assertFalse(fileFollower.removeOutputDestination(outputDestination1));
	}
	
	/**
	* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the output destination is not present in the list.
	*/
	@Test
	public void testRemoveOutputDestination() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		OutputDestination outputDestination1 = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination1);
		assertFalse(fileFollower.removeOutputDestination(outputDestination1));
	}
	
	/**
	* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the output destination is not present in the list.
	*/
	@Test
	public void testRemoveOutputDestination() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		OutputDestination outputDestination1 = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination);
		fileFollower.addOutputDestination(outputDestination1);
		assertFalse(fileFollower.removeOutputDestination(outputDestination1));
	}
}