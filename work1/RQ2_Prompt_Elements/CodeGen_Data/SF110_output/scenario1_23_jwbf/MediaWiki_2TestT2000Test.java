// MediaWiki_2Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains one unit test case for the {@link MediaWiki#decode(String)} method.
*/
class MediaWiki_2Test {

	/*
	 *  This test case will write the following file and run MediaWIKAs.
	 *
	 *  @Test
	 *  @DisplayName("Testing MediaWiki_1_2")
	 *  @Category({Integration.class, UnitTest.class})
	 *  @SuppressWarnings("deprecation")
	 *  @DisplayName("Test 1.1")
	 *  @DependsOnMethod({"test_2"},{@DisplayName("Test 2.1")})
	 *  @Description("Test with two actions and no default language. "
	 *      "The content should be encoded correctly")
	 *  @CreateTime
	 *  @UpdateTime
	 *  @UpdateDimensions
	 *  @UpdateLanguage
	 *  @SuppressWarnings("rawtypes")
	 *  @RunOnlyWith(RVCL.class)
	 */
	@Test
	public void test_1_1() throws UnsupportedEncodingException, InterruptedException {
		final MediaWiki.State state = new MediaWiki.State();
		final MediaWiki.Action action1 = new MediaWiki.Action();
		final MediaWiki.Action action2 = new MediaWiki.Action();
		final MediaWiki mw = new MediaWiki(state, null);
		final Set<MediaWiki.Action> actions = new HashSet<MediaWiki.Action>();
		actions.add(action1);
		actions.add(action2);
		mw.setActions(actions);
		final String decodedString = mw.decode(URLEncoder.encode(String.class.getName(), "UTF-8"));
	

		DecodingLog.log(getClass(), state, decodedString);
		
		assertEquals(String.class.getName(), decodedString.getClass().getName());
		assertTrue(state.getStatus().isNull());
		
//		try {
//			assertEquals("test", decodedString);
//		} catch (IllegalStateException x) {
//			return;
//		}
//		try {
//			assertEquals("test", decodedString);
//		} catch (IllegalStateException x) {
//			return;
//		}
//		try {
//			assertEquals("test", decodedString);
//		} catch (IllegalStateException x) {
//			return;
//		}
		
//TODO:  We are not going to test anything more yet:

	}
	
}
