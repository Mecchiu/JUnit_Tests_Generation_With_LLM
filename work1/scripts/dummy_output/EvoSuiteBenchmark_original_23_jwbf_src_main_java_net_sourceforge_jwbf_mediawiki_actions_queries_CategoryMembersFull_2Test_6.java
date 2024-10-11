// CategoryMembersFull_2Test.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import net.sourceforge.jwbf.mediawiki.contentRep.CategoryItem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CategoryMembersFull}.
* It contains one unit test case for the {@link CategoryMembersFull#next()} method.
*/
class CategoryMembersFull_2Test {
		
	/**
	 * A Test instance that contains a list of all supported versions.
	 */
	@Test
	@Slf4j
	public void isIterableOfSuccess() {

		Collection<SupportedBy> collectionOfSupportedBy = new ArrayList<SupportedBy>();
		collectionOfSupportedBy.add(SupportedBy.JWBF_1_6);
		collectionOfSupportedBy.add(SupportedBy.JWBF_1_7);


		Collection<Version> versionCollection = new ArrayList<Version>();

		Version version1 = Version.fromVersion(MW1_11);
		Version version2 = Version.fromVersion(MW1_12);
		Version version3 = Version.fromVersion(MW1_13);
		Version version4 = Version.fromVersion(MW1_14);
		Version version5 = Version.fromVersion(MW1_15);
		Version version6 = Version.fromVersion(MW1_16);


		collectionOfSupportedBy.add(SupportedBy.fromVersion(version1));
		collectionOfSupportedBy.add(SupportedBy.fromVersion(version2));
		collectionOfSupportedBy.add(SupportedBy.fromVersion(version3));
		collectionOfSupportedBy.add(SupportedBy.fromVersion(version4));
		collectionOfSupportedBy.add(SupportedBy.fromVersion(version5));
		collectionOfSupportedBy.add(SupportedBy.fromVersion(version6));

		Integer i = 1;
		collectionOfSupportedBy.add(AvailableVersion.get(i));

		Collection<Version> versionCollection2 = new ArrayList<Version>();

		versionCollection2.add(Version.fromVersion(MW1_11));
		versionCollection2.add(Version.fromVersion(MW1_12));
		versionCollection2.add(Version.fromVersion(MW1_15));
		collectionOfSupportedBy.add(SupportedBy.fromVersion(version1));
		collectionOfSupportedBy.add(SupportedBy.fromVersion(version2));
		collectionOfSupportedBy.add(SupportedBy.fromVersion(version3));


		collectionOfSupportedBy.add(AvailableVersion.get(i++));

		collectionOfSupportedBy.add(AvailableVersion.get(i));
		
		collectionOfSupportedBy.add(AvailableVersion.get(i++));

		List<MediaWikiBot> bots = new ArrayList<MediaWikiBot>();
		MediaWikiBot bot1 = MediaWikiBot.builder()
				.url("http://mediawiki.org/wiki/Wikibase/Manual:Categories").
						getClassType().getNewInstance();

		collectionOfSupportedBy.add(SupportedBy.get(bot1));
		collectionOfSupportedBy.add(SupportedBy.get(bot1));

		MediaWikiBot bot2 = MediaWikiBot.builder()
				.url("http://mediawiki.org/wiki/Wikibase/Manual:Categories").
						getClassType().getNewInstance();

		collectionOfSupportedBy.add(SupportedBy.get(bot2));
		collectionOfSupportedBy.add(SupportedBy.get(bot2));
		collectionOfSupportedBy.add(SupportedBy.get(bot2));

		bots.addAll(collectionOfSupportedBy.iterator());

		// test
		assertTrue(isIterableOfSupportedBy.isEmpty());

		Iterator<SupportedBy> iteratorOfSupportedBy = getSupportedBy().iterator();
		int i = 0;
		while (iteratorOfSupportedBy.hasNext()) {
			SupportedBy supportedBy = iteratorOfSupportedBy.next();
			assertTrue(supportedBy == SupportedBy.get(supportedBy));
			assertTrue(i < versionCollection2.size());
			assertTrue(i + 1 < versionCollection2.size());
			i++;
		}

		assertTrue(i < 4);
		assertTrue(i < versionCollection2.size());
		assertTrue(i + 1 < versionCollection2.size());
		
		
	}
	
	/**
	 * A test instance that contains no supported versions.
	 */
	@Test
	@Slf4j
	public void isIterableOfSuccess() {

		Collection<SupportedBy> collectionOfSupportedBy = new ArrayList<SupportedBy>();
		collectionOfSupportedBy.add(SupportedBy.get(MediaWikiBot.class).withClassType(MediaWikiBot.class));
		collectionOfSupportedBy.add(SupportedBy.get(MediaWikiBot.class).withClassType(MediaWikiBot.class));

		Collection<Version> versionCollection = new ArrayList<Version>();

		// one, only one
}
}