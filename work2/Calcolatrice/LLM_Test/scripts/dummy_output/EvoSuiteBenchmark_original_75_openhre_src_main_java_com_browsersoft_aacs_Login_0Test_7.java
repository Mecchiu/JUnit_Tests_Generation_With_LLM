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
		
    private static Logger logger = Logger.getLogger("com.browsersoft.aacs.testcases");
	private static File   root;
    private static File   outdir;
    private static String inFileName;
    
	/**
	* Create a new instance of the class
	*
	* @param the_dir the name of the directory that the test will write the log files to
	*/
    private Login_0Test(String the_dir) throws Exception {
		
		// Check we can access to the resources
		File dir = new File(the_dir);
        assertTrue("Resource Not Found", dir.exists());
        assertTrue("Not a directory", dir.isDirectory());
        root = dir;
		outdir = new File(root, "outdir");
        assertNotNull("Can't find out directory 'outdir'", outdir);
        File outFile = new File(outdir, "log");
        assertTrue("Log File Not created", outFile.exists());
        String[] testFile = { "/", "/testFile.txt", "/testFile.txt" };
		for (int count = 0; count < 2; count++) {
			inFileName = testFile[count].toString();
			File inFile = new File(root, inFileName);
			assertNotNull("Can not find out file in dir " + root.getAbsolutePath() + "/outdir", inFile);
		}
		
		logger.debug("Test File Created");
	}
	
	/**
	* Test the functionality of the {@link Login#getProps(String)} method
	*
	* @throws LoginException
	*/
	@Test
    public void testGet_1() throws LoginException, ParseException{
        
        // Read the properties from the Log File
		Properties props  = getProps(inFileName);
		System.out.println("----------------------------");
		logger.debug("Get Props");
		System.out.println("Props");
		logger.debug("Parsing");
		logger.debug("String Parsing");
		logger.debug("Checking for Properties");
		assertTrue("Parsing Property is Null", (props!=null));
        assertTrue("Getting property", (props.containsKey("auth.login")));
		
		String login = props.getProperty("auth.login");
		logger.debug("Login: " + login);
		
        Set<String> set = new HashSet<String>();
   	
		set.clear();
		StringTokenizer st = new StringTokenizer(login, "\\");
		while (st.hasMoreTokens()) {
		    set.add(st.nextToken());
		}
        boolean exists = false;
        for(Iterator<String> it = set.iterator(); it.hasNext();){
            
           System.out.println("Iterator is at  '"+it.next()+"'");
           if(st.nextToken().equals(it.next()))
            exists = true;
       }
        if(!exists)
            logger.debug("Didnt find the required Login parameter (login)");

	    // Add a few lines of test code to the given command
        String cmd = (String)props.get("cmd.login");
        logger.debug("Login cmd");
        if(cmd.toLowerCase().contains("login")){
            
          // Use "new String" is required because the String constructor is a "new" object that is not called
            logger.debug("Using String to get a new instance");
            
            // Create the object, the command should be 'com.browsersoft.aacs.testcases.Login_0Test.login'
           
        } else {
            logger.debug("Not using String");
        }
		logger.debug("Login command - " +cmd);
	}
	
}

/**
 *
*/
class FileAppender_0Test extends FileAppender 
{

    private Logger getLogger() {
        return (Logger) Logger.getRootLogger();
    }
        
    public FileAppender_0Test(Logger logger){
        super();
        setWriter(new File(root, "logFile"));
        setLayout(new SimpleLayout());
        this.setLayout(new SimpleLayout());
        setOutputInstant();
        setAppend(true);
        setThreshold(Level.WARN);
        setFileNameAppend(true);
    }
        
    @Override
    public void close() throws IOException {
        boolean flag =false;
        synchronized(outFile.getParent()){
            flag = outFile.booleanValue();
            if((flag || outFile.exists())){
                File outFile = new File(outdir, outFileName);
                
                //Logger.log(Level.WARN, outFile.getName() + " has been closed.");
            }
            outFile.delete();           
        }
        if(flag){
            outFile.deleteOnExit();
        }
        super.close();
    }
}