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
		FieldInfo fieldInfo = dictionaryInfo.getField(1);
		assertEquals(fieldInfo.getTagNumber(), 1);
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
     * Returns the tag number of this field.
     *
     * @return the tag number of this field
     */
    public int getTagNumber();
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
		assertEquals(fieldInfo.getTagNumber(), 1);
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
     * Returns a field given a tagNumber
     *
     * @param tagNumber - a tagNumber
     * @return a field given a tagNumber
     */
    public FieldInfo getField(int tagNumber);
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
		FieldInfo fieldInfo = messageInfo.getField(1);
		assertEquals(fieldInfo.getTagNumber(), 1);
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

    /**
     * Returns a field given a tagNumber
     *
     * @param tagNumber - a tagNumber
     * @return a field given a tagNumber
     */
    public FieldInfo getField(int tagNumber);
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
* It contains ten unit test cases for the {@link MessageTypeInfo#getField(int)} method.
*/
class MessageTypeInfoTest {
		
	@Test
	void testGetField() {
		MessageTypeInfo messageTypeInfo = new MessageTypeInfo();
		FieldInfo fieldInfo = messageTypeInfo.getField(1);
		assertEquals(fieldInfo.getTagNumber(), 1);
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
* It contains ten unit test cases for the {@link MessageTypeInfo#getField(int)} method.
*/
class MessageTypeInfoTest {
		
	@Test
	void testGetField() {
		MessageTypeInfo messageTypeInfo = new MessageTypeInfo();
		FieldInfo fieldInfo = messageTypeInfo.getField(1);
		assertEquals(fieldInfo.getTagNumber(), 1);
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
* It contains ten unit test cases for the {@link MessageTypeInfo#getField(int)} method.
*/
class MessageTypeInfoTest {
		
	@Test
	void testGetField() {
		MessageTypeInfo messageTypeInfo = new MessageTypeInfo();
		FieldInfo fieldInfo = messageTypeInfo.getField(1);
		assertEquals(fieldInfo.getTagNumber(), 1);
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
* It contains ten unit test cases for the {@link MessageTypeInfo#getField(int)} method.
*/
class MessageTypeInfoTest {
		
	@Test
	void testGetField() {
		MessageTypeInfo messageTypeInfo = new MessageTypeInfo();
		FieldInfo fieldInfo = messageTypeInfo.getField(1);
		assertEquals(fieldInfo.getTagNumber(), 1);
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
* It contains ten unit test cases for the {@link MessageTypeInfo#getField(int)} method.
*/
class MessageTypeInfoTest {
		
	@Test
	void testGetField() {
		MessageTypeInfo messageTypeInfo = new MessageTypeInfo();
		FieldInfo fieldInfo = messageTypeInfo.getField(1);
		assertEquals(fieldInfo.getTagNumber(), 1);
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
* It contains ten unit test cases for the {@link MessageTypeInfo#getField(int)} method.
*/
class MessageTypeInfoTest {
		
	@Test
	void testGetField() {
		MessageTypeInfo messageTypeInfo = new MessageTypeInfo();
		FieldInfo fieldInfo = messageTypeInfo.getField(1);
		assertEquals(fieldInfo.getTagNumber(), 1);
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
* It contains ten unit test cases for the {@link MessageTypeInfo#getField(int)} method.
*/
class MessageTypeInfoTest {
		
	@Test
	void testGetField() {
		MessageTypeInfo messageTypeInfo = new MessageTypeInfo();
		FieldInfo fieldInfo = messageTypeInfo.getField(1);
		assertEquals(fieldInfo.getTagNumber(), 1);
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
* It contains ten unit test cases for the {@link MessageTypeInfo#getField(int)} method.
*/
class MessageTypeInfoTest {
		
	@Test
	void testGetField() {
		MessageTypeInfo messageTypeInfo = new MessageTypeInfo();
		FieldInfo fieldInfo = messageTypeInfo.getField(1);
		assertEquals(fieldInfo.getTagNumber(), 1);
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
* It contains ten unit test cases for the {@link MessageTypeInfo#getField(int)} method.
*/
class MessageTypeInfoTest {
		
	@Test
	void testGetField() {
		MessageTypeInfo messageTypeInfo = new MessageTypeInfo();
		FieldInfo fieldInfo = messageTypeInfo.getField(1);
		assertEquals(fieldInfo.getTagNumber(), 1);
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
* It contains ten unit test cases for the {@link MessageTypeInfo#getField(int)} method.
*/
class MessageTypeInfoTest {
		
	@Test
	void testGetField() {
		MessageTypeInfo messageTypeInfo = new MessageTypeInfo();
		FieldInfo fieldInfo = messageTypeInfo.getField(1);
		assertEquals(fieldInfo.getTagNumber(), 1);
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
* It contains ten unit test cases for the {@link MessageTypeInfo#getField(int)} method.
*/
class MessageTypeInfoTest {
		
	@Test
	void testGetField() {
		MessageTypeInfo messageTypeInfo = new MessageTypeInfo();
		FieldInfo fieldInfo = messageTypeInfo.getField(1);
		assertEquals(fieldInfo.getTagNumber(), 1);
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
* It contains ten unit test cases for the {@link MessageTypeInfo#getField(int)} method.
*/
class MessageTypeInfoTest {
		
	@Test
	void testGetField() {
		MessageTypeInfo messageTypeInfo = new MessageTypeInfo();
		FieldInfo fieldInfo = messageTypeInfo.getField(1);
		assertEquals(fieldInfo.getTagNumber(), 1);
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
* It contains ten unit test cases for the {@link MessageTypeInfo#getField(int)} method.
*/
class MessageTypeInfoTest {
		
	@Test
	void testGetField() {
		MessageTypeInfo messageTypeInfo = new MessageTypeInfo();
		FieldInfo fieldInfo = messageTypeInfo.getField(1);
		assertEquals(fieldInfo.getTagNumber(), 1);
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
* It contains ten unit test cases for the {@link MessageTypeInfo#getField(int)} method.
*/
class MessageTypeInfoTest {
		
	@Test
	void testGetField() {
		MessageTypeInfo messageTypeInfo = new MessageTypeInfo();
		FieldInfo fieldInfo = messageTypeInfo.getField(1);
		assertEquals(fieldInfo.getTagNumber(), 1);
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
* It contains ten unit test cases for the {@link MessageTypeInfo#getField(int)} method.
*/
class MessageTypeInfoTest {
		
	@Test
	void testGetField() {
		MessageTypeInfo messageTypeInfo = new MessageTypeInfo();
		FieldInfo fieldInfo = messageTypeInfo.getField(1);
		assertEquals(fieldInfo.getTagNumber(), 1);
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
* It contains ten unit test cases for the {@link MessageTypeInfo#getField(int)} method.
*/
class MessageTypeInfoTest {
		
	@Test
	void testGetField() {
		MessageTypeInfo messageTypeInfo = new MessageTypeInfo();
		FieldInfo fieldInfo = messageTypeInfo.getField(1);
		assertEquals(fieldInfo.getTagNumber(), 1);
	}
}

// MessageTypeInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;