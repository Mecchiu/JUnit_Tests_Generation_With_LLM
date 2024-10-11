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
		private void setProps() {
	        Properties props = new Properties();
	        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
	        cal = cal.setTime(new Date());
	        String str = "login_conf_0_test/login_conf/login_conf_0_test.conf";
	        File fl = new File(str);
	        FileAppender f = null;
	        try {
	        	f = FileAppender.createFileAppender(str, fl);
	        	f.open(); // Open it for appending!
	        	f.setLayout(new SimpleLayout());
	        } catch (ParseException pe) {
	        	assertTrue(false);
	        }
	        try {
	        	if (!fl.exists()) {
	        		fl.createNewFile();
	        		fail("Exception not thrown.");
	        	}
	        } catch (Exception e) {
	        	fail(e.toString());
	        }
	        props.load(fl);
        }
        /**
         * This method runs for each of following cases.
         * <ul>
         * <li>Case1</li>
         * <li>Case2</li>
         * <li>Case3</li>
         * <ul>
         * @throws Exception
         */
        @Test
        public void test() throws Exception {
                setProps();
                for (String c : new String[]{ "1", "2", "3" }) {
                        if (c.matches("(.*)")) {
                                System.out.println("Test " + c);
                        }
                }
                if (StringUtils.isEmpty(c)) {
						fail("Not found test.");
                }
        }
}