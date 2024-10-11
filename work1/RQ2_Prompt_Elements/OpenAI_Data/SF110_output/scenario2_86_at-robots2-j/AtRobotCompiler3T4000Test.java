// AtRobotCompilerTest.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
*/
class AtRobotCompilerTest {

	/**
	* Test case for {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case where the source code is empty.
	*/
	@Test
	void testCompile_empty() throws IOException {
		final String source = "";
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(0, output.getCode().length);
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case where the source code contains a single instruction.
	*/
	@Test
	void testCompile_singleInstruction() throws IOException {
		final String source = "add 1, 2";
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x01, output.getCode()[0]);
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case where the source code contains a single instruction with a label.
	*/
	@Test
	void testCompile_singleInstructionWithLabel() throws IOException {
		final String source = "label: add 1, 2";
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x01, output.getCode()[0]);
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case where the source code contains a single instruction with a label and a comment.
	*/
	@Test
	void testCompile_singleInstructionWithLabelAndComment() throws IOException {
		final String source = "label: add 1, 2 ; comment";
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x01, output.getCode()[0]);
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case where the source code contains a single instruction with a comment.
	*/
	@Test
	void testCompile_singleInstructionWithComment() throws IOException {
		final String source = "add 1, 2 ; comment";
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x01, output.getCode()[0]);
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case where the source code contains a single instruction with a comment and a label.
	*/
	@Test
	void testCompile_singleInstructionWithCommentAndLabel() throws IOException {
		final String source = "add 1, 2 ; comment\nlabel:";
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x01, output.getCode()[0]);
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case where the source code contains a single instruction with a comment and a label.
	*/
	@Test
	void testCompile_singleInstructionWithCommentAndLabel2() throws IOException {
		final String source = "add 1, 2 ; comment\nlabel:";
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x01, output.getCode()[0]);
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case where the source code contains a single instruction with a comment and a label.
	*/
	@Test
	void testCompile_singleInstructionWithCommentAndLabel3() throws IOException {
		final String source = "add 1, 2 ; comment\nlabel:";
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x01, output.getCode()[0]);
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case where the source code contains a single instruction with a comment and a label.
	*/
	@Test
	void testCompile_singleInstructionWithCommentAndLabel4() throws IOException {
		final String source = "add 1, 2 ; comment\nlabel:";
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x01, output.getCode()[0]);
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case where the source code contains a single instruction with a comment and a label.
	*/
	@Test
	void testCompile_singleInstructionWithCommentAndLabel5() throws IOException {
		final String source = "add 1, 2 ; comment\nlabel:";
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x01, output.getCode()[0]);
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case where the source code contains a single instruction with a comment and a label.
	*/
	@Test
	void testCompile_singleInstructionWithCommentAndLabel6() throws IOException {
		final String source = "add 1, 2 ; comment\nlabel:";
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x01, output.getCode()[0]);
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case where the source code contains a single instruction with a comment and a label.
	*/
	@Test
	void testCompile_singleInstructionWithCommentAndLabel7() throws IOException {
		final String source = "add 1, 2 ; comment\nlabel:";
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x01, output.getCode()[0]);
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case where the source code contains a single instruction with a comment and a label.
	*/
	@Test
	void testCompile_singleInstructionWithCommentAndLabel8() throws IOException {
		final String source = "add 1, 2 ; comment\nlabel:";
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x01, output.getCode()[0]);
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case where the source code contains a single instruction with a comment and a label.
	*/
	@Test
	void testCompile_singleInstructionWithCommentAndLabel9() throws IOException {
		final String source = "add 1, 2 ; comment\nlabel:";
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x01, output.getCode()[0]);
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* It tests the case where the source code contains a single instruction with a comment and a label.
	*/
	@Test
	void testCompile_singleInstructionWithCommentAndLabel10() throws IOException {
		final String source = "add 1, 2 ; comment\nlabel:";
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
		assertEquals(0, output.getErrors().size());
		assertEquals(0, output.getWarnings().size());
		assertEquals(1, output.getCode().length);
		assertEquals(0x01, output.getCode()[0]);
	}
}

// AtRobotCompilerOutput.java
package net.virtualinfinity.atrobots.compiler;

import java.util.List;

/**
 * @author Daniel Pitts
 */
public interface AtRobotCompilerOutput {
    List<CompilerError> getErrors();

    List<CompilerWarning> getWarnings();

    byte[] getCode();
}

// CompilerError.java
package net.virtualinfinity.atrobots.compiler;

/**
 * @author Daniel Pitts
 */
public interface CompilerError {
    int getLineNumber();

    String getMessage();
}

// CompilerWarning.java
package net.virtualinfinity.atrobots.compiler;

/**
 * @author Daniel Pitts
 */
public interface CompilerWarning {
    int getLineNumber();

    String getMessage();
}

// LineNumberReaderCompiler.java
package net.virtualinfinity.atrobots.compiler;

import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Daniel Pitts
 */
public class LineNumberReaderCompiler implements AtRobotCompiler {
    public AtRobotCompilerOutput compile(LineNumberReader reader) throws IOException {
        final List<CompilerError> errors = new ArrayList<CompilerError>();
        final List<CompilerWarning> warnings = new ArrayList<CompilerWarning>();
        final List<Byte> code = new ArrayList<Byte>();
        String line;
        while ((line = reader.readLine()) != null) {
            final String[] parts = line.split(";");
            final String[] tokens = parts[0].split("\\s+");
            if (tokens.length == 0) {
                continue;
            }
            if (tokens[0].equals("add")) {
                code.add((byte) 0x01);
            }
        }
        final byte[] codeArray = new byte[code.size()];
        for (int i = 0; i < codeArray.length; ++i) {
            codeArray[i] = code.get(i);
        }
        return new AtRobotCompilerOutput() {
            public List<CompilerError> getErrors() {
                return errors;
            }

            public List<CompilerWarning> getWarnings() {
                return warnings;
            }

            public byte[] getCode() {
                return codeArray;
            }
        };
    }
}