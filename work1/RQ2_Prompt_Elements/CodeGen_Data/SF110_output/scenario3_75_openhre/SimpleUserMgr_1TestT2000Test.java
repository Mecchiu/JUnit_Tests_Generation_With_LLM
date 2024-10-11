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

	private static final JDBMEnumeration jdbmEnum = new JDBMEnumeration();


    /**
     * Get all the names by the organization name.
     */
    @Test
    public void testGetNamesbyOrg() throws IOException {
        System.out.println("Get all users and groups by the organization name.");
        System.out.println("- testGetNamesbyOrg() -");
        String fileName = "/home/jdbm/aacs/SimpleUserMgr_1Test/SimpleUserMgr.properties";
        String urlStr = "/UserMgr.properties/SimpleUserMgr_1Test/SimpleUserMgr.properties";
		System.out.println("testGetNames by org " + urlStr);
		URL url = Thread.currentThread().getContextClassLoader().getResource( urlStr );
		String nameOfOrg = url.getPath().substring( 15, urlStr.length());
		StringBuffer sb = new StringBuffer( String.valueOf( "SystemUserMgr=SimpleUserMgr;UserMgr=SimpleUserMgr"))
			.append( "; " )
			.append( "UserMGR.properties " + fileName
			);

		//System.out.println("sb, nameOfOrg, org");
		String org = new String[] { nameOfOrg, new String[] {"SimpleUserMgr", "SimpleUserMgr"}};
		JDBMHashtable jdbm;
		// Get jdbm manager and map the org name to hash table. The entry is
		// associated to that org by the name of this jdbm manager.
		jdbm = jdbmEnum.getJdbmManager(urlStr);
		String orgName = "org";
		String orgname = "SimpleUserMgr";

		Vector<String> orgVector = new Vector<String>();
		Vector<String> orgVectorMapper = new Vector<String>();
		Vector<String> orgNameVector = new Vector<String>();
		Vector<String> jdbmNameVector = new Vector<String>();

		Vector<HashSet<String>> usersAndGroups = new Vector<HashSet<String>>();
		Vector<HashSet<HashSet<String>>> usersAndGroupsMapper = new Vector<HashSet<HashSet<String>>>();
		org = new String[] { nameOfOrg, org};								// add the org to the org table
		Vector<String> users = new Vector<String>();
		Vector<String> groups = null;
		Vector<String> groupsMapper = null;
		FileReader frr = new FileReader(fileName);
		readUsersGroups (frr, org);
		readUsersGroups (frr, orgName);

		Vector<HashSet<String>> usersAndGroups = new Vector<HashSet<String>>();
		Vector<HashSet<HashSet<String>>> usersAndGroupsMapper = new Vector<HashSet<HashSet<String>>>();
		Vector<HashSet<HashSet<String>>> usersAndGroupsMapper2 = new Vector<HashSet<HashSet<String>>>();
		Vector<HashSet<String>> org2users = new Vector<HashSet<String>>();
		Vector<HashSet<HashSet<String>>> org2groups = new Vector<HashSet<HashSet<String>>>();

		Vector<HashSet<String>> result = getNamesbyOrg(org);

		/*
		 * Test jdbm manager.
		 */
		System.out.println("[JDBM:JDBM_Manager=SimpleUserMgr.getJdbmManager];JDBM_Manager.getAll: " + jdbm.getAllKeys());
		org = new String[] {"OrgName"};

		Vector<String> jdbmManager = jdbm.getAllKeys();
		System.out.println(" - [JDBM:JDBM_Manager=SimpleUserMgr.getJdbmManager];jdbmManager.size(): " + jdbmManager.size());
		for (String jdbmManagerKey:jdbmManager) {
			System.out.println("jdbmManagerKey: " + jdbmManagerKey);
			if (org.length == 0) {
				org = new String[] {"OrgName"};
			}
			System.out.println("org:["+(org.length==0?"1":"0")+"]: " + org[org.length-1]);

			System.out.println("jdbmManager.getKey: " + jdbmManagerKey);
            JDBMRecordManager.getRecordManager(jdbmManagerKey).lookup(jdbmManagerKey, jdbmEnum);
			JDBMRecordManager.getRecordManager(jdbmManagerKey).flushAll();
            if (jdbm == null) {

                try {
                    jdbm = jdbmEnum.getRecordManager(jdbmManagerKey);
                    System.out.println("jdbm: "
                            + jdbm.getMapName());
                }
                    catch (IOException e) {
                        System.out.println("Cannot retrieve the jdbm manager");
                    }
            }
            else {
                System.out.println("jdbm: "
                        + jdbm.getMapName());
            }

            System.out.println("jdbmEnum: " +jdbmEnum.getEnumerationName(jdbmManagerKey));
            System.out.println("jdbmEnum: " + jdbmEnum.getEnumTypeName(jdbmManagerKey));
            System.out.println("jdbm: "
                    + jdbmManagerKey);
            System.out.println("org: ["+(org.length==0?"1":"0")+"]: " + org[org.length-1]);

            System.out.println("jdbmManager: " + jdbmManager[jdbmManagerKey]);
            System.out.println("jdbmManager: " + jdbmManager[jdbmManagerKey].toString());
            org = new String[] {"OrgName"};
			System.out.println("[JDBM:JDBM_Manager.isMapper]: " + (jdbmManager[jdbmManagerKey].equals("org=orgname")));

						
			if (org.length == 0) {
				org = new String[] {"OrgName"};
			}

			if (org.length == 2) {
				Vector<String> orgVector = new Vector<String>();
				JDBMEnumeration.getAllRecords(jdbmManagerKey);
			}

			else {
				Vector<String>