// FTPClient_2Test.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains one unit test case for the {@link FTPClient#append(String)} method.
*/
class FTPClient_2Test {
		static final String path = "/tmp";

        /** Tests {@link #append(String)} method with a directory (in which case {@link #path}
        is always / and {@link #append(String)} always appends to it).
        */
        @Test
        public void emptyPath() throws Exception {
            String[] dirs = path.split("/");
            assertArrayEquals(new String[] { path }, dirs);
            String[] names = path.split("/");
            assertArrayEquals(new String[] { "/" }, names);

        }

        /** Tests {@link #append(String)} method with a directory without first '/'.
         * It will create path with the last '/' added and then append path.
         */
        @Test
        public void defaultPath() throws Exception {
            String[] dirs = path.split("/");
            assertArrayEquals(new String[] { path, "/" }, dirs);
            String[] names = path.split("/");
            assertArrayEquals(new String[] { "/", path }, names);

        }

        @Test
        public void directory() throws Exception {
            String[] dirs = path.split("/");
            assertArrayEquals(new String[] { path, "/" }, dirs);

            String[] names = path.split("/");
            assertArrayEquals(new String[] { path, "/" }, names);
        }

        @Test
        public void nullDir() throws Exception {
            String[] dirs = path.split("/");
            assertArrayEquals(new String[] { "/" }, dirs);
            assertEquals(false, new FTPClient().append(null).isDirectory());
            assertArrayEquals(new String[] { "/" }, dirs);
        }

        @Test
        public void emptyDir() throws Exception {
            String[] dirs = path.split("/");
            assertArrayEquals(new String[] { path }, dirs);
            assertEquals(false, new FTPClient().append(dirs[0]).isDirectory());
            assertArrayEquals(new String[] { path }, dirs);
        }

        @Test
        public void emptyDir2() throws Exception {
            String[] dirs = new String[] {};
            assertEquals(false, new FTPClient().append(dirs[0]).isDirectory());
        }

        @Test
        public void directoryOnlyLast() throws Exception {
            String[] dirs = path.split("/");
            assertArrayEquals(new String[] { path, "/" }, dirs);
            String[] names = path.split("/");
            assertArrayEquals(new String[] { "/", path }, names);
        }
}