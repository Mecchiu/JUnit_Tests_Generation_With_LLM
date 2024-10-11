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
				String xml = "<?xml version=\"1.0\"?>\n" +
						"<api>\n" +
						"  <query>\n" +
						"    <embeddedin>\n" +
						"      <ei pageid=\"1\" ns=\"0\" title=\"Test\" />\n" +
						"      <ei pageid=\"2\" ns=\"0\" title=\"Test2\" />\n" +
						"      <ei pageid=\"3\" ns=\"0\" title=\"Test3\" />\n" +
						"    </embeddedin>\n" +
						"  </query>\n" +
						"</api>";
				
				// call the method under test
				templateUserTitles.processAllReturningText(xml);
				
				// assert that the number of titles is correct
				assertEquals(3, templateUserTitles.getSize());
				
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
				String xml = "<?xml version=\"1.0\"?>\n" +
						"<api>\n" +
						"  <query>\n" +
						"    <embeddedin>\n" +
						"      <ei pageid=\"1\" ns=\"0\" title=\"Test\" />\n" +
						"      <ei pageid=\"2\" ns=\"0\" title=\"Test2\" />\n" +
						"      <ei pageid=\"3\" ns=\"0\" title=\"Test3\" />\n" +
						"      <ei pageid=\"4\" ns=\"0\" title=\"Test4\" />\n" +
						"      <ei pageid=\"5\" ns=\"0\" title=\"Test5\" />\n" +
						"      <ei pageid=\"6\" ns=\"0\" title=\"Test6\" />\n" +
						"      <ei pageid=\"7\" ns=\"0\" title=\"Test7\" />\n" +
						"      <ei pageid=\"8\" ns=\"0\" title=\"Test8\" />\n" +
						"      <ei pageid=\"9\" ns=\"0\" title=\"Test9\" />\n" +
						"      <ei pageid=\"10\" ns=\"0\" title=\"Test10\" />\n" +
						"      <ei pageid=\"11\" ns=\"0\" title=\"Test11\" />\n" +
						"      <ei pageid=\"12\" ns=\"0\" title=\"Test12\" />\n" +
						"      <ei pageid=\"13\" ns=\"0\" title=\"Test13\" />\n" +
						"      <ei pageid=\"14\" ns=\"0\" title=\"Test14\" />\n" +
						"      <ei pageid=\"15\" ns=\"0\" title=\"Test15\" />\n" +
						"      <ei pageid=\"16\" ns=\"0\" title=\"Test16\" />\n" +
						"      <ei pageid=\"17\" ns=\"0\" title=\"Test17\" />\n" +
						"      <ei pageid=\"18\" ns=\"0\" title=\"Test18\" />\n" +
						"      <ei pageid=\"19\" ns=\"0\" title=\"Test19\" />\n" +
						"      <ei pageid=\"20\" ns=\"0\" title=\"Test20\" />\n" +
						"      <ei pageid=\"21\" ns=\"0\" title=\"Test21\" />\n" +
						"      <ei pageid=\"22\" ns=\"0\" title=\"Test22\" />\n" +
						"      <ei pageid=\"23\" ns=\"0\" title=\"Test23\" />\n" +
						"      <ei pageid=\"24\" ns=\"0\" title=\"Test24\" />\n" +
						"      <ei pageid=\"25\" ns=\"0\" title=\"Test25\" />\n" +
						"      <ei pageid=\"26\" ns=\"0\" title=\"Test26\" />\n" +
						"      <ei pageid=\"27\" ns=\"0\" title=\"Test27\" />\n" +
						"      <ei pageid=\"28\" ns=\"0\" title=\"Test28\" />\n" +
						"      <ei pageid=\"29\" ns=\"0\" title=\"Test29\" />\n" +
						"      <ei pageid=\"30\" ns=\"0\" title=\"Test30\" />\n" +
						"      <ei pageid=\"31\" ns=\"0\" title=\"Test31\" />\n" +
						"      <ei pageid=\"32\" ns=\"0\" title=\"Test32\" />\n" +
						"      <ei pageid=\"33\" ns=\"0\" title=\"Test33\" />\n" +
						"      <ei pageid=\"34\" ns=\"0\" title=\"Test34\" />\n" +
						"      <ei pageid=\"35\" ns=\"0\" title=\"Test35\" />\n" +
						"      <ei pageid=\"36\" ns=\"0\" title=\"Test36\" />\n" +
						"      <ei pageid=\"37\" ns=\"0\" title=\"Test37\" />\n" +
						"      <ei pageid=\"38\" ns=\"0\" title=\"Test38\" />\n" +
						"      <ei pageid=\"39\" ns=\"0\" title=\"Test39\" />\n" +
						"      <ei pageid=\"40\" ns=\"0\" title=\"Test40\" />\n" +
						"      <ei pageid=\"41\" ns=\"0\" title=\"Test41\" />\n" +
						"      <ei pageid=\"42\" ns=\"0\" title=\"Test42\" />\n" +
						"      <ei pageid=\"43\" ns=\"0\" title=\"Test43\" />\n" +
						"      <ei pageid=\"44\" ns=\"0\" title=\"Test44\" />\n" +
						"      <ei pageid=\"45\" ns=\"0\" title=\"Test45\" />\n" +
						"      <ei pageid