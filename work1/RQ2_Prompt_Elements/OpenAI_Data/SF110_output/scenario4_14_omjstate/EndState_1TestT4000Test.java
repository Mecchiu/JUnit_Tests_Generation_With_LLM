// EndState_1Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#toObject()} method.
*/
class EndState_1Test {

	/**
	* Test case for {@link EndState#toObject()}.
	*/
	@Test
	void testToObject() {
		EndState endState = EndState.getSingleton();
		Object object = endState.toObject();
		assertEquals(endState, object);
	}
}

// EndState_2Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#getName()} method.
*/
class EndState_2Test {
		
	/**
	* Test case for {@link EndState#getName()}.
	*/
	@Test
	void testGetName() {
		EndState endState = EndState.getSingleton();
		String name = endState.getName();
		assertEquals("com.objectmentors.state.EndState", name);
	}
}

// EndState_3Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#equals(Object)} method.
*/
class EndState_3Test {
		
	/**
	* Test case for {@link EndState#equals(Object)}.
	*/
	@Test
	void testEquals() {
		EndState endState = EndState.getSingleton();
		EndState endState2 = EndState.getSingleton();
		boolean equals = endState.equals(endState2);
		assertTrue(equals);
	}
}

// EndState_4Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#hashCode()} method.
*/
class EndState_4Test {
		
	/**
	* Test case for {@link EndState#hashCode()}.
	*/
	@Test
	void testHashCode() {
		EndState endState = EndState.getSingleton();
		int hashCode = endState.hashCode();
		assertEquals(hashCode, endState.hashCode());
	}
}

// EndState_5Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#getSingleton()} method.
*/
class EndState_5Test {
		
	/**
	* Test case for {@link EndState#getSingleton()}.
	*/
	@Test
	void testGetSingleton() {
		EndState endState = EndState.getSingleton();
		assertNotNull(endState);
	}
}

// EndState_6Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#EndState()} method.
*/
class EndState_6Test {
		
	/**
	* Test case for {@link EndState#EndState()}.
	*/
	@Test
	void testEndState() {
		EndState endState = EndState.getSingleton();
		assertNotNull(endState);
	}
}

// EndState_7Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#EndState()} method.
*/
class EndState_7Test {
		
	/**
	* Test case for {@link EndState#EndState()}.
	*/
	@Test
	void testEndState() {
		EndState endState = EndState.getSingleton();
		assertNotNull(endState);
	}
}

// EndState_8Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#EndState()} method.
*/
class EndState_8Test {
		
	/**
	* Test case for {@link EndState#EndState()}.
	*/
	@Test
	void testEndState() {
		EndState endState = EndState.getSingleton();
		assertNotNull(endState);
	}
}

// EndState_9Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#EndState()} method.
*/
class EndState_9Test {
		
	/**
	* Test case for {@link EndState#EndState()}.
	*/
	@Test
	void testEndState() {
		EndState endState = EndState.getSingleton();
		assertNotNull(endState);
	}
}

// EndState_10Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#EndState()} method.
*/
class EndState_10Test {
		
	/**
	* Test case for {@link EndState#EndState()}.
	*/
	@Test
	void testEndState() {
		EndState endState = EndState.getSingleton();
		assertNotNull(endState);
	}
}

// EndState_11Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#EndState()} method.
*/
class EndState_11Test {
		
	/**
	* Test case for {@link EndState#EndState()}.
	*/
	@Test
	void testEndState() {
		EndState endState = EndState.getSingleton();
		assertNotNull(endState);
	}
}

// EndState_12Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#EndState()} method.
*/
class EndState_12Test {
		
	/**
	* Test case for {@link EndState#EndState()}.
	*/
	@Test
	void testEndState() {
		EndState endState = EndState.getSingleton();
		assertNotNull(endState);
	}
}

// EndState_13Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#EndState()} method.
*/
class EndState_13Test {
		
	/**
	* Test case for {@link EndState#EndState()}.
	*/
	@Test
	void testEndState() {
		EndState endState = EndState.getSingleton();
		assertNotNull(endState);
	}
}

// EndState_14Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#EndState()} method.
*/
class EndState_14Test {
		
	/**
	* Test case for {@link EndState#EndState()}.
	*/
	@Test
	void testEndState() {
		EndState endState = EndState.getSingleton();
		assertNotNull(endState);
	}
}

// EndState_15Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#EndState()} method.
*/
class EndState_15Test {
		
	/**
	* Test case for {@link EndState#EndState()}.
	*/
	@Test
	void testEndState() {
		EndState endState = EndState.getSingleton();
		assertNotNull(endState);
	}
}

// EndState_16Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#EndState()} method.
*/
class EndState_16Test {
		
	/**
	* Test case for {@link EndState#EndState()}.
	*/
	@Test
	void testEndState() {
		EndState endState = EndState.getSingleton();
		assertNotNull(endState);
	}
}

// EndState_17Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#EndState()} method.
*/
class EndState_17Test {
		
	/**
	* Test case for {@link EndState#EndState()}.
	*/
	@Test
	void testEndState() {
		EndState endState = EndState.getSingleton();
		assertNotNull(endState);
	}
}

// EndState_18Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#EndState()} method.
*/
class EndState_18Test {
		
	/**
	* Test case for {@link EndState#EndState()}.
	*/
	@Test
	void testEndState() {
		EndState endState = EndState.getSingleton();
		assertNotNull(endState);
	}
}

// EndState_19Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#EndState()} method.
*/
class EndState_19Test {
		
	/**
	* Test case for {@link EndState#EndState()}.
	*/
	@Test
	void testEndState() {
		EndState endState = EndState.getSingleton();
		assertNotNull(endState);
	}
}

// EndState_20Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for