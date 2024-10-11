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
		private static final String DUMMY =
"PackageMainClass.ClassA.MainClass_DummyC{}"
+"package MainPackage; public class ClassA{} class ClassB extends ClassA { }"
+"package MainPackage; public class ClassB2 extends ClassA { }";

	private String partId;

	private File folder;

	private Manifest manifest;


	int partSrcStart;

	int partDestStart;


	int numOfEntries;


	void init2();

	void test();



		public JWBF_1Test(String partId)   {
			this.partId = partId;
		}

	/**
	* {@link JWBF#getPartInfo(Class)} should return a string array.
	* 
	* @throws IOException
	*/
	@Test
	public void test_getPartInfo() throws  IOException {
		//String[] p = getPartInfo(JWBF.class);
		//assertEquals("No parts information", 2, p.length);

	}

	/**
	* {@link JWBF#getPath(String)} should return a string array.
	* 
	* @throws IOException
	*/
	@Test
	public void test_getPath() throws  IOException {
		//String[] p = JWBF.getPath(JWBF.class);
		//assertEquals("No path information", 1, p.length);
	}



	/**
	*{@link JWBF#searchMF(String)} should return a URL.
	* 
	* @throws IOException
	*/

	@Test
	public final void test_searchMF()throws  IOException {
		URL u = JWBF.searchMF(partId) ;
		assertNotNull("no path", u);
	}


	/**
	*{@link JWBF#searchMFProductTitle(String)} should return a string.
	* 
	* @throws URISyntaxException
	* @throws IOException
	*/

	@Test
	public final void test_searchMFProductTitle()throws URISyntaxException,  IOException {
		String name = JWBF.searchMFProductTitle(partId) ;
		assertNotNull("no title", name);


	}



	/**
	*{@link JWBF#readMFVersion(String)} should return the value.
	* 
	* @throws IOException
	*/

	@Test
	public final void test_readMFVersion()throws IOException {
		File f = new File(partId);
		String s = readMFVersion (f);
		assertNotNull("read is null", s);
		assertEquals("getVersion is empty", s, version);


	}



	/**
	*{@link JWBF#readMFProductTitle(String)} should return the value.
	* 
	* @throws IOException
	*/

	@Test
	public final void test_readMFProductTitle()throws IOException {
		File f = new File(partId);
		String s = readMFProductTitle(f);
		assertNotNull("read is null", s);


	}



	/**
	* Test method.
	*
	*/
	private void init2()   {

//		Part p = 
		partSrcStart = 0;
		partDestStart = 0;
		Enumeration en = null ;

		try  {
			en = manifest.getEntries() ;
			while(en.hasMoreElements()) {
				JarEntry e = (JarEntry) en.nextElement() ;

				//System.out.println(e.getName());

				if (e.getName().equals(jarFileIndex)) {
					partSrcStart = e.getName().length() ;
				}

				if (e.getName().equals(partFileMFFileExt)) {
					partDestStart = e.getName().length() ;
					continue;
				}
			}
		}
		catch (IOException ioe) {
			System.out.println ("iothrow: " ) ;
			ioe.printStackTrace() ;
			assertEquals ("Exception for some file", IOException.class, ioe.getClass())  ;
		}


		this.partSrcStart = readMFVersion(partId);
		this.partDestStart = readMFProductTitle(partId);
	}


	/**
	
	* Test method.
	
	*/
	private void test()throws IOException {
		//String[] p = JWBF.getPartInfo(this.partId);
		String[] p = getPartInfo(this.partId);
}
}