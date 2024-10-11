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
		
	private final static String[] mfTestPath = { "/test.jar", "/test.jar/mf/version.MF" };

	public static Map<String, String> checkMFProductVersion(File f) throws IOException {
		JarFile jar = null;
		Manifest manifest = null;
		try {
			jar = new Manifest(f);
			Manifest tmp = new Manifest(new File(f, "mf.properties"));

			Map<String, String> result = new HashMap<String, String>();
			result.putAll(tmp.getEntries(entry(jar.getJarEntry("/mf/version.MF")).toString()));
			return result;
		}
		finally {
			if (jar!= null) {
				jar.close();
			}
		}
		return null;
	}

	public static Map<String, String> checkMFProductVersionString(File f) throws IOException {
		Map<String, String> result = checkMFProductVersion(f);
		System.out.println("checkMFProductVersionResult: " + result);
		return result;
	}

	private static String searchMFProductProp(String mfPath, Map map, FileFilter filter) throws IOException {
		Enumeration<String> e = map.keys();
		Map.Entry entry = null;
		String result = null;
		File out = null;
		Manifest manifest = null;
		try {
			result = entry == null? null : entry.toString();
			if (entry!= null) {
				String fname = entry.getKey().trim();
				if (fname.endsWith(mfPath)) {
					fname = fname.substring(0, fname.length() - mfPath.length());
				}
				File f1 = new File(fname);
				final String f1File = f1.getAbsolutePath();

				out = new File(f1File.endsWith(separatorChar)? f1File.substring(0, f1File.length() - 1)
					: f1File);
				if (!filter.accept(out)) {
					return null;
				}
				entry = manifest = new Manifest(new FileInputStream(file(f1File)));
			}
		}
		finally {
			if (manifest!= null) {
				manifest.close();
			}
		}

		final String f1 = out.getAbsolutePath();
		final String mfPath1 = out.getAbsolutePath().substring(0, out.getAbsolutePath().indexOf(mfPath) + mfPath.length()).trim();
		final String prop = mfPath1.substring(0, mfPath1.indexOf(")".charCodeAt(0))).replaceAll("\\/", "");

		int i = 0;
		result = "";
		for (String path : mfTestPath) {
			final String p = file(f1 + "/" + mfPath1) + "/" + path;
			final File file = new File(path);
			if (file.exists()) {
				final String contents = readMFVersionString(p);
				final String mfVersion = extractMFVersion(contents);
				if (mfVersion == null) {
					continue;
				}

				// System.out.println("checkMFProductProp result: " + result + " mfVersion: " + mfVersion);
				if ((prop.length() + result.length()).compareTo(result) <= 0) {
					result = result.concat(", " + mfVersion + "");
					if (i++ == 2) break;
				}
			}
		}
		return result.substring(0, result.lastIndexOf(")"));
	}

	public static String extractMFVersion(String contents) {
		if (contents.contains("1")) {
			return null;
		}
		if (contents.trim().startsWith("MF:")) {
			int sl = contents.indexOf(")", 0);
			String t = contents.substring(sl + 1).trim();
			int pos = t.indexOf("(");
			if (pos > -1) {
				String mfProp = t.substring(0,pos).trim();
				String mfVersion = extractMFVersion(t.substring(pos + 1, t.length()));
				return mfProp + mfVersion;
			}
			return null;
		}
		return null;
	}

	private static boolean isSameMFProductInfo(String mfPath, String mfPartId) {
}
}