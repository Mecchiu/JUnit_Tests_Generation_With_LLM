// FSPathResultListImpl_1Test.java
/*
 * FSPathResultListImpl.java
 *
 * Created on 08 April 2008, 18:00
 *
 */
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
	 * Test of delete method, of class FSPathResultListImpl.
	 */
	@Test
	void testDelete() throws Exception {
		System.out.println("delete");
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultModificationList result = instance.delete();
		assertTrue(result.getSuccesses().isEmpty());
		assertTrue(result.getFailures().isEmpty());
	}

	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 */
	@Test
	void testDelete_1() throws Exception {
		System.out.println("delete");
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResult(new File("/tmp/test.txt")));
		FSPathResultModificationList result = instance.delete();
		assertTrue(result.getSuccesses().isEmpty());
		assertTrue(result.getFailures().isEmpty());
	}

	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 */
	@Test
	void testDelete_2() throws Exception {
		System.out.println("delete");
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResult(new File("/tmp/test.txt")));
		FileWriter writer = new FileWriter(new File("/tmp/test.txt"));
		writer.write("test");
		writer.close();
		FSPathResultModificationList result = instance.delete();
		assertTrue(result.getSuccesses().size() == 1);
		assertTrue(result.getFailures().isEmpty());
	}

	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 */
	@Test
	void testDelete_3() throws Exception {
		System.out.println("delete");
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResult(new File("/tmp/test.txt")));
		instance.add(new FSPathResult(new File("/tmp/test2.txt")));
		FileWriter writer = new FileWriter(new File("/tmp/test.txt"));
		writer.write("test");
		writer.close();
		writer = new FileWriter(new File("/tmp/test2.txt"));
		writer.write("test");
		writer.close();
		FSPathResultModificationList result = instance.delete();
		assertTrue(result.getSuccesses().size() == 2);
		assertTrue(result.getFailures().isEmpty());
	}

	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 */
	@Test
	void testDelete_4() throws Exception {
		System.out.println("delete");
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResult(new File("/tmp/test.txt")));
		instance.add(new FSPathResult(new File("/tmp/test2.txt")));
		FileWriter writer = new FileWriter(new File("/tmp/test.txt"));
		writer.write("test");
		writer.close();
		FSPathResultModificationList result = instance.delete();
		assertTrue(result.getSuccesses().size() == 1);
		assertTrue(result.getFailures().size() == 1);
	}

	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 */
	@Test
	void testDelete_5() throws Exception {
		System.out.println("delete");
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResult(new File("/tmp/test.txt")));
		instance.add(new FSPathResult(new File("/tmp/test2.txt")));
		FileWriter writer = new FileWriter(new File("/tmp/test.txt"));
		writer.write("test");
		writer.close();
		writer = new FileWriter(new File("/tmp/test2.txt"));
		writer.write("test");
		writer.close();
		FSPathResultModificationList result = instance.delete();
		assertTrue(result.getSuccesses().size() == 2);
		assertTrue(result.getFailures().isEmpty());
	}

	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 */
	@Test
	void testDelete_6() throws Exception {
		System.out.println("delete");
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResult(new File("/tmp/test.txt")));
		instance.add(new FSPathResult(new File("/tmp/test2.txt")));
		FileWriter writer = new FileWriter(new File("/tmp/test.txt"));
		writer.write("test");
		writer.close();
		writer = new FileWriter(new File("/tmp/test2.txt"));
		writer.write("test");
		writer.close();
		FSPathResultModificationList result = instance.delete();
		assertTrue(result.getSuccesses().size() == 2);
		assertTrue(result.getFailures().isEmpty());
	}

	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 */
	@Test
	void testDelete_7() throws Exception {
		System.out.println("delete");
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResult(new File("/tmp/test.txt")));
		instance.add(new FSPathResult(new File("/tmp/test2.txt")));
		FileWriter writer = new FileWriter(new File("/tmp/test.txt"));
		writer.write("test");
		writer.close();
		writer = new FileWriter(new File("/tmp/test2.txt"));
		writer.write("test");
		writer.close();
		FSPathResultModificationList result = instance.delete();
		assertTrue(result.getSuccesses().size() == 2);
		assertTrue(result.getFailures().isEmpty());
	}

	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 */
	@Test
	void testDelete_8() throws Exception {
		System.out.println("delete");
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResult(new File("/tmp/test.txt")));
		instance.add(new FSPathResult(new File("/tmp/test2.txt")));
		FileWriter writer = new FileWriter(new File("/tmp/test.txt"));
		writer.write("test");
		writer.close();
		writer = new FileWriter(new File("/tmp/test2.txt"));
		writer.write("test");
		writer.close();
		FSPathResultModificationList result = instance.delete();
		assertTrue(result.getSuccesses().size() == 2);
		assertTrue(result.getFailures().isEmpty());
	}

	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 */
	@Test
	void testDelete_9() throws Exception {
		System.out.println("delete");
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResult(new File("/tmp/test.txt")));
		instance.add(new FSPathResult(new File("/tmp/test2.txt")));
		FileWriter writer = new FileWriter(new File("/tmp/test.txt"));
		writer.write("test");
		writer.close();
		writer = new FileWriter(new File("/tmp/test2.txt"));
		writer.write("test");
		writer.close();
		FSPathResultModificationList result = instance.delete();
		assertTrue(result.getSuccesses().size() == 2);
		assertTrue(result.getFailures().isEmpty());
	}

	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 */
	@Test
	void testDelete_10() throws Exception {
		System.out.println("delete");
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResult(new File("/tmp/test.txt")));
		instance.add(new FSPathResult(new File("/tmp/test2.txt")));
		FileWriter writer = new FileWriter(new File("/tmp/test.txt"));
		writer.write("test");
		writer.close();
		writer = new FileWriter(new File("/tmp/test2.txt"));
		writer.write("test");
		writer.close();
		FSPathResultModificationList result = instance.delete();
		assertTrue(result.getSuccesses().size() == 2);
		assertTrue(result.getFailures().isEmpty());
	}
}

// FSPathResultListImpl_2Test.java
/*
 * FSPathResultListImpl.java
 *
 * Created on 08 April 2008, 18:00
 *
 */
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
	 * Test of copy method, of class FSPathResultListImpl.
	 */
	@Test
	void testCopy() throws Exception {
		System.out.println("copy");
		String destinationDirPath = "/tmp/test";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultModificationList result = instance.copy(destinationDirPath);
		assertTrue(result.getSuccesses().isEmpty());
		assertTrue(result.getFailures().isEmpty());
	}

	/**
	 * Test of copy method, of class FSPathResultListImpl.
	 */
	@Test
	void testCopy_1() throws Exception {
		System.out.println("copy");
		String destinationDirPath = "/tmp/test";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResult(new File("/tmp/test.txt")));
		FSPathResultModificationList result = instance.copy(destinationDirPath);
		assertTrue(result.getSuccesses().isEmpty());
		assertTrue(result.getFailures().isEmpty());
	}

	/**
	 * Test of copy method, of class FSPathResultListImpl.
	 */
	@Test
	void testCopy_2() throws Exception {
		System.out.println("copy");
		String destinationDirPath = "/tmp/test";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResult(new File("/tmp/test.txt")));
		FileWriter writer = new FileWriter(new File("/tmp/test.txt"));
		writer.write("test");
		writer.close();
		FSPathResultModificationList result = instance.copy(destinationDirPath);
		assertTrue(result.getSuccesses().size() == 1);
		assertTrue(result.getFailures().isEmpty());
	}

	/**
	 * Test of copy method, of class FSPathResultListImpl.
	 */
	@Test
	void testCopy_3() throws Exception {
		System.out.println("copy");
		String destinationDirPath = "/tmp/test";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResult(new File("/tmp/test.txt")));
		instance.add(new FSPathResult(new File("/tmp/test2.txt")));
		FileWriter writer = new FileWriter(new File("/tmp/test.txt"));
		writer.write("test");
		writer.close();
		writer = new FileWriter(new File("/tmp/test2.txt"));
		writer.write("test");
		writer.close();
		FSPathResultModificationList result = instance.copy(destinationDirPath);
		assertTrue(result.getSuccesses().size() == 2);
		assertTrue(result.getFailures().isEmpty());
	}

	/**
	 * Test of copy method, of class FSPathResultListImpl.
	 */
	@Test
	void testCopy_4() throws Exception {
		System.out.println("copy");
		String destinationDirPath = "/tmp/test";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResult(new File("/tmp/test.txt")));
		instance.add(new FSPathResult(new File("/tmp/test2.txt")));
		FileWriter writer = new FileWriter(new File("/tmp/test.txt"));
		writer.write("test");
		writer.close();
		FSPathResultModificationList result = instance.copy(destinationDirPath);
		assertTrue(result.getSuccesses().size() == 1);
		assertTrue(result.getFailures().size() == 1);
	}

	/**
	 * Test of copy method, of class FSPathResultListImpl.
	 */
	@Test
	void testCopy_5() throws Exception {
		System.out.println("copy");
		String destinationDirPath = "/tmp/test";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResult(new File("/tmp/test.txt")));
		instance.add(new FSPathResult(new File("/tmp/test2.txt")));
		FileWriter writer = new FileWriter(new File("/tmp/test.txt"));
		writer.write("test");
		writer.close();
		writer = new FileWriter(new File("/tmp/test2.txt"));
		writer.write("test");
		writer.close();
		FSPathResultModificationList result = instance.copy(destinationDirPath);
		assertTrue(result.getSuccesses().size() == 2);
		assertTrue(result.getFailures().isEmpty());
	}

	/**
	 * Test of copy method, of class FSPathResultListImpl.
	 */
	@Test
	void testCopy_6() throws Exception {
		System.out.println("copy");
		String destinationDirPath = "/tmp/test";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResult(new File("/tmp/test.txt")));
		instance.add(new FSPathResult(new File("/tmp/test2.txt")));
		FileWriter writer = new FileWriter(new File("/tmp/test.txt"));
		writer.write("test");
		writer.close();
		writer = new FileWriter(new File("/tmp/test2.txt"));
		writer.write("