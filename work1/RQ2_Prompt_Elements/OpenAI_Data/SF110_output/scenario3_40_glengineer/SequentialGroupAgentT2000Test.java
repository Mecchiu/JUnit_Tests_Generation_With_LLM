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
	* Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	* It tests the case when the {@link GroupCreatorAndElementAdder#addComponent(javax.swing.JComponent)} method
	* is called once.
	*/
	@Test
	void testGroupContent_1() {
		SequentialGroupAgent agent = new SequentialGroupAgent();
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder() {
			@Override
			public SequentialGroup createGroup() {
				return new GroupLayout(null).createSequentialGroup();
			}
			@Override
			public void addComponent(javax.swing.JComponent component) {
				group.addComponent(component);
			}
		};
		SequentialGroup group = agent.groupContent(creatorAndAdder);
		ListIterator<Group> iterator = group.getElements();
		assertTrue(iterator.hasNext());
		Group next = iterator.next();
		assertTrue(next instanceof ParallelGroup);
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	* It tests the case when the {@link GroupCreatorAndElementAdder#addComponent(javax.swing.JComponent)} method
	* is called twice.
	*/
	@Test
	void testGroupContent_2() {
		SequentialGroupAgent agent = new SequentialGroupAgent();
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder() {
			@Override
			public SequentialGroup createGroup() {
				return new GroupLayout(null).createSequentialGroup();
			}
			@Override
			public void addComponent(javax.swing.JComponent component) {
				group.addComponent(component);
				group.addComponent(component);
			}
		};
		SequentialGroup group = agent.groupContent(creatorAndAdder);
		ListIterator<Group> iterator = group.getElements();
		assertTrue(iterator.hasNext());
		Group next = iterator.next();
		assertTrue(next instanceof ParallelGroup);
		assertTrue(iterator.hasNext());
		next = iterator.next();
		assertTrue(next instanceof ParallelGroup);
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	* It tests the case when the {@link GroupCreatorAndElementAdder#addComponent(javax.swing.JComponent)} method
	* is called three times.
	*/
	@Test
	void testGroupContent_3() {
		SequentialGroupAgent agent = new SequentialGroupAgent();
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder() {
			@Override
			public SequentialGroup createGroup() {
				return new GroupLayout(null).createSequentialGroup();
			}
			@Override
			public void addComponent(javax.swing.JComponent component) {
				group.addComponent(component);
				group.addComponent(component);
				group.addComponent(component);
			}
		};
		SequentialGroup group = agent.groupContent(creatorAndAdder);
		ListIterator<Group> iterator = group.getElements();
		assertTrue(iterator.hasNext());
		Group next = iterator.next();
		assertTrue(next instanceof ParallelGroup);
		assertTrue(iterator.hasNext());
		next = iterator.next();
		assertTrue(next instanceof ParallelGroup);
		assertTrue(iterator.hasNext());
		next = iterator.next();
		assertTrue(next instanceof ParallelGroup);
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	* It tests the case when the {@link GroupCreatorAndElementAdder#addComponent(javax.swing.JComponent)} method
	* is called four times.
	*/
	@Test
	void testGroupContent_4() {
		SequentialGroupAgent agent = new SequentialGroupAgent();
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder() {
			@Override
			public SequentialGroup createGroup() {
				return new GroupLayout(null).createSequentialGroup();
			}
			@Override
			public void addComponent(javax.swing.JComponent component) {
				group.addComponent(component);
				group.addComponent(component);
				group.addComponent(component);
				group.addComponent(component);
			}
		};
		SequentialGroup group = agent.groupContent(creatorAndAdder);
		ListIterator<Group> iterator = group.getElements();
		assertTrue(iterator.hasNext());
		Group next = iterator.next();
		assertTrue(next instanceof ParallelGroup);
		assertTrue(iterator.hasNext());
		next = iterator.next();
		assertTrue(next instanceof ParallelGroup);
		assertTrue(iterator.hasNext());
		next = iterator.next();
		assertTrue(next instanceof ParallelGroup);
		assertTrue(iterator.hasNext());
		next = iterator.next();
		assertTrue(next instanceof ParallelGroup);
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	* It tests the case when the {@link GroupCreatorAndElementAdder#addComponent(javax.swing.JComponent)} method
	* is called five times.
	*/
	@Test
	void testGroupContent_5() {
		SequentialGroupAgent agent = new SequentialGroupAgent();
		GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder() {
			@Override
			public SequentialGroup createGroup() {
				return new GroupLayout(null).createSequentialGroup();
			}
			@Override
			public void addComponent(javax.swing.JComponent component) {
				group.addComponent(component);
				group.addComponent(component);
				group.addComponent(component);
				group.addComponent(component);
				group.addComponent(component);
			}
		};
		SequentialGroup group = agent.groupContent(creatorAndAdder);
		ListIterator<Group> iterator = group.getElements();
		assertTrue(iterator.hasNext());
		Group next = iterator.next();
		assertTrue(next instanceof ParallelGroup);
		assertTrue(iterator.hasNext());
		next = iterator.next();
		assertTrue(next instanceof ParallelGroup);
		assertTrue(iterator.hasNext());
		next = iterator.next();
		assertTrue(next instanceof ParallelGroup);
		assertTrue(iterator.hasNext());
		next = iterator.next();
		assertTrue(next instanceof ParallelGroup);
		assertTrue(iterator.hasNext());
		next = iterator.next();
		assertTrue(next instanceof ParallelGroup);
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	* It tests the case when the {@link GroupCreatorAndElementAdder#addComponent(javax.swing.JComponent)} method
	*