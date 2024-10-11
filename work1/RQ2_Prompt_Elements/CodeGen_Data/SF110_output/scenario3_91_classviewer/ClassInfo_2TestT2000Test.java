// ClassInfo_2Test.java
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
* It contains one unit test case for the {@link ClassInfo#printMethods(int)} method.
*/
class ClassInfo_2Test {

	@Test
	public void testNoMethods() {
		
		final ClassInfo ci = new ClassInfo(null);
		assertTrue("No methods", ci.getPrintMethods().length > 0);
		
		JPanel panel = new JPanel();
		try {
			ci.jstestMethods(panel);
			fail("The following methods should be accessible but are inaccessible");
		} catch (InstantiationException ie) {
			assertNotNull(ie);
			assertEquals(IllegalStateException.class.getName(), ie.getMessage());
		} catch (IllegalAccessException iae) {
			assertNotNull(iae);
		} catch (InstantiationError ie) {
			assertNotNull(ie);
			assertEquals(IllegalStateException.class.getName(), ie.getMessage());
		}
		//
		assertEquals(PanelInfo.class, panel.getClass());
		assertEquals("PanelInfo not null", panel.getName());
		assertNotNull(panel.getLayout());
		assertNotNull(panel.getBorder());
		assertNotNull(panel.getParent());
		assertNotNull(panel.getMaximumSize());
		assertNotNull(panel.getMinimumSize());
	}
		
	@Test
	public void testNoInterfaceMethods() {
		
		final ClassInfo ci = new ClassInfo(null);
		assertEquals("There should only be one set of interfaces", 1, ci.getSetOfInterfaces().size());
		assertEquals("There should only be one set of methods", 1, ci.getPublicMethods().size());
		assertFalse("There should no interfaces", ci.getSetOfInterfaces().isEmpty());
		assertFalse("There should only be a method with a return type not null", ci.getPublicMethods().get(0) instanceof MethodWithReturns);
		
		assertEquals("A method should be in the set of interfaces", ci.getSetOfInterfaces().get(0), ci.getSetOfMethods().get(0));
		//
		JPanel panel = new JPanel();
		try {
			ci.jstestMethods(panel);
			fail("The following methods should be inaccessible but are inaccessible");
		} catch (InstantiationException ie) {
			assertNotNull(ie);
			assertEquals(IllegalStateException.class.getName(), ie.getMessage());
		} catch (IllegalAccessException iae) {
			assertNotNull(iae);
		}
		panel.setVisible(false);
		panel.setOpacity(0);
		panel.setTitle("PanelInfo");
		panel.setForeground(Color.red);
		panel.setBackground(Color.white);
		panel.setBorder(BorderFactory.createEmptyBorder());
		assertEquals("Javadoc has not been executed", 0, ci.getTotalExecutedDocs());
	}
	
	@Test
	public void testImplementationMethods() {
		
		final ClassInfo ci = new ClassInfo(null);
		List<MethodWithReturns> list = Arrays.asList(new MethodWithReturns(null, "hi", null));
		set(list);
		JPanel panel = new JPanel();
		try {
			ci.jstestMethods(panel);
			fail("The following methods should be inaccessible but are inaccessible");
		} catch (InstantiationException ie) {
			try {
				String methodName = ci.getMethodWithReturns().getName();
				System.currentTimeMillis();
				MethodWithReturns methodWithReturns = ci.getMethodWithReturns();
				System.currentTimeMillis();
			} catch (InstantiationException ie1) {
				assertNotNull(ie1);
			} catch (IllegalAccessException iae) {
				assertNotNull(iae);
			}
			List<MethodWithReturns> otherList = new ArrayList<>();
			otherList.add(null);
			try {
				otherList.add(methodInheritance(null, list.get(0), list.get(1)));
				fail("Another method should be inherited: " + otherList.size() + ". Other methods were: " + otherList.size());
			} catch (InstantiationException ie2) {
				System.currentTimeMillis();
				String message = ci.getMethodWithReturns().getName();
				System.currentTimeMillis();
				assertEquals("Found method from two parents ", otherList.size(), message.length());
				otherList.get(0).setInheritedTo(null);
				assertEquals("Method inherited not called", otherList.get(1), otherList.get(0));
				otherList.get(0).setInheritedTo(null);
				assertEquals("Method inherited twice", otherList.get(1), otherList.get(0));
				otherList.get(1).setInheritedTo(null);
				assertEquals("Method inherited to null", otherList.get(1), otherList.get(0));
			} catch (IllegalAccessException iae1) {
				assertNotNull(iae1);
			}
			list = otherList;
			panel.setVisible(false);
			panel.setOpacity(0);
			panel.setForeground(Color.red);
			panel.setText("PanelInfo");
			panel.setTitle("PanelInfo");
			panel.setBackground(Color.white);
			panel.setBorder(BorderFactory.createEmptyBorder());
			assertEquals("Javadoc has not been executed", 0, ci.getTotalExecutedDocs());
		} finally {
			panel.setVisible(true);
		}
		
		if (list.size() == 0) fail("There should be an element");
		set(list);

		panel = new JPanel();
		try {
			ci.jstestMethods(panel);
			fail("The following methods should be inaccessible but are inaccessible");
		} catch (InstantiationException ie) {
			try {
				String methodName = ci.getMethodWithReturns().getName();
				System.currentTimeMillis();
				MethodWithReturns methodWithReturns = ci.getMethodWithReturns();
				System.currentTimeMillis();
				try {
					if (list.size()!= 1) throw new RuntimeException();
					if (methodName == "add") {
						throw new UnsupportedOperationException();
					} else {
						methodWithReturns.setInheritedTo(null);
						try {
							String result = null;
							result = ci.getMethodWithReturns().getInheritedTo();
							System.currentTimeMillis();
							throw new RuntimeException(); // throws a RuntimeException as the second case is checked
						} catch (Throwable e) {
						}
					}
				} catch (UnsupportedOperationException uoe) {
					try {
						System.currentTimeMillis();
						methodWithReturns.setInheritedTo(null);
						try {
							String result =