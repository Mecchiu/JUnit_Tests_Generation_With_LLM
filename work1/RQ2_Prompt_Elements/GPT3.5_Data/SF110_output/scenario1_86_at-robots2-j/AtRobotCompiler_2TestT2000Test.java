// Here's an example implementation of the AtRobotCompiler class that you can use for testing:

public class AtRobotCompiler {
    
    public AtRobotCompilerOutput compile(Reader in) throws IOException {
        // TODO: Implement the compilation logic here
        return null;
    }
    
}

// And here's an example test case for the AtRobotCompiler class:

import java.io.StringReader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AtRobotCompilerTest {
    
    @Test
    void testCompile() throws IOException {
        String sourceCode = "start:\n" +
                            "    move 1\n" +
                            "    turn left\n" +
                            "    move 2\n" +
                            "    turn right\n" +
                            "    goto start\n";
        AtRobotCompiler compiler = new AtRobotCompiler();
        AtRobotCompilerOutput output = compiler.compile(new StringReader(sourceCode));
        assertNotNull(output);
        assertEquals(5, output.getInstructions().size());
        assertEquals("start", output.getInstructions().get(0).getLabel());
        assertEquals("move", output.getInstructions().get(1).getOpcode());
        assertEquals(1, output.getInstructions().get(1).getOperand());
        assertEquals("turn", output.getInstructions().get(2).getOpcode());
        assertEquals("left", output.getInstructions().get(2).getOperand());
        assertEquals("move", output.getInstructions().get(3).getOpcode());
        assertEquals(2, output.getInstructions().get(3).getOperand());
        assertEquals("turn", output.getInstructions().get(4).getOpcode());
        assertEquals("right", output.getInstructions().get(4).getOperand());
        assertEquals("start", output.getInstructions().get(5).getOperand());
    }
    
}