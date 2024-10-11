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

    public static boolean debug;

    /**
     * Class used to display information about class.
     */
    private class DisplayClassInfo implements AutoCloseable {
        private DisplayClassInfo mClassInfoObject;
    
        public DisplayClassInfo(DisplayClassInfo classInfo) {
        	this.mClassInfoObject = classInfo;
       }
       @Override
       public void close() {
        	this.mClassInfoObject = null;
       }
    }
    
	/**
     * Method in which ClassInfo will be printed.
     * The printed class info object is returned and
     * it can be used to read information about the new class.
     */
	public void getClassInfo (DisplayClassInfo classInfo){
        String thisClass = classInfo.getClassInfo().toString();
		ClassInfo_2Test.this.printClassInfo(thisClass);
	}
	
	/**
	 * Method to print the classes info.
	 */
    public void printClassInfo() {
    	ClassInfo_2Test.printClassInfo("");
