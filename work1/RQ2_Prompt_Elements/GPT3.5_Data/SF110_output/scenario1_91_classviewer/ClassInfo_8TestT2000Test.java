// ClassInfo_8Test.java
package com.jstevh.viewer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ClassInfo}.
 * It contains ten unit test cases for the {@link ClassInfo#getFoundMethod(int)} method.
 */
class ClassInfo_8Test {

    @Test
    void testGetFoundMethodWithNull() {
        ClassInfo classInfo = new ClassInfo();
        assertNull(classInfo.getFoundMethod(0));
    }

    @Test
    void testGetFoundMethodWithOutOfRangePosition() {
        ClassInfo classInfo = new ClassInfo();
        assertNull(classInfo.getFoundMethod(10));
    }

    @Test
    void testGetFoundMethodWithValidPosition() {
        ClassInfo classInfo = new ClassInfo();
        assertNotNull(classInfo.getFoundMethod(0));
    }

    @Test
    void testGetMethPackageWithNullClass() {
        ClassInfo.MethodData methodData = new ClassInfo().new MethodData() {
            @Override
            public String getMethPackage() {
                return null;
            }

            @Override
            public String getMethClass() {
                return null;
            }

            @Override
            public String getMethName() {
                return null;
            }
        };
        assertNull(methodData.getMethPackage());
    }

    @Test
    void testGetMethPackageWithNonNullClass() {
        ClassInfo.MethodData methodData = new ClassInfo().new MethodData() {
            @Override
            public String getMethPackage() {
                return "com.jstevh.viewer";
            }

            @Override
            public String getMethClass() {
                return null;
            }

            @Override
            public String getMethName() {
                return null;
            }
        };
        assertEquals("com.jstevh.viewer", methodData.getMethPackage());
    }

    @Test
    void testGetMethClassWithNullClass() {
        ClassInfo.MethodData methodData = new ClassInfo().new MethodData() {
            @Override
            public String getMethPackage() {
                return null;
            }

            @Override
            public String getMethClass() {
                return null;
            }

            @Override
            public String getMethName() {
                return null;
            }
        };
        assertNull(methodData.getMethClass());
    }

    @Test
    void testGetMethClassWithNonNullClass() {
        ClassInfo.MethodData methodData = new ClassInfo().new MethodData() {
            @Override
            public String getMethPackage() {
                return null;
            }

            @Override
            public String getMethClass() {
                return "com.jstevh.viewer.ClassInfo";
            }

            @Override
            public String getMethName() {
                return null;
            }
        };
        assertEquals("com.jstevh.viewer.ClassInfo", methodData.getMethClass());
    }

    @Test
    void testGetMethName() {
        ClassInfo.MethodData methodData = new ClassInfo().new MethodData() {
            @Override
            public String getMethPackage() {
                return null;
            }

            @Override
            public String getMethClass() {
                return null;
            }

            @Override
            public String getMethName() {
                return "getFoundMethod";
            }
        };
        assertEquals("getFoundMethod", methodData.getMethName());
    }
}