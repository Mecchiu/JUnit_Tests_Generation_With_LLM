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
	 * Tests the functionality of {@link AtRobotCompilerOutput#createRobotFactory(String)}
	 * @throws IllegalStateException if there are compiler errors.
	 */
	@Test
    public void testCreateRobotFactory() throws IllegalStateException {
        // The expected answer is provided by the constructor of the RobotFactory.
//		final RobotFactory robotFactory = new AtRobotFactory<>(100);
	}
	
	/**
	 * Tests {@link AtRobotCompilerOutput#createRobotFactory(String)} with one argument set.
	 */
	@Test
    public void testCreateRobotFactory() {
        // The expected answer is provided by the constructor of the RobotFactory.

        final Program p = new Program();
        final RobotFactory robotFactory = createRobotFactory(p.getName());
        final DebugInfo debugInfo = new DebugInfo(this);
        assertTrue(debugInfo.isEnabled());

        final RobotFactory robotFactory2 = robotFactory.getFactory();
        assertNotNull(robotFactory2);
        assertEquals(this.getClass().getCanonicalName(), botFactory(robotFactory));
        assertNotEquals(this.getClass().getCanonicalName(),
                robotFactory2.getClass().getCanonicalName());
    }
	
	/**
	 * Tests null Robot.
	 */
	@Test
    public void testCreateRobotFactoryWithNullRobot() {
        // No-op.
	}
	
}