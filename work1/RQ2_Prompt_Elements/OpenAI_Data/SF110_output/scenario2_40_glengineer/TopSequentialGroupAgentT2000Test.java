// TopSequentialGroupAgentTest.java
package glengineer.agents;

import javax.swing.GroupLayout.SequentialGroup;
import glengineer.agents.setters.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TopSequentialGroupAgent}.
* It contains ten unit test cases for the {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
*/
class TopSequentialGroupAgentTest {

	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * The test case checks that the method returns a {@link SequentialGroup}
	 * with the same elements as the {@link TopSequentialGroupAgent} has.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has two children:
	 * <ul>
	 * <li>{@link ComponentAgent} with the {@link ComponentAgent#preferredSize}
	 * equal to {@code (100, 100)}</li>
	 * <li>{@link ComponentAgent} with the {@link ComponentAgent#preferredSize}
	 * equal to {@code (200, 200)}</li>
	 * </ul>
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no gaps.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no alignment.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no resize behavior.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no baseline resize behavior.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no minimum size.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no preferred size.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no maximum size.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 * The {@link TopSequentialGroupAgent} has no padding.
	 * <p>
	 *