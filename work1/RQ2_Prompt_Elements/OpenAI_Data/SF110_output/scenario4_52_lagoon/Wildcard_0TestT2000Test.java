// Wildcard_0Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#isWildcard(String)} method.
*/
class Wildcard_0Test {

	@Test
	void testIsWildcard_0() {
		assertTrue(Wildcard.isWildcard("*"));
	}
	
	@Test
	void testIsWildcard_1() {
		assertTrue(Wildcard.isWildcard("*.html"));
	}
	
	@Test
	void testIsWildcard_2() {
		assertTrue(Wildcard.isWildcard("*.html;*.xml"));
	}
	
	@Test
	void testIsWildcard_3() {
		assertTrue(Wildcard.isWildcard("*.html;*.xml;*.txt"));
	}
	
	@Test
	void testIsWildcard_4() {
		assertTrue(Wildcard.isWildcard("*.html;*.xml;*.txt;*.pdf"));
	}
	
	@Test
	void testIsWildcard_5() {
		assertTrue(Wildcard.isWildcard("*.html;*.xml;*.txt;*.pdf;*.doc"));
	}
	
	@Test
	void testIsWildcard_6() {
		assertTrue(Wildcard.isWildcard("*.html;*.xml;*.txt;*.pdf;*.doc;*.rtf"));
	}
	
	@Test
	void testIsWildcard_7() {
		assertTrue(Wildcard.isWildcard("*.html;*.xml;*.txt;*.pdf;*.doc;*.rtf;*.xls"));
	}
	
	@Test
	void testIsWildcard_8() {
		assertTrue(Wildcard.isWildcard("*.html;*.xml;*.txt;*.pdf;*.doc;*.rtf;*.xls;*.ppt"));
	}
	
	@Test
	void testIsWildcard_9() {
		assertTrue(Wildcard.isWildcard("*.html;*.xml;*.txt;*.pdf;*.doc;*.rtf;*.xls;*.ppt;*.zip"));
	}
}

// Wildcard_1Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#matchWildcard(String, String)} method.
*/
class Wildcard_1Test {
		
	@Test
	void testMatchWildcard_0() {
		assertEquals("", Wildcard.matchWildcard("*", ""));
	}
	
	@Test
	void testMatchWildcard_1() {
		assertEquals("", Wildcard.matchWildcard("*.html", ""));
	}
	
	@Test
	void testMatchWildcard_2() {
		assertEquals("", Wildcard.matchWildcard("*.html;*.xml", ""));
	}
	
	@Test
	void testMatchWildcard_3() {
		assertEquals("", Wildcard.matchWildcard("*.html;*.xml;*.txt", ""));
	}
	
	@Test
	void testMatchWildcard_4() {
		assertEquals("", Wildcard.matchWildcard("*.html;*.xml;*.txt;*.pdf", ""));
	}
	
	@Test
	void testMatchWildcard_5() {
		assertEquals("", Wildcard.matchWildcard("*.html;*.xml;*.txt;*.pdf;*.doc", ""));
	}
	
	@Test
	void testMatchWildcard_6() {
		assertEquals("", Wildcard.matchWildcard("*.html;*.xml;*.txt;*.pdf;*.doc;*.rtf", ""));
	}
	
	@Test
	void testMatchWildcard_7() {
		assertEquals("", Wildcard.matchWildcard("*.html;*.xml;*.txt;*.pdf;*.doc;*.rtf;*.xls", ""));
	}
	
	@Test
	void testMatchWildcard_8() {
		assertEquals("", Wildcard.matchWildcard("*.html;*.xml;*.txt;*.pdf;*.doc;*.rtf;*.xls;*.ppt", ""));
	}
	
	@Test
	void testMatchWildcard_9() {
		assertEquals("", Wildcard.matchWildcard("*.html;*.xml;*.txt;*.pdf;*.doc;*.rtf;*.xls;*.ppt;*.zip", ""));
	}
}

// Wildcard_2Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#instantiateWildcard(String, String)} method.
*/
class Wildcard_2Test {
		
	@Test
	void testInstantiateWildcard_0() {
		assertEquals("", Wildcard.instantiateWildcard("*", ""));
	}
	
	@Test
	void testInstantiateWildcard_1() {
		assertEquals("", Wildcard.instantiateWildcard("*.html", ""));
	}
	
	@Test
	void testInstantiateWildcard_2() {
		assertEquals("", Wildcard.instantiateWildcard("*.html;*.xml", ""));
	}
	
	@Test
	void testInstantiateWildcard_3() {
		assertEquals("", Wildcard.instantiateWildcard("*.html;*.xml;*.txt", ""));
	}
	
	@Test
	void testInstantiateWildcard_4() {
		assertEquals("", Wildcard.instantiateWildcard("*.html;*.xml;*.txt;*.pdf", ""));
	}
	
	@Test
	void testInstantiateWildcard_5() {
		assertEquals("", Wildcard.instantiateWildcard("*.html;*.xml;*.txt;*.pdf;*.doc", ""));
	}
	
	@Test
	void testInstantiateWildcard_6() {
		assertEquals("", Wildcard.instantiateWildcard("*.html;*.xml;*.txt;*.pdf;*.doc;*.rtf", ""));
	}
	
	@Test
	void testInstantiateWildcard_7() {
		assertEquals("", Wildcard.instantiateWildcard("*.html;*.xml;*.txt;*.pdf;*.doc;*.rtf;*.xls", ""));
	}
	
	@Test
	void testInstantiateWildcard_8() {
		assertEquals("", Wildcard.instantiateWildcard("*.html;*.xml;*.txt;*.pdf;*.doc;*.rtf;*.xls;*.ppt", ""));
	}
	
	@Test
	void testInstantiateWildcard_9() {
		assertEquals("", Wildcard.instantiateWildcard("*.html;*.xml;*.txt;*.pdf;*.doc;*.rtf;*.xls;*.ppt;*.zip", ""));
	}
}