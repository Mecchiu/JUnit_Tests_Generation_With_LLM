// DownloadFolderTag_1Test.java
package org.heal.tag.download;

import org.heal.module.download.DownloadQueueBean;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.util.FileLocator;
import javax.servlet.jsp.tagext.TagSupport;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadFolderTag}.
* It contains one unit test case for the {@link DownloadFolderTag#doEndTag()} method.
*/
class DownloadFolderTag_1Test {
		public static final String TEST_STRING =
				"<html><head><title>A Test String</title></head><body>"
		    		+ "<!-- A test -->" + "<head>"
				+ "<title>A test footer</title>"
				+ "<meta name=\"generator\" content=\"org.cgiar - www.caget.org\">"
				+"</head>"
				+ "<body>"
				+ "<p><a onclick='a =1;'>This is a test footer</a></p>"
				+ "</body>"
		    		+ "</html>";

		@Test
		public void testTag_1() throws Throwable {
				assertEquals("http://www.google.com/", FileLocator.loadAndGetResourceLocation("junit/simple_test.html"));

				// testTag.doStartTag(pageContext)
				assertEquals("http://www.google.com/", FileLocator.loadAndGetResourceLocation("junit/simple_test.html"));
				assertEquals("html", FileLocator.loadAndGetResourceLocation("junit/simple_test.html"));

				// testTag.doEndTag()
				assertEquals("http://www.google.com/", FileLocator.loadAndGetResourceLocation("junit/simple_test.html"));
				assertEquals("html", FileLocator.loadAndGetResourceLocation("junit/simple_test.html"));
		}
}