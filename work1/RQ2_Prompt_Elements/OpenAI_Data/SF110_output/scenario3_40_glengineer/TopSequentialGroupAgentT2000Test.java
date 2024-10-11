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
	 * Test case for the case when the {@code GroupCreatorAndElementAdder}
	 * is {@code null}.
	 * <p>
	 * Expected result: {@code NullPointerException} is thrown.
	 */
	@Test
	void testGroupContent_NullGroupCreatorAndElementAdder() {
		assertThrows(NullPointerException.class, () -> {
			new TopSequentialGroupAgent().groupContent(null);
		});
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * Test case for the case when the {@code GroupCreatorAndElementAdder}
	 * is {@code null}.
	 * <p>
	 * Expected result: {@code NullPointerException} is thrown.
	 */
	@Test
	void testGroupContent_NullGroupCreator() {
		assertThrows(NullPointerException.class, () -> {
			new TopSequentialGroupAgent().groupContent(new GroupCreatorAndElementAdder(null, null));
		});
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * Test case for the case when the {@code GroupCreatorAndElementAdder}
	 * is {@code null}.
	 * <p>
	 * Expected result: {@code NullPointerException} is thrown.
	 */
	@Test
	void testGroupContent_NullElementAdder() {
		assertThrows(NullPointerException.class, () -> {
			new TopSequentialGroupAgent().groupContent(new GroupCreatorAndElementAdder(() -> null, null));
		});
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * Test case for the case when the {@code GroupCreatorAndElementAdder}
	 * is {@code null}.
	 * <p>
	 * Expected result: {@code NullPointerException} is thrown.
	 */
	@Test
	void testGroupContent_NullGroupCreatorAndElementAdder_NullGroupCreator() {
		assertThrows(NullPointerException.class, () -> {
			new TopSequentialGroupAgent().groupContent(new GroupCreatorAndElementAdder(null, null));
		});
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * Test case for the case when the {@code GroupCreatorAndElementAdder}
	 * is {@code null}.
	 * <p>
	 * Expected result: {@code NullPointerException} is thrown.
	 */
	@Test
	void testGroupContent_NullGroupCreatorAndElementAdder_NullElementAdder() {
		assertThrows(NullPointerException.class, () -> {
			new TopSequentialGroupAgent().groupContent(new GroupCreatorAndElementAdder(() -> null, null));
		});
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * Test case for the case when the {@code GroupCreatorAndElementAdder}
	 * is {@code null}.
	 * <p>
	 * Expected result: {@code NullPointerException} is thrown.
	 */
	@Test
	void testGroupContent_NullGroupCreatorAndElementAdder_NullGroupCreatorAndElementAdder() {
		assertThrows(NullPointerException.class, () -> {
			new TopSequentialGroupAgent().groupContent(new GroupCreatorAndElementAdder(null, null));
		});
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * Test case for the case when the {@code GroupCreatorAndElementAdder}
	 * is {@code null}.
	 * <p>
	 * Expected result: {@code NullPointerException} is thrown.
	 */
	@Test
	void testGroupContent_NullGroupCreatorAndElementAdder_NullGroupCreatorAndElementAdder_NullGroupCreator() {
		assertThrows(NullPointerException.class, () -> {
			new TopSequentialGroupAgent().groupContent(new GroupCreatorAndElementAdder(null, null));
		});
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * Test case for the case when the {@code GroupCreatorAndElementAdder}
	 * is {@code null}.
	 * <p>
	 * Expected result: {@code NullPointerException} is thrown.
	 */
	@Test
	void testGroupContent_NullGroupCreatorAndElementAdder_NullGroupCreatorAndElementAdder_NullElementAdder() {
		assertThrows(NullPointerException.class, () -> {
			new TopSequentialGroupAgent().groupContent(new GroupCreatorAndElementAdder(() -> null, null));
		});
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * Test case for the case when the {@code GroupCreatorAndElementAdder}
	 * is {@code null}.
	 * <p>
	 * Expected result: {@code NullPointerException} is thrown.
	 */
	@Test
	void testGroupContent_NullGroupCreatorAndElementAdder_NullGroupCreatorAndElementAdder_NullGroupCreatorAndElementAdder() {
		assertThrows(NullPointerException.class, () -> {
			new TopSequentialGroupAgent().groupContent(new GroupCreatorAndElementAdder(null, null));
		});
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * Test case for the case when the {@code GroupCreatorAndElementAdder}
	 * is {@code null}.
	 * <p>
	 * Expected result: {@code NullPointerException} is thrown.
	 */
	@Test
	void testGroupContent_NullGroupCreatorAndElementAdder_NullGroupCreatorAndElementAdder_NullGroupCreatorAndElementAdder_NullGroupCreator() {
		assertThrows(NullPointerException.class, () -> {
			new TopSequentialGroupAgent().groupContent(new GroupCreatorAndElementAdder(null, null));
		});
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * Test case for the case when the {@code GroupCreatorAndElementAdder}
	 * is {@code null}.
	 * <p>
	 * Expected result: {@code NullPointerException} is thrown.
	 */
	@Test
	void testGroupContent_NullGroupCreatorAndElementAdder_NullGroupCreatorAndElementAdder_NullGroupCreatorAndElementAdder_NullElementAdder() {
		assertThrows(NullPointerException.class, () -> {
			new TopSequentialGroupAgent().groupContent(new GroupCreatorAndElementAdder(() -> null, null));
		});
	}
	
	/**
	 * Test case for {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * Test case for the case when the {@code GroupCreat