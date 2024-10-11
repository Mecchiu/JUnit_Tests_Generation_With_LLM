// Here's an example implementation of AtRobotCompiler and AtRobotCompilerOutput classes.

// AtRobotCompiler.java
package net.virtualinfinity.atrobots.compiler;

import java.io.IOException;
import java.io.LineNumberReader;

/**
 * Compiler which will compile source-code.
 *
 * @author Daniel Pitts
 */
public class AtRobotCompiler {

    /**
     * Compile the source read from the given reader.
     *
     * @param reader the reader
     * @return a CompilerOutput object.
     * @throws IOException if there is a problem reading from the reader.
     */
    public AtRobotCompilerOutput compile(LineNumberReader reader) throws IOException {
        // TODO: Implement the compiler logic here.
        return new AtRobotCompilerOutput();
    }
}

// AtRobotCompilerOutput.java
package net.virtualinfinity.atrobots.compiler;

/**
 * Output of the AtRobotCompiler.
 */
public class AtRobotCompilerOutput {

    /**
     * Returns true if the compilation was successful.
     *
     * @return true if the compilation was successful.
     */
    public boolean isSuccess() {
        // TODO: Implement the logic to determine if the compilation was successful.
        return true;
    }

    /**
     * Returns the error message if the compilation failed.
     *
     * @return the error message if the compilation failed.
     */
    public String getErrorMessage() {
        // TODO: Implement the logic to return the error message if the compilation failed.
        return null;
    }

    /**
     * Returns the compiled code.
     *
     * @return the compiled code.
     */
    public String getCompiledCode() {
        // TODO: Implement the logic to return the compiled code.
        return null;
    }
}