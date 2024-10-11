// OperatingSystem_2Test.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OperatingSystem}.
* It contains one unit test case for the {@link OperatingSystem#isMacOSX()} method.
*/
class OperatingSystem_2Test {

	/** The {@link OperatingSystem}. */
	private OperatingSystem operatingSystem;
	
	/** File test case for {@link OperatingSystem#isMacOSX()}. */
	@Test
    public void isMacOSXFileTest() throws Exception {
			// Creating home
        final Home home = new Home();
        
        // Creates a temporary folder
        final File temporaryFolder = File.createTempFile("tempture_" + UUID.randomUUID().toString(), ".tmp");
        // Create a temporary file manager
        final FileManager fileManager = FileManager.getManager();
        
			// Calls createFile on a file manager
            fileManager.createFile(temporaryFolder);
			// Calls createFolder on a folder manager
            assertTrue("Not reachable", fileManager.isFile(temporaryFolder));
        
        // Creates all the files and folders and creates a resource bundle
        final ResourceBundle resourceBundle = ResourceBundle.getBundle("com.eteks.sweethome3d.tools.OperatingSystem");
        final File tempfolder = temporaryFolder;
    	final Home home = new Home();
    	
        executeFunction(new Runnable() {
			
			@Override
            public void run() {
                String operatorEnvironmentId = UUID.randomUUID().toString();	

				// Creates a system property for 'OperatingSystem'
				FileManager.setOperatingSystemProperty("OperatingSystem",  fileManager.getFileManager(temporaryFolder).getFile(temporaryFolder,"OperatingSystem").getAbsolutePath());

				// Creates a file
				try (FileWriter f = new FileWriter(tempfolder) ) {
					// Writes operator environment id to file
					f.write(String.format("%s,%s\n",operatorEnvironmentId, home.getId()));
					// Writes operator id to file
					f.write(String.format("%s,%s,%s,0,0,0,0,0,\"\"\n",operatorEnvironmentId, home.getId(),"id"));
					
				}
			}
		},
            "com.etheks.jtms.operatorEnvironments.OperatingSystem");
        
        // Creates the home folder
        executeFunction(new Runnable() {

            @Override
            public void run() {
                path = (new File("/Users/Sean/Desktop")).getAbsolutePath();
            }
        },
            "");
        // Asserts if the home folder is correctly created
        assertTrue("Home folder not created. See operator environments home folder", path.endsWith("operatingSystem"));
        
        home.setId("");
        
        // Creates a file manager for user
		executeFunction(new Runnable() {
			
			@Override
            public void run() {
                UUID userid = UUID.randomUUID();
                
				// Creates new file manager for each user
				try (FileManager fm = fileManager.createFileManager(new File(userid.toString()))) {
					// Writes a user id to the new file manager
					FileManager.setOperatingSystemProperty("OperatingSystem",  fileManager.getFileManager(temporaryFolder).getFile(temporaryFolder,"user").getAbsolutePath());
					
					// Write the path with the user id
					FM.addOperation(new UpdateResource(new File(fileManager.getFileManager(temporaryFolder).getFile(temporaryFolder,"user").getAbsolutePath()),userid));
					
				}
			}
		},
			"user.id.path");

        // Delete the folder
        executeFunction(new Runnable() {

            @Override
            public void run() {

                    FileManager.deleteFileManager(temporaryFolder);
                    
                    File file = new File(temporaryFolder,'user');
                    
                    System.out.println("deleting temp folder: "+ temparfile);
			        assertTrue("Not reachable", fileManager.isFile(temparfile));
            }
        },
            "delete.folder");

        // Asserts if the home folder is correctly deleted
        assertFalse("Home folder deleted. See operator environments home folder", path.endsWith("operatingSystem"));

        // Delete the user
        executeFunction(new Runnable() {

            @Override
            public void run() {

                    FileManager.deleteUser(temporaryFolder);
                    
                    File file = new File(temporaryFolder,'user');
                    
                    System.out.println("deleting temp folder: "+ tempfolder.toString());
			        assertTrue("Not reachable", fileManager.isFile(temparfile));
            }
        },
            "user.deleted");

        // Deletes all the resources by the user from file manager
        executeFunction(new Runnable() {

            @Override
            public void run() {
                    try {
                        // Deletes user
                        FileManager.deleteUser(temporaryFolder);
                        
                        // Deletes all the resources by the user from file manager
                        FileManager.deleteResources(tempauthFolder);
                    } catch (IOException e) {
                        // TODO: handle exception
                    }
            }
        },
            "file");
        
        executeFunction(new Runnable() {
     			
            @Override
            public void run() {
                    
                    FileManager.deleteReservationFolder(temparfolder);
              
            }
        },
            "reservationFolder");
        
    }
    
    //
    //  FUNCTION OVERRIDERS
    //
     
	private static void executeFunction(final Runnable fnc, final String identifier) {
		/*
		 * Runs the function in the next 10ms.
		 */
        Timer task = new Timer(10);
        
        task.schedule(new TimerTask() {

            @Override
            public void run() {
            
                fnc.run();    
            }
        }, 5000);

        System.out.println("Time after task: "+ threadSleep(1000));  
	}
    
    private static void executeFunction(final Runnable fnc, final String identifier, String identifier2) {
        
        Timer task = new Timer(null);
        TimerTask task2 = new TimerTask() {

            @Override
            public void run() {
            
                fnc.run();    
            }
        };
        
        task.schedule(task2, 5000);
        System.out.println("Time after task2: "+ threadSleep(1000)); 
	}
    
    
    private static void executeFunction(final Runnable fnc, final String identifier, String identifier2, String identifier3) {
        
        Timer task = new Timer(null);
        TimerTask task2 = new TimerTask() {

            @Override