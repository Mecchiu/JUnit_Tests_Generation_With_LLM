// ClassInfo_4Test.java
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
* It contains one unit test case for the {@link ClassInfo#printInterfaces()} method.
*/
class ClassInfo_4Test {
		 	
	private final static class ClassInfo_4 extends ClassInfo{
			public ClassInfo_4(String name, DirManager dirMan, String[] cMethods, String[] fndMethods, String[] knownPackages ){
				super(name, dirMan);
			}
			
			public String printInterfaces() {
				return super.printInterfaces();
			}
		}

		@Test
		public void test() throws Exception {
			System.out.println("TEST - ClassInfo");
			ClassInfo mi = new ClassInfo("ClassInfo");
			
			//mi.knownPackages = knownPackages;
			//mi.setKnownPackages();
			
			//mi.srchMethods("C.C.C");
			//mi.srchMethods("C.C");
			
			System.out.println("ClassInfo_4.test: \n");
}
}