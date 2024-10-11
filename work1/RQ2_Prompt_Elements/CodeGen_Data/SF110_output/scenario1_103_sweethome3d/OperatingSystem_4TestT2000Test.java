// OperatingSystem_4Test.java
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
* It contains one unit test case for the {@link OperatingSystem#getDefaultApplicationFolder()} method.
*/
class OperatingSystem_4Test {
/**
		* Test method getDefaultApplicationFolder().
		* @throws IOException - if IO error occurs.
		* @throws MissingResourceException - if ResourceBundle object missing from default OS environment.
		*/
		@Test
		void getDefaultApplicationFolder() throws MissingResourceException, IOException {
				final File userAppFolder = new File(OperatingSystem_4Test.getDefaultApplicationFolder(), EDITOR_SUB_FOLDER + File.separator + APPLICATION_SUB_FOLDER);

				UUID uuid = UUID.randomUUID();
				FileWriter writer = new FileWriter(userAppFolder);
				writer.append(userAppFolder.getPath());
				writer.append(File.separator);
				String fileText = "I am a temporary file.";
				writer.append(fileText);
				writer.close();

				//Check if user can write to the default folder, and write some file into it.
				assertTrue("Write can't succeed", OperatingSystem_4Test.canWrite() && OperatingSystem_4Test.writeFileTo(userAppFolder,fileText));

				//Check if user can read from the default folder, and write some file into it.
				assertTrue("Read file cannot succeed", OperatingSystem_4Test.canRead() && OperatingSystem_4Test.writeFileTo(userAppFolder,fileText));

				//Check if user can read from the default folder, and write some file into it.
				assertTrue("Read file content cannot succeed", OperatingSystem_4Test.canRead() && OperatingSystem_4Test.writeFileTo(userAppFolder,new String(fileText.getBytes())));

				//Check if user can read from the default folder, and write some file into it.
				assertTrue("Read file content cannot succeed", OperatingSystem_4Test.canRead() && OperatingSystem_4Test.writeFileTo(userAppFolder,new String(fileText.getBytes())));

				//Try to write a content larger than the directory.
				//Try to write with a file larger than the directory.
				assertFalse("Write is unable to fail", OperatingSystem_4Test.canWrite());
				//Try to create the folder inside the application folder
				assertTrue("Folder must exists", osFolder());
				assertTrue("Write is unable to create the folder", osFolder()/EDITOR_SUB_FOLDER.equals(userAppFolder));

				//Try to create a file into the same directory
				assertFalse("File must not exist", osFile());
				writer = new FileWriter(osFile()/EDITOR_SUB_FOLDER + File.separator + APPLICATION_SUB_FOLDER);
				writer.append(getRandomSubset());

				assertTrue("Write can't return true", OperatingSystem_4Test.canWrite());

				//Try to write into the created file.
				assertFalse("File must exist", osFile());
				writer = new FileWriter(osFile());
				writer.append(getRandomSubset());

			}

			private File osFile() throws FileNotFoundException, SecurityException {
				try {
					return new File(OperatingSystem_4Test.USER_APPS_FOLDER + File.separator + OPERATING_SYSTEM_SUB_FOLDER + File.separator + UUID.randomUUID().toString() + ".txt");
				} catch (IOException ioe) {
					throw new SecurityException("Failed to create the file.", ioe);
				}
			}


			private File osFolder() throws FileNotFoundException {
				File targetDir = new File (OperatingSystem_4Test.USER_APPS_FOLDER + File.separator, OPERATING_SYSTEM_SUB_FOLDER);
				return (targetDir.exists() && targetDir.isDirectory())? targetDir : null;
			}

				private boolean osFolder() {
					return OperatingSystem_4Test.osFolder();
				}

				private boolean canWrite() {
				return OperatingSystem_4Test.osFolder();
				}

				private boolean canRead() {
				return OperatingSystem_4Test.osFolder();
				}

				private boolean canReadFile(File file) {
				return OperatingSystem_4Test.osFolder() && OperatingSystem_4Test.canRead(file);
				}

				private boolean canWrite(File file) {
				return OperatingSystem_4Test.osFolder() && OperatingSystem_4Test.canWrite(file);
				}

				private void writeFileTo(File file) throws IOException {
				FileWriter fw = new FileWriter(file);
				try {
					//Write content
					fw.append(getRandomSubset());
				} finally {
					try {
						fw.close();
					} catch (Exception e) {
						System.out.println("Exception occurred in writeFileContent()");
					}
				}
				}

				final File file;
				protected ResourceBundle bundle;

				public void writeFileContent(String content){
					try  {
						file = OperatingSystem_4Test.osFolder()/EDITOR_SUB_FOLDER + File.separator + APPLICATION_SUB_FOLDER + File.separator + UUID.randomUUID().toString() + "." + content;

						try(FileManager fm = FileManager.getInstance(OperatingSystem_4Test.USER_APPS_FOLDER + File.separator + "testdata")) {
							new File(file.getAbsolutePath()).createNewFile();
						}
					} catch (Exception e){
						System.out.println(e.toString());
						file = null;
					}
				}

					final String randomSubset = "randomSubset";
					protected String getRandomSubset(){
		        Timer timer = new Timer();
		   + "Timer :" + timer.toString();
		   + "FileName :" + (new File(file.getParentFile().getParentFile().getParentFile() + File.separator) + file.getName()).toString();
		   + "File : "  +file.getAbsolutePath();
		   + "FileSize : " + file.length();

		   try {
		        System.out.println("Write the FileName to the file: " + file.get