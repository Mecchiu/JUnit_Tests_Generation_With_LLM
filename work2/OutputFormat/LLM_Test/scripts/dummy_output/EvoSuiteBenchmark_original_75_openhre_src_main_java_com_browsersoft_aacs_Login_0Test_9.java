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
		* get the Properties from the ConfigFile
		*
		* @param theConfigFile the Properties file
		*/
			public static Properties getProps(File theConfigFile);
			/**
		* test case a user with no permissions.
		*/
			public static void NoPermissionsTest(String theXACMLFile) {
				String theReport = this.getTestData(theXACMLFile);
				Properties theSavedXACMTSet = new Properties();
				theSavedXACMTSet.put(
					Indenter.DEFAULT_START_INDENT,
					null
				);
				theReport = Indenter.indentReport(theReport);

				Login authLogin = new Login(
					theReport,
					theXACMTSet
				);

				Set<RequestCtx> aRequestSet = new HashSet<>(2);
				aRequestSet.add(new RequestCtx(
					"",
					""
					));
				assertTrue(
					"Login should validate all PDPs",
                    authLogin.validate(aRequestSet)
				);
			}
			/**
		* test case a user with just one PDP - no permissions.
		*/
			public static void NoPermissionsOnePDPTest() {
				String theXACMLFile = "/AACS/TESTDATA/PDPSet1.xml";
				Calendar theCalendar = Calendar.getInstance();
				theCalendar.setTime(new Date(10000000));
				File thePDPFile = new File(
					"/AACS/TESTDATA/pdpset1.xml"
				);
				File theReport = Indenter.indentReport(
					this.getTestData(thePDPFile)
				);
				Properties theSavedXACMTSet = getProps(
					theReport
				);
				String theStartReport = Indenter.getStartReport(
					theReport
				);

				Login authLogin = new Login(
					theStartReport,
					theSavedXACMTSet
				);

				Set<RequestCtx> aRequestSet = new HashSet<>(5);
				aRequestSet.add(new RequestCtx(
					theXACMLFile,
					""
					));
				assertTrue(
					"Login should validate all PDPs",
					authLogin.validate(aRequestSet)
				);
			}
			/**
		* test case a user with no PDPs.
		*/
			public static void PDPWithoutPDPTest() {
				String theXACMLFile = "/AACS/TESTDATA/PDPSet2.xml";
				File thePDPFile = new File(
					"/AACS/TESTDATA/pdpset2.xml"
				);
				String theReport = Indenter.indentReport(
					this.getTestData(thePDPFile)
				);
				Properties theSavedXACMTSet = getProps(
					theReport
				);
				String theStartReport = Indenter.getStartReport(
					theReport
				);
				Login authLogin = new Login(
					theStartReport,
					theSavedXACMTSet
				);
				Set<RequestCtx> aRequestSet = new HashSet<>(5);
				aRequestSet.add(new RequestCtx(
					theXACMLFile,
					""
					));
				assertFalse(
					"Login should not include at least one PDP",
					authLogin.validate(aRequestSet)
				);
			}
			/**
		* test case a user with only one PDP - no permissions.
		*/
			public static void OnePDPTest() {
				String theXACMLFile = "/AACS/TESTDATA/PDPSet3.xml";
				Calendar theCalendar = Calendar.getInstance();
				theCalendar.setTime(new Date(100000000));
				File thePDPFile = new File(
					"/AACS/TESTDATA/pdpset3.xml"
				);
				File theReport = Indenter.indentReport(
					this.getTestData(thePDPFile)
				);
				Properties theSavedXACMTSet = getProps(
					theReport
				);

				String theStartReport = Indenter.getStartReport(
					theReport
				);

				Login authLogin = new Login(
					theStartReport,
					theSavedXACMTSet
				);
				Set<RequestCtx> aRequestSet = new HashSet<>(5);
				aRequestSet.add(new RequestCtx(
					theXACMLFile,
					""
					));
				assertFalse(
					"Login should not include at least one PDP",
					authLogin.validate(aRequestSet)
				);
			}

			/**
		* test case a user with only one PDP.
		*/
			public static void OnePDPTestWithPermissions() {
				String theXACMLFile = "/AACS/TESTDATA/PDPSet4.xml";
				Calendar theCalendar = Calendar.getInstance();
				theCalendar.setTime(new Date(100000000));
				File aPDPFile = new File(
					"/AACS/TESTDATA/pdpset4.xml"
				);
				File theReport = Indenter.indentReport(
					this.getTestData(aPDPFile)
				);
				Properties theSavedXACMTSet = getProps(
					theReport
				);

				String theStartReport = Indenter.getStartReport(
					theReport
				);

				Properties theSavedXACMTSet2 = getProps(
					theReport
				);
				Properties theSavedXACMTSet3 = getProps(
					theReport
				);

				Set<RequestCtx> aRequestSet = new HashSet<>(4);
}
}