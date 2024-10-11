// DecompilerTest.java
package org.mozilla.javascript;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Decompiler}.
* It contains one unit test case for the {@link Decompiler#decompile(String, int, UintMap)} method.
*/
class DecompilerTest {
		
    @Test
    public void testSimple() {
        String source = decompile("x=1","TO_SOURCE", UintMap.EMPTY_MAP);
        assertEquals("decompiled", "<x >1>", source);
        assertEquals(sourceTop, 3);
    }

    @Test
    public void testComplex() {
        String source = decompile("1=1\n1=2\n\ndeclaration:\n\ntabs:1\n\nreturn\n\n\tx\n\nliteral:\n\n(function ()\n\n{\ntree\n\n}\n\n");
        assertEquals("decompiled", "1\n\ndeclaration: <undefined>\n\ntree:\n\n(function () { tree {\n\n\t|>x\n}\t);\n\n(function (x) { tree {\n\n\t}\n\t;\n\t\t// NOTE: To get here the function may be compiled with flags TO_SOURCE.\n\tif (x) {\n\t}\n};\n})\n\n", source);
        assertEquals(sourceTop, 5);
    }
}