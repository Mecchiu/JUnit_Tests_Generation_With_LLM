// ClientHttpRequest_7Test.java
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
* It contains one unit test case for the {@link ClientHttpRequest#post(String, Object, String, Object, String, Object)} method.
*/
class ClientHttpRequest_7Test {
		
    /**
     * post the POST request to the server, with the specified parameters
     *
     * @param name1 first parameter name
     * @param value1 first parameter value
     * @param name2 second parameter name
     * @param value2 second parameter value
     * @param name3 third parameter name
     * @param value3 third parameter value
     * @param name4 fourth parameter name
     * @param value4 fourth parameter value
     * @param name5 fifth parameter name
     * @param value5 fifth parameter value
     * @param name6 sixth parameter name
     * @param value6 sixth parameter value
     * @return input stream with the server response
     * @throws IOException
     * @see setParameter
     */
    public InputStream post(String name1, Object value1, String name2, Object value2, String name3, Object value3, String name4, Object value4, String name5, Object value5, String name6, Object value6) throws IOException {
            return post(name1, value1, name2, value2, name3, value3, name4, value4, name5, value5, name6, value6);
        }
}