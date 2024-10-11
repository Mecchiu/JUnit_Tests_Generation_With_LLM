// JWBF_1Test.java
package net.sourceforge.jwbf;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JWBF}.
* It contains one unit test case for the {@link JWBF#getPartId(Class)} method.
*/
class JWBF_1Test {
		
	@Test
	public void getPartId() throws IOException, ClassNotFoundException {
		
		ClassLoader cl = JWBF.class.getClassLoader();
	
		// Check that only one jarFile is scanned
		JarFile dir = new JarFile(new File("test"));
		String jarName = dir.getName();
	
		String f =  jarName + jarFileIndex + dir.getName();
		
		String p = dir.getName();
		
		int t = 0;
	
		String version = "Version";
		f = f + separatorChar + version;
	
		f = f + separatorChar + "testpart";
		
		f = f + separatorChar + f.split(".")[0];
		
		f = f + separatorChar + "test_" + f.split(".")[0].substring(0, f.split(".")[0].length()-1);
		
		Enumeration<?> e = Collections.enumeration(cl.getResources(f));
		while (e.hasMoreElements()) {
			File f1 = (File) e.nextElement();
			String f2 = f1.getName();

			String f3 = f2.split("test-")[0];
			if(!f2.endsWith("info.jwbf")){
				continue;
			}
			
			String f4 = "File";
			if(!f3.endsWith("/." + f2.split("-")[0]) ||!f3.endsWith("/") ||
					!f4.endsWith("." + f2.split("-")[0].substring(0, f2.split("-")[0].length() -4)))
			{
				continue;
			}
			
			if(f2.split("-").length > 1)
			{
				if(!f2.endsWith("info.jwbf"))
									continue;
			}
			else
			{
				if(!f2.endsWith("info.jwbf"))
									continue;
			}
			
			if(!JWBF.isCompatible(f1, f2)
			||!JWBF.isCompatible(f2, f1))
			{
				continue;
			}
			
			String s1 = JWBF.getPartId(f1);
			String s2 = JWBF.getPartId(f2);
			
			assertTrue(s1.compareTo(s2) == 0);
			
			p= s1;
			
			f= f + separatorChar + p.split(".")[0];
		}
	}
	
	
	private static boolean isCompatible(File f1, File f2){
		
	    if(!f1.isDirectory() ||!f2.isDirectory()){
	        return f1.getPath().startsWith(f2.getPath());		
	    }
	    
		Manifest manifest1 = null;
	    try
		{
	     // Use manifest to get manifest of the second jar
	     manifest1 = new Manifest(f2.getInputStream());
		 return getPartInfo(manifest1.getMainAttributes().getValue("Main-Class"))
	                                        .equals(getPartInfo(manifest1.getMainAttributes().getValue("Exe-Class")))
	                                         && getPartInfo(manifest1.getMainAttributes().getValue("Manifest-Version"))
	                                        .equals(getPartInfo(manifest1.getMainAttributes().getValue("Main-Version")));
	     }
	    catch (Exception e1) {
	     /*
	      * It seems that the manifest for the second jar does not contain "exe-class" attribute.
	      */
	     System.out.println("TODO: Add JAR name for manifest test.");
	     System.out.println("");
	     System.out.println("Exception: "+e1.getMessage());
	     return false;
	    }
	}
	
  public static void init(final Class<?> clazz)throws URISyntaxException, IOException{
      final File tmp = File.createTempFile("test", "jar", System.getProperty("java.io.tmpdir"));
      
	   JWBF.init(tmp);
	 
	
	  JWBF.addPart(tmp, clazz.getName(),
				  new File(new File("jwbf/lib ").toString()),
				  clazz.getName());
	  
	  String[] p = JWBF.getPartInfo(clazz);
	  System.out.println(p[0]+p[1]);
  }
}