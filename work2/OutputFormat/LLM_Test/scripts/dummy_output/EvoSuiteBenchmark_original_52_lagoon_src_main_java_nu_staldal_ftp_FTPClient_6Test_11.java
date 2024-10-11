// FTPClient_6Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#deleteFile(String)} method.
*/
class FTPClient_6Test {
		int deleteFileCount, deleteFileCountReceived;
    public static File directoryPath;

    /**
     * Delete a file
     * @throws FTPException if any FTP protocol error occurs
     * @throws IOException if any other IO error occurs 
     */
    public void tests_deleteFile() throws FTPException, IOException {
         // create dir
        File dir = getDataDir();
        if(dir!= null) {
            directoryPath = new File(dir.getCanonicalPath() + "/delete");
            if(!directoryPath.exists()) {
                directoryPath.mkdir();
                // create file
                String fileName = "deleteFile";
                OutputStream os = new FileOutputStream(directoryPath + "/" + fileName);
                os.write('2');
            }
            deleteFileCount = directoryPath.list().length;
        }
         
        deleteFile();
            /*
             * This will fail if the system doesn't set
             * the correct permissions.
             */
            FileInputStream fi = new FileInputStream("delete");
            InputStreamReader iren = new InputStreamReader(fi);
            BufferedReader fr = new BufferedReader(iren);
            String l = fr.readLine();
        deleteFileCountReceived = deleteFileCount;
            try {
             while(l!= null && l!= "1") {
                l = fr.readLine();
             }
            }
            finally {
                 try {
                     fi.close();
                 }
                     catch (Exception e) {
                     System.out.println(e.toString());
             }
            }
            assertEquals("Didn't delete file properly.", 1, deleteFileCount);
            assertEquals("Didn't delete file properly.", 1, deleteFileCountReceived);
    }

}