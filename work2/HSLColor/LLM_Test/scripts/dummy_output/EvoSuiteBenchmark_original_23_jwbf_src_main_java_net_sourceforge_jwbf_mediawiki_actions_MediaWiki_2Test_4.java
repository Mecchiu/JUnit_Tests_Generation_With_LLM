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
		private final static String MEDIAWIKI_BASEURL = "https://media.wikimedia.org/mediawiki/";
		private final static String MEDIAWIKI_PREFIX = "mediawiki.";
		private final static String MEDIAWIKI_PREFIX_REPLACE = "mediawiki.";
		private final static String TAG_NAME = "tags";
		private final static String TAG_PREFIX = "tag.";
		private final static String TAG_REPOSITORY = "tags";
		private final static String TAG_REPLACE_ORIGINAL = "replace.wikimedia.org.";
		private final static String FILE_NAME = "myfile.txt";
		private final static String FILE_DATE = "2012-08-18T10:11";
		private final static String FILE_CONTENT = "File content.";
		private final static Set<String> TAGS = new HashSet<>();
	private final static String MEDIAWIKI_DEFAULT_TAG_NAME = "default";
	private final static String IMG_PATH = "/img/mediawiki_";
	private final static String MEDIAWIKI_DEFAULT_IMG = IMG_PATH + "default.png";
	
	public static String MEDIAWIKI_BASEURL;
	public static String TAG_NAME;

	static {
		MEDIAWIKI_BASEURL = MEDIAWIKI_PREFIX_REPLACE + TAG_REPOSITORY + "tags" + MEDIAWIKI_PREFIX + TAG_NAME;
		TAG_NAME = TAG_PREFIX + MEDIAWIKI_PREFIX + MEDIAWIKI_DEFAULT_TAG_NAME;
	}

	@Test
    public void test_baseurl_encoding(){
		MediaWiki.MEDIAWIKI_BASEURL = URLEncoder.encode(MEDIAWIKI_BASEURL, "utf-8");
		assertEquals("mediaWiki.org", MEDIAWIKI_BASEURL.substring(0, 7));
	}

	@Test
    public void test_create_baseurl_from_tag(){
		String result1 = MediaWiki.createBaseurlFromTag(MEDIAWIKI_BASEURL, TAG_NAME);
		assertEquals(MEDIAWIKI_PREFIX_REPLACE + MEDIAWIKI_PREFIX + MEDIAWIKI_DEFAULT_TAG_NAME + "."
				+ TAG_PREFIX + TAG_REPOSITORY + "tags/" + MEDIAWIKI_DEFAULT_TAG_NAME, result1);
	}

	public static void main(String[] args) throws UnsupportedEncodingException{
		String prefix = MEDIAWIKI_PREFIX_REPLACE + MEDIAWIKI_PREFIX + MEDIAWIKI_DEFAULT_TAG_NAME + "."
				+ TAG_PREFIX + TAG_REPOSITORY + "tags/default.";
		String testStr = MEDIAWIKI_BASEURL + MEDIAWIKI_DEFAULT_IMG + "img.png";
		assertEquals(
				MEDIAWIKI_BASEURL + MEDIAWIKI_PREFIX_REPLACE + MEDIAWIKI_PREFIX + MEDIAWIKI_DEFAULT_TAG_NAME + "."
				+ MEDIAWIKI_PREFIX + MEDIAWIKI_DEFAULT_IMG + MEDIAWIKI_PREFIX + "img.jpg", testStr);
	}

	@Test
    public void test_createBaseurl_with_mediawiki_prefix(){
        assertEquals(
                MEDIAWIKI_PREFIX_REPLACE + MEDIAWIKI_PREFIX + MEDIAWIKI_DEFAULT_TAG_NAME + "."
                        + MEDIAWIKI_PREFIX + MEDIAWIKI_DEFAULT_IMG + MEDIAWIKI_PREFIX + "img.jpg",
                createBaseurlFromTag(MEDIAWIKI_BASEURL, MEDIAWIKI_DEFAULT_TAG_NAME));
        assertEquals(
                MEDIAWIKI_PREFIX_REPLACE + MEDIAWIKI_PREFIX + MEDIAWIKI_DEFAULT_TAG_NAME + "."
                        + MEDIAWIKI_PREFIX + MEDIAWIKI_DEFAULT_IMG + MEDIAWIKI_PREFIX + "img.jpg",
                createBaseurlFromTag(MEDIAWIKI_BASEURL, MEDIAWIKI_DEFAULT_TAG_NAME));
    }
	
	@Test
    public void test_get_mediawiki_baseurl(){
		assertEquals(
				MEDIAWIKI_BASEURL + MEDIAWIKI_DEFAULT_IMG + "img.png",
				MediaWiki.getMediawikiBaseurl(IMG_PATH, FILE_NAME));
    }
	
	@Test
    public void test_get_mediawiki_baseurl_from_prefix(){
		MediaWiki.createBaseurlFromTag(MEDIAWIKI_BASEURL, TAG_NAME);
		assertEquals(
				MEDIAWIKI_BASEURL + MEDIAWIKI_PREFIX_REPLACE + MEDIAWIKI_PREFIX + TAG_PREFIX + MEDIAWIKI_DEFAULT_TAG_NAME + "."
						+ MEDIAWIKI_PREFIX + MEDIAWIKI_DEFAULT_IMG + MEDIAWIKI_PREFIX + FILE_NAME,
				MediaWiki.getMediawikiBaseurl(IMG_PATH, FILE_NAME));
    }
	
	@Test
    public void test_get_mediawiki_baseurl_from_tag(){
        assertEquals(
                MEDIAWIKI_BASEURL + MEDIAWIKI_PREFIX_REPLACE + MEDIAWIKI_PREFIX + MEDIAWIKI_DEFAULT_TAG_NAME + "."
                        + MEDIAWIKI_PREFIX + TAG_REPOSITORY + "tags/" + MEDIAWIKI_DEFAULT_TAG_NAME,
                MediaWiki.getMediawikiBaseurl(IMG_PATH, FILE_NAME));
    }
	
	public static String createBaseurlFromTag(String baseurl, String tagName) {
		Set<String> tagKeys = new HashSet<>();
		tagKeys.add(MEDIAWIKI_DEFAULT_TAG_NAME);
		String baseTagUrl = baseurl;
		int prevIdx = baseTagUrl.lastIndexOf("/");
		if (prevIdx!= -1) {
            baseTagUrl = baseTagUrl.substring(0, prevIdx);
            baseTagUrl = baseTagUrl.replace("/img/mediawiki_", "img");
		}
		
		String testStr = baseTagUrl + MEDIAWIKI_PREFIX;
		
		tagKeys.add(tagName);
		
		// MediaWiki.MEDIAWIKI_PREFIX_REPLACE + MEDIAWIKI_PREFIX + MEDIAWIKI_DEFAULT_TAG_NAME
}
}