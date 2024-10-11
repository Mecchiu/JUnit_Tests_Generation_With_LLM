// EndState_1Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains one unit test case for the {@link EndState#toObject()} method.
*/
class EndState_1Test {
		
	/**
	* Check that a copy of an instance of {@link jstate.patterns.ISingleton}
	* from a standard state object is the same object as the
	* <code>toObject()</code> of this object.
	*/
	@Test
	void toObjectTest()
	{
		final StartState ss = new EndState();
		final AbstractState sa = new AbstractState();
		assertTrue(EqualsBuilder.reflectionEquals(ss, sa));
	}

	/**
	* @return java.lang.Object
	* Checks a set of assertions for the same object, if the
	* set of objects obtained in {@link #toObjectTest()} are equivalent.
	*/
	@Test
	public void toObject()
	{
		final IState si;
		final AbstractState as;
		si = getSingleton();
		assertSame(si, si.toObject());
		si = new EndState();
		as = si.toObject();
		assertNotSame(si.toObject(), as.toObject());
		assertNotSame(si.toObject(), si.toObject(as));
		si = new EndState(NAME);
		assertNotSame(si.toObject(), si.toObject(as));
		si = new EndState();
		assertEquals(si.toObject(), si.toObject(as));
		assertNotSame(si.toObject(), si.toObject(as.toObject()));
		si = new EndState();
		as = si.toObject(es.getContext());
		assertNotSame(si.toObject(), si.toObject(as));
	}
}