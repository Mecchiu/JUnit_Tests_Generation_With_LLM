// JVCRequestContext_4Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getSessionAttr(String)} method.
*/
class JVCRequestContext_4Test {
		private final JvcRequestContextRequest requestContext = new RequestData();

    @Test
    public void testGetSessionAttr() {
        final Object id = requestContext.getSessionAttr(JVCRequestContext.ID_FIELD);
        assertNotNull("Id should not be null.",id);
        final String path = requestContext.getPath();
        assertNotNull("path should not be null.",path);
        final String tempString = requestContext.getSessionAttr(JVCRequestContext.TEMP_STRING_FIELD);
        assertNotNull("tempString should not be null.",tempString);
        final String httpCode = requestContext.getHttpcode();
        assertNotNull(httpCode);
    }}