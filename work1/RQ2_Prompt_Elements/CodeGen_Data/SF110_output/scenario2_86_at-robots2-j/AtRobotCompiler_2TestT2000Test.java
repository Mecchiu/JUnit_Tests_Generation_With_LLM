// AtRobotCompiler_2Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains one unit test case for the {@link AtRobotCompiler#compile(Reader)} method.
*/
class AtRobotCompiler_2Test {

    private final TestUtils utils = new TestUtils();

    @Test
    public void shouldCompileTest() throws Exception {
        new File(this.utils.tempOutDir(), "compileTest.java").delete(); // Clear the temp output
        // In here, we want the tests to work even if compilation fails, so we're going to
        // write out the test code.
        test(this.utils.tempOutDir());
    }


    private void test(String directory) throws Exception {
		
        String[] classNames = { "/TestAtRobots-2.cla", "/atRobots-2.cla" };

        String testSrc = this.utils.tempOutDir("compileTest.java");
        StringWriter sw = new StringWriter();
        AtRobotCompilerOutput compiled = AtRobotCompiler.compile(new FileInputStream(this.utils.tempOutDir() + testSrc), classNames, sw);

		// Check the source read from our stdout
		String text = sw.toString();
		System.arraycopy(text.toCharArray(), 0, text.toCharArray(), text.length(), text.length());

		// Check the classes read from our stdout
		assertEquals(classNames.length + 1, Utils.readLines(text.toCharArray(), 0, text.length()).length);
		
		// Set up the test class
		String actualTestClass = Utils.readLines(text.toCharArray(), 0, text.length()).next();

        String actualName = actualTestClass.substring(actualTestClass.lastIndexOf('.') + 1);
        System.out.println("Actual Class: " + actualTestClass);

		// Now check the results
		Class foundClass = this.utils.loadClass(actualTestClass);
		Class actualClass  = foundClass.asSubclass(java.io.Serializable.class);

		assertEquals(classesAreConcrete(foundClass), classesAreConcrete(actualClass));
		assertEquals(classesAreSerializable(foundClass), classesAreSerializable(actualClass));
		assertEquals(classesAreConcrete(foundClass), classesAreConcrete(actualClass));
		assertEquals(classesAreSerializable(foundClass), classesAreSerializable(actualClass));
		assertEquals(classesAreConcrete(foundClass) == classesAreConcrete(actualClass), true);
    }

	/** 
	 * Checks the contents of two classes are compatible.
	 * Example usage:
	 * java.io.FileReader classA =... 
	 * java.util.LinkedList classB =...
	 * 
	 * @param a the first class of the two
	 * @param b the second class of the first class
	 * @return the contents of the two
	 * @throws Exception an exception is thrown if the test fails
	 */
	private static boolean classesAreConcrete(Class a, Class b) throws Exception {
		if (a.getSuperclass() == null) {
			return (Class.class.isAssignableFrom(b));

		} else if ((Class.class.isAssignableFrom(a.getSuperclass()) && b.equals(a.getSuperclass()))) {
			return true;
		} else {
			throw new RuntimeException("Class A is a sub-class " + a + " and " + b + " of " + a.getSuperclass() + ", but it is not");
		}
	}

	/**
	 * Checks the contents of two classes are serializable.
	 * Example usage:
	 * java.io.FileReader classA =...
	 * java.util.LinkedList classB =...
	 *
	 * @param from the first class of the two
	 * @param to the second class of the first class
	 * @return the contents of the two
	 */
	private static boolean classesAreSerializable(Class a, Class b) throws Exception {
		if (a.getSuperclass() == null) {
			return! classesAreConcrete(b, a);
		} else if ((Class.class.isAssignableFrom(a.getSuperclass()) &&!b.equals(a.getSuperclass()))) {
			return! classesAreSerializable(b, a);
		} else {
			throw new RuntimeException("Class A is a sub-class " + a + " and " + b + " of " + a.getSuperclass() + ", but it is serializable");
		}
	}

	private static class TestUtils extends Class {
		public TestUtils() throws Exception {
		    super(AtRobotCompiler_2Test.class.getName(), null, new Class[] { java.io.FileReader.class, java.lang.Object.class });
		}

		public static String tempOutDir() throws Exception {
			return utils.getTempFile("atrobots-", ".class", ".java");
		}
	}
}
