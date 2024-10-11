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
* It contains ten unit test cases for the {@link ParallelGroupAgent#containsGapsOnly()} method.
*/
class ParallelGroupAgentTest {

	@Test
	void testContainsGapsOnly_1() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		assertTrue(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_2() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new ComponentAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_3() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new ComponentAgent());
		agent.addChild(new GapAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_4() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new ComponentAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_5() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new ComponentAgent());
		agent.addChild(new ComponentAgent());
		agent.addChild(new GapAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_6() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new ComponentAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new ComponentAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_7() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new ComponentAgent());
		agent.addChild(new ComponentAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_8() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new ComponentAgent());
		agent.addChild(new ComponentAgent());
		agent.addChild(new ComponentAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_9() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new ComponentAgent());
		agent.addChild(new ComponentAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_10() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new ComponentAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new ComponentAgent());
		assertFalse(agent.containsGapsOnly());
	}
}

// ParallelGroupAgent.java
package glengineer.agents;

import glengineer.agents.setters.FunctionsOnGroup;
import glengineer.agents.setters.FunctionsOnParallelGroup;
import glengineer.agents.setters.FunctionsOnParallelGroupAndElement;
import glengineer.agents.settings.ParallelGroupSettings;
import java.util.Iterator;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;

/**
 * �����, �������������� ������������ ������.
 */
public class ParallelGroupAgent extends GroupAgent {

    public boolean containsGapsOnly() {
        for (Agent child : childrenAgents) if (!child.isGap())
            return false;
        return true;
    }
}

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
* It contains ten unit test cases for the {@link ParallelGroupAgent#containsGapsOnly()} method.
*/
class ParallelGroupAgentTest {
		
	@Test
	void testContainsGapsOnly_1() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		assertTrue(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_2() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new ComponentAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_3() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new ComponentAgent());
		agent.addChild(new GapAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_4() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new ComponentAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_5() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new ComponentAgent());
		agent.addChild(new ComponentAgent());
		agent.addChild(new GapAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_6() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new ComponentAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new ComponentAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_7() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new ComponentAgent());
		agent.addChild(new ComponentAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_8() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new ComponentAgent());
		agent.addChild(new ComponentAgent());
		agent.addChild(new ComponentAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_9() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new ComponentAgent());
		agent.addChild(new ComponentAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_10() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new ComponentAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new ComponentAgent());
		assertFalse(agent.containsGapsOnly());
	}
}

// ParallelGroupAgent.java
package glengineer.agents;

import glengineer.agents.setters.FunctionsOnGroup;
import glengineer.agents.setters.FunctionsOnParallelGroup;
import glengineer.agents.setters.FunctionsOnParallelGroupAndElement;
import glengineer.agents.settings.ParallelGroupSettings;
import java.util.Iterator;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;

/**
 * �����, �������������� ������������ ������.
 */
public class ParallelGroupAgent extends GroupAgent {

    public boolean containsGapsOnly() {
        for (Agent child : childrenAgents) if (!child.isGap())
            return false;
        return true;
    }
}

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
* It contains ten unit test cases for the {@link ParallelGroupAgent#containsGapsOnly()} method.
*/
class ParallelGroupAgentTest {
		
	@Test
	void testContainsGapsOnly_1() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		assertTrue(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_2() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new ComponentAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_3() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new ComponentAgent());
		agent.addChild(new GapAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_4() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new ComponentAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_5() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new ComponentAgent());
		agent.addChild(new ComponentAgent());
		agent.addChild(new GapAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_6() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new ComponentAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new ComponentAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_7() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new ComponentAgent());
		agent.addChild(new ComponentAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_8() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new ComponentAgent());
		agent.addChild(new ComponentAgent());
		agent.addChild(new ComponentAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_9() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new ComponentAgent());
		agent.addChild(new ComponentAgent());
		assertFalse(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_10() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new ComponentAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new ComponentAgent());
		assertFalse(agent.containsGapsOnly());
	}
}

// ParallelGroupAgent.java
package glengineer.agents;

import glengineer.agents.setters.FunctionsOnGroup;
import glengineer.agents.setters.FunctionsOnParallelGroup;
import glengineer.agents.setters.FunctionsOnParallelGroupAndElement;
import glengineer.agents.settings.ParallelGroupSettings;
import java.util.Iterator;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;

/**
 * �����, �������������� ������������ ������.
 */
public class ParallelGroupAgent extends GroupAgent {

    public boolean containsGapsOnly() {
        for (Agent child : childrenAgents) if (!child.isGap())
            return false;
        return true;
    }
}

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
* It contains ten unit test cases for the {@link ParallelGroupAgent#containsGapsOnly()} method.
*/
class ParallelGroupAgentTest {
		
	@Test
	void testContainsGapsOnly_1() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		agent.addChild(new GapAgent());
		assertTrue(agent.containsGapsOnly());
	}
	
	@Test
	void testContainsGapsOnly_2() {
		ParallelGroupAgent agent = new ParallelGroupAgent();
		agent.addChild(new GapAgent());
		agent.addChild