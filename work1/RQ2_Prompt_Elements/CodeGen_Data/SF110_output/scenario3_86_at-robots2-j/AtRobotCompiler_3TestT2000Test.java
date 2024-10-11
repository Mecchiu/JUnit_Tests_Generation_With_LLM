// AtRobotCompiler_3Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains one unit test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
*/
class AtRobotCompiler_3Test {

	/**
	 * Compiler-Testcase-1.java
	 * <p>
	 * It tests the execute() method of the compiler.
	 *
	 * @throws Exception
	 *             if there's an error.
	 */
	@Test
	public void testCompile() throws Exception {
		System.out.println("TESTING");
		// Prepare and compile the compilation
		final AtRobotCompiler compiler = new AtRobotCompiler();
		final AtRobotCompilerOutput result = compiler.compile("input/compilerTest1.txt", new JavaFile(FileTemplateManager.DEFAULT_TEMPLATE_DIRECTORY+"/"+"compilerTest1.java",
				new JavaFile(FileTemplateManager.DEFAULT_TEMPLATE_DIRECTORY+"/"+"compilerTest1").toString()));
		
		checkError(result, "I002", null);
		checkError(result, null, "I004");
		checkError(result, null, "I003");
		checkError(result, null, "I005");
		checkError(result, null, "I002");
		// Execute the code

		String source = result.getSourceFile();
		assertTrue(isSourceFiles(source));
		readSourceFile(source);
	}
	
	/**
	 * Test for getSourceFile().
	 *
	 * @param source The source to test.
	 * @return true if the source is a string
	 */
	private boolean isSourceFiles(String source) {
		return!(source.indexOf(FileTemplateManager.DEFAULT_TEMPLATE_DIRECTORY) < 0 && source.indexOf(FileTemplateManager.DEFAULT_CONTENT_DIRECTORY) < 0);
	}

	/**
	 * Compile the source read from the given reader.
	 *
	 * @param reader the reader
	 * @return a CompilerOutput object.
	 * @throws Exception if there is a problem reading from the reader.
	 */
	private AtRobotCompilerOutput compile(LineNumberReader reader) throws Exception {
		return (AtRobotCompilerOutput)compiler.compile(reader, new JavaFile(FileTemplateManager.DEFAULT_TEMPLATE_DIRECTORY+"/"+"compilerTest1.java",
				new JavaFile(FileTemplateManager.DEFAULT_TEMPLATE_DIRECTORY+"/"+"compilerTest1").toString()));
	}

	/**
	 * Reads the given source and writes to the given Writer.
	 *
	 * @param source The source to read from.
	 * @param writer The Writer to write the output to.
	 * @throws IOException if there's an error.
	 */
	private void readSourceFile(String source) throws IOException {
		Reader r = new BufferedReader(new FileReader(new File(source)));
		FileWriter fw = new FileWriter(new File("target/at-robots.compile.tmp"));
		int length = 0;
		char[] buffer = new char[2000];
		while((length = r.read(buffer)) > 0) {
			fw.write(buffer, 0, length);
        }
		byte[] array = fw.toByteArray();
		ByteArrayInputStream bais = new ByteArrayInputStream(array);
		Reader reader = new InputStreamReader(bais, "utf-8");
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("target/at-robots.compile.tmp", true)));
		int i = 0;
		while((length = i <= 20) && (i < array.length)) {
			out.write((char)((i % 95) + 32) + "\r\n");
            out.write(new String((i / 2) + 4, "UTF-8"));
			i++;
		}
		reader.close();
        out.close();
	}

}
