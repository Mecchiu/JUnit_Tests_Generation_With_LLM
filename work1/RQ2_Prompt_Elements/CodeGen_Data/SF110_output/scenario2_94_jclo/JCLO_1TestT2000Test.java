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

    /**
     * Create and usage message for the acceptable command line variables.
     *
     * @return a String that specifies acceptable options
     */
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
		
	/**
	* @return test method to create and usage message.
	*/
	private final static long duration() {
		return (1000000L - (duration << 20));
	}
	
	/**
	* Test method for {@link JCLO#usage()} using the static method {@link JCLO#usage} that returns a string.
	*/
	@Test
	public void testUsage() {
		String r = "";
		java.util.Arrays.sort(fields);
		for (boolean isLast = true; isLast; isLast = false) {
			for (int i = 0; i < fields.length; i++) {
				if (fields[i]!= null) {
					Field field = fields[i];
					Object value = Array.get(field.get(new JCLO()), i);
					r += (isLast? "=" : " - ") + field.getName() + value + " \n";
				} else {
					r += "";
				}
			}
			System.out.println(r);
			if (isLast) {
				Thread.sleep(10);
			}
		}
	}
	
	/**
	* Provides test data for both the {@link JCLO#usage()} and the static method {@link JCLO#usage}
	* that uses the {@link JCLO#fields} array.
	* <p>
	* The data is stored in an array with two instances {@link doubleDouble double}, one element for
	* a reference to {@link field1}, and the other element for a new field named {@link field2}, then
	* the data is tested with the class {@link doubleDashesClass doubleDashesClass}.
	*/
	private final static Object[][] data1 = {
			{ false, false, false, false, false, false },
			{ true, false, false, false, true, true },
			{ false, true, false, false, false, false },
			{ true, true, false, false, true, true },
			{ false, false, true, false, false, false },
			{ true, false, true, false, true, true },
			{ false, true, true, false, false, false },
			{ true, true, true, false, true, true },
			{ true, true, true, true, false, false },
			{ true, true, true, false, true, true },
			{ false, true, true, true, false, false }
	},
	{ data1, data2}
	// JCLO_2Test.java
	public static junit.framework.Test[] tests = {
		new junit.framework.Test(new String[]{"usage", "-usage", "+usage", "-usage", "-usage", "+usage", "+usage", "-usage", "usage", "-usage", "+usage", "-usage", "usage", "-usage", "usage"}), new junit.framework.Test(new String[]{"fields"})
	};
	
	private static final String fields[][] = {
		null,
		{ null, "+",  true,  true, false, null, null },
		{ "a", "+a",  false,  false,  false, "a", null },
		{ null,  "a",  false, false, false,  "a", null },
		{  null,  null,  true,   true,   false,  null,  "a" },
		{ "",  "a",  false, false, false,  "a",  "a" },
	};
      
}
