// OperatingSystem_3Test.java
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
* It contains one unit test case for the {@link OperatingSystem#isMacOSXLeopardOrSuperior()} method.
*/
class OperatingSystem_3Test {
		/**
		 Returns <code>true</code> if current operating is the current user's domain.
		 * @return <code>true</code> if current operating is the current user's domain, <code>false</code> otherwise.
		 */
		boolean isMacOSXLeopardOrSuperior(){
			return System.getProperty("os.name").startsWith("Mac OS X");
		}
		private static class TestTask extends TimerTask {

			private final UUID id;

			private Home home;

			private boolean isShutdownNeeded;
			private FileManager manager;
			private File file;

			TestTask(){
				isShutdownNeeded   = false;
				home                = Home.USER;
				manager             = FileManager.getFileManager();

				id= UUID.randomUUID();
			}

			@Override
			public void run(){
				try{
					File file = manager.openFile((short)0);
					//file.delete();
					home = Home.getHome(manager, file, id);
					if(home==Home.PRIMARY) {
						System.out.println("Running test for primary user folder");

						home = Home.getHome((short)-2,manager);
					}
					else {
						System.out.println("Running test for secondary user folder");

						home = Home.getHome((short)2,manager);
					}


					file = File.createTempFile("sWEINTHOME3SD", ".sqlite3", new File("/tmp/sWEINTHOME3SD"));
					file.deleteOnExit();
					
					file = manager.openFile(0);
					home = Home.getHome(manager, file, id);
					if( home==Home.PRIMARY ) {
						System.out.println("Running test for primary user folder");

						home = Home.getHome(manager, file, id);
					}
					else {
						System.out.println("Running test for secondary user folder");

						home = Home.getHome(manager, file, id);
					}
				}
				catch(IOException e){
					throw new RuntimeException("Cannot initialize file manager.");
				}
				catch(Throwable n){
					n.printStackTrace();
					System.exit(1);
					file = null;
				}
			}}
		}
	private static class TestTask2 extends TestTask {

		@Override 
		public void run(){
			home = Home.getHome(manager, file, id);
		}
	}
	private static class TestTask3 extends TestTask{

		@SuppressWarnings("unused")
		private long count = 0;

		@Override
		public void run(){
			UUID id = UUID.randomUUID();
			int value = id.getMostSignificantBits();
			System.out.println("This is a test with id: " + value + ". The count of files created is: " + count);
			count++;
		}
}