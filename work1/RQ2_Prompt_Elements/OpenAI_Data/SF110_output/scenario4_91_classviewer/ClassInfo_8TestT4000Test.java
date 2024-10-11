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
* It contains ten unit test cases for the {@link ClassInfo#getFoundMethod(int)} method.
*/
class ClassInfo_8Test {

	@Test
	void testGetFoundMethod_1() throws Exception {
		ClassInfo classInfo = new ClassInfo("java.awt.WindowConstants");
		classInfo.srchMethods("EXIT_ON_CLOSE");
		MethodData methodData = classInfo.getFoundMethod(0);
		assertEquals("EXIT_ON_CLOSE", methodData.getName());
		assertEquals("int", methodData.getReturnType());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.getFullName());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.toString());
	}
	
	@Test
	void testGetFoundMethod_2() throws Exception {
		ClassInfo classInfo = new ClassInfo("java.awt.WindowConstants");
		classInfo.srchMethods("EXIT_ON_CLOSE");
		MethodData methodData = classInfo.getFoundMethod(1);
		assertEquals("EXIT_ON_CLOSE", methodData.getName());
		assertEquals("int", methodData.getReturnType());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.getFullName());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.toString());
	}
	
	@Test
	void testGetFoundMethod_3() throws Exception {
		ClassInfo classInfo = new ClassInfo("java.awt.WindowConstants");
		classInfo.srchMethods("EXIT_ON_CLOSE");
		MethodData methodData = classInfo.getFoundMethod(2);
		assertEquals("EXIT_ON_CLOSE", methodData.getName());
		assertEquals("int", methodData.getReturnType());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.getFullName());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.toString());
	}
	
	@Test
	void testGetFoundMethod_4() throws Exception {
		ClassInfo classInfo = new ClassInfo("java.awt.WindowConstants");
		classInfo.srchMethods("EXIT_ON_CLOSE");
		MethodData methodData = classInfo.getFoundMethod(3);
		assertEquals("EXIT_ON_CLOSE", methodData.getName());
		assertEquals("int", methodData.getReturnType());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.getFullName());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.toString());
	}
	
	@Test
	void testGetFoundMethod_5() throws Exception {
		ClassInfo classInfo = new ClassInfo("java.awt.WindowConstants");
		classInfo.srchMethods("EXIT_ON_CLOSE");
		MethodData methodData = classInfo.getFoundMethod(4);
		assertEquals("EXIT_ON_CLOSE", methodData.getName());
		assertEquals("int", methodData.getReturnType());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.getFullName());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.toString());
	}
	
	@Test
	void testGetFoundMethod_6() throws Exception {
		ClassInfo classInfo = new ClassInfo("java.awt.WindowConstants");
		classInfo.srchMethods("EXIT_ON_CLOSE");
		MethodData methodData = classInfo.getFoundMethod(5);
		assertEquals("EXIT_ON_CLOSE", methodData.getName());
		assertEquals("int", methodData.getReturnType());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.getFullName());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.toString());
	}
	
	@Test
	void testGetFoundMethod_7() throws Exception {
		ClassInfo classInfo = new ClassInfo("java.awt.WindowConstants");
		classInfo.srchMethods("EXIT_ON_CLOSE");
		MethodData methodData = classInfo.getFoundMethod(6);
		assertEquals("EXIT_ON_CLOSE", methodData.getName());
		assertEquals("int", methodData.getReturnType());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.getFullName());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.toString());
	}
	
	@Test
	void testGetFoundMethod_8() throws Exception {
		ClassInfo classInfo = new ClassInfo("java.awt.WindowConstants");
		classInfo.srchMethods("EXIT_ON_CLOSE");
		MethodData methodData = classInfo.getFoundMethod(7);
		assertEquals("EXIT_ON_CLOSE", methodData.getName());
		assertEquals("int", methodData.getReturnType());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.getFullName());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.toString());
	}
	
	@Test
	void testGetFoundMethod_9() throws Exception {
		ClassInfo classInfo = new ClassInfo("java.awt.WindowConstants");
		classInfo.srchMethods("EXIT_ON_CLOSE");
		MethodData methodData = classInfo.getFoundMethod(8);
		assertEquals("EXIT_ON_CLOSE", methodData.getName());
		assertEquals("int", methodData.getReturnType());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.getFullName());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.toString());
	}
	
	@Test
	void testGetFoundMethod_10() throws Exception {
		ClassInfo classInfo = new ClassInfo("java.awt.WindowConstants");
		classInfo.srchMethods("EXIT_ON_CLOSE");
		MethodData methodData = classInfo.getFoundMethod(9);
		assertEquals("EXIT_ON_CLOSE", methodData.getName());
		assertEquals("int", methodData.getReturnType());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.getFullName());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.toString());
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
	void testGetFoundMethod_1() throws Exception {
		ClassInfo classInfo = new ClassInfo("java.awt.WindowConstants");
		classInfo.srchMethods("EXIT_ON_CLOSE");
		MethodData methodData = classInfo.getFoundMethod(0);
		assertEquals("EXIT_ON_CLOSE", methodData.getName());
		assertEquals("int", methodData.getReturnType());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.getFullName());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.toString());
	}
	
	@Test
	void testGetFoundMethod_2() throws Exception {
		ClassInfo classInfo = new ClassInfo("java.awt.WindowConstants");
		classInfo.srchMethods("EXIT_ON_CLOSE");
		MethodData methodData = classInfo.getFoundMethod(1);
		assertEquals("EXIT_ON_CLOSE", methodData.getName());
		assertEquals("int", methodData.getReturnType());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.getFullName());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.toString());
	}
	
	@Test
	void testGetFoundMethod_3() throws Exception {
		ClassInfo classInfo = new ClassInfo("java.awt.WindowConstants");
		classInfo.srchMethods("EXIT_ON_CLOSE");
		MethodData methodData = classInfo.getFoundMethod(2);
		assertEquals("EXIT_ON_CLOSE", methodData.getName());
		assertEquals("int", methodData.getReturnType());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.getFullName());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.toString());
	}
	
	@Test
	void testGetFoundMethod_4() throws Exception {
		ClassInfo classInfo = new ClassInfo("java.awt.WindowConstants");
		classInfo.srchMethods("EXIT_ON_CLOSE");
		MethodData methodData = classInfo.getFoundMethod(3);
		assertEquals("EXIT_ON_CLOSE", methodData.getName());
		assertEquals("int", methodData.getReturnType());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.getFullName());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.toString());
	}
	
	@Test
	void testGetFoundMethod_5() throws Exception {
		ClassInfo classInfo = new ClassInfo("java.awt.WindowConstants");
		classInfo.srchMethods("EXIT_ON_CLOSE");
		MethodData methodData = classInfo.getFoundMethod(4);
		assertEquals("EXIT_ON_CLOSE", methodData.getName());
		assertEquals("int", methodData.getReturnType());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.getFullName());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.toString());
	}
	
	@Test
	void testGetFoundMethod_6() throws Exception {
		ClassInfo classInfo = new ClassInfo("java.awt.WindowConstants");
		classInfo.srchMethods("EXIT_ON_CLOSE");
		MethodData methodData = classInfo.getFoundMethod(5);
		assertEquals("EXIT_ON_CLOSE", methodData.getName());
		assertEquals("int", methodData.getReturnType());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.getFullName());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.toString());
	}
	
	@Test
	void testGetFoundMethod_7() throws Exception {
		ClassInfo classInfo = new ClassInfo("java.awt.WindowConstants");
		classInfo.srchMethods("EXIT_ON_CLOSE");
		MethodData methodData = classInfo.getFoundMethod(6);
		assertEquals("EXIT_ON_CLOSE", methodData.getName());
		assertEquals("int", methodData.getReturnType());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.getFullName());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.toString());
	}
	
	@Test
	void testGetFoundMethod_8() throws Exception {
		ClassInfo classInfo = new ClassInfo("java.awt.WindowConstants");
		classInfo.srchMethods("EXIT_ON_CLOSE");
		MethodData methodData = classInfo.getFoundMethod(7);
		assertEquals("EXIT_ON_CLOSE", methodData.getName());
		assertEquals("int", methodData.getReturnType());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.getFullName());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.toString());
	}
	
	@Test
	void testGetFoundMethod_9() throws Exception {
		ClassInfo classInfo = new ClassInfo("java.awt.WindowConstants");
		classInfo.srchMethods("EXIT_ON_CLOSE");
		MethodData methodData = classInfo.getFoundMethod(8);
		assertEquals("EXIT_ON_CLOSE", methodData.getName());
		assertEquals("int", methodData.getReturnType());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.getFullName());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.toString());
	}
	
	@Test
	void testGetFoundMethod_10() throws Exception {
		ClassInfo classInfo = new ClassInfo("java.awt.WindowConstants");
		classInfo.srchMethods("EXIT_ON_CLOSE");
		MethodData methodData = classInfo.getFoundMethod(9);
		assertEquals("EXIT_ON_CLOSE", methodData.getName());
		assertEquals("int", methodData.getReturnType());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.getFullName());
		assertEquals("public static final int java.awt.WindowConstants.EXIT_ON_CLOSE", methodData.toString());
	}
}

// ClassInfo_10Test.java
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
class ClassInfo_10Test {
		
	@Test
	void testGetFoundMethod_1() throws Exception {
		ClassInfo classInfo = new ClassInfo("java.awt.WindowConstants");
		classInfo.srchMethods("EXIT_ON_CLOSE");
		MethodData methodData = classInfo.getFoundMethod(0);
		assert