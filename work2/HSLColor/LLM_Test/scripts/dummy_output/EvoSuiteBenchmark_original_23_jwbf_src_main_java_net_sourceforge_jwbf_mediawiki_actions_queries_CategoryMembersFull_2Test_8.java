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
  * {@inheritDoc}
  */
  public CategoryMembersFull_2Test() {}
  
  /**
  *
  */
  @Test public void test() throws ActionException, ProcessException {
      
    // This is necessary when testing the content of a category
    // of "test" wiki, because the content of "test" wiki is contained
    // in the category, so if we are running test-1.1, this is a bug in
    // the mediawiki bot. See this issue for more info:
    // https://github.com/jwbf/jwbf/issues/45
    //
    // Note that this test is not intended for production testing since it
    // relies on the fact that in the content of a category, a single
    // entry can be stored for many categories at once.
    //
    // So if we test test-1.1:
    //
    //     $ cat cat-1.1
    //     This is what we want since cat-1.1 has been removed from the
    //     category
    
    
    
    CategoryItem cat = new CategoryItem();
    cat.setTitle("This is a test");
    cat.setSummary("A test");
    cat.setText("This is a test text");
    cat.setCreator("this");
    cat.setCreatorHtml("<img src='/static/images/creators/bob-logo.png' alt='Bob has no name' />");
    cat.setCreatorHtmlAll("<img src='/static/images/creators/bob-logo.png' alt='Bob has no name' />");
    cat.setContent("This is a test content");
    cat.setContentText("This is a test text");
    cat.setMwVersion("1.2");
    cat.setTitleVersion("1.2");
    cat.setContentVersion("1.2");
    Collection<CategoryItem> cats = new ArrayList<>();
    cats.add(cat);
    
    // Now we just run the query to see that only the wikiCategory member
    // has a content, otherwise it is possible in-band that it has a content member
    Get get = new Get(HELP_URI, null, cats);
    CategoryMembersFull.Results results = new CategoryMembersFull.Results();
    results.setWikiCategory(new CategoryItem());
        
    try {
      MediaWikiBot bot = new MediaWikiBot(
                                   new CustomCategoryMembersFilter(cats))) {
        return toStringJson(bot.execute(get), MW1_16);
      }
    }catch (JwbfException jwbfEx) {
      fail("Should not raise exception: " + jwbfEx.getMessage());
    }
  }
  
  static class CustomCategoryMembersFilter implements MediaWikiBot.CategoriesFilter {
    private Collection<CategoryItem> cats;
    private Iterator<CategoryItem> iterator;
    private int count = 0;

    public CustomCategoryMembersFilter(Collection<CategoryItem> cats) {
      this.cats = cats;
      iterator = cats.iterator();
    }

    /**
     * @{inheritDoc}
     */
    @Override
    public boolean acceptMember(CategoryMember member) {
      return count < cats.size();
    }
  }
  
}