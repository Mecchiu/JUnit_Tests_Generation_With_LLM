// ClassInfo_5Test.java
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
class ClassInfo_5Test {

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
				m[0] = new Member() {
						public String toString() {
								return "test";
						}
				};
				String[] result = ClassInfo.getData(m);
				assertEquals(1, result.length);
				assertEquals("test", result[0]);
		}
		
		/**
		* Test case for {@link ClassInfo#getData(Member[])} method.
		* It tests the method with an array of two elements.
		*/
		@Test
		void testGetData_4() {
				Member[] m = new Member[2];
				m[0] = new Member() {
						public String toString() {
								return "test";
						}
				};
				m[1] = new Member() {
						public String toString() {
								return "test2";
						}
				};
				String[] result = ClassInfo.getData(m);
				assertEquals(2, result.length);
				assertEquals("test", result[0]);
				assertEquals("test2", result[1]);
		}
		
		/**
		* Test case for {@link ClassInfo#getData(Member[])} method.
		* It tests the method with an array of three elements.
		*/
		@Test
		void testGetData_5() {
				Member[] m = new Member[3];
				m[0] = new Member() {
						public String toString() {
								return "test";
						}
				};
				m[1] = new Member() {
						public String toString() {
								return "test2";
						}
				};
				m[2] = new Member() {
						public String toString() {
								return "test3";
						}
				};
				String[] result = ClassInfo.getData(m);
				assertEquals(3, result.length);
				assertEquals("test", result[0]);
				assertEquals("test2", result[1]);
				assertEquals("test3", result[2]);
		}
		
		/**
		* Test case for {@link ClassInfo#getData(Member[])} method.
		* It tests the method with an array of four elements.
		*/
		@Test
		void testGetData_6() {
				Member[] m = new Member[4];
				m[0] = new Member() {
						public String toString() {
								return "test";
						}
				};
				m[1] = new Member() {
						public String toString() {
								return "test2";
						}
				};
				m[2] = new Member() {
						public String toString() {
								return "test3";
						}
				};
				m[3] = new Member() {
						public String toString() {
								return "test4";
						}
				};
				String[] result = ClassInfo.getData(m);
				assertEquals(4, result.length);
				assertEquals("test", result[0]);
				assertEquals("test2", result[1]);
				assertEquals("test3", result[2]);
				assertEquals("test4", result[3]);
		}
		
		/**
		* Test case for {@link ClassInfo#getData(Member[])} method.
		* It tests the method with an array of five elements.
		*/
		@Test
		void testGetData_7() {
				Member[] m = new Member[5];
				m[0] = new Member() {
						public String toString() {
								return "test";
						}
				};
				m[1] = new Member() {
						public String toString() {
								return "test2";
						}
				};
				m[2] = new Member() {
						public String toString() {
								return "test3";
						}
				};
				m[3] = new Member() {
						public String toString() {
								return "test4";
						}
				};
				m[4] = new Member() {
						public String toString() {
								return "test5";
						}
				};
				String[] result = ClassInfo.getData(m);
				assertEquals(5, result.length);
				assertEquals("test", result[0]);
				assertEquals("test2", result[1]);
				assertEquals("test3", result[2]);
				assertEquals("test4", result[3]);
				assertEquals("test5", result[4]);
		}
		
		/**
		* Test case for {@link ClassInfo#getData(Member[])} method.
		* It tests the method with an array of six elements.
		*/
		@Test
		void testGetData_8() {
				Member[] m = new Member[6];
				m[0] = new Member() {
						public String toString() {
								return "test";
						}
				};
				m[1] = new Member() {
						public String toString() {
							