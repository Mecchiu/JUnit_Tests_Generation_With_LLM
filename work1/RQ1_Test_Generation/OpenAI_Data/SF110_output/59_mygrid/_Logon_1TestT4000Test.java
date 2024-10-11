// _Logon_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains ten unit test cases for the {@link _Logon#getTypeDesc()} method.
*/
class _Logon_1Test {

	/**
	* Test case for the {@link _Logon#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		_Logon _logon = new _Logon();
		assertNotNull(_logon.getTypeDesc());
	}
}

// _Logon_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains ten unit test cases for the {@link _Logon#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class _Logon_2Test {
		
	/**
	* Test case for the {@link _Logon#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	*/
	@Test
	void testGetSerializer() {
		_Logon _logon = new _Logon();
		assertNotNull(_logon.getSerializer("", null, null));
	}
}

// _Logon_3Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains ten unit test cases for the {@link _Logon#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class _Logon_3Test {
		
	/**
	* Test case for the {@link _Logon#getDeserializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	*/
	@Test
	void testGetDeserializer() {
		_Logon _logon = new _Logon();
		assertNotNull(_logon.getDeserializer("", null, null));
	}
}

// _Logon_4Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains ten unit test cases for the {@link _Logon#equals(java.lang.Object)} method.
*/
class _Logon_4Test {
		
	/**
	* Test case for the {@link _Logon#equals(java.lang.Object)} method.
	*/
	@Test
	void testEquals() {
		_Logon _logon = new _Logon();
		assertTrue(_logon.equals(null));
	}
}

// _Logon_5Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains ten unit test cases for the {@link _Logon#hashCode()} method.
*/
class _Logon_5Test {
		
	/**
	* Test case for the {@link _Logon#hashCode()} method.
	*/
	@Test
	void testHashCode() {
		_Logon _logon = new _Logon();
		assertNotNull(_logon.hashCode());
	}
}

// _Logon_6Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains ten unit test cases for the {@link _Logon#getClusterUrl()} method.
*/
class _Logon_6Test {
		
	/**
	* Test case for the {@link _Logon#getClusterUrl()} method.
	*/
	@Test
	void testGetClusterUrl() {
		_Logon _logon = new _Logon();
		assertNull(_logon.getClusterUrl());
	}
}

// _Logon_7Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains ten unit test cases for the {@link _Logon#setClusterUrl(java.lang.String)} method.
*/
class _Logon_7Test {
		
	/**
	* Test case for the {@link _Logon#setClusterUrl(java.lang.String)} method.
	*/
	@Test
	void testSetClusterUrl() {
		_Logon _logon = new _Logon();
		_logon.setClusterUrl("");
	}
}

// _Logon_8Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains ten unit test cases for the {@link _Logon#getUser()} method.
*/
class _Logon_8Test {
		
	/**
	* Test case for the {@link _Logon#getUser()} method.
	*/
	@Test
	void testGetUser() {
		_Logon _logon = new _Logon();
		assertNull(_logon.getUser());
	}
}

// _Logon_9Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains ten unit test cases for the {@link _Logon#setUser(java.lang.String)} method.
*/
class _Logon_9Test {
		
	/**
	* Test case for the {@link _Logon#setUser(java.lang.String)} method.
	*/
	@Test
	void testSetUser() {
		_Logon _logon = new _Logon();
		_logon.setUser("");
	}
}

// _Logon_10Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains ten unit test cases for the {@link _Logon#getPassword()} method.
*/
class _Logon_10Test {
		
	/**
	* Test case for the {@link _Logon#getPassword()} method.
	*/
	@Test
	void testGetPassword() {
		_Logon _logon = new _Logon();
		assertNull(_logon.getPassword());
	}
}

// _Logon_11Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains ten unit test cases for the {@link _Logon#setPassword(java.lang.String)} method.
*/
class _Logon_11Test {
		
	/**
	* Test case for the {@link _Logon#setPassword(java.lang.String)} method.
	*/
	@Test
	void testSetPassword() {
		_Logon _logon = new _Logon();
		_logon.setPassword("");
	}
}

// _Logon_12Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains ten unit test cases for the {@link _Logon#_Logon()} method.
*/
class _Logon_12Test {
		
	/**
	* Test case for the {@link _Logon#_Logon()} method.
	*/
	@Test
	void test_Logon() {
		_Logon _logon = new _Logon();
		assertNotNull(_logon);
	}
}