// CategoryMembersFull_0Test.java
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
* It contains one unit test case for the {@link CategoryMembersFull#iterator()} method.
*/
class CategoryMembersFull_0Test {
		
	/**
	 * Test the method {@link CategoryMembers#iterator()}
	 *
	 * @throws ActionException Thrown if an error occured
	* @test_data [0] is the MediaWiki version
	* @test_data [1] is the MediaWiki version
	* @test_data [2] is MediaWiki 1.12
	*/
	@Test
	@Slf4j
	public void test_iterator_2() throws ActionException, JwbfException, ProcessorException {
		
		final Collection<CategoryItem> contents = new CategoryItemCollection(
		    null,
		    (MediaWikiBot) null,
		    (String) null,
		    new ArrayList<String>(),
		    (String) null
		);
		
		final Collection<CategoryItem> categoryItems = new CategoryItemCollection(
		    null,
		    (MediaWikiBot) null,
		    MW1_11,
		    (ArrayList) null,
		    (String) null
		);

		final Collection<CategoryItem> retrievedParts = new CategoryItemCollection(
		    null,
		    null,
		    (String) null,
		    new ArrayList<String>(),
		    (String) null
		);

		final Collection<CategoryItem> allCategoryItems = new CategoryItemCollection(
		    null,
		    (MediaWikiBot) null,
		    MW1_11,
		    new ArrayList<String>(),
		    (String) null
		);
		
		final Collection<CategoryItem> fullContent = new CategoryItemCollection(
		    new CategoryNodeList(contents),
		    (MediaWikiBot) null,
		    MW1_11,
		    new ArrayList<String>(),
		    (String) null
		);
		
		final Collection<CategoryItem> allCategoryItemsCopy = new CategoryItemCollection(
		    CategoryMember.merge(fullContent, null),
		    (MediaWikiBot) null,
		    (String) null,
		    new ArrayList<String>(),
		    (String) null
		);

		// test empty collection
		try {
			new CategoryMembersFull(
				null, null, null, null, null, null, null
			);
			log.info("empty collection");
			fail();
		} catch (ActionException e) {
			e.printStackTrace();
		}

		// test one empty collection
		try {
			new CategoryMembersFull(
				null, null, CategoryDefinition.getTitle(0), CategoryDefinition.getTitle(0), CategoryDefinition.getTitle(0), CategoryDefinition.getTitle(0), CategoryDefinition.getTitle(0)
			);
			log.info("empty collection " + CategoryDefinition.getTitle(0));
			fail();
		} catch (ActionException e) {
		}

}
}