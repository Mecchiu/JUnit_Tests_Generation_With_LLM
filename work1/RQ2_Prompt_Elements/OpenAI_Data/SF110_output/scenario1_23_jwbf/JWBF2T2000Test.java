// JWBFTest.java
package net.sourceforge.jwbf;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JWBF}.
* It contains ten unit test cases for the {@link JWBF#getVersion()} method.
*/
class JWBFTest {

	/**
	 * Test method for {@link JWBF#getVersion()}.
	 * @throws IOException 
	 * @throws URISyntaxException 
	 */
	@Test
	void testGetVersion() throws IOException, URISyntaxException {
		
		Map<String, String> version = JWBF.getVersion();
		
		assertNotNull(version);
		assertFalse(version.isEmpty());
		
		assertTrue(version.containsKey("jwbf"));
		assertTrue(version.containsKey("jwbf-core"));
		assertTrue(version.containsKey("jwbf-mediawiki"));
		assertTrue(version.containsKey("jwbf-mediawiki-api"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-core"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki-action"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki-action-query"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki-action-query-prop"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki-action-query-prop-revisions"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki-action-query-prop-revisions-rvprop"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki-action-query-prop-revisions-rvprop-rvlimit"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki-action-query-prop-revisions-rvprop-rvlimit-rvstartid"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki-action-query-prop-revisions-rvprop-rvlimit-rvstartid-rvendid"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki-action-query-prop-revisions-rvprop-rvlimit-rvstartid-rvendid-rvdir"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki-action-query-prop-revisions-rvprop-rvlimit-rvstartid-rvendid-rvdir-rvuser"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki-action-query-prop-revisions-rvprop-rvlimit-rvstartid-rvendid-rvdir-rvuser-rvexcludeuser"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki-action-query-prop-revisions-rvprop-rvlimit-rvstartid-rvendid-rvdir-rvuser-rvexcludeuser-rvtag"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki-action-query-prop-revisions-rvprop-rvlimit-rvstartid-rvendid-rvdir-rvuser-rvexcludeuser-rvtag-rvprop"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki-action-query-prop-revisions-rvprop-rvlimit-rvstartid-rvendid-rvdir-rvuser-rvexcludeuser-rvtag-rvprop-rvlimit"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki-action-query-prop-revisions-rvprop-rvlimit-rvstartid-rvendid-rvdir-rvuser-rvexcludeuser-rvtag-rvprop-rvlimit-rvstartid"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki-action-query-prop-revisions-rvprop-rvlimit-rvstartid-rvendid-rvdir-rvuser-rvexcludeuser-rvtag-rvprop-rvlimit-rvstartid-rvendid"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki-action-query-prop-revisions-rvprop-rvlimit-rvstartid-rvendid-rvdir-rvuser-rvexcludeuser-rvtag-rvprop-rvlimit-rvstartid-rvendid-rvdir"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki-action-query-prop-revisions-rvprop-rvlimit-rvstartid-rvendid-rvdir-rvuser-rvexcludeuser-rvtag-rvprop-rvlimit-rvstartid-rvendid-rvdir-rvuser"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki-action-query-prop-revisions-rvprop-rvlimit-rvstartid-rvendid-rvdir-rvuser-rvexcludeuser-rvtag-rvprop-rvlimit-rvstartid-rvendid-rvdir-rvuser-rvexcludeuser"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki-action-query-prop-revisions-rvprop-rvlimit-rvstartid-rvendid-rvdir-rvuser-rvexcludeuser-rvtag-rvprop-rvlimit-rvstartid-rvendid-rvdir-rvuser-rvexcludeuser-rvtag"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki-action-query-prop-revisions-rvprop-rvlimit-rvstartid-rvendid-rvdir-rvuser-rvexcludeuser-rvtag-rvprop-rvlimit-rvstartid-rvendid-rvdir-rvuser-rvexcludeuser-rvtag-rvprop"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki-action-query-prop-revisions-rvprop-rvlimit-rvstartid-rvendid-rvdir-rvuser-rvexcludeuser-rvtag-rvprop-rvlimit-rvstartid-rvendid-rvdir-rvuser-rvexcludeuser-rvtag-rvprop-rvlimit"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki-action-query-prop-revisions-rvprop-rvlimit-rvstartid-rvendid-rvdir-rvuser-rvexcludeuser-rvtag-rvprop-rvlimit-rvstartid-rvendid-rvdir-rvuser-rvexcludeuser-rvtag-rvprop-rvlimit-rvstartid"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki-action-query-prop-revisions-rvprop-rvlimit-rvstartid-rvendid-rvdir-rvuser-rvexcludeuser-rvtag-rvprop-rvlimit-rvstartid-rvendid-rvdir-rvuser-rvexcludeuser-rvtag-rvprop-rvlimit-rvstartid-rvendid"));
		assertTrue(version.containsKey("jwbf-mediawiki-api-mediawiki