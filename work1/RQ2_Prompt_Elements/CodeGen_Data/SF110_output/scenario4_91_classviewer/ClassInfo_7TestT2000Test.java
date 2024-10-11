// ClassInfo_7Test.java
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassInfo}.
* It contains one unit test case for the {@link ClassInfo#srchMethods(String)} method.
*/
class ClassInfo_7Test {
/**
		* Returns a new class info object using the given default manager.
		*/
		public static ClassInfo srchMethods(FileManager fileManager) throws Exception {
		ClassInfo ci = null;

		try {
			File f = fileManager.getFile();

			InputStream is = fileManager.getInputStream(f.toString());

			ClassFileReader cfreader = new ClassFileReader(is);

			String name = (String)ClassInfo.class.getDeclaredMethod("srchClass", InputStream.class).invoke(cfreader);

			Class c = ClassFileReader.readClass(is,name);

			String[] rv = cfreader.getReferencedConstructors();

			Vector<Method> mv = new Vector<>();

			for (int j = 0; j < rv.length; j++) {
				Method m = ClassFileReader.getMethodByName(rv[j], c);
				Method mvni = new Method(m).setVisibility(mvniVisibility(mvniVisibility(m)));
