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
		File child = new File(file, "child");
		child.createNewFile();
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
	public void testDelete_SingleFile_Directory_NonEmpty_Recursive() throws Exception {
		System.out.println("delete");
		File file = File.createTempFile("testDelete_SingleFile_Directory_NonEmpty_Recursive", ".tmp");
		file.delete();
		file.mkdir();
		File child = new File(file, "child");
		child.createNewFile();
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
	public void testDelete_SingleFile_Directory_NonEmpty_Recursive_ReadOnly() throws Exception {
		System.out.println("delete");
		File file = File.createTempFile("testDelete_SingleFile_Directory_NonEmpty_Recursive_ReadOnly", ".tmp");
		file.delete();
		file.mkdir();
		File child = new File(file, "child");
		child.createNewFile();
		child.setReadOnly();
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
	public void testDelete_SingleFile_Directory_NonEmpty_Recursive_ReadOnly_DeleteChild() throws Exception {
		System.out.println("delete");
		File file = File.createTempFile("testDelete_SingleFile_Directory_NonEmpty_Recursive_ReadOnly_DeleteChild", ".tmp");
		file.delete();
		file.mkdir();
		File child = new File(file, "child");
		child.createNewFile();
		child.setReadOnly();
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
	public void testDelete_SingleFile_Directory_NonEmpty_Recursive_ReadOnly_DeleteChild_DeleteParent() throws Exception {
		System.out.println("delete");
		File file = File.createTempFile("testDelete_SingleFile_Directory_NonEmpty_Recursive_ReadOnly_DeleteChild_DeleteParent", ".tmp");
		file.delete();
		file.mkdir();
		File child = new File(file, "child");
		child.createNewFile();
		child.setReadOnly();
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
	public void testDelete_SingleFile_Directory_NonEmpty_Recursive_ReadOnly_DeleteChild_DeleteParent_DeleteChild() throws Exception {
		System.out.println("delete");
		File file = File.createTempFile("testDelete_SingleFile_Directory_NonEmpty_Recursive_ReadOnly_DeleteChild_DeleteParent_DeleteChild", ".tmp");
		file.delete();
		file.mkdir();
		File child = new File(file, "child");
		child.createNewFile();
		child.setReadOnly();
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
	public void testDelete_SingleFile_Directory_NonEmpty_Recursive_ReadOnly_DeleteChild_DeleteParent_DeleteChild_DeleteParent() throws Exception {
		System.out.println("delete");
		File file = File.createTempFile("testDelete_SingleFile_Directory_NonEmpty_Recursive_ReadOnly_DeleteChild_DeleteParent_DeleteChild_DeleteParent", ".tmp");
		file.delete();
		file.mkdir();
		File child = new File(file, "child");
		child.createNewFile();
		child.setReadOnly();
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResultImpl(file));
		FSPathResultModificationList result = instance.delete();
		assertEquals(0, result.getSuccesses().size());
		assertEquals(1, result.getFailures().size());
	}
}

// FSPathResultModificationListImpl.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kbishop
 * @version $Id$
 */
public class FSPathResultModificationListImpl extends ArrayList<FSPathResult> implements FSPathResultModificationList {

    private ArrayList<FSPathResult> successes = new ArrayList<FSPathResult>();
    private ArrayList<FSPathResult> failures = new ArrayList<FSPathResult>();

    public void addSuccess(FSPathResult result) {
        successes.add(result);
    }

    public void addFailure(FSPathResult result) {
        failures.add(result);
    }

    public FSPathResultList getSuccesses() {
        return new FSPathResultListImpl(successes);
    }

    public FSPathResultList getFailures() {
        return new FSPathResultListImpl(failures);
    }
}

// FSPathResultModificationListImplTest.java
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
* Test class of {@link FSPathResultModificationListImpl}.
* It contains ten unit test cases for the {@link FSPathResultModificationListImpl#delete()} method.
*/
class FSPathResultModificationListImplTest {
		
	/**
	 * Test of delete method, of class FSPathResultModificationListImpl.
	 * This test case is for the scenario where the FSPathResultModificationListImpl contains
	 * a single FSPathResult object that contains a File object.
	 * The file is deleted and the FSPathResultModificationListImpl returned by the
	 * delete method is checked to ensure that it contains a single success.
	 */
	@Test
	public void testDelete_SingleFile() throws Exception {
		System.out.println("delete");
		File file = File.createTempFile("testDelete_SingleFile", ".tmp");
		FSPathResultModificationListImpl instance = new FSPathResultModificationListImpl();
		instance.add(new FSPathResultImpl(file));
		FSPathResultModificationList result = instance.delete();
		assertEquals(1, result.getSuccesses().size());
		assertEquals(0, result.getFailures().size());
	}

	/**
	 * Test of delete method, of class FSPathResultModificationListImpl.
	 * This test case is for the scenario where the FSPathResultModificationListImpl contains
	 * a single FSPathResult object that contains a File object.
	 * The file is deleted and the FSPathResultModificationListImpl returned by the
	 * delete method is checked to ensure that it contains a single success.
	 */
	@Test
	public void testDelete_SingleFile_NonExistant() throws Exception {
		System.out.println("delete");
		File file = File.createTempFile("testDelete_SingleFile_NonExistant", ".tmp");
		file.delete();
		FSPathResultModificationList