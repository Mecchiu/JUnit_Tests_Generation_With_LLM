// LagoonProcessorTest.java
package nu.staldal.lagoon.core;

import java.io.*;
import java.util.*;
import nu.staldal.xtree.*;
import nu.staldal.util.Utils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LagoonProcessor}.
* It contains one unit test case for the {@link LagoonProcessor#build(boolean)} method.
*/
class LagoonProcessorTest {
		
	private LagoonContext context;
	
	/* Test case initialization. */
	LagoonProcessorTest(){
		context = new LagoonContext();
	}
	
	@Test
	void testSourceDirPath(){
		assertTrue(!Utils.isDefined("TEST_SOURCE_DIR", context));
	}
	@Test
	void testTargetDir(){
		assertTrue(!Utils.isDefined("TEST_TARGET_DIR", context));
	}
	@Test
	void testResolveLinks(){
		assertTrue(!Utils.isDefined("TEST_RESOLVE_LINKS", context));
	}
	
	@Test
	void testBuild(){
		StringBuilder builder = new StringBuilder();
		assertTrue(!Utils.isDefined("TEST_BUILD", context));
		context.setProperty("TEST_BUILD", "http://localhost/build/dummy/something", builder, null);
		context.setProperty("TEST_BUILD_DATA", "dummy-data", builder, new HashMap<String, String>());
		context.setProperty("TEST_BUILD_FOLDER", rootDir, new StringBuilder(), null);
		
		boolean result = context.build(false);
		assertTrue(builder.indexOf("TEST_BUILD") > 0);
		assertTrue(builder.indexOf("toto-toto.html") > 0);
	}
	
	@Test 
	void testParseSourceDir(){
		LagoonFileParser parser = context.getConfiguration().getParser();
		Link link = parser.parseFile("src/link.xml");
		assertTrue(link!= null);
		String path = link.getPath();
		String relPath = link.getRelPath();
		String expectedPath = rootDir + "/src/" + path.replaceFirst("/", ".") + "/";
		assertEquals(expectedPath, relPath);
	}

	@Test
	void testParseTargetDir(){
		LagoonFileParser parser = context.getConfiguration().getParser();
		Path targetPath = parser.parseFile(Utils.pathJoin(Utils.pathJoin("target", "something"), "dummy-data", "target/something/link.xml"));
		assertTrue(targetPath!= null);
		Path targetRelPath = targetPath.relocate(rootDir);
		Path expectedPath = Utils.pathJoin(Utils.pathJoin(Utils.pathJoin("target", "dummy-data"), "target"), "dummy-data", "link.xml");
		assertEquals(expectedPath, targetRelPath);
	}
	
}