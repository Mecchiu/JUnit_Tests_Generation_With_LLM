// ClassUtilTest.java
package org.quickserver.util;

import java.util.*;
import java.io.*;
import java.net.*;
import org.quickserver.util.io.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassUtil}.
* It contains one unit test case for the {@link ClassUtil#getClassLoaderFromJars(String)} method.
*/
class ClassUtilTest {
		
	@Test
	public void testConstructor(){
		
		String[] jars=ClassUtil.getClassLoaderFromJars("jar");
		List<String> loadList = new ArrayList<>();
		for(String jar : jars){
			ClassLoader loader = getClassLoaderFromJars(jar);
			loadList.add(loader.getClass().getName());
		}
		assertTrue(loadList.size() > 0);
	}
	
	@Test
    public void testGetJarByClass(String className)
	        throws Exception {
		
		String[] jars=ClassUtil.getClassLoaderFromJars("jar");
		for(String jar : jars){
			ClassLoader loader =  getClassLoaderFromJars(jar);
			loader.loadClass(className).newInstance();
		}
	}
	
	@SuppressWarnings("null")
	@Test
	public void testGetJarByClassNullPointer(){
	String[] jars=ClassUtil.getClassLoaderFromJars("jar");
	for(String jar : jars){
			ClassLoader loader =  getClassLoaderFromJars(jar);
			loader.loadClass((String)null);
	}
	}
	
	public static void testLoadClassFromClassLoader(Class<?> class_1, String jar_1){
		//System.out.println(jar_1);
		ClassLoader loader = ClassUtil.getClassLoaderFromJars(jar_1);
		loader.loadClass(class_1.getName()).newInstance();
	}
	
	@Test
    public void testGetClassByClass(String className)
	        throws Exception {
    
    
	        String[] jars=ClassUtil.getClassLoaderFromJars ("jar");
	    for(String jar : jars){

	        ClassLoader loader =  getClassLoaderFromJars(jar);
	        loader.loadClass(className).newInstance();
	    }
    }
	@Test
	public void testLoadClassByClass(){
		String[] jars=ClassUtil.getClassLoaderFromJars("jar");
		for(String jar : jars){
	        ClassLoader loader =  getClassLoaderFromJars(jar);
	        loader.loadClass("org.quickserver.util.test").newInstance();
	    }
	}
	
	@Test
    public void testGetClasses() throws Exception{
		ArrayList<String> loadList = new ArrayList<>();
		ArrayList<String> allLoad = new ArrayList<>();
		for(String jar : ClassUtil.getClassLoaderFromJars("jar")){
			loadList.add(getClassFromJar(jar));
			loadList.add(getClassFromJar(jar));
		}
		for(String jar : ClassUtil.getClassLoaderFromJars("jar"))
			loadList.add(jar);
		String[] jars1 = ClassUtil.getClassLoaderFromJars("jar");
		for(String jar : jars1){
			allLoad.add(jar);
		    ArrayList<String> list = getClassNamesFromJar(jar);
			for(String className : list){
	            loadList.add(getClassFromJar(className));
			}
		}
	}
	
	// @Test
	 //  public void testLoadClassFromJar() throws Exception{
	//
	//       	String[] jars=new String[]{
	//	   		//"jars/jar0",
	//	   		"org.quickserver.util.test",
	//	   		"jar/jar0",
	//	   		"jar/jar0/"
	//	   		};	
	//	
	//	   	ClassLoader loader =  ClassUtil.getClassLoaderFromJars(jar);
	//    
	//	   	for(String jarFile : jars){
	//			loader =  getClassLoaderFromJars(jarFile);
	//			loader.loadClass(jarToClassName(jarFile)).newInstance();
	//		}
	//	}
	
	
}