// XTreeUtilTest.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.sax.*;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.*;
import org.iso_relax.verifier.*;
import nu.staldal.xmlutil.ContentHandlerFixer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XTreeUtil}.
* It contains ten unit test cases for the {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
*/
class XTreeUtilTest {

	/**
	* Test case for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
	* Test case for the scenario when the input source is null.
	* Expected result is that the method should throw a NullPointerException.
	*/
	@Test
	public void testParseXML_NullInputSource() {
		assertThrows(NullPointerException.class, () -> {
			XTreeUtil.parseXML(null, false, null, null);
		});
	}
	
	/**
	* Test case for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
	* Test case for the scenario when the input source is not null but the input stream is null.
	* Expected result is that the method should throw a NullPointerException.
	*/
	@Test
	public void testParseXML_NullInputStream() {
		assertThrows(NullPointerException.class, () -> {
			XTreeUtil.parseXML(new InputSource(), false, null, null);
		});
	}
	
	/**
	* Test case for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
	* Test case for the scenario when the input source is not null but the input stream is null.
	* Expected result is that the method should throw a NullPointerException.
	*/
	@Test
	public void testParseXML_NullInputStream2() {
		assertThrows(NullPointerException.class, () -> {
			XTreeUtil.parseXML(new InputSource(new StringReader("")), false, null, null);
		});
	}
	
	/**
	* Test case for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
	* Test case for the scenario when the input source is not null but the input stream is null.
	* Expected result is that the method should throw a NullPointerException.
	*/
	@Test
	public void testParseXML_NullInputStream3() {
		assertThrows(NullPointerException.class, () -> {
			XTreeUtil.parseXML(new InputSource(new StringReader("")), false, null, new InputSource());
		});
	}
	
	/**
	* Test case for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
	* Test case for the scenario when the input source is not null but the input stream is null.
	* Expected result is that the method should throw a NullPointerException.
	*/
	@Test
	public void testParseXML_NullInputStream4() {
		assertThrows(NullPointerException.class, () -> {
			XTreeUtil.parseXML(new InputSource(new StringReader("")), false, "", new InputSource());
		});
	}
	
	/**
	* Test case for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
	* Test case for the scenario when the input source is not null but the input stream is null.
	* Expected result is that the method should throw a NullPointerException.
	*/
	@Test
	public void testParseXML_NullInputStream5() {
		assertThrows(NullPointerException.class, () -> {
			XTreeUtil.parseXML(new InputSource(new StringReader("")), false, "", new InputSource(new StringReader("")));
		});
	}
	
	/**
	* Test case for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
	* Test case for the scenario when the input source is not null but the input stream is null.
	* Expected result is that the method should throw a NullPointerException.
	*/
	@Test
	public void testParseXML_NullInputStream6() {
		assertThrows(NullPointerException.class, () -> {
			XTreeUtil.parseXML(new InputSource(new StringReader("")), false, "", new InputSource(new StringReader("")));
		});
	}
	
	/**
	* Test case for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
	* Test case for the scenario when the input source is not null but the input stream is null.
	* Expected result is that the method should throw a NullPointerException.
	*/
	@Test
	public void testParseXML_NullInputStream7() {
		assertThrows(NullPointerException.class, () -> {
			XTreeUtil.parseXML(new InputSource(new StringReader("")), false, "", new InputSource(new StringReader("")));
		});
	}
	
	/**
	* Test case for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
	* Test case for the scenario when the input source is not null but the input stream is null.
	* Expected result is that the method should throw a NullPointerException.
	*/
	@Test
	public void testParseXML_NullInputStream8() {
		assertThrows(NullPointerException.class, () -> {
			XTreeUtil.parseXML(new InputSource(new StringReader("")), false, "", new InputSource(new StringReader("")));
		});
	}
	
	/**
	* Test case for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
	* Test case for the scenario when the input source is not null but the input stream is null.
	* Expected result is that the method should throw a NullPointerException.
	*/
	@Test
	public void testParseXML_NullInputStream9() {
		assertThrows(NullPointerException.class, () -> {
			XTreeUtil.parseXML(new InputSource(new StringReader("")), false, "", new InputSource(new StringReader("")));
		});
	}
	
	/**
	* Test case for {@link XTreeUtil#parseXML(InputSource, boolean, String, InputSource)} method.
	* Test case for the scenario when the input source is not null but the input stream is null.
	* Expected result is that the method should throw a NullPointerException.
	*/
	@Test
	public void testParseXML_NullInputStream10() {
		assertThrows(NullPointerException.class, () -> {
			XTreeUtil.parseXML(new InputSource(new StringReader("")), false, "", new InputSource(new StringReader("")));
		});
	}
}