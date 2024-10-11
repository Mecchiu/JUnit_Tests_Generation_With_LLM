// AtRobotCompiler_1Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains one unit test case for the {@link AtRobotCompiler#compile(InputStream)} method.
*/
class AtRobotCompiler_1Test {
/**
		* Tests it-work method.
		*/
		@Test
		public void testItWork() {
            
            // Create and initialize an actual instance of this class (the compilation case) by calling the protected method compile
            String actual = compile("/foo/bar/baz.java", "UTF-8");
            assertEquals("compiled path", "/foo/bar/baz.java.txt", actual);
        }
		
		
		
        /**
        * Tests a class file which does not have any comment.
        */
        String class1File1 = "/foo/bar/baz.java";

        
        
        /* The test is skipped, because we do not have the class compiler to run as "com.sun.tools.javac.Main" */
        String class1File2 = "/foo/bar/baz.java.txt";
        
        
        /**
        * Tests if the actual file exist in the class path.
        */
        @Test
        public void testNotExist() {
            assertFalse(isClassExist("/foo/bar/baz.java"));
        }

        /**
        * Tests if the actual class exist in the class path.
        */
        @Test
        public void testExist() {
            assertNotNull(isClassExist("/foo/bar/baz.java.txt"));
        }

        /**
        * Tests if the actual class exists in the class path.
        */
        @Test
        public void testExist2() {
            assertNotNull(isClassExist(class1File1));
        }

        /**
        * Tests if the actual class exist in the class path.
        */
        @Test
        public void testExist3() {
            assertNotNull(isClassExist(class1File2));
        }

        
        /**
        * Tests the result of the test method with null input.
        */
        @Test
        public void testNullInput() throws IOException {
            String actual = compile(null, null);
            assertNotNull(actual);
        }

        /**
        * Tests the result of the test method with not-found class file.
        */
        @Test
        public void testNonExistClass1() throws IOException, ClassNotFoundException, NoClassDefFoundError {
            String actual = compile("/foo/bar/baz.java", "UTF-8");
            assertNotNull(actual);
        }

        
        /**
        * Tests the result of the test method with not-found class file.
        */
        @Test
        public void testNonExistClass2() throws IOException, ClassNotFoundException, NoClassDefFoundError {
            String actual = compile("/foo/bar/baz.java", "UTF-8");
            assertNotNull(actual);
        }
        
        /**
        * Tests the result of the test method with not-found class file.
        */
        @Test
		public void testNonExistClass3() throws ClassNotFoundException, IOException, NoSuchMethodException {
            
            String actual = compile("/foo/bar/baz.java", "UTF-8");
            assertNotNull(actual);
        }
}
