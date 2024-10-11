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
	 * Tested method: {@link TopSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}
	 * <p>
	 * Tested object: {@link TopSequentialGroupAgent}
	 * <p>
	 * Tested conditions:
	 * <ul>
	 * <li>�������������� ���������� � ������ � � ����� ���������������� ������ �������� ������;
	 * <li>�������������� ���������� � ������ � � ����� ���������������� ������ �������� ������
	 * 		� ���������� ���������� ������.
	 * </ul>
	 * <p>
	 * Expected result:
	 * <ul>
	 * <li>�������������� ���������� � ������ � � ����� ���������������� ������ �������� ������;
	 * <li>�������������� ���������� � ������ � � ����� ���������������� ������ �������� ������
	 * 		� ���������� ���������� ������.
	 * </ul>
	 */
	@Test
	void testGroupContent() {
		// �������������� ���������� � ������ � � ����� ���������������� ������ �������� ������
		TopSequentialGroupAgent agent = new TopSequentialGroupAgent();
		agent.getFunctionsOnTopSequentialGroupImplemenation().addBothContainerGaps();
		SequentialGroup group = agent.groupContent(new GroupCreatorAndElementAdder() {
			public SequentialGroup createGroup() {
				return new GroupLayout.SequentialGroup();
			}
			public void addElement(SequentialGroup group, Object element) {
				group.addComponent(element);
			}
		});
		assertEquals(2, group.getComponents().length);
		assertEquals(agent.precedingContainerGap.getContainerGap(), group.getComponents()[0]);
		assertEquals(agent.followingContainerGap.getContainerGap(), group.getComponents()[1]);
		
		// �������������� ���������� � ������ � � ����� ���������������� ������ �������� ������
		// � ���������� ���������� ������
		agent = new TopSequentialGroupAgent();
		agent.getFunctionsOnTopSequentialGroupImplemenation().addBothContainerGaps(10, 20);
		group = agent.groupContent(new GroupCreatorAndElementAdder() {
			public SequentialGroup createGroup() {
				return new GroupLayout.SequentialGroup();
			}
			public void addElement(SequentialGroup group, Object element) {
				group.addComponent(element);
			}
		});
		assertEquals(2, group.getComponents().length);
		assertEquals(agent.precedingContainerGap.getContainerGap(), group.getComponents()[0]);
		assertEquals(agent.followingContainerGap.getContainerGap(), group.getComponents()[1]);
	}
}

// TopParallelGroupAgent.java
package glengineer.agents;

import javax.swing.GroupLayout.ParallelGroup;
import glengineer.agents.setters.*;

/**
 * �����, �������������� ���������������� ������ �������� ������.
 * <p>
 * ��������� ��������� {@code FunctionsOnTopParallelGroup}
 * ���������� �������������� ������������ �����������
 * � ������ � � ����� ���������������� ������ �������� ������.
 */
public class TopParallelGroupAgent extends ParallelGroupAgent {

    /**
     * �����, �������������� ������������ ���������� � ������ ������.
     */
    private ContainerGapAgent precedingContainerGap;

    /**
     * �����, �������������� ������������ ���������� � ����� ������.
     */
    private ContainerGapAgent followingContainerGap;

    /**
     * ���������� �������������� ���������� � ����� ���������������� ������,
     * ��������, ���� ����, ������������ ���������� � ������ � � �����,
     * � ���������� ���������� ������.
     * <p>
     * ����������� ����� {@code TopParallelGroupAgent.groupContent()},
     * �������� ������ � ������������� ������������.
     *
     * @param creatorAndAdder	��������� ��� �������� �����
     * 							� ���������� � ��� �����������
     * @return					������, ������������ �� ���������������
     * 							�����������.
     */
    public ParallelGroup groupContent(GroupCreatorAndElementAdder creatorAndAdder);

    public FunctionsOnGroup getFunctionsOnGroupImplemenation();

    public FunctionsOnParallelGroup getFunctionsOnParallelGroupImplemenation();

    public FunctionsOnTopParallelGroup getFunctionsOnTopParallelGroupImplemenation();

    private class FunctionsOnTopParallelGroupImplemenation extends ParallelGroupAgent.FunctionsOnParallelGroupImplemenation implements FunctionsOnTopParallelGroup {

        /**
         * ��������� ������������ ����������
         * � ������ ���������������� ������ �������� ������.
         */
        public void addPrecedingContainerGap() {
            precedingContainerGap = new ContainerGapAgent();
        }

        /**
         * ��������� ������������ ���������� � ���������� ����������� �������
         * � ������ ���������������� ������ �������� ������.
         */
        public void addPrecedingContainerGap(int pref, int max) {
            precedingContainerGap = new ContainerGapAgent(pref, max);
        }

        /**
         * ��������� ������������ ����������
         * � ����� ���������������� ������ �������� ������.
         */
        public void addFollowingContainerGap() {
            followingContainerGap = new ContainerGapAgent();
        }

        /**
         * ��������� ������������ ���������� � ���������� ����������� �������
         * � ����� ���������������� ������ �������� ������.
         */
        public void addFollowingContainerGap(int pref, int max) {
            followingContainerGap = new ContainerGapAgent(pref, max);
        }

        public void addBothContainerGaps() {
            addPrecedingContainerGap();
            addFollowingContainerGap();
        }

        public void addBothContainerGaps(int pref, int max) {
            addPrecedingContainerGap(pref, max);
            addFollowingContainerGap(pref, max);
        }
    }
}

// TopParallelGroupAgentTest.java
package glengineer.agents;

import javax.swing.GroupLayout.ParallelGroup;
import glengineer.agents.setters.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TopParallelGroupAgent}.
* It contains ten unit test cases for the {@link TopParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
*/
class TopParallelGroupAgentTest {
		
	/**
	 * Test case for {@link TopParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * Tested method: {@link TopParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)}
	 * <p>
	 * Tested object: {@link TopParallelGroupAgent}
	 * <p>
	 * Tested conditions:
	 * <ul>
	 * <li>�������������� ���������� � ������ � � ����� ���������������� ������ �������� ������;
	 * <li>�������������� ���������� � ������ � � ����� ���������������� ������ �������� ������
	 * 		� ���������� ���������� ������.
	 * </ul>
	 * <p>
	 * Expected result:
	 * <ul>
	 * <li>�������������� ���������� � ������ � � ����� ���������������� ������ �������� ������;
	 * <li>�������������� ���������� � ������ � � ����� ���������������� ������ �������� ������
	 * 		� ���������� ���������� ������.
	 * </ul>
	 */
	@Test
	void testGroupContent() {
		// �������������� ���������� � ������ � � ����� ���������������� ������ �������� ������
		TopParallelGroupAgent agent = new TopParallelGroupAgent();
		agent.getFunctionsOnTopParallelGroupImplemenation().addBothContainerGaps();
		ParallelGroup group = agent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createGroup() {
				return new GroupLayout.ParallelGroup();
			}
			public void addElement(ParallelGroup group, Object element) {
				group.addComponent(element);
			}
		});
		assertEquals(2, group.getComponents().length);
		assertEquals(agent.precedingContainerGap.getContainerGap(), group.getComponents()[0]);
		assertEquals(agent.followingContainerGap.getContainerGap(), group.getComponents()[1]);
		
		// �������������� ���������� � ������ � � ����� ���������������� ������ �������� ������
		// � ���������� ���������� ������
		agent = new TopParallelGroupAgent();
		agent.getFunctionsOnTopParallelGroupImplemenation().addBothContainerGaps(10, 20);
		group = agent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createGroup() {
				return new GroupLayout.ParallelGroup();
			}
			public void addElement(ParallelGroup group, Object element) {
				group.addComponent(element);
			}
		});
		assertEquals(2, group.getComponents().length);
		assertEquals(agent.precedingContainerGap.getContainerGap(), group.getComponents()[0]);
		assertEquals(agent.followingContainerGap.getContainerGap(), group.getComponents()[1]);
	}
}

// BottomSequentialGroupAgent.java
package glengineer.agents;

import javax.swing.GroupLayout.SequentialGroup;
import glengineer.agents.setters.*;

/**
 * �����, �������������� ���������������� ������ �������� ������.
 * <p>
 * ��������� ��������� {@code FunctionsOnBottomSequentialGroup}
 * ���������� �������������� ������������ �����������
 * � ������ � � ����� ���������������� ������ �������� ������.
 */
public class BottomSequentialGroupAgent extends SequentialGroupAgent {

    /**
     * �����, �������������� ������������ ���������� � ������ ������.
     */
    private ContainerGapAgent precedingContainerGap;

    /**
     * �����, �������������� ������������ ���������� � ����� ������.
     */
    private ContainerGapAgent followingContainerGap;

    /**
     * ���������� �������������� ���������� � ����� ���������������� ������,
     * ��������, ���� ����, ������������ ���������� � ������ � � �����,
     * � ���������� ���������� ������.
     * <p>
     * ����������� ����� {@code BottomSequentialGroupAgent.groupContent()},
     * �������� ������ � ������������� ������������.
     *
     * @param creatorAndAdder	��������� ��� �������� �����
     * 							� ���������� � ��� �����������
     * @return					������, ������������ �� ���������������
     * 							�����������.
     */
    public SequentialGroup groupContent(GroupCreatorAndElementAdder creatorAndAdder);

    public FunctionsOnGroup getFunctionsOnGroupImplemenation();

    public FunctionsOnSequentialGroup getFunctionsOnSequentialGroupImplemenation();

    public FunctionsOnBottomSequentialGroup getFunctionsOnBottomSequentialGroupImplemenation();

    private class FunctionsOnBottomSequentialGroupImplemenation extends SequentialGroupAgent.FunctionsOnSequentialGroupImplemenation implements FunctionsOnBottomSequentialGroup {

        /**
         * ��������� ������������ ����������
         * � ������ ���������������� ������ �������� ������.
         */
        public void addPrecedingContainerGap() {
            precedingContainerGap = new ContainerGapAgent();
        }

        /**
         * ��������� ������������ ���������� � ���������� ����������� �������
         * � ������ ���������������� ������ �������� ������.
         */
        public void addPrecedingContainerGap(int pref, int max) {
            precedingContainerGap = new ContainerGapAgent(pref, max);
        }

        /**
         * ��������� ������������ ����������
         * � ����� ���������������� ������ �������� ������.
         */
        public void addFollowingContainerGap() {
            followingContainerGap = new ContainerGapAgent();
        }

        /**
         * ��������� ������������ ���������� � ���������� ����������� �������
         * � ����� ���������������� ������ �������� ������.
         */
        public void addFollowingContainerGap(int pref, int max) {
            followingContainerGap = new ContainerGapAgent(pref, max);
        }

        public void addBothContainerGaps() {
            addPrecedingContainerGap();
            addFollowingContainerGap();
        }

        public void addBothContainerGaps(int pref, int max) {
            addPrecedingContainerGap(pref, max);
            addFollowingContainerGap(pref, max);
        }
    }
}

// BottomSequentialGroupAgentTest.java
package glengineer.agents;

import javax.swing.GroupLayout.SequentialGroup;
import glengineer.agents.setters.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BottomSequentialGroupAgent}.
* It contains ten unit test cases for the {@link BottomSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
*/
class BottomSequentialGroupAgentTest {
		
	/**
	 * Test case for {@link BottomSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * <p>
	 * Tested method: {@link BottomSequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}
	 * <p>
	 * Tested object: {@link BottomSequentialGroupAgent}
	 * <p>
	 * Tested conditions:
	 * <ul>
	 * <li>�������������� ���������� � ������ � � ����� ���������������� ������ �������� ������;
	 * <li>�������������� ���������� � ������ � � ����� ���������������� ������ �������� ������
	 * 		� ���������� ���������� ������.
	 * </ul>
	 * <p>
	 * Expected result:
	 * <ul>
	 * <li>�������������� ���������� � ������ � � ����� ���������������� ������ �������� ������;
	 * <li>�������������� ���������� � ������ � � ����� ���������������� ������ �������� ������
	 * 		� ���������� ���������� ������.
	 * </ul>
	 */
	@Test
	void testGroupContent() {
		// �������������� ���������� � ������ � � ����� ���������������� ������ �������� ������
		BottomSequentialGroupAgent agent = new BottomSequentialGroupAgent();
		agent.getFunctionsOnBottomSequentialGroupImplemenation().addBothContainerGaps();
		SequentialGroup group = agent.groupContent(new GroupCreatorAndElementAdder() {
			public SequentialGroup createGroup() {
				return new GroupLayout.SequentialGroup();
			}
			public void addElement(SequentialGroup group, Object element) {
				group.addComponent(element);
			}
		});
		assertEquals(2, group.getComponents().length);
		assertEquals(agent.precedingContainerGap.getContainerGap(),