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
	* Tested method: {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}.
	* <p>
	* Check that the method returns the same sequential group that was passed to it.
	*/
	@Test
	void testGroupContent_1() {
		SequentialGroupAgent agent = new SequentialGroupAgent() {
			public SequentialGroup groupContent(GroupCreatorAndElementAdder creatorAndAdder) {
				return creatorAndAdder.getSequentialGroup();
			}
		};
		SequentialGroup group = new SequentialGroup();
		assertSame(group, agent.groupContent(new GroupCreatorAndElementAdder(group)));
	}
	
	/**
	* Test case #2.
	* <p>
	* Tested method: {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}.
	* <p>
	* Check that the method returns the same sequential group that was passed to it.
	*/
	@Test
	void testGroupContent_2() {
		SequentialGroupAgent agent = new SequentialGroupAgent() {
			public SequentialGroup groupContent(GroupCreatorAndElementAdder creatorAndAdder) {
				return creatorAndAdder.getSequentialGroup();
			}
		};
		SequentialGroup group = new SequentialGroup();
		assertSame(group, agent.groupContent(new GroupCreatorAndElementAdder(group)));
	}
	
	/**
	* Test case #3.
	* <p>
	* Tested method: {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}.
	* <p>
	* Check that the method returns the same sequential group that was passed to it.
	*/
	@Test
	void testGroupContent_3() {
		SequentialGroupAgent agent = new SequentialGroupAgent() {
			public SequentialGroup groupContent(GroupCreatorAndElementAdder creatorAndAdder) {
				return creatorAndAdder.getSequentialGroup();
			}
		};
		SequentialGroup group = new SequentialGroup();
		assertSame(group, agent.groupContent(new GroupCreatorAndElementAdder(group)));
	}
	
	/**
	* Test case #4.
	* <p>
	* Tested method: {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}.
	* <p>
	* Check that the method returns the same sequential group that was passed to it.
	*/
	@Test
	void testGroupContent_4() {
		SequentialGroupAgent agent = new SequentialGroupAgent() {
			public SequentialGroup groupContent(GroupCreatorAndElementAdder creatorAndAdder) {
				return creatorAndAdder.getSequentialGroup();
			}
		};
		SequentialGroup group = new SequentialGroup();
		assertSame(group, agent.groupContent(new GroupCreatorAndElementAdder(group)));
	}
	
	/**
	* Test case #5.
	* <p>
	* Tested method: {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}.
	* <p>
	* Check that the method returns the same sequential group that was passed to it.
	*/
	@Test
	void testGroupContent_5() {
		SequentialGroupAgent agent = new SequentialGroupAgent() {
			public SequentialGroup groupContent(GroupCreatorAndElementAdder creatorAndAdder) {
				return creatorAndAdder.getSequentialGroup();
			}
		};
		SequentialGroup group = new SequentialGroup();
		assertSame(group, agent.groupContent(new GroupCreatorAndElementAdder(group)));
	}
	
	/**
	* Test case #6.
	* <p>
	* Tested method: {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}.
	* <p>
	* Check that the method returns the same sequential group that was passed to it.
	*/
	@Test
	void testGroupContent_6() {
		SequentialGroupAgent agent = new SequentialGroupAgent() {
			public SequentialGroup groupContent(GroupCreatorAndElementAdder creatorAndAdder) {
				return creatorAndAdder.getSequentialGroup();
			}
		};
		SequentialGroup group = new SequentialGroup();
		assertSame(group, agent.groupContent(new GroupCreatorAndElementAdder(group)));
	}
	
	/**
	* Test case #7.
	* <p>
	* Tested method: {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}.
	* <p>
	* Check that the method returns the same sequential group that was passed to it.
	*/
	@Test
	void testGroupContent_7() {
		SequentialGroupAgent agent = new SequentialGroupAgent() {
			public SequentialGroup groupContent(GroupCreatorAndElementAdder creatorAndAdder) {
				return creatorAndAdder.getSequentialGroup();
			}
		};
		SequentialGroup group = new SequentialGroup();
		assertSame(group, agent.groupContent(new GroupCreatorAndElementAdder(group)));
	}
	
	/**
	* Test case #8.
	* <p>
	* Tested method: {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}.
	* <p>
	* Check that the method returns the same sequential group that was passed to it.
	*/
	@Test
	void testGroupContent_8() {
		SequentialGroupAgent agent = new SequentialGroupAgent() {
			public SequentialGroup groupContent(GroupCreatorAndElementAdder creatorAndAdder) {
				return creatorAndAdder.getSequentialGroup();
			}
		};
		SequentialGroup group = new SequentialGroup();
		assertSame(group, agent.groupContent(new GroupCreatorAndElementAdder(group)));
	}
	
	/**
	* Test case #9.
	* <p>
	* Tested method: {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}.
	* <p>
	* Check that the method returns the same sequential group that was passed to it.
	*/
	@Test
	void testGroupContent_9() {
		SequentialGroupAgent agent = new SequentialGroupAgent() {
			public SequentialGroup groupContent(GroupCreatorAndElementAdder creatorAndAdder) {
				return creatorAndAdder.getSequentialGroup();
			}
		};
		SequentialGroup group = new SequentialGroup();
		assertSame(group, agent.groupContent(new GroupCreatorAndElementAdder(group)));
	}
	
	/**
	* Test case #10.
	* <p>
	* Tested method: {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}.
	* <p>
	* Check that the method returns the same sequential group that was passed to it.
	*/
	@Test
	void testGroupContent_10() {
		SequentialGroupAgent agent = new SequentialGroupAgent() {
			public SequentialGroup groupContent(GroupCreatorAndElementAdder creatorAndAdder) {
				return creatorAndAdder.getSequentialGroup();
			}
		};
		SequentialGroup group = new SequentialGroup();
		assertSame(group, agent.groupContent(new GroupCreatorAndElementAdder(group)));
	}
}

// SequentialGroupAgent.java
package glengineer.agents;

import java.util.ListIterator;
import glengineer.agents.setters.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.GroupLayout.*;

/**
 * �����, �������������� ���������������� ������.
 */
public class SequentialGroupAgent extends GroupAgent {

    /**
     * ���������� �������������� ���������� � ����� ���������������� ������
     * � ���������� �.
     *
     * @param creatorAndAdder	��������� ��� �������� �����
     * 							� ���������� � ��� �����������
     * @return					������, ������������ �� ���������������
     * 							�����������.
     */
    public SequentialGroup groupContent(GroupCreatorAndElementAdder creatorAndAdder);

    public FunctionsOnGroup getFunctionsOnGroupImplemenation();

    public FunctionsOnSequentialGroup getFunctionsOnSequentialGroupImplemenation();

    protected class FunctionsOnSequentialGroupImplemenation implements FunctionsOnSequentialGroup {

        public FunctionsOnSequentialGroupAndElement getComponent(String name) {
            return new FunctionsOnSequentialGroupAndElementImplementation(SequentialGroupAgent.this, SequentialGroupAgent.this.getComponent(name));
        }

        public FunctionsOnSequentialGroupAndElement getGroup(String firstName, String lastName) {
            return new FunctionsOnSequentialGroupAndElementImplementation(SequentialGroupAgent.this, SequentialGroupAgent.this.getGroup(firstName, lastName));
        }
    }

    private static class FunctionsOnSequentialGroupAndElementImplementation extends GroupAgent.FunctionsOnGroupAndElementImplementation implements FunctionsOnSequentialGroupAndElement {

        public FunctionsOnSequentialGroupAndElementImplementation(GroupAgent parent, Agent element) {
            super(parent, element);
        }

        private SequentialGroupAgent getParentGroupAgent() {
            return (SequentialGroupAgent) parentGroupAgent;
        }

        /**
         * ��������� ����� ��������� ������������ ������
         *  "���������" ����������.
         */
        public void addPrecedingRelatedGap() {
            addPrecedingRelatedGap(GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE);
        }

        /**
         * ��������� ����� ��������� ������������ ������
         *  "�����������" ����������.
         */
        public void addPrecedingUnrelatedGap() {
            addPrecedingUnrelatedGap(GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE);
        }

        /**
         * ��������� ����� �������� ������������ ������
         *  "���������" ����������.
         */
        public void addFollowingRelatedGap() {
            addFollowingRelatedGap(GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE);
        }

        /**
         * ��������� ����� �������� ������������ ������
         *  "�����������" ����������.
         */
        public void addFollowingUnrelatedGap() {
            addFollowingUnrelatedGap(GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE);
        }

        /**
         * ��������� � ������������ ������ ����� � ���������
         *  "���������" ���������� � ������������� ���������� ��� ����
         *  �������������� � ������������ �������.
         */
        public void addPrecedingRelatedGap(int pref, int max) {
            getParentGroupAgent().addPreferredGapBefore(new PreferredGapAgent(LayoutStyle.ComponentPlacement.RELATED, pref, max), elementAgent);
        }

        /**
         * ��������� � ������������ ������ ����� � ���������
         *  "�����������" ���������� � ������������� ���������� ��� ����
         *  �������������� � ������������ �������.
         */
        public void addPrecedingUnrelatedGap(int pref, int max) {
            getParentGroupAgent().addPreferredGapBefore(new PreferredGapAgent(LayoutStyle.ComponentPlacement.UNRELATED, pref, max), elementAgent);
        }

        /**
         * ��������� � ������������ ������ ����� � ��������
         *  "���������" ���������� � ������������� ���������� ��� ����
         *  �������������� � ������������ �������.
         */
        public void addFollowingRelatedGap(int pref, int max) {
            getParentGroupAgent().addPreferredGapAfter(new PreferredGapAgent(LayoutStyle.ComponentPlacement.RELATED, pref, max), elementAgent);
        }

        /**
         * ��������� � ������������ ������ ����� � ��������
         *  "�����������" ���������� � ������������� ���������� ��� ����
         *  �������������� � ������������ �������.
         */
        public void addFollowingUnrelatedGap(int pref, int max) {
            getParentGroupAgent().addPreferredGapAfter(new PreferredGapAgent(LayoutStyle.ComponentPlacement.UNRELATED, pref, max), elementAgent);
        }
    }

    /**
     * Finds the specified element in the list of
     * this sequential group's children and inserts
     * the specified preferred gap into that list before that element.
     */
    public void addPreferredGapBefore(PreferredGapAgent gap, Agent element);

    /**
     * Finds the specified element in the list of
     * this sequential group's children and inserts
     * the specified preferred gap into that list after that element.
     */
    public void addPreferredGapAfter(PreferredGapAgent gap, Agent element);

    public String toString();
}

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
	* Tested method: {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}.
	* <p>
	* Check that the method returns the same sequential group that was passed to it.
	*/
	@Test
	void testGroupContent_1() {
		SequentialGroupAgent agent = new SequentialGroupAgent() {
			public SequentialGroup groupContent(GroupCreatorAndElementAdder creatorAndAdder) {
				return creatorAndAdder.getSequentialGroup();
			}
		};
		SequentialGroup group = new SequentialGroup();
		assertSame(group, agent.groupContent(new GroupCreatorAndElementAdder(group)));
	}
	
	/**
	* Test case #2.
	* <p>
	* Tested method: {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}.
	* <p>
	* Check that the method returns the same sequential group that was passed to it.
	*/
	@Test
	void testGroupContent_2() {
		SequentialGroupAgent agent = new SequentialGroupAgent() {
			public SequentialGroup groupContent(GroupCreatorAndElementAdder creatorAndAdder) {
				return creatorAndAdder.getSequentialGroup();
			}
		};
		SequentialGroup group = new SequentialGroup();
		assertSame(group, agent.groupContent(new GroupCreatorAndElementAdder(group)));
	}
	
	/**
	* Test case #3.
	* <p>
	* Tested method: {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)}.
	* <p>
	* Check that the method returns the same sequential group that was passed to it.
	*/
	@Test
	void testGroupContent_3() {
		SequentialGroupAgent agent = new SequentialGroupAgent() {
			public SequentialGroup groupContent(GroupCreatorAndElementAdder creatorAndAdder) {
				return creatorAndAdder.getSequentialGroup();
			}
