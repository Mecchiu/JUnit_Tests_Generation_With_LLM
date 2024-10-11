// Here's an example implementation of the AtRobotCompiler_1Test class:

package net.virtualinfinity.atrobots.compiler;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test class of {@link AtRobotCompiler}.
 * It contains ten unit test cases for the {@link AtRobotCompiler#compile(InputStream)} method.
 */
class AtRobotCompiler_1Test {

    @Test
    void testCompileEmptySource() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final InputStream in = new ByteArrayInputStream("".getBytes());
        final AtRobotCompilerOutput output = compiler.compile(in);
        assertEquals("", output.getCompiledCode());
    }

    @Test
    void testCompileSimpleSource() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final InputStream in = new ByteArrayInputStream("move 1".getBytes());
        final AtRobotCompilerOutput output = compiler.compile(in);
        assertEquals("move 1", output.getCompiledCode());
    }

    @Test
    void testCompileInvalidSource() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final InputStream in = new ByteArrayInputStream("invalid source".getBytes());
        assertThrows(AtRobotCompilerException.class, () -> compiler.compile(in));
    }

    @Test
    void testCompileSourceWithComments() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final InputStream in = new ByteArrayInputStream("# This is a comment\nmove 1".getBytes());
        final AtRobotCompilerOutput output = compiler.compile(in);
        assertEquals("move 1", output.getCompiledCode());
    }

    @Test
    void testCompileSourceWithLabels() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final InputStream in = new ByteArrayInputStream("label1: move 1\nlabel2: move 2".getBytes());
        final AtRobotCompilerOutput output = compiler.compile(in);
        assertEquals("label1: move 1\nlabel2: move 2", output.getCompiledCode());
    }

    @Test
    void testCompileSourceWithVariables() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final InputStream in = new ByteArrayInputStream("var1 = 1\nmove var1".getBytes());
        final AtRobotCompilerOutput output = compiler.compile(in);
        assertEquals("var1 = 1\nmove var1", output.getCompiledCode());
    }

    @Test
    void testCompileSourceWithMacros() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final InputStream in = new ByteArrayInputStream("macro1: move 1\nmacro2: move 2\nmacro1\nmacro2".getBytes());
        final AtRobotCompilerOutput output = compiler.compile(in);
        assertEquals("macro1: move 1\nmacro2: move 2\nmacro1\nmacro2", output.getCompiledCode());
    }

    @Test
    void testCompileSourceWithIncludes() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final InputStream in = new ByteArrayInputStream("#include \"file1.txt\"\n#include \"file2.txt\"".getBytes());
        final AtRobotCompilerOutput output = compiler.compile(in);
        assertEquals("#include \"file1.txt\"\n#include \"file2.txt\"", output.getCompiledCode());
    }

    @Test
    void testCompileSourceWithConstants() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final InputStream in = new ByteArrayInputStream("const1 = 1\nmove const1".getBytes());
        final AtRobotCompilerOutput output = compiler.compile(in);
        assertEquals("const1 = 1\nmove const1", output.getCompiledCode());
    }

    @Test
    void testCompileSourceWithExpressions() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final InputStream in = new ByteArrayInputStream("move 1 + 2 * 3".getBytes());
        final AtRobotCompilerOutput output = compiler.compile(in);
        assertEquals("move 1 + 2 * 3", output.getCompiledCode());
    }
}