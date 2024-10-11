// ClassInfo_3Test.java
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
* It contains one unit test case for the {@link ClassInfo#printConstructors()} method.
*/
class ClassInfo_3Test {

    static interface I {
        public String toString();
    }

    public static boolean debug;

	/**
	 * The main method.
	 *
	 * @param  args string array for main
	 */
	public static void main(String[] args)throws Exception {
        JFrame frame = new JFrame("ClassInfo.test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(1,1));

        I obj1 = new I() {
            public String toString() {
                return "obj1";
            }
        };

        I obj2 = new I() {
            public String toString() {
                return "obj2";
            }
        };

        I obj3 = new I() {
            public String toString() {
                return "obj3";
            }
        };

        JLabel jl = new JLabel();

        Object objArray[] = new Object[3];
        objArray[0] = obj2;
        objArray[