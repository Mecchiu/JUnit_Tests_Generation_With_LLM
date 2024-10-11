// CategoryMembersFull_1Test.java
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
* It contains one unit test case for the {@link CategoryMembersFull#hasNext()} method.
*/
class CategoryMembersFull_1Test {
		@Slf4j
		private static final String TEST_ID = "test-1";

		@Test
		public void hasMw101_2() {
					String uri =
					"https://api.mozillaweb.org/2/c/e/o/" + TEST_ID + "/[@id]/full";
		HttpAction<CategoryItem> cmi =
		    new HttpAction<CategoryItem>(uri) {

				@Override
				protected void addRequestHeaders() {
					addRequestHeader("X-Vunid", "mw1_1");
				}

				public CategoryItem apply(MediaWikiBot wiki) throws ProcessException {
					assertNotNull(wiki);
					assertNotNull(wiki.getUser());
					assertNotNull(wiki.getMediaWikiVersion());
					assertNotNull(wiki.getUser().getUserName());
					assertEquals("1", wiki.getUser().getUserName());
					assertEquals("o", wiki.getUser().getName());
					assertEquals(TEST_ID, wiki.getMediaWikiVersion());
					assertEquals("1", wiki.getUser().getUserId());
					assertEquals("mozillaweb", wiki.getMediaWikiVersion().getVersion());
					CategoryItem cItem = new CategoryItem();
					CategoryItem.Title ci = cItem.setTitle(new CategoryTitle());
					CategoryItem.Description cd = ci.setDescription("Description");
					CategoryItem.Category c = new CategoryItem.Category(new CategoryTitle());
					c.setCategory(cItem.setCategory(ci));
					CategoryItem.CategoryItem ci3 = new CategoryItem().setCategoryItem(c);
					catItem = new CategoryItem();
					catItem.setCategoryItem(ci3);
					return catItem;
				}

		};
		wmw17CheckMw1_0(TEST_ID);
		}

		void wmw17CheckMw1_0(String testID) throws ProcessException,
		JwbfException, ActionException {
		String result =
		    doNextRequest(SUSPECT_PARAMETERS, "getCategory/1/[@id]", "mw1_0");
		assertEquals("SUSPECT_PARAMETERS", result);
		assertEquals(testID, result);
		}

		@Test
		@Slf4j
		public void wmw17_0() throws ProcessException {
			String result =
			    doNextRequest(TEST_ID, "getCategory/1/[@id]");
			assertEquals("SUSPECT_PARAMETERS", result);
		}

		@Test
		@Slf4j
		public void wmw17_1() throws ProcessException {
			wmw17_0();
			assertEquals(result,
			    "GET_CATEGORY_WITHOUT_PARAMETERS:GET/1/wo/wo/wo/wo/wo/wo/wo/wo1=mw1_0");
		}

	@Test
	@Slf4j
	public void wmw17_2() throws ProcessException {
			wmw17CheckMw1_0("wo");
			assertEquals(result,
			    "GET_CATEGORY_WITH_ALL_PARAMETERS:GET/1/wo/wo/wo/wo/wo/wo/wo1=mw1_0");
		}

		@Test
		@Slf4j
		public void wmw17_3() throws ProcessException {
			wmw17CheckMw1_0("wo/wo");
			assertEquals(result,
			    "GET_CATEGORY_WITH_ALL_PARAMETERS_2:GET/1/wo/wo/wo/wo/wo/wo/wo1=mw1_0");
		}

		@Test
		@Slf4j
		public void wmw17_4() throws ProcessException {
			wmw17CheckMw1_0("wo/wo-1");
			assertEquals(result,
			    "GET_CATEGORY_WITH_ALL_PARAMETERS_3:GET/1/wo/wo/wo/wo/wo/wo1=mw1_0");
		}
}