// ClassInfo_5Test.java
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
* It contains one unit test case for the {@link ClassInfo#getData(Member[])} method.
*/
class ClassInfo_5Test {
		public static Object methodForCalledMethod(String c, String m, Object[] args) throws ClassNotFoundException
    {
        ClassInfo_5.printArray( args );

        JFrame frame = new JFrame("Testing method for public constructors");
        ClassInfo_5 frameClassInfo = new ClassInfo_5();

        frame.setLayout(null);
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        //add all elements to the frame
		frame.getContentPane().add( new ClassInfo_5_Panel(frameClassInfo) );

        javax.swing.GroupLayout  l_layout = new javax.swing.GroupLayout( frame.getContentPane());
		frame.getContentPane().setLayout( l_layout );
        l_style = new javax.swing.plaf.UIManager.LookAndFeelInfo[1];
}
}