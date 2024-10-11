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

    /**
     * Creates and returns test {@link OperatingSystem#hasLinux()} method.
     */
    @Test
    public void hasLinuxIsTest();
    
    /**
     * Creates and returns test {@link OperatingSystem#getUUID()} method.
     */
    @Test
    public void getUUIDIsTest();
    
    /**
     * Creates and returns test {@link OperatingSystem#getUUIDByPath(String)}.
     */
    @Test
    public void getUUIDByPathIsTest();
    
    /**
     * Creates and returns test {@link OperatingSystem#getHomePath()}.
     */
    @Test
    public void getHomePathIsTest();
    
    /**
       * Creates and returns test test {@link OperatingSystem#openFile(String)}.
      */
    @Test
    public void openFileIsTest() throws IOException;
    
    /**
       * Creates and returns test {@link OperatingSystem#openFile(File)}.
       */
    @Test
    public void openFileExistsIsTest() throws FileNotFoundException, IOException;
}
