// OperatingSystemTest.java
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
* It contains ten unit test cases for the {@link OperatingSystem#isLinux()} method.
*/
class OperatingSystemTest {

		/**
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
		* Test case 1 for method {@link OperatingSystem#isLinux()}.
