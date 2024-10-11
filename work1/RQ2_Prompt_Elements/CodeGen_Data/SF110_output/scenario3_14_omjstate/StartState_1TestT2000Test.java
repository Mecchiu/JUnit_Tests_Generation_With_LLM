// StartState_1Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains one unit test case for the {@link StartState#toObject()} method.
*/
class StartState_1Test {

	@Test
	void toObject() throws InstanceStoreException_1Test {
		
		//noinspection ResourceType
		assertEquals(0l, new StartState().toObject());
		
	}
	
	@Test
	void get_1Test() throws InstanceStoreException_1Test {
		
		//noinspection ResourceType
		assertEquals(0l, new StartState().get());
		
	}
	
	@Test
	void set_1Test() throws InstanceStoreException_1Test {
		
		//noinspection ResourceType
		assertEquals(0l, new StartState().set(10l));
		
	}
	
	@Test
	void isState_1Test() throws InstanceStoreException_1Test {
		
		//noinspection ResourceType
		assertTrue(new StartState().isState());
		
	}
	
	@Test
	void test1() throws InstanceStoreException_1Test {
	
		//noinspection ResourceType
		assertTrue(new StartState().test1());
		
	}
	
	@Test
	void test2() throws InstanceStoreException_1Test {
	
		//noinspection ResourceType
		assertTrue(new StartState().test2());
		
	}
}