// CategoryMembersFullTest.java
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
* It contains ten unit test cases for the {@link CategoryMembersFull#hasNext()} method.
*/
class CategoryMembersFullTest {

		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * This test case tests the functionality of the method when the category has no members.
		 * The test case is successful if the method returns false.
		 */
		@Test
		void testHasNext_NoMembers() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:NoMembers");
				assertFalse(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * This test case tests the functionality of the method when the category has one member.
		 * The test case is successful if the method returns true.
		 */
		@Test
		void testHasNext_OneMember() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:OneMember");
				assertTrue(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * This test case tests the functionality of the method when the category has two members.
		 * The test case is successful if the method returns true.
		 */
		@Test
		void testHasNext_TwoMembers() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:TwoMembers");
				assertTrue(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * This test case tests the functionality of the method when the category has three members.
		 * The test case is successful if the method returns true.
		 */
		@Test
		void testHasNext_ThreeMembers() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:ThreeMembers");
				assertTrue(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * This test case tests the functionality of the method when the category has four members.
		 * The test case is successful if the method returns true.
		 */
		@Test
		void testHasNext_FourMembers() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:FourMembers");
				assertTrue(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * This test case tests the functionality of the method when the category has five members.
		 * The test case is successful if the method returns true.
		 */
		@Test
		void testHasNext_FiveMembers() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:FiveMembers");
				assertTrue(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * This test case tests the functionality of the method when the category has six members.
		 * The test case is successful if the method returns true.
		 */
		@Test
		void testHasNext_SixMembers() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:SixMembers");
				assertTrue(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * This test case tests the functionality of the method when the category has seven members.
		 * The test case is successful if the method returns true.
		 */
		@Test
		void testHasNext_SevenMembers() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:SevenMembers");
				assertTrue(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * This test case tests the functionality of the method when the category has eight members.
		 * The test case is successful if the method returns true.
		 */
		@Test
		void testHasNext_EightMembers() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:EightMembers");
				assertTrue(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * This test case tests the functionality of the method when the category has nine members.
		 * The test case is successful if the method returns true.
		 */
		@Test
		void testHasNext_NineMembers() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:NineMembers");
				assertTrue(cmf.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembersFull#hasNext()} method.
		 * This test case tests the functionality of the method when the category has ten members.
		 * The test case is successful if the method returns true.
		 */
		@Test
		void testHasNext_TenMembers() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembersFull cmf = new CategoryMembersFull(bot, "Category:TenMembers");
				assertTrue(cmf.hasNext());
		}
}

// CategoryMembersTest.java
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
* Test class of {@link CategoryMembers}.
* It contains ten unit test cases for the {@link CategoryMembers#hasNext()} method.
*/
class CategoryMembersTest {
		
		/**
		 * Test case for {@link CategoryMembers#hasNext()} method.
		 * This test case tests the functionality of the method when the category has no members.
		 * The test case is successful if the method returns false.
		 */
		@Test
		void testHasNext_NoMembers() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembers cm = new CategoryMembers(bot, "Category:NoMembers");
				assertFalse(cm.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembers#hasNext()} method.
		 * This test case tests the functionality of the method when the category has one member.
		 * The test case is successful if the method returns true.
		 */
		@Test
		void testHasNext_OneMember() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembers cm = new CategoryMembers(bot, "Category:OneMember");
				assertTrue(cm.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembers#hasNext()} method.
		 * This test case tests the functionality of the method when the category has two members.
		 * The test case is successful if the method returns true.
		 */
		@Test
		void testHasNext_TwoMembers() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembers cm = new CategoryMembers(bot, "Category:TwoMembers");
				assertTrue(cm.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembers#hasNext()} method.
		 * This test case tests the functionality of the method when the category has three members.
		 * The test case is successful if the method returns true.
		 */
		@Test
		void testHasNext_ThreeMembers() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembers cm = new CategoryMembers(bot, "Category:ThreeMembers");
				assertTrue(cm.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembers#hasNext()} method.
		 * This test case tests the functionality of the method when the category has four members.
		 * The test case is successful if the method returns true.
		 */
		@Test
		void testHasNext_FourMembers() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembers cm = new CategoryMembers(bot, "Category:FourMembers");
				assertTrue(cm.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembers#hasNext()} method.
		 * This test case tests the functionality of the method when the category has five members.
		 * The test case is successful if the method returns true.
		 */
		@Test
		void testHasNext_FiveMembers() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembers cm = new CategoryMembers(bot, "Category:FiveMembers");
				assertTrue(cm.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembers#hasNext()} method.
		 * This test case tests the functionality of the method when the category has six members.
		 * The test case is successful if the method returns true.
		 */
		@Test
		void testHasNext_SixMembers() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembers cm = new CategoryMembers(bot, "Category:SixMembers");
				assertTrue(cm.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembers#hasNext()} method.
		 * This test case tests the functionality of the method when the category has seven members.
		 * The test case is successful if the method returns true.
		 */
		@Test
		void testHasNext_SevenMembers() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembers cm = new CategoryMembers(bot, "Category:SevenMembers");
				assertTrue(cm.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembers#hasNext()} method.
		 * This test case tests the functionality of the method when the category has eight members.
		 * The test case is successful if the method returns true.
		 */
		@Test
		void testHasNext_EightMembers() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembers cm = new CategoryMembers(bot, "Category:EightMembers");
				assertTrue(cm.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembers#hasNext()} method.
		 * This test case tests the functionality of the method when the category has nine members.
		 * The test case is successful if the method returns true.
		 */
		@Test
		void testHasNext_NineMembers() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembers cm = new CategoryMembers(bot, "Category:NineMembers");
				assertTrue(cm.hasNext());
		}
		
		/**
		 * Test case for {@link CategoryMembers#hasNext()} method.
		 * This test case tests the functionality of the method when the category has ten members.
		 * The test case is successful if the method returns true.
		 */
		@Test
		void testHasNext_TenMembers() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/mediawiki/");
				CategoryMembers cm = new CategoryMembers(bot, "Category:TenMembers");
				assertTrue(cm.hasNext());
		}
}

// CategoryTree.java
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
import net.sourceforge.jwbf.core.bots.util.J