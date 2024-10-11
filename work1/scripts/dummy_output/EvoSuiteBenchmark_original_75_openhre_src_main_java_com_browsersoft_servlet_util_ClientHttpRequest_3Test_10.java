// ClientHttpRequest_3Test.java
package com.browsersoft.servlet.util;

import java.net.URLConnection;
import java.net.URL;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.InputStream;
import java.util.Random;
import java.io.OutputStream;
import java.io.FileInputStream;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientHttpRequest}.
* It contains one unit test case for the {@link ClientHttpRequest#post(Map, Map)} method.
*/
class ClientHttpRequest_3Test {
		/**
		Set the server URI to the <code>url</code>.
		@param url  the target server URI.
		*/
    @Test(expected = IllegalArgumentException.class)
    public void setServerUri_noParam_fail(String url) throws Exception;

    /**
    Set the server URI to the <code>url</code> and parameter set to <code>param_list</code>.
    @param url  the target server URI.
    @param param_list  the set of parameters that be included in the request.
    */
	@Test
	public void setServerUri_param(String url, String[] param_list) throws Exception;

    /**
    Add Cookies as set with parameters.
    @param cookies  the set of cookies
    @throws Exception if add Cookie fail
    */
	@Test
	public void setCookies_noParam(Map cookies) throws Exception;

    /**
    Add Cookies as set with parameters and cookies.
    @param cookies  the set of cookies
    @throws Exception if add Cookie fail
    */
	@Test
	public void setCookies_withParam(Map cookies) throws Exception;

    /**
    Add parameters as set with Cookies.
    @param cookies  the set of Cookies
    @throws Exception if add Cookie fail
    */
	@Test
	public void setParameters_noParam(Map cookies) throws Exception;

    /**
    Add parameters as set with Cookies.
    @param cookies  the set of Cookies
    @throws Exception if add Cookie fail
    */
	@Test
	public void setParameters_withParam(Map cookies) throws Exception;

    /**
    Add parameters as set with Cookies.
    @param cookies  the set of Cookies
    @throws Exception if add Cookie fail
    */
	@Test
	public void setParameters(Map cookies) throws Exception;

    /**
    Add a <code>Content-Type</code> header to set to <code>gzip</code> parameter.
    @param cookies  the set of Cookies
    @throws Exception if add Cookie fail
    */
	@Test
	public void setContentType_compression(Map cookies) throws Exception;

    /**
    Add the File and <code>Content-Type</code> header to set to <code>files</code> parameter.
    @param cookies  the set of Cookies
    @throws Exception if add Cookie fail
    */
    @Test
    public void setContentType_files(Map cookies) throws Exception;

    /**
    Add the File and <code>Content-Type</code> header to set to <code>file</code> parameter using the <code>FileInputStream</code>.
    @param cookies  the set of Cookies
    @throws Exception if add Cookie fail
    */
    @Test
    public void setContentType_file(Map cookies) throws Exception;


    /**
	Add the filename to set to <code>files</code> parameter.
	@param cookies  the set of Cookies
	@throws Exception if add Cookie fail
	*/
	@Test
    public void setFilename_file(Map cookies) throws Exception;

    /**
    Add the filename to set to <code>files</code> parameter using the <code>InputStream</code>.
    @param cookies  the set of Cookies
    @throws Exception if add Cookie fail
    */
	@Test
    public void setFilename_string(Map cookies) throws Exception;

    /**
	Add the filename to set to <code>files</code> parameter using the <code>FileInputStream</code>.
	@param cookies  the set of Cookies
	@throws Exception if add Cookie fail
	*/
	@Test
	public void setFilename_fileInputStream(Map cookies) throws Exception;

    /**
    Add the filename to set to <code>files</code> parameter using the <code>InputStream</code>.
    @param cookies  the set of Cookies
    @throws Exception if add Cookie fail
    */
	@Test
	public void setFilename_inputStream(Map cookies) throws Exception;

    /**
    Add the filename to set to <code>files</code> parameter using the <code>FileInputStream</code>.
    @param cookies  the set of Cookies
    @throws Exception if add Cookie fail
    */
	@Test
    public void setFilename_fileInputStream_noParam_file(Map cookies) throws Exception;

    /**
    Add the name of the file to set to <code>filename</code> parameter.
    @param cookies  the set of Cookies
    @throws Exception if add Cookie fail
    */
	@Test
    public void setFilename_string(Map cookies) throws Exception;

    /**
    Add the name of the file to set to <code>filename</code> parameter.
    @param cookies  the set of Cookies
    @throws Exception if add Cookie fail
    */
	@Test
    public void setFilename_file(Map cookies) throws Exception;

    /**
    Add the path of the file to set to <code>filename</code> parameter.
    @param cookies  the set of Cookies
    @throws Exception if add Cookie fail
    */
	@Test
    public void setFilename_string(Map cookies) throws Exception;

    /**
    Add the path of the file to set to <code>filename</code> parameter.
    @param cookies  the set of Cookies
    @throws Exception if add Cookie fail
    */
	@Test
    public void setFilename_file(Map cookies) throws Exception;

    /**
    Add the HTTP method to set to <code>POST</code> parameter.
    @param cookies  the set of Cookies
    @throws Exception if add Cookie fail
    */
	@Test
    public void setMethod_POST(Map cookies) throws Exception;

    /**
    Add parameters to the set of Cookies.
    @throws Exception if add Cookie fail
    */
	@Test
	public void setParam(Map cookies) throws Exception;
}