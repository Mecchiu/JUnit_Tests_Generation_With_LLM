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
// This test case checks whether the hasNext() returns the correct values.
		@Test
	  void hasNext_0_1() {
	    new CategoryMembersFull_1();
	    assertTrue(getNext(false)); //false => {false}
	    assertTrue(getNext(true)); //true => {true}
	    Collection collection = getNext(false);
	    int nextCollectionSize = collection.size();
	    // Make the result be an empty collection
	    collection.clear();
	    // Use empty collection to check if the condition is fulfilled
	    assertFalse(collection.isEmpty());
	    // Check to see if the expected is fulfilled
	    assertTrue(collection.size() == nextCollectionSize);
	    }

		// This test case checks whether the equals() method works with collection sizes
		// that are not equal.
		@Test
	  void equals_1_1() {
	    ArrayList collection1 = new ArrayList();
	    ArrayList collection2 = new ArrayList();
	    collection1.add(new CategoryItem("Page", "Homepage", "", "Text"));
	    collection2.add(new CategoryItem("Page", "Homepage", "", "Text"));
	    assertTrue(collection1.equals(collection2));
	    assertTrue(collection1.equals(collection1));
	    Collection collection3 = new ArrayList();
	    collection2.add(new CategoryItem("Page (Page)", "Homepage", "", "Text"));
	    collection3.add(new CategoryItem("Page (Page)", "Homepage", "", "Text"));
	    assertFalse(collection3.equals(collection1));
	    assertFalse(collection3.equals(collection3));
	    Collection collection4 = new ArrayList();
	    collection2.add(new CategoryItem("Page", "Homepage (Homepage)", "", "Text"));
	    collection4.add(new CategoryItem("Page", "Homepage (Homepage)", "", "Text"));
	    assertTrue(collection4.equals(collection4));
	    assertTrue(collection4.equals(collection4));
	    }

	// It should also check if the two collection contain the correct items.
	// {TestCollection} is part of the tests
	//
	@Test
	  void getNext_0() {
	    collection = new TestCollection ();
	    collection.add(new CategoryItem("Page", "Homepage", "", "Text"));
	    collection.add(new CategoryItem("Page (Page)", "Homepage", "", "Text"));
	    assertTrue(collection.getNext().toString().equals("Page Page (Page)" + "\r\n"));
	    assertTrue(collection.getNext().toString().equals("Page Page (Page)" + "\r\n"));
	    }

	// It should also check if the {@code collection.size()} method does not need
	// the additional 'toString' test.
	// {NotCollection} is part of the tests
	//
	@Test
	  void getSize_1() {
	    collection = new TestCollection();
	    collection.add(new CategoryItem("Page", "Homepage", "", "Text"));
	    collection.add(new CategoryItem("Page (Page)", "Homepage", "", "Text"));
	    collection.add(new CategoryItem("Page", "Homepage", "", "Text"));
	    collection.add(new CategoryItem("Page", "Homepage", "", "Text"));
	    double testSize = collection.size();
	    collection.add(new CategoryItem("Page (Page)", "Homepage", "", "Text"));
	    collection.add(new CategoryItem("Page (Page)", "Homepage", "", "Text"));
	    assertTrue(testSize == 7);
	    }
	@Test
	public void getNext_1() {
	    collection = new TestCollection () ;
	    collection.add(new CategoryItem("Page", "Homepage", "", "Text"));
	    collection.add(new CategoryItem("Page (Page)", "Homepage", "", "Text"));
	    collection.add(new CategoryItem("Page", "Homepage", "", "Text"));
	    collection.add(new CategoryItem("Page", "Homepage", "", "Text"));
	    collection.add(new CategoryItem("Page (Page)", "Homepage", "",