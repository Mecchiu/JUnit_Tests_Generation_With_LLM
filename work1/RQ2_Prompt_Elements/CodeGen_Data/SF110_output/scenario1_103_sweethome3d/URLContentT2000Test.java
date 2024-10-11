// URLContentTest.java
package com.eteks.sweethome3d.tools;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import com.eteks.sweethome3d.model.Content;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link URLContent}.
* It contains one unit test case for the {@link URLContent#openStream()} method.
*/
class URLContentTest {
URL url;
		
		public URLContentTest() throws MalformedURLException {}
		
		@Test
		public void openStream_valid() throws MalformedURLException {
			URL urlNew = URL.createFileURL("sample.png");	// File URL for valid content.
			assertEquals("sample.png", this.url.openStream().toString());
			
			URL urlNew2 = URL.createNewFileURL("sample.png");	// File URL for valid content.
			assertEquals("sample.png", this.url.openStream().toString());
			
			URL urlValid = new URL("file:///home/admin/user/images/picture.png");	// File URL for invalid content.
			try {
				this.url.openStream();
				fail();
			}
			catch (IOException e) {
				assertTrue(e.getMessage().endsWith("URL isn't a proper URI"));
			}			
		}
		
		@Test
		public void openStream_valid2() throws MalformedURLException {
				this.url = new URL("file:///home/admin/user/images/picture.png");
				Content content = this.url.openStream();
        assertEquals("picture.png",content.toString());
        
        Content c1 = this.url.openStream();
        assertEquals("sample.png",c1.toString());
				
		}
		
		@Test
		public void openStream_invalid() throws MalformedURLException {
			URL urlNew = new URL("../../../../../../../../../../../../../../../../..");
			try {
				urlNew.openStream();
				fail();
			}
			catch (IOException e) {
				assertEquals("The content isn't a valid P2P URL", e.getMessage());
			}
				
		}
	}
