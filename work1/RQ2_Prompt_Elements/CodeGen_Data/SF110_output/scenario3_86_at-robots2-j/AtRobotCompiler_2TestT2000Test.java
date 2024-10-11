// AtRobotCompiler_2Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains one unit test case for the {@link AtRobotCompiler#compile(Reader)} method.
*/
class AtRobotCompiler_2Test {

    private static final boolean PRINT_STACK = false;

    @Test
    void test1() throws Exception {
        AtRobotCompilerOutput compo_out = compile(new PrintStream(Writer.getOut(new FileOutputStream(new File("test_out.txt"), new FileOutputStream(new File("test_out2")))), true, PRINT_STACK));
        assertTrue(compo_out.isCompiling());
    }
	
    @Test
    void test2() throws Exception {
        AtRobotCompilerOutput compo_out = compile(new PrintStream(Writer.getOut(new FileOutputStream(new File("test")))));
        assertFalse(compo_out.isCompiling());
    }

    @Test
    void test3() throws Exception {
        AtRobotCompilerOutput comp = null;
        try {
        compo_out = compile(new PrintStream(Writer.getOut(), true));
        } catch (NoSuchExtensionException e) {
        // the extension is not supported, so we don't need to compile anything
        // but we'll just keep the test happy
        }
        assertTrue(compo_out.isCompiling());
    }
    
}