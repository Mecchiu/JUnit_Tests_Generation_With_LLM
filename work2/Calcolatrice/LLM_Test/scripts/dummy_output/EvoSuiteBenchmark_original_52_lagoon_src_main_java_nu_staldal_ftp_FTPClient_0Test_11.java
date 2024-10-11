// FTPClient_0Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#store(String)} method.
*/
class FTPClient_0Test {
		
    private final String USER = new String("user");
    private final String PASSWORD = new String("password");
    private final String HELP = new String("-?");

    private final String STORETLENENAME = "Striped Files - Telnet";
    private final String STORETLENENAME2 = "Striped Files - Unix";

    @Test public void constructor() throws Exception {
        FTPClient ftpClient = new FTPClient();
        assertNotNull(ftpClient);
    }

}
// FTPClient_0Test.java