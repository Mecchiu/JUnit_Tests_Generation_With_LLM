// JCLO_1Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains one unit test case for the {@link JCLO#usage()} method.
*/
class JCLO_1Test {
		
	private static final String testTitle = "JCLO - Unit Tests";

	final static String testTestId = "@id@{@$testName@}";

	final static String testCommandLineMessage = "@Test#${#testName@}#${@testType@}: $@{\n"
		+ "@input@    Test input #1 ${@result0@}, ${@result1@} ${@input0@}: ${@result0@},...........................................................${@result1@}\n"
		+ "}}#${\"#testName#\"@}: ${@result0@} ${@input0@} ${{@input0$@#$input0#$@}\n${@input0$@\"testName\"@}\n${@input0$@\"testName\"@}\"#${\"#testName#\"@}\n{{*}}#${testName@}*: ${@result0@} ${@result1@} }$@}"
		+ "};\n\n";

	final static String testResult = "[${testName}]";

	/*
	 * Main Method
	 */
	@Test
	void testUsage() {
		new JCLO_1Test();
	}

	@Test
	@SuppressWarnings("unused")
	void testTest1() {
		String[] tstArgs = {"Hello"};
		String[] tstOutput = {"World"};
		String[] tstInputs = {"Hello"};
		assertNotNull(Array.get(getClass().getConstructors(), 0));
		assertEquals(testCommandLineMessage, getUsageType(((Constructor<?>) Array.get(getClass().getDeclaredConstructors(), 0)).getDeclaringClass().getName()));
}
}