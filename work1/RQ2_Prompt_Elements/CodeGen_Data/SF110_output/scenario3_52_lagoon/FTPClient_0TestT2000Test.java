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
@Test
		void storeFTPFile() throws Exception;
}

/**
 *
 * <strong>Test, </strong>it is possible to transfer files between FTP servers by setting'store'
 * option. See <strong>RFC-959</strong> for details.
 *
 * <strong>Notice:</strong> In order to work, your FTP server must provide your username
 * and password. This test class uses username and password from file 'testuser' in
 * <a href="http://ftp.jwdz.net/publish/ftp/ftp-users.asc">ftp-users.asc</a>.
 *
 * @version   $Revision: 1.0 $
 * @author    J. Dzrakowiak
 */
public class FTPClient_0 {
//  public class testFTPFile {

    public byte[] data = new byte[8192];
//    public String testData = "Please provide a password for the user.\n";
    public File testData;
    public String testDataPath = "/home/jdz/data/testUser";
    
    @Before
    public void setUp() throws Exception{
        testDataPath = System.getProperty("user.dir") + File.separator +"data" +
            File.separator +"testUser";
        File test = new File(testDataPath);
        test.mkdir();
        test = new File(testDataPath);
    }

    @After
    public void tearDown() throws Exception{
        // do not set the username & password in system properties
        System.clearProperty("user.name");
        System.clearProperty("user.dir");
    }

    /**
     * Tests'store' option
     *
     * @version   $Revision: 1.1 $   $Date: 2005/04/11 05:25:34 $
     * @author    J. Dzrakowiak
     */
    @Test
    public void testFTPStore() throws Exception{
        System.setProperty("FTPServer.BinaryMode", "YES");
        System.setProperty("user.name", "jdz");

        OutputStream out =  new FTPClient().store(testDataPath);
        byte[] bytes = new byte[8192];

        FileOutputStream file = new FileOutputStream(testData);
        out.write(bytes, 0, bytes.length);
        out.close();

        file.close();

        assertNotNull("FTPFile object was not created", (File) testDataPath);
        FileInputStream fileIn = new FileInputStream(testData);
        assertNotNull("FTPFile object was not created", (File) testDataPath);
        FileInputStream fileIn2 = new FileInputStream(testData);
        assertNotNull("FTPFile object was not created", (File) testDataPath);
        FileInputStream fileIn3 = new FileInputStream(testData);
        assertNotNull("FTPFile object was not created", (File) testDataPath);
        assertTrue("Data is not received", bytes.length > 1);
        assertEquals("Data not received", bytes[0], (byte) 'A');
        assertEquals("Data not received", bytes[1], (byte) 'S');
        assertEquals("Data not received", bytes[2], (byte) 0);
        assertEquals("Data not received", bytes[3], (byte) 0);
        assertEquals("Data not received", bytes[4], (byte) 0);
        assertEquals("Data not received", bytes[5], (byte) 0);
        assertEquals("Data not received", bytes[6], (byte) 0);
        assertEquals("Data not received", bytes[7], (byte) 0);
        fileIn.close();
        fileIn2.close();
        fileIn3.close();

    }
}
