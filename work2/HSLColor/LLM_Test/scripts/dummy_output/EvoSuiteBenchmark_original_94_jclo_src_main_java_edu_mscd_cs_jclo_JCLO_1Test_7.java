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
		private static final boolean ENABLE_TEST_ARRAY = true; //TODO find out if this is true
        String[] arrArgs;

    /**
    * The constructor that takes the Object that contains the variables
    * acceptable on a command line.  Call parse (String) to do the actual parsing.
    * 
    * @param o	where the variables/arguments are
    */
    public JCLO_1Test(Object o) {
        assertNotNull( o);
        Object result = parseString(o.toString());
        assertNotNull( result);
        // assertTrue( result instanceof Object[], "ObjectArray constructor must return an Object[][].");
        this.arrArgs = (((Object[])result))[1];
    }

    public Object usage() {
        if (ENABLE_TEST_ARRAY) {
          return new Object[] {"usage"};
        }
        return new Object[] {"usage", arrArgs[0], arrArgs[1],
                             arrArgs[2], arrArgs[3], "arg" };
    }

    public String getUsageString() {
        return "usage " + arrArgs[0] + " " + arrArgs[1] + " "
            + arrArgs[2] + " " + arrArgs[3];
    }

    public boolean getBoolean(Object key) {
        return getBooleanValue(key);
    }

    public byte getByte(Object key) {
        return getByteValue(key);
    }

    public char getChar(Object key) {
        return getCharValue(key);
    }

    public short getShort(Object key) {
        return getShortValue(key);
    }

    public int getInt(Object key) {
}
}