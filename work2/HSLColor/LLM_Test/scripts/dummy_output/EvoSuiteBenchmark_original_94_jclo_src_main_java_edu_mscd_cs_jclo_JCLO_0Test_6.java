// JCLO_0Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains one unit test case for the {@link JCLO#getValue(String)} method.
*/
class JCLO_0Test {
		private JCLO obj;

    @Test
    void test_1() {
    String object;
    String[] args;

    obj = new JCLO("", "", true);

    obj.parse(new String[]{"-a", "b", "-c", "-d"});
    object = String.class.cast(obj.getObject(0));
    assertEquals("b", String.class.cast(arg("a")));
    assertEquals("c", String.class.cast(arg("c")));
    obj.parse(new String[]{"-e", "-f", "a"});
    object = String.class.cast(obj.getObject(0));
    assertEquals("a", String.class.cast(arg("e")));
    assertEquals("f", String.class.cast(arg("f")));
    obj.parse(new String[]{"-g", "a"});
    object = String.class.cast(obj.getObject(0));
    assertEquals("a", String.class.cast(arg("g")));
    assertNull(object);
        }
}