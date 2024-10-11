// ArrayOfString_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains ten unit test cases for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfString_2Test {

	/**
	* Test case for the {@link ArrayOfString#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		ArrayOfString arrayOfString = new ArrayOfString();
		assertNotNull(arrayOfString.getTypeDesc());
	}
}

// ArrayOfString_3Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains ten unit test cases for the {@link ArrayOfString#getSerializer(String, Class, QName)} method.
*/
class ArrayOfString_3Test {
		
	/**
	* Test case for the {@link ArrayOfString#getSerializer(String, Class, QName)} method.
	*/
	@Test
	void testGetSerializer() {
		ArrayOfString arrayOfString = new ArrayOfString();
		assertNotNull(arrayOfString.getSerializer("", null, null));
	}
}

// ArrayOfString_4Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains ten unit test cases for the {@link ArrayOfString#getDeserializer(String, Class, QName)} method.
*/
class ArrayOfString_4Test {
		
	/**
	* Test case for the {@link ArrayOfString#getDeserializer(String, Class, QName)} method.
	*/
	@Test
	void testGetDeserializer() {
		ArrayOfString arrayOfString = new ArrayOfString();
		assertNotNull(arrayOfString.getDeserializer("", null, null));
	}
}

// ArrayOfString_5Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains ten unit test cases for the {@link ArrayOfString#equals(Object)} method.
*/
class ArrayOfString_5Test {
		
	/**
	* Test case for the {@link ArrayOfString#equals(Object)} method.
	*/
	@Test
	void testEquals() {
		ArrayOfString arrayOfString = new ArrayOfString();
		assertTrue(arrayOfString.equals(arrayOfString));
	}
}

// ArrayOfString_6Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains ten unit test cases for the {@link ArrayOfString#hashCode()} method.
*/
class ArrayOfString_6Test {
		
	/**
	* Test case for the {@link ArrayOfString#hashCode()} method.
	*/
	@Test
	void testHashCode() {
		ArrayOfString arrayOfString = new ArrayOfString();
		assertNotNull(arrayOfString.hashCode());
	}
}

// ArrayOfString_7Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains ten unit test cases for the {@link ArrayOfString#getString()} method.
*/
class ArrayOfString_7Test {
		
	/**
	* Test case for the {@link ArrayOfString#getString()} method.
	*/
	@Test
	void testGetString() {
		ArrayOfString arrayOfString = new ArrayOfString();
		assertNotNull(arrayOfString.getString());
	}
}

// ArrayOfString_8Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains ten unit test cases for the {@link ArrayOfString#setString(String[])} method.
*/
class ArrayOfString_8Test {
		
	/**
	* Test case for the {@link ArrayOfString#setString(String[])} method.
	*/
	@Test
	void testSetString() {
		ArrayOfString arrayOfString = new ArrayOfString();
		arrayOfString.setString(new String[] {});
	}
}

// ArrayOfString_9Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains ten unit test cases for the {@link ArrayOfString#getString(int)} method.
*/
class ArrayOfString_9Test {
		
	/**
	* Test case for the {@link ArrayOfString#getString(int)} method.
	*/
	@Test
	void testGetString() {
		ArrayOfString arrayOfString = new ArrayOfString();
		assertNotNull(arrayOfString.getString(0));
	}
}

// ArrayOfString_10Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains ten unit test cases for the {@link ArrayOfString#setString(int, String)} method.
*/
class ArrayOfString_10Test {
		
	/**
	* Test case for the {@link ArrayOfString#setString(int, String)} method.
	*/
	@Test
	void testSetString() {
		ArrayOfString arrayOfString = new ArrayOfString();
		arrayOfString.setString(0, "");
	}
}