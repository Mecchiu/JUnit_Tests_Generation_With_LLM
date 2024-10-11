// JVCRequestContext_1Test.java
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
* It contains one unit test case for the {@link JVCRequestContext#getParamMap(String)} method.
*/
class JVCRequestContext_1Test {


    @Test  
    void testParamMapGet() {
		// JVCRequestContext.testParamMapGet(); // This method is to be in unit test
		JVCRequestContext.getParamMap("foo");
	}

    @Test  
    void testParamMapRemove() {
		// JVCRequestContext.testParamMapRemove(); // This method is to be in unit test
		JVCRequestContext.getParamMap("bar");
	}

    @Test  
    void testParamMapRemove2() {
		// JVCRequestContext.testParamMapRemove2(); // This method is to be in unit test
		JVCRequestContext.getParamMap("bar");
	}	

    @Test  
    void testParamMapRemove3() {
		// JVCRequestContext.testParamMapRemove3(); // This method is to be in unit test
		JVCRequestContext.getParamMap("foo");
    }	
}
