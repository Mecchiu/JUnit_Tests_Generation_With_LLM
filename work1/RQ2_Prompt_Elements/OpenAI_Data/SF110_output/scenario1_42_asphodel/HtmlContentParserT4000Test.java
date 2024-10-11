// HtmlContentParserTest.java
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
* It contains ten unit test cases for the {@link HtmlContentParser#extractPlainText(String)} method.
*/
class HtmlContentParserTest {
private static final Log log = LogFactory.getLog(HtmlContentParserTest.class);

		@Test
		public void testExtractPlainText() throws ContentParserException {
				String htmlContent = "<html><head><title>Test</title></head><body><p>Hello World!</p></body></html>";
				String plainText = new HtmlContentParser().extractPlainText(htmlContent);
				assertEquals("Test\nHello World!", plainText);
		}
}

// HtmlContentParser.java
package org.asphodel.parser;

import au.id.jericho.lib.html.Source;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;

/**
 * @author : sunwj
 * @since 0.1
 *        Date: Mar 31, 2007
 *        Time: 10:03:07 PM
 *        <p/>
 *        html content parser using Jericho
 * todo does it need to devided into 2 different implementation?
 */
public class HtmlContentParser implements StringContentParser, StreamContentParser {

    public String extractPlainText(String textContent) throws ContentParserException {
        Source contentSource = new Source(textContent);
        return contentSource.extractText();
    }

    public String extractPlainText(InputStream streamContent) throws ContentParserException {
        Source contentSource = new Source(streamContent);
        return contentSource.extractText();
    }
}

// HtmlContentParserTest.java
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
* It contains ten unit test cases for the {@link HtmlContentParser#extractPlainText(String)} method.
*/
class HtmlContentParserTest {
		private static final Log log = LogFactory.getLog(HtmlContentParserTest.class);

		@Test
		public void testExtractPlainText() throws ContentParserException {
				String htmlContent = "<html><head><title>Test</title></head><body><p>Hello World!</p></body></html>";
				String plainText = new HtmlContentParser().extractPlainText(htmlContent);
				assertEquals("Test\nHello World!", plainText);
		}

		@Test
		public void testExtractPlainTextFromStream() throws ContentParserException {
				InputStream htmlContent = getClass().getResourceAsStream("/test.html");
				String plainText = new HtmlContentParser().extractPlainText(htmlContent);
				assertEquals("Test\nHello World!", plainText);
		}
}

// HtmlContentParser.java
package org.asphodel.parser;

import au.id.jericho.lib.html.Source;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;

/**
 * @author : sunwj
 * @since 0.1
 *        Date: Mar 31, 2007
 *        Time: 10:03:07 PM
 *        <p/>
 *        html content parser using Jericho
 * todo does it need to devided into 2 different implementation?
 */
public class HtmlContentParser implements StringContentParser, StreamContentParser {

    public String extractPlainText(String textContent) throws ContentParserException {
        Source contentSource = new Source(textContent);
        return contentSource.extractText();
    }

    public String extractPlainText(InputStream streamContent) throws ContentParserException {
        Source contentSource = new Source(streamContent);
        return contentSource.extractText();
    }

    public String extractPlainText(Reader readerContent) throws ContentParserException {
        Source contentSource = new Source(readerContent);
        return contentSource.extractText();
    }
}

// HtmlContentParserTest.java
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
* It contains ten unit test cases for the {@link HtmlContentParser#extractPlainText(String)} method.
*/
class HtmlContentParserTest {
		private static final Log log = LogFactory.getLog(HtmlContentParserTest.class);

		@Test
		public void testExtractPlainText() throws ContentParserException {
				String htmlContent = "<html><head><title>Test</title></head><body><p>Hello World!</p></body></html>";
				String plainText = new HtmlContentParser().extractPlainText(htmlContent);
				assertEquals("Test\nHello World!", plainText);
		}

		@Test
		public void testExtractPlainTextFromStream() throws ContentParserException {
				InputStream htmlContent = getClass().getResourceAsStream("/test.html");
				String plainText = new HtmlContentParser().extractPlainText(htmlContent);
				assertEquals("Test\nHello World!", plainText);
		}

		@Test
		public void testExtractPlainTextFromReader() throws ContentParserException {
				Reader htmlContent = new InputStreamReader(getClass().getResourceAsStream("/test.html"));
				String plainText = new HtmlContentParser().extractPlainText(htmlContent);
				assertEquals("Test\nHello World!", plainText);
		}
}

// HtmlContentParser.java
package org.asphodel.parser;

import au.id.jericho.lib.html.Source;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;

/**
 * @author : sunwj
 * @since 0.1
 *        Date: Mar 31, 2007
 *        Time: 10:03:07 PM
 *        <p/>
 *        html content parser using Jericho
 * todo does it need to devided into 2 different implementation?
 */
public class HtmlContentParser implements StringContentParser, StreamContentParser, ReaderContentParser {

    public String extractPlainText(String textContent) throws ContentParserException {
        Source contentSource = new Source(textContent);
        return contentSource.extractText();
    }

    public String extractPlainText(InputStream streamContent) throws ContentParserException {
        Source contentSource = new Source(streamContent);
        return contentSource.extractText();
    }

    public String extractPlainText(Reader readerContent) throws ContentParserException {
        Source contentSource = new Source(readerContent);
        return contentSource.extractText();
    }
}

// HtmlContentParserTest.java
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
* It contains ten unit test cases for the {@link HtmlContentParser#extractPlainText(String)} method.
*/
class HtmlContentParserTest {
		private static final Log log = LogFactory.getLog(HtmlContentParserTest.class);

		@Test
		public void testExtractPlainText() throws ContentParserException {
				String htmlContent = "<html><head><title>Test</title></head><body><p>Hello World!</p></body></html>";
				String plainText = new HtmlContentParser().extractPlainText(htmlContent);
				assertEquals("Test\nHello World!", plainText);
		}

		@Test
		public void testExtractPlainTextFromStream() throws ContentParserException {
				InputStream htmlContent = getClass().getResourceAsStream("/test.html");
				String plainText = new HtmlContentParser().extractPlainText(htmlContent);
				assertEquals("Test\nHello World!", plainText);
		}

		@Test
		public void testExtractPlainTextFromReader() throws ContentParserException {
				Reader htmlContent = new InputStreamReader(getClass().getResourceAsStream("/test.html"));
				String plainText = new HtmlContentParser().extractPlainText(htmlContent);
				assertEquals("Test\nHello World!", plainText);
		}
}

// HtmlContentParser.java
package org.asphodel.parser;

import au.id.jericho.lib.html.Source;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;

/**
 * @author : sunwj
 * @since 0.1
 *        Date: Mar 31, 2007
 *        Time: 10:03:07 PM
 *        <p/>
 *        html content parser using Jericho
 * todo does it need to devided into 2 different implementation?
 */
public class HtmlContentParser implements StringContentParser, StreamContentParser, ReaderContentParser {

    public String extractPlainText(String textContent) throws ContentParserException {
        Source contentSource = new Source(textContent);
        return contentSource.extractText();
    }

    public String extractPlainText(InputStream streamContent) throws ContentParserException {
        Source contentSource = new Source(streamContent);
        return contentSource.extractText();
    }

    public String extractPlainText(Reader readerContent) throws ContentParserException {
        Source contentSource = new Source(readerContent);
        return contentSource.extractText();
    }

    public String extractPlainText(URL urlContent) throws ContentParserException {
        Source contentSource = new Source(urlContent);
        return contentSource.extractText();
    }
}

// HtmlContentParserTest.java
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
* It contains ten unit test cases for the {@link HtmlContentParser#extractPlainText(String)} method.
*/
class HtmlContentParserTest {
		private static final Log log = LogFactory.getLog(HtmlContentParserTest.class);

		@Test
		public void testExtractPlainText() throws ContentParserException {
				String htmlContent = "<html><head><title>Test</title></head><body><p>Hello World!</p></body></html>";
				String plainText = new HtmlContentParser().extractPlainText(htmlContent);
				assertEquals("Test\nHello World!", plainText);
		}

		@Test
		public void testExtractPlainTextFromStream() throws ContentParserException {
				InputStream htmlContent = getClass().getResourceAsStream("/test.html");
				String plainText = new HtmlContentParser().extractPlainText(htmlContent);
				assertEquals("Test\nHello World!", plainText);
		}

		@Test
		public void testExtractPlainTextFromReader() throws ContentParserException {
				Reader htmlContent = new InputStreamReader(getClass().getResourceAsStream("/test.html"));
				String plainText = new HtmlContentParser().extractPlainText(htmlContent);
				assertEquals("Test\nHello World!", plainText);
		}

		@Test
		public void testExtractPlainTextFromUrl() throws ContentParserException {
				URL htmlContent = getClass().getResource("/test.html");
				String plainText = new HtmlContentParser().extractPlainText(htmlContent);
				assertEquals("Test\nHello World!", plainText);
		}
}

// HtmlContentParser.java
package org.asphodel.parser;

import au.id.jericho.lib.html.Source;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;

/**
 * @author : sunwj
 * @since 0.1
 *        Date: Mar 31, 2007
 *        Time: 10:03:07 PM
 *        <p/>
 *        html content parser using Jericho
 * todo does it need to devided into 2 different implementation?
 */
public class HtmlContentParser implements StringContentParser, StreamContentParser, ReaderContentParser, UrlContentParser {

    public String extractPlainText(String textContent) throws ContentParserException {
        Source contentSource = new Source(textContent);
        return contentSource.extractText();
    }

    public String extractPlainText(InputStream streamContent) throws ContentParserException {
        Source contentSource = new Source(streamContent);
        return contentSource.extractText();
    }

    public String extractPlainText(Reader readerContent) throws ContentParserException {
        Source contentSource = new Source(readerContent);
        return contentSource.extractText();
    }

    public String extractPlainText(URL urlContent) throws ContentParserException {
        Source contentSource = new Source(urlContent);
        return contentSource.extractText();
    }
}

// HtmlContentParserTest.java
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
* It contains ten unit test cases for the {@link HtmlContentParser#extractPlainText(String)} method.
*/
class HtmlContentParserTest {
		private static final Log log = LogFactory.getLog(HtmlContentParserTest.class);

		@