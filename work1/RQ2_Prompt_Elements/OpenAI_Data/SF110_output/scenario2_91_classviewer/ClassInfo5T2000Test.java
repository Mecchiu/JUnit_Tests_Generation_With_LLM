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

	/**
	 * Test case for {@link ClassInfo#getData(Member[])} method.
	 * <p>
	 * This test case tests the method with a null array.
	 * <p>
	 * This test case expects the method to return null.
	 */
	@Test
	void testGetDataNull() {
		Member[] m = null;
		String[] result = ClassInfo.getData(m);
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Member[])} method.
	 * <p>
	 * This test case tests the method with an empty array.
	 * <p>
	 * This test case expects the method to return null.
	 */
	@Test
	void testGetDataEmpty() {
		Member[] m = new Member[0];
		String[] result = ClassInfo.getData(m);
		assertNull(result);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Member[])} method.
	 * <p>
	 * This test case tests the method with an array of one element.
	 * <p>
	 * This test case expects the method to return an array of one element.
	 */
	@Test
	void testGetDataOneElement() {
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
	 * <p>
	 * This test case tests the method with an array of two elements.
	 * <p>
	 * This test case expects the method to return an array of two elements.
	 */
	@Test
	void testGetDataTwoElements() {
		Member[] m = new Member[2];
		m[0] = new Member() {
			public String toString() {
				return "test1";
			}
		};
		m[1] = new Member() {
			public String toString() {
				return "test2";
			}
		};
		String[] result = ClassInfo.getData(m);
		assertEquals(2, result.length);
		assertEquals("test1", result[0]);
		assertEquals("test2", result[1]);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Member[])} method.
	 * <p>
	 * This test case tests the method with an array of three elements.
	 * <p>
	 * This test case expects the method to return an array of three elements.
	 */
	@Test
	void testGetDataThreeElements() {
		Member[] m = new Member[3];
		m[0] = new Member() {
			public String toString() {
				return "test1";
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
		assertEquals("test1", result[0]);
		assertEquals("test2", result[1]);
		assertEquals("test3", result[2]);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Member[])} method.
	 * <p>
	 * This test case tests the method with an array of four elements.
	 * <p>
	 * This test case expects the method to return an array of four elements.
	 */
	@Test
	void testGetDataFourElements() {
		Member[] m = new Member[4];
		m[0] = new Member() {
			public String toString() {
				return "test1";
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
		assertEquals("test1", result[0]);
		assertEquals("test2", result[1]);
		assertEquals("test3", result[2]);
		assertEquals("test4", result[3]);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Member[])} method.
	 * <p>
	 * This test case tests the method with an array of five elements.
	 * <p>
	 * This test case expects the method to return an array of five elements.
	 */
	@Test
	void testGetDataFiveElements() {
		Member[] m = new Member[5];
		m[0] = new Member() {
			public String toString() {
				return "test1";
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
		assertEquals("test1", result[0]);
		assertEquals("test2", result[1]);
		assertEquals("test3", result[2]);
		assertEquals("test4", result[3]);
		assertEquals("test5", result[4]);
	}
	
	/**
	 * Test case for {@link ClassInfo#getData(Member[])} method.
	 * <p>
	 * This test case tests the method with an array of six elements.
	 * <p>
	 * This test case expects the method to return an array of six elements.
	 */
	@Test
	void testGetDataSixElements() {
		Member[] m = new Member[6];
		m[0] = new Member() {
			public String toString() {
				return "test1";
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
			public String toString