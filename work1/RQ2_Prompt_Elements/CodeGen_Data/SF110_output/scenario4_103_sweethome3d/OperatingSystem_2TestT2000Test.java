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
private static final String APPLICATION_SUB_FOLDER = "/Applications/Application/Application.app/Contents/Resources/Resources";
		private static final String TEMPORARY_SUB_FOLDER = "/temp/temp/";
		private static final String TEMPORARY_SESSION_SUB_FOLDER = "/Session0Tmp/session0tmp/";
		static {
			EDITOR_SUB_FOLDER = "/Users/jaredp/Documents/eteks/eteks";
			APPLICATION_SUB_FOLDER = "/Applications/Programs/eteks.app";
			TEMPORARY_SUB_FOLDER = "/temporary";
			TEMPORARY_SESSION_SUB_FOLDER = "/Session0temporary";
		}

		private static void createTemporaryFile(FileManager sm, String prefix, String suffix) throws IOException {
			String userHome;
			File temporaryFileSt = new File(TEMPORARY_SUB_FOLDER);
			if(temporaryFileSt==null || temporaryFileSt.exists()==false){
				temporaryFileSt = new File(FileManager.getPath("/").toString()+TEMPORARY_SUB_FOLDER);
				String tmpName = temporaryFileSt.getName().toLowerCase();
				String tmpPrefix = tmpName.substring(0, tmpName.indexOf("."));
				do {
					if(tmpPrefix.equals("eteks-3d")) break;
					tmpPrefix = tmpPrefix.substring(0, tmpPrefix.indexOf("-"));
				}while(temporaryFileSt.renameTo(new File(tmpPrefix+"temporary"))!=null);
			}
			// Create temporary folder if exists and allow to have more than 10 files in it
			if(temporaryFileSt.exists()){
				String folderName = temporaryFileSt.getName();
				String baseName = folderName.substring(0,folderName.indexOf(".")).toLowerCase();
				String dirName = baseName.substring(0,baseName.indexOf("-"));
				if(dirName.equals("eteks")){
					File newFolder = new File(temporaryFileSt.getParentFile().getAbsolutePath()+File.separator+prefix);
					if(newFolder!=null){
						FileManager.rename(newFolder.getPath(),"/temporary-temp"+(prefix.length()==0? "" :  File.separator)+temporaryFileSt.getName(),newFolder.getAbsolutePath()+File.separator+temporaryFileSt.getName()+suffix);
					}
				}
				// Create folder and allow to have more than 10 files in it
				FileManager.createFolder(temporaryFileSt.getParentFile().getAbsolutePath(),prefix,10);
			}
			userHome = FileManager.getPath("/").toString()+Application_SUB_FOLDER;
			FileManager.createFile(userHome+File.separator+prefix+suffix,null);

		}
		
		//@Test
		@Test
		public void testGetApplicationSupportFolder() throws IOException, MissingResourceException {
			FileManager sm = FileManager.getFolder("/Programs/eteks");
			String userHome = sm.getSystemProperty(System.getProperty("user.name").toLowerCase());
			boolean isMacOSX = OperatingSystem.getOS().toLowerCase().startsWith("mac os x");
			String applicationHome = (isMacOSX? "/Users/jaredp/Documents/eteks/eteks" : "Applications/Programs/Application.app");
			String userApplicationHome = (isMacOSX? (userHome.replaceFirst("/Applications/Application","/Applications/"+prefix+"app")) : "Applications/Application");
			assertTrue(userApplicationHome.endsWith(applicationHome));
	
		}
		
		@Test
		public void testCleanUpAfter() throws IOException, InterruptedException, AccessControlException {
			FileManager sm = FileManager.getFolder("/");
			FileManager sm1 = sm.delete(FileManager.RECOVER_MADE_READER, false);
			FileManager sm2 = sm3.delete(FileManager.RECOVER_MADE_READER, true);
			FileManager.cleanUpAfter(sm);
			FileManager.cleanUpAfter(sm1);
			FileManager.cleanUpAfter("Application/Library/Preferences",sm2);

		}
	
	}
	
	@Test
	public void testOS