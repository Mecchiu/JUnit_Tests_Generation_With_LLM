// DictionaryInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#getField(String)} method.
*/
class DictionaryInfoTest {

	@Test
	void testGetField() {
		DictionaryInfo dictionaryInfo = new DictionaryInfo();
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		TreeMap<String, FieldInfo> fieldsByName = new TreeMap<String, FieldInfo>();
		fieldsByName.put("Test", fieldInfo);
		dictionaryInfo.fieldsByName = fieldsByName;
		assertEquals(fieldInfo, dictionaryInfo.getField("Test"));
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
* It contains two unit test cases for the {@link FieldInfo#getName()} and {@link FieldInfo#setName(String)} methods.
*/
class FieldInfoTest {
		
	@Test
	void testGetName() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.name = "Test";
		assertEquals("Test", fieldInfo.getName());
	}
	
	@Test
	void testSetName() {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.setName("Test");
		assertEquals("Test", fieldInfo.name);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
* It contains two unit test cases for the {@link GroupInfo#getName()} and {@link GroupInfo#setName(String)} methods.
*/
class GroupInfoTest {
		
	@Test
	void testGetName() {
		GroupInfo groupInfo = new GroupInfo();
		groupInfo.name = "Test";
		assertEquals("Test", groupInfo.getName());
	}
	
	@Test
	void testSetName() {
		GroupInfo groupInfo = new GroupInfo();
		groupInfo.setName("Test");
		assertEquals("Test", groupInfo.name);
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
* It contains two unit test cases for the {@link MessageInfo#getName()} and {@link MessageInfo#setName(String)} methods.
*/
class MessageInfoTest {
		
	@Test
	void testGetName() {
		MessageInfo messageInfo = new MessageInfo();
		messageInfo.name = "Test";
		assertEquals("Test", messageInfo.getName());
	}
	
	@Test
	void testSetName() {
		MessageInfo messageInfo = new MessageInfo();
		messageInfo.setName("Test");
		assertEquals("Test", messageInfo.name);
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
* It contains two unit test cases for the {@link MessageTypeInfo#getName()} and {@link MessageTypeInfo#setName(String)} methods.
*/
class MessageTypeInfoTest {
		
	@Test
	void testGetName() {
		MessageTypeInfo messageTypeInfo = new MessageTypeInfo();
		messageTypeInfo.name = "Test";
		assertEquals("Test", messageTypeInfo.getName());
	}
	
	@Test
	void testSetName() {
		MessageTypeInfo messageTypeInfo = new MessageTypeInfo();
		messageTypeInfo.setName("Test");
		assertEquals("Test", messageTypeInfo.name);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
* It contains two unit test cases for the {@link TagInfo#getName()} and {@link TagInfo#setName(String)} methods.
*/
class TagInfoTest {
		
	@Test
	void testGetName() {
		TagInfo tagInfo = new TagInfo();
		tagInfo.name = "Test";
		assertEquals("Test", tagInfo.getName());
	}
	
	@Test
	void testSetName() {
		TagInfo tagInfo = new TagInfo();
		tagInfo.setName("Test");
		assertEquals("Test", tagInfo.name);
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
* It contains two unit test cases for the {@link ValueInfo#getName()} and {@link ValueInfo#setName(String)} methods.
*/
class ValueInfoTest {
		
	@Test
	void testGetName() {
		ValueInfo valueInfo = new ValueInfo();
		valueInfo.name = "Test";
		assertEquals("Test", valueInfo.getName());
	}
	
	@Test
	void testSetName() {
		ValueInfo valueInfo = new ValueInfo();
		valueInfo.setName("Test");
		assertEquals("Test", valueInfo.name);
	}
}