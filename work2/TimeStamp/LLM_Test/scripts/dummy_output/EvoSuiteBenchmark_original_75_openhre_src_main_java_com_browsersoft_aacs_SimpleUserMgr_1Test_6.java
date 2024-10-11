// SimpleUserMgr_1Test.java
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
* It contains one unit test case for the {@link SimpleUserMgr#getNamesbyOrg(String)} method.
*/
class SimpleUserMgr_1Test {
		
    @jdbm.TransactionResource
    Vector<Vector<String>> testDataVect = new Vector<>();
    private String[][] testData;

    private static void readTest(String dataFile) throws IOException {
        String lines = null;
        
        Vector<Vector<String>> allCols = new Vector<>();

		// Read all test file
        Properties s = new Properties();
        s.load(new StringReader(dataFile));
        String[][] testDataFile = s.getProperty("TestData").split(",");
        
		// Iterate through the test data and convert it into vectors.
}
}