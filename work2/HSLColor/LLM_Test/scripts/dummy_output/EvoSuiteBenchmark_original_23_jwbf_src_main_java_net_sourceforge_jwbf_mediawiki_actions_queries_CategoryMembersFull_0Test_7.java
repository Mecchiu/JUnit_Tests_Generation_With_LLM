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
		
//	@Test
	@Slf4j
	void doTest() throws ActionException, JwbfException {
		Collection<CategoryItem> c = new ArrayList<CategoryItem>(1);
		c.add(new CategoryItem("Category", new CategoryItem.Type() {
			@Override
			public String getType() {
				return "text";
			}
		}));
		
		Iterator<CategoryItem> it = new CategoryMembersFull().iterator();
		assertNotNull(it);
		c.add(it.next());
		
		assertEquals("aText", it.next().get(0).getContent());
		//c.iterator().remove();
	}

	
//	@Test
	@Slf4j
	void doTestCase2() throws ActionException, JwbfException {
		Collection<CategoryItem> c = new ArrayList<CategoryItem>(1);
		c.add(new CategoryItem("Category", new CategoryItem.Type() {
			@Override
			public String getType() {
				return "Text";
			}
		}));
		
		Iterator<CategoryItem> it = new CategoryMembersFull().iterator();
		assertNotNull(it);
		c.add(it.next());
		
		assertEquals("Text", it.next().get(0).getContent());
		//it.remove();
	}

	
//	@Test
	@Slf4j
	void doTestCase2a() throws ActionException, JwbfException {
		Collection<CategoryItem> c = new ArrayList<CategoryItem>(1);
		c.add(new CategoryItem("Category", new CategoryItem.Type() {
			@Override
			public String getType() {
				return "Text";
			}
		}));
		
		CategoryMembersFull.iterator it = new CategoryMembersFull();
		assertNotNull(it);
		c.add(it.next());
		assertTrue(it.hasNext());
		
		try {
			it.next();
			fail("expected ActionException");
		} catch (ActionException e) {
			// expected
		}
		assertFalse(it.hasNext());
		//iterator().remove();
	}
	
//	@Test
	@Slf4j
	void doTest2() throws ActionException, JwbfException {
		Collection<CategoryItem> c = new ArrayList<CategoryItem>(1);
		c.add(new CategoryItem("Category", new CategoryItem.Type() {
			@Override
			public String getType() {
				return "Article";
			}
		}));
		
		CategoryMembersFull.iterator it = new CategoryMembersFull();
		assertNotNull(it);
		c.add(it.next());
		assertTrue(it.hasNext());
		
		try {
			it.next();
			fail("expected ActionException");
		} catch (ActionException e) {
			// expected
		}
		assertFalse(it.hasNext());
		//iterator().remove();
	}
	
//	@Test
	@Slf4j
	void doTest3() throws ActionException, JwbfException {
		Collection<CategoryItem> c = new ArrayList<CategoryItem>(1);
		c.add(new CategoryItem("Category", new CategoryItem.Type() {
			@Override
			public String getType() {
				return "Article";
			}
		}));
		
		CategoryMembersFull.iterator it = new CategoryMembersFull();
		assertNotNull(it);
		c.add(it.next());
		assertTrue(it.hasNext());
		
		try {
			it.next();
			fail("expected ActionException");
		} catch (ActionException e) {
			// expected
		}
		assertFalse(it.hasNext());
		//iterator().remove();
	}
	
//	@Test
	@Slf4j
	public void test() throws ActionException, ProcessException, JwbfException {
		assertEquals(SupportedBy.BOTS, MediaWikiBot.getSupportedKindsList(
		        "CategoryMembersFullBots"));
		
		CategoryMembersFull.iterator it = new CategoryMembersFull();
		assertNotNull(it);
		it.next();
		assertTrue(it.hasNext());
		
		try {
			it.next();
			fail("expected ActionException");
		} catch (ActionException e) {
			// expected
		}
}
}