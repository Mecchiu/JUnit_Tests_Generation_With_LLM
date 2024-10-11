// OperatingSystem_0Test.java
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
* It contains one unit test case for the {@link OperatingSystem#isLinux()} method.
*/
class OperatingSystem_0Test {
		private static OperatingSystem instanceToClean() throws IOException {
			Log.message("Getting initial test parameters for OperatingSystem_0Test");
			Log.message("The program will create a temporary folder to store your home data");
			Log.message("with the default value for 'operatingSystem'");
			Log.message("for the first time by default.");
			Log.message("You can do just following steps just as you can :");
			Log.message("1) set up operating system");
			// 1.1 creating the base folder that will contain home data, home data, home data and the user properties folder
			String dirName = System.getProperty("user.home");
			int i = dirName.lastIndexOf("/");
			if (i >= 0) {
				Log.message("There exists a temporary folder '" + dirName + "' with the name " + i + ".");
				Log.message("You should delete it manually, this folder will be erased ");
				Log.addLogMessage("on the next run of OperatingSystem_0Test");
			}
			Log.message("2) you have to use the first folder with the name " + "home data (i.e. /data) or the name Home (" + System.getProperty("user.home") + ")");
			Log.message("3.1: set operating system");
			Log.message("3.2: set the value of operatingSystem");
			Log.message("3.3: use the operatingSystem with which you would want to setup your home data. You should set its value");
}
}