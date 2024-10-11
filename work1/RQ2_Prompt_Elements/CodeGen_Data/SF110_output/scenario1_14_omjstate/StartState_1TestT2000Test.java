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
	public void testEquals() {
		assertTrue( new java.util.Date().equals( new java.util.Date() ) );
		assertTrue( new java.util.Date().equals( "hello" ) );
		assertFalse( new java.util.Date().equals( new java.sql.Timestamp( 0 ) ) );
		assertFalse( new java.util.Date().equals( new java.util.Timestamp( 0 ) ) );
	}

    @Test
	public void testHashCode() {
		assertTrue( new java.util.Date().equals( new java.util.Date() ) );
		assertTrue( new java.util.Date().equals( "hello" ) );
		assertTrue( new java.util.Date().equals( new java.sql.Timestamp( 0 ) ) );
		assertTrue( new java.util.Date().equals( new java.util.Timestamp( 0 ) ) );
	}

	@Test
	public void testToString() {
		assertEquals( new java.util.Date().toString(), new java.util.Date().toString() );
		assertEquals( new java.util.Date().toString(), "hello" );
	}
}
