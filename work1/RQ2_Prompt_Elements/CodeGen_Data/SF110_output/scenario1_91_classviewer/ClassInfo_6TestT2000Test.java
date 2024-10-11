// ClassInfo_6Test.java
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
* It contains one unit test case for the {@link ClassInfo#getData(Class[])} method.
*/
class ClassInfo_6Test {

    static final int count = 5;
    static final int length = 10;
    static Object testObject = null;
    static Boolean dataSet = null;
    static int count_set = 0;
    static int index_set = 0;
    private static JFrame frame;
    private static JPanel panel;
    private static JList list;
    private static boolean dataSetTest = false;
    private static boolean indexSetTest = false;
    
    static {
        ToolBox.addClass(getData(NewClass_5.class));
    }
    
    class NewClass_5 {
        
        public static String[] getData(String s) {
            if (dataSetTest) {
                dataSetTest = false;
                System.out.println("ClassInfo.NewClass_5");
            }
            
            if (indexSetTest) {
                index_set = 0;
                System.out.println("ClassInfo.NewClass_5.index");
            }
            
            return (new String[] {s});
        } 
        
    }
    
    JFrame getFrame(){
        return frame;
    }
    JPanel getPanel(){
        return panel;
    }
    
    static Enumeration<String> enumeration = new Enumeration<String>() {

        public boolean hasMoreElements() {
            return count_set < length;
        }

        public String nextElement() {
            return String.valueOf(count_set);
        }
        
    };
    
    // ClassInfo_6 Test
    // public static void main( String[] args ) {
    // System.out.println("Testing");
    // try {
    //     List<ClassInfo> tempList = (List<ClassInfo>) ClassInfo.class.newInstance();
    //     
    //     Enumeration<String> enum = tempList.elements();
    //     System.out.println("Enum Elements: ");
    //     while( enum.hasMoreElements() ) {
    //         System.out.println( enum.nextElement() );
    //     }
    //     System.out.println("Enum Size: " + enum.size());
    //     
    //     String s = null;
    //     System.out.println("Testing");
    //     System.out.println("1st test: ");
    //     Enumeration<String> eEnum = tempList.elements();
    //     while( eEnum.hasMoreElements() ) {
    //         s = eEnum.nextElement();
    //         System.out.println( "2nd test: " + s );
    //     }
    //     
    //     
    //     testSet(tempList);
    // } catch( RuntimeException ex ) {
    //     ex.printStackTrace();
    // }
    
    public ClassInfo_6Test(JFrame frame) {
        this.frame = frame;
    }
    
    public void testSet(List<ClassInfo> tempList) {
        ClassInfo temp = null;
        System.out.println("Testing");
        System.out.println("tempList.size(): " + tempList.size());
        System.out.println("tempList.elements() : " + Enumeration.toString(tempList.elements()));

        System.out.println("Enum Elements" + Enumeration.toString(tempList.elements()));
        
        Enumeration<String> enumeration = tempList.elements();
        System.out.println("Enum Elements: " + enumeration.hasMoreElements());
        
        while ( enumeration.hasMoreElements() && index_set < length ) {
            System.out.println( enumeration.nextElement() );
            System.out.println("index_set" + index_set);
            index_set++;
            
            
            
        }
    }
    
}
