// HeaderSettingsTest.java
package httpanalyzer;

import org.apache.http.Header;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HeaderSettings}.
* It contains ten unit test cases for the {@link HeaderSettings#setHeaders()} method.
*/
class HeaderSettingsTest {

	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns the correct headers.
	 */
	@Test
	void testSetHeaders() {
		HeaderSettings.initHeaders(HeaderSettings.FIREFOX, "http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[0].getName(), "User-Agent");
		assertEquals(headers[0].getValue(), "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)");
		assertEquals(headers[1].getName(), "Referer");
		assertEquals(headers[1].getValue(), "http://www.google.com");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns the correct headers.
	 */
	@Test
	void testSetHeaders2() {
		HeaderSettings.initHeaders(HeaderSettings.IE6, "http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[0].getName(), "User-Agent");
		assertEquals(headers[0].getValue(), "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1)");
		assertEquals(headers[1].getName(), "Referer");
		assertEquals(headers[1].getValue(), "http://www.google.com");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns the correct headers.
	 */
	@Test
	void testSetHeaders3() {
		HeaderSettings.initHeaders(HeaderSettings.IE7, "http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[0].getName(), "User-Agent");
		assertEquals(headers[0].getValue(), "Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.0)");
		assertEquals(headers[1].getName(), "Referer");
		assertEquals(headers[1].getValue(), "http://www.google.com");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns the correct headers.
	 */
	@Test
	void testSetHeaders4() {
		HeaderSettings.initHeaders(HeaderSettings.IE8, "http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[0].getName(), "User-Agent");
		assertEquals(headers[0].getValue(), "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1)");
		assertEquals(headers[1].getName(), "Referer");
		assertEquals(headers[1].getValue(), "http://www.google.com");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns the correct headers.
	 */
	@Test
	void testSetHeaders5() {
		HeaderSettings.initHeaders(HeaderSettings.GOOGLEBOT, "http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[0].getName(), "User-Agent");
		assertEquals(headers[0].getValue(), "Mozilla/5.0 (compatible; Googlebot/2.1; +http://www.google.com/bot.html)");
		assertEquals(headers[1].getName(), "Referer");
		assertEquals(headers[1].getValue(), "http://www.google.com");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns the correct headers.
	 */
	@Test
	void testSetHeaders6() {
		HeaderSettings.initHeaders(HeaderSettings.MSNBOT, "http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[0].getName(), "User-Agent");
		assertEquals(headers[0].getValue(), "msnbot/1.1 (+http://search.msn.com/msnbot.htm)");
		assertEquals(headers[1].getName(), "Referer");
		assertEquals(headers[1].getValue(), "http://www.google.com");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns the correct headers.
	 */
	@Test
	void testSetHeaders7() {
		HeaderSettings.initHeaders(HeaderSettings.YAHOOBOT, "http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[0].getName(), "User-Agent");
		assertEquals(headers[0].getValue(), "Mozilla/5.0 (compatible; Yahoo! Slurp; http://help.yahoo.com/help/us/ysearch/slurp)");
		assertEquals(headers[1].getName(), "Referer");
		assertEquals(headers[1].getValue(), "http://www.google.com");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns the correct headers.
	 */
	@Test
	void testSetHeaders8() {
		HeaderSettings.initHeaders(HeaderSettings.IPHONE, "http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[0].getName(), "User-Agent");
		assertEquals(headers[0].getValue(), "Mozilla/5.0 (iPhone; U; CPU iPhone OS 3_0 like Mac OS X; en-us) AppleWebKit/528.18 (KHTML, like Gecko) Version/4.0 Mobile/7A341 Safari/528.16");
		assertEquals(headers[1].getName(), "Referer");
		assertEquals(headers[1].getValue(), "http://www.google.com");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns the correct headers.
	 */
	@Test
	void testSetHeaders9() {
		HeaderSettings.initHeaders(HeaderSettings.CUSTOM, "http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[0].getName(), "User-Agent");
		assertEquals(headers[0].getValue(), "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)");
		assertEquals(headers[1].getName(), "Referer");
		assertEquals(headers[1].getValue(), "http://www.google.com");
	}
	
	/**
	 * Test case for {@link HeaderSettings#setHeaders()} method.
	 * It checks if the method returns the correct headers.
	 */
	@Test
	void testSetHeaders10() {
		HeaderSettings.initHeaders("User-Agent: Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)\nReferer: http://www.google.com");
		Header[] headers = HeaderSettings.setHeaders();
		assertEquals(headers[0].getName(), "User-Agent");
		assertEquals(headers[0].getValue(), "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1; .NET CLR 1.1.4322; .NET CLR 2.0.50727)");
		assertEquals(headers[1].getName(), "Referer");
		assertEquals(headers[1].getValue(), "http://www.google.com");
	}
}

// HttpAnalyzer.java
package httpanalyzer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

/**
 * @author vlad
 */
public class HttpAnalyzer {

    private static String url;

    private static String content;

    private static String contentType;

    private static String contentEncoding;

    private static String contentLength;

    private static String contentLanguage;

    private static String contentDisposition;

    private static String contentMD5;

    private static String contentLocation;

    private static String contentRange;

    private static String contentTransferEncoding;

    private static String contentExpires;

    private static String contentLastModified;

    private static String contentETag;

    private static String contentServer;

    private static String contentSetCookie;

    private static String contentSetCookie2;

    private static String contentVia;

    private static String contentXAspNetVersion;

    private static String contentXPoweredBy;

    private static String contentXAspNetMvcVersion;

    private static String contentXCache;

    private static String contentXCacheLookup;

    private static String contentXCacheVarnish;

    private static String contentXVarnish;

    private static String contentXUaCompatible;

    private static String contentXFrameOptions;

    private static String contentXContentTypeOptions;

    private static String contentXWebKitCsp;

    private static String contentXP3P;

    private static String contentXCsrfToken;

    private static String contentXRequestedWith;

    private static String contentXWapProfile;

    private static String contentXUacompatible;

    private static String contentXUaCompatibleIE8;

    private static String contentXUaCompatibleIE9;

    private static String contentXUaCompatibleIE10;

    private static String contentXUaCompatibleIE11;

    private static String contentXUaCompatibleEdge;

    private static String contentXUaCompatibleChrome1;

    private static String contentXUaCompatibleChrome2;

    private static String contentXUaCompatibleFirefox;

    private static String contentXUaCompatibleSafari;

    private static String contentXUaCompatibleOpera;

    private static String contentXUaCompatibleAndroid;

    private static String contentXUaCompatibleIphone;

    private static String contentXUaCompatibleIpad;

    private static String contentXUaCompatibleIpod;

    private static String contentXUaCompatibleBlackberry;

    private static String contentXUaCompatibleWindowsPhone;

    private static String contentXUaCompatibleNokia;

    private static String contentXUaCompatibleWebos;

    private static String contentXUaCompatibleKindle;

    private static String contentXUaCompatibleMobile;

    private static String contentXUaCompatibleTablet;

    private static String contentXUaCompatiblePc;

    private static String contentXUaCompatibleTv;

    private static String contentXUaCompatibleWatch;

    private static String contentXUaCompatibleRobot;

    private static String contentXUaCompatibleSpider;

    private static String contentXUaCompatibleBot;

    private static String contentXUaCompatibleCrawler;

    private static String contentXUaCompatibleSearch;

    private static String contentXUaCompatibleFavicon;

    private static String contentXUaCompatibleRss;

    private static String contentXUaCompatibleAtom;

    private static String contentXUaCompatibleFeed;

    private static String contentXUaCompatibleWap;

    private static String contentXUaCompatibleWml;

    private static String contentXUaCompatibleHtml;

    private static String contentXUaCompatibleHtml5;

    private static String contentXUaCompatibleXhtml;

    private static String contentXUaCompatibleXhtmlMobile;

    private static String contentXUaCompatibleXhtmlBasic;

    private static String contentXUaCompatibleXhtmlMp;

    private static String contentXUaCompatibleXhtmlMp12;

    private static String contentXUaCompatibleXhtmlMp11;

    private static String contentXUaCompatibleXhtmlMp10;

    private static String contentXUaCompatibleXhtmlMp9;

    private static String contentXUaCompatibleXhtmlMp8;

    private static String contentXUaCompatibleXhtmlMp7;

    private static String contentXUaCompatibleXhtmlMp6;

    private static String contentXUaCompatibleXhtmlMp5;

    private static String contentXUaCompatibleXhtmlMp4;

    private static String contentXUaCompatibleXhtmlMp3;

    private static String contentXUaCompatibleXhtmlMp2;

    private static String contentXUaCompatibleXhtmlMp1;

    private static String contentXUaCompatibleXhtmlMp0;

    private static String contentXUaCompatibleXhtmlMpA;

    private static String contentXUaCompatibleXhtmlMpB;

    private static String contentXUaCompatibleXhtmlMpC;

    private static String contentXUaCompatibleXhtmlMpD;

    private static String contentXUaCompatibleXhtmlMpE;

    private static String contentXUaCompatibleXhtmlMpF;

    private static String contentXUaCompatibleXhtmlMpG;

    private static String contentXUaCompatibleXhtmlMpH;

    private static String contentXUaCompatibleXhtmlMpI;

    private static String contentXUaCompatibleXhtmlMpJ;

    private static String contentXUaCompatibleXhtmlMpK;

    private static String contentXUaCompatibleXhtmlMpL;

    private static String contentXUaCompatibleXhtmlMpM;

    private static String contentXUaCompatibleXhtmlMpN;

    private static String contentXUaCompatibleXhtmlMpO;

    private static String contentXUaCompatibleXhtmlMpP;

    private static String contentXUaCompatibleXhtmlMpQ;

    private static String contentXUaCompatibleXhtmlMpR;

    private static String contentXUaCompatibleXhtmlMpS;

    private static String contentXUaCompatibleXhtmlMpT;

    private static String contentXUaCompatibleXhtmlMpU;

    private static String contentXUaCompatibleXhtmlMpV;

    private static String contentXUaCompatibleXhtmlMpW;

    private static String contentXUaCompatibleXhtmlMpX;

    private static String contentXUaCompatibleXhtmlMpY;

    private static String contentXUaCompatibleXhtmlMpZ;

    private static String contentXUaCompatibleXhtmlMpAa;

    private static String contentXUaCompatibleXhtmlMpAb;

    private static String contentXUaCompatibleXhtmlMpAc;

    private static String contentXUaCompatibleXhtmlMpAd;

    private static String contentXUaCompatibleXhtmlMpAe;

    private static String contentXUaCompatibleXhtmlMpAf;

    private static String contentXUaCompatibleXhtmlMpAg;

    private static String contentX