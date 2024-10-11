// DictionaryInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getMessage(String)} method.
*/
class DictionaryInfoTest {

	@Test
	void testGetMessage() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		assertNull(dictionaryInfo.getMessage(""));
		assertNull(dictionaryInfo.getMessage(" "));
		assertNull(dictionaryInfo.getMessage("\t"));
		assertNull(dictionaryInfo.getMessage("\n"));
		assertNull(dictionaryInfo.getMessage("\r"));
		assertNull(dictionaryInfo.getMessage("\f"));
		assertNull(dictionaryInfo.getMessage("\b"));
		assertNull(dictionaryInfo.getMessage("\0"));
		assertNull(dictionaryInfo.getMessage("\u0000"));
		assertNull(dictionaryInfo.getMessage("\u0001"));
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
     * Returns a field given a name
     *
     * @param name - a name
     * @return a field given a name
     */
    public FieldInfo getField(String name) {
        if (fieldsByName != null) {
            return fieldsByName.get(name);
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
* It contains ten unit test cases for the {@link FieldInfo#getField(String)} method.
*/
class FieldInfoTest {
		
	@Test
	void testGetField() {
		FieldInfo fieldInfo = new FieldInfo();
		assertNull(fieldInfo.getField(""));
		assertNull(fieldInfo.getField(" "));
		assertNull(fieldInfo.getField("\t"));
		assertNull(fieldInfo.getField("\n"));
		assertNull(fieldInfo.getField("\r"));
		assertNull(fieldInfo.getField("\f"));
		assertNull(fieldInfo.getField("\b"));
		assertNull(fieldInfo.getField("\0"));
		assertNull(fieldInfo.getField("\u0000"));
		assertNull(fieldInfo.getField("\u0001"));
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
     * Returns a field given a name
     *
     * @param name - a name
     * @return a field given a name
     */
    public FieldInfo getField(String name) {
        if (fieldsByName != null) {
            return fieldsByName.get(name);
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
* It contains ten unit test cases for the {@link MessageInfo#getField(String)} method.
*/
class MessageInfoTest {
		
	@Test
	void testGetField() {
		MessageInfo messageInfo = new MessageInfo();
		assertNull(messageInfo.getField(""));
		assertNull(messageInfo.getField(" "));
		assertNull(messageInfo.getField("\t"));
		assertNull(messageInfo.getField("\n"));
		assertNull(messageInfo.getField("\r"));
		assertNull(messageInfo.getField("\f"));
		assertNull(messageInfo.getField("\b"));
		assertNull(messageInfo.getField("\0"));
		assertNull(messageInfo.getField("\u0000"));
		assertNull(messageInfo.getField("\u0001"));
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
     * Returns a field given a name
     *
     * @param name - a name
     * @return a field given a name
     */
    public FieldInfo getField(String name) {
        if (fieldsByName != null) {
            return fieldsByName.get(name);
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
* It contains ten unit test cases for the {@link FieldInfo#getField(String)} method.
*/
class FieldInfoTest {
		
	@Test
	void testGetField() {
		FieldInfo fieldInfo = new FieldInfo();
		assertNull(fieldInfo.getField(""));
		assertNull(fieldInfo.getField(" "));
		assertNull(fieldInfo.getField("\t"));
		assertNull(fieldInfo.getField("\n"));
		assertNull(fieldInfo.getField("\r"));
		assertNull(fieldInfo.getField("\f"));
		assertNull(fieldInfo.getField("\b"));
		assertNull(fieldInfo.getField("\0"));
		assertNull(fieldInfo.getField("\u0000"));
		assertNull(fieldInfo.getField("\u0001"));
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
     * Returns a field given a name
     *
     * @param name - a name
     * @return a field given a name
     */
    public FieldInfo getField(String name) {
        if (fieldsByName != null) {
            return fieldsByName.get(name);
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
* It contains ten unit test cases for the {@link MessageInfo#getField(String)} method.
*/
class MessageInfoTest {
		
	@Test
	void testGetField() {
		MessageInfo messageInfo = new MessageInfo();
		assertNull(messageInfo.getField(""));
		assertNull(messageInfo.getField(" "));
		assertNull(messageInfo.getField("\t"));
		assertNull(messageInfo.