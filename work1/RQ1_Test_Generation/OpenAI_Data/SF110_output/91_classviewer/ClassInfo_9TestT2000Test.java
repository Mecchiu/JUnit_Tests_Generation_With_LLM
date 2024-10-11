// ClassInfo_9Test.java
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
* It contains ten unit test cases for the {@link ClassInfo#getFoundMethod(int)} method.
*/
class ClassInfo_9Test {

		/**
		* Test case for {@link ClassInfo#getFoundMethod(int)} method.
		* <p>
		* This test case checks if the method returns null when the position is out of range.
		*/
		@Test
		void testGetFoundMethod_1() {
				ClassInfo myClassInfo = new ClassInfo("java.lang.String");
				myClassInfo.srchMethods("charAt");
				assertNull(myClassInfo.getFoundMethod(3));
		}
		
		/**
		* Test case for {@link ClassInfo#getFoundMethod(int)} method.
		* <p>
		* This test case checks if the method returns null when the position is out of range.
		*/
		@Test
		void testGetFoundMethod_2() {
				ClassInfo myClassInfo = new ClassInfo("java.lang.String");
				myClassInfo.srchMethods("charAt");
				assertNull(myClassInfo.getFoundMethod(-1));
		}
		
		/**
		* Test case for {@link ClassInfo#getFoundMethod(int)} method.
		* <p>
		* This test case checks if the method returns null when the position is out of range.
		*/
		@Test
		void testGetFoundMethod_3() {
				ClassInfo myClassInfo = new ClassInfo("java.lang.String");
				myClassInfo.srchMethods("charAt");
				assertNull(myClassInfo.getFoundMethod(0));
		}
		
		/**
		* Test case for {@link ClassInfo#getFoundMethod(int)} method.
		* <p>
		* This test case checks if the method returns null when the position is out of range.
		*/
		@Test
		void testGetFoundMethod_4() {
				ClassInfo myClassInfo = new ClassInfo("java.lang.String");
				myClassInfo.srchMethods("charAt");
				assertNull(myClassInfo.getFoundMethod(1));
		}
		
		/**
		* Test case for {@link ClassInfo#getFoundMethod(int)} method.
		* <p>
		* This test case checks if the method returns null when the position is out of range.
		*/
		@Test
		void testGetFoundMethod_5() {
				ClassInfo myClassInfo = new ClassInfo("java.lang.String");
				myClassInfo.srchMethods("charAt");
				assertNull(myClassInfo.getFoundMethod(2));
		}
		
		/**
		* Test case for {@link ClassInfo#getFoundMethod(int)} method.
		* <p>
		* This test case checks if the method returns null when the position is out of range.
		*/
		@Test
		void testGetFoundMethod_6() {
				ClassInfo myClassInfo = new ClassInfo("java.lang.String");
				myClassInfo.srchMethods("charAt");
				assertNull(myClassInfo.getFoundMethod(4));
		}
		
		/**
		* Test case for {@link ClassInfo#getFoundMethod(int)} method.
		* <p>
		* This test case checks if the method returns null when the position is out of range.
		*/
		@Test
		void testGetFoundMethod_7() {
				ClassInfo myClassInfo = new ClassInfo("java.lang.String");
				myClassInfo.srchMethods("charAt");
				assertNull(myClassInfo.getFoundMethod(5));
		}
		
		/**
		* Test case for {@link ClassInfo#getFoundMethod(int)} method.
		* <p>
		* This test case checks if the method returns null when the position is out of range.
		*/
		@Test
		void testGetFoundMethod_8() {
				ClassInfo myClassInfo = new ClassInfo("java.lang.String");
				myClassInfo.srchMethods("charAt");
				assertNull(myClassInfo.getFoundMethod(6));
		}
		
		/**
		* Test case for {@link ClassInfo#getFoundMethod(int)} method.
		* <p>
		* This test case checks if the method returns null when the position is out of range.
		*/
		@Test
		void testGetFoundMethod_9() {
				ClassInfo myClassInfo = new ClassInfo("java.lang.String");
				myClassInfo.srchMethods("charAt");
				assertNull(myClassInfo.getFoundMethod(7));
		}
}

// ClassInfo_Test.java
/* 
 * Copyright (C) 2004  James Harris 
 *
 * This library is free software; you can redistribute it and/or
 *
 * modify it under the terms of the GNU Lesser General Public
 *
 * License as published by the Free Software Foundation; either
 *
 * version 2.1 of the License, or (at your option) any later version.
 *
 *
 *
 * This library is distributed in the hope that it will be useful,
 *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *
 * Lesser General Public License for more details.
 *
 *
 * You should have received a copy of the GNU Lesser General Public
 *
 * License along with this library; if not, write to the Free Software
 *
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 */
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
* It contains ten unit test cases for the {@link ClassInfo#getFoundMethod(int)} method.
*/
class ClassInfo_Test {
		
		/**
		* Test case for {@link ClassInfo#getFoundMethod(int)} method.
		* <p>
		* This test case checks if the method returns null when the position is out of range.
		*/
		@Test
		void testGetFoundMethod_1() {
				ClassInfo myClassInfo = new ClassInfo("java.lang.String");
				myClassInfo.srchMethods("charAt");
				assertNull(myClassInfo.getFoundMethod(3));
		}
		
		/**
		* Test case for {@link ClassInfo#getFoundMethod(int)} method.
		* <p>
		* This test case checks if the method returns null when the position is out of range.
		*/
		@Test
		void testGetFoundMethod_2() {
				ClassInfo myClassInfo = new ClassInfo("java.lang.String");
				myClassInfo.srchMethods("charAt");
				assertNull(myClassInfo.getFoundMethod(-