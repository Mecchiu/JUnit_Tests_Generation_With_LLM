// PostModifyContent_1Test.java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_09;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_10;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.Post;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
import net.sourceforge.jwbf.core.contentRep.ContentAccessable;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PostModifyContent}.
* It contains one unit test case for the {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
*/
class PostModifyContent_1Test {
/**
		 * Unit test for the {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
		*/
		@Test
		public void isIntersectionEmpty() {
				PostModifyContent action = new PostModifyContent(null);
		
		// check if everything is empty
		Set<?> emptyList;
		Set<?> emptySet;
		boolean isEmpty;
		try {
			isEmpty = action.isIntersectionEmpty(emptyList = new HashSet<>(new HashSet<>()), emptySet = new HashSet<>() );
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
		assertTrue(isEmpty);
		
		isEmpty = action.isIntersectionEmpty(emptyList = new HashSet<>(new HashSet<>()), emptySet = new HashSet<>() );
		assertFalse(isEmpty);
	}
}

/**
 * Class of {@link PostModifyContent}.
*/
class PostModifyContent extends MWAction {
	

	private static final String post = "post";
	private static final String postTitle = "post_title";

	private static final String pre = "pre";
	private static final String preTitle = "pre";
	private static final String postContent = "post_content";
	private static final String preContent = "pre";
	private static final String preTitle = "pre";
	
	// static
	
	// Action
	
	// Constructors
	
	// Methods of MWAction
	{
		
		// Post creation
	}

	// getters & setters
	{
		
		{
			actions = new Hashtable<>();
		}
		
		{
			super.actions = new Hashtable<>();
		}

		{
			pre = post;
			pre_content = postContent;
		}

		{
			post = postTitle;
			post_content = preContent;
		}

		{
			post = preTitle;
			post_content = preContent;
		}
	}
	
	// actions
	{
		actions.putAll(actions);
	}
	
	// get
	
	// post creation
	@Override
	public Set<Action> getActions() {
		return actions.keySet();
	}
			
	@Override
	public String getActionsMessage() {
		return actions.toString();
	}

		
	// post creation and action
	
	public static synchronized PostCreateContent createPostCreateContent() {
		return new PostCreateContent();
	}
	
	public static synchronized PostModifyContent createPostModifyContent() {
		return new PostModifyContent();
	}
	
	@Override
	public MediaWikiBot createBot() {
		return new MediaWikiBot(this);
	}
	
	@Override
	public String getClassName(){
		return "PostCreateContent";