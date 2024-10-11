// Login_2Test.java
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
* It contains one unit test case for the {@link Login#getSecurityLogFilePath()} method.
*/
class Login_2Test {
private static final Logger LOG =
				Logger.getLogger(Login_2Test.class);
	
	/** Test case for {@link Login#getSecurityLogFilePath()}. */
	@Test
    public void getSecurityLogFilePath() {
           
		File logFile  = new File(securityLogFilePath);
		logFile.delete();

        FileAppender simpleLogFileAppender = new FileAppender();
        simpleLogFileAppender.setName("System Logs");
        simpleLogFileAppender.setEncoding("UTF-8");
        simpleLogFileAppender.setFormatter(new SimpleLayout());

		LOG.log(Level.INFO, "Created test log file at: "+logFile.toString());
		LOG.log(Level.INFO, "This is the INFO level.");
              for (int i = 0; i < 5; i++) {
                String line[] = {"line_"+i+"  ", "line: line_"+i};
                  simpleLogFileAppender.append(SimpleDateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL) +" "+line[0]+" : "+line[1]);                
             }                      
           
         java.util.Date logDate = new java.util.Date();        
         logDate.setTime(logDate.getTime() - 1);        
         Set<String> securityLogFiles = new HashSet<>();
         securityLogFiles.add(logFile.toString());

        String lineSeparator = System.getProperty("line.separator");
        long time = timeMillis();
        for (Iterator<String> logLine = securityLogFiles.iterator(); logLine.hasNext();){
           String logLineToConvert = (logLine.next() == null? "" : logLine.next());
                if (logLineToConvert.endsWith(lineSeparator) ){
                    // the log line should be formatted according to the date and time the log lines are in.
                    if (logLineToConvert.contains(lineSeparator + "\n")) {
                        // remove last lineSeparator and it at the end of the line
                        String logLineToSplit[] = logLineToConvert.split(lineSeparator);
                        String timestamp = logLineToSplit[0];
                        String text = logLineToSplit[1];
                        
                        // remove the last text with an underscore
                        if (logLineToSplit.length > 1) {
                            text = text.substring(0, text.length()-1);
                        }
                        
                        RequestCtx context = new RequestCtx();
                        context.get("xacmlID");
      
                        return logLineToSplit[0] + "("+text+")" + requestIDtoPid(context) + ": " + context.getRequestId();                        
                    }
                }
        }
        return "";
      }
      
	/** Return the id of request being used.
	 * @param context the request context
	 * @return the id for the request being used
	 */
      protected String requestIDtoPid(RequestCtx context) {
              //the id is "urn.browsersoft.xacml.aacs.com.browsersoft.aacs.server.authz.RequestContext"
              Properties props = context.getProperties();               
              return context.getId(); 
      }
      
	private long       timeMillis(int times) {
		Calendar cal  = Calendar.getInstance();
		cal.setTimeInMillis(time);
      
		for (int i =0; i < times; i++) {
			Date date = cal.getTime();
			date.setTime((int)cal.getTime().getTime() - (cal.getTime().getTime() / 1000));
		}
         
		cal.setTime(new Date());

		return cal.getTimeInMillis();    
	}
	/**
	* Test for {@link Login#createSecurityLog(XACml)}.
	* It calls {@link Login#createSecurityLog(XACml)} method 
	* for a request which is added by a {@link RequestBuilder} object. 
	* @throws LoginException when the error occurs 
	*/
   @Test
   public void testSecurityLog_1() throws LoginException {   
       // we add a new request to the securityLogs
       XACml request = new RequestBuilder()
          .setXACML_VERSION(XACML_VERSION)
          .setIndenter(new Indenter())
          .setCipherAlgorithm("AES128")
          .setSignatureAlgorithm("SHA-1")
          .createNew(request.getId(), request.getVersionEnum());

           // we add a new request to the securityLogs
           XACml request2 = new RequestBuilder()
          .setXACML_VERSION(XACML_VERSION)
          .setIndenter(new Indenter())
          .setCipherAlgorithm("AES128")
          .setSignatureAlgorithm("SHA-1")
          .createNew(request2.getId(), request2.getVersionEnum());

           // we add a new request to the securityLogs
           XACml request3 = new RequestBuilder()
          .setXACML_VERSION(XACML_VERSION)
          .setIndenter(new Indenter())
          .setCipherAlgorithm("AES128")
          .setSignatureAlgorithm("SHA-1")
          .createNew(request3.getId(), request3.getVersionEnum());

           XACml request4 = new RequestBuilder()
          .setXACML_VERSION(XACML_VERSION)
          .setIndenter(new Indenter())
          .setCipherAlgorithm("AES128")
          .setSignatureAlgorithm("SHA-1")
          .createNew(request4.getId(), request4.getVersionEnum());

        // we add a new request to the securityLogs
        XACml request5 = new RequestBuilder()
       .setXACML_VERSION(X