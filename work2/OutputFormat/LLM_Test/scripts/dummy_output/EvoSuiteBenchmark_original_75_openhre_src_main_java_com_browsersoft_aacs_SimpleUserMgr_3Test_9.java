// SimpleUserMgr_3Test.java
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
* It contains one unit test case for the {@link SimpleUserMgr#export()} method.
*/
class SimpleUserMgr_3Test {
		
    /** Test */
    private static void test(String propFileName) {
        SimpleUserMgr simpleUserMgr;
        Properties p;

        try {
            System.out.println("TESTING - Loading " + propFileName);
            p = new Properties();
            InputStream in = SimpleUserMgr_3Test.class.getClassLoader().getResourceAsStream(propFileName);

            // This is where you're going to store your test properties.
            p.load(in);

            // You can do a little more than test on System Properties.
            String propFilePath=p.getProperty("user.properties");

            // System.out.println("Got user.properties " + propFilePath);
            FileManager.instance().setUserProps(p);
            
            // Get the system's property-set file.
            try {
				JDBMRecordManager.load(new JDBMRecordManager());
			}catch (IOException e) {
				e.printStackTrace();
			}
                
            simpleUserMgr = new SimpleUserMgr();

            JDBMEnumeration.instance().addUserMgr(simpleUserMgr); // just added test system.

            String users = simpleUserMgr.export();

            System.out.println("users=" + users);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("ERROR - Class is not found or not loaded.");
            return;
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("ERROR - IOException.");
            return;
        }

    }

    @Test
    public void test() {
    
        test("SimpleUserMgr_3Test.properties");
	    
        //StringReader reader = new StringReader (""); // The test property file is a string reader on its own

        //reader.reset();

	        
        try {

        	    

	    String result="";
	    
	} catch (Exception e) {
	    System.out.println("ERROR - Invalid userMgr settings.");
	    
	    e.printStackTrace();
	    return;
	    }

        boolean ok = true;
        FileManager.instance().setUserProps(new Properties());
		Vector<java.io.File> files = FileManager.instance().getUsers(new String[] {"SimpleUser", 
		        "Coucou.txt", "Dinook.txt"}
		);

	    for (java.io.File f : files) {
		    try {
			    InputStream in = SimpleUser_3Test.class.getClassLoader().getResourceAsStream(f.getPath());

					Reader reader = new BufferedReader(new InputStreamReader(in));
					for (int i=0; i<20; i++) {
						ArrayList<String> users = new ArrayList<String>();
						while ((i>=0) && (users.size()<20)) {
							String line=new String(new char[0]).trim();
							String line2 = reader.readLine();
							if (line2!= null) {
								StringTokenizer st = new StringTokenizer(line2);
								if (st.hasMoreTokens()) {
									ArrayList<String> tokens = new ArrayList<String>();
									while (st.hasMoreTokens()) {
										tokens.add(st.nextToken());
									}
									String name = st.nextToken();
									System.out.println("Token : " + tokens.get(0));
									String passwd = st.nextToken();
									System.out.println("Password : " + passwd);
									Vector<String> users_2 = new Vector<String>();
									for (String u:users) {
										users_2.add(u+":"+passwd);
									}
									System.out.println("Checking...");
									System.out.println("======================================================");
									for (String u:users_2) {
										ok &= userExists(name,u);
										if (!ok) {
											break;
										}
									}
									System.out.println("OK!");
									System.out.println("************************************************************");
									System.out.println("Total users:"+new Vector(users_2).size());
									System.out.println("************************************************************");
									System.out.println("");
								}
							}
						}
					}				
          }catch(Exception e) {
                        e.printStackTrace();
                        ok = false;
          }
                  
          if (!ok) {					
                      ok = false;
                      System.out.println("Something went wrong...");
                      System.out.println(result);
                      System.exit(1);
                  	}
                         
		    } catch (Exception e) {
	        	e.printStackTrace();
		    }
                    
    System.out.println("Test result : " + ok);

return;
	}
}