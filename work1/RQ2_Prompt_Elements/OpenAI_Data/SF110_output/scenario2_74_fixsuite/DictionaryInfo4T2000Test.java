// DictionaryInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getMessage(int)} method.
*/
class DictionaryInfoTest {

	@Test
	void testGetMessage() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		dictionaryInfo.messagesById = new TreeMap<Integer, MessageInfo>();
		dictionaryInfo.messagesById.put(1, new MessageInfo());
		dictionaryInfo.messagesById.put(2, new MessageInfo());
		dictionaryInfo.messagesById.put(3, new MessageInfo());
		dictionaryInfo.messagesById.put(4, new MessageInfo());
		dictionaryInfo.messagesById.put(5, new MessageInfo());
		dictionaryInfo.messagesById.put(6, new MessageInfo());
		dictionaryInfo.messagesById.put(7, new MessageInfo());
		dictionaryInfo.messagesById.put(8, new MessageInfo());
		dictionaryInfo.messagesById.put(9, new MessageInfo());
		dictionaryInfo.messagesById.put(10, new MessageInfo());
		
		assertEquals(dictionaryInfo.messagesById.get(1), dictionaryInfo.getMessage(1));
		assertEquals(dictionaryInfo.messagesById.get(2), dictionaryInfo.getMessage(2));
		assertEquals(dictionaryInfo.messagesById.get(3), dictionaryInfo.getMessage(3));
		assertEquals(dictionaryInfo.messagesById.get(4), dictionaryInfo.getMessage(4));
		assertEquals(dictionaryInfo.messagesById.get(5), dictionaryInfo.getMessage(5));
		assertEquals(dictionaryInfo.messagesById.get(6), dictionaryInfo.getMessage(6));
		assertEquals(dictionaryInfo.messagesById.get(7), dictionaryInfo.getMessage(7));
		assertEquals(dictionaryInfo.messagesById.get(8), dictionaryInfo.getMessage(8));
		assertEquals(dictionaryInfo.messagesById.get(9), dictionaryInfo.getMessage(9));
		assertEquals(dictionaryInfo.messagesById.get(10), dictionaryInfo.getMessage(10));
	}
}

// MessageInfo.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a FIX message.
 *
 * @author jramoyo
 */
public class MessageInfo {

    /**
     * Returns a field given a tag
     *
     * @param tag - a tag
     * @return a field given a tag
     */
    public FieldInfo getField(int tag) {
        if (fieldsByTag != null) {
            return fieldsByTag.get(tag);
        } else {
            return null;
        }
    }
}

// MessageInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MessageInfo}.
* It contains ten unit test cases for the {@link MessageInfo#getField(int)} method.
*/
class MessageInfoTest {
		
	@Test
	void testGetField() {
		MessageInfo messageInfo = new MessageInfo();
		messageInfo.fieldsByTag = new TreeMap<Integer, FieldInfo>();
		messageInfo.fieldsByTag.put(1, new FieldInfo());
		messageInfo.fieldsByTag.put(2, new FieldInfo());
		messageInfo.fieldsByTag.put(3, new FieldInfo());
		messageInfo.fieldsByTag.put(4, new FieldInfo());
		messageInfo.fieldsByTag.put(5, new FieldInfo());
		messageInfo.fieldsByTag.put(6, new FieldInfo());
		messageInfo.fieldsByTag.put(7, new FieldInfo());
		messageInfo.fieldsByTag.put(8, new FieldInfo());
		messageInfo.fieldsByTag.put(9, new FieldInfo());
		messageInfo.fieldsByTag.put(10, new FieldInfo());
		
		assertEquals(messageInfo.fieldsByTag.get(1), messageInfo.getField(1));
		assertEquals(messageInfo.fieldsByTag.get(2), messageInfo.getField(2));
		assertEquals(messageInfo.fieldsByTag.get(3), messageInfo.getField(3));
		assertEquals(messageInfo.fieldsByTag.get(4), messageInfo.getField(4));
		assertEquals(messageInfo.fieldsByTag.get(5), messageInfo.getField(5));
		assertEquals(messageInfo.fieldsByTag.get(6), messageInfo.getField(6));
		assertEquals(messageInfo.fieldsByTag.get(7), messageInfo.getField(7));
		assertEquals(messageInfo.fieldsByTag.get(8), messageInfo.getField(8));
		assertEquals(messageInfo.fieldsByTag.get(9), messageInfo.getField(9));
		assertEquals(messageInfo.fieldsByTag.get(10), messageInfo.getField(10));
	}
}

// FieldInfo.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a FIX field.
 *
 * @author jramoyo
 */
public class FieldInfo {

    /**
     * Returns a value given a value
     *
     * @param value - a value
     * @return a value given a value
     */
    public ValueInfo getValue(String value) {
        if (valuesByValue != null) {
            return valuesByValue.get(value);
        } else {
            return null;
        }
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
* It contains ten unit test cases for the {@link FieldInfo#getValue(String)} method.
*/
class FieldInfoTest {
		
	@Test
	void testGetValue() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.valuesByValue = new TreeMap<String, ValueInfo>();
		fieldInfo.valuesByValue.put("1", new ValueInfo());
		fieldInfo.valuesByValue.put("2", new ValueInfo());
		fieldInfo.valuesByValue.put("3", new ValueInfo());
		fieldInfo.valuesByValue.put("4", new ValueInfo());
		fieldInfo.valuesByValue.put("5", new ValueInfo());
		fieldInfo.valuesByValue.put("6", new ValueInfo());
		fieldInfo.valuesByValue.put("7", new ValueInfo());
		fieldInfo.valuesByValue.put("8", new ValueInfo());
		fieldInfo.valuesByValue.put("9", new ValueInfo());
		fieldInfo.valuesByValue.put("10", new ValueInfo());
		
		assertEquals(fieldInfo.valuesByValue.get("1"), fieldInfo.getValue("1"));
		assertEquals(fieldInfo.valuesByValue.get("2"), fieldInfo.getValue("2"));
		assertEquals(fieldInfo.valuesByValue.get("3"), fieldInfo.getValue("3"));
		assertEquals(fieldInfo.valuesByValue.get("4"), fieldInfo.getValue("4"));
		assertEquals(fieldInfo.valuesByValue.get("5"), fieldInfo.getValue("5"));
		assertEquals(fieldInfo.valuesByValue.get("6"), fieldInfo.getValue("6"));
		assertEquals(fieldInfo.valuesByValue.get("7"), fieldInfo.getValue