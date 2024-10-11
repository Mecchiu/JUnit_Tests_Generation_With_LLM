// ClassInfoTest.java
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
class ClassInfoTest {

	@Test
	void testGetData() {
		Member[] m = new Member[0];
		String[] result = ClassInfo.getData(m);
		assertNull(result);
		
		m = new Member[1];
		m[0] = new Member() {
			@Override
			public Class<?> getDeclaringClass() {
				return null;
			}
			@Override
			public String getName() {
				return "test";
			}
			@Override
			public int getModifiers() {
				return 0;
			}
			@Override
			public boolean isSynthetic() {
				return false;
			}
		};
		result = ClassInfo.getData(m);
		assertEquals(1, result.length);
		assertEquals("test", result[0]);
		
		m = new Member[2];
		m[0] = new Member() {
			@Override
			public Class<?> getDeclaringClass() {
				return null;
			}
			@Override
			public String getName() {
				return "test";
			}
			@Override
			public int getModifiers() {
				return 0;
			}
			@Override
			public boolean isSynthetic() {
				return false;
			}
		};
		m[1] = new Member() {
			@Override
			public Class<?> getDeclaringClass() {
				return null;
			}
			@Override
			public String getName() {
				return "test2";
			}
			@Override
			public int getModifiers() {
				return 0;
			}
			@Override
			public boolean isSynthetic() {
				return false;
			}
		};
		result = ClassInfo.getData(m);
		assertEquals(2, result.length);
		assertEquals("test", result[0]);
		assertEquals("test2", result[1]);
		
		m = new Member[3];
		m[0] = new Member() {
			@Override
			public Class<?> getDeclaringClass() {
				return null;
			}
			@Override
			public String getName() {
				return "test";
			}
			@Override
			public int getModifiers() {
				return 0;
			}
			@Override
			public boolean isSynthetic() {
				return false;
			}
		};
		m[1] = new Member() {
			@Override
			public Class<?> getDeclaringClass() {
				return null;
			}
			@Override
			public String getName() {
				return "test2";
			}
			@Override
			public int getModifiers() {
				return 0;
			}
			@Override
			public boolean isSynthetic() {
				return false;
			}
		};
		m[2] = new Member() {
			@Override
			public Class<?> getDeclaringClass() {
				return null;
			}
			@Override
			public String getName() {
				return "test3";
			}
			@Override
			public int getModifiers() {
				return 0;
			}
			@Override
			public boolean isSynthetic() {
				return false;
			}
		};
		result = ClassInfo.getData(m);
		assertEquals(3, result.length);
		assertEquals("test", result[0]);
		assertEquals("test2", result[1]);
		assertEquals("test3", result[2]);
		
		m = new Member[4];
		m[0] = new Member() {
			@Override
			public Class<?> getDeclaringClass() {
				return null;
			}
			@Override
			public String getName() {
				return "test";
			}
			@Override
			public int getModifiers() {
				return 0;
			}
			@Override
			public boolean isSynthetic() {
				return false;
			}
		};
		m[1] = new Member() {
			@Override
			public Class<?> getDeclaringClass() {
				return null;
			}
			@Override
			public String getName() {
				return "test2";
			}
			@Override
			public int getModifiers() {
				return 0;
			}
			@Override
			public boolean isSynthetic() {
				return false;
			}
		};
		m[2] = new Member() {
			@Override
			public Class<?> getDeclaringClass() {
				return null;
			}
			@Override
			public String getName() {
				return "test3";
			}
			@Override
			public int getModifiers() {
				return 0;
			}
			@Override
			public boolean isSynthetic() {
				return false;
			}
		};
		m[3] = new Member() {
			@Override
			public Class<?> getDeclaringClass() {
				return null;
			}
			@Override
			public String getName() {
				return "test4";
			}
			@Override
			public int getModifiers() {
				return 0;
			}
			@Override
			public boolean isSynthetic() {
				return false;
			}
		};
		result = ClassInfo.getData(m);
		assertEquals(4, result.length);
		assertEquals("test", result[0]);
		assertEquals("test2", result[1]);
		assertEquals("test3", result[2]);
		assertEquals("test4", result[3]);
		
		m = new Member[5];
		m[0] = new Member() {
			@Override
			public Class<?> getDeclaringClass() {
				return null;
			}
			@Override
			public String getName() {
				return "test";
			}
			@Override
			public int getModifiers() {
				return 0;
			}
			@Override
			public boolean isSynthetic() {
				return false;
			}
		};
		m[1] = new Member() {
			@Override
			public Class<?> getDeclaringClass() {
				return null;
			}
			@Override
			public String getName() {
				return "test2";
			}
			@Override
			public int getModifiers() {
				return 0;
