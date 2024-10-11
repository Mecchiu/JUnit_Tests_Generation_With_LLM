// JWBF_2Test.java
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
* It contains one unit test case for the {@link JWBF#getVersion()} method.
*/
class JWBF_2Test {
		public final static String PARTID = "part-id.txt";
		public final static String PNTITLE = "part-name.txt";
		public final static String POTEXT = "Part" + String.valueOf(System.currentTimeMillis());

		class TestModule implements Module{
			public HashMap<String, String> m_info;

			public void create(File source, String dest) throws IOException {
			}

			public void install(File dest) {
			}

			public String description() {
				return String.format("%d MB free for testing",
						Math.round(Module.getSize(this)) / (1024.0)
				);
			}

			public String name() {
				return POTEXT;
			}
			public String version() {
				return getVersion(this.getClass());
			}
		}
	public static void main(String[] args) {
	JWBF.printVersion();
	}

	int test(String part, String partid, String partname, String partmsg, ArrayList<String> list){
		checkVersionException();
		checkStringArrayException(list.getClass().getName());
		assertEquals(part, partid, partmsg);
		assertEquals(partname, partid);

		if(!list.contains(POTEXT))
			return -1;

		if(!list.contains(PNTITLE))
			return -2;
		return 0;
	}

	public String getTmp(Module m) {
		try {
			checkStringArrayException(m.description().split("\n"));
			return m.description();
		} catch(IOException e) {
			return null;
		}
	}

	public String getPartId(Module m) {
		checkStringArrayException(m.description().split("\n"));
		return getFileInfo(m.getPath(), m.getName());
	}

	public Module getModule(String moduleName) {
		return null;
	}

	public void checkPartCount(int count) {
		assertTrue(count > 2);
	}

	public void checkVersionException() {
		assertTrue(!ModuleImpl.getVersion(null) == null);
		assertTrue(!ModuleImpl.getVersion("") == null);
		assertTrue(!ModuleImpl.getVersion("not a version file") == null);
	}
	public boolean errorInfo() {
		return this.errorInfo;
	}

	private void checkStringArrayException(String[] s) {
		if(s==null)
			return;
		final int count=s.length;
		for(int i=0;i<count;i++)
			if(!s[i].equals(""))
				assertTrue("error-line=" + s[i] + " expected a line starting with 'error-'");
	}

	private void checkFileNameException(File f) {
		try {
			File fi=new File(f.getCanonicalPath());
			FileFilter filter = new FileFilter(){

				public boolean accept(File path) {
					return path.getFileName().toString().toLowerCase().endsWith("pom.xml");
				}
			};
			if(!fi.getName().toLowerCase().endsWith("pom.xml"))
				assertTrue("file doesn't end with pom.xml" + fi.getAbsolutePath());
		} catch(IOException e) {}
	}


	public String getFileInfo(String fname, String part) throws IOException {
		if(!part.equals(""))
			part = "part-" + part;
		return fname + " " + part;
	}
	public Map<String, String> readMFVersion(String fname) throws IOException{
		if(!fname.endsWith(".jar"))
			fname = fname+".jar";
		try (JarFile f = new JarFile(new File(fname))) {
			Manifest mf = f.getManifest();
			if (mf!= null) {
				String v = mf.getMainAttributes().getValue("Version");
				String v2 = "";
				if(v!= null)
					v2 = v.substring(0, v.indexOf("-"));
				return new HashMap<String, String>(v2);
			}
		} catch(IOException e) {
			return new HashMap<String, String>(fname);
		}
	}

	public void check(TestModule module) throws IOException, PackageLoaderException {
		String p = module.getPath();
		assertEquals(1, Arrays.asList(module.description().split("\r\n")).size());
		assertEquals(module.getPartId(this),p);
}
}