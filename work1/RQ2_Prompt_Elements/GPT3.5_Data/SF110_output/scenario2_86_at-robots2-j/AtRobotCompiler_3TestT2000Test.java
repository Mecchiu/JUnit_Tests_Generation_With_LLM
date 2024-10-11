// Here's an example implementation of the AtRobotCompiler_3Test class with ten unit test cases for the compile() method.

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AtRobotCompiler_3Test {

    @Test
    void testCompile_emptySource() throws IOException {
        String source = "";
        AtRobotCompiler compiler = new AtRobotCompiler();
        AtRobotCompilerOutput output = compiler.compile(new LineNumberReader(new StringReader(source)));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals("", output.getCompiledCode());
    }

    @Test
    void testCompile_singleComment() throws IOException {
        String source = "// This is a comment";
        AtRobotCompiler compiler = new AtRobotCompiler();
        AtRobotCompilerOutput output = compiler.compile(new LineNumberReader(new StringReader(source)));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals("", output.getCompiledCode());
    }

    @Test
    void testCompile_singleInstruction() throws IOException {
        String source = "move 10";
        AtRobotCompiler compiler = new AtRobotCompiler();
        AtRobotCompilerOutput output = compiler.compile(new LineNumberReader(new StringReader(source)));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals("move 10\n", output.getCompiledCode());
    }

    @Test
    void testCompile_multipleInstructions() throws IOException {
        String source = "move 10\nfire 1\nwait 5";
        AtRobotCompiler compiler = new AtRobotCompiler();
        AtRobotCompilerOutput output = compiler.compile(new LineNumberReader(new StringReader(source)));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals("move 10\nfire 1\nwait 5\n", output.getCompiledCode());
    }

    @Test
    void testCompile_invalidInstruction() throws IOException {
        String source = "invalid 10";
        AtRobotCompiler compiler = new AtRobotCompiler();
        AtRobotCompilerOutput output = compiler.compile(new LineNumberReader(new StringReader(source)));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals("", output.getCompiledCode());
    }

    @Test
    void testCompile_invalidArgument() throws IOException {
        String source = "move invalid";
        AtRobotCompiler compiler = new AtRobotCompiler();
        AtRobotCompilerOutput output = compiler.compile(new LineNumberReader(new StringReader(source)));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals("", output.getCompiledCode());
    }

    @Test
    void testCompile_missingArgument() throws IOException {
        String source = "move";
        AtRobotCompiler compiler = new AtRobotCompiler();
        AtRobotCompilerOutput output = compiler.compile(new LineNumberReader(new StringReader(source)));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals("", output.getCompiledCode());
    }

    @Test
    void testCompile_missingNewline() throws IOException {
        String source = "move 10 fire 1";
        AtRobotCompiler compiler = new AtRobotCompiler();
        AtRobotCompilerOutput output = compiler.compile(new LineNumberReader(new StringReader(source)));
        assertEquals(0, output.getErrors().size());
        assertEquals(1, output.getWarnings().size());
        assertEquals("move 10\nfire 1\n", output.getCompiledCode());
    }

    @Test
    void testCompile_trailingWhitespace() throws IOException {
        String source = "move 10 \nfire 1\t\nwait 5  ";
        AtRobotCompiler compiler = new AtRobotCompiler();
        AtRobotCompilerOutput output = compiler.compile(new LineNumberReader(new StringReader(source)));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals("move 10\nfire 1\nwait 5\n", output.getCompiledCode());
    }

    @Test
    void testCompile_caseInsensitive() throws IOException {
        String source = "MOVE 10\nFiRe 1\nwAiT 5";
        AtRobotCompiler compiler = new AtRobotCompiler();
        AtRobotCompilerOutput output = compiler.compile(new LineNumberReader(new StringReader(source)));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals("move 10\nfire 1\nwait 5\n", output.getCompiledCode());
    }

    @Test
    void testCompile_commentsAndWhitespace() throws IOException {
        String source = "// This is a comment\n\nmove 10\n\n// Another comment\nfire 1\n\nwait 5\n";
        AtRobotCompiler compiler = new AtRobotCompiler();
        AtRobotCompilerOutput output = compiler.compile(new LineNumberReader(new StringReader(source)));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals("move 10\nfire 1\nwait 5\n", output.getCompiledCode());
    }
}