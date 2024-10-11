// Login_1Test.java
package com.browsersoft.aacs;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TimeZone;
import javax.security.auth.login.LoginException;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import com.browsersoft.aacs.xacml.PDPadapter;
import com.browsersoft.aacs.xacml.RequestBuilder;
import com.sun.xacml.Indenter;
import com.sun.xacml.ctx.RequestCtx;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Login}.
* It contains one unit test case for the {@link Login#getProps()} method.
*/
class Login_1Test {
		
    /**
     * Test method
     * getProps()
     */
    @Test
    public void testGetProps() {
    	
    	Logger logger = (Logger) Log4JUtility.getLogger(Login.class);
    	logger.debug("Test Login_1Test.testGetProps");
    	
    	String x509CertFile = "/etc/cert.pem";
    	
    	String x509Cert = "cacert.pem";
    	File x509RootDirectory = new File("D:\\Logs");
    	File x509CertPWD = new File(x509RootDirectory, x509Cert);
    	File x509RootFSTool = new File(x509RootDirectory, ".fstool");
    	String x509CertPwdFilename = x509CertPWD.getAbsolutePath();
    	
    	StringBuilder sb = new StringBuilder();
    	sb.append("$X509_IN");
    	sb.append(x509CertFile).append("\n")
    		.append("$X509_OUT");
    		
    	// get x509 root
        String x509CertsAsFilepath = SecurityUtil.getX509CertsAsFilepath(x509RootDirectory);
    	File x509RootFile = new File(x509RootDirectory, x509RootFileName);
    	File x509FileWithFilepath = new File(x509RootFile, x509CertsAsFilepath);

    	FileAppender fileAppender = new FileAppender();

        fileAppender.setEncoding("utf-8");
        logger.debug(" x509 cert file: " +
    		x509CertFile + " x509 root file: " +
    		x509RootFile);
    	
        logger.trace("x509 certificate file in the file: " +
    		x509CertFile +  " with the file path: " +
    		new File(x509RootFileFSTool, x509CertsAsFilepath).toString() + " = " +
    		x509FileWithFilepath.toString());
        
        String x509Cert = SecurityUtil.findX509Cert(x509RootFileFSTool,
    			x509RootFileName, x509RootFile);
    	x509FileWithFilepath.delete();
    	x509FileWithFilepath = x509RootFile;

    	Properties p1 = new Properties();
    	p1.putAll(Login.getProps());
    	p1.put(x509Cert, x509CertFile).put(x509RootFileFSTool, x509RootFSTool);

    	Properties p2 = new Properties();
    	p2.putAll(x509RootFile.getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().getProperties());

    	boolean isValid =
    		X509CertificateFactory.getInstance("X509v3").validateCertificates(
    				p1.keySet().iterator().next(), p2.keySet().iterator().next());

    	assertTrue("validation", isValid);
    	//get the cert
    	System.out.println("Get cert: "  + p1.get(x509FileWithFilepath.getAbsolutePath()));

    	// get the file path
    	System.out.println("Get the file path: " +
    	                         new File(x509FileWithFilepath.toString()).getAbsolutePath());

    	// get the path
    	System.out.println("get the path: " + 
    		(new File(x509RootFileFSTool, x509FileWithFilepath.getAbsolutePath())).getAbsolutePath());
    	
    	// save the p1
    	System.out.println("save the p1");
		
    	FileAppender.deleteAppenderFiles(fileAppender);
    	
    	logger.debug("save the p2");
    	
    	p2 = SecurityUtil.getX509Certs(x509RootFile);
    	p1 = p2.get(x509RootFileFSTool);

    	assertNotNull("p1 not null", p1);
    	// save the p1
    	System.out.println("save the p1 (x509Certificate: " + p1.get(x509RootFileFSTool) + "]");
    	
    	// get the cert
    	System.out.println("Get the cert: "  + p2.get("x509_in"));
    	
    	// get the file path
    	System.out.println("Get the file path: " +
    		(new File(x509RootFileFSTool, p2.get("x509_out"))).getAbsolutePath());
    	
    	// save the p1

    	System.out.println("Save the p2");

        FileAppender.deleteAppenderFiles(fileAppender);

    	p1 = p2.toArray(new String[0]);
    	
    	
    	System.out.println("p1: " + p1);
    	
    	p1 = new Properties();
    	System.out.println(" p1: " + p1);

    	p1.setProperty("cacert", SecurityUtil.findX509Cert(x509RootFSTool, p1.getProperty("cacert"), p1.getProperty("x509_in"),
        		SecurityUtil.findX509Cert(x509RootFSTool, SecurityUtil.findX509Cert(x509RootFile, p1.getProperty("x509_out"))), p1.getProperty("cacert")).
    	getCert());

    	p1.setProperty("x509rootfstool", x509RootFSTool);
    	System.out.println(" p1: " + p1);

    	
    	String x509CertName = SecurityUtil.findX509Cert(x509RootFile);
}
}