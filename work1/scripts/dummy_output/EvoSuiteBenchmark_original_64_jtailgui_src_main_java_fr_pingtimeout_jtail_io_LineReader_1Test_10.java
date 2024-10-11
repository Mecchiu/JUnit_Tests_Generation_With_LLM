// LineReader_1Test.java
package fr.pingtimeout.jtail.io;

import fr.pingtimeout.jtail.io.index.FileIndex;
import fr.pingtimeout.jtail.util.JTailLogger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LineReader}.
* It contains one unit test case for the {@link LineReader#readBlock(int, int)} method.
*/
class LineReader_1Test {
		
	/**
	 * Creates new instance of <code>LineReader_1Test</code> for testing {@link LineReader#readBlock(int, int)}.
	 *
	 * @return new instance of <code>LineReader_1Test</code>
	 * @throws IOException if an I/O error happened while creating the new instance
	 */
	public static LineReader.LineReader_1Test createTest() throws IOException {
  return new LineReader.LineReader_1Test("LineReader_1Test
  testReadBlock_1Test");
	}
	
	/**
	 * This unit test class' constructor is responsible for creating the test instances.
	 * <P>Inherit from <code>LineReader.LineReader_1Test</code> for
	 * instantiating a test case.
	 * <P>
	 * @param className class name of the test to instantiate.
	 * @throws FileNotFoundException if given a file in unexpected location.
	 * @throws IllegalArgumentException if argument to <code>setFilePointer()</code> is negative.
	 * @throws IOException if I/O error happened during instantiation
	 */
	private static void createTest(String className) throws FileNotFoundException, IOException {
		System.out.println("Creating test with className: "+className);
		LineReader.LineReader_1Test test = (LineReader.LineReader_1Test)Class.forName(className).getConstructor().newInstance();
		System.out.println("OK");
		System.out.println(test.isReadonly());
		System.out.println(test.isReadonly(true));
		assertEquals(test.isReadonly(), readOnly);
		assertEquals(test.isReadonly(), true);
		assertEquals(test.isReadonly(true), readOnly);
		System.out.println("Test for setFilePointer with negative parameter: "+test.getMismatch());
  }
					
	/**
	 * Test for readBlock().
	 *
	 * @throws IOException if an I/O error happened while writing the test
	 */
	@Test
	public void testReadBlock_1Test() throws IOException {
	createTest("LineReader.LineReader_1Test.testReadBlock_1Test");
	}

	/**
	 * Test for readBlock().
	 *
	 * @throws FileNotFoundException file not found error
	 * @throws IOException I/O error
	 */
	@Test
	public void testReadBlock_2Test() throws FileNotFoundException, IOException {
		File f = new File("testReadBlock_2Test.txt");
		List<String> lines = new ArrayList<String>();
		lines.add("This is a hello block.");
		lines.add("This block is a hello block.");
		lines.add("This block is a hello block.");
		lines.add("This block is a hello block.");
		lines.add("This block is a hello world");
		lines.add("This block is a hello world");
		while(f.length() < lines.size()) {
  lines.add(f.getName());
  f = new File(f.getParent()+"/"+f.getName());
		}
		if(lines.size()!= lines.size()) {
  throw new AssertionError("Test file size: "+lines);
    }
		System.out.println("testReadBlock() - Lines: " + lines);
		LineReader.LineReader_1Test.writeBlock("This is a hello block.",f);
		RandomAccessFile rv = new RandomAccessFile(f, READONLY_MODE);
		final byte[] byteArray = new byte[4096];
		rv.seek(1);
		int numRead = 0;
		while(numRead < lines.size()) {
  /* This makes sure that every block is written to the correct position.
     This will be needed if one of the tests is broken. */
  while(rv.getFilePointer() < 1000) {
  numRead++; 
  assertEquals(rv.getFilePointer(), numRead);
	}
		byteArray[0] = (byte)numRead;
		assertEquals(new String(byteArray), lines);
		rv.close();
		rv.delete();
	}
}
}