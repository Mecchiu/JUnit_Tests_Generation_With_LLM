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
		String urlPath;
		String urlEncodedPath;
		String testPath;
		String encodingPath;
		String encodingFile;
		String encodingInputStream;
	public URLContentTest() {
	}
    int length = 10;
    int pathPrefixLength = 0;
    int contentCountBeforeGetPath = 4;
    int contentCountAfterGetPath = 0;
    int contentCountBeforeGetStringPath = 0;
    int contentCountAfterGetStringPath = 0;
    int contentCountBeforeGetBooleanPath = 0;
    int contentCountAfterGetBooleanPath = 0;
    int contentCountBeforeGetBytesPath = 0;
    int contentCountAfterGetBytesPath = 0;
    
    /**
     * Test method for {@link URLContent#getURL()}.
     */
    @Test
    public void testGetNullURL() {
        String emptyString = " ";
        String nullString = null;
        assertNotNull( "getURL should not throw null", URLContent.getURL( nullString ));

        if(!URLContent.isJAREntry ( emptyString )) {
            inputStream = null;
            expectedPath = null;
            expectedStringPath = null;
            expectedBooleanPath = null;
            expectedBytesPath = null;
        } else {
                        return;
                    
        }
        
    }

    /**
     * Test method for {@link URLContent#openStream()}.
     */
    @Test
    public void testOpenStream() throws MalformedURLException, IOException {  
		
		assertNull ( "Should be null", URLContent.getURL( "" ));
		assertNull( "Should be null", URLContent.getURL( null ));
		assertNotNull ( "Should not throw exception", URLContent.openStream( "" ));
		assertNotNull( "Should not throw exception", URLContent.openStream( null ));

        FileInputStream fileInputStream = null;
		try {
			URLContent.openStream( "" );
			
		} catch ( MalformedURLException e ) {
			fail( "Exception should not happen due to URL", e );
		} catch ( IOException e ) {
			fail( "Exception should not happen due to URL", e );
		}
	}

    /**
     * Test method for {@link URLContent#isJAREntry()}.
     */
    @Test
    public void testGetJAREntry() throws MalformedURLException, IOException {  
        assertNull( "Should return null", URLContent.getURL( "http://www.eteks.net/content/" ));
        assertNotNull( "Should not throw exception", URLContent.getLink( "http://www.eteks.net/content/" ));
        assertNotNull( "Should not throw exception", URLContent.getByteArray( "http://www.eteks.net/content/" ));
        assertNotNull( "Should not throw exception", URLContent.getBytes( "http://www.eteks.net/content/" ));

        FileInputStream fileInputStream = null;
        try {
		urlPath = "http://www.eteks.net/content/";
		urlEncodedPath = urlPath;
		testPath = "content/";
        fileInputStream = new FileInputStream("/temp");
		assertNotNull( "Should not throw exception", URLContent.openStream( urlPath ));
        contentCountAfterGetPath = 1;
        expectedPath = testPath;
		expectedStringPath = testPath + "content?url=";
        expectedBooleanPath = expectedStringPath + URLContent.isJAREntry("/temp/content/");
        expectedBytesPath = expectedBooleanPath + URLContent.getBytes("/temp/content/?url=");
        expectedJAREntryQueryTest = URLContent.getJAREntry("http://www.eteks.net/content/page?url=content/content/");

        } catch ( MalformedURLException e ) {
           fail( "Exception should not happen due to malformed URL", e );
        }catch ( IOException e ) {
           fail( "Exception should not happen due to malformed URL", e );
        }            
            
        }
                
    /**
     * Test method for {@link URLContent#getURL()}.
     */
    @Test
    public void testGetJAREntryPath() throws MalformedURLException, IOException {      
        URLContent urlContent = URLContent.getURL( "http://www.eteks.net/content/content/" );
        assertNotNull( "Should not throw exception", urlContent );
        contentCountAfterGetPath = 1;
        expectedPath = testPath + "content/";
        expectedStringPath = testPath + "content?url=";
        expectedBooleanPath = expectedStringPath + URLContent.isJAREntry("/temp/content/");
        expectedBytesPath = expectedBooleanPath + URLContent.getBytes("/temp/content/?url=");
        expectedJAREntryQueryTest = urlContent;
        
        }
}