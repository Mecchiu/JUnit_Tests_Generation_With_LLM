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

	public static final boolean OPCK = Boolean.parseBoolean(System.getProperty( "TEST_OPCK", "false" ).trim());

//TODO: test not work in all configurations 
//TODO: test is not ready
//TODO: test should be run as a test when there's no test-resources.xml
//TODO: test will not be executed in production until it is configured as
//TODO: a test-environment

//TODO: test test is not run
//TODO: test test-environment has not been set for the operating system,
//TODO: test test run-time will not work with the test-environment

	private OperatingSystem osh;

//TODO: test not executed
//TODO: test should be run
	@Test
	public void testIsLinux() {
		assertFalse( isLinux() );
	}

//TODO: test is not executed
//TODO: test should be run
	@Test
	public void testExecuteCommand() {
		assertFalse( osh.executeCommand( "false" ) );
	}

//TODO: test executed correctly and not broken in a different test
//TODO: test must be invoked with specific test-environment
}

/**
* Provides all the testing files of Windows and Unix operating systems.
*/
class OperatingSystem_4Test extends OperatingSystem_0Test {

//TODO: test not executed because is not compiled in
//TODO: test not executed because is not executable
//TODO: test must be executed
}/** /TODO*/