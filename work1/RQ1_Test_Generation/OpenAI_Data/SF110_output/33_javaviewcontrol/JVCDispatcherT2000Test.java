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
* It contains ten unit test cases for the {@link JVCDispatcher#getRC()} method.
*/
class JVCDispatcherTest {

	/**
	* Test case for the {@link JVCDispatcher#getRC()} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testGetRCNull() {
		JVCDispatcher.getRC();
	}
	
	/**
	* Test case for the {@link JVCDispatcher#getRC()} method.
	* It tests the method with a non-null value.
	*/
	@Test
	public void testGetRCNonNull() {
		JVCDispatcher.getRC();
	}
	
	/**
	* Test case for the {@link JVCDispatcher#getRC()} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testGetRCNull2() {
		JVCDispatcher.getRC();
	}
	
	/**
	* Test case for the {@link JVCDispatcher#getRC()} method.
	* It tests the method with a non-null value.
	*/
	@Test
	public void testGetRCNonNull2() {
		JVCDispatcher.getRC();
	}
	
	/**
	* Test case for the {@link JVCDispatcher#getRC()} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testGetRCNull3() {
		JVCDispatcher.getRC();
	}
	
	/**
	* Test case for the {@link JVCDispatcher#getRC()} method.
	* It tests the method with a non-null value.
	*/
	@Test
	public void testGetRCNonNull3() {
		JVCDispatcher.getRC();
	}
	
	/**
	* Test case for the {@link JVCDispatcher#getRC()} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testGetRCNull4() {
		JVCDispatcher.getRC();
	}
	
	/**
	* Test case for the {@link JVCDispatcher#getRC()} method.
	* It tests the method with a non-null value.
	*/
	@Test
	public void testGetRCNonNull4() {
		JVCDispatcher.getRC();
	}
	
	/**
	* Test case for the {@link JVCDispatcher#getRC()} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testGetRCNull5() {
		JVCDispatcher.getRC();
	}
	
	/**
	* Test case for the {@link JVCDispatcher#getRC()} method.
	* It tests the method with a non-null value.
	*/
	@Test
	public void testGetRCNonNull5() {
		JVCDispatcher.getRC();
	}
	
}

// JVCGenerator.java
package com.pmdesigns.jvc.tools;

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

/**
 * Base class for page generators.
 *
 * @author mike dooley
 */
public class JVCGenerator {

    public static final String GENERATOR_METHOD_NAME = "generate";

    /**
     * Return the fully qualified name of the controller class for the
     * indicated controller name.
     */
    public static String getControllerClassName(String controller) {
        return appendPkg(JVCDispatcher.pkgPrefix, "controllers") + "." + controller + "Controller";
    }

    /**
     * Return the fully qualified name of the page generator class for the
     * indicated controller and action.
     */
    public static String getGeneratorClassName(String controller, String action) {
        String pkg = appendPkg(JVCDispatcher.pkgPrefix, "generators");
        if (controller.length() > 0) {
            pkg += "." + controller.replace('/', '.');
        }
        return pkg + "." + capitalize(action) + "Generator";
    }

    /**
     * Return the fully qualified name of the page generator class for the
     * indicated controller and action.
     */
    public static String getGeneratorMethodName(String action) {
        return GENERATOR_METHOD_NAME;
    }

    /**
     * Capitalize the first letter of the indicated string.
     */
    public static String capitalize(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

    /**
     * Append a package string to a prefix if the prefix isn't empty
     */
    private static String appendPkg(String prefix, String pkg) {
        return (prefix == null || prefix.length() == 0) ? pkg : prefix + "." + pkg;
    }
}

// JVCGeneratorTest.java
package com.pmdesigns.jvc.tools;

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
* Test class of {@link JVCGenerator}.
* It contains ten unit test cases for the {@link JVCGenerator#getControllerClassName(String)} method.
*/
class JVCGeneratorTest {
		
	/**
	* Test case for the {@link JVCGenerator#getControllerClassName(String)} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testGetControllerClassNameNull() {
		JVCGenerator.getControllerClassName(null);
	}
	
	/**
	* Test case for the {@link JVCGenerator#getControllerClassName(String)} method.
	* It tests the method with a non-null value.
	*/
	@Test
	public void testGetControllerClassNameNonNull() {
		JVCGenerator.getControllerClassName("");
	}
	
	/**
	* Test case for the {@link JVCGenerator#getControllerClassName(String)} method.
	* It tests the method with a null value.
	*/
	@Test
	public void testGetControllerClassNameNull2() {
		JVCGenerator.getControllerClassName(null);
	}
	
	/**
	* Test case for the {@link JVCGenerator#getControllerClassName(String)} method.
	* It tests the method with a non-null value.
	*/
	@Test
	public void testGetControllerClassNameNonNull2() {
		JVCGenerator.getControllerClassName("");
	}
	
	/**
	* Test case for the {@link JVCGenerator#getControllerClassName(String)} method.
	* It tests the method with a null value.
	