// AtRobotCompilerOutput_0Test.java
package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompilerOutput}.
* It contains one unit test case for the {@link AtRobotCompilerOutput#createRobotFactory(String)} method.
*/
class AtRobotCompilerOutput_0Test {
		
	/**
	 * Test case constructor.
	 */
	@Test
	public void testCtor_0() {
		AtRobotCompilerOutput_0 testCase = new AtRobotCompilerOutput_0();
	}

	/**
	 * Test case constructor.
	 */
	@Test
	public void testCtor_1() {
		AtRobotCompilerOutput_0 testCase = new AtRobotCompilerOutput_0(new AtomicVariable(null,  "message"));
	}

    /** {@inheritDoc} */
    @Test
    public void testHasErrors_0() {
        AtRobotCompilerOutput_0 testCase = new AtRobotCompilerOutput_0(new AtomicVariable(null, null,  null, null));
        assertFalse(testCase.hasErrors());
    }

    /** {@inheritDoc} */
    @Test
    public void testHasErrors_1() {
        AtRobotCompilerOutput_0 testCase = new AtRobotCompilerOutput_0(new AtomicVariable(null,  "message1",  null));
        assertTrue(testCase.hasErrors());
    }

    /** {@inheritDoc} */
    @Test
    public void testHasErrors_2() {
        AtRobotCompilerOutput_0 testCase = new AtRobotCompilerOutput_0();
        AtRobotCompilerOutput_0.Error error = testCase.hasErrors();
        assertNotNull(error);
        assertEquals(error.getMessage(), "This is what I said");
    }
}