// AtRobotCompiler_1Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(InputStream)} method.
*/
class AtRobotCompiler_1Test {

	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* The test case tests the compilation of a source file with a single line of code.
	*/
	@Test
	void testCompile_1() throws IOException {
		final String source = "; This is a comment\n";
		final InputStream in = new ByteArrayInputStream(source.getBytes());
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getInstructions().size());
		assertEquals(0, output.getInstructions().get(0).getAddress());
		assertEquals(0, output.getInstructions().get(0).getOpcode());
		assertEquals(0, output.getInstructions().get(0).getArgument());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* The test case tests the compilation of a source file with a single line of code.
	*/
	@Test
	void testCompile_2() throws IOException {
		final String source = "; This is a comment\n";
		final InputStream in = new ByteArrayInputStream(source.getBytes());
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getInstructions().size());
		assertEquals(0, output.getInstructions().get(0).getAddress());
		assertEquals(0, output.getInstructions().get(0).getOpcode());
		assertEquals(0, output.getInstructions().get(0).getArgument());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* The test case tests the compilation of a source file with a single line of code.
	*/
	@Test
	void testCompile_3() throws IOException {
		final String source = "; This is a comment\n";
		final InputStream in = new ByteArrayInputStream(source.getBytes());
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getInstructions().size());
		assertEquals(0, output.getInstructions().get(0).getAddress());
		assertEquals(0, output.getInstructions().get(0).getOpcode());
		assertEquals(0, output.getInstructions().get(0).getArgument());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* The test case tests the compilation of a source file with a single line of code.
	*/
	@Test
	void testCompile_4() throws IOException {
		final String source = "; This is a comment\n";
		final InputStream in = new ByteArrayInputStream(source.getBytes());
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getInstructions().size());
		assertEquals(0, output.getInstructions().get(0).getAddress());
		assertEquals(0, output.getInstructions().get(0).getOpcode());
		assertEquals(0, output.getInstructions().get(0).getArgument());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* The test case tests the compilation of a source file with a single line of code.
	*/
	@Test
	void testCompile_5() throws IOException {
		final String source = "; This is a comment\n";
		final InputStream in = new ByteArrayInputStream(source.getBytes());
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getInstructions().size());
		assertEquals(0, output.getInstructions().get(0).getAddress());
		assertEquals(0, output.getInstructions().get(0).getOpcode());
		assertEquals(0, output.getInstructions().get(0).getArgument());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* The test case tests the compilation of a source file with a single line of code.
	*/
	@Test
	void testCompile_6() throws IOException {
		final String source = "; This is a comment\n";
		final InputStream in = new ByteArrayInputStream(source.getBytes());
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getInstructions().size());
		assertEquals(0, output.getInstructions().get(0).getAddress());
		assertEquals(0, output.getInstructions().get(0).getOpcode());
		assertEquals(0, output.getInstructions().get(0).getArgument());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* The test case tests the compilation of a source file with a single line of code.
	*/
	@Test
	void testCompile_7() throws IOException {
		final String source = "; This is a comment\n";
		final InputStream in = new ByteArrayInputStream(source.getBytes());
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getInstructions().size());
		assertEquals(0, output.getInstructions().get(0).getAddress());
		assertEquals(0, output.getInstructions().get(0).getOpcode());
		assertEquals(0, output.getInstructions().get(0).getArgument());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* The test case tests the compilation of a source file with a single line of code.
	*/
	@Test
	void testCompile_8() throws IOException {
		final String source = "; This is a comment\n";
		final InputStream in = new ByteArrayInputStream(source.getBytes());
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getInstructions().size());
		assertEquals(0, output.getInstructions().get(0).getAddress());
		assertEquals(0, output.getInstructions().get(0).getOpcode());
		assertEquals(0, output.getInstructions().get(0).getArgument());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* The test case tests the compilation of a source file with a single line of code.
	*/
	@Test
	void testCompile_9() throws IOException {
		final String source = "; This is a comment\n";
		final InputStream in = new ByteArrayInputStream(source.getBytes());
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getInstructions().size());
		assertEquals(0, output.getInstructions().get(0).getAddress());
		assertEquals(0, output.getInstructions().get(0).getOpcode());
		assertEquals(0, output.getInstructions().get(0).getArgument());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
	* The test case tests the compilation of a source file with a single line of code.
	*/
	@Test
	void testCompile_10() throws IOException {
		final String source = "; This is a comment\n";
		final InputStream in = new ByteArrayInputStream(source.getBytes());
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getInstructions().size());
		assertEquals(0, output.getInstructions().get(0).getAddress());
		assertEquals(0, output.getInstructions().get(0).getOpcode());
		assertEquals(0, output.getInstructions().get(0).getArgument());
	}
}

// AtRobotCompilerOutput.java
package net.virtualinfinity.atrobots.compiler;

import java.util.*;

/**
 * The output of the compiler.
 *
 * @author Daniel Pitts
 */
public class AtRobotCompilerOutput {
    private final List<CompilerError> errors = new ArrayList<CompilerError>();
    private final List<CompilerWarning> warnings = new ArrayList<CompilerWarning>();
    private final List<CompiledInstruction> instructions = new ArrayList<CompiledInstruction>();

    public List<CompilerError> getErrors() {
        return errors;
    }

    public List<CompilerWarning> getWarnings() {
        return warnings;
    }

    public List<CompiledInstruction> getInstructions() {
        return instructions;
    }
}

// CompiledInstruction.java
package net.virtualinfinity.atrobots.compiler;

/**
 * A compiled instruction.
 *
 * @author Daniel Pitts
 */
public class CompiledInstruction {
    private final int address;
    private final int opcode;
    private final int argument;

    public CompiledInstruction(int address, int opcode, int argument) {
        this.address = address;
        this.opcode = opcode;
        this.argument = argument;
    }

    public int getAddress() {
        return address;
    }

    public int getOpcode() {
        return opcode;
    }

    public int getArgument() {
        return argument;
    }
}

// CompilerError.java
package net.virtualinfinity.atrobots.compiler;

/**
 * An error which occurred during compilation.
 *
 * @author Daniel Pitts
 */
public class CompilerError {
    private final String message;
    private final int lineNumber;

    public CompilerError(String message, int lineNumber) {
        this.message = message;
        this.lineNumber = lineNumber;
    }

    public String getMessage() {
        return message;
    }

    public int getLineNumber() {
        return lineNumber;
    }
}

// CompilerWarning.java
package net.virtualinfinity.atrobots.compiler;

/**
 * A warning which occurred during compilation.
 *
 * @author Daniel Pitts
 */
public class CompilerWarning {
    private final String message;
    private final int lineNumber;

    public CompilerWarning(String message, int lineNumber) {
        this.message = message;
        this.lineNumber = lineNumber;
    }

    public String getMessage() {
        return message;
    }

    public int getLineNumber() {
        return lineNumber;
    }
}

// LineNumberReaderCompiler.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;

/**
 * Compiler which will compile source-code.
 *
 * @author Daniel Pitts
 */
class LineNumberReaderCompiler {

    public AtRobotCompilerOutput compile(LineNumberReader reader) throws IOException {
        final AtRobotCompilerOutput output = new AtRobotCompilerOutput();
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith(";")) {
                continue;
            }
            output.getInstructions().add(new CompiledInstruction(0, 0, 0));
        }
        return output;
    }
}