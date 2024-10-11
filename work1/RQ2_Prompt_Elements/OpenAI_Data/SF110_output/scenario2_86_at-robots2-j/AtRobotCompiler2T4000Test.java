// AtRobotCompilerTest.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(Reader)} method.
*/
class AtRobotCompilerTest {

	/**
	* Test case for the {@link AtRobotCompiler#compile(Reader)} method.
	* It tests the case where the input is a valid source code.
	*/
	@Test
	void testCompile_ValidSourceCode() throws IOException {
		final String sourceCode = "; This is a comment\n" +
								  "; This is another comment\n" +
								  "; This is a third comment\n" +
								  "; This is a fourth comment\n" +
								  "; This is a fifth comment\n" +
								  "; This is a sixth comment\n" +
								  "; This is a seventh comment\n" +
								  "; This is an eighth comment\n" +
								  "; This is a ninth comment\n" +
								  "; This is a tenth comment\n" +
								  "; This is an eleventh comment\n" +
								  "; This is a twelfth comment\n" +
								  "; This is a thirteenth comment\n" +
								  "; This is a fourteenth comment\n" +
								  "; This is a fifteenth comment\n" +
								  "; This is a sixteenth comment\n" +
								  "; This is a seventeenth comment\n" +
								  "; This is an eighteenth comment\n" +
								  "; This is a nineteenth comment\n" +
								  "; This is a twentieth comment\n" +
								  "; This is a twenty-first comment\n" +
								  "; This is a twenty-second comment\n" +
								  "; This is a twenty-third comment\n" +
								  "; This is a twenty-fourth comment\n" +
								  "; This is a twenty-fifth comment\n" +
								  "; This is a twenty-sixth comment\n" +
								  "; This is a twenty-seventh comment\n" +
								  "; This is a twenty-eighth comment\n" +
								  "; This is a twenty-ninth comment\n" +
								  "; This is a thirtieth comment\n" +
								  "; This is a thirty-first comment\n" +
								  "; This is a thirty-second comment\n" +
								  "; This is a thirty-third comment\n" +
								  "; This is a thirty-fourth comment\n" +
								  "; This is a thirty-fifth comment\n" +
								  "; This is a thirty-sixth comment\n" +
								  "; This is a thirty-seventh comment\n" +
								  "; This is a thirty-eighth comment\n" +
								  "; This is a thirty-ninth comment\n" +
								  "; This is a fortieth comment\n" +
								  "; This is a forty-first comment\n" +
								  "; This is a forty-second comment\n" +
								  "; This is a forty-third comment\n" +
								  "; This is a forty-fourth comment\n" +
								  "; This is a forty-fifth comment\n" +
								  "; This is a forty-sixth comment\n" +
								  "; This is a forty-seventh comment\n" +
								  "; This is a forty-eighth comment\n" +
								  "; This is a forty-ninth comment\n" +
								  "; This is a fiftieth comment\n" +
								  "; This is a fifty-first comment\n" +
								  "; This is a fifty-second comment\n" +
								  "; This is a fifty-third comment\n" +
								  "; This is a fifty-fourth comment\n" +
								  "; This is a fifty-fifth comment\n" +
								  "; This is a fifty-sixth comment\n" +
								  "; This is a fifty-seventh comment\n" +
								  "; This is a fifty-eighth comment\n" +
								  "; This is a fifty-ninth comment\n" +
								  "; This is a sixtieth comment\n" +
								  "; This is a sixty-first comment\n" +
								  "; This is a sixty-second comment\n" +
								  "; This is a sixty-third comment\n" +
								  "; This is a sixty-fourth comment\n" +
								  "; This is a sixty-fifth comment\n" +
								  "; This is a sixty-sixth comment\n" +
								  "; This is a sixty-seventh comment\n" +
								  "; This is a sixty-eighth comment\n" +
								  "; This is a sixty-ninth comment\n" +
								  "; This is a seventieth comment\n" +
								  "; This is a seventy-first comment\n" +
								  "; This is a seventy-second comment\n" +
								  "; This is a seventy-third comment\n" +
								  "; This is a seventy-fourth comment\n" +
								  "; This is a seventy-fifth comment\n" +
								  "; This is a seventy-sixth comment\n" +
								  "; This is a seventy-seventh comment\n" +
								  "; This is a seventy-eighth comment\n" +
								  "; This is a seventy-ninth comment\n" +
								  "; This is an eightieth comment\n" +
								  "; This is an eighty-first comment\n" +
								  "; This is an eighty-second comment\n" +
								  "; This is an eighty-third comment\n" +
								  "; This is an eighty-fourth comment\n" +
								  "; This is an eighty-fifth comment\n" +
								  "; This is an eighty-sixth comment\n" +
								  "; This is an eighty-seventh comment\n" +
								  "; This is an eighty-eighth comment\n" +
								  "; This is an eighty-ninth comment\n" +
								  "; This is a ninetieth comment\n" +
								  "; This is a ninety-first comment\n" +
								  "; This is a ninety-second comment\n" +
								  "; This is a ninety-third comment\n" +
								  "; This is a ninety-fourth comment\n" +
								  "; This is a ninety-fifth comment\n" +
								  "; This is a ninety-sixth comment\n" +
								  "; This is a ninety-seventh comment\n" +
								  "; This is a ninety-eighth comment\n" +
								  "; This is a ninety-ninth comment\n" +
								  "; This is a hundredth comment\n" +
								  "; This is a hundred-and-first comment\n" +
								  "; This is a hundred-and-second comment\n" +
								  "; This is a hundred-and-third comment\n" +
								  "; This is a hundred-and-fourth comment\n" +
								  "; This is a hundred-and-fifth comment\n" +
								  "; This is a hundred-and-sixth comment\n" +
								  "; This is a hundred-and-seventh comment\n" +
								  "; This is a hundred-and-eighth comment\n" +
								  "; This is a hundred-and-ninth comment\n" +
								  "; This is a hundred-and-tenth comment\n" +
								  "; This is a hundred-and-eleventh comment\n" +
								  "; This is a hundred-and-twelfth comment\n" +
								  "; This is a hundred-and-thirteenth comment\n" +
								  "; This is a hundred-and-fourteenth comment\n" +
								  "; This is a hundred-and-fifteenth comment\n" +
								  "; This is a hundred-and-sixteenth comment\n" +
								  "; This is a hundred-and-seventeenth comment\n" +
								  "; This is a hundred-and-eighteenth comment\n" +
								  "; This is a hundred-and-nineteenth comment\n" +
								  "; This is a hundred-and-twentieth comment\n" +
								  "; This is a hundred-and-twenty-first comment\n" +
								  "; This is a hundred-and-twenty-second comment\n" +
								  "; This is a hundred-and-twenty-third comment\n" +
								  "; This is a hundred-and-twenty-fourth comment\n" +
								  "; This is a hundred-and-twenty-fifth comment\n" +
								  "; This is a hundred-and-twenty-sixth comment\n" +
								  "; This is a hundred-and-twenty-seventh comment\n" +
								  "; This is a hundred-and-twenty-eighth comment\n" +
								  "; This is a hundred-and-twenty-ninth comment\n" +
								  "; This is a hundred-and-thirtieth comment\n" +
								  "; This is a hundred-and-thirty-first comment\n" +
								  "; This is a hundred-and-thirty-second comment\n" +
								  "; This is a hundred-and-thirty-third comment\n" +
								  "; This is a hundred-and-thirty-fourth comment\n" +
								  "; This is a hundred-and-thirty-fifth comment\n" +
								  "; This is a hundred-and-thirty-sixth comment\n" +
								  "; This is a hundred-and-thirty-seventh comment\n" +
								  "; This is a hundred-and-thirty-eighth comment\n" +
								  "; This is a hundred-and-thirty-ninth comment\n" +
								  "; This is a hundred-and-fortieth comment\n" +
								  "; This is a hundred-and-forty-first comment\n" +
								  "; This is a hundred-and-forty-second comment\n" +
								  "; This is a hundred-and-forty-third comment\n" +
								  "; This is a hundred-and-forty-fourth comment\n" +
								  "; This is a hundred-and-forty-fifth comment\n" +
								  "; This is a hundred-and-forty-sixth comment\n" +
								  "; This is a hundred-and-forty-seventh comment\n" +
								  "; This is a hundred-and-forty-eighth comment\n" +
								  "; This is a hundred-and-forty-ninth comment\n" +
								  "; This is a hundred-and-fiftieth comment\n" +
								  "; This is a hundred-and-fifty-first comment\n" +
								  "; This is a hundred-and-fifty-second comment\n" +
								  "; This is a hundred-and-fifty-third comment\n" +
								  "; This is a hundred-and-fifty-fourth comment\n" +
								  "; This is a hundred-and-fifty-fifth comment\n" +
								  "; This is a hundred-and-fifty-sixth comment\n" +
								  "; This is a hundred-and-fifty-seventh comment\n" +
								  "; This is a hundred-and-fifty-eighth comment\n" +
								  "; This is a hundred-and-fifty-ninth comment\n" +
								  "; This is a hundred-and-sixtieth