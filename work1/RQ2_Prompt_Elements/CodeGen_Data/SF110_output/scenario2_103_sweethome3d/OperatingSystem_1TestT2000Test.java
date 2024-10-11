// OperatingSystem_1Test.java
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
* It contains one unit test case for the {@link OperatingSystem#isWindows()} method.
*/
class OperatingSystem_1Test {
@Test
		public void isWindows() throws IOException {
			assertTrue(!isWindows());
		}
		
		@Test
		public void testWindowsDirectoryExist() {
			File dir = new File(FileManager.getWindowsHome ());
			File[] fileList = dir.listFiles(new FileFilter() {

				@Override
				public boolean accept(File file) {
					return file.canRead()
							&& file.getName().startsWith("E:")
							&&!file.getName().startsWith("H:/tmp/E:")
							&&!file.getName().startsWith("HKLM:/tmp/E:");
				}

			});

			if (fileList!= null && fileList.length!= 0) {
				assertTrue(fileList.length == 1);
				assertEquals("E:", fileList[0].getName());
			}
		}
		
		/**
		* Creates a timer that executes once after <code>delay</code> ms.
		* @param delay time in milis (0 = no delay)
		*/
		private static class TimerListener implements Timer.Callback {

			public void run() {
				Runnable test = new Runnable() {
					int count = 0;

					@Override
					public void run() {
						count++;
						if (count % 8 == 0) {
							System.out.println("SUCC");
						}
					}

					int getCount(){ return count;}
				};

				new Timer().schedule(new TimerTask() {
					@Override
					public void run() {
						System.out.println("Run");
					}
				}, 1000);
			}
		}
		
		@Test
		public void testTimerExistsForSingleFile() throws Exception {
			Home home = new Home();

			File currentPath = new File(FileManager.getWindowsHome ());
			String path = currentPath.getName();
			File targetFile = new File(FileManager.getWindowsHome ().getParent (), "E:" + path);

			FileManager.createFile(home, "E:/tmp/E:3", targetFile.getName());

			assertTrue(new File(targetFile.getName() + new File(FileManager.getWindowsHome ()).getName()).exists());
		}
		
		@Test
		public void testTimerExistsForMultiFiles() throws Exception {
			Home home = new Home();
			File currentPath = new File(FileManager.getWindowsHome ());
			for (int i = 0; i< 4; i++) {
				File targetFile = new File(FileManager.getWindowsHome ().getParent (), "E:" + i * 20 + ":3");

				FileManager.createFile(home, i + "" + new File(FileManager.getWindowsHome ()).getName(), targetFile.getName());
			}
			
			assertTrue(new File(FileManager.getWindowsHome ().getParent () + new File(FileManager.getWindowsHome ()).getName()).exists());
		}
	
		@Test
		public void testTimerExistsForLocalFile() throws Exception {
			Home home = new Home();
			File currentPath = new File(System.getProperty("user.home"));

			FileManager.createLocalFile(new File(currentPath, ".user").getName(), home);

			assertTrue(new File(FileManager.getWindowsHome ().getParent (), ".user").exists());
		}
		
		@Test
		public void testNoHomeForOneFile() throws Exception {
			FileManager.createFile(new Home());

			assertTrue(new File(FileManager.getWindowsHome ().getParent ()).exists());
		}
		
		/**
		 * Creates a new home directory for current operating system and waits for it being created.
		 * @throws IOException
		 */
		@Test
		public void testCreateNewHomeDirectory() throws IOException {
			File home = new File(FileManager.getWindowsHome ());
			home.mkdir();

			FileManager.createFile(new Home());
		}
		
		/**
		 * Creates a home for current operating system and waits for it being created.
		 * @throws IOException
		 */
		@Test
		public void testCreateNewHomeDirectoryWithLocalFile() throws IOException {
			File file = new File(FileManager.getWindowsHome ().getParent () + new File(FileManager.getWindowsHome ()).getName(), "E:/tmp/E:3");
			FileManager.createLocalFile(new File(file.getName() + new File(file.getParent()).getName()).getName(), new Home());
		}
		
		/**
		 * Creates a home for current operating system.
		 * @throws IOException
		 */
		@Test
		public void testCreateNewHome() throws IOException {
			File home = new File(FileManager.getWindowsHome ());
			FileManager.createFile(new Home());
		}
		
		@Test(expected = UnsatisfiedLinkError.class)
		public void createLocalFileToUnsatisfiedLinkError() {
			FileManager.createFile(new Home(), FileManager.getWindowsHome ());
		}
	}

	/**
	 * Java Security checker for current Operating System.
	 *
	 * @throws AccessControlException
	 */
	private static class SecurityLoader extends ResourceBundle.Control {
		public Properties load() throws IOException {
			Properties u = new Properties();
			u.load(ClassLoader.getSystemResourceAsStream("com/eteks/sweethome3d/tools/SecurityLoader.properties"));
			return u;
		}
		@Override
		public void refresh() {
			Properties sb = new Properties();
			Properties b = new Properties();

			b.put("java.security.credentials", "true -false");
			sb.put("java.security.auth.useCredentials", b);

			Properties sb = new Properties();
			sbc.clear();
			sbc.put("java.security.credentials", b);
			sb.put("java.security.auth.useSystemProperties", sb);
			sb.put("java.security.policy", "default-policy.xml");
		}
	}
		
}