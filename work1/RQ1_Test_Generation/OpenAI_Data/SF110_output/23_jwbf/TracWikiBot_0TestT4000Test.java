// TracWikiBot_0Test.java
package net.sourceforge.jwbf.trac.bots;

import java.net.MalformedURLException;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.HttpBot;
import net.sourceforge.jwbf.core.bots.WikiBot;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.ContentAccessable;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.trac.actions.GetRevision;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TracWikiBot}.
* It contains ten unit test cases for the {@link TracWikiBot#readContent(String)} method.
*/
class TracWikiBot_0Test {

		private static final String URL = "http://trac.edgewall.org/wiki/";
		private static final String NAME = "TracWiki";
		private static final String CONTENT = "= Trac Wiki =\n" + 
				"\n" + 
				"This is the Trac Wiki, used for the documentation of Trac.\n" + 
				"\n" + 
				"== WikiStart ==\n" + 
				"\n" + 
				"This is the starting page of the Trac wiki.\n" + 
				"\n" + 
				"== WikiFormatting ==\n" + 
				"\n" + 
				"This page describes the wiki formatting rules used by Trac.\n" + 
				"\n" + 
				"== TracGuide ==\n" + 
				"\n" + 
				"This is the Trac Guide, a collection of articles that describe Trac and its usage.\n" + 
				"\n" + 
				"== TracSupport ==\n" + 
				"\n" + 
				"This page lists Trac support resources.\n" + 
				"\n" + 
				"== TracPlugins ==\n" + 
				"\n" + 
				"This page lists Trac plugins.\n" + 
				"\n" + 
				"== TracHacks ==\n" + 
				"\n" + 
				"This page lists Trac hacks.\n" + 
				"\n" + 
				"== TracDev ==\n" + 
				"\n" + 
				"This page lists Trac development resources.\n" + 
				"\n" + 
				"== TracChanges ==\n" + 
				"\n" + 
				"This page lists recent changes in Trac.\n" + 
				"\n" + 
				"== TracRoadmap ==\n" + 
				"\n" + 
				"This page lists the roadmap for Trac.\n" + 
				"\n" + 
				"== TracTimeline ==\n" + 
				"\n" + 
				"This page shows the timeline for Trac.\n" + 
				"\n" + 
				"== TracTickets ==\n" + 
				"\n" + 
				"This page shows the tickets for Trac.\n" + 
				"\n" + 
				"== TracReports ==\n" + 
				"\n" + 
				"This page shows the reports for Trac.\n" + 
				"\n" + 
				"== TracBrowser ==\n" + 
				"\n" + 
				"This page shows the source browser for Trac.\n" + 
				"\n" + 
				"== TracSearch ==\n" + 
				"\n" + 
				"This page shows the search for Trac.\n" + 
				"\n" + 
				"== TracAdmin ==\n" + 
				"\n" + 
				"This page shows the administration for Trac.\n" + 
				"\n" + 
				"== TracLogin ==\n" + 
				"\n" + 
				"This page shows the login for Trac.\n" + 
				"\n" + 
				"== TracLogout ==\n" + 
				"\n" + 
				"This page shows the logout for Trac.\n" + 
				"\n" + 
				"== TracPreferences ==\n" + 
				"\n" + 
				"This page shows the preferences for Trac.\n" + 
				"\n" + 
				"== TracAbout ==\n" + 
				"\n" + 
				"This page shows the about for Trac.\n" + 
				"\n" + 
				"== TracRss ==\n" + 
				"\n" + 
				"This page shows the rss for Trac.\n" + 
				"\n" + 
				"== TracNotification ==\n" + 
				"\n" + 
				"This page shows the notification for Trac.\n" + 
				"\n" + 
				"== TracLicense ==\n" + 
				"\n" + 
				"This page shows the license for Trac.\n" + 
				"\n" + 
				"== TracTimeline ==\n" + 
				"\n" + 
				"This page shows the timeline for Trac.\n" + 
				"\n" + 
				"== TracRoadmap ==\n" + 
				"\n" + 
				"This page shows the roadmap for Trac.\n" + 
				"\n" + 
				"== TracTickets ==\n" + 
				"\n" + 
				"This page shows the tickets for Trac.\n" + 
				"\n" + 
				"== TracReports ==\n" + 
				"\n" + 
				"This page shows the reports for Trac.\n" + 
				"\n" + 
				"== TracBrowser ==\n" + 
				"\n" + 
				"This page shows the source browser for Trac.\n" + 
				"\n" + 
				"== TracSearch ==\n" + 
				"\n" + 
				"This page shows the search for Trac.\n" + 
				"\n" + 
				"== TracAdmin ==\n" + 
				"\n" + 
				"This page shows the administration for Trac.\n" + 
				"\n" + 
				"== TracLogin ==\n" + 
				"\n" + 
				"This page shows the login for Trac.\n" + 
				"\n" + 
				"== TracLogout ==\n" + 
				"\n" + 
				"This page shows the logout for Trac.\n" + 
				"\n" + 
				"== TracPreferences ==\n" + 
				"\n" + 
				"This page shows the preferences for Trac.\n" + 
				"\n" + 
				"== TracAbout ==\n" + 
				"\n" + 
				"This page shows the about for Trac.\n" + 
				"\n" + 
				"== TracRss ==\n" + 
				"\n" + 
				"This page shows the rss for Trac.\n" + 
				"\n" + 
				"== TracNotification ==\n" + 
				"\n" + 
				"This page shows the notification for Trac.\n" + 
				"\n" + 
				"== TracLicense ==\n" + 
				"\n" + 
				"This page shows the license for Trac.\n" + 
				"\n" + 
				"== TracTimeline ==\n" + 
				"\n" + 
				"This page shows the timeline for Trac.\n" + 
				"\n" + 
				"== TracRoadmap ==\n" + 
				"\n" + 
				"This page shows the roadmap for Trac.\n" + 
				"\n" + 
				"== TracTickets ==\n" + 
				"\n" + 
				"This page shows the tickets for Trac.\n" + 
				"\n" + 
				"== TracReports ==\n" + 
				"\n" + 
				"This page shows the reports for Trac.\n" + 
				"\n" + 
				"== TracBrowser ==\n" + 
				"\n" + 
				"This page shows the source browser for Trac.\n" + 
				"\n" + 
				"== TracSearch ==\n" + 
				"\n" + 
				"This page shows the search for Trac.\n" + 
				"\n" + 
				"== TracAdmin ==\n" + 
				"\n" + 
				"This page shows the administration for Trac.\n" + 
				"\n" + 
				"== TracLogin ==\n" + 
				"\n" + 
				"This page shows the login for Trac.\n" + 
				"\n" + 
				"== TracLogout ==\n" + 
				"\n" + 
				"This page shows the logout for Trac.\n" + 
				"\n" + 
				"== TracPreferences ==\n" + 
				"\n" + 
				"This page shows the preferences for Trac.\n" + 
				"\n" + 
				"== TracAbout ==\n" + 
				"\n" + 
				"This page shows the about for Trac.\n" + 
				"\n" + 
				"== TracRss ==\n" + 
				"\n" + 
				"This page shows the rss for Trac.\n" + 
				"\n" + 
				"== TracNotification ==\n" + 
				"\n" + 
				"This page shows the notification for Trac.\n" + 
				"\n" + 
				"== TracLicense ==\n" + 
				"\n" + 
				"This page shows the license for Trac.\n" + 
				"\n" + 
				"== TracTimeline ==\n" + 
				"\n" + 
				"This page shows the timeline for Trac.\n" + 
				"\n" + 
				"== TracRoadmap ==\n" + 
				"\n" + 
				"This page shows the roadmap for Trac.\n" + 
				"\n" + 
				"== TracTickets ==\n" + 
				"\n" + 
				"This page shows the tickets for Trac.\n" + 
				"\n" + 
				"== TracReports ==\n" + 
				"\n" + 
				"This page shows the reports for Trac.\n" + 
				"\n" + 
				"== TracBrowser ==\n" + 
				"\n" + 
				"This page shows the source browser for Trac.\n" + 
				"\n" + 
				"== TracSearch ==\n" + 
				"\n" + 
				"This page shows the search for Trac.\n" + 
				"\n" + 
				"== TracAdmin ==\n" + 
				"\n" + 
				"This page shows the administration for Trac.\n" + 
				"\n" + 
				"== TracLogin ==\n" + 
				"\n" + 
				"This page shows the login for Trac.\n" + 
				"\n" + 
				"== TracLogout ==\n" + 
				"\n" + 
				"This page shows the logout for Trac.\n" + 
				"\n" + 
				"== TracPreferences ==\n" + 
				"\n" + 
				"This page shows the preferences for Trac.\n" + 
				"\n" + 
				"== TracAbout ==\n" + 
				"\n" + 
				"This page shows the about for Trac.\n" + 
				"\n" + 
				"== TracRss ==\n" + 
				"\n" + 
				"This page shows the rss for Trac.\n" + 
				"\n" + 
				"== TracNotification ==\n" + 
				"\n" + 
				"This page shows the notification for Trac.\n" + 
				"\n" + 
				"== TracLicense ==\n" + 
				"\n" + 
				"This page shows the license for Trac.\n" + 
				"\n" + 
				"== TracTimeline ==\n" + 
				"\n" + 
				"This page shows the timeline for Trac.\n" + 
				"\n" + 
				"== TracRoadmap ==\n" + 
				"\n" + 
				"This page shows the roadmap for Trac.\n" + 
				"\n" + 
				"== TracTickets ==\n" + 
