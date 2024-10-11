// HtmlContentParser_0Test.java
package org.asphodel.parser;

import au.id.jericho.lib.html.Source;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HtmlContentParser}.
* It contains one unit test case for the {@link HtmlContentParser#extractPlainText(String)} method.
*/
class HtmlContentParser_0Test {
		static HtmlContentParser parser;
		final static String text1 = "<html><div><p><div";
		final static String text2 = "</p><div></p><div></div>";
		static {
			URL url = Thread.currentThread().getContextClassLoader().getResource("META-INF/resources/asphodel.properties");
			InputStream in = url.openStream();
			InputStreamReader isr = new InputStreamReader(in, "UTF-8");
			Reader reader = new BufferedReader(isr);

			Source contentSource = new Source(reader);
			parser = new HtmlContentParser();

			StringBuilder sb1 = new StringBuilder();
			sb1.append(contentSource.extractText());

			StringBuilder sb2 = new StringBuilder();
			sb2.append(parser.extractPlainText(sb1.toString()));

		    log.info("The Text Extract:\n"+sb2);
		}

		Test.class;

		{
		}
}