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
@Test
		boolean hasNext(){
			return getCollection().hasNext();
		}
		<T extends MediaWikiBot> CategoryFull<T> getCollection(){
			return new CategoryFull<>();
		}
		@Test
		void get_one_item(){
			CategoryFull<MediaWikiBot> collection = getCollection();
			CategoryItem item = collection.get(1);
			assertThat(collection, is(notNullValue()));
			assertThat(collection, is(Not.notNullValue()));
			assertThat(item, instanceOf(CategoryItem.class));
		}
		@Test
		void get_collection(){
			Collection<ActionException> exceptions = getCollection().get().getActionsByFailures();
			assertTrue(exceptions.isEmpty());
		}
}

/**
* Test class of {@link CategoryMembersFull}.
*/
class CategoryMembersFull_2Test extends CategoryMembersFull_1Test {

		@Override
		public void prepareCollection() {
			super.prepareCollection();
			collection.get(0);
		}

	protected CategoryFull<MediaWikiBot> getCollection(){
			return new CategoryFull<>();
		}

}

/**
* Test class of {@link CategoryMembersFull}. It adds {@link CategoryItem}s and {@link Collection}s for each
* {@link CategoryItem} of the {@link Collection}.
*/
class CategoryMembersFull_3Test extends CategoryMembersFull_2Test {

		@Test
		@Slf4j
		public boolean hasNext(){
			return false;
		}
		@Test
		@Slf4j
		public void get_collection(){
			Collection<ActionException> exceptions = getCollection().get().getActionsByFailures();
			assertTrue(exceptions.isEmpty());
		}
		@Test
		public void get_collection(){
			collection.get(5);
			CategoryItem item = getCollection().get(1);
			assertThat(collection, is(notNullValue()));
			assertThat(collection, is(Not.notNullValue()));
			assertThat(item, instanceOf(CategoryItem.class));
			collection.get(4);
			Collection<ActionException> exceptions = getCollection().get().getActionsByFailures();
			assertTrue(exceptions.isEmpty());
		}
}

/**
* Test class of {@link CategoryMembersFull}. A special case happens here in case the {@link ContentItems} are the same
* for all {@link CategoryItem}s (same content) at the same level.
* This special case is tested here because we allow accesses to the {@link ContentItems} from different level.
* Since the {@link ContentItems} are the same for all categories, we need to differentiate a special case from that happening.
* It is also the case that this special case has been tested in case above,
* but under different cases (e.g. CategoryMembersFull.hasNext() was not being tested correctly)
*/
	class CategoryFull extends CategoryMembersFull_1Test {
		
			@Test
			boolean hasNext(){
				return getCollection().hasNext();
			}
		
		
		protected Collection<ActionException> getActionsByFailures(){
			Collection<ActionException> exceptions = new ArrayList<>();
			return exceptions;
		}
}
			
if(log.isDebugEnabled()){
log.debug("Finished tests");
}
