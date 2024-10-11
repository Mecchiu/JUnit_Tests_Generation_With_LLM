// GetApiTokenTest.java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.io.IOException;
import java.io.StringReader;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetApiToken}.
* It contains one unit test case for the {@link GetApiToken#hasMoreMessages()} method.
*/
class GetApiTokenTest {

	private class TestGetApiToken extends GetApiToken {
			
		public TestGetApiToken() {
			super(getContent("TestGetApiToken.xml"), MW1_12, MW1_13, MW1_14, MW1_15, MW1_16);
		}
		
		@Override
		protected boolean hasMoreMessages() {
			return true;
		}
		
	}
	
	private final String content = "<test><text</text>" + "<text></text></test>";
	
	/**
	 * {@inheritDoc}
	 */
	public int run(@SuppressWarnings("rawtypes") Class[] arguments) {
		
		final String contentName = getParameterAsString("content.name");
		
		final Document sourceContent = createDocumentWithTmpContent(contentName, content);
		
		final Source wikitextSource = getWikitext(sourceContent, Version.TEST);
		
        return run(wikitextSource, getVersion());
	}

	/**
	 * {@inheritDoc}
	 */
	protected void assertParsed(final Document content, final Version version, final String name) {
		
        assertNotNull(name);
        assertTrue(processResponse(name),  "getApiToken", content);
        assertTrue(getVersion().ordinal() > version.ordinal());
		
	}
	
	private Document createDocumentWithTmpContent(final String contentName, final String contentContent)
		throws IOException, JDOMException, VersionException {
			
        Document sourceContent = null;
        try {
            sourceContent = new SAXBuilder().build(new StringReader(contentContent));
        } catch (JDOMException ex) {
            // ignore
        }
        
        final Element sourceContentElement = sourceContent.getRootElement();
        Source wikiXml = new Source().withNamespace(new Version().nsp()).withContent(sourceContentElement);

        final Element sourceEditEdit = sourceXml.getChild( "editEdit" );
        if (sourceEditEdit!= null) {
            sourceEditEdit.setAttribute( "xmlns", "http://www.mediawiki.org/xml/interwiki/1.0" );
        }

        return sourceContent;
		
	}
	
	
	/**
	 * {@inheritDoc}
	 */
	protected Document getContent(final String file) {
		
		return getContent("data/" + file);
        /*
        final Document content = createDocumentWithTmpContent("TestGetApiToken", contentContent);

        Source wikitextSource = getWikitext(content, MW1_12);

        assertParsed(wikitextSource, MW1_12);

        assertParsed(wikitextSource, MW1_13);

        assertParsed(wikitextSource, MW1_14);

        assertParsed(wikitextSource, MW1_15);

        assertParsed(wikitextSource, MW1_16);

        return wikiXml;
		 * */
	}

	/** {@inheritDoc} */
	public int run(final Source wikitextSource, final Version version) {
		
		try {
			final InputSource wikitextInputSource = wikitextSource.get("test.xml");
			final InputSource sourceContentInputSource = wikitextInputSource.getInputSource();
								
			final String title = getContent("./test.xml/title");
			final String text = getContent("./test.xml/text");

			assertNotNull(title);

            assertParsed(sourceContentInputSource, version, "./test.xml/title");
			assertParsed(sourceContentInputSource, version, "./test.xml/text");
			
			return run(wikitextInputSource, sourceContentInputSource, version);

		} catch (ProcessException ex) {
			