// JCLO_1Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains one unit test case for the {@link JCLO#usage()} method.
*/
class JCLO_1Test {
// JCLO.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;

public class JCLO {

    public String usage() {
        boolean additional = false;
        String[] a = new String[fields.length];
        int count = 0;
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            String key = field.getName();
            Class type = field.getType();
            if (key.equals("additional"))
                continue;
            if (prefix!= null) {
                if (!key.startsWith(prefix))
                    continue;
                else
                    key = key.replaceFirst("^" + prefix, "");
            }
            if (Modifier.isFinal(field.getModifiers()))
                continue;
            key = key.replaceFirst("^_([0-9])", "$1");
            key = key.replaceAll("__", "-");
            key = key.replaceAll("_\\$", ".");
            a[count++] = (doubleDashes? "--" : "-") + key + getUsageType(type) + "\n";
        }
        String r = "";
        java.util.Arrays.sort(a, 0, count);
        for (int i = 0; i < a.length; i++) if (a[i]!= null)
            r += a[i];
        return (r);
    }
}

// JCLO_1Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains one unit test case for the {@link JCLO#usage()} method.
*/
class JCLO_1Test {
		JCLO _jCLO = new JCLO("com.tibs.jclo.jcmd", 
				"Commands for command line utility library JCLO", 
				"http://java.sun.com/javase/7/docs/technotes/guides/jclo/jclo4.html");
static class JCLO_1Test_1 extends JCLO_1Test {
		@Test
		void testUsage() {
			assertEquals("Usage of JCLO is no longer supported",
					"jclo commands are no longer supported",
					usage());
		}
}
	@Test
	void testUsage_1() {
		assertEquals("Usage of JCLO is no longer supported",
				"jclo commands are no longer supported",
				usage());
	}
}


