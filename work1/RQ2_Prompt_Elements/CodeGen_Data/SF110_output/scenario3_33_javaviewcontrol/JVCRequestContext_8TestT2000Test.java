// JVCRequestContext_8Test.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JVCRequestContext}.
* It contains one unit test case for the {@link JVCRequestContext#makeLink(String, String, String)} method.
*/
class JVCRequestContext_8Test {


    /**
     * Test method for {@link JVCRequestContext#makeLink(String, String, String)}.
     */
    @Test
    public final void makeLinkTest() {
        
        final LinkedHashMap<String, String> flash = new LinkedHashMap<String, String>();
        JVCRequestContext.makeLink("http://www.pmdesigns.com/", "/index.html", flash);
        assertTrue(flash.get("flash_name")!=null);
        assertTrue(flash.get("flash_value")==null);
        
        JVCRequestContext.makeLink("http://www.pmdesigns.com/", "/index.php", flash);
        assertTrue(flash.get("flash_name")!=null);
        assertFalse(flash.get("flash_name").endsWith("/"));
        assertTrue(flash.get("flash_value").startsWith("/index.html"));
    }
	
	/**
     * Test method for {@link JVCRequestContext#makeLink(String, String, String)}.
     * Test that links with URLs starting with a forward slash can be constructed 
     * correctly with the default behavior (without the /).
     */
    @Test
    public final void makeLinkWithForwardSlash() {
        // construct a link with an absolute url
        String testLink = "http://www.pmdesigns.com/index.html";
        Link link = new Link("some url", testLink);
        String absLink = JVCRequestContext.makeLink(testLink, link.getUrl(), link.getTitle());
        String target = link.getUrl().substring(0, link.getUrl().indexOf("target"));
        assertEquals("/index.html?someurl=", absLink);
        assertEquals("http://www.pmdesigns.com/index.html", target);
        
        // construct a link without URL
        String testLink2 = "http://www.pmdesigns.com/index.php";
        link = new Link("some url", testLink2, null);
        String absLink2 = JVCRequestContext.makeLink(testLink2, link.getUrl(), link.getTitle());
        target = link.getUrl().substring(0, link.getUrl().indexOf("target"));
        assertEquals("/pages/testlink2", absLink2);
            
        // construct a link with a target
        String testLink3 = "http://www.pmdesigns.com/index.html";
        testLink3 = testLink3.replaceAll("/$", "");
        String absLink3 = JVCRequestContext.makeLink(testLink3, link.getUrl(), link.getTitle());
        String target2 = link.getUrl().substring(0, link.getUrl().indexOf("target"));
        String target3 = link.getUrl().substring(link.getUrl().indexOf("target"));
        assertEquals("/pages/testlink3", absLink3);
        assertEquals("" + target2 + target3, target2 + target3);    
        
        // construct a link with a target, including the path
        String testLinks[] = { "/pages/index.html", "/content", "/comments", "/messages" };
        Link[] links = new Link[testLinks.length];
        String[] absLinks = new String[testLinks.length];
        for (int i=0;i<testLinks.length;i++) {
            links[i] = new Link(testLinks[i], testLinks[i], "content.html");
            absLinks[i] = JVCRequestContext.makeLink(testLinks[i], links[i].getUrl(), links[i].getTitle());
        }
        
        for (int i=0;i<testLinks.length;i++) {
            String link2 = links[i].getUrl().substring(0, links[i].getUrl().indexOf("target"));
            assertEquals(link2+links[i].getTitle(), absLinks[i]);
        }
        
    }
    
    /**
     * Test method for {@link JVCRequestContext#makeLink(String, String, String)}.
     * Test that links with URLs starting with a forward slash can be constructed 
     * correctly with the default behavior (without the /).
     */
    @Test
    public final void makeLinkWithAbsentTarget() {
        // construct a link with an absolute url
        String testLink = "http://www.pmdesigns.com/index.html";
        String absLink = JVCRequestContext.makeLink(testLink, null, link.getTitle());
        String testHref = absLinkToHref(absLink);
        assertNull(testHref);
        
        // construct a link without URL
        String testLink2 = "http://www.pmdesigns.com/index.php";
        String testHref2 = JVCRequestContext.makeLink(testLink2, testLink2, "some value");
        assertEquals("http://www.pmdesigns.com/index.php", testHref2);
        
        // construct a link with a target
        String testLink3 = "http://www.pmdesigns.com/index.html";
        String testHref3 = JVCRequestContext.makeLink(testLink3, testHref, link.getTitle());
        String testHref4 = JVCRequestContext.makeLink(testLink3, testLink3, link.getTitle());
        assertEquals("http://www.pmdesigns.com/index.html?somevalue", testHref4);
            
        // construct a link without URL
        String testLink4 = "http://www.pmdesigns.com/index.php";
        String testLink4b = JVCRequestContext.makeLink(testLink4, testLink4, "some value");
        assertEquals("http://www.pmdesigns.com/index.html#somevalue", testLink4b);
                
    }
    
    /**
     * Gets a URL including the given path name.  For example:
     *    makeLink("/pages