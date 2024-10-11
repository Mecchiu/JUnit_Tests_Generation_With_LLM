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
		ClassInfo ci = new ClassInfo();
		MethodData result = ci.getFoundMethod(6);
		assertNull(result);
	}
	
	@Test
	void test_getFoundMethod_8() {
		ClassInfo ci = new ClassInfo();
		MethodData result = ci.getFoundMethod(7);
		assertNull(result);
	}
	
	@Test
	void test_getFoundMethod_9() {
		ClassInfo ci = new ClassInfo();
		MethodData result = ci.getFoundMethod(8);
		assertNull(result);
	}
	
	@Test
	void test_getFoundMethod_10() {
		ClassInfo ci = new ClassInfo();
		MethodData result = ci.getFoundMethod(9);
		assertNull(result);
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
* It contains ten unit test cases for the {@link ClassInfo#printArray(Object[])} method.
*/
class ClassInfo_10Test {
		
	@Test
	void test_printArray_1() {
		ClassInfo ci = new ClassInfo();
		ci.printArray(new Object[0]);
	}
	
	@Test
	void test_printArray_2() {
		ClassInfo ci = new ClassInfo();
		ci.printArray(new Object[1]);
	}
	
	@Test
	void test_printArray_3() {
		ClassInfo ci = new ClassInfo();
		ci.printArray(new Object[2]);
	}
	
	@Test
	void test_printArray_4() {
		ClassInfo ci = new ClassInfo();
		ci.printArray(new Object[3]);
	}
	
	@Test
	void test_printArray_5() {
		ClassInfo ci = new ClassInfo();
		ci.printArray(new Object[4]);
	}
	
	@Test
	void test_printArray_6() {
		ClassInfo ci = new ClassInfo();
		ci.printArray(new Object[5]);
	}
	
	@Test
	void test_printArray_7() {
		ClassInfo ci = new ClassInfo();
		ci.printArray(new Object[6]);
	}
	
	@Test
	void test_printArray_8() {
		ClassInfo ci = new ClassInfo();
		ci.printArray(new Object[7]);
	}
	
	@Test
	void test_printArray_9() {
		ClassInfo ci = new ClassInfo();
		ci.printArray(new Object[8]);
	}
	
	@Test
	void test_printArray_10() {
		ClassInfo ci = new ClassInfo();
		ci.printArray(new Object[9]);
	}
}

// ClassInfo_11Test.java
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
* It contains ten unit test cases for the {@link ClassInfo#getClass(String)} method.
*/
class ClassInfo_11Test {
		
	@Test
	void test_getClass_1() {
		ClassInfo ci = new ClassInfo();
		Class result = ci.getClass("");
		assertNull(result);
	}
	
	@Test
	void test_getClass_2() {
		ClassInfo ci = new ClassInfo();
		Class result = ci.getClass("a");
		assertNull(result);
	}
	
	@Test
	void test_getClass_3() {
		ClassInfo ci = new ClassInfo();
		Class result = ci.getClass("ab");
		assertNull(result);
	}
	
	@Test
	void test_getClass_4() {
		ClassInfo ci = new ClassInfo();
		Class result = ci.getClass("abc");
		assertNull(result);
	}
	
	@Test
	void test_getClass_5() {
		ClassInfo ci = new ClassInfo();
		Class result = ci.getClass("abcd");
		assertNull(result);
	}
	
	@Test
	void test_getClass_6() {
		ClassInfo ci = new ClassInfo();
		Class result = ci.getClass("abcde");
		assertNull(result);
	}
	
	@Test
	void test_getClass_7() {
		ClassInfo ci = new ClassInfo();
		Class result = ci.getClass("abcdef");
		assertNull(result);
	}
	
	@Test
	void test_getClass_8() {
		ClassInfo ci = new ClassInfo();
		Class result = ci.getClass("abcdefg");
		assertNull(result);
	}
	
	@Test
	void test_getClass_9() {
		ClassInfo ci = new ClassInfo();
		Class result = ci.getClass("abcdefgh");
		assertNull(result);
	}
	
	@Test
	void test_getClass_10() {
		ClassInfo ci = new ClassInfo();
		Class result = ci.getClass("abcdefghi");
		assertNull(result);
	}
}

// ClassInfo_12Test.java
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
* It contains ten unit test cases for the {@link ClassInfo#tryClass(String)} method.
*/
class ClassInfo_12Test {
		
	@Test
	void test_tryClass_1() {
		Class result = ClassInfo.tryClass("");
		assertNull(result);
	}
	
	@Test
	void test_tryClass_2() {
		Class result = ClassInfo.tryClass("a");
		assertNull(result);
	}
	
	@Test
	void test_tryClass_3() {
		Class result = ClassInfo.tryClass("ab");
		assertNull(result);
	}
	
	@Test
	void test_tryClass_4() {
		Class result = ClassInfo.tryClass("abc");
		assertNull(result);
	}
	
	@Test
	void test_tryClass_5() {
		Class result = ClassInfo.tryClass("abcd");
		assertNull(result);
	}
	
	@Test
	void test_tryClass_6() {
		Class result = ClassInfo.tryClass("abcde");
		assertNull(result);
	}
	
	@Test
	void test_tryClass_7() {
		Class result = ClassInfo.tryClass("abcdef");
		assertNull(result);
	}
	
	@Test
	void test_tryClass_8()