// ConfigurationManagerTest.java
package com.allenstudio.ir.core;

import java.util.*;
import java.io.*;
import com.allenstudio.ir.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConfigurationManager}.
* It contains one unit test case for the {@link ConfigurationManager#getProperty(String)} method.
*/
class ConfigurationManagerTest {
		
	private ConfigurationManager configManager;
	
	/**
	 * Creates a new configuration manager.  A configuration manager 
	 * is loaded into memory with the default settings
	 * specified in <code>settings.properties</code> to test the
	 * configuration file, the loaded settings in
	 * <code>config.properties</code>.
	 * 
	 * <p>
	 * The config file is stored and used to find and load settings for
	 * Inspireento. However, since this class has multiple versions, we
	 * should only add to the one if it has already been loaded into
	 * the memory: we don't want to add the two if the loaded settings
	 * change.
	 * </p>
	 * @throws IOException if something is wrong in the config file
	 *
	 */
	@Before
	public void beforeTest() throws IOException {
		InputStream in = null;
		if (configManager!= null) {
			in = new FileInputStream(FILE);
		} 
		if (in == null) { 
			in = new FileInputStream("config.properties");
		}
		config = new Properties();
		config.load(in);			
	}
	
	/**
	 * Returns the currently set properties.
	 * @return properties
	 */
	private Properties getProperties(){
		return config;
	}
	
	/**
	 * Returns the currently loaded settings. The returned 
	 * settings can be used to load the other settings in the future.
	 * @return properties
	 */
	private Properties getConfig(){
		return configManager.getProperties();
	}
		
	/**
	 * Returns an unconfigured instance of <code>ConfigurationManager</code> with no
	 * currently loaded settings and an empty config file.
	 * @return an unconfigured instance of <code>ConfigurationManager</code>
	 */
	ConfigurationManager getNonConfigInstance(){
		return new ConfigurationManager("no properties");
	}
	
	/**
	 * Loads the specified property from the configuration file.
	 * If already loaded a new instance will be created 
	 * and returned.  
	 * @param key the key of the property
	 * @return the value of the property
	 */
	public static String getProperty(String key){
		Properties props = ConfigurationManager.getConfig();
		String value = null;
		Iterator it = props.propertyNames();
		if (it!= null) { 
			while (it.hasNext()) { 
				String name = (String)it.next();
				if (name.equals(key)) {
					value = props.getProperty(name);	
				}
			}
		}
		return value;
	}
	
	/**
	 * Loads the specified property from the configuration file.
	 * If already loaded a new instance will be created 
	 * and returned.  
	 * @param key the key of the property
	 * @return a deep clone of the properties
	 */
	public static Properties getConfigInstance(String key){
		Properties props = ConfigurationManager.getConfigInstance();
		@SuppressWarnings("unchecked")
		Iterator it = props.propertyNames();
		if (it!= null) { 
			while (it.hasNext()) { 
				String name = (String)it.next();
				if (name.equals(key)) {
					props.remove(name);
				}
			}
		}
		return props;
	}
	
	/**
	 * @return an unconfigured instance of ConfigurationManager with no
	 * loaded settings and an empty config file.
	 * @throws IOException if something has gone wrong in the config file
	 *
	 */	
	@Test
	public void testGetNonConfigInstance(){
		ConfigurationManager manager = ConfigurationManager.getNonConfigInstance();
		assertNull(manager.getProperty("a.b"));
		assertNull(manager.getProperty("b.a"));
	}
	
	/**
	 * Sets the default value of specified properties. 
	 * The <code>properties</code> class has a no-arg method, so this
	 * one can instead use the same setter for all properties in the
	 * file and leave it to do so.
	 * @param key
	 * @param value
	 */
	public void setProperty(String key, String value) throws IOException{
		Properties props = ConfigurationManager.getNonConfigInstance();
		props.setProperty(key, value); 
	}
	
}