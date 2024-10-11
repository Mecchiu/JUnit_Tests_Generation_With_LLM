// ClassInfo_6Test.java
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
* It contains ten unit test cases for the {@link ClassInfo#getData(Class[])} method.
*/
class ClassInfo_6Test {

	@Test
	void testGetData_1() {
		ClassInfo ci = new ClassInfo();
		Class[] c = new Class[1];
		c[0] = java.lang.String.class;
		String[] s = ClassInfo.getData(c);
		assertEquals("class java.lang.String", s[0]);
	}
	
	@Test
	void testGetData_2() {
		ClassInfo ci = new ClassInfo();
		Class[] c = new Class[1];
		c[0] = java.lang.Integer.class;
		String[] s = ClassInfo.getData(c);
		assertEquals("class java.lang.Integer", s[0]);
	}
	
	@Test
	void testGetData_3() {
		ClassInfo ci = new ClassInfo();
		Class[] c = new Class[1];
		c[0] = java.lang.Double.class;
		String[] s = ClassInfo.getData(c);
		assertEquals("class java.lang.Double", s[0]);
	}
	
	@Test
	void testGetData_4() {
		ClassInfo ci = new ClassInfo();
		Class[] c = new Class[1];
		c[0] = java.lang.Float.class;
		String[] s = ClassInfo.getData(c);
		assertEquals("class java.lang.Float", s[0]);
	}
	
	@Test
	void testGetData_5() {
		ClassInfo ci = new ClassInfo();
		Class[] c = new Class[1];
		c[0] = java.lang.Boolean.class;
		String[] s = ClassInfo.getData(c);
		assertEquals("class java.lang.Boolean", s[0]);
	}
	
	@Test
	void testGetData_6() {
		ClassInfo ci = new ClassInfo();
		Class[] c = new Class[1];
		c[0] = java.lang.Character.class;
		String[] s = ClassInfo.getData(c);
		assertEquals("class java.lang.Character", s[0]);
	}
	
	@Test
	void testGetData_7() {
		ClassInfo ci = new ClassInfo();
		Class[] c = new Class[1];
		c[0] = java.lang.Byte.class;
		String[] s = ClassInfo.getData(c);
		assertEquals("class java.lang.Byte", s[0]);
	}
	
	@Test
	void testGetData_8() {
		ClassInfo ci = new ClassInfo();
		Class[] c = new Class[1];
		c[0] = java.lang.Short.class;
		String[] s = ClassInfo.getData(c);
		assertEquals("class java.lang.Short", s[0]);
	}
	
	@Test
	void testGetData_9() {
		ClassInfo ci = new ClassInfo();
		Class[] c = new Class[1];
		c[0] = java.lang.Long.class;
		String[] s = ClassInfo.getData(c);
		assertEquals("class java.lang.Long", s[0]);
	}
	
	@Test
	void testGetData_10() {
		ClassInfo ci = new ClassInfo();
		Class[] c = new Class[1];
		c[0] = java.lang.Void.class;
		String[] s = ClassInfo.getData(c);
		assertEquals("class java.lang.Void", s[0]);
	}
}

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
* It contains ten unit test cases for the {@link ClassInfo#getData(Member[])} method.
*/
class ClassInfo_7Test {
		
	@Test
	void testGetData_1() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.String.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.String", s[0]);
	}
	
	@Test
	void testGetData_2() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.Integer.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.Integer", s[0]);
	}
	
	@Test
	void testGetData_3() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.Double.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.Double", s[0]);
	}
	
	@Test
	void testGetData_4() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.Float.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.Float", s[0]);
	}
	
	@Test
	void testGetData_5() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.Boolean.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.Boolean", s[0]);
	}
	
	@Test
	void testGetData_6() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.Character.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.Character", s[0]);
	}
	
	@Test
	void testGetData_7() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.Byte.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.Byte", s[0]);
	}
	
	@Test
	void testGetData_8() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.Short.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.Short", s[0]);
	}
	
	@Test
	void testGetData_9() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.Long.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.Long", s[0]);
	}
	
	@Test
	void testGetData_10() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.Void.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.Void", s[0]);
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
* It contains ten unit test cases for the {@link ClassInfo#getData(Member[])} method.
*/
class ClassInfo_8Test {
		
	@Test
	void testGetData_1() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.String.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.String", s[0]);
	}
	
	@Test
	void testGetData_2() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.Integer.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.Integer", s[0]);
	}
	
	@Test
	void testGetData_3() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.Double.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.Double", s[0]);
	}
	
	@Test
	void testGetData_4() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.Float.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.Float", s[0]);
	}
	
	@Test
	void testGetData_5() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.Boolean.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.Boolean", s[0]);
	}
	
	@Test
	void testGetData_6() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.Character.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.Character", s[0]);
	}
	
	@Test
	void testGetData_7() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.Byte.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.Byte", s[0]);
	}
	
	@Test
	void testGetData_8() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.Short.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.Short", s[0]);
	}
	
	@Test
	void testGetData_9() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.Long.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.Long", s[0]);
	}
	
	@Test
	void testGetData_10() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.Void.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.Void", s[0]);
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
* It contains ten unit test cases for the {@link ClassInfo#getData(Member[])} method.
*/
class ClassInfo_9Test {
		
	@Test
	void testGetData_1() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.String.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.String", s[0]);
	}
	
	@Test
	void testGetData_2() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.Integer.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.Integer", s[0]);
	}
	
	@Test
	void testGetData_3() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.Double.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.Double", s[0]);
	}
	
	@Test
	void testGetData_4() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.Float.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.Float", s[0]);
	}
	
	@Test
	void testGetData_5() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.Boolean.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.Boolean", s[0]);
	}
	
	@Test
	void testGetData_6() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.Character.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.Character", s[0]);
	}
	
	@Test
	void testGetData_7() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.Byte.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.Byte", s[0]);
	}
	
	@Test
	void testGetData_8() {
		ClassInfo ci = new ClassInfo();
		Member[] m = new Member[1];
		m[0] = java.lang.Short.class;
		String[] s = ClassInfo.getData(m);
		assertEquals("class java.lang.Short", s[0]);
	}
	
