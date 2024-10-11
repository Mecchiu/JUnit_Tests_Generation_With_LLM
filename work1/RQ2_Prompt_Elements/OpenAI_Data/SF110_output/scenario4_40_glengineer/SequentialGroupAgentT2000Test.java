// SequentialGroupAgentTest.java
package glengineer.agents;

import java.util.ListIterator;
import glengineer.agents.setters.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.GroupLayout.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SequentialGroupAgent}.
* It contains ten unit test cases for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
*/
class SequentialGroupAgentTest {

	/**
	* Test case #1.
	* <p>
	* Test method: {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}.
	* <p>
	* Check that the method returns the same sequential group that was passed to it.
	*/
	@Test
	void testGroupContent_1() {
		SequentialGroupAgent agent = new SequentialGroupAgent() {
			public SequentialGroup groupContent(GroupCreatorAndElementAdder creatorAndAdder) {
				return creatorAndAdder.createSequentialGroup();
			}
		};
		SequentialGroup group = new SequentialGroup();
		assertSame(group, agent.groupContent(new GroupCreatorAndElementAdder() {
			public SequentialGroup createSequentialGroup() {
				return group;
			}
			public ParallelGroup createParallelGroup() {
				return null;
			}
			public void addComponent(ComponentAgent component) {
			}
			public void addGroup(GroupAgent group) {
			}
		}));
	}
	
	/**
	* Test case #2.
	* <p>
	* Test method: {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}.
	* <p>
	* Check that the method returns the same sequential group that was passed to it.
	*/
	@Test
	void testGroupContent_2() {
		SequentialGroupAgent agent = new SequentialGroupAgent() {
			public SequentialGroup groupContent(GroupCreatorAndElementAdder creatorAndAdder) {
				return creatorAndAdder.createSequentialGroup();
			}
		};
		SequentialGroup group = new SequentialGroup();
		assertSame(group, agent.groupContent(new GroupCreatorAndElementAdder() {
			public SequentialGroup createSequentialGroup() {
				return group;
			}
			public ParallelGroup createParallelGroup() {
				return null;
			}
			public void addComponent(ComponentAgent component) {
			}
			public void addGroup(GroupAgent group) {
			}
		}));
	}
	
	/**
	* Test case #3.
	* <p>
	* Test method: {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}.
	* <p>
	* Check that the method returns the same sequential group that was passed to it.
	*/
	@Test
	void testGroupContent_3() {
		SequentialGroupAgent agent = new SequentialGroupAgent() {
			public SequentialGroup groupContent(GroupCreatorAndElementAdder creatorAndAdder) {
				return creatorAndAdder.createSequentialGroup();
			}
		};
		SequentialGroup group = new SequentialGroup();
		assertSame(group, agent.groupContent(new GroupCreatorAndElementAdder() {
			public SequentialGroup createSequentialGroup() {
				return group;
			}
			public ParallelGroup createParallelGroup() {
				return null;
			}
			public void addComponent(ComponentAgent component) {
			}
			public void addGroup(GroupAgent group) {
			}
		}));
	}
	
	/**
	* Test case #4.
	* <p>
	* Test method: {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}.
	* <p>
	* Check that the method returns the same sequential group that was passed to it.
	*/
	@Test
	void testGroupContent_4() {
		SequentialGroupAgent agent = new SequentialGroupAgent() {
			public SequentialGroup groupContent(GroupCreatorAndElementAdder creatorAndAdder) {
				return creatorAndAdder.createSequentialGroup();
			}
		};
		SequentialGroup group = new SequentialGroup();
		assertSame(group, agent.groupContent(new GroupCreatorAndElementAdder() {
			public SequentialGroup createSequentialGroup() {
				return group;
			}
			public ParallelGroup createParallelGroup() {
				return null;
			}
			public void addComponent(ComponentAgent component) {
			}
			public void addGroup(GroupAgent group) {
			}
		}));
	}
	
	/**
	* Test case #5.
	* <p>
	* Test method: {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}.
	* <p>
	* Check that the method returns the same sequential group that was passed to it.
	*/
	@Test
	void testGroupContent_5() {
		SequentialGroupAgent agent = new SequentialGroupAgent() {
			public SequentialGroup groupContent(GroupCreatorAndElementAdder creatorAndAdder) {
				return creatorAndAdder.createSequentialGroup();
			}
		};
		SequentialGroup group = new SequentialGroup();
		assertSame(group, agent.groupContent(new GroupCreatorAndElementAdder() {
			public SequentialGroup createSequentialGroup() {
				return group;
			}
			public ParallelGroup createParallelGroup() {
				return null;
			}
			public void addComponent(ComponentAgent component) {
			}
			public void addGroup(GroupAgent group) {
			}
		}));
	}
	
	/**
	* Test case #6.
	* <p>
	* Test method: {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}.
	* <p>
	* Check that the method returns the same sequential group that was passed to it.
	*/
	@Test
	void testGroupContent_6() {
		SequentialGroupAgent agent = new SequentialGroupAgent() {
			public SequentialGroup groupContent(GroupCreatorAndElementAdder creatorAndAdder) {
				return creatorAndAdder.createSequentialGroup();
			}
		};
		SequentialGroup group = new SequentialGroup();
		assertSame(group, agent.groupContent(new GroupCreatorAndElementAdder() {
			public SequentialGroup createSequentialGroup() {
				return group;
			}
			public ParallelGroup createParallelGroup() {
				return null;
			}
			public void addComponent(ComponentAgent component) {
			}
			public void addGroup(GroupAgent group) {
			}
		}));
	}
	
	/**
	* Test case #7.
	* <p>
	* Test method: {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}.
	* <p>
	* Check that the method returns the same sequential group that was passed to it.
	*/
	@Test
	void testGroupContent_7() {
		SequentialGroupAgent agent = new SequentialGroupAgent() {
			public SequentialGroup groupContent(GroupCreatorAndElementAdder creatorAndAdder) {
				return creatorAndAdder.createSequentialGroup();
			}
		};
		SequentialGroup group = new SequentialGroup();
		assertSame(group, agent.groupContent(new GroupCreatorAndElementAdder() {
			public SequentialGroup createSequentialGroup() {
				return group;
			}
			public ParallelGroup createParallelGroup() {
				return null;
			}
			public void addComponent(ComponentAgent component) {
			}
			public void addGroup(GroupAgent group) {
			}
		}));
	}