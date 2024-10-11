// ClassInfoTest.java
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassInfo}.
* It contains ten unit test cases for the {@link ClassInfo#srchMethods(String)} method.
*/
class ClassInfoTest {

	/**
	* Test case for {@link ClassInfo#srchMethods(String)} method.
	* It tests the case when the input string is null.
	*/
	@Test
	void testSrchMethods_Null() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods(null);
		assertNull(result);
	}
	
	/**
	* Test case for {@link ClassInfo#srchMethods(String)} method.
	* It tests the case when the input string is empty.
	*/
	@Test
	void testSrchMethods_Empty() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("");
		assertNull(result);
	}
	
	/**
	* Test case for {@link ClassInfo#srchMethods(String)} method.
	* It tests the case when the input string is not found.
	*/
	@Test
	void testSrchMethods_NotFound() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("not found");
		assertNull(result);
	}
	
	/**
	* Test case for {@link ClassInfo#srchMethods(String)} method.
	* It tests the case when the input string is found.
	*/
	@Test
	void testSrchMethods_Found() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("get");
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link ClassInfo#srchMethods(String)} method.
	* It tests the case when the input string is found.
	*/
	@Test
	void testSrchMethods_Found2() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("set");
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link ClassInfo#srchMethods(String)} method.
	* It tests the case when the input string is found.
	*/
	@Test
	void testSrchMethods_Found3() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("add");
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link ClassInfo#srchMethods(String)} method.
	* It tests the case when the input string is found.
	*/
	@Test
	void testSrchMethods_Found4() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("remove");
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link ClassInfo#srchMethods(String)} method.
	* It tests the case when the input string is found.
	*/
	@Test
	void testSrchMethods_Found5() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("is");
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link ClassInfo#srchMethods(String)} method.
	* It tests the case when the input string is found.
	*/
	@Test
	void testSrchMethods_Found6() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("has");
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link ClassInfo#srchMethods(String)} method.
	* It tests the case when the input string is found.
	*/
	@Test
	void testSrchMethods_Found7() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("can");
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link ClassInfo#srchMethods(String)} method.
	* It tests the case when the input string is found.
	*/
	@Test
	void testSrchMethods_Found8() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("do");
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link ClassInfo#srchMethods(String)} method.
	* It tests the case when the input string is found.
	*/
	@Test
	void testSrchMethods_Found9() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("to");
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link ClassInfo#srchMethods(String)} method.
	* It tests the case when the input string is found.
	*/
	@Test
	void testSrchMethods_Found10() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("from");
		assertNotNull(result);
	}
}

// ClassInfoTest.java
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassInfo}.
* It contains ten unit test cases for the {@link ClassInfo#srchMethods(String)} method.
*/
class ClassInfoTest {
		
	/**
	* Test case for {@link ClassInfo#srchMethods(String)} method.
	* It tests the case when the input string is null.
	*/
	@Test
	void testSrchMethods_Null() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods(null);
		assertNull(result);
	}
	
	/**
	* Test case for {@link ClassInfo#srchMethods(String)} method.
	* It tests the case when the input string is empty.
	*/
	@Test
	void testSrchMethods_Empty() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("");
		assertNull(result);
	}
	
	/**
	* Test case for {@link ClassInfo#srchMethods(String)} method.
	* It tests the case when the input string is not found.
	*/
	@Test
	void testSrchMethods_NotFound() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("not found");
		assertNull(result);
	}
	
	/**
	* Test case for {@link ClassInfo#srchMethods(String)} method.
	* It tests the case when the input string is found.
	*/
	@Test
	void testSrchMethods_Found() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("get");
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link ClassInfo#srchMethods(String)} method.
	* It tests the case when the input string is found.
	*/
	@Test
	void testSrchMethods_Found2() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("set");
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link ClassInfo#srchMethods(String)} method.
	* It tests the case when the input string is found.
	*/
	@Test
	void testSrchMethods_Found3() {
		ClassInfo ci = new ClassInfo();
