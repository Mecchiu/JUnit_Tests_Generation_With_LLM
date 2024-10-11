// FileFollower_0Test.java
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
* It contains one unit test case for the {@link FileFollower#addOutputDestination(OutputDestination)} method.
*/
class FileFollower_0Test {
		
	//private List<OutputDestination> destinationList;
	private final List<File> outputDos;

	/**
	* Constructor for the class.
	*/
	public FileFollower_0Test() {
		this.outputDos = new ArrayList<File>();
	}

	/**
	* Constructor for the class.
	*
	* @param destDestinationToAdd The outputDestination to be added to the list of destinationList.
	*/
	public FileFollower_0Test(OutputDestination destDestinationToAdd) {
		this.outputDos.add(destDestinationToAdd);
	}

	/**
	* Test method for {@link FileFollower#addOutputDestination(OutputDestination)}.
	*/
	@Test
	public void testAddOutputDestination() {
		try (final OutputDestination lOutputDestination = new OutputDestination("file0")) {
				lOutputDestination.addOutputDestination(new FileFollower_1Destination());
				assertTrue(lOutputDestination.getDst() == getOutputDestination(lOutputDestination));
				lOutputDestination.setDst(new FileFollower_2Destination());
				assertTrue(lOutputDestination.getDst() == getOutputDestination(lOutputDestination));
				lOutputDestination.addOutputDestination(new FileFollower_1Destination());
				assertTrue(lOutputDestination.getDst()!= lOutputDestination.getDst().length);
				Thread.sleep(1000);
			}
	}
	
	/**
	* Test method for {@link OutputDestination#clearDestination()}.
	*/
	@Test
	public void testClearDestination() {
		final String msg = "Test of outputDestination.clearDestination(";
		String outputDst;
		OutputDestination destination;
		
		outputDst = "";
		destination = new OutputDestination("");
		assertTrue(destination.getDst() <= 0);

		outputDst = "file2";
		destination = new OutputDestination(new File(outputDst));
		assertTrue(destination.getDst() == file2.length());
		
		outputDst = "File 1";
		destination =  outputDestination(new File(outputDst));
		assertTrue(destination.getDst() == file1.length());
	}
	
	/**
	* Test method for {@link OutputDestination#isOutputDestination()}.
	*/
	@Test
	public void testIsOutputDestination() {
			final String msg = "Test if OutputDestination is OutputDestination.";
		final OutputDestination originalDestination = new OutputDestination();
		for (OutputDestination destDestinationToAdd : this.outputDos) {
			final String msgOrig = getMsgForDestination(destDestinationToAdd);
			final String outputDst;
			final OutputDestination destDestination = new OutputDestination(destDestinationToAdd);
			
			assertTrue(destDestination.isOutputDestination());
			
			originalDestination.addOutputDestination(destDestination);
			outputDst = destDestination.getDst();
			assertEquals(originalDestination.getDst(), outputDst);
			
			assertEquals(msgOrig, getMsgForDestination(outputDst));
			
			if (originalDestination.equals(destDestination)) assertTrue(getMsgForDestination(outputDst).equals(msgOrig));
			
			// if the original is not equal to the destination (since getDst() just used
			// directly)
			assertFalse(originalDestination.equals(destDestination));
		}
	}

	/**
	* Test if string contains string.
	*
	* @param s The input string
	* @return The string which has a substring or 'null' if the input string
	* was null or empty
	*/
	private String getMsgForDestination(String s) {
		assertTrue(this.outputDos.contains(s));
		return s == null? null : s.toLowerCase();
	}
}

/**
* FileFollower_1Destination
*
* @author <a href="mailto:greghmerrill@yahoo.com">Greg Merrill</a>
*/
class OutputDestination extends OutputDestination {

	OutputDestination(String s) {
		super(s, true);
	}

	/**
	* GetOutputDestination method that provides this subclass
	* to override.
	*/
	@Override
	public void clearDestination()
	{
		for (File f : this.outputDos)
			f.delete();
	}
}

/**
* FileFollower_2Destination
*
* @author <a href="mailto:greghmerrill@yahoo.com">Greg Merrill</a>
*/
class OutputDestination extends OutputDestination
{
	OutputDestination(File f) {
		super(f, false);
	}

	private List<File> outputDos;

	/**
	* GetOutputDestination method that is called.
	*
	* @param l The input destination
	* @return The list of files whose contents should be printed to the
	* destination.
	*/
	@Override
	public List<File> getDestinationList()
	{
		List<File> tmpList;
		List<File> fListToReturn;
		if (this.outputDos.isEmpty()) {
			tmpList = new EmptyDefaultListOfFiles();
			fListToReturn = tmpList;
		} else {
			tmpList = new EmptyDefaultListOfFiles(this.outputDos);
			fListToReturn = tmpList;
		}
		return fListToReturn;
	}
}

/**
* EmptyDefaultListOfFiles
*
* @author <a href="mailto:greghmerrill@yahoo.com">Greg Merrill</a>
*/
class EmptyDefaultListOfFiles extends ArrayList<File>
{
	List<File> list;
	
	EmptyDefaultListOfFiles(List<File> rtn)
	{
		this.list = rtn;
	}
}

/**
* FileFollower_1Destination
*
* @author <a href="mailto:greghmerrill@yahoo.com">Greg Merrill</a>
*/
class OutputDestination
{
	/**
	* Test if the following conditions hold:
	* 1: The destination should not be null;
	*/
}