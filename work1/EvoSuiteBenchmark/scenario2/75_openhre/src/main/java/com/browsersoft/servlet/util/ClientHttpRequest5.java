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

/**
 * <p>Title: Client HTTP Request class</p>
 * <p>Description: this class helps to send POST HTTP requests with various form data,
 * including files. Cookies can be added to be included in the request.</p>
 *
 * @author Vlad Patryshev
 * @version 1.0
 */
public class ClientHttpRequest {

    /**
     * post the POST request to the server, with the specified parameter
     *
     * @param name parameter name
     * @param value parameter value
     * @return input stream with the server response
     * @throws IOException
     * @see setParameter
     */
    public InputStream post(String name, Object value) throws IOException {
        setParameter(name, value);
        return post();
    }
}
