// JVCRequestContext_7Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#makeLink(String, String)} method.
*/
class JVCRequestContext_7Test {
		
    /**
     * JVCRequestContext: create an html anchor link tag based on an anchor
     */
    @Test
	public void testMakeLink_01() throws IOException {
									 final HttpServletRequest req = RequestContext.fromServletRequest("testservletrequest","http://localhost:8080");
									 final String url = req.getRequestURL().toString();
		System.out.println("Starting in \"test servlet\" from request=\"" + req.getRequestURL().toString() + "\"");
									 final UrlClass urlClass = (UrlClass)ServletContext.class;
				System.out.println("== " + urlClass);
		System.out.println("Current URL: \"" + url + "\"");
		System.out.println("Expecting a HTML anchor link tag: \"<a href=\"" + url + "\">\"\"\"");

		final Class<?> clazz = req.getClass();
		final String currentUrl = urlClass.getHttpUrlClass(clazz);
		System.out.println("Current URL: \"" + currentUrl + "\"");
		assertEquals(currentUrl, urlClass.getUrlClass(clazz,req));

		final String link = "http://localhost:8080/jvcrequestcontext/htmlfilelinktag";
		final String flash = JVCRequestContext.makeLink(link, url);
				System.out.println("FLASH: \"" + flash + "\"");

		assertTrue(flashesAre(link,flash));
		
		final String[] rels = new String[] { "", "_self.html" };
		final String[] rels2 = new String[] { "",  "_self.html", "_other.html" };

		for (int i=0; i<rels.length; i++)
			assertTrue(hrefsAre(link+"&#x3D",rels[i],link+"&#x3D",rels2[i]));
		
		final String[] nohref = new String[] { "", "", "_self.html" };
		assertTrue(nohrefAre(link+"_self.html",nohref[0],link+"_other.html",nohref[1]));

		assertTrue(norelsAre(link+"_other.html",nohref[0],link+"_self.html"));

		assertFalse(flashAre(link+"_self.html"));
		
		assertFalse(hrefsAre(link+"_self.html",nohref[0],_self.html));
		
		assertFalse(hrefsAre(link+"_other.html",_self.html,link+"_self.html"));
	}


	private boolean FlashAreEqual(String Flash1,String Flash2) {
		String [] flashData1 = Flash1.split("=");
		String [] flashData2 = Flash2.split("=");
		if(flashData1.length!= flashData2.length) {
			return false;
		}
		return flashData1[0].equals(flashData2[0]);
	}
	
	
	
	private boolean hrefsAre(String href1, String href2, String href3) {
	  	return hrefsAre(href1,href2) && hrefsAre(href2,href3);
	}
	
	
	/**
	 *
	 * @param href1
	 * @param href2
	 */
	private boolean hrefsAre(String href1, String href2) {
		return href1.equals(href2);
	}
	/**
	 *
	 * @param href1
	 * @param href2
	 */
	private boolean hrefsAre(String href1, String href2,String href3) {
		return href1.equals(href2) && hrefsAre(href2,href3) && hrefsAre(href3,href2);
	}
	private boolean checksAre(String... checks) {
		for (String check : checks) {
			if(!checksAre(check))
				return false;
		}
		return true;
	}

	private boolean checksAre(String check) {
		return  (check.length() >0 && 
				(check.substring(0,1).toUpperCase()    == check.substring(1).toUpperCase()) &&
				(check.substring(1).toLowerCase() == check.substring(2).toLowerCase()) &&
					(check.charAt(0)   == check.charAt(1))) &&
				(check.charAt(1)   == check.charAt(2));
	}
	private boolean checksAre(String... checks) {
		for(String check : checks) {
			if(!checksAre(check))
				return false;
		}
		return true;
	}

	private boolean nohrefMatch(String href) {
		if (_self.href!= null)
			if (_self.href.equals(href))
				return true;
		for (String nohref : _nohr)
			if (_nohr.get(nohref) == href)
				return false;
		return true;
	}
}