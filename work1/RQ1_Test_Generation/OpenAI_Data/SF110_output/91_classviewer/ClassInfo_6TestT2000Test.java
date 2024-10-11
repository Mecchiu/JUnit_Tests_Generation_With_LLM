// ClassInfo_6Test.java
//5-5-04  Added recursive search to find all interfaces.   ___JSH
//7-30-04 Switched to TreeList to keep from getting interfaces twice in list.  ___JSH
//8-01-04 Handled exceptions with fields.   ___JSH
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

		/**
		* Test case for {@link ClassInfo#getData(Class[])} method.
		* It tests the method with a null array.
		*/
		@Test
		void testGetData_1() {
				Class[] m = null;
				String[] result = ClassInfo.getData(m);
				assertNull(result);
		}
		
		/**
		* Test case for {@link ClassInfo#getData(Class[])} method.
		* It tests the method with an empty array.
		*/
		@Test
		void testGetData_2() {
				Class[] m = new Class[0];
				String[] result = ClassInfo.getData(m);
				assertNull(result);
		}
		
		/**
		* Test case for {@link ClassInfo#getData(Class[])} method.
		* It tests the method with an array of one element.
		*/
		@Test
		void testGetData_3() {
				Class[] m = new Class[1];
				m[0] = ClassInfo.class;
				String[] result = ClassInfo.getData(m);
				assertNotNull(result);
				assertEquals(1, result.length);
				assertEquals("class com.jstevh.viewer.ClassInfo", result[0]);
		}
		
		/**
		* Test case for {@link ClassInfo#getData(Class[])} method.
		* It tests the method with an array of two elements.
		*/
		@Test
		void testGetData_4() {
				Class[] m = new Class[2];
				m[0] = ClassInfo.class;
				m[1] = ClassInfo_6Test.class;
				String[] result = ClassInfo.getData(m);
				assertNotNull(result);
				assertEquals(2, result.length);
				assertEquals("class com.jstevh.viewer.ClassInfo", result[0]);
				assertEquals("class com.jstevh.viewer.ClassInfo_6Test", result[1]);
		}
		
		/**
		* Test case for {@link ClassInfo#getData(Class[])} method.
		* It tests the method with an array of three elements.
		*/
		@Test
		void testGetData_5() {
				Class[] m = new Class[3];
				m[0] = ClassInfo.class;
				m[1] = ClassInfo_6Test.class;
				m[2] = ClassInfo_6Test.class;
				String[] result = ClassInfo.getData(m);
				assertNotNull(result);
				assertEquals(3, result.length);
				assertEquals("class com.jstevh.viewer.ClassInfo", result[0]);
				assertEquals("class com.jstevh.viewer.ClassInfo_6Test", result[1]);
				assertEquals("class com.jstevh.viewer.ClassInfo_6Test", result[2]);
		}
		
		/**
		* Test case for {@link ClassInfo#getData(Class[])} method.
		* It tests the method with an array of four elements.
		*/
		@Test
		void testGetData_6() {
				Class[] m = new Class[4];
				m[0] = ClassInfo.class;
				m[1] = ClassInfo_6Test.class;
				m[2] = ClassInfo_6Test.class;
				m[3] = ClassInfo.class;
				String[] result = ClassInfo.getData(m);
				assertNotNull(result);
				assertEquals(4, result.length);
				assertEquals("class com.jstevh.viewer.ClassInfo", result[0]);
				assertEquals("class com.jstevh.viewer.ClassInfo_6Test", result[1]);
				assertEquals("class com.jstevh.viewer.ClassInfo_6Test", result[2]);
				assertEquals("class com.jstevh.viewer.ClassInfo", result[3]);
		}
}

// ClassInfo_7Test.java
//5-5-04  Added recursive search to find all interfaces.   ___JSH
//7-30-04 Switched to TreeList to keep from getting interfaces twice in list.  ___JSH
//8-01-04 Handled exceptions with fields.   ___JSH
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
		
		/**
		* Test case for {@link ClassInfo#getData(Member[])} method.
		* It tests the method with a null array.
		*/
		@Test
		void testGetData_1() {
				Member[] m = null;
				String[] result = ClassInfo.getData(m);
				assertNull(result);
		}
		
		/**
		* Test case for {@link ClassInfo#getData(Member[])} method.
		* It tests the method with an empty array.
		*/
		@Test
		void testGetData_2() {
				Member[] m = new Member[0];
				String[] result = ClassInfo.getData(m);
				assertNull(result);
		}
		
		/**
		* Test case for {@link ClassInfo#getData(Member[])} method.
		* It tests the method with an array of one element.
		*/
		@Test
		void testGetData_3() {
				Member[] m = new Member[1];
				m[0] = ClassInfo.class;
				String[] result = ClassInfo.getData(m);
				assertNotNull(result);
				assertEquals(1, result.length);
				assertEquals("class com.jstevh.viewer.ClassInfo", result[0]);
		}
		
		/**
		* Test case for {@link ClassInfo#getData(Member[])} method.
		* It tests the method with an array of two elements.
		*/
		@Test
		void testGetData_4() {
				Member[] m = new Member[2];
				m[0] = ClassInfo.class;
				m[1] = ClassInfo_7Test.class;
				String[] result = ClassInfo.getData(m);
				assertNotNull(result);
				assertEquals(2, result.length);
				assertEquals("class com.jstevh.viewer.ClassInfo", result[0]);
				assertEquals("class com.jstevh.viewer.ClassInfo_7Test", result[1]);
		}
		
		/**
		* Test case for {@link ClassInfo#getData(Member[