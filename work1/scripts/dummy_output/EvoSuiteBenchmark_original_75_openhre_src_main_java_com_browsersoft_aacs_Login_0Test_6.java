// Login_0Test.java
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
* It contains one unit test case for the {@link Login#getProps(String)} method.
*/
class Login_0Test {
		
	/**
	* Test for {@link Login#getProps(String)} without arguments. 
     */
    @Test
    void test00101() {
        String a0 = getProps(getFile_0("/com.browsersoft.aacs.aacs.Login_0Test_test00101")).getProperty("a0");
		assertEquals("a0", a0);
	}        
    
    /**
* Test for {@link Login#getProps(String)} with args. 
*/
    @Test
    void test10001() {
        String a0 = getProps(getFile_0("/com.browsersoft.aacs.aacs.Login_0Test_test10001")).getProperty("a0");
		assertEquals("a0", a0);
	}
    
    /**
* Test for {@link Login#getProps(String)}. 
*/
    @Test
    void test10002() {
        String a0 = getProps(getFile_0("/com.browsersoft.aacs.aacs.Login_0Test_test10002")).getProperty("a0");
        assertEquals("a0", a0);
    }
    
    /**
* Test for {@link Login#getProps(File)}. 
*/
    @Test
    void test10010() {
        /**
* Test for
                1) Get the Properties
                2) Load File from Config File
        */
        Set<Object> a0 = new HashSet<>();
        Properties a1 = getProps(getFile_0("/com.browsersoft.aacs.aacs.Login_0Test_test10010"));
        Iterator i = a1.keySet().iterator();
        while( i.hasNext()  ) {
            Object o = i.next();
            System.out.println("key: " + o);
            if( o=="a0" ){
                a0.add(a1.get(o));
            }
        }
	assertEquals(1,a0.size());
        Logger a2 = Logger.getLogger(Logger.SYSTEM);
        FileAppender a3 = (FileAppender) a2.getRollingFileAppender(FileAppender.FILE, 10);

        log4j.getLogger().setLevel(Level.ERROR);
        RequestBuilder b1 = new RequestBuilder();
        RequestCtx r1 = b1.createRequestCtx();
        SimpleDateFormat a4 = new SimpleDateFormat("yyyy-MM-dd HHmmss");
        r1.getRequest().set("a0");
        RequestCtx r2 = b1.createRequestCtx();
        SimpleDateFormat a5 = new SimpleDateFormat("yyyy-MM-dd HHmmss");
        r2.getRequest().set("a5");
        
        Calendar a6 = Calendar.getInstance();
        a6.set(Date.class, Calendar.class, Calendar.getInstance());
        Date a7 = a6.getTime();
        Set<Object> a8 = a10= new HashSet<>();
        Date a3a = a7.before(a2.createRequestCtx().getRequestTimestamp())?"before":"after";
        Set<Object> a4a = new HashSet<>();
        Object ab =  a3a+a5.format(a4a.get(a4.parseObject("2001-09-11 12:34:56")));
        a4a = new HashSet();
        a4a.add(new Indenter(10));
        a4a.add(new Indenter(10));
        r2.getRequest().set("a12");
        String a5w = a5.format(r2.getRequest().get("a5w"));
        r2.getRequest().set("a7");
        String a14 = a6.getTime().toString();
    
        a3a = a14.substring(0,19).equals("10:00")?"-":"+";
        a6.set(Date.class, Calendar.class, Calendar.getInstance());
        
        r1.getRequest().setAll(a3a + a5.format(a4a.get(a4.parseObject("2008-01-01") )) );
        r1.addToRequestCtx( new RequestCtxSetParam(new Object[]{"a8", new HashSet<Object>(a1.getSet(a6.getTime(), 1)) }));
        r1.addToRequestCtx( new RequestCtxSetParam(new Object[]{"a8", a6.getTime()}));
        r1.addToRequestCtx( new RequestCtxSetParam(new Object[]{"a8", a4.parseObject("2008-01-01") }));
        
        a6 = calendar(a6);
        a6.setTime(Date.class, Calendar.getInstance(), Calendar.getInstance());
        a8 = new HashSet<Object>();
        Date now = new Date();
        
        
        log4j.getLogger().setLevel(Level.WARN);
        Iterator i = a1.keySet().iterator();
        while( i.hasNext()  ) {
            Object o = i.next();
            log4j.getLogger().log(Level.WARN, o +"="+a1.getProperty(o));
	}
}
}