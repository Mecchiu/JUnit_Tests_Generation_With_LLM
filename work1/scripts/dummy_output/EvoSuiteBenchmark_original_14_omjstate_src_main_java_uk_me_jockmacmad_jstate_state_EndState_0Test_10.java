// EndState_0Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains one unit test case for the {@link EndState#getSingleton()} method.
*/
class EndState_0Test {
		public static final String NAME = "com.objectmentors.state.EndState";

	@Test
	void equalsStringReflectionEquals() {
		EqualsBuilder equalsBuilder = new EqualsBuilder();
		String stringToTest = "Imeld";
		String stringToTest2 = "{Imeld";
		String stringToTest3 = "Object";
		EqualsBuilder aEqualsBuilder = new EqualsBuilder();
		aEqualsBuilder.append(stringToTest, stringToTest2);
		EqualsBuilder bEqualsBuilder = new EqualsBuilder();
		EqualsBuilder cEqualsBuilder = new EqualsBuilder();

		EqualsBuilder equalsBuilder2 = new EqualsBuilder();
		String stringToTest4 = "";
		String stringToTest5 = "Object";

		equalsBuilder2.append(stringToTest4);
		equalsBuilder2.append(stringToTest5);
		equalsBuilder2.append(stringToTest4);
		equalsBuilder2.append(stringToTest5);

		equalsBuilder.append(equalsBuilder2);

		equalsBuilder2.append(equalsBuilder);

		equalsBuilder2.append(equalsBuilder);

		EqualsBuilder equalsBuilder3 = new EqualsBuilder();
		String stringToTest6 = "";
		String stringToTest7 = "Object";
		EqualsBuilder equalBuilder = new EqualsBuilder();
		EqualEqualsBuilder equalEqualsBuilder = new EqualEqualsBuilder();

		equalBuilder.append(stringToTest6);
		equalBuilder.append(stringToTest7);
		equalBuilder.append(stringToTest6);
		equalBuilder.append(stringToTest7);

		equalBuilder.append(equalsBuilder2);

		equalBuilder.append(equalBuilder);

		equalsBuilder3.append(equalBuilder);

		equalsBuilder3.append(equalsBuilder);

		equalsBuilder3.append(equalsBuilder);

		EqualsBuilder equalsBuilder4 = new EqualsBuilder();
		String stringToTest8 = "";
		String stringToTest9 = "Object";

		equalsBuilder4.append(stringToTest8);
		equalsBuilder4.append(stringToTest9);

		equalsBuilder4.append(stringToTest8);

		equalsBuilder4.append(equalsBuilder);

		equalsBuilder4.append(equalsBuilder);

		assertEquals("Imeld", stringToTest);
		assertEquals("{Imeld", stringToTest);
		assertTrue(
				"Imeld".equals(equalsBuilder.toString())
				^"Imeld".equals(equalsBuilder2.toString()));
		assertNotEquals(
				"Imeld1",
				"Imeld2",
				"Imeld3");
		assertTrue(
				"Imeld"
				^equalsBuilder.toString()
				^equalsBuilder2.toString());

		assertTrue(equalsBuilder3.equals(equalEqualsBuilder));
		assertFalse(equalBuilder.equals(equalBuilder));
		assertFalse(equalBuilder.equals(equalBuilder4));

		assertTrue(equalsBuilder3.equals(equalBuilder));
		assertTrue(equalsBuilder4.equals(equalBuilder4));
	}
}