// ClassInfo_4Test.java
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
* It contains one unit test case for the {@link ClassInfo#printInterfaces()} method.
*/
class ClassInfo_4Test {
public static class MyObject {
			String s = "Hello World from the class";

			public MyObject() {
				System.out.println("Created");
			}

			public MyObject(final String x) {
				System.out.println("Setting x = " + x);
				this.s = x;
			}

			public MyObject(final int x) {
				System.out.println("Setting x = " + x);
				this.s = Integer.toString(x);
			}
		}


		public class MyClass extends Class {
			public MyClass(String[] interfaces) {
				this(interfaces, null);
			}

			public MyClass(ClassLoader classLoader) {
				this(null, classLoader);
			}

			public MyClass(final ClassInfo[] interfaces, ClassLoader classLoader) {
				super(interfaces, classLoader);
				super.setModifierExclude("static", Modifier.STATIC);
			}

			MutableStringData[] getData(final ClassInfo[] infos) {
				final String[] data = new String[infos.length];
				final Set<String> dataClasses = new HashSet<String>();
				final Enumeration<Class> enum = getParentClasses(this, 0);

				// Enumerate all interfaces.
				System.out.println("Getting interfaces.");

				while (enum.hasMoreElements()) {
					final ClassInfo info = enum.nextElement();
					String className = info.getClassName();
					final String packageName = className.substring(0, className.lastIndexOf("."));

					if (className.equals(classLoader.getClass().getName())) {
						addData(data, className, dataClasses);
					}

					System.out.println("Adding class: " + className);
					if (! info.isLocal()) {
						try {
							final Class c = Thread.currentThread().getContextClassLoader().loadClass(info.getClassName());
							addData(data, c.getName(), dataClasses);
						} catch (ClassNotFoundException exception) {
							exception.printStackTrace();
						}
					}
				}

				addData(data, className, dataClasses);
				return new MutableStringData[0];
			}

			private void addData(String[] name, String className, final Set<String> data) {
				for (int i = 0; i < name.length; i++) {
					final String key = i + "." + className.substring(0, className.lastIndexOf(".") + 1);
					data.add(key);
				}
			}

			Class[] getInterfaces() {
				return new Class[]{this.getClass()};
			}
		}

		public MyClass obj = null;

		MyClassInfo() {
			System.out.println("Created");
			obj = ClassInfo.class.getDeclaredConstructor().newInstance();
		}

		@Test
		public void getInterfaces() {
			assertEquals(1, this.getInterfaces().length);
			assertEquals("ClassInfoObject", this.getInterfaces()[0].getName());
		}
}