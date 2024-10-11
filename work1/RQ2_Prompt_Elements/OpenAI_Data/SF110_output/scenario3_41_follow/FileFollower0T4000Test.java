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
	* Test case 1 for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns true when the output destination is not null.
	*/
	@Test
	public void testAddOutputDestination1() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		assertTrue(fileFollower.addOutputDestination(outputDestination));
	}
	
	/**
	* Test case 2 for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the output destination is null.
	*/
	@Test
	public void testAddOutputDestination2() {
		FileFollower fileFollower = new FileFollower();
		assertFalse(fileFollower.addOutputDestination(null));
	}
	
	/**
	* Test case 3 for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the output destination is not null and the output destination is already added.
	*/
	@Test
	public void testAddOutputDestination3() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination);
		assertFalse(fileFollower.addOutputDestination(outputDestination));
	}
	
	/**
	* Test case 4 for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns true when the output destination is not null and the output destination is not already added.
	*/
	@Test
	public void testAddOutputDestination4() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination1 = new OutputDestination();
		OutputDestination outputDestination2 = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination1);
		assertTrue(fileFollower.addOutputDestination(outputDestination2));
	}
	
	/**
	* Test case 5 for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the output destination is not null and the output destination is already added.
	*/
	@Test
	public void testAddOutputDestination5() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination1 = new OutputDestination();
		OutputDestination outputDestination2 = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination1);
		fileFollower.addOutputDestination(outputDestination2);
		assertFalse(fileFollower.addOutputDestination(outputDestination1));
	}
	
	/**
	* Test case 6 for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the output destination is not null and the output destination is already added.
	*/
	@Test
	public void testAddOutputDestination6() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination1 = new OutputDestination();
		OutputDestination outputDestination2 = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination1);
		fileFollower.addOutputDestination(outputDestination2);
		assertFalse(fileFollower.addOutputDestination(outputDestination2));
	}
	
	/**
	* Test case 7 for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns true when the output destination is not null and the output destination is not already added.
	*/
	@Test
	public void testAddOutputDestination7() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination1 = new OutputDestination();
		OutputDestination outputDestination2 = new OutputDestination();
		OutputDestination outputDestination3 = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination1);
		fileFollower.addOutputDestination(outputDestination2);
		assertTrue(fileFollower.addOutputDestination(outputDestination3));
	}
	
	/**
	* Test case 8 for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the output destination is not null and the output destination is already added.
	*/
	@Test
	public void testAddOutputDestination8() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination1 = new OutputDestination();
		OutputDestination outputDestination2 = new OutputDestination();
		OutputDestination outputDestination3 = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination1);
		fileFollower.addOutputDestination(outputDestination2);
		fileFollower.addOutputDestination(outputDestination3);
		assertFalse(fileFollower.addOutputDestination(outputDestination1));
	}
	
	/**
	* Test case 9 for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the output destination is not null and the output destination is already added.
	*/
	@Test
	public void testAddOutputDestination9() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination1 = new OutputDestination();
		OutputDestination outputDestination2 = new OutputDestination();
		OutputDestination outputDestination3 = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination1);
		fileFollower.addOutputDestination(outputDestination2);
		fileFollower.addOutputDestination(outputDestination3);
		assertFalse(fileFollower.addOutputDestination(outputDestination2));
	}
	
	/**
	* Test case 10 for {@link FileFollower#addOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the output destination is not null and the output destination is already added.
	*/
	@Test
	public void testAddOutputDestination10() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination1 = new OutputDestination();
		OutputDestination outputDestination2 = new OutputDestination();
		OutputDestination outputDestination3 = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination1);
		fileFollower.addOutputDestination(outputDestination2);
		fileFollower.addOutputDestination(outputDestination3);
		assertFalse(fileFollower.addOutputDestination(outputDestination3));
	}
}

// OutputDestination.java
package ghm.follow.io;

/**
 * Instances of this class are used to send Strings to some destination.
 *
 * @author <a href="mailto:greghmerrill@yahoo.com">Greg Merrill</a>
 */
public class OutputDestination {

    /**
     * Send a String to this OutputDestination.
     *
     * @param string String to be sent
     */
    public void send(String string);
}

// OutputDestinationTest.java
package ghm.follow.io;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputDestination}.
* It contains ten unit test cases for the {@link OutputDestination#send(String)} method.
*/
class OutputDestinationTest {
		
	/**
	* Test case 1 for {@link OutputDestination#send(String)} method.
	* This test case checks if the method returns true when the string is not null.
	*/
	@Test
	public void testSend1() {
		OutputDestination outputDestination = new OutputDestination();
		assertTrue(outputDestination.send("test"));
	}
	
	/**
	* Test case 2 for {@link OutputDestination#send(String)} method.
	* This test case checks if the method returns false when the string is null.
	*/
	@Test
	public void testSend2() {
		OutputDestination outputDestination = new OutputDestination();
		assertFalse(outputDestination.send(null));
	}
	
	/**
	* Test case 3 for {@link OutputDestination#send(String)} method.
	* This test case checks if the method returns true when the string is not null.
	*/
	@Test
	public void testSend3() {
		OutputDestination outputDestination = new OutputDestination();
		assertTrue(outputDestination.send("test1"));
	}
	
	/**
	* Test case 4 for {@link OutputDestination#send(String)} method.
	* This test case checks if the method returns true when the string is not null.
	*/
	@Test
	public void testSend4() {
		OutputDestination outputDestination = new OutputDestination();
		assertTrue(outputDestination.send("test2"));
	}
	
	/**
	* Test case 5 for {@link OutputDestination#send(String)} method.
	* This test case checks if the method returns true when the string is not null.
	*/
	@Test
	public void testSend5() {
		OutputDestination outputDestination = new OutputDestination();
		assertTrue(outputDestination.send("test3"));
	}
	
	/**
	* Test case 6 for {@link OutputDestination#send(String)} method.
	* This test case checks if the method returns true when the string is not null.
	*/
	@Test
	public void testSend6() {
		OutputDestination outputDestination = new OutputDestination();
		assertTrue(outputDestination.send("test4"));
	}
	
	/**
	* Test case 7 for {@link OutputDestination#send(String)} method.
	* This test case checks if the method returns true when the string is not null.
	*/
	@Test
	public void testSend7() {
		OutputDestination outputDestination = new OutputDestination();
		assertTrue(outputDestination.send("test5"));
	}
	
	/**
	* Test case 8 for {@link OutputDestination#send(String)} method.
	* This test case checks if the method returns true when the string is not null.
	*/
	@Test
	public void testSend8() {
		OutputDestination outputDestination = new OutputDestination();
		assertTrue(outputDestination.send("test6"));
	}
	
	/**
	* Test case 9 for {@link OutputDestination#send(String)} method.
	* This test case checks if the method returns true when the string is not null.
	*/
	@Test
	public void testSend9() {
		OutputDestination outputDestination = new OutputDestination();
		assertTrue(outputDestination.send("test7"));
	}
	
	/**
	* Test case 10 for {@link OutputDestination#send(String)} method.
	* This test case checks if the method returns true when the string is not null.
	*/
	@Test
	public void testSend10() {
		OutputDestination outputDestination = new OutputDestination();
		assertTrue(outputDestination.send("test8"));
	}
}