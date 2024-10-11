// ClassInfo_2Test.java
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
* It contains one unit test case for the {@link ClassInfo#printMethods(int)} method.
*/
class ClassInfo_2Test {
		
	/**
	* Test for MethodInfo.
	*
	* @param  count   int  number of methods
	* @param  length  int  length of the arrays and strings
	*/
	@Test
    public void test0(int count, int length) {
	    List<Object> tmp;
	    String[] fnames;
	    String[] pnames;
	    tmp = new ArrayList<>(length);
	    System.arraycopy(this.fNames, 0, tmp, 0, this.fNames.length);
	    fnames = new String[length];
	    System.arraycopy(this.fNames, 0, fnames, 0, this.fNames.length);
	    
	    System.arraycopy(this.pnames, 0, fnames, 0, this.pnames.length);
	    pnames = new String[length];
	    System.arraycopy(this.pnames, 0, pnames, 0, this.pnames.length);

}
}