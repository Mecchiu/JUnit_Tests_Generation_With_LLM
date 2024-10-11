// SimpleUserMgr_0Test.java
package com.browsersoft.aacs;

import jdbm.JDBMEnumeration;
import jdbm.JDBMHashtable;
import jdbm.JDBMRecordManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleUserMgr}.
* It contains one unit test case for the {@link SimpleUserMgr#getUser(String, String, String)} method.
*/
class SimpleUserMgr_0Test {
		
	public final static void main(String[] args) {
        try {
            SimpleUserMgr a = new SimpleUserMgr("SimpleUserMgr_0Test.jdbm", "jdbm");
            System.out.println("Executing the testcase for the method: "+"getUser()");
            assertNotNull(a.getUser("cn1", "org", "bob@bob.org"));
            System.out.println("Executing the testcase for the method: "+"getUser(String username, String org, String email)");
            assertNotNull(a.getUser("x", "mailincite", "test@test.com"));
            System.out.println("Executing the testcase for the method: "+"getUser(String username, String org, String email, String o)");
            assertNotNull(a.getUser(
                    "cn1", "org", "bob@bob.org", "x", "mailincite", "test@test.com"));
        } catch (AssertionError e) {
           System.out.println("FAILED." + e);
           System.exit(1);
        }
	}

/*
        private final static Properties prop = new Properties();

    public void runTest() throws Exception {


        Vector<String> values = new Vector<String>();
        for (int n=0; n<12; n++) {
            values.add("cn" + n);
        }

        Vector<String> newValues = new Vector<String>();
        for (int i=12; i<16; i++) {
            double weight = Math.random();
            newValues.add(System.getProperty("cn" + i) +"=" + weight + ",");
        }
        System.out.println("\n\n\n===============================");

        System.out.println(values);

        System.out.println(newValues);

        assertTrue(values.toString().indexOf("cn1") >= 0);
        assertTrue(newValues.toString().indexOf("cn1") >= 0);

        Vector<String> deletedValues = new Vector<String>();
        for (int i=1; i<16; i++) {
            String value = values.remove(newValues.iterator().next());
            deletedValues.add(value);
        }
        System.out.println(deletedValues);

        assertNotNull(values.remove(values.isEmpty()? "cn1" : "cn"));
        assertNotNull(newValues.firstElement());
        assertEquals(0, deletedValues.size());
        System.out.println(values);
        assertTrue(values.isEmpty());

        // for 1.19: no effect


        values.insertElementAt("cn2", 0);
        values.insertElementAt("cn3", 1);
        values.insertElementAt("cn4", 2);
        newValues.insertElementAt("cn5", 25);
        System.out.println(values);

        // for 1.19.1
        values.insertElementAt(values.iterator().next(), values.size());
        System.out.println(values);

        System.out.println(newValues);

        // for 1.19.2
        values.clear();
        newValues.clear();

        System.out.println(values);

        System.out.println(newValues);

        // for 1.19.3
        System.out.println(values);

        System.out.println(newValues);
    }
*/

        }

public static class SimpleUserMgr_0Test_2 {

//    public static void main(String[] args) {

//        new SimpleUserMgr("SimpleUserMgr_0Test_2.jdbm", "jdbm");
//    }

}