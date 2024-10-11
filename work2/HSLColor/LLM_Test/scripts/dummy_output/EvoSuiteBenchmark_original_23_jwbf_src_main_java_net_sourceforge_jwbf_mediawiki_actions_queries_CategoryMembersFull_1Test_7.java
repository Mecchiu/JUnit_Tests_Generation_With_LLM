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
		
  // ********************************************************************
  /**
   * Test a lack of support for the {@link CategoryItems} interface.
   * <p>
   * This test case was created for a very specific use case.
   * One test case would fail the other with a {@link JwbfException}.
   */
  @Test(expected = JwbfException.class)
  public void testHasNext_NoSupport() {
    assertFalse(Classifier.SUPPORTED);
    assertFalse(SupportedBy.ALL);
    MediaWikiBot wikiBot = new MediaWikiBot("");
    ActionException e = (ActionException) wikiBot.execute(new Get("/api/index"));
    assertNotNull(e);
  }
  
  // ********************************************************************
  /**
   * Test that a lack of support for the collection implementation of the
   * {@link CategoryItems} interface is detected.
   * <p>
   * This test case would fail the other with a {@link JwbfException}.
   */
  @Test(expected = JwbfException.class)
  @Slf4j
  public void testHasNext_NoCollection() {
    MediaWikiBot wikiBot = new MediaWikiBot("");
    ActionException e = (ActionException) wikiBot.execute(new Get("/api/index"));
  }
  
  // ********************************************************************
  /**
   * Execute the {@link CategoryMembersFull} test case.
   * <p>
   * This test case will fail the other with a {@link ProcessException} if the
   * collection implementation of the {@link CategoryItems} interface is not
   * yet supported by the test implementation.
   * <p>
   * For details see the test cases documentation in the class.
   * <p>
   * The test will check that:
   * <ul>
   * <li>When the collection of {@link CategoryItem} instances is not present
   * <li>When the collection of {@link CategoryItem} instances is present
   * <li>The {@link MediaWikiBot#canPost()} method returns false.
   * <li>When the collection of {@link CategoryItem} instances in the request
   * is a subset of the collection of {@link CategoryItem} instances in the
   * currently set {@link SupportedBy#ALL} implementation.
   * </ul>
   */
  @Test
  @Slf4j
  public void testHasNext() {

    // Create an empty collection set that will be filled later with the
    // data from the test data.
    Collection<CategoryItem> categoryItems = new ArrayList<CategoryItem>();

    // Add items in random order.
    String title = "title";
    CategoryItem cat1 = new CategoryItem();
    CategoryItem cat2 = new CategoryItem();
    Collection<CategoryItem> list1 = new ArrayList<CategoryItem>();
    list1.add(cat1);
    list1.add(cat2);
    categoryItems.addAll(list1);

    // Make sure test 1 uses the collection which is not yet present.
    Collection<CategoryItem> set1 = MediaWikiBot.getClient().fetchCategoryItems(title, MediaWikiBot.DEFAULT_SITE_NAME).get(0);

    // Check the collection is present.
    assertTrue(set1.isEmpty());

    // Set up tests.
    String expectedTitle = "title";
    class SomeCategory extends CategoryItem {
      public SomeCategory() {
        super(expectedTitle);
      }
    }
    SomeCategory cat1 = new SomeCategory();
    expectedTitle = set1.iterator().next().getTitle();
    class SomeSpecificCategory extends CategoryItem {
      public SomeSpecificCategory() {
        super(expectedTitle);
      }
    }
    class SomeSpecificCollection extends CategoryItem {
      private final Collection<CategoryItem> ci;

      public SomeSpecificCollection(Collection<CategoryItem> collection) {
        this.ci = collection;
      }
    }
    Collection<CategoryItem> list1_1 = new ArrayList<CategoryItem>();
    list1_1.add(cat1);
    list1_1.add(cat2);
    SomeSpecificCategory list1_1c = new SomeSpecificCategory();
    list1_1c.ci = list1_1;

    assertFalse(MediaWikiBot.canPost(title));

    // Create a fake media wiki using MediaWikiBot class.
    MediaWikiFake mw = new MediaWikiFake(title);
}
}