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
	* This test case checks if the method returns true when the outputDestination is removed.
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
	* This test case checks if the method returns false when the outputDestination is not removed.
	*/
	@Test
	public void testRemoveOutputDestination1() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		assertFalse(fileFollower.removeOutputDestination(outputDestination));
	}
	
	/**
	* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the outputDestination is null.
	*/
	@Test
	public void testRemoveOutputDestination2() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = null;
		assertFalse(fileFollower.removeOutputDestination(outputDestination));
	}
	
	/**
	* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the outputDestination is not removed.
	*/
	@Test
	public void testRemoveOutputDestination3() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination);
		assertFalse(fileFollower.removeOutputDestination(null));
	}
	
	/**
	* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the outputDestination is not removed.
	*/
	@Test
	public void testRemoveOutputDestination4() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination);
		assertFalse(fileFollower.removeOutputDestination(new OutputDestination()));
	}
	
	/**
	* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the outputDestination is not removed.
	*/
	@Test
	public void testRemoveOutputDestination5() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination);
		assertFalse(fileFollower.removeOutputDestination(new OutputDestination()));
	}
	
	/**
	* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the outputDestination is not removed.
	*/
	@Test
	public void testRemoveOutputDestination6() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination);
		assertFalse(fileFollower.removeOutputDestination(new OutputDestination()));
	}
	
	/**
	* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the outputDestination is not removed.
	*/
	@Test
	public void testRemoveOutputDestination7() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination);
		assertFalse(fileFollower.removeOutputDestination(new OutputDestination()));
	}
	
	/**
	* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the outputDestination is not removed.
	*/
	@Test
	public void testRemoveOutputDestination8() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination);
		assertFalse(fileFollower.removeOutputDestination(new OutputDestination()));
	}
	
	/**
	* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the outputDestination is not removed.
	*/
	@Test
	public void testRemoveOutputDestination9() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination);
		assertFalse(fileFollower.removeOutputDestination(new OutputDestination()));
	}
	
	/**
	* Test case for {@link FileFollower#removeOutputDestination(OutputDestination)} method.
	* This test case checks if the method returns false when the outputDestination is not removed.
	*/
	@Test
	public void testRemoveOutputDestination10() {
		FileFollower fileFollower = new FileFollower();
		OutputDestination outputDestination = new OutputDestination();
		fileFollower.addOutputDestination(outputDestination);
		assertFalse(fileFollower.removeOutputDestination(new OutputDestination()));
	}
}

// OutputDestination.java
package ghm.follow.io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/**
 * Instances of this class are used to send the contents of a file to a
 * particular destination.
 *
 * @author <a href="mailto:greghmerrill@yahoo.com">Greg Merrill</a>
 */
public class OutputDestination {

    /**
     * Send the supplied String to this OutputDestination.
     *
     * @param string String to be sent
     */
    public void send(String string) {
        printStream.print(string);
    }
}

// OutputDestinationTest.java
package ghm.follow.io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputDestination}.
* It contains ten unit test cases for the {@link OutputDestination#send(String)} method.
*/
class OutputDestinationTest {
		
	/**
	* Test case for {@link OutputDestination#send(String)} method.
	* This test case checks if the method returns true when the string is sent.
	*/
	@Test
	public void testSend() {
		OutputDestination outputDestination = new OutputDestination();
		assertTrue(outputDestination.send("Hello"));
	}
	
	/**
	* Test case for {@link OutputDestination#send(String)} method.
	* This test case checks if the method returns false when the string is not sent.
	*/
	@Test
	public void testSend1() {
		OutputDestination outputDestination = new OutputDestination();
		assertFalse(outputDestination.send(""));
	}
	
	/**
	* Test case for {@link OutputDestination#send(String)} method.
	* This test case checks if the method returns false when the string is not sent.
	*/
	@Test
	public void testSend2() {
		OutputDestination outputDestination = new OutputDestination();
		assertFalse(outputDestination.send(null));
	}
	
	/**
	* Test case for {@link OutputDestination#send(String)} method.
	* This test case checks if the method returns false when the string is not sent.
	*/
	@Test
	public void testSend3() {
		OutputDestination outputDestination = new OutputDestination();
		assertFalse(outputDestination.send(""));
	}
	
	/**
	* Test case for {@link OutputDestination#send(String)} method.
	* This test case checks if the method returns false when the string is not sent.
	*/
	@Test
	public void testSend4() {
		OutputDestination outputDestination = new OutputDestination();
		assertFalse(outputDestination.send(""));
	}
	
	/**
	* Test case for {@link OutputDestination#send(String)} method.
	* This test case checks if the method returns false when the string is not sent.
	*/
	@Test
	public void testSend5() {
		OutputDestination outputDestination = new OutputDestination();
		assertFalse(outputDestination.send(""));
	}
	
	/**
	* Test case for {@link OutputDestination#send(String)} method.
	* This test case checks if the method returns false when the string is not sent.
	*/
	@Test
	public void testSend6() {
		OutputDestination outputDestination = new OutputDestination();
		assertFalse(outputDestination.send(""));
	}
	
	/**
	* Test case for {@link OutputDestination#send(String)} method.
	* This test case checks if the method returns false when the string is not sent.
	*/
	@Test
	public void testSend7() {
		OutputDestination outputDestination = new OutputDestination();
		assertFalse(outputDestination.send(""));
	}
	
	/**
	* Test case for {@link OutputDestination#send(String)} method.
	* This test case checks if the method returns false when the string is not sent.
	*/
	@Test
	public void testSend8() {
		OutputDestination outputDestination = new OutputDestination();
		assertFalse(outputDestination.send(""));
	}
	
	/**
	* Test case for {@link OutputDestination#send(String)} method.
	* This test case checks if the method returns false when the string is not sent.
	*/
	@Test
	public void testSend9() {
		OutputDestination outputDestination = new OutputDestination();
		assertFalse(outputDestination.send(""));
	}
	
	/**
	* Test case for {@link OutputDestination#send(String)} method.
	* This test case checks if the method returns false when the string is not sent.
	*/
	@Test
	public void testSend10() {
		OutputDestination outputDestination = new OutputDestination();
		assertFalse(outputDestination.send(""));
	}
}