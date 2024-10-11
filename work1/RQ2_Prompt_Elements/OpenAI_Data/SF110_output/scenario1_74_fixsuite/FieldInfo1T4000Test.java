// FieldInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains ten unit test cases for the {@link FieldInfo#isValidValue(String)} method.
*/
class FieldInfoTest {

		@Test
		void testIsValidValue() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.validValues = new TreeMap<String, String>();
				fieldInfo.validValues.put("1", "Buy");
				fieldInfo.validValues.put("2", "Sell");
				fieldInfo.validValues.put("3", "Buy minus");
				fieldInfo.validValues.put("4", "Sell plus");
				fieldInfo.validValues.put("5", "Sell short");
				fieldInfo.validValues.put("6", "Sell short exempt");
				fieldInfo.validValues.put("7", "Undisclosed");
				fieldInfo.validValues.put("8", "Cross");
				fieldInfo.validValues.put("9", "Cross short");
				fieldInfo.validValues.put("A", "Cross short exempt");
				fieldInfo.validValues.put("B", "As Defined");
				fieldInfo.validValues.put("C", "Opposite");
				fieldInfo.validValues.put("D", "Subscribe");
				fieldInfo.validValues.put("E", "Redeem");
				fieldInfo.validValues.put("F", "Lend");
				fieldInfo.validValues.put("G", "Borrow");
				
				assertTrue(fieldInfo.isValidValue("1"));
				assertTrue(fieldInfo.isValidValue("2"));
				assertTrue(fieldInfo.isValidValue("3"));
				assertTrue(fieldInfo.isValidValue("4"));
				assertTrue(fieldInfo.isValidValue("5"));
				assertTrue(fieldInfo.isValidValue("6"));
				assertTrue(fieldInfo.isValidValue("7"));
				assertTrue(fieldInfo.isValidValue("8"));
				assertTrue(fieldInfo.isValidValue("9"));
				assertTrue(fieldInfo.isValidValue("A"));
				assertTrue(fieldInfo.isValidValue("B"));
				assertTrue(fieldInfo.isValidValue("C"));
				assertTrue(fieldInfo.isValidValue("D"));
				assertTrue(fieldInfo.isValidValue("E"));
				assertTrue(fieldInfo.isValidValue("F"));
				assertTrue(fieldInfo.isValidValue("G"));
				
				assertFalse(fieldInfo.isValidValue("H"));
				assertFalse(fieldInfo.isValidValue("I"));
				assertFalse(fieldInfo.isValidValue("J"));
				assertFalse(fieldInfo.isValidValue("K"));
				assertFalse(fieldInfo.isValidValue("L"));
				assertFalse(fieldInfo.isValidValue("M"));
				assertFalse(fieldInfo.isValidValue("N"));
				assertFalse(fieldInfo.isValidValue("O"));
				assertFalse(fieldInfo.isValidValue("P"));
				assertFalse(fieldInfo.isValidValue("Q"));
				assertFalse(fieldInfo.isValidValue("R"));
				assertFalse(fieldInfo.isValidValue("S"));
				assertFalse(fieldInfo.isValidValue("T"));
				assertFalse(fieldInfo.isValidValue("U"));
				assertFalse(fieldInfo.isValidValue("V"));
				assertFalse(fieldInfo.isValidValue("W"));
				assertFalse(fieldInfo.isValidValue("X"));
				assertFalse(fieldInfo.isValidValue("Y"));
				assertFalse(fieldInfo.isValidValue("Z"));
				assertFalse(fieldInfo.isValidValue("0"));
				assertFalse(fieldInfo.isValidValue("-1"));
				assertFalse(fieldInfo.isValidValue(""));
				assertFalse(fieldInfo.isValidValue(" "));
				assertFalse(fieldInfo.isValidValue("Buy"));
				assertFalse(fieldInfo.isValidValue("Sell"));
				assertFalse(fieldInfo.isValidValue("Buy minus"));
				assertFalse(fieldInfo.isValidValue("Sell plus"));
				assertFalse(fieldInfo.isValidValue("Sell short"));
				assertFalse(fieldInfo.isValidValue("Sell short exempt"));
				assertFalse(fieldInfo.isValidValue("Undisclosed"));
				assertFalse(fieldInfo.isValidValue("Cross"));
				assertFalse(fieldInfo.isValidValue("Cross short"));
				assertFalse(fieldInfo.isValidValue("Cross short exempt"));
				assertFalse(fieldInfo.isValidValue("As Defined"));
				assertFalse(fieldInfo.isValidValue("Opposite"));
				assertFalse(fieldInfo.isValidValue("Subscribe"));
				assertFalse(fieldInfo.isValidValue("Redeem"));
				assertFalse(fieldInfo.isValidValue("Lend"));
				assertFalse(fieldInfo.isValidValue("Borrow"));
		}
}

// FieldInfo.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a Field as defined by the FIX specification.
 *
 * @author jramoyo
 */
public class FieldInfo implements FixInfo {

    public boolean isValidValue(String value) {
        return validValues.keySet().contains(value);
    }
}

// FieldInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains ten unit test cases for the {@link FieldInfo#isValidValue(String)} method.
*/
class FieldInfoTest {
		
		@Test
		void testIsValidValue() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.validValues = new TreeMap<String, String>();
				fieldInfo.validValues.put("1", "Buy");
				fieldInfo.validValues.put("2", "Sell");
				fieldInfo.validValues.put("3", "Buy minus");
				fieldInfo.validValues.put("4", "Sell plus");
				fieldInfo.validValues.put("5", "Sell short");
				fieldInfo.validValues.put("6", "Sell short exempt");
				fieldInfo.validValues.put("7", "Undisclosed");
				fieldInfo.validValues.put("8", "Cross");
				fieldInfo.validValues.put("9", "Cross short");
				fieldInfo.validValues.put("A", "Cross short exempt");
				fieldInfo.validValues.put("B", "As Defined");
				fieldInfo.validValues.put("C", "Opposite");
				fieldInfo.validValues.put("D", "Subscribe");
				fieldInfo.validValues.put("E", "Redeem");
				fieldInfo.validValues.put("F", "Lend");
				fieldInfo.validValues.put("G", "Borrow");
				
				assertTrue(fieldInfo.isValidValue("1"));
				assertTrue(fieldInfo.isValidValue("2"));
				assertTrue(fieldInfo.isValidValue("3"));
				assertTrue(fieldInfo.isValidValue("4"));
				assertTrue(fieldInfo.isValidValue("5"));
				assertTrue(fieldInfo.isValidValue("6"));
				assertTrue(fieldInfo.isValidValue("7"));
				assertTrue(fieldInfo.isValidValue("8"));
				assertTrue(fieldInfo.isValidValue("9"));
				assertTrue(fieldInfo.isValidValue("A"));
				assertTrue(fieldInfo.isValidValue("B"));
				assertTrue(fieldInfo.isValidValue("C"));
				assertTrue(fieldInfo.isValidValue("D"));
				assertTrue(fieldInfo.isValidValue("E"));
				assertTrue(fieldInfo.isValidValue("F"));
				assertTrue(fieldInfo.isValidValue("G"));
				
				assertFalse(fieldInfo.isValidValue("H"));
				assertFalse(fieldInfo.isValidValue("I"));
				assertFalse(fieldInfo.isValidValue("J"));
				assertFalse(fieldInfo.isValidValue("K"));
				assertFalse(fieldInfo.isValidValue("L"));
				assertFalse(fieldInfo.isValidValue("M"));
				assertFalse(fieldInfo.isValidValue("N"));
				assertFalse(fieldInfo.isValidValue("O"));
				assertFalse(fieldInfo.isValidValue("P"));
				assertFalse(fieldInfo.isValidValue("Q"));
				assertFalse(fieldInfo.isValidValue("R"));
				assertFalse(fieldInfo.isValidValue("S"));
				assertFalse(fieldInfo.isValidValue("T"));
				assertFalse(fieldInfo.isValidValue("U"));
				assertFalse(fieldInfo.isValidValue("V"));
				assertFalse(fieldInfo.isValidValue("W"));
				assertFalse(fieldInfo.isValidValue("X"));
				assertFalse(fieldInfo.isValidValue("Y"));
				assertFalse(fieldInfo.isValidValue("Z"));
				assertFalse(fieldInfo.isValidValue("0"));
				assertFalse(fieldInfo.isValidValue("-1"));
				assertFalse(fieldInfo.isValidValue(""));
				assertFalse(fieldInfo.isValidValue(" "));
				assertFalse(fieldInfo.isValidValue("Buy"));
				assertFalse(fieldInfo.isValidValue("Sell"));
				assertFalse(fieldInfo.isValidValue("Buy minus"));
				assertFalse(fieldInfo.isValidValue("Sell plus"));
				assertFalse(fieldInfo.isValidValue("Sell short"));
				assertFalse(fieldInfo.isValidValue("Sell short exempt"));
				assertFalse(fieldInfo.isValidValue("Undisclosed"));
				assertFalse(fieldInfo.isValidValue("Cross"));
				assertFalse(fieldInfo.isValidValue("Cross short"));
				assertFalse(fieldInfo.isValidValue("Cross short exempt"));
				assertFalse(fieldInfo.isValidValue("As Defined"));
				assertFalse(fieldInfo.isValidValue("Opposite"));
				assertFalse(fieldInfo.isValidValue("Subscribe"));
				assertFalse(fieldInfo.isValidValue("Redeem"));
				assertFalse(fieldInfo.isValidValue("Lend"));
				assertFalse(fieldInfo.isValidValue("Borrow"));
		}
}

// FieldInfo.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a Field as defined by the FIX specification.
 *
 * @author jramoyo
 */
public class FieldInfo implements FixInfo {

    public boolean isValidValue(String value) {
        return validValues.keySet().contains(value);
    }
}

// FieldInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains ten unit test cases for the {@link FieldInfo#isValidValue(String)} method.
*/
class FieldInfoTest {
		
		@Test
		void testIsValidValue() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.validValues = new TreeMap<String, String>();
				fieldInfo.validValues.put("1", "Buy");
				fieldInfo.validValues.put("2", "Sell");
				fieldInfo.validValues.put("3", "Buy minus");
				fieldInfo.validValues.put("4", "Sell plus");
				fieldInfo.validValues.put("5", "Sell short");
				fieldInfo.validValues.put("6", "Sell short exempt");
				fieldInfo.validValues.put("7", "Undisclosed");
				fieldInfo.validValues.put("8", "Cross");
				fieldInfo.validValues.put("9", "Cross short");
				fieldInfo.validValues.put("A", "Cross short exempt");
				fieldInfo.validValues.put("B", "As Defined");
				fieldInfo.validValues.put("C", "Opposite");
				fieldInfo.validValues.put("D", "Subscribe");
				fieldInfo.validValues.put("E", "Redeem");
				fieldInfo.validValues.put("F", "Lend");
				fieldInfo.validValues.put("G", "Borrow");
				
				assertTrue(fieldInfo.isValidValue("1"));
				assertTrue(fieldInfo.isValidValue("2"));
				assertTrue(fieldInfo.isValidValue("3"));
				assertTrue(fieldInfo.isValidValue("4"));
				assertTrue(fieldInfo.isValidValue("5"));
				assertTrue(fieldInfo.isValidValue("6"));
				assertTrue(fieldInfo.isValidValue("7"));
				assertTrue(fieldInfo.isValidValue("8"));
				assertTrue(fieldInfo.isValidValue("9"));
				assertTrue(fieldInfo.isValidValue("A"));
				assertTrue(fieldInfo.isValidValue("B"));
				assertTrue(fieldInfo.isValidValue("C"));
				assertTrue(fieldInfo.isValidValue("D"));
				assertTrue(fieldInfo.isValidValue("E"));
				assertTrue(fieldInfo.isValidValue("F"));
				assertTrue(fieldInfo.isValidValue("G"));
				
				assertFalse(fieldInfo.isValidValue("H"));
				assertFalse(fieldInfo.isValidValue("I"));
				assertFalse(fieldInfo.isValidValue("J"));
				assertFalse(fieldInfo.isValidValue("K"));
				assertFalse(fieldInfo.isValidValue("L"));
				assertFalse