// ClassInfo_1Test.java
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
* It contains one unit test case for the {@link ClassInfo#printMethods()} method.
*/
class ClassInfo_1Test {

    
    @Test
    public void testParseClassInfo() {
        assertTrue("ClassInfo_1Test:  error.", ClassInfo_1Test.isParseClassInfo());
    }

    @Test
    public void testParseClassInfo2() {
        Class[] types = ClassInfo_1Test.class.getTypes();
        ClassInfo_1Test t = new ClassInfo_1Test();
        ClassInfo_1 test = getClassInfo(t, types[0].getName(), null);
        ClassInfo_1 target = getClassInfo(test, types[1].getName(), null);
        assertEquals("ClassInfo_1Test:  error.", t, test);
        assertEquals("ClassInfo_1Test:  error.", target, test);
        
        String targetClassName = "com.jstevh.viewer.ClassInfo_1Test$Test";
        ClassInfo_1 test2 = getClassInfo(t, targetClassName, null);
        assertNull("ClassInfo_1Test:  error.", test2);
    }
    
    private boolean isParseClassInfo(){
        return true;
    }

    private ClassInfo getClassInfo(ClassInfo_1 t, String cFullName,  Class cOuterMostOfClass) {
        ClassInfo tClass = null;
        
        try {
            tClass = getClassInfo(t.getClassInfo(), cFullName, t);
            t.setClassInfo(null);
        }
        catch (javax.swing.UnsupportedLookAndFeelException e) { }
        catch (ClassNotFoundException e) { }
        
        if (cOuterMostOfClass == null) {
            if (tClass == null) { return null; }
            javax.swing.JFrame f = new javax.swing.JFrame();
            f.setTitle(cFullName);
            f.setResizable(false);
            f.getContentPane().add(tClass);
            f.pack();
            f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            f.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosed(java.awt.event.WindowEvent e) {
                    tClass.setClassInfo(null);
                }
            });
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            f.pack();
            f.setLocationRelativeTo(null);
            f.setResizable(false);
            return t;
        } else {
            return tClass;
        }
    }
}
