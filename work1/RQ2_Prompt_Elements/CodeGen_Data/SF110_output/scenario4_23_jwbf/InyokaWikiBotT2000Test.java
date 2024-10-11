// InyokaWikiBotTest.java
package net.sourceforge.jwbf.inyoka.bots;

import java.net.MalformedURLException;
import java.util.Map;
import java.util.Set;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.HttpBot;
import net.sourceforge.jwbf.core.bots.WikiBot;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.inyoka.actions.GetRevision;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InyokaWikiBot}.
* It contains one unit test case for the {@link InyokaWikiBot#getArticle(String)} method.
*/
class InyokaWikiBotTest {
private static final String WIKI_HOST = "http://wiki.ubuntuusers.de";
		static final String MAIN_HTML_TEMPLATE = "<main>";

		public boolean hasWikiType() {
		}

		/**
		 * Test method for {@link net.sourceforge.jwbf.inyoka.bots.InyokaWikiBot#getArticle(String)}
		 * with empty name and empty properties.
		 * @throws {@link java.io.UnsupportedEncodingException}
		 * @throws MalformedURLException
		 * @throws ProcessException
		 */
		@Test
		public final void testGetArticle001() throws MalformedURLException, UnsupportedEncodingException,
		ProcessException {
			WikiBot wiki = new InyokaWikiBot();
			// Create article
			Article article = wiki.getArticle(null);
			assertNotNull(article);
			// No content, but one of it's properties must be set
			Set<String> badNames = article.getNames();
			assertEquals(1, badNames.size());
			assertTrue(badNames.stream().anyMatch(n -> n.equals("welcome") || n.equals("what-about")));
			// Not set properties, should return the article's properties, even if properties were defined in the configuration
			Map<String,Integer> props = article.getProperties();
			assertNull(props);
			// No properties, but it must be set when calling readData
			article.setProperties(null);
			props = article.getProperties();
			assertNull(props);
			// Set the properties of article to have their names set, even when their values should be empty strings.
			article.setProperties(new int[] { DEFAULT } );
			props = article.getProperties();
			assertFalse("Returned properties cannot contain any names other than ''", props.keySet().contains("name"));
			
		}
		
		/**Test method for {@link net.sourceforge.jwbf.inyoka.bots.InyokaWikiBot#getArticle(String)}
		 * with empty name and a content file.
		 */
		@Test
		public final void testGetArticle002() throws ProcessException, MalformedURLException {
			WikiBot wiki = new InyokaWikiBot(WIKI_HOST);
			
			// Create article
			Article article = wiki.getArticle(null);
			assertNotNull(article);
			// No content, but one of it's properties must be set
			Set<String> badNames = article.getNames();
			assertEquals(1, badNames.size());
			assertTrue(badNames.stream().anyMatch(n -> n.equals("welcome") || n.equals("what-about")));
			// No properties, but it must be set when calling readData
			article.setProperties(null);
			
			// Content
			File file1 = new File(FILE);
			Article fileData = WikiTool.readFile(WIKI_HOST, file1);
			
			// Call method again
			article = wiki.getArticle(null);
			
			// No more properties, no content, only article's properties
			Set<String> badNames1 = article.getNames();
			assertEquals(0, badNames1.size());
			assertTrue(badNames1.isEmpty());
			Set<String> badName = article.getNames();
			assertEquals(0, badName.size());
			try {
				article.getProperties();
			} catch (ActionException e) {
				// Should not happen anymore (no default properties)
			}
			// Get the article from readData(), in that case it must still contain the values (which the test method
			// should not contain)
			article = WikiTool.readData(article.getName(), article.getProperties());
			Map<String, Integer> props1 = article.getProperties();
			assertEquals(fileData.getProperties().size(), props1.size());
			// There should be no non-empty properties, not even if the configuration file itself provided
			props1 = article.getProperties();
			Set<String> illegalNames = article.getNames();
			Set<String> illegalNames1 = article.getNames();
			
			IllegalNameException illegalNameException = null;
			try {
				article.getProperties();
				
			} catch (IllegalNameException e) {
				illegalNameException = e;
			}
			
			// Check the contents of file1 against article after we added illegalNames
			