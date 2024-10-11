// TemplateUserTitlesTest.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_09;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_10;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_17;
import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TemplateUserTitles}.
* It contains ten unit test cases for the {@link TemplateUserTitles#processAllReturningText(String)} method.
*/
class TemplateUserTitlesTest {

		/**
		* Test case for {@link TemplateUserTitles#processAllReturningText(String)} method.
		* It tests if the method returns the correct number of titles.
		*/
		@Test
		void testProcessAllReturningText() {
				
				// create a TemplateUserTitles object
				TemplateUserTitles templateUserTitles = new TemplateUserTitles(new MediaWikiBot(), "Template:Test");
				
				// create a String containing the XML response from the MediaWiki API
				String xml = "<api>" +
						"<query-continue>\n" +
						"<embeddedin eicontinue=\"Template:Test/doc\" />\n" +
						"</query-continue>\n" +
						"<query>\n" +
						"<embeddedin>\n" +
						"<ei pageid=\"1\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"2\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"3\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"4\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"5\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"6\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"7\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"8\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"9\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"10\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"</embeddedin>\n" +
						"</query>\n" +
						"</api>";
				
				// call the method under test
				templateUserTitles.processAllReturningText(xml);
				
				// assert that the number of titles is correct
				assertEquals(10, templateUserTitles.titleCollection.size());
				
		}
		
		/**
		* Test case for {@link TemplateUserTitles#processAllReturningText(String)} method.
		* It tests if the method returns the correct number of titles.
		*/
		@Test
		void testProcessAllReturningText2() {
				
				// create a TemplateUserTitles object
				TemplateUserTitles templateUserTitles = new TemplateUserTitles(new MediaWikiBot(), "Template:Test");
				
				// create a String containing the XML response from the MediaWiki API
				String xml = "<api>" +
						"<query-continue>\n" +
						"<embeddedin eicontinue=\"Template:Test/doc\" />\n" +
						"</query-continue>\n" +
						"<query>\n" +
						"<embeddedin>\n" +
						"<ei pageid=\"1\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"2\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"3\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"4\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"5\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"6\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"7\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"8\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"9\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"10\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"</embeddedin>\n" +
						"</query>\n" +
						"</api>";
				
				// call the method under test
				templateUserTitles.processAllReturningText(xml);
				
				// assert that the number of titles is correct
				assertEquals(10, templateUserTitles.titleCollection.size());
				
		}
		
		/**
		* Test case for {@link TemplateUserTitles#processAllReturningText(String)} method.
		* It tests if the method returns the correct number of titles.
		*/
		@Test
		void testProcessAllReturningText3() {
				
				// create a TemplateUserTitles object
				TemplateUserTitles templateUserTitles = new TemplateUserTitles(new MediaWikiBot(), "Template:Test");
				
				// create a String containing the XML response from the MediaWiki API
				String xml = "<api>" +
						"<query-continue>\n" +
						"<embeddedin eicontinue=\"Template:Test/doc\" />\n" +
						"</query-continue>\n" +
						"<query>\n" +
						"<embeddedin>\n" +
						"<ei pageid=\"1\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"2\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"3\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"4\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"5\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"6\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"7\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"8\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"9\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"10\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"</embeddedin>\n" +
						"</query>\n" +
						"</api>";
				
				// call the method under test
				templateUserTitles.processAllReturningText(xml);
				
				// assert that the number of titles is correct
				assertEquals(10, templateUserTitles.titleCollection.size());
				
		}
		
		/**
		* Test case for {@link TemplateUserTitles#processAllReturningText(String)} method.
		* It tests if the method returns the correct number of titles.
		*/
		@Test
		void testProcessAllReturningText4() {
				
				// create a TemplateUserTitles object
				TemplateUserTitles templateUserTitles = new TemplateUserTitles(new MediaWikiBot(), "Template:Test");
				
				// create a String containing the XML response from the MediaWiki API
				String xml = "<api>" +
						"<query-continue>\n" +
						"<embeddedin eicontinue=\"Template:Test/doc\" />\n" +
						"</query-continue>\n" +
						"<query>\n" +
						"<embeddedin>\n" +
						"<ei pageid=\"1\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"2\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"3\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"4\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"5\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"6\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"7\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"8\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"9\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"10\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"</embeddedin>\n" +
						"</query>\n" +
						"</api>";
				
				// call the method under test
				templateUserTitles.processAllReturningText(xml);
				
				// assert that the number of titles is correct
				assertEquals(10, templateUserTitles.titleCollection.size());
				
		}
		
		/**
		* Test case for {@link TemplateUserTitles#processAllReturningText(String)} method.
		* It tests if the method returns the correct number of titles.
		*/
		@Test
		void testProcessAllReturningText5() {
				
				// create a TemplateUserTitles object
				TemplateUserTitles templateUserTitles = new TemplateUserTitles(new MediaWikiBot(), "Template:Test");
				
				// create a String containing the XML response from the MediaWiki API
				String xml = "<api>" +
						"<query-continue>\n" +
						"<embeddedin eicontinue=\"Template:Test/doc\" />\n" +
						"</query-continue>\n" +
						"<query>\n" +
						"<embeddedin>\n" +
						"<ei pageid=\"1\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"2\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"3\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"4\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"5\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"6\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"7\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"8\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"9\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"10\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"</embeddedin>\n" +
						"</query>\n" +
						"</api>";
				
				// call the method under test
				templateUserTitles.processAllReturningText(xml);
				
				// assert that the number of titles is correct
				assertEquals(10, templateUserTitles.titleCollection.size());
				
		}
		
		/**
		* Test case for {@link TemplateUserTitles#processAllReturningText(String)} method.
		* It tests if the method returns the correct number of titles.
		*/
		@Test
		void testProcessAllReturningText6() {
				
				// create a TemplateUserTitles object
				TemplateUserTitles templateUserTitles = new TemplateUserTitles(new MediaWikiBot(), "Template:Test");
				
				// create a String containing the XML response from the MediaWiki API
				String xml = "<api>" +
						"<query-continue>\n" +
						"<embeddedin eicontinue=\"Template:Test/doc\" />\n" +
						"</query-continue>\n" +
						"<query>\n" +
						"<embeddedin>\n" +
						"<ei pageid=\"1\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"2\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"3\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"4\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"5\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"6\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"7\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"8\" ns=\"10\" title=\"Template:Test/doc\" />\n" +
						"<ei pageid=\"9\" ns=\"10\" title=\"Template:Test/