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

	public static void testIsMacOSX() {
//--------------------------------------------------------------------------
		try {
			File file = new File("/Users/eteks.hpl", Home.USER_HOME);
			assertNotNull(file);
			assertTrue(file.exists());
			assertEquals("", file.getPath());
//--------------------------------------------------------------------------		
		
		} catch (IOException | AccessControlException | IllegalStateException | NullPointerException e) {
			fail("Fail at testIsMacOSX()." + e.getMessage());
		}
		
	}
	
	/*---------------------------------------------------------------------------------------------------
    *                                                                              *
    * This class is a unit test of OperatingSystem class                          *
    *                                                                              *
    * ---------------------------------------------------------------------------------------------------
    */

	// Private methods
	private static File findFile(String path) {
		if (File.separatorChar == '\\' || File.separatorChar == '/') {
			path = path.replace(File.separatorChar, '_');
		}
		return new File(path);
	}
	
	private static void checkFolder(File toCheck) {
		try {
			if (Home.FILE_PATTERN.matcher(toCheck.getPath()).matches()) {
				System.out.println("");
				String[] parts = toCheck.getPath().split("/");
				assertTrue(parts.length > 0);
				String path = toCheck.getPath().substring(0, toCheck.getPath().length() - parts[parts.length- 1].length());
				File fullPath = new File(path);
				assertTrue(fullPath.isDirectory());
				ArrayList<File> sub = new ArrayList<File>();
				ArrayList<File> dir = new ArrayList<File>();
				File[] listfiles = fullPath.listFiles();
				for (File file : listfiles) {
					// if File.separatorChar == '/' it's a folder
					if (file.getName().indexOf('.') == 4) {
						sub.add(file);
						dir.add(file);
					} else {
						// file is not part of folder
						// so, it must be part of a directory
						if(!file.isDirectory()) {
							sub.add(file);
							dir.add(file);
						}
					}
				}
				// check if folders to the end
				while (!dir.isEmpty()){
					int last = 0;
					while(last >= 0 &&!dir.get(last).isDirectory()){
						last++;
					}
					
					assertTrue(last < dir.size());
					for (int i = 0; i < last; i++) {
						assertTrue(!dir.get(i).isDirectory());
					}
					dir.subList(0, last).clear();
				}
				// check if files to the end
				while (!sub.isEmpty()){
					int last = 0;
					while(last >= 0 &&!sub.get(last).isDirectory()){
						last++;
					}
					if(!sub.get(last).isDirectory()){
						filesToCheck(sub.get(last));
					}
					sub.set(last, null);
					while (!sub.get(last).isDirectory()) {
						last++;
					}
				}
				// check if files to the end
				while (!dir.isEmpty()){
					int last = 0;
					while(last >= 0 &&!dir.get(last).isDirectory()){
						last++;
					}
					if(!dir.get(last).isDirectory()){
						filesToCheck(dir.get(last));
						dir.set(last, null);
					}
					dir.subList(0, last).clear();
				}
			}
		} catch (IOException | AccessControlException | RuntimeException e) {
			fail("Fail at testIsMacOSX().");
		}
	}
	
	private static void filesToCheck(File file) {
		try {
			String absolutePath = file.getAbsolutePath();
			//System.out.println(absolutePath);
			String name = file.getName();
			String[] splitName = name.split("\\.");
			String fileName = splitName[splitName.length -1];
			for (File toCheck1 : file.listFiles()) {
				String toCheck = splitName[splitName.length-1] + fileName + ".java";
				//System.out.println(toCheck);
				checkFolder(new File(absolutePath, toCheck));
			}
		} catch (IOException | RuntimeException | SecurityException | FileNotFoundException e) {
			fail("Fail at testIsMacOSX()." + e.getMessage());
		}
	}
	
	/*---------------------------------------------------------------------------------------------------
    *                                                                              *
    * This class is a unit test                                                       *
    *                                                                              *
    * ---------------------------------------------------------------------------------------------------
    */
	private static String UUIDGenerate() {
		byte[] uuid = new byte[16];
		static {
			ByteBuffer.fill(uuid, 0);
			for (int i = 0; i < 16; i++) {
				uuid[i] = (byte) (UUID.randomUUID().getLeastSignificantBits() & 0xFF);
			}
		}
		
		return org.junit.platform.util.StringFormatter.valueOf(
				"00000000-0000-0000-0000-00000000000".replace(".", "_"), //$NON-NLS-1$ //$NON-NLS-2$ 
				uuid);
	}
	
	/*---------------------------------------------------------------------------------------------------
    *                                                                              *
    * This class is used to generate UUID for new class when it is created   *
    * (generate() and newClass() methods), this class can be extended if it's needed    *
    * for another purpose.                                                         *
    *                                                                              *
    * ---------------------------------------------------------------------------------------------------
    */
	private static final class UUIDGeneratorTask extends TimerTask {
		
		private static final String ID = UUIDGenerate();

		@Override
		public void run() {
			try {
				System.out.println(ID + " UUID: " + UUIDGenerate());
			} catch (SecurityException | NoSuchAlgorithmException | NullPointerException e) {
				// If it doesn't exist then fail
			}
		}
	}
	
	private static Long lastTime = null;
	
	private static void execute(String action) {
		// The first action must be generating a UUID
		if(action.equals("generate")) {
			
			UUIDGeneratorTask task = new UUIDGeneratorTask();
			if (lastTime == null) {
				task.schedule