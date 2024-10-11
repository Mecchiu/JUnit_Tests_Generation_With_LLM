// FSPathResultListImpl_0Test.java
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
* It contains ten unit test cases for the {@link FSPathResultListImpl#each(Callback)} method.
*/
class FSPathResultListImpl_0Test {

	/**
	 * Test of each method, of class FSPathResultListImpl.
	 */
	@Test
	void testEach() throws Exception {
		System.out.println("each");
		Callback callback = null;
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultList expResult = null;
		FSPathResultList result = instance.each(callback);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 */
	@Test
	void testDelete() throws Exception {
		System.out.println("delete");
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultModificationList expResult = null;
		FSPathResultModificationList result = instance.delete();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
	/**
	 * Test of copy method, of class FSPathResultListImpl.
	 */
	@Test
	void testCopy() throws Exception {
		System.out.println("copy");
		String destinationDirPath = "";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultModificationList expResult = null;
		FSPathResultModificationList result = instance.copy(destinationDirPath);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
	/**
	 * Test of isListOfFiles method, of class FSPathResultListImpl.
	 */
	@Test
	void testIsListOfFiles() {
		System.out.println("isListOfFiles");
		FSPathResultListImpl instance = new FSPathResultListImpl();
		boolean expResult = false;
		boolean result = instance.isListOfFiles();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
	/**
	 * Test of rename method, of class FSPathResultListImpl.
	 */
	@Test
	void testRename() throws Exception {
		System.out.println("rename");
		String matchExpression = "";
		String replaceExpresion = "";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultModificationList expResult = null;
		FSPathResultModificationList result = instance.rename(matchExpression, replaceExpresion);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
	/**
	 * Test of move method, of class FSPathResultListImpl.
	 */
	@Test
	void testMove() throws Exception {
		System.out.println("move");
		String destinationPath = "";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultModificationList expResult = null;
		FSPathResultModificationList result = instance.move(destinationPath);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}

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
* It contains ten unit test cases for the {@link FSPathResultListImpl#each(Callback)} method.
*/
class FSPathResultListImpl_1Test {
		
	/**
	 * Test of each method, of class FSPathResultListImpl.
	 */
	@Test
	void testEach() throws Exception {
		System.out.println("each");
		Callback callback = null;
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultList expResult = null;
		FSPathResultList result = instance.each(callback);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
	/**
	 * Test of delete method, of class FSPathResultListImpl.
	 */
	@Test
	void testDelete() throws Exception {
		System.out.println("delete");
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultModificationList expResult = null;
		FSPathResultModificationList result = instance.delete();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
	/**
	 * Test of copy method, of class FSPathResultListImpl.
	 */
	@Test
	void testCopy() throws Exception {
		System.out.println("copy");
		String destinationDirPath = "";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultModificationList expResult = null;
		FSPathResultModificationList result = instance.copy(destinationDirPath);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
	/**
	 * Test of isListOfFiles method, of class FSPathResultListImpl.
	 */
	@Test
	void testIsListOfFiles() {
		System.out.println("isListOfFiles");
		FSPathResultListImpl instance = new FSPathResultListImpl();
		boolean expResult = false;
		boolean result = instance.isListOfFiles();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
	/**
	 * Test of rename method, of class FSPathResultListImpl.
	 */
	@Test
	void testRename() throws Exception {
		System.out.println("rename");
		String matchExpression = "";
		String replaceExpresion = "";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		FSPathResultModificationList expResult = null;
		FSPathResultModificationList result = instance.rename(matchExpression, replaceExpresion);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
	/**
	 * Test of move method, of class FSPathResultListImpl.
	 */
	@Test
	void testMove() throws Exception {
		System.out.println("move");
		String destinationPath =