// JWBF_1Test.java
package net.sourceforge.jwbf;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JWBF}.
* It contains ten unit test cases for the {@link JWBF#getPartId(Class)} method.
*/
class JWBF_1Test {

		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_1() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_1Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_2() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_2Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_3() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_3Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_4() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_4Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_5() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_5Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_6() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_6Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_7() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_7Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_8() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_8Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_9() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_9Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_10() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_10Test.class));
		}
}

// JWBF_2Test.java
package net.sourceforge.jwbf;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JWBF}.
* It contains ten unit test cases for the {@link JWBF#getPartId(Class)} method.
*/
class JWBF_2Test {
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_1() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_1Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_2() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_2Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_3() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_3Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_4() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_4Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_5() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_5Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_6() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_6Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_7() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_7Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_8() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_8Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_9() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_9Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_10() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_10Test.class));
		}
}

// JWBF_3Test.java
package net.sourceforge.jwbf;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JWBF}.
* It contains ten unit test cases for the {@link JWBF#getPartId(Class)} method.
*/
class JWBF_3Test {
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_1() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_1Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_2() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_2Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_3() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_3Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_4() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_4Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_5() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_5Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_6() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_6Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_7() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_7Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_8() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_8Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_9() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_9Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_10() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_10Test.class));
		}
}

// JWBF_4Test.java
package net.sourceforge.jwbf;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JWBF}.
* It contains ten unit test cases for the {@link JWBF#getPartId(Class)} method.
*/
class JWBF_4Test {
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_1() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_1Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_2() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(JWBF_2Test.class));
		}
		
		/**
		 * Test method for {@link JWBF#getPartId(Class)}.
		 */
		@Test
		void testGetPartId_3() {
				assertEquals("jwbf-core-2.0.0", JWBF.getPartId(