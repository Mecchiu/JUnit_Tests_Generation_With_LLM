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
		 /**
		 * Test getPartInfo method.
		*/
		@Test
		 public void testGetPartInfo() throws IOException, URISyntaxException{
				init(JWBF_1Test.class);
				assertEquals("partid", JWBF.getPartId("WEB-INF/lib/jwbf-1"));
		}
		 /**
		 * Test readFromManifest method.
		*/
		@Test
		public void testReadFromManifest() throws IOException, URISyntaxException {
				init(JWBF_1Test.class);
				assertEquals("partid", JWBF.getPartId("WEB-INF/lib/jwbf-1"));
		}
		 /**
		  * Test searchMF method.
		  */
		public void testSearchMF() throws IOException, URISyntaxException{
				String mfRootPath = "WEB-INF/lib";
		        File f=new File(mfRootPath);
		        assertNotNull(f);
		        // get entries
		        File[] entries = f.listFiles(new FileFilter() {
		                public boolean accept(File candidate) {
		                        return candidate.isFile();
		                }
		        });
		        assertNotNull(entries);
		        // get info
		        Enumeration<String> info = Collections.list(entries.length),
	        infoIter = entries;
		        while (infoIter.hasMoreElements()) {
		                Enumeration<String> it = infoIter.nextElement().replace("/", "").
		                split("/META-INF/MANIFEST.MF");
		                Manifest manifest=new Manifest();
		                Manifest manifest_tmp = new Manifest();
		                String mfkey = null;
	        		while (it.hasMoreElements()) {
	        		try {
	        		URL url = new File(it.nextElement()).toURI().toURL();
	        		assertNotNull(url);
	        		Manifest manifest =new Manifest();
	        		manifest_tmp=new Manifest();
	        		manifest.getMainAttributes().put(it.nextElement(), manifest_tmp);
	        		manifest.getEntries().add(manifest_tmp);
	        		
       			         
	        		}
	        		catch (IllegalArgumentException e) {
	        		        
	        		}
	        		catch (IOException e) {

	        		}
	        		catch (URISyntaxException e) {

	        		}
	        	}
		        // search in manifest
		        File[] entry = f.listFiles(new FileFilter() {
		                public boolean accept(File candidate) {
		                        if(candidate.isDirectory() && candidate.getName().equals("META-INF"))
		                            return false;
		                        else
		                            return true;
		                }
		        });
		        if (entry!= null) {
		                for (int i = 0; i<entries.length; i++) {
		                        if(info!= null)
		                        	info.previous();
		                        try{
    	                    

		                        	assertEquals(mfRootPath + separatorChar + i + separatorChar + 
						"META-INF/" + JWBF.getPartId(i) + ".MF", entries[i].getName());
		                        }
		                        catch(Exception e) {
		                        }
		                        
		                        if(info!= null)
		                        	info.next();
		                        f.delete(entries[i]);
		                }
		        }
	        }
 }
}