// ArrayOfDependency_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains ten unit test cases for the {@link ArrayOfDependency#getTypeDesc()} method.
*/
class ArrayOfDependency_2Test {

	/**
	* Test case for the {@link ArrayOfDependency#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		ArrayOfDependency arrayOfDependency = new ArrayOfDependency();
		assertNotNull(arrayOfDependency.getTypeDesc());
	}
}

// ArrayOfDependency_3Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains ten unit test cases for the {@link ArrayOfDependency#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class ArrayOfDependency_3Test {
		
	/**
	* Test case for the {@link ArrayOfDependency#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	*/
	@Test
	void testGetSerializer() {
		ArrayOfDependency arrayOfDependency = new ArrayOfDependency();
		assertNotNull(arrayOfDependency.getSerializer("", null, null));
	}
}

// ArrayOfDependency_4Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains ten unit test cases for the {@link ArrayOfDependency#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class ArrayOfDependency_4Test {
		
	/**
	* Test case for the {@link ArrayOfDependency#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	*/
	@Test
	void testGetDeserializer() {
		ArrayOfDependency arrayOfDependency = new ArrayOfDependency();
		assertNotNull(arrayOfDependency.getDeserializer("", null, null));
	}
}

// ArrayOfDependency_5Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains ten unit test cases for the {@link ArrayOfDependency#equals(java.lang.Object)} method.
*/
class ArrayOfDependency_5Test {
		
	/**
	* Test case for the {@link ArrayOfDependency#equals(java.lang.Object)} method.
	*/
	@Test
	void testEquals() {
		ArrayOfDependency arrayOfDependency = new ArrayOfDependency();
		assertTrue(arrayOfDependency.equals(arrayOfDependency));
	}
}

// ArrayOfDependency_6Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains ten unit test cases for the {@link ArrayOfDependency#hashCode()} method.
*/
class ArrayOfDependency_6Test {
		
	/**
	* Test case for the {@link ArrayOfDependency#hashCode()} method.
	*/
	@Test
	void testHashCode() {
		ArrayOfDependency arrayOfDependency = new ArrayOfDependency();
		assertNotNull(arrayOfDependency.hashCode());
	}
}

// ArrayOfDependency_7Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains ten unit test cases for the {@link ArrayOfDependency#getDependency()} method.
*/
class ArrayOfDependency_7Test {
		
	/**
	* Test case for the {@link ArrayOfDependency#getDependency()} method.
	*/
	@Test
	void testGetDependency() {
		ArrayOfDependency arrayOfDependency = new ArrayOfDependency();
		assertNotNull(arrayOfDependency.getDependency());
	}
}

// ArrayOfDependency_8Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains ten unit test cases for the {@link ArrayOfDependency#setDependency(mygrid.web.Dependency[])} method.
*/
class ArrayOfDependency_8Test {
		
	/**
	* Test case for the {@link ArrayOfDependency#setDependency(mygrid.web.Dependency[])} method.
	*/
	@Test
	void testSetDependency() {
		ArrayOfDependency arrayOfDependency = new ArrayOfDependency();
		arrayOfDependency.setDependency(new Dependency[0]);
	}
}

// ArrayOfDependency_9Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains ten unit test cases for the {@link ArrayOfDependency#getDependency(int)} method.
*/
class ArrayOfDependency_9Test {
		
	/**
	* Test case for the {@link ArrayOfDependency#getDependency(int)} method.
	*/
	@Test
	void testGetDependency() {
		ArrayOfDependency arrayOfDependency = new ArrayOfDependency();
		assertNotNull(arrayOfDependency.getDependency(0));
	}
}

// ArrayOfDependency_10Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains ten unit test cases for the {@link ArrayOfDependency#setDependency(int, mygrid.web.Dependency)} method.
*/
class ArrayOfDependency_10Test {
		
	/**
	* Test case for the {@link ArrayOfDependency#setDependency(int, mygrid.web.Dependency)} method.
	*/
	@Test
	void testSetDependency() {
		ArrayOfDependency arrayOfDependency = new ArrayOfDependency();
		arrayOfDependency.setDependency(0, new Dependency());
	}
}

// ArrayOfDependency_11Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains ten unit test cases for the {@link ArrayOfDependency#ArrayOfDependency()} method.
*/
class ArrayOfDependency_11Test {
		
	/**
	* Test case for the {@link ArrayOfDependency#ArrayOfDependency()} method.
	*/
	@Test
	void testArrayOfDependency() {
	