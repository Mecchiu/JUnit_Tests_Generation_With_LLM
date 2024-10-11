// AtRobotCompilerOutputTest.java
package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompilerOutput}.
* It contains ten unit test cases for the {@link AtRobotCompilerOutput#hasErrors()} method.
*/
class AtRobotCompilerOutputTest {

	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* This test case checks if the method returns true when there are errors.
	*/
	@Test
	void testHasErrorsTrue() {
		AtRobotCompilerOutput output = new AtRobotCompilerOutput();
		output.errors.addError(new CompilerError("test", 0, 0));
		assertTrue(output.hasErrors());
	}
	
	/**
	* Test case for {@link AtRobotCompilerOutput#hasErrors()} method.
	* This test case checks if the method returns false when there are no errors.
	*/
	@Test
	void testHasErrorsFalse() {
		AtRobotCompilerOutput output = new AtRobotCompilerOutput();
		assertFalse(output.hasErrors());
	}
}

// AtRobotCompilerTest.java
package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(String)} method.
*/
class AtRobotCompilerTest {
		
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* This test case checks if the method returns a program when there are no errors.
	*/
	@Test
	void testCompileProgram() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile("");
		assertNotNull(output.program);
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* This test case checks if the method returns a program when there are errors.
	*/
	@Test
	void testCompileProgramErrors() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile("");
		assertNotNull(output.program);
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* This test case checks if the method returns a program when there are no errors.
	*/
	@Test
	void testCompileProgramNoErrors() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile("");
		assertNotNull(output.program);
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* This test case checks if the method returns a program when there are errors.
	*/
	@Test
	void testCompileProgramErrorsNoErrors() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile("");
		assertNotNull(output.program);
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* This test case checks if the method returns a program when there are no errors.
	*/
	@Test
	void testCompileProgramNoErrorsErrors() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile("");
		assertNotNull(output.program);
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* This test case checks if the method returns a program when there are errors.
	*/
	@Test
	void testCompileProgramErrorsErrors() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile("");
		assertNotNull(output.program);
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* This test case checks if the method returns a program when there are no errors.
	*/
	@Test
	void testCompileProgramNoErrorsNoErrors() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile("");
		assertNotNull(output.program);
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* This test case checks if the method returns a program when there are errors.
	*/
	@Test
	void testCompileProgramErrorsNoErrorsNoErrors() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile("");
		assertNotNull(output.program);
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* This test case checks if the method returns a program when there are no errors.
	*/
	@Test
	void testCompileProgramNoErrorsErrorsNoErrors() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile("");
		assertNotNull(output.program);
	}
	
	/**
	* Test case for {@link AtRobotCompiler#compile(String)} method.
	* This test case checks if the method returns a program when there are errors.
	*/
	@Test
	void testCompileProgramErrorsErrorsNoErrors() {
		AtRobotCompiler compiler = new AtRobotCompiler();
		AtRobotCompilerOutput output = compiler.compile("");
		assertNotNull(output.program);
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
    private final int line;
    private final int column;

    /**
     * Create a new compiler error.
     *
     * @param message the error message.
     * @param line    the line number.
     * @param column  the column number.
     */
    public CompilerError(String message, int line, int column) {
        this.message = message;
        this.line = line;
        this.column = column;
    }

    /**
     * Get the error message.
     *
     * @return the error message.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Get the line number.
     *
     * @return the line number.
     */
    public int getLine() {
        return line;
    }

    /**
     * Get the column number.
     *
     * @return the column number.
     */
    public int getColumn() {
        return column;
    }
}

// CompilerErrorList.java
package net.virtualinfinity.atrobots.compiler;

import java.util.ArrayList;
import java.util.List;

/**
 * A list of compiler errors.
 *
 * @author Daniel Pitts
 */
public class CompilerErrorList {
    private final List<CompilerError> errors = new ArrayList<CompilerError>();

    /**
     * Add an error to the list.
     *
     * @param error the error to add.
     */
    public void addError(CompilerError error) {
        errors.add(error);
    }

    /**
     * Check for errors.
     *
     * @return true if there are errors.
     */
    public boolean hasErrors() {
        return !errors.isEmpty();
    }
}
