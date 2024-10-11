// StartupOptionsTest.java
package macaw.system;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartupOptions}.
* It contains ten unit test cases for the {@link StartupOptions#useDemo()} method.
*/
class StartupOptionsTest {

		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns true when the useDemo property is set to true.
		*/
		@Test
		public void testUseDemoTrue() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(true);
				assertTrue(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns false when the useDemo property is set to false.
		*/
		@Test
		public void testUseDemoFalse() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(false);
				assertFalse(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns true when the useDemo property is set to true and the command line arguments contain the -production flag.
		*/
		@Test
		public void testUseDemoTrueProduction() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(true);
				startupOptions.processCommandLineArguments(new String[] {"-production"});
				assertFalse(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns false when the useDemo property is set to false and the command line arguments contain the -production flag.
		*/
		@Test
		public void testUseDemoFalseProduction() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(false);
				startupOptions.processCommandLineArguments(new String[] {"-production"});
				assertFalse(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns true when the useDemo property is set to true and the command line arguments contain the -dbUser flag.
		*/
		@Test
		public void testUseDemoTrueDbUser() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(true);
				startupOptions.processCommandLineArguments(new String[] {"-dbUser", "test"});
				assertFalse(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns false when the useDemo property is set to false and the command line arguments contain the -dbUser flag.
		*/
		@Test
		public void testUseDemoFalseDbUser() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(false);
				startupOptions.processCommandLineArguments(new String[] {"-dbUser", "test"});
				assertFalse(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns true when the useDemo property is set to true and the command line arguments contain the -dbPassword flag.
		*/
		@Test
		public void testUseDemoTrueDbPassword() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(true);
				startupOptions.processCommandLineArguments(new String[] {"-dbPassword", "test"});
				assertFalse(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns false when the useDemo property is set to false and the command line arguments contain the -dbPassword flag.
		*/
		@Test
		public void testUseDemoFalseDbPassword() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(false);
				startupOptions.processCommandLineArguments(new String[] {"-dbPassword", "test"});
				assertFalse(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns true when the useDemo property is set to true and the command line arguments contain the -dbName flag.
		*/
		@Test
		public void testUseDemoTrueDbName() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(true);
				startupOptions.processCommandLineArguments(new String[] {"-dbName", "test"});
				assertFalse(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns false when the useDemo property is set to false and the command line arguments contain the -dbName flag.
		*/
		@Test
		public void testUseDemoFalseDbName() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(false);
				startupOptions.processCommandLineArguments(new String[] {"-dbName", "test"});
				assertFalse(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns true when the useDemo property is set to true and the command line arguments contain the -dbServer flag.
		*/
		@Test
		public void testUseDemoTrueDbServer() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(true);
				startupOptions.processCommandLineArguments(new String[] {"-dbServer", "test"});
				assertFalse(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns false when the useDemo property is set to false and the command line arguments contain the -dbServer flag.
		*/
		@Test
		public void testUseDemoFalseDbServer() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(false);
				startupOptions.processCommandLineArguments(new String[] {"-dbServer", "test"});
				assertFalse(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns true when the useDemo property is set to true and the command line arguments contain the -dbPort flag.
		*/
		@Test
		public void testUseDemoTrueDbPort() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(true);
				startupOptions.processCommandLineArguments(new String[] {"-dbPort", "test"});
				assertFalse(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns false when the useDemo property is set to false and the command line arguments contain the -dbPort flag.
		*/
		@Test
		public void testUseDemoFalseDbPort() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(false);
				startupOptions.processCommandLineArguments(new String[] {"-dbPort", "test"});
				assertFalse(startupOptions.useDemo());
		}
}

// TestRunner.java
package macaw.system;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
* Test runner for the {@link StartupOptionsTest} class.
*/
public class TestRunner {
		public static void main(String[] args) {
				Result result = JUnitCore.runClasses(StartupOptionsTest.class);
				for (Failure failure : result.getFailures()) {
						System.out.println(failure.toString());
				}
				System.out.println(result.wasSuccessful());
		}
}

// TestRunner.java
package macaw.system;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
* Test runner for the {@link StartupOptionsTest} class.
*/
public class TestRunner {
		public static void main(String[] args) {
				Result result = JUnitCore.runClasses(StartupOptionsTest.class);
				for (Failure failure : result.getFailures()) {
						System.out.println(failure.toString());
				}
				System.out.println(result.wasSuccessful());
		}
}

// TestRunner.java
package macaw.system;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
* Test runner for the {@link StartupOptionsTest} class.
*/
public class TestRunner {
		public static void main(String[] args) {
				Result result = JUnitCore.runClasses(StartupOptionsTest.class);
				for (Failure failure : result.getFailures()) {
						System.out.println(failure.toString());
				}
				System.out.println(result.wasSuccessful());
		}
}

// TestRunner.java
package macaw.system;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
* Test runner for the {@link StartupOptionsTest} class.
*/
public class TestRunner {
		public static void main(String[] args) {
				Result result = JUnitCore.runClasses(StartupOptionsTest.class);
				for (Failure failure : result.getFailures()) {
						System.out.println(failure.toString());
				}
				System.out.println(result.wasSuccessful());
		}
}

// TestRunner.java
package macaw.system;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
* Test runner for the {@link StartupOptionsTest} class.
*/
public class TestRunner {
		public static void main(String[] args) {
				Result result = JUnitCore.runClasses(StartupOptionsTest.class);
				for (Failure failure : result.getFailures()) {
						System.out.println(failure.toString());
				}
				System.out.println(result.wasSuccessful());
		}
}

// TestRunner.java
package macaw.system;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
* Test runner for the {@link StartupOptionsTest} class.
*/
public class TestRunner {
		public static void main(String[] args) {
				Result result = JUnitCore.runClasses(StartupOptionsTest.class);
				for (Failure failure : result.getFailures()) {
						System.out.println(failure.toString());
				}
				System.out.println(result.wasSuccessful());
		}
}

// TestRunner.java
package macaw.system;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
* Test runner for the {@link StartupOptionsTest} class.
*/
public class TestRunner {
		public static void main(String[] args) {
				Result result = JUnitCore.runClasses(StartupOptionsTest.class);
				for (Failure failure : result.getFailures()) {
						System.out.println(failure.toString());
				}
				System.out.println(result.wasSuccessful());
		}
}

// TestRunner.java
package macaw.system;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
* Test runner for the {@link StartupOptionsTest} class.
*/
public class TestRunner {
		public static void main(String[] args) {
				Result result = JUnitCore.runClasses(StartupOptionsTest.class);
				for (Failure failure : result.getFailures()) {
						System.out.println(failure.toString());
				}
				System.out.println(result.wasSuccessful());
		}
}

// TestRunner.java
package macaw.system;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
* Test runner for the {@link StartupOptionsTest} class.
*/
public class TestRunner {
		public static void main(String[] args) {
				Result result = JUnitCore.runClasses(StartupOptionsTest.class);
				for (Failure failure : result.getFailures()) {
						System.out.println(failure.toString());
				}
				System.out.println(result.wasSuccessful());
		}
}

// TestRunner.java
package macaw.system;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
* Test runner for the {@link StartupOptionsTest} class.
*/
public class TestRunner {
		public static void main(String[] args) {
				Result result = JUnitCore.runClasses(StartupOptionsTest.class);
				for (Failure failure : result.getFailures()) {
						System.out.println(failure.toString());
				}
				System.out.println(result.wasSuccessful());
		