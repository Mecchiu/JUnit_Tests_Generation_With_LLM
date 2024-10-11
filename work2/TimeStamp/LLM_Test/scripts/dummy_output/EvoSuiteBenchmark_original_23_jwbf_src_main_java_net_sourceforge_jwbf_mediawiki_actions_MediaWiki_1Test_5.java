// MediaWiki_1Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains one unit test case for the {@link MediaWiki#encode(String)} method.
*/
class MediaWiki_1Test {
		
	@Test
	void test() {
		check(MediaWiki.encode("HelloWorld"), "{I18N:[[{I18N:[[HelloWorld]]},\"HelloWorld\"]}}");
		check(new String(MediaWiki.encode("http://media.wikia.com/p/test?")), "&amp;#codestr:[[{I18N:[[http://media.wikia.com/p/test?]},\"http://media.wikia.com/p/test\"]]]]{I18N:[[[http://media.wikia.com/p/test?]]}}");
		check(new String("").replace("\\", "*"), "{I18N:[[{I18N:[[]]],\"*\"]]});");//no whitespaces are allowed, but this one gets trimmed from the end, at least
}
}