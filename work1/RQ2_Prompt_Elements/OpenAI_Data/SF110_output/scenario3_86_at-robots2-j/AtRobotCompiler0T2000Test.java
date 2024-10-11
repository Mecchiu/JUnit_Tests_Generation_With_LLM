// AtRobotCompilerTest.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(File)} method.
*/
class AtRobotCompilerTest {

	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the compilation of a valid source file.
	*/
	@Test
	void testCompileValidSourceFile() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new File("src/test/resources/net/virtualinfinity/atrobots/compiler/validSourceFile.atr"));
		assertTrue(output.isSuccess());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the compilation of a source file with a syntax error.
	*/
	@Test
	void testCompileSourceFileWithSyntaxError() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new File("src/test/resources/net/virtualinfinity/atrobots/compiler/sourceFileWithSyntaxError.atr"));
		assertFalse(output.isSuccess());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the compilation of a source file with a semantic error.
	*/
	@Test
	void testCompileSourceFileWithSemanticError() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new File("src/test/resources/net/virtualinfinity/atrobots/compiler/sourceFileWithSemanticError.atr"));
		assertFalse(output.isSuccess());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the compilation of a source file with a semantic error.
	*/
	@Test
	void testCompileSourceFileWithSemanticError2() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new File("src/test/resources/net/virtualinfinity/atrobots/compiler/sourceFileWithSemanticError2.atr"));
		assertFalse(output.isSuccess());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the compilation of a source file with a semantic error.
	*/
	@Test
	void testCompileSourceFileWithSemanticError3() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new File("src/test/resources/net/virtualinfinity/atrobots/compiler/sourceFileWithSemanticError3.atr"));
		assertFalse(output.isSuccess());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the compilation of a source file with a semantic error.
	*/
	@Test
	void testCompileSourceFileWithSemanticError4() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new File("src/test/resources/net/virtualinfinity/atrobots/compiler/sourceFileWithSemanticError4.atr"));
		assertFalse(output.isSuccess());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the compilation of a source file with a semantic error.
	*/
	@Test
	void testCompileSourceFileWithSemanticError5() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new File("src/test/resources/net/virtualinfinity/atrobots/compiler/sourceFileWithSemanticError5.atr"));
		assertFalse(output.isSuccess());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the compilation of a source file with a semantic error.
	*/
	@Test
	void testCompileSourceFileWithSemanticError6() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new File("src/test/resources/net/virtualinfinity/atrobots/compiler/sourceFileWithSemanticError6.atr"));
		assertFalse(output.isSuccess());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the compilation of a source file with a semantic error.
	*/
	@Test
	void testCompileSourceFileWithSemanticError7() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new File("src/test/resources/net/virtualinfinity/atrobots/compiler/sourceFileWithSemanticError7.atr"));
		assertFalse(output.isSuccess());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the compilation of a source file with a semantic error.
	*/
	@Test
	void testCompileSourceFileWithSemanticError8() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new File("src/test/resources/net/virtualinfinity/atrobots/compiler/sourceFileWithSemanticError8.atr"));
		assertFalse(output.isSuccess());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the compilation of a source file with a semantic error.
	*/
	@Test
	void testCompileSourceFileWithSemanticError9() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new File("src/test/resources/net/virtualinfinity/atrobots/compiler/sourceFileWithSemanticError9.atr"));
		assertFalse(output.isSuccess());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the compilation of a source file with a semantic error.
	*/
	@Test
	void testCompileSourceFileWithSemanticError10() throws IOException {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile(new File("src/test/resources/net/virtualinfinity/atrobots/compiler/sourceFileWithSemanticError10.atr"));
		assertFalse(output.isSuccess());
	}
}

// AtRobotCompilerOutput.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;

/**
 * @author Daniel Pitts
 */
public class AtRobotCompilerOutput {
    private final boolean success;
    private final File outputFile;
    private final String errorMessage;

    public AtRobotCompilerOutput(boolean success, File outputFile, String errorMessage) {
        this.success = success;
        this.outputFile = outputFile;
        this.errorMessage = errorMessage;
    }

    public boolean isSuccess() {
        return success;
    }

    public File getOutputFile() {
        return outputFile;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}

// AtRobotCompilerOutputTest.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit