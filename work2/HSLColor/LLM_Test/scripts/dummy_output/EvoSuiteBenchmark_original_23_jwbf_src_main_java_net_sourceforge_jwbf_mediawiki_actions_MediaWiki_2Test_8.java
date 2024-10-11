// MediaWiki_2Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains one unit test case for the {@link MediaWiki#decode(String)} method.
*/
class MediaWiki_2Test {
		private final String text = "&text=&source=mw_en_us&format=json&source=en_us&content-type=text/json";
		private final Set<String> params = new HashSet<>();
		private final Set<String> params_two = new HashSet<>();
		private final Set<String> params_three = new HashSet<>();
		{
			params.add("source=mw_en_us");
			params_two.add("content-type=text/html");
			params.add("source=en_us");
			params_three.add("format=json");
		}
		/**
	* Checks if the string parameter can be parsed out of the encoding.
	*/
	@Test
	void parseStringParameterParsingWorks() throws UnsupportedEncodingException {
		assertEquals("decode", MediaWiki_2Test.class.getSimpleName() + "." + MediaWiki_2Test.class.getName(),
			MediaWiki_2Test.class.getMethod("parseStringParameter" + "ParameterParsing", String.class).invoke(MediaWiki_2Test.class, text).getName());
	}
	@Test
	void makeRequestReturnsOK() {
		String request = MediaWiki_2Test.class.getMethod("makeRequest", String.class)
			.invoke(MediaWiki_2Test.class, text);
		assertEquals("", request);
	}
	@Test
	void makeRequestStringParameterParsingWorks() {
		assertEquals("&format=json&source=mw_al_en&content-type=application/json",
			MediaWiki_2Test.class.getSimpleName() + "." + MediaWiki_2Test.class.getMethod("makeRequestStringParameter" + "ParameterParsing", String.class)
				.invoke(MediaWiki_2Test.class, text).getName());
	}
	@Test
	void makeRequestReturnsOKWithSource() {
		assertEquals("mw_al_en_us", MediaWiki_2Test.class.getSimpleName() + "." + MediaWiki_2Test.class.getMethod("makeRequest"
			+ "ParameterSource", String.class)
			.invoke(MediaWiki_2Test.class, text));
	}
	@Test
	void makeRequestStringParameterParsingWorksWithContentType() {
		assertEquals("json", MediaWiki_2Test.class.getSimpleName() + "." + MediaWiki_2Test.class.getMethod("makeRequestStringParameter"
			+ "ParameterParsing", String.class)
			.invoke(MediaWiki_2Test.class, text)
			.getName()
			.replaceAll("contentType", "format"));
	}
@Test
void makeRequestStringParameterParsingWorksWithUnknown(String s) {
	assertEquals("mw_al_en_us.html", MediaWiki_2Test.class.getSimpleName() + "." + MediaWiki_2Test.class.getMethod("makeRequest",
			String.class)
			.invoke(MediaWiki_2Test.class, s)
			.getName()
			.replaceAll("contentType", "format"));
	}
}