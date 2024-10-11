// FieldInfo_1Test.java
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
class FieldInfo_1Test {

	/**
	 * Test case 1:
	 * 
	 * <pre>
	 * 		FieldInfo fieldInfo = new FieldInfo();
	 * 		fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
	 * 		fieldInfo.getValidValuesMap().put("1", new ValueInfo("1", "Value 1"));
	 * 		fieldInfo.getValidValuesMap().put("2", new ValueInfo("2", "Value 2"));
	 * 		fieldInfo.getValidValuesMap().put("3", new ValueInfo("3", "Value 3"));
	 * 		fieldInfo.getValidValuesMap().put("4", new ValueInfo("4", "Value 4"));
	 * 		fieldInfo.getValidValuesMap().put("5", new ValueInfo("5", "Value 5"));
	 * 		fieldInfo.getValidValuesMap().put("6", new ValueInfo("6", "Value 6"));
	 * 		fieldInfo.getValidValuesMap().put("7", new ValueInfo("7", "Value 7"));
	 * 		fieldInfo.getValidValuesMap().put("8", new ValueInfo("8", "Value 8"));
	 * 		fieldInfo.getValidValuesMap().put("9", new ValueInfo("9", "Value 9"));
	 * 		fieldInfo.getValidValuesMap().put("10", new ValueInfo("10", "Value 10"));
	 * 		fieldInfo.getValidValuesMap().put("11", new ValueInfo("11", "Value 11"));
	 * 		fieldInfo.getValidValuesMap().put("12", new ValueInfo("12", "Value 12"));
	 * 		fieldInfo.getValidValuesMap().put("13", new ValueInfo("13", "Value 13"));
	 * 		fieldInfo.getValidValuesMap().put("14", new ValueInfo("14", "Value 14"));
	 * 		fieldInfo.getValidValuesMap().put("15", new ValueInfo("15", "Value 15"));
	 * 		fieldInfo.getValidValuesMap().put("16", new ValueInfo("16", "Value 16"));
	 * 		fieldInfo.getValidValuesMap().put("17", new ValueInfo("17", "Value 17"));
	 * 		fieldInfo.getValidValuesMap().put("18", new ValueInfo("18", "Value 18"));
	 * 		fieldInfo.getValidValuesMap().put("19", new ValueInfo("19", "Value 19"));
	 * 		fieldInfo.getValidValuesMap().put("20", new ValueInfo("20", "Value 20"));
	 * 		fieldInfo.getValidValuesMap().put("21", new ValueInfo("21", "Value 21"));
	 * 		fieldInfo.getValidValuesMap().put("22", new ValueInfo("22", "Value 22"));
	 * 		fieldInfo.getValidValuesMap().put("23", new ValueInfo("23", "Value 23"));
	 * 		fieldInfo.getValidValuesMap().put("24", new ValueInfo("24", "Value 24"));
	 * 		fieldInfo.getValidValuesMap().put("25", new ValueInfo("25", "Value 25"));
	 * 		fieldInfo.getValidValuesMap().put("26", new ValueInfo("26", "Value 26"));
	 * 		fieldInfo.getValidValuesMap().put("27", new ValueInfo("27", "Value 27"));
	 * 		fieldInfo.getValidValuesMap().put("28", new ValueInfo("28", "Value 28"));
	 * 		fieldInfo.getValidValuesMap().put("29", new ValueInfo("29", "Value 29"));
	 * 		fieldInfo.getValidValuesMap().put("30", new ValueInfo("30", "Value 30"));
	 * 		fieldInfo.getValidValuesMap().put("31", new ValueInfo("31", "Value 31"));
	 * 		fieldInfo.getValidValuesMap().put("32", new ValueInfo("32", "Value 32"));
	 * 		fieldInfo.getValidValuesMap().put("33", new ValueInfo("33", "Value 33"));
	 * 		fieldInfo.getValidValuesMap().put("34", new ValueInfo("34", "Value 34"));
	 * 		fieldInfo.getValidValuesMap().put("35", new ValueInfo("35", "Value 35"));
	 * 		fieldInfo.getValidValuesMap().put("36", new ValueInfo("36", "Value 36"));
	 * 		fieldInfo.getValidValuesMap().put("37", new ValueInfo("37", "Value 37"));
	 * 		fieldInfo.getValidValuesMap().put("38", new ValueInfo("38", "Value 38"));
	 * 		fieldInfo.getValidValuesMap().put("39", new ValueInfo("39", "Value 39"));
	 * 		fieldInfo.getValidValuesMap().put("40", new ValueInfo("40", "Value 40"));
	 * 		fieldInfo.getValidValuesMap().put("41", new ValueInfo("41", "Value 41"));
	 * 		fieldInfo.getValidValuesMap().put("42", new ValueInfo("42", "Value 42"));
	 * 		fieldInfo.getValidValuesMap().put("43", new ValueInfo("43", "Value 43"));
	 * 		fieldInfo.getValidValuesMap().put("44", new ValueInfo("44", "Value 44"));
	 * 		fieldInfo.getValidValuesMap().put("45", new ValueInfo("45", "Value 45"));
	 * 		fieldInfo.getValidValuesMap().put("46", new ValueInfo("46", "Value 46"));
	 * 		fieldInfo.getValidValuesMap().put("47", new ValueInfo("47", "Value 47"));
	 * 		fieldInfo.getValidValuesMap().put("48", new ValueInfo("48", "Value 48"));
	 * 		fieldInfo.getValidValuesMap().put("49", new ValueInfo("49", "Value 49"));
	 * 		fieldInfo.getValidValuesMap().put("50", new ValueInfo("50", "Value 50"));
	 * 		fieldInfo.getValidValuesMap().put("51", new ValueInfo("51", "Value 51"));
	 * 		fieldInfo.getValidValuesMap().put("52", new ValueInfo("52", "Value 52"));
	 * 		fieldInfo.getValidValuesMap().put("53", new ValueInfo("53", "Value 53"));
	 * 		fieldInfo.getValidValuesMap().put("54", new ValueInfo("54", "Value 54"));
	 * 		fieldInfo.getValidValuesMap().put("55", new ValueInfo("55", "Value 55"));
	 * 		fieldInfo.getValidValuesMap().put("56", new ValueInfo("56", "Value 56"));
	 * 		fieldInfo.getValidValuesMap().put("57", new ValueInfo("57", "Value 57"));
	 * 		fieldInfo.getValidValuesMap().put("58", new ValueInfo("58", "Value 58"));
	 * 		fieldInfo.getValidValuesMap().put("59", new ValueInfo("59", "Value 59"));
	 * 		fieldInfo.getValidValuesMap().put("60", new ValueInfo("60", "Value 60"));
	 * 		fieldInfo.getValidValuesMap().put("61", new ValueInfo("61", "Value 61"));
	 * 		fieldInfo.getValidValuesMap().put("62", new ValueInfo("62", "Value 62"));
	 * 		fieldInfo.getValidValuesMap().put("63", new ValueInfo("63", "Value 63"));
	 * 		fieldInfo.getValidValuesMap().put("64", new ValueInfo("64", "Value 64"));
	 * 		fieldInfo.getValidValuesMap().put("65", new ValueInfo("65", "Value 65"));
	 * 		fieldInfo.getValidValuesMap().put("66", new ValueInfo("66", "Value 66"));
	 * 		fieldInfo.getValidValuesMap().put("67", new ValueInfo("67", "Value 67")