// SimpleUserMgr_2Test.java
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
* It contains one unit test case for the {@link SimpleUserMgr#getMailbyOrg(String)} method.
*/
class SimpleUserMgr_2Test {
/**
		* Test method for {@link com.browsersoft.aacs.SimpleUserMgr#getMailbyOrg(String)}
		* where org is a system property variable.
		*
		* Test case is the following
        * (1..n). If the system property <i>systemProperty</i> is not null, its value is checked to be a system property <i>systemProperty</i>.
        *
		* Precondition: The two system properties of <i>systemProperty</i> and <i>systemProperty2</i> (in the following order) are checked
		*
		*   a. <i>systemProperty</i> is a system property variable.
        *   b. <i>systemProperty</i> value for property string is a legal property string.
        *   c. <i>systemProperty2</i> is a system property variable.
        *   d. <i>systemProperty</i> value for property string is a legal property string.
        *
		* Postcondition: <i>systemProperty</i> value for property string <i>systemProperty</i> which contains <i>systemProperty2</i> is checked.
		*
		* @throws Exception
		* Test can fail if test case is not executed correctly.
		*/
    @Test
    public void testGetMailbyOrg() throws Exception {
        JDBMHashtable users = recman.getHashtable("SYS2");
            Vector vec = (Vector) vec_1_5.clone();
            vec.addElement("a");
            vec.addElement("b");
            vec.addElement("c");
            vec.addElement("d");

        users.put("CJCO", vec);

         // SimpleUserMgr.getMailbyOrg checks the returned email address set in a.d.
         String s = SimpleUserMgr.getMailbyOrg(users);
        assertEquals("d.a.c", s);

         
         // SimpleUserMgr.getMailbyOrg works normally.
         users = recman.getHashtable("SYS2");
        vec = new Vector();
        vec.addElement("a");
        vec.addElement("b");
        vec.addElement("c");
        vec.addElement("d");
        users.put("CJCO", vec);
        vec = new Vector();
        vec.addElement("a");
        vec.addElement("b");
        vec.addElement("c");
        vec.addElement("d");
        users.put("CJCO2", vec);
        vec = new Vector();
        vec.addElement("a");
        vec.addElement("b");
        vec.addElement("c");
        vec.addElement("d");
        users.put("CJCO3", vec);
        vec = new Vector();
        vec.addElement("a");
        vec.addElement("b");
        vec.addElement("c");
        vec.addElement("d");
        users.put("CJCO4", vec);
        vec = new Vector();
        vec.addElement("a");
        vec.addElement("b");
        vec.addElement("c");
        vec.addElement("d");
        users.put("CJCO5", vec);
        vec = new Vector();
        vec.addElement("a");
        vec.addElement("b");
        vec.addElement("c");
        vec.addElement("d");
        users.put("CJCO6", vec);
        vec = new Vector();
        vec.addElement("a");
        vec.addElement("b");
        vec.addElement("c");
        vec.addElement("d");
        users.put("CJCO7", vec);
        vec = new Vector();
        vec.addElement("a");
        vec.addElement("b");
        vec.addElement("c");
        vec.addElement("d");
        users.put("CJCO8", vec);
        vec = new Vector();
        vec.addElement("a");
        vec.addElement("b");
        vec.addElement("c");
        vec.addElement("d");
        users.put("CJCO9", vec);
        vec = new Vector();
        vec.addElement("a");
        vec.addElement("b");
        vec.addElement("c");
        vec.addElement("d");
        users.put("CJCO10", vec);
        vec = new Vector();
        vec.addElement("a");
        vec.addElement("b");
        vec.addElement("c");
        vec.addElement("d");
        users.put("CJCO11", vec);
        vec = new Vector();
        vec.addElement("a");
        vec.addElement("b");
        vec.addElement("c");
        vec.addElement("d");
        users.put("CJCO12", vec);
        vec = new Vector();
        vec.addElement("a");
        vec.addElement("b");
        vec.addElement("c");
        vec.addElement("d");
        users.put("CJCO13", vec);
        vec = new Vector();
        vec.addElement("a");
        vec.addElement("b");
        vec.addElement("c");
        vec.addElement("d");
        users.put("CJCO14", vec);

        s = SimpleUserMgr.getMailbyOrg(users);
        assertEquals("a.d.c", s);

        System.out.println("\n" + s);
    }

    public void testIsMailFromName() throws Exception {
        System.out.println("\nTest isMailFromName: ");
        Vector vec_1_5 = new Vector();
        vec_1_5.addElement("G.A.T.A.V.E.K.H.L");
        vec_1_5.addElement("a");
        vec_1_5.addElement("b");
        vec_1_5.addElement("c");
        vec_1_5.addElement("d");

        JDBMRecordManager recman2 = new JDBMRecordManager();
        recman2.copyElementTo(vec_1_5);
        JDBMHash