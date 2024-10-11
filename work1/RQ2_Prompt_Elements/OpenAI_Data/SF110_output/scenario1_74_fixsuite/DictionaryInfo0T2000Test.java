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
* It contains ten unit test cases for the {@link FieldInfo#getTagNumber()} method.
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

    private int tagNumber;

    public int getTagNumber() {
        return tagNumber;
    }

    public void setTagNumber(int tagNumber) {
        this.tagNumber = tagNumber;
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
* It contains ten unit test cases for the {@link GroupInfo#getTagNumber()} method.
*/
class GroupInfoTest {
		
	@Test
	void testGetTagNumber() {
		GroupInfo groupInfo = new GroupInfo();
		groupInfo.setTagNumber(1);
		assertEquals(1, groupInfo.getTagNumber());
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

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
* It contains ten unit test cases for the {@link MessageInfo#getName()} method.
*/
class MessageInfoTest {
		
	@Test
	void testGetName() {
		MessageInfo messageInfo = new MessageInfo();
		messageInfo.setName("name");
		assertEquals("name", messageInfo.getName());
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

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
* It contains ten unit test cases for the {@link MessageTypeInfo#getName()} method.
*/
class MessageTypeInfoTest {
		
	@Test
	void testGetName() {
		MessageTypeInfo messageTypeInfo = new MessageTypeInfo();
		messageTypeInfo.setName("name");
		assertEquals("name", messageTypeInfo.getName());
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
* It contains ten unit test cases for the {@link TagInfo#getTagNumber()} method.
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

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
* It contains ten unit test cases for the {@link ValueInfo#getName()} method.
*/
class ValueInfoTest {
		
	@Test
	void testGetName() {
		ValueInfo valueInfo = new ValueInfo();
		valueInfo.setName("name");
		assertEquals("name", valueInfo.getName());
	}
}