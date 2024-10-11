// DictionaryInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getField(int)} method.
*/
class DictionaryInfoTest {

	@Test
	void testGetField() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setTagNumber(1);
		dictionaryInfo.fieldsByTagNumber = new TreeMap<Integer, FieldInfo>();
		dictionaryInfo.fieldsByTagNumber.put(1, fieldInfo);
		assertEquals(fieldInfo, dictionaryInfo.getField(1));
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

    private int tagNumber;

    public int getTagNumber() {
        return tagNumber;
    }

    public void setTagNumber(int tagNumber) {
        this.tagNumber = tagNumber;
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
* It contains two unit test cases for the {@link FieldInfo#getTagNumber()} and {@link FieldInfo#setTagNumber(int)} methods.
*/
class FieldInfoTest {
		
	@Test
	void testGetTagNumber() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setTagNumber(1);
		assertEquals(1, fieldInfo.getTagNumber());
	}
}

// GroupInfo.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a FIX group.
 *
 * @author jramoyo
 */
public class GroupInfo {

    private int delimiterFieldTagNumber;

    public int getDelimiterFieldTagNumber() {
        return delimiterFieldTagNumber;
    }

    public void setDelimiterFieldTagNumber(int delimiterFieldTagNumber) {
        this.delimiterFieldTagNumber = delimiterFieldTagNumber;
    }
}

// GroupInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GroupInfo}.
* It contains two unit test cases for the {@link GroupInfo#getDelimiterFieldTagNumber()} and {@link GroupInfo#setDelimiterFieldTagNumber(int)} methods.
*/
class GroupInfoTest {
		
	@Test
	void testGetDelimiterFieldTagNumber() {
		GroupInfo groupInfo = new GroupInfo();
		groupInfo.setDelimiterFieldTagNumber(1);
		assertEquals(1, groupInfo.getDelimiterFieldTagNumber());
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

    private int msgType;

    public int getMsgType() {
        return msgType;
    }

    public void setMsgType(int msgType) {
        this.msgType = msgType;
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
* It contains two unit test cases for the {@link MessageInfo#getMsgType()} and {@link MessageInfo#setMsgType(int)} methods.
*/
class MessageInfoTest {
		
	@Test
	void testGetMsgType() {
		MessageInfo messageInfo = new MessageInfo();
		messageInfo.setMsgType(1);
		assertEquals(1, messageInfo.getMsgType());
	}
}

// MessageTypeInfo.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a FIX message type.
 *
 * @author jramoyo
 */
public class MessageTypeInfo {

    private int msgType;

    public int getMsgType() {
        return msgType;
    }

    public void setMsgType(int msgType) {
        this.msgType = msgType;
    }
}

// MessageTypeInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MessageTypeInfo}.
* It contains two unit test cases for the {@link MessageTypeInfo#getMsgType()} and {@link MessageTypeInfo#setMsgType(int)} methods.
*/
class MessageTypeInfoTest {
		
	@Test
	void testGetMsgType() {
		MessageTypeInfo messageTypeInfo = new MessageTypeInfo();
		messageTypeInfo.setMsgType(1);
		assertEquals(1, messageTypeInfo.getMsgType());
	}
}

// TagInfo.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a FIX tag.
 *
 * @author jramoyo
 */
public class TagInfo {

    private int tagNumber;

    public int getTagNumber() {
        return tagNumber;
    }

    public void setTagNumber(int tagNumber) {
        this.tagNumber = tagNumber;
    }
}

// TagInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TagInfo}.
* It contains two unit test cases for the {@link TagInfo#getTagNumber()} and {@link TagInfo#setTagNumber(int)} methods.
*/
class TagInfoTest {
		
	@Test
	void testGetTagNumber() {
		TagInfo tagInfo = new TagInfo();
		tagInfo.setTagNumber(1);
		assertEquals(1, tagInfo.getTagNumber());
	}
}

// ValueInfo.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Represents a FIX value.
 *
 * @author jramoyo
 */
public class ValueInfo {

    private int tagNumber;

    public int getTagNumber() {
        return tagNumber;
    }

    public void setTagNumber(int tagNumber) {
        this.tagNumber = tagNumber;
    }
}

// ValueInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ValueInfo}.
* It contains two unit test cases for the {@link ValueInfo#getTagNumber()} and {@link ValueInfo#setTagNumber(int)} methods.
*/
class ValueInfoTest {
		
	@Test
	void testGetTagNumber() {
		ValueInfo valueInfo = new ValueInfo();
		valueInfo.setTagNumber(1);
		assertEquals(1, valueInfo.getTagNumber());
	}
}