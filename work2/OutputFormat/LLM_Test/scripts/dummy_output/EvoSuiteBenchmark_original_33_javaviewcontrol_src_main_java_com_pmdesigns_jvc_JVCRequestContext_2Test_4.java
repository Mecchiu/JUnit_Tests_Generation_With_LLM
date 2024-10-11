// JVCRequestContext_2Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getParamValues(String)} method.
*/
class JVCRequestContext_2Test {
		
	private static final String JVC_URL = "JVC.jvc";
	// private static final String HTTP_URL = "http://localhost:8080/jvc.jvc";

    private static final String PARAM_VALUE_FILE_EXTENSION = ".txt";
    private static final String PARAM_VALUE_FILE_PATH = "/path/file";
    private static final String JAVA_FILE_EXTENSION = ".java";

	static {
		System.setProperty("java.library.path", "/../../");
	}
	
    /**
     * @throws Exception if the application is not properly set up.
     * @see JVCRequestContext#JVCRequestContextTest
     */
    @Test
    public void testGetParamValues() throws Exception {
        // test a simple param
        String key = "foo";
        String value = "bar";
        assertEquals("Should get a parameter value with key " + key +
                                     " and value " + value,
                    value, JVCRequestContext.getParamValues(key) );

        // test a parameter file extension
        key = "ext";
        value = PARAM_VALUE_FILE_EXTENSION;
        assertEquals("Should get a parameter value with key " + key +
                                     " and value " + value,
                    value, JVCRequestContext.getParamValues(key) );

        // test a parameter file path
        key = "path";
        value = PARAM_VALUE_FILE_PATH;
        assertEquals("Should get a parameter value with key " + key +
                                     " and value " + value,
                    value, JVCRequestContext.getParamValues(key) );

        // should throw an error on a parameter without the path
        try {
            JVCRequestContext.getParamValues(KEY_NOT_A_PARAM);
            fail("Should have thrown a KeyNotActualClassException");
        } catch (KeyNotActualClassException e) {
            assertEquals("There should be a parameter with the name: KeyNotActualClassException and the key: " + key,
                        "KeyNotActualClassException", e.getMsg());
        }
        
        final String PARAM_KEY_NO_PATH = "nopath";

        testGetParamValues_Key(PARAM_KEY_NO_PATH, PARAM_VALUE_FILE_EXTENSION, PARAM_VALUE_FILE_PATH);
        testGetParamValues_Key(PARAM_KEY_NO_PATH, PARAM_VALUE_FILEEXT, PARAM_VALUE_FILE_PATH);
        testGetParamValues_Key(PARAM_KEY_NO_PATH, PARAM_VALUE_FILE_PATH, PARAM_VALUE_FILEEXT);        
    }

    /**
     * Tests the paramNames access by
     * getParamNames() method.
     * @param PARAM_KEY_NO_PATH key
     * @param PARAM_VALUE_FILE_EXTENSION extension
     * @param PARAM_VALUE_FILE_PATH path
     */
    private static void testGetParamValues_Key(String PARAM_KEY_NO_PATH, String PARAM_VALUE_FILE_EXTENSION, String PARAM_VALUE_FILE_PATH) {
        
        String paramKey = "nopath";
        String paramValueFileExtension = PARAM_VALUE_FILE_EXTENSION;
        String paramValueFilePath = PARAM_VALUE_FILE_PATH;

        // create some temporary files...
        FileParam fileParam = new FileParam();
        fileParam.setParameterKey(paramKey);
        fileParam.setParameterValueFileExtension(paramValueFileExtension);
        fileParam.setParameterValueFilePath(paramValueFilePath);

        //... add some temp files for tests...
        ArrayList<FileParam> tempParameters = new ArrayList();
        FileParam fileParam2 = new FileParam();
        fileParam2.setParameterKey(paramKey);
        fileParam2.setParameterValueFile(fileParam.getParameterValueFile());

        //... add...
        tempParameters.add(fileParam2);
        fileParam.setParameterValues(tempParameters);

        JVCRequestContext.getParamNames(PARAM_KEY_NO_PATH);
        assertEquals("Should return a list with a param with the name: " + PARAM_KEY_NO_PATH + " with a value of " + paramValueFilePath,
                    fileParam.getParameterNames(), getParamValues(PARAM_KEY_NO_PATH));
    }


    /**
     *  Returns a parameter value map for the requested param
     *  (or null if the param isn't present).
     *  @param key parameter key or list [extension] with value [path]
     *  @return a parameter value map for the param value(s).  This can be empty
     *  @see RequestContextJUnitTest
     */
    public static Map<String, String> getParamValues(String key) {
        Map<String, String> result;
        Collection<FileParam> tempParameters;
        try {
            tempParameters = JVCRequestContext.getParamNames(key);
        } catch (KeyNotActualClassException e) {
            fail("There should be a parameter with the name: " + key + " and the key: " + key);
        }
        return getParamMap(tempParameters);
    }
    
    private static Map<String, String> getParamMap(Collection<FileParam> params) {
        StringBuilder sb = new StringBuilder();
        boolean firstParam = true;
        for (FileParam param : params) {
            if (firstParam) {
                sb.append(param.getParameterValue());
                firstParam = false;
            } else {
                sb.append('.');
            }
            sb.append(param.getParameterName());
        }
        return new LinkedHashMap<String, String>(params.size());
    }

    
    /**
     * Return a collection of the parameters for this context.
     * @param key the name of the parameter
     * @return a collection of parameter values
     */
    public static Collection<FileParam> getParamNames(final String key) {
        
}
}