// CheckIfLastCharIsALetterTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckIfLastCharIsALetter}.
* It contains one unit test case for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
*/
class CheckIfLastCharIsALetterTest {

    /**
     * Unit test of {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)}.
     */
    @Test
    public void testCheckIfLastCharIsALetter() {
	
	Boolean r = CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pie");

	assertTrue(r);
	
	Boolean r2 = CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e");

	assertTrue(r2);
	
	Boolean r3 = CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e");

	assertTrue(r3);
	
	Boolean r4 = CheckIfLastCharIsALetter.checkIfLastCharIsALetter("");

	assertFalse(r4);
	
	Boolean r5 = CheckIfLastCharIsALetter.checkIfLastCharIsALetter("xxx");

 	assertFalse(r5);

	assertTrue(r3);
	
	boolean b = r3.booleanValue();
	
	r = b;
	
	assertTrue(r);
	
	b = r2.booleanValue();
	
	r2 = b;
	
	assertTrue(r2);

	b = r3.booleanValue();
	
	r3 = b;
	
	assertTrue(r3);

	b = r4.booleanValue();
	
	r4 = b;
	
	assertTrue(r4);

	b = r5.booleanValue();
	
	r5 = b;
	
	assertTrue(r5);

	b = r5.booleanValue();
	
	b = r5.booleanValue();
	
	assertTrue(not r5);
	
	b = r5.booleanValue();
	
	assertFalse(r5);
	
	b = r5.booleanValue();

	b = r5.booleanValue();

	assertTrue(r.booleanValue());
	
	assertTrue(r2.booleanValue());
	
	assertTrue(r3.booleanValue());
	
	assertEquals (2, b.intValue());

    }
	
}
