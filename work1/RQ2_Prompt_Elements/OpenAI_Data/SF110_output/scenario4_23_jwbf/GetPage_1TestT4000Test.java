// GetPage_1Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains ten unit test cases for the {@link GetPage#processReturningText(String, HttpAction)} method.
*/
class GetPage_1Test {

	/**
	 * Test method for {@link GetPage#processReturningText(String, HttpAction)}.
	 * @throws ProcessException on any problems with inner browser
	 */
	@Test
	void testProcessReturningText() throws ProcessException {
		
		GetPage gp = new GetPage("http://www.google.de");
		
		String s = "";
		HttpAction hm = null;
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "GET");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "POST");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "HEAD");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "PUT");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "DELETE");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "TRACE");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "OPTIONS");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "CONNECT");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "PATCH");
		
		assertEquals("", gp.processReturningText(s, hm));
		
	}
	
}

// GetPage_2Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains ten unit test cases for the {@link GetPage#processReturningText(String, HttpAction)} method.
*/
class GetPage_2Test {
		
	/**
	 * Test method for {@link GetPage#processReturningText(String, HttpAction)}.
	 * @throws ProcessException on any problems with inner browser
	 */
	@Test
	void testProcessReturningText() throws ProcessException {
		
		GetPage gp = new GetPage("http://www.google.de");
		
		String s = "";
		HttpAction hm = null;
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "GET");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "POST");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "HEAD");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "PUT");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "DELETE");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "TRACE");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "OPTIONS");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "CONNECT");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "PATCH");
		
		assertEquals("", gp.processReturningText(s, hm));
		
	}
	
}

// GetPage_3Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains ten unit test cases for the {@link GetPage#processReturningText(String, HttpAction)} method.
*/
class GetPage_3Test {
		
	/**
	 * Test method for {@link GetPage#processReturningText(String, HttpAction)}.
	 * @throws ProcessException on any problems with inner browser
	 */
	@Test
	void testProcessReturningText() throws ProcessException {
		
		GetPage gp = new GetPage("http://www.google.de");
		
		String s = "";
		HttpAction hm = null;
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "GET");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "POST");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "HEAD");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "PUT");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "DELETE");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "TRACE");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "OPTIONS");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "CONNECT");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "PATCH");
		
		assertEquals("", gp.processReturningText(s, hm));
		
	}
	
}

// GetPage_4Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains ten unit test cases for the {@link GetPage#processReturningText(String, HttpAction)} method.
*/
class GetPage_4Test {
		
	/**
	 * Test method for {@link GetPage#processReturningText(String, HttpAction)}.
	 * @throws ProcessException on any problems with inner browser
	 */
	@Test
	void testProcessReturningText() throws ProcessException {
		
		GetPage gp = new GetPage("http://www.google.de");
		
		String s = "";
		HttpAction hm = null;
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "GET");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "POST");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "HEAD");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "PUT");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "DELETE");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "TRACE");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "OPTIONS");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "CONNECT");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "PATCH");
		
		assertEquals("", gp.processReturningText(s, hm));
		
	}
	
}

// GetPage_5Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains ten unit test cases for the {@link GetPage#processReturningText(String, HttpAction)} method.
*/
class GetPage_5Test {
		
	/**
	 * Test method for {@link GetPage#processReturningText(String, HttpAction)}.
	 * @throws ProcessException on any problems with inner browser
	 */
	@Test
	void testProcessReturningText() throws ProcessException {
		
		GetPage gp = new GetPage("http://www.google.de");
		
		String s = "";
		HttpAction hm = null;
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "GET");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "POST");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "HEAD");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "PUT");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "DELETE");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "TRACE");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "OPTIONS");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "CONNECT");
		
		assertEquals("", gp.processReturningText(s, hm));
		
		s = "";
		hm = new HttpAction("http://www.google.de", "PATCH");
		
		assertEquals("", gp.processReturningText(s, hm));
		
	}
	
}

// GetPage_6Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains ten unit test cases for the {@link GetPage#processReturningText(String, HttpAction)} method.
*/
class GetPage_6Test {
		
	/**
	 * Test method for {@link GetPage#processReturningText(String, HttpAction)}.
	 * @throws ProcessException on any problems with inner browser
	 */
	@Test
	void testProcessReturningText() throws ProcessException {
		
		GetPage gp = new GetPage("http://www.google