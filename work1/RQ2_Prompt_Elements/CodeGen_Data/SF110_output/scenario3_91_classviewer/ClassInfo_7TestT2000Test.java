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
* It contains one unit test case for the {@link ClassInfo#srchMethods(String)} method.
*/
class ClassInfo_7Test {
/**
		 * Test constructor.
		 */
	@Test
	 public void ctor() {
		TestClassInfo tci = new TestClassInfo("A");
		String tempStr = "B";
		String tl = "a";
		tci.className = tl;
		Class tmp = tci.classInfo.getClass();
		ClassInfo tmpIt = tci.classInfo;
		Class clsInfo = tci.classInfo.getClassInfo().getClass();

		String m1;

		assertEquals(tci.classInfo.getClassName(), "A");
		//assertEquals(tci.classInfo.getClassName(), "M");
		//assertEquals(tci.classInfo.getClassName(), "P");
		assertEquals(tempStr, tci.classInfo.getClassName());
		assertEquals(tmpIt, tci.classInfo);
		assertEquals(clsInfo, tci.classInfo.getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo());
		assertTrue((tci.classInfo.getConstructors() instanceof Collection));
		Iterator it = tci.classInfo.getConstructors();
		while(it.hasNext()) {
			m1 = (String) it.next();
		}
		assertTrue(m1.equals(tl));
		assertTrue(it.hasNext());
		m1 = (String) it.next();
		assertTrue(!m1.equals(tci.classInfo.getClassName()));		
		//assertTrue(m1.equals(tci.classInfo.getClassInfo().getClassInfo().getClassName()));
		//assertTrue(it.hasNext());
		tci.className = tci.classInfo.getClassName();
	 }

	/**
* Test class of {@link ClassInfo} with getClassName().
*/
	@Test
	public void tci_getClassName_GetClassName() {
		ClassInfo tci = new ClassInfo("A");
		//tci.classInfo.setClassName("A");
		ClassInfo tci1 = new ClassInfo("B");
		String tempStr = "A";
		String tl = "a";
		tci.className = tl;
		Class cls = tci.classInfo.getClass();

		assertEquals(tci.classInfo.getClassName(), tci.className);
		//        assertEquals(tci.className, tci.classInfo.getClassName());
		//        assertEquals(tl, tci.classInfo.getClassName());
		//        assertTrue((tci1.className == tci.className));
		//        assertTrue((tci1.getClassName() == cls));
		tci.className = tci1.className;
	}


	/**
* Test class of {@link ClassInfo} with the return type of String.getClassName().
*/
	@Test
	public void tci_returnType_ReturnType() {
		ClassInfo tci = new ClassInfo("A");
		//tci.classInfo.setClassName("A");
		ClassInfo tci1 = new ClassInfo("B");
		ClassInfo tci2 = new ClassInfo("B");
		String tempStr = "B";
		//        assertEquals(tci.classInfo.getClassName(), tci.classInfo.getClassName());
		//        assertEquals(tci.classInfo.getClassName(), tci.classInfo.getClassName());
		assertEquals((tci.classInfo.getClassName() == tci.classInfo.getClassName()), true);
		assertEquals(tci.classInfo.getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo(), tci.classInfo.getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo());
		assertEquals(tci.classInfo.getClassName(), tci.className);
		assertEquals(tci.classInfo.getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo(), tci.classInfo.getClassInfo().getClassInfo().getClassInfo().getClassInfo());
		tci.returnType = tci1.classInfo.getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo();
		assertNotNull((tci.returnType == tci1.classInfo.getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo()));
		String tempStr2 = tci.returnType.getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo();
		String tl = tci.returnType.getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo();
		assertTrue((tci.returnType == tci1.classInfo.getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo()));
		assertEquals(tci.classInfo.getClassName(), tci2.classInfo.getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo());
		// 		tci.classInfo.setClassName(tl);
		// 		tci2.classInfo.setClassName(tci.classInfo.getClassName());
		tci1.returnType = tci2.classInfo.getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo()
				.setClassName(tl);
		tci1.className = tci2.classInfo.getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo();
		tci2.className = tci.classInfo.getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo();
		tci2.className = tci.classInfo.getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo();
		tci1.className = tci2.classInfo.getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassInfo().getClassName();
		assert