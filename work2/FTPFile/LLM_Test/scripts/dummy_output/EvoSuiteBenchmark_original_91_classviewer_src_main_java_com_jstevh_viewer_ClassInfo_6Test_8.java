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
		
	final class TypeInfo {
            public String getClassType() { return ClassInfo.class.getName(); }

            public String getClassName() { return ClassInfo_6Test.class.getName(); }

            public String getClassPackage() { return ClassInfo_6Test.class.getPackage().getName(); }

            public static final ClassInfo_6Test instance
                = new ClassInfo_6Test();
           }
	}
    
	public static class MemberMethod {
                    public String name;
                    public Object[] args;

                    public MemberMethod(String name,Object[] args) {
                        this.name = name;
                        this.args = args;
                    }

                    public String toString() {
                        return "Member";
                    }
}