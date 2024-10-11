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
* It contains ten unit test cases for the {@link JWBF#getPartId(Class)} method.
*/
class JWBFTest {

	/**
	 * Test method for {@link JWBF#getPartId(Class)}.
	 * @throws IOException 
	 * @throws URISyntaxException 
	 */
	@Test
	void testGetPartId() throws IOException, URISyntaxException {
		
		// Test case 1:
		// Test if the method returns the correct version of the JWBF core module.
		assertEquals("JWBF-core-1.0.0", JWBF.getPartId(JWBF.class));
		
		// Test case 2:
		// Test if the method returns the correct version of the JWBF mediawiki module.
		assertEquals("JWBF-mediawiki-1.0.0", JWBF.getPartId(MediaWiki.class));
		
		// Test case 3:
		// Test if the method returns the correct version of the JWBF mediawiki-api module.
		assertEquals("JWBF-mediawiki-api-1.0.0", JWBF.getPartId(MediaWiki.Version.class));
		
		// Test case 4:
		// Test if the method returns the correct version of the JWBF mediawiki-api-action module.
		assertEquals("JWBF-mediawiki-api-action-1.0.0", JWBF.getPartId(Action.class));
		
		// Test case 5:
		// Test if the method returns the correct version of the JWBF mediawiki-api-basic module.
		assertEquals("JWBF-mediawiki-api-basic-1.0.0", JWBF.getPartId(BasicBot.class));
		
		// Test case 6:
		// Test if the method returns the correct version of the JWBF mediawiki-api-exception module.
		assertEquals("JWBF-mediawiki-api-exception-1.0.0", JWBF.getPartId(ActionException.class));
		
		// Test case 7:
		// Test if the method returns the correct version of the JWBF mediawiki-api-http module.
		assertEquals("JWBF-mediawiki-api-http-1.0.0", JWBF.getPartId(HttpActionClient.class));
		
		// Test case 8:
		// Test if the method returns the correct version of the JWBF mediawiki-api-query module.
		assertEquals("JWBF-mediawiki-api-query-1.0.0", JWBF.getPartId(Query.class));
		
		// Test case 9:
		// Test if the method returns the correct version of the JWBF mediawiki-api-query-allpages module.
		assertEquals("JWBF-mediawiki-api-query-allpages-1.0.0", JWBF.getPartId(AllPages.class));
		
		// Test case 10:
		// Test if the method returns the correct version of the JWBF mediawiki-api-query-category module.
		assertEquals("JWBF-mediawiki-api-query-category-1.0.0", JWBF.getPartId(CategoryMembers.class));
		
	}
}