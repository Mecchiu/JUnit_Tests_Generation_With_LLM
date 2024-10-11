// ClassInfo_7Test.java
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
class ClassInfo_7Test {

	@Test
	void test_srchMethods_1() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("");
		assertEquals(0, result.length);
	}
	
	@Test
	void test_srchMethods_2() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("a");
		assertEquals(0, result.length);
	}
	
	@Test
	void test_srchMethods_3() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("ab");
		assertEquals(0, result.length);
	}
	
	@Test
	void test_srchMethods_4() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("abc");
		assertEquals(0, result.length);
	}
	
	@Test
	void test_srchMethods_5() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("abcd");
		assertEquals(0, result.length);
	}
	
	@Test
	void test_srchMethods_6() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("abcde");
		assertEquals(0, result.length);
	}
	
	@Test
	void test_srchMethods_7() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("abcdef");
		assertEquals(0, result.length);
	}
	
	@Test
	void test_srchMethods_8() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("abcdefg");
		assertEquals(0, result.length);
	}
	
	@Test
	void test_srchMethods_9() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("abcdefgh");
		assertEquals(0, result.length);
	}
	
	@Test
	void test_srchMethods_10() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("abcdefghi");
		assertEquals(0, result.length);
	}
}

// ClassInfo_8Test.java
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
* It contains ten unit test cases for the {@link ClassInfo#srchMethods(String, String[])} method.
*/
class ClassInfo_8Test {
		
	@Test
	void test_srchMethods_1() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("", new String[0]);
		assertEquals(0, result.length);
	}
	
	@Test
	void test_srchMethods_2() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("a", new String[0]);
		assertEquals(0, result.length);
	}
	
	@Test
	void test_srchMethods_3() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("ab", new String[0]);
		assertEquals(0, result.length);
	}
	
	@Test
	void test_srchMethods_4() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("abc", new String[0]);
		assertEquals(0, result.length);
	}
	
	@Test
	void test_srchMethods_5() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("abcd", new String[0]);
		assertEquals(0, result.length);
	}
	
	@Test
	void test_srchMethods_6() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("abcde", new String[0]);
		assertEquals(0, result.length);
	}
	
	@Test
	void test_srchMethods_7() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("abcdef", new String[0]);
		assertEquals(0, result.length);
	}
	
	@Test
	void test_srchMethods_8() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("abcdefg", new String[0]);
		assertEquals(0, result.length);
	}
	
	@Test
	void test_srchMethods_9() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("abcdefgh", new String[0]);
		assertEquals(0, result.length);
	}
	
	@Test
	void test_srchMethods_10() {
		ClassInfo ci = new ClassInfo();
		String[] result = ci.srchMethods("abcdefghi", new String[0]);
		assertEquals(0, result.length);
	}
}

// ClassInfo_9Test.java
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
* It contains ten unit test cases for the {@link ClassInfo#getFoundMethod(int)} method.
*/
class ClassInfo_9Test {
		
	@Test
	void test_getFoundMethod_1() {
		ClassInfo ci = new ClassInfo();
		MethodData result = ci.getFoundMethod(0);
		assertNull(result);
	}
	
	@Test
	void test_getFoundMethod_2() {
		ClassInfo ci = new ClassInfo();
		MethodData result = ci.getFoundMethod(1);
		assertNull(result);
	}
	
	@Test
	void test_getFoundMethod_3() {
		ClassInfo ci = new ClassInfo();
		MethodData result = ci.getFoundMethod(2);
		assertNull(result);
	}
	
	@Test
	void test_getFoundMethod_4() {
		ClassInfo ci = new ClassInfo();
		MethodData result = ci.getFoundMethod(3);
		assertNull(result);
	}
	
	@Test
	void test_getFoundMethod_5() {
		ClassInfo ci = new ClassInfo();
		MethodData result = ci.getFoundMethod(4);
		assertNull(result);
	}
	
	@Test
	void test_getFoundMethod_6() {
		ClassInfo ci = new ClassInfo();
		MethodData result = ci.getFoundMethod(5);
		assertNull(result);
	}
	
	@Test
	void test_getFoundMethod_7() {
		ClassInfo c