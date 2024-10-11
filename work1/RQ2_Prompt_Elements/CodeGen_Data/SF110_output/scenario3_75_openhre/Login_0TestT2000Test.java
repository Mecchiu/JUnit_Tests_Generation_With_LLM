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

    private static Logger logger = Logger.getLogger(Login_0Test.class);

    /**
     *
     * The Properties file for test {@link #getProps(String)}
     *
     * @return the Properties file
     */
    static Properties getConfig();

    /**
     * Get the Properties file.
     *
     * @return the Properties file
     */
    static Properties getProps(String configFile);
	
/*
     * Unit test for Properties getConfig
     */
    @Test
    public void testGetConfig(){
        //Logger.getGlobal().setLevel(Level.OFF);
        logger.info("getConfiguration()");
        logger.warn("Test the Properties object as part of the test Configuration");
        Properties p = new Properties();
        p.setProperty("Test Configuration","Test Value");
        File configFile;
        String temp;
        File tConf = new File(getConfig().getProperty("User",null), "user.conf");
        File tConfAbs = new File(tConf.toURI().toURL().toString());
        configFile = tConfAbs.getParentFile();
        if(configFile!= null){
            logger.debug(temp = configFile);
        }else{
            logger.debug("temp file:" + configFile);
            configFile=new File(getConfig().getProperty("User",null).toString()); 
        }
        p.load(configFile);
        String key;
        String value;
        logger.debug(p.getProperty("Test Configuration"));       
        logger.debug(configFile);
        Iterator<String> i=p.keySet().iterator();
        //String s;
        while(i.hasNext()){
            key=i.next();
            logger.warn("key"+key);
            value=p.getProperty(key);
            System.out.println(" value"+value);
            //if(i.hasNext()){
                System.out.println(" key"+key+" Value"+(value.length()>10?value:""));
            //}
            if((key.equalsIgnoreCase("testConfiguration")))
                continue;
            if(key.equalsIgnoreCase("testConfigFile"))
            {
                continue;
            }
            if(key.equalsIgnoreCase("Test Configuration")){
                continue;
            }
            if(p.getProperty(key).compareTo("")==0)
                System.out.println("key"+key+" value"+p.getProperty(key)+"value "+value);       
            if(Config.ALL_CHECKS)
            {
                if((value.length()>10)
                        &&!p.getProperty(key.toLowerCase()).compareTo(value.toLowerCase())){
                    try {
                        logger.debug("Configuration File:" + value);
                    	logger.debug("Configuration File:" + p.getProperty(key));
                        logger.warn("The Configuration does not match");
                    } catch (ParseException e) {
                        logger.warn(e);
                    }
                }
            }
            if((value.length()>10)
                    &&p.getProperty(key).compareTo(value.toLowerCase())){
                try {
                    logger.debug("Configuration File:" + value);
                	logger.debug("Configuration File:" + p.getProperty(key));
                    logger.warn("The Configuration does not match");
                } catch (ParseException e) {
                    logger.warn(e);
                }
            }
            if(p.getProperty(key.toLowerCase()).compareTo(value.toLowerCase())){
                continue;
            }

            logger.warn("the value");
            logger.warn(p.getProperty(key.toLowerCase()));
        }
        logger.info("Properties getConfig, theConfigurationFile:"+getConfig().getProperty("User", null) + " user.conf");
    }
	
    /**
     * Check the Configuration File
     */
    @Test
    public void testCheck(){
        logger.info("Test Configuration File:");
        File propertiesFile;
        logger.debug("Configuration File:"+getConfig().getProperty("User", null));
        propertiesFile = new File(getConfig().getProperty("User", null));
        File appFile = new File(propertiesFile.getParentFile(), propertiesFile.getName().replace(".conf", ""));
        String line = "  ";
        FileAppender fileAppender = null;
        HashSet h = null;
        fileAppender =  new FileAppender();
        fileAppender.setFile(propertiesFile);
        fileAppender.setLayout(new SimpleLayout());

        Set hSet = null;
        String csvLine = null;
        hSet = new HashSet();
        logger.warn("Check Application Configuration File:");
        hSet =  getProps(propertiesFile.getParentFile().getAbsolutePath()).keySet();
        String current = Config.ALL_CHECKS;
        if(Config.ALL_CHECKS.equalsIgnoreCase("ALL_CHECKS"))
            current = Config.ALL_CHECKS;
        fileAppender.write(current+"\n");
        Iterator i = hSet.iterator();
        while(i.hasNext()){
            
            String s= (String) i.next();
            String s2=propertiesFile;
          
            // if the file changed
            if( (s.toLowerCase().contains(current.toLowerCase()) && configFile==null)){
                try {
                    logger.info("The Configuration File"+propertiesFile.getAbsolutePath());
                	logger.info("The Configuration File"+propertiesFile.getParentFile().getAbsolutePath());
                    //logger.info("The Configuration File"+confFile.getAbsolutePath());
                    