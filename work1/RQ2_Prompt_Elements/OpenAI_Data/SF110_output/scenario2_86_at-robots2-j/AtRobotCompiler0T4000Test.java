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
	* It tests the case where the source file is empty.
	*/
	@Test
	void testCompile_EmptyFile() throws IOException {
		File sourceFile = new File("src/test/resources/empty.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(0, output.getCode().length);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file contains a single line of code.
	*/
	@Test
	void testCompile_SingleLine() throws IOException {
		File sourceFile = new File("src/test/resources/singleline.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x1234, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file contains a single line of code with a label.
	*/
	@Test
	void testCompile_SingleLineWithLabel() throws IOException {
		File sourceFile = new File("src/test/resources/singlelinewithlabel.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x1234, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file contains a single line of code with a label and a comment.
	*/
	@Test
	void testCompile_SingleLineWithLabelAndComment() throws IOException {
		File sourceFile = new File("src/test/resources/singlelinewithlabelandcomment.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x1234, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file contains a single line of code with a comment.
	*/
	@Test
	void testCompile_SingleLineWithComment() throws IOException {
		File sourceFile = new File("src/test/resources/singlelinewithcomment.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x1234, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file contains a single line of code with a label and a comment.
	*/
	@Test
	void testCompile_SingleLineWithLabelAndComment2() throws IOException {
		File sourceFile = new File("src/test/resources/singlelinewithlabelandcomment2.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x1234, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file contains a single line of code with a label and a comment.
	*/
	@Test
	void testCompile_SingleLineWithLabelAndComment3() throws IOException {
		File sourceFile = new File("src/test/resources/singlelinewithlabelandcomment3.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x1234, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file contains a single line of code with a label and a comment.
	*/
	@Test
	void testCompile_SingleLineWithLabelAndComment4() throws IOException {
		File sourceFile = new File("src/test/resources/singlelinewithlabelandcomment4.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x1234, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file contains a single line of code with a label and a comment.
	*/
	@Test
	void testCompile_SingleLineWithLabelAndComment5() throws IOException {
		File sourceFile = new File("src/test/resources/singlelinewithlabelandcomment5.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x1234, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file contains a single line of code with a label and a comment.
	*/
	@Test
	void testCompile_SingleLineWithLabelAndComment6() throws IOException {
		File sourceFile = new File("src/test/resources/singlelinewithlabelandcomment6.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x1234, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file contains a single line of code with a label and a comment.
	*/
	@Test
	void testCompile_SingleLineWithLabelAndComment7() throws IOException {
		File sourceFile = new File("src/test/resources/singlelinewithlabelandcomment7.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x1234, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file contains a single line of code with a label and a comment.
	*/
	@Test
	void testCompile_SingleLineWithLabelAndComment8() throws IOException {
		File sourceFile = new File("src/test/resources/singlelinewithlabelandcomment8.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x1234, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file contains a single line of code with a label and a comment.
	*/
	@Test
	void testCompile_SingleLineWithLabelAndComment9() throws IOException {
		File sourceFile = new File("src/test/resources/singlelinewithlabelandcomment9.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x1234, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file contains a single line of code with a label and a comment.
	*/
	@Test
	void testCompile_SingleLineWithLabelAndComment10() throws IOException {
		File sourceFile = new File("src/test/resources/singlelinewithlabelandcomment10.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x1234, output.getCode()[0]);
	}
}

// AtRobotCompilerOutput.java
package net.virtualinfinity.atrobots.compiler;

import java.util.List;

/**
 * @author Daniel Pitts
 */
public class AtRobotCompilerOutput {
    private final List<CompilerError> errors;
    private final List<CompilerWarning> warnings;
    private final int[] code;

    public AtRobotCompilerOutput(List<CompilerError> errors, List<CompilerWarning> warnings, int[] code) {
        this.errors = errors;
        this.warnings = warnings;
        this.code = code;
    }

    public List<CompilerError> getErrors() {
        return errors;
    }

    public List<CompilerWarning> getWarnings() {
        return warnings;
    }

    public int[] getCode() {
        return code;
    }
}

// CompilerError.java
package net.virtualinfinity.atrobots.compiler;

/**
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

// AtRobotCompiler.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;

/**
 * Compiler which will compile source-code.
 *
 * @author Daniel Pitts
 */
public class AtRobotCompiler {

    /**
     * Compile the specific file.
     *
     * @param sourceFile the source file.
     * @return a CompilerOutput object.
     * @throws IOException if there is a problem reading from the file.
     */
    public AtRobotCompilerOutput compile(File sourceFile) throws IOException {
        final InputStream in = new FileInputStream(sourceFile);
        try {
            return compile(in);
        } finally {
            in.close();
        }
    }
}

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
	* It tests the case where the source file is empty.
	*/
	@Test
	void testCompile_EmptyFile() throws IOException {
		File sourceFile = new File("src/test/resources/empty.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(0, output.getCode().length);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file contains a single line of code.
	*/
	@Test
	void testCompile_SingleLine() throws IOException {
		File sourceFile = new File("src/test/resources/singleline.at2");
		AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x1234, output.getCode()[0]);
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(File)} method.
	* It tests the case where the source file contains a single line of code with a label.
	*/
	@Test
	void testCompile_SingleLineWithLabel() throws IOException {
		File sourceFile = new File("src/test/resources/singlelinewithlabel.