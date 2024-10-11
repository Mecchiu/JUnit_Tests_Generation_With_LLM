// FSPathResultListImplTest.java
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
class FSPathResultListImplTest {

	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 * This test case is for the scenario where the FSPathResultListImpl contains
	 * a single FSPathResult object that contains a File object.
	 * The file is deleted and the FSPathResultModificationListImpl returned by the
	 * delete method is checked to ensure that it contains a single success.
	 */
	@Test
	public void testDelete_SingleFile() throws Exception {
		System.out.println("delete");
		File file = File.createTempFile("testDelete_SingleFile", ".tmp");
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResultImpl(file));
		FSPathResultModificationList result = instance.delete();
		assertEquals(1, result.getSuccesses().size());
		assertEquals(0, result.getFailures().size());
	}

	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 * This test case is for the scenario where the FSPathResultListImpl contains
	 * a single FSPathResult object that contains a File object.
	 * The file is deleted and the FSPathResultModificationListImpl returned by the
	 * delete method is checked to ensure that it contains a single success.
	 */
	@Test
	public void testDelete_SingleFile_NonExistant() throws Exception {
		System.out.println("delete");
		File file = File.createTempFile("testDelete_SingleFile_NonExistant", ".tmp");
		file.delete();
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResultImpl(file));
		FSPathResultModificationList result = instance.delete();
		assertEquals(0, result.getSuccesses().size());
		assertEquals(1, result.getFailures().size());
	}

	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 * This test case is for the scenario where the FSPathResultListImpl contains
	 * a single FSPathResult object that contains a File object.
	 * The file is deleted and the FSPathResultModificationListImpl returned by the
	 * delete method is checked to ensure that it contains a single success.
	 */
	@Test
	public void testDelete_SingleFile_ReadOnly() throws Exception {
		System.out.println("delete");
		File file = File.createTempFile("testDelete_SingleFile_ReadOnly", ".tmp");
		file.setReadOnly();
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResultImpl(file));
		FSPathResultModificationList result = instance.delete();
		assertEquals(0, result.getSuccesses().size());
		assertEquals(1, result.getFailures().size());
	}

	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 * This test case is for the scenario where the FSPathResultListImpl contains
	 * a single FSPathResult object that contains a File object.
	 * The file is deleted and the FSPathResultModificationListImpl returned by the
	 * delete method is checked to ensure that it contains a single success.
	 */
	@Test
	public void testDelete_SingleFile_Directory() throws Exception {
		System.out.println("delete");
		File file = File.createTempFile("testDelete_SingleFile_Directory", ".tmp");
		file.delete();
		file.mkdir();
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResultImpl(file));
		FSPathResultModificationList result = instance.delete();
		assertEquals(0, result.getSuccesses().size());
		assertEquals(1, result.getFailures().size());
	}

	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 * This test case is for the scenario where the FSPathResultListImpl contains
	 * a single FSPathResult object that contains a File object.
	 * The file is deleted and the FSPathResultModificationListImpl returned by the
	 * delete method is checked to ensure that it contains a single success.
	 */
	@Test
	public void testDelete_SingleFile_Directory_NonEmpty() throws Exception {
		System.out.println("delete");
		File file = File.createTempFile("testDelete_SingleFile_Directory_NonEmpty", ".tmp");
		file.delete();
		file.mkdir();
		File file2 = new File(file, "testDelete_SingleFile_Directory_NonEmpty.tmp");
		file2.createNewFile();
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResultImpl(file));
		FSPathResultModificationList result = instance.delete();
		assertEquals(0, result.getSuccesses().size());
		assertEquals(1, result.getFailures().size());
	}

	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 * This test case is for the scenario where the FSPathResultListImpl contains
	 * a single FSPathResult object that contains a File object.
	 * The file is deleted and the FSPathResultModificationListImpl returned by the
	 * delete method is checked to ensure that it contains a single success.
	 */
	@Test
	public void testDelete_SingleFile_Directory_NonEmpty_ReadOnly() throws Exception {
		System.out.println("delete");
		File file = File.createTempFile("testDelete_SingleFile_Directory_NonEmpty_ReadOnly", ".tmp");
		file.delete();
		file.mkdir();
		File file2 = new File(file, "testDelete_SingleFile_Directory_NonEmpty_ReadOnly.tmp");
		file2.createNewFile();
		file2.setReadOnly();
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResultImpl(file));
		FSPathResultModificationList result = instance.delete();
		assertEquals(0, result.getSuccesses().size());
		assertEquals(1, result.getFailures().size());
	}

	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 * This test case is for the scenario where the FSPathResultListImpl contains
	 * a single FSPathResult object that contains a File object.
	 * The file is deleted and the FSPathResultModificationListImpl returned by the
	 * delete method is checked to ensure that it contains a single success.
	 */
	@Test
	public void testDelete_SingleFile_Directory_NonEmpty_ReadOnly_Recursive() throws Exception {
		System.out.println("delete");
		File file = File.createTempFile("testDelete_SingleFile_Directory_NonEmpty_ReadOnly_Recursive", ".tmp");
		file.delete();
		file.mkdir();
		File file2 = new File(file, "testDelete_SingleFile_Directory_NonEmpty_ReadOnly_Recursive.tmp");
		file2.createNewFile();
		file2.setReadOnly();
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResultImpl(file));
		FSPathResultModificationList result = instance.delete();
		assertEquals(0, result.getSuccesses().size());
		assertEquals(1, result.getFailures().size());
	}

	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 * This test case is for the scenario where the FSPathResultListImpl contains
	 * a single FSPathResult object that contains a File object.
	 * The file is deleted and the FSPathResultModificationListImpl returned by the
	 * delete method is checked to ensure that it contains a single success.
	 */
	@Test
	public void testDelete