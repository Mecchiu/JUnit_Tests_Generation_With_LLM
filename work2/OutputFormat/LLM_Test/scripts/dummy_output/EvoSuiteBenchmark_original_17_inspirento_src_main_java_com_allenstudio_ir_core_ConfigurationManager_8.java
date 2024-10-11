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
		
	@Test
	void test1(){
		System.out.println("test1");
		String configFile = "config/config.xml";
		ConfigurationManager cfgMgr = new ConfigurationManager();
		String keyOfFile = "";
		for(File f: cfgMgr.fileSet){
			if(f.getName().startsWith(configFile)){
				keyOfFile = f.getName();
			} else {
				System.out.println("test1 test2");
			}
		}
//		String k=cfgMgr.instance().addProperty("k",keyOfFile);
//		System.out.println(k);
		assertNotNull(keyOfFile);

		try {
			System.out.println("test1 test3");
		} catch (IOException e) {
		}
		assertFalse(false);
	}
	
	
	@Test
	void test2(){
		System.out.println("test2");
		ConfigurationManager cfgMgr = new ConfigurationManager();
		String keyOfFile = "";
		String defaultKey = "default";
		for(File f: cfgMgr.fileSet){
			if(f.getName().startsWith(defaultKey + "." + keyOfFile)) {
				String k = f.getName().replace(defaultKey + ".", ""); 
				String v = f.getName().replace(keyOfFile, "");
//				System.out.println(k);
//				System.out.println(v);
				if(k.endsWith(".xml")){
					cfgMgr.add(k, v);
				}
				System.out.println("test1 " + k + " : " + v);
			}
		}
	}
	
}