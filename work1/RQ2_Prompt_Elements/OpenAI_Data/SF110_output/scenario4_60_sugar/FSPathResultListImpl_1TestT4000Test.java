// FSPathResultListImpl_1Test.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultListImpl}.
* It contains ten unit test cases for the {@link FSPathResultListImpl#delete()} method.
*/
class FSPathResultListImpl_1Test {

	/**
	* Test case for the {@link FSPathResultListImpl#delete()} method.
	* It tests the case when the {@link FSPathResultListImpl} contains a {@link FSPathResult} object
	* that contains a {@link File} object that represents a file that exists.
	* It expects that the file is deleted.
	*/
	@Test
	void testDelete_1() throws IOException, OperationNotPermittedException {
		File file = new File("testDelete_1.txt");
		file.createNewFile();
		FSPathResultListImpl fspathResultListImpl = new FSPathResultListImpl();
		fspathResultListImpl.add(new FSPathResultImpl(file));
		FSPathResultModificationList fspathResultModificationList = fspathResultListImpl.delete();
		assertEquals(1, fspathResultModificationList.getSuccesses().size());
		assertEquals(0, fspathResultModificationList.getFailures().size());
		assertFalse(file.exists());
	}
	
	/**
	* Test case for the {@link FSPathResultListImpl#delete()} method.
	* It tests the case when the {@link FSPathResultListImpl} contains a {@link FSPathResult} object
	* that contains a {@link File} object that represents a file that does not exist.
	* It expects that the file is not deleted.
	*/
	@Test
	void testDelete_2() throws IOException, OperationNotPermittedException {
		File file = new File("testDelete_2.txt");
		FSPathResultListImpl fspathResultListImpl = new FSPathResultListImpl();
		fspathResultListImpl.add(new FSPathResultImpl(file));
		FSPathResultModificationList fspathResultModificationList = fspathResultListImpl.delete();
		assertEquals(0, fspathResultModificationList.getSuccesses().size());
		assertEquals(1, fspathResultModificationList.getFailures().size());
		assertFalse(file.exists());
	}
	
	/**
	* Test case for the {@link FSPathResultListImpl#delete()} method.
	* It tests the case when the {@link FSPathResultListImpl} contains a {@link FSPathResult} object
	* that contains a {@link File} object that represents a directory that exists.
	* It expects that the directory is not deleted.
	*/
	@Test
	void testDelete_3() throws IOException, OperationNotPermittedException {
		File file = new File("testDelete_3");
		file.mkdir();
		FSPathResultListImpl fspathResultListImpl = new FSPathResultListImpl();
		fspathResultListImpl.add(new FSPathResultImpl(file));
		FSPathResultModificationList fspathResultModificationList = fspathResultListImpl.delete();
		assertEquals(0, fspathResultModificationList.getSuccesses().size());
		assertEquals(1, fspathResultModificationList.getFailures().size());
		assertTrue(file.exists());
	}
	
	/**
	* Test case for the {@link FSPathResultListImpl#delete()} method.
	* It tests the case when the {@link FSPathResultListImpl} contains a {@link FSPathResult} object
	* that contains a {@link File} object that represents a directory that does not exist.
	* It expects that the directory is not deleted.
	*/
	@Test
	void testDelete_4() throws IOException, OperationNotPermittedException {
		File file = new File("testDelete_4");
		FSPathResultListImpl fspathResultListImpl = new FSPathResultListImpl();
		fspathResultListImpl.add(new FSPathResultImpl(file));
		FSPathResultModificationList fspathResultModificationList = fspathResultListImpl.delete();
		assertEquals(0, fspathResultModificationList.getSuccesses().size());
		assertEquals(1, fspathResultModificationList.getFailures().size());
		assertFalse(file.exists());
	}
	
	/**
	* Test case for the {@link FSPathResultListImpl#delete()} method.
	* It tests the case when the {@link FSPathResultListImpl} contains a {@link FSPathResult} object
	* that contains a {@link File} object that represents a file that exists and is read-only.
	* It expects that the file is not deleted.
	*/
	@Test
	void testDelete_5() throws IOException, OperationNotPermittedException {
		File file = new File("testDelete_5.txt");
		file.createNewFile();
		file.setReadOnly();
		FSPathResultListImpl fspathResultListImpl = new FSPathResultListImpl();
		fspathResultListImpl.add(new FSPathResultImpl(file));
		FSPathResultModificationList fspathResultModificationList = fspathResultListImpl.delete();
		assertEquals(0, fspathResultModificationList.getSuccesses().size());
		assertEquals(1, fspathResultModificationList.getFailures().size());
		assertTrue(file.exists());
	}
	
	/**
	* Test case for the {@link FSPathResultListImpl#delete()} method.
	* It tests the case when the {@link FSPathResultListImpl} contains a {@link FSPathResult} object
	* that contains a {@link File} object that represents a file that exists and is hidden.
	* It expects that the file is deleted.
	*/
	@Test
	void testDelete_6() throws IOException, OperationNotPermittedException {
		File file = new File("testDelete_6.txt");
		file.createNewFile();
		file.setHidden(true);
		FSPathResultListImpl fspathResultListImpl = new FSPathResultListImpl();
		fspathResultListImpl.add(new FSPathResultImpl(file));
		FSPathResultModificationList fspathResultModificationList = fspathResultListImpl.delete();
		assertEquals(1, fspathResultModificationList.getSuccesses().size());
		assertEquals(0, fspathResultModificationList.getFailures().size());
		assertFalse(file.exists());
	}
	
	/**
	* Test case for the {@link FSPathResultListImpl#delete()} method.
	* It tests the case when the {@link FSPathResultListImpl} contains a {@link FSPathResult} object
	* that contains a {@link File} object that represents a file that exists and is a symbolic link.
	* It expects that the file is deleted.
	*/
	@Test
	void testDelete_7() throws IOException, OperationNotPermittedException {
		File file = new File("testDelete_7.txt");
		file.createNewFile();
		File link = new File("testDelete_7_link.txt");
		link.createNewFile();
		link.delete();
		link.createSymbolicLink(file);
		FSPathResultListImpl fspathResultListImpl = new FSPathResultListImpl();
		fspathResultListImpl.add(new FSPathResultImpl(link));
		FSPathResultModificationList fspathResultModificationList = fspathResultListImpl.delete();
		assertEquals(1, fspathResultModificationList.getSuccesses().size());
		assertEquals(0, fspathResultModificationList.getFailures().size());
		assertFalse(link.exists());
		assertTrue(file.exists());
	}
	
	/**
	* Test case for the {@link FSPathResultListImpl#delete()} method.
	* It tests the case when the {@link FSPathResultListImpl} contains a {@link FSPathResult} object
	* that contains a {@link File} object that represents a file that exists and is a symbolic link
	* to a directory.
	* It expects that the file is not deleted.
	*/
	@Test
	void testDelete_8() throws IOException, OperationNotPermittedException {
		File file = new File("testDelete_8");
		file.mkdir();
		File link = new File("testDelete_8_link");
		link.createNewFile();
		link.delete();
		link.createSymbolicLink(file);
		FSPathResultListImpl fspathResultListImpl = new FSPathResultListImpl();
		fspathResultListImpl.add(new FSPathResultImpl(link));
		FSPathResultModificationList fspathResultModificationList = fspathResultListImpl.delete();
		assertEquals(0, fspathResultModificationList.getSuccesses().size());
		assertEquals(1, fspathResultModificationList.getFailures().size());
		assertTrue(link.exists());
		assertTrue(file.exists());
	}
	
	/**
	* Test case for the {@link FSPathResultListImpl#delete()} method.
	* It tests the case when the {@link FSPathResultListImpl} contains a {@link FSPathResult} object
	* that contains a {@link File} object that represents a file that exists and is a symbolic link
	* to a file that does not exist.
	* It expects that the file is deleted.
	*/
	@Test
	void testDelete_9() throws IOException, OperationNotPermittedException {
		File file = new File("testDelete_9.txt");
		File link = new File("testDelete_9_link.txt");
		link.createNewFile();
		link.delete();
		link.createSymbolicLink(file);
		FSPathResultListImpl fspathResultListImpl = new FSPathResultListImpl();
		fspathResultListImpl.add(new FSPathResultImpl(link));
		FSPathResultModificationList fspathResultModificationList = fspathResultListImpl.delete();
		assertEquals(1, fspathResultModificationList.getSuccesses().size());
		assertEquals(0, fspathResultModificationList.getFailures().size());
		assertFalse(link.exists());
		assertFalse(file.exists());
	}
	
	/**
	* Test case for the {@link FSPathResultListImpl#delete()} method.
	* It tests the case when the {@link FSPathResultListImpl} contains a {@link FSPathResult} object
	* that contains a {@link File} object that represents a file that exists and is a symbolic link
	* to a file that exists.
	* It expects that the file is deleted.
	*/
	@Test
	void testDelete_10() throws IOException, OperationNotPermittedException {
		File file = new File("testDelete_10.txt");
		file.createNewFile();
		File link = new File("testDelete_10_link.txt");
		link.createNewFile();
		link.delete();
		link.createSymbolicLink(file);
		FSPathResultListImpl fspathResultListImpl = new FSPathResultListImpl();
		fspathResultListImpl.add(new FSPathResultImpl(link));
		FSPathResultModificationList fspathResultModificationList = fspathResultListImpl.delete();
		assertEquals(1, fspathResultModificationList.getSuccesses().size());
		assertEquals(0, fspathResultModificationList.getFailures().size());
		assertFalse(link.exists());
		assertTrue(file.exists());
	}
}

// FSPathResultListImpl_2Test.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultListImpl}.
* It contains ten unit test cases for the {@link FSPathResultListImpl#copy(String)} method.
*/
class FSPathResultListImpl_2Test {
		
	/**
	* Test case for the {@link FSPathResultListImpl#copy(String)} method.
	* It tests the case when the {@link FSPathResultListImpl} contains a {@link FSPathResult} object
	* that contains a {@link File} object that represents a file that exists and the destination directory exists.
	* It expects that the file is copied.
	*/
	@Test
	void testCopy_1() throws IOException, OperationNotPermittedException {
		File file = new File("testCopy_1.txt");
		file.createNewFile();
		File destinationDir = new File("testCopy_1_destination");
		destinationDir.mkdir();
		FSPathResultListImpl fspathResultListImpl = new FSPathResultListImpl();
		fspathResultListImpl.add(new FSPathResultImpl(file));
		FSPathResultModificationList fspathResultModificationList = fspathResultListImpl.copy(destinationDir.getAbsolutePath());
		assertEquals(1, fspathResultModificationList.getSuccesses().size());
		assertEquals(0, fspathResultModificationList.getFailures().size());
		assertTrue(file.exists());
		assertTrue(new File(destinationDir, file.getName()).exists());
	}
	
	/**
	* Test case for the {@link FSPathResultListImpl#copy(String)} method.
	* It tests the case when the {@link FSPathResultListImpl} contains a {@link FSPathResult} object
	* that contains a {@link File} object that represents a file that exists and the destination directory does not exist.
	* It expects that the file is not copied.
	*/
	@Test
	void testCopy_2() throws IOException, OperationNotPermittedException {
		File file = new File("testCopy_2.txt");
		file.createNewFile();
		File destinationDir = new File("testCopy_2_destination");
		FSPathResultListImpl fspathResultListImpl = new FSPathResultListImpl();
		fspathResultListImpl.add(new FSPathResultImpl(file));
		FSPathResultModificationList fspathResultModificationList = fspathResultListImpl.copy(destinationDir.getAbsolutePath());
		assertEquals(0, fspathResultModificationList.getSuccesses().size());
		assertEquals(1, fspathResultModificationList.getFailures().size());
		assertTrue(file.exists());
		assertFalse(destinationDir.exists());
	}
	
	/**
	* Test case for the {@link FSPathResultListImpl#copy(String)} method.
	* It tests the case when the {@link FSPathResultListImpl} contains a {@link FSPathResult} object
	* that contains a {@link File} object that represents a file that exists and the destination directory exists
	* and the destination directory is not writeable.
	* It expects that the file is not copied.
	*/
	@Test
	void testCopy_3() throws IOException, OperationNotPermittedException {
		File file = new File("testCopy_3.txt");
		file.createNewFile();
		File destinationDir = new File("testCopy_3_destination");
		destinationDir.mkdir();
		destinationDir.setWritable(false);
