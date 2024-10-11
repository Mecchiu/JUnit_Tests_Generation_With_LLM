// JWBF_1Test.java
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
class JWBF_1Test {

	/**
	 * Test method for {@link JWBF#getPartId(Class)}.
	 */
	@Test
	void testGetPartId() {
		assertEquals("jwbf-core", JWBF.getPartId(JWBF.class));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWikiBot.class));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.class));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.VersionException.class));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Action.class));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.ActionException.class));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Action.Query.class));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Action.Query.Backlink.class));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Action.Query.Backlink.BacklinkTitles.class));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Action.Query.Backlink.BacklinkTitles.class));
	}
}

// JWBF_2Test.java
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
* It contains ten unit test cases for the {@link JWBF#getVersion(Class)} method.
*/
class JWBF_2Test {
		
	/**
	 * Test method for {@link JWBF#getVersion(Class)}.
	 */
	@Test
	void testGetVersion() {
		assertEquals("2.0.0-SNAPSHOT", JWBF.getVersion(JWBF.class));
		assertEquals("2.0.0-SNAPSHOT", JWBF.getVersion(MediaWikiBot.class));
		assertEquals("2.0.0-SNAPSHOT", JWBF.getVersion(MediaWiki.Version.class));
		assertEquals("2.0.0-SNAPSHOT", JWBF.getVersion(MediaWiki.VersionException.class));
		assertEquals("2.0.0-SNAPSHOT", JWBF.getVersion(MediaWiki.Action.class));
		assertEquals("2.0.0-SNAPSHOT", JWBF.getVersion(MediaWiki.ActionException.class));
		assertEquals("2.0.0-SNAPSHOT", JWBF.getVersion(MediaWiki.Action.Query.class));
		assertEquals("2.0.0-SNAPSHOT", JWBF.getVersion(MediaWiki.Action.Query.Backlink.class));
		assertEquals("2.0.0-SNAPSHOT", JWBF.getVersion(MediaWiki.Action.Query.Backlink.BacklinkTitles.class));
		assertEquals("2.0.0-SNAPSHOT", JWBF.getVersion(MediaWiki.Action.Query.Backlink.BacklinkTitles.class));
	}
}

// JWBF_3Test.java
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
class JWBF_3Test {
		
	/**
	 * Test method for {@link JWBF#getVersion()}.
	 */
	@Test
	void testGetVersion() {
		assertEquals("2.0.0-SNAPSHOT", JWBF.getVersion().get("jwbf-core"));
		assertEquals("2.0.0-SNAPSHOT", JWBF.getVersion().get("jwbf-mediawiki"));
	}
}

// JWBF_4Test.java
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
* It contains ten unit test cases for the {@link JWBF#printVersion()} method.
*/
class JWBF_4Test {
		
	/**
	 * Test method for {@link JWBF#printVersion()}.
	 */
	@Test
	void testPrintVersion() {
		JWBF.printVersion();
	}
}

// JWBF_5Test.java
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
* It contains ten unit test cases for the {@link JWBF#main(String[])} method.
*/
class JWBF_5Test {
		
	/**
	 * Test method for {@link JWBF#main(String[])}.
	 */
	@Test
	void testMain() {
		JWBF.main(new String[] {});
	}
}

// JWBF_6Test.java
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
import org.junit.j