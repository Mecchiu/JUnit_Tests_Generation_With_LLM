// ClassInfo_5Test.java
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
* It contains one unit test case for the {@link ClassInfo#getData(Member[])} method.
*/
class ClassInfo_5Test {
/**
		 * Checks the class info works.
		 */
		@Test
		public void CheckGetData() {
			assertNotNull(new ClassInfo().getData(new Member[0]));
		}
} /* ClassInfo_5Test */

// ClassInfo_6Test.java
package com.jstevh.viewer;

import java.util.*;
import java.net.URL;
import java.io.IOException;
import javax.swing.JPanel;

import com.jsterlang.compiler.CompiledClass;
import com.sun.jdi.*;
import javax.swing.border.AbstractBorder;

public class ClassInfo_6 extends JPanel {
	public interface ClassInfo extends Comparable<ClassInfo> {
		public int getNameCount();
		public Enumeration<String> getNames();
	}
	public static class Class1 implements ClassInfo {
		public int getNameCount() { return 0; }
		public Enumeration<String> getNames() { return null; }
		public Map<String, Object> getFields() { return null; }
	}
	private static final long serialVersionUID = 1L;
	
	/**
	 * The fields of the class info are collected.
	 */
	private static Map<String, ClassInfo> FieldMap = new HashMap<>();
	private Map<String, ClassInfo> Fields = new HashMap<>();

	/**
	 * Constructor used to construct class info from the string.
	 * 
	 * @param args String describing the class that is going to get the fields
	 */
	public ClassInfo_6(final String args) {
		final Field[] fields = null;
		try {
			Enumeration<?> enumeration = ClassLoader.getSystemClassLoader().getResources("jstest/com/jstevh/viewer/TestClasses.class");
			while (enumeration.hasMoreElements()) {
				URL url = (URL) enumeration.nextElement();
				URLClassLoader classLoader =  new URLClassLoader(new URL[]{url});
				JarEntry entry = classLoader.findEntries(System.class.getPackage().getName(), "TestClasses.class", (String[]) null)[0];
				try {
					Enumeration<?> enumFields = classLoader.entries(entry.getName());
					while (enumFields.hasMoreElements()) {
						Enumeration<String> fieldEnum = enumFields.nextElement().getName().split(";");
						FieldInfo[] fieldInfos = new FieldInfo[fieldEnum.count()];
						for (int i = 0; i < fieldEnum.count(); i++) {
							fieldInfos[i] = new FieldInfo(fieldEnum.nextElement(), fieldEnum.nextElement());
						}
						setFields(fieldInfos);
					}
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		} catch (SecurityException e) {
			throw new RuntimeException(e);
		}
		ClassInfo classInfo = null;
		try {
			ClassLoader classLoader =  new URLClassLoader(new URL[]{url});
			Class<?> clazz0 = classLoader.loadClass("TestClasses");
			try {
				classInfo = (ClassInfo) clazz0.newInstance();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			classCount++;
		} catch (ClassNotFoundException e) {
	        e.printStackTrace();
		}
		if (classInfo!= null) {
			FieldMap.put(classInfo.getName() + "_" + classInfo.getFields().size(), classInfo);
			ClassInfo c = classInfo;
			Fields.put(c.getName(), c);
		}
	}
	
	/**
	 * Gets the class count. This info is required by the
	 * {@link ClassInfo#getData(Member[])} method.
	 * 
	 * @return int the count of class
	 */
	int classCount;
	/**
	 * A map where the keys indicate field names and the values are
	 * the respective field's objects as well as the class being
	 * examined. 
	 */
	private final Map<String, ClassInfo> FieldMap = new HashMap<>();
	private final Map<String, ClassInfo> Fields = new HashMap<>();
	/**
	 * Construct class info from enumeration of the given className.
	 * 
	 * @param name string describing the class to get
	 * @exception IOException when getting the field of the enumerated class fails
	 */
	public ClassInfo_6(final String name) throws IOException {
		try {
			ClassReader reader = new ClassReader(this.getClass().getClassLoader().getResourceAsStream(name));
			ClassInfo classInfo = new ClassInfo(reader);
			this.FieldMap.put(classInfo.getName(), classInfo);
			Enumeration<?> enumeration2 = classInfo.getNames();
			while (enumeration2.hasMoreElements()) {
				FieldInfo fieldInfo = new FieldInfo(enumeration2.nextElement(), this.FieldMap.get(classInfo.getName() + "_" + enumeration2.nextElement().toString()));
				getFields().add(fieldInfo);
				this.Fields.put(fieldInfo.getName(), fieldInfo);
			}
			this.classCount++;
		} catch (ClassNotFoundException e) {
			throw new IOException(e);
		}
	}
	
	/**
	 * Get the class info from the given field. 
	 * 
	 * @param field the given field to get
	 * @exception IOException when getting the field from the enumeration fails
	 */
	public ClassInfo getClassInfo(final Field field) throws IOException {
		return FieldMap.get(field.getName());
	}
	
	/**
	 * Get the class info from the given field. 
	 *
	 * @param field the given field to get
	 * @exception IOException when getting the field from the enumeration fails
	 */
	public ClassInfo getClassInfo(final String fieldName) throws IOException {
		return this.Fields.get(fieldName);
	}
	
	/**
	 * Gets all the field names currently defined. 
	 *
	 * @return Set<String> a string collection of all field names
	 * @exception IOException when getting the field names from