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
		* Test case 1.
		* The method {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} is tested.
		* The test case checks the correctness of the method when the {@link ParallelGroupAgent} has no children.
		*/
		@Test
		void testGroupContent_1() {
				ParallelGroupAgent instance = new ParallelGroupAgent();
				ParallelGroup result = instance.groupContent(new GroupCreatorAndElementAdder() {
						@Override
						public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
								return new ParallelGroup(Alignment.LEADING);
						}
						@Override
						public void addComponentToGroup(ParallelGroup group, Agent agent) {
								throw new UnsupportedOperationException("Not supported yet.");
						}
						@Override
						public void addGroupToGroup(ParallelGroup group, GroupAgent agent) {
								throw new UnsupportedOperationException("Not supported yet.");
						}
				});
				assertEquals(Alignment.LEADING, result.getAlignment());
				assertEquals(0, result.getSize());
		}
		
		/**
		* Test case 2.
		* The method {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} is tested.
		* The test case checks the correctness of the method when the {@link ParallelGroupAgent} has one child.
		*/
		@Test
		void testGroupContent_2() {
				ParallelGroupAgent instance = new ParallelGroupAgent();
				instance.addChild(new ComponentAgent());
				ParallelGroup result = instance.groupContent(new GroupCreatorAndElementAdder() {
						@Override
						public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
								return new ParallelGroup(Alignment.LEADING);
						}
						@Override
						public void addComponentToGroup(ParallelGroup group, Agent agent) {
								group.addComponent(agent.getComponent());
						}
						@Override
						public void addGroupToGroup(ParallelGroup group, GroupAgent agent) {
								throw new UnsupportedOperationException("Not supported yet.");
						}
				});
				assertEquals(Alignment.LEADING, result.getAlignment());
				assertEquals(1, result.getSize());
		}
		
		/**
		* Test case 3.
		* The method {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} is tested.
		* The test case checks the correctness of the method when the {@link ParallelGroupAgent} has two children.
		*/
		@Test
		void testGroupContent_3() {
				ParallelGroupAgent instance = new ParallelGroupAgent();
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				ParallelGroup result = instance.groupContent(new GroupCreatorAndElementAdder() {
						@Override
						public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
								return new ParallelGroup(Alignment.LEADING);
						}
						@Override
						public void addComponentToGroup(ParallelGroup group, Agent agent) {
								group.addComponent(agent.getComponent());
						}
						@Override
						public void addGroupToGroup(ParallelGroup group, GroupAgent agent) {
								throw new UnsupportedOperationException("Not supported yet.");
						}
				});
				assertEquals(Alignment.LEADING, result.getAlignment());
				assertEquals(2, result.getSize());
		}
		
		/**
		* Test case 4.
		* The method {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} is tested.
		* The test case checks the correctness of the method when the {@link ParallelGroupAgent} has three children.
		*/
		@Test
		void testGroupContent_4() {
				ParallelGroupAgent instance = new ParallelGroupAgent();
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				ParallelGroup result = instance.groupContent(new GroupCreatorAndElementAdder() {
						@Override
						public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
								return new ParallelGroup(Alignment.LEADING);
						}
						@Override
						public void addComponentToGroup(ParallelGroup group, Agent agent) {
								group.addComponent(agent.getComponent());
						}
						@Override
						public void addGroupToGroup(ParallelGroup group, GroupAgent agent) {
								throw new UnsupportedOperationException("Not supported yet.");
						}
				});
				assertEquals(Alignment.LEADING, result.getAlignment());
				assertEquals(3, result.getSize());
		}
		
		/**
		* Test case 5.
		* The method {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} is tested.
		* The test case checks the correctness of the method when the {@link ParallelGroupAgent} has four children.
		*/
		@Test
		void testGroupContent_5() {
				ParallelGroupAgent instance = new ParallelGroupAgent();
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				ParallelGroup result = instance.groupContent(new GroupCreatorAndElementAdder() {
						@Override
						public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
								return new ParallelGroup(Alignment.LEADING);
						}
						@Override
						public void addComponentToGroup(ParallelGroup group, Agent agent) {
								group.addComponent(agent.getComponent());
						}
						@Override
						public void addGroupToGroup(ParallelGroup group, GroupAgent agent) {
								throw new UnsupportedOperationException("Not supported yet.");
						}
				});
				assertEquals(Alignment.LEADING, result.getAlignment());
				assertEquals(4, result.getSize());
		}
		
		/**
		* Test case 6.
		* The method {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} is tested.
		* The test case checks the correctness of the method when the {@link ParallelGroupAgent} has five children.
		*/
		@Test
		void testGroupContent_6() {
				ParallelGroupAgent instance = new ParallelGroupAgent();
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				ParallelGroup result = instance.groupContent(new GroupCreatorAndElementAdder() {
						@Override
						public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
								return new ParallelGroup(Alignment.LEADING);
						}
						@Override
						public void addComponentToGroup(ParallelGroup group, Agent agent) {
								group.addComponent(agent.getComponent());
						}
						@Override
						public void addGroupToGroup(ParallelGroup group, GroupAgent agent) {
								throw new UnsupportedOperationException("Not supported yet.");
						}
				});
				assertEquals(Alignment.LEADING, result.getAlignment());
				assertEquals(5, result.getSize());
		}
		
		/**
		* Test case 7.
		* The method {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} is tested.
		* The test case checks the correctness of the method when the {@link ParallelGroupAgent} has six children.
		*/
		@Test
		void testGroupContent_7() {
				ParallelGroupAgent instance = new ParallelGroupAgent();
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				ParallelGroup result = instance.groupContent(new GroupCreatorAndElementAdder() {
						@Override
						public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
								return new ParallelGroup(Alignment.LEADING);
						}
						@Override
						public void addComponentToGroup(ParallelGroup group, Agent agent) {
								group.addComponent(agent.getComponent());
						}
						@Override
						public void addGroupToGroup(ParallelGroup group, GroupAgent agent) {
								throw new UnsupportedOperationException("Not supported yet.");
						}
				});
				assertEquals(Alignment.LEADING, result.getAlignment());
				assertEquals(6, result.getSize());
		}
		
		/**
		* Test case 8.
		* The method {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} is tested.
		* The test case checks the correctness of the method when the {@link ParallelGroupAgent} has seven children.
		*/
		@Test
		void testGroupContent_8() {
				ParallelGroupAgent instance = new ParallelGroupAgent();
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				ParallelGroup result = instance.groupContent(new GroupCreatorAndElementAdder() {
						@Override
						public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
								return new ParallelGroup(Alignment.LEADING);
						}
						@Override
						public void addComponentToGroup(ParallelGroup group, Agent agent) {
								group.addComponent(agent.getComponent());
						}
						@Override
						public void addGroupToGroup(ParallelGroup group, GroupAgent agent) {
								throw new UnsupportedOperationException("Not supported yet.");
						}
				});
				assertEquals(Alignment.LEADING, result.getAlignment());
				assertEquals(7, result.getSize());
		}
		
		/**
		* Test case 9.
		* The method {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} is tested.
		* The test case checks the correctness of the method when the {@link ParallelGroupAgent} has eight children.
		*/
		@Test
		void testGroupContent_9() {
				ParallelGroupAgent instance = new ParallelGroupAgent();
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				ParallelGroup result = instance.groupContent(new GroupCreatorAndElementAdder() {
						@Override
						public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
								return new ParallelGroup(Alignment.LEADING);
						}
						@Override
						public void addComponentToGroup(ParallelGroup group, Agent agent) {
								group.addComponent(agent.getComponent());
						}
						@Override
						public void addGroupToGroup(ParallelGroup group, GroupAgent agent) {
								throw new UnsupportedOperationException("Not supported yet.");
						}
				});
				assertEquals(Alignment.LEADING, result.getAlignment());
				assertEquals(8, result.getSize());
		}
		
		/**
		* Test case 10.
		* The method {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} is tested.
		* The test case checks the correctness of the method when the {@link ParallelGroupAgent} has nine children.
		*/
		@Test
		void testGroupContent_10() {
				ParallelGroupAgent instance = new ParallelGroupAgent();
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				instance.addChild(new ComponentAgent());
				ParallelGroup result = instance.groupContent(new GroupCreatorAndElementAdder() {
						@Override
						public ParallelGroup create