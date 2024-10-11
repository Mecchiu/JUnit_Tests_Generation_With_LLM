// ParallelGroupAgentTest.java
package glengineer.agents;

import glengineer.agents.setters.FunctionsOnGroup;
import glengineer.agents.setters.FunctionsOnParallelGroup;
import glengineer.agents.setters.FunctionsOnParallelGroupAndElement;
import glengineer.agents.settings.ParallelGroupSettings;
import java.util.Iterator;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParallelGroupAgent}.
* It contains ten unit test cases for the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
*/
class ParallelGroupAgentTest {

	/**
	 * Test case for the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the {@link ParallelGroupSettings#getAlignment()} method returns {@code null}.
	 */
	@Test
	void testGroupContent_NullAlignment() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.setSettings(new ParallelGroupSettings() {
			@Override
			public Alignment getAlignment() {
				return null;
			}
		});
		ParallelGroup group = agent.groupContent(new GroupCreatorAndElementAdder() {
			@Override
			public void addElement(ParallelGroup group, Object element) {
				// do nothing
			}
			@Override
			public ParallelGroup createGroup(ParallelGroup group) {
				return group;
			}
		});
		assertNull(group.getAlignment());
	}
	
	/**
	 * Test case for the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the {@link ParallelGroupSettings#getAlignment()} method returns {@code Alignment.LEADING}.
	 */
	@Test
	void testGroupContent_LeadingAlignment() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.setSettings(new ParallelGroupSettings() {
			@Override
			public Alignment getAlignment() {
				return Alignment.LEADING;
			}
		});
		ParallelGroup group = agent.groupContent(new GroupCreatorAndElementAdder() {
			@Override
			public void addElement(ParallelGroup group, Object element) {
				// do nothing
			}
			@Override
			public ParallelGroup createGroup(ParallelGroup group) {
				return group;
			}
		});
		assertEquals(Alignment.LEADING, group.getAlignment());
	}
	
	/**
	 * Test case for the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the {@link ParallelGroupSettings#getAlignment()} method returns {@code Alignment.TRAILING}.
	 */
	@Test
	void testGroupContent_TrailingAlignment() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.setSettings(new ParallelGroupSettings() {
			@Override
			public Alignment getAlignment() {
				return Alignment.TRAILING;
			}
		});
		ParallelGroup group = agent.groupContent(new GroupCreatorAndElementAdder() {
			@Override
			public void addElement(ParallelGroup group, Object element) {
				// do nothing
			}
			@Override
			public ParallelGroup createGroup(ParallelGroup group) {
				return group;
			}
		});
		assertEquals(Alignment.TRAILING, group.getAlignment());
	}
	
	/**
	 * Test case for the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the {@link ParallelGroupSettings#getAlignment()} method returns {@code Alignment.CENTER}.
	 */
	@Test
	void testGroupContent_CenterAlignment() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.setSettings(new ParallelGroupSettings() {
			@Override
			public Alignment getAlignment() {
				return Alignment.CENTER;
			}
		});
		ParallelGroup group = agent.groupContent(new GroupCreatorAndElementAdder() {
			@Override
			public void addElement(ParallelGroup group, Object element) {
				// do nothing
			}
			@Override
			public ParallelGroup createGroup(ParallelGroup group) {
				return group;
			}
		});
		assertEquals(Alignment.CENTER, group.getAlignment());
	}
	
	/**
	 * Test case for the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the {@link ParallelGroupSettings#getAlignment()} method returns {@code Alignment.BASELINE}.
	 */
	@Test
	void testGroupContent_BaselineAlignment() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.setSettings(new ParallelGroupSettings() {
			@Override
			public Alignment getAlignment() {
				return Alignment.BASELINE;
			}
		});
		ParallelGroup group = agent.groupContent(new GroupCreatorAndElementAdder() {
			@Override
			public void addElement(ParallelGroup group, Object element) {
				// do nothing
			}
			@Override
			public ParallelGroup createGroup(ParallelGroup group) {
				return group;
			}
		});
		assertEquals(Alignment.BASELINE, group.getAlignment());
	}
	
	/**
	 * Test case for the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the {@link ParallelGroupSettings#getResizable()} method returns {@code true}.
	 */
	@Test
	void testGroupContent_ResizableTrue() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.setSettings(new ParallelGroupSettings() {
			@Override
			public boolean getResizable() {
				return true;
			}
		});
		ParallelGroup group = agent.groupContent(new GroupCreatorAndElementAdder() {
			@Override
			public void addElement(ParallelGroup group, Object element) {
				// do nothing
			}
			@Override
			public ParallelGroup createGroup(ParallelGroup group) {
				return group;
			}
		});
		assertTrue(group.isResizable());
	}
	
	/**
	 * Test case for the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the {@link ParallelGroupSettings#getResizable()} method returns {@code false}.
	 */
	@Test
	void testGroupContent_ResizableFalse() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.setSettings(new ParallelGroupSettings() {
			@Override
			public boolean getResizable() {
				return false;
			}
		});
		ParallelGroup group = agent.groupContent(new GroupCreatorAndElementAdder() {
			@Override
			public void addElement(ParallelGroup group, Object element) {
				// do nothing
			}
			@Override
			public ParallelGroup createGroup(ParallelGroup group) {
				return group;
			}
		});
		assertFalse(group.isResizable());
	}
	
	/**
	 * Test case for the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the {@link ParallelGroupSettings#getElements()} method returns {@code null}.
	 */
	@Test
	void testGroupContent_NullElements() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.setSettings(new ParallelGroupSettings() {
			@Override
			public Iterator<Object> getElements() {
				return