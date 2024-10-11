// HttpBot_2Test.java
package net.sourceforge.jwbf.core.bots;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import net.sourceforge.jwbf.core.actions.ContentProcessable;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.GetPage;
import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpBot}.
* It contains ten unit test cases for the {@link HttpBot#getPage(String)} method.
*/
class HttpBot_2Test {

		private static final String URL = "http://www.google.com/";
		private static final String URL_2 = "http://www.google.com/search?q=test";
		private static final String URL_3 = "http://www.google.com/search?q=test&hl=en";
		private static final String URL_4 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search";
		private static final String URL_5 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search&aq=f";
		private static final String URL_6 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search&aq=f&oq=";
		private static final String URL_7 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search&aq=f&oq=&aqi=";
		private static final String URL_8 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search&aq=f&oq=&aqi=&aql=";
		private static final String URL_9 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search&aq=f&oq=&aqi=&aql=&gs_sm=e";
		private static final String URL_10 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search&aq=f&oq=&aqi=&aql=&gs_sm=e&gs_upl=0l0l0l0l0l0l0l0l0l0l0l0ll0l0";
		
		private static final String URL_11 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search&aq=f&oq=&aqi=&aql=&gs_sm=e&gs_upl=0l0l0l0l0l0l0l0l0l0l0l0ll0l0&bav=on.2,or.r_gc.r_pw.r_qf.,cf.osb&fp=d9b9b8b8b8b8b8b8&biw=1280&bih=853";
		private static final String URL_12 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search&aq=f&oq=&aqi=&aql=&gs_sm=e&gs_upl=0l0l0l0l0l0l0l0l0l0l0l0ll0l0&bav=on.2,or.r_gc.r_pw.r_qf.,cf.osb&fp=d9b9b8b8b8b8b8b8&biw=1280&bih=853&um=1&ie=UTF-8&tbm=isch&source=og&sa=N&tab=wi&ei=XQQXTs_bH4L-sgaVhJWnDQ";
		private static final String URL_13 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search&aq=f&oq=&aqi=&aql=&gs_sm=e&gs_upl=0l0l0l0l0l0l0l0l0l0l0l0ll0l0&bav=on.2,or.r_gc.r_pw.r_qf.,cf.osb&fp=d9b9b8b8b8b8b8b8&biw=1280&bih=853&um=1&ie=UTF-8&tbm=isch&source=og&sa=N&tab=wi&ei=XQQXTs_bH4L-sgaVhJWnDQ&sei=XgQXTs_bH4L-sgaVhJWnDQ";
		private static final String URL_14 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search&aq=f&oq=&aqi=&aql=&gs_sm=e&gs_upl=0l0l0l0l0l0l0l0l0l0l0l0ll0l0&bav=on.2,or.r_gc.r_pw.r_qf.,cf.osb&fp=d9b9b8b8b8b8b8b8&biw=1280&bih=853&um=1&ie=UTF-8&tbm=isch&source=og&sa=N&tab=wi&ei=XQQXTs_bH4L-sgaVhJWnDQ&sei=XgQXTs_bH4L-sgaVhJWnDQ&ved=0CAcQsAQ";
		private static final String URL_15 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search&aq=f&oq=&aqi=&aql=&gs_sm=e&gs_upl=0l0l0l0l0l0l0l0l0l0l0l0ll0l0&bav=on.2,or.r_gc.r_pw.r_qf.,cf.osb&fp=d9b9b8b8b8b8b8b8&biw=1280&bih=853&um=1&ie=UTF-8&tbm=isch&source=og&sa=N&tab=wi&ei=XQQXTs_bH4L-sgaVhJWnDQ&sei=XgQXTs_bH4L-sgaVhJWnDQ&ved=0CAcQsAQ&iact=rc&dur=8&page=1&start=0&ndsp=12";
		private static final String URL_16 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search&aq=f&oq=&aqi=&aql=&gs_sm=e&gs_upl=0l0l0l0l0l0l0l0l0l0l0l0ll0l0&bav=on.2,or.r_gc.r_pw.r_qf.,cf.osb&fp=d9b9b8b8b8b8b8b8&biw=1280&bih=853&um=1&ie=UTF-8&tbm=isch&source=og&sa=N&tab=wi&ei=XQQXTs_bH4L-sgaVhJWnDQ&sei=XgQXTs_bH4L-sgaVhJWnDQ&ved=0CAcQsAQ&iact=rc&dur=8&page=1&start=0&ndsp=12&tx=66&ty=37";
		private static final String URL_17 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search&aq=f&oq=&aqi=&aql=&gs_sm=e&gs_upl=0l0l0l0l0l0l0l0l0l0l0l0ll0l0&bav=on.2,or.r_gc.r_pw.r_qf.,cf.osb&fp=d9b9b8b8b8b8b8b8&biw=1280&bih=853&um=1&ie=UTF-8&tbm=isch&source=og&sa=N&tab=wi&ei=XQQXTs_bH4L-sgaVhJWnDQ&sei=XgQXTs_bH4L-