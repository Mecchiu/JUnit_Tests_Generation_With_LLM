// JVCDispatcherTest.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;
import com.pmdesigns.jvc.tools.Base64Coder;
import com.pmdesigns.jvc.tools.JVCGenerator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JVCDispatcher}.
* It contains one unit test case for the {@link JVCDispatcher#getRC()} method.
*/
class JVCDispatcherTest {
		private static final String[] BASEPARAMS = {
				"request.paramOne=10;request.paramTwo=3",
		};

	/**
	 * Test for {@link JVCDispatcher#getRC()} method
	 */
	@Test
	public void testRC() throws IOException, ServletException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
        List<String> params = new ArrayList<String>();
        params.add("1");
        params.add("2");

        JVCGenerator generator = new JVCGenerator();
        generator.generate("src", "jvc", "jvc", params);
        generator.generate("src", "jvc", "jvc.m", new String[]{ "request.paramOne"}, BASEPARAMS);
        generator.generate("jvc", "jvc.m", "jvc", "", "", null);
        File jsonFile = new File("src/main/java/com/pmdesigns/jvc/test_"+DateUtil.md5Hex("20150310521_001.json"));
        String json = new String(Files.readAllBytes(jsonFile.toPath()));

        // Check javadoc

	}

}