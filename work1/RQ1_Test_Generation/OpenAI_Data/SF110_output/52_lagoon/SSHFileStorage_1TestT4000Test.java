// SSHFileStorage_1Test.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import java.net.MalformedURLException;
import nu.staldal.lagoon.core.FileStorage;
import nu.staldal.lagoon.core.OutputHandler;
import nu.staldal.lagoon.core.RemoteFileStorage;
import nu.staldal.lagoon.core.LagoonContext;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SSHFileStorage}.
* It contains ten unit test cases for the {@link SSHFileStorage#createFile(String)} method.
*/
class SSHFileStorage_1Test {

		@Test
		void testCase1() throws MalformedURLException, IOException {
				SSHFileStorage sshFileStorage0 = new SSHFileStorage();
				sshFileStorage0.open("ssh://user@host:80/path/", (LagoonContext) null, "");
				OutputHandler outputHandler0 = sshFileStorage0.createFile("");
				outputHandler0.commit();
				sshFileStorage0.close();
		}
		
		@Test
		void testCase2() throws MalformedURLException, IOException {
				SSHFileStorage sshFileStorage0 = new SSHFileStorage();
				sshFileStorage0.open("ssh://user@host:80/path/", (LagoonContext) null, "");
				OutputHandler outputHandler0 = sshFileStorage0.createFile("");
				outputHandler0.discard();
				sshFileStorage0.close();
		}
		
		@Test
		void testCase3() throws MalformedURLException, IOException {
				SSHFileStorage sshFileStorage0 = new SSHFileStorage();
				sshFileStorage0.open("ssh://user@host:80/path/", (LagoonContext) null, "");
				OutputHandler outputHandler0 = sshFileStorage0.createFile("");
				outputHandler0.commit();
				sshFileStorage0.close();
		}
		
		@Test
		void testCase4() throws MalformedURLException, IOException {
				SSHFileStorage sshFileStorage0 = new SSHFileStorage();
				sshFileStorage0.open("ssh://user@host:80/path/", (LagoonContext) null, "");
				OutputHandler outputHandler0 = sshFileStorage0.createFile("");
				outputHandler0.discard();
				sshFileStorage0.close();
		}
		
		@Test
		void testCase5() throws MalformedURLException, IOException {
				SSHFileStorage sshFileStorage0 = new SSHFileStorage();
				sshFileStorage0.open("ssh://user@host:80/path/", (LagoonContext) null, "");
				OutputHandler outputHandler0 = sshFileStorage0.createFile("");
				outputHandler0.commit();
				sshFileStorage0.close();
		}
		
		@Test
		void testCase6() throws MalformedURLException, IOException {
				SSHFileStorage sshFileStorage0 = new SSHFileStorage();
				sshFileStorage0.open("ssh://user@host:80/path/", (LagoonContext) null, "");
				OutputHandler outputHandler0 = sshFileStorage0.createFile("");
				outputHandler0.discard();
				sshFileStorage0.close();
		}
		
		@Test
		void testCase7() throws MalformedURLException, IOException {
				SSHFileStorage sshFileStorage0 = new SSHFileStorage();
				sshFileStorage0.open("ssh://user@host:80/path/", (LagoonContext) null, "");
				OutputHandler outputHandler0 = sshFileStorage0.createFile("");
				outputHandler0.commit();
				sshFileStorage0.close();
		}
		
		@Test
		void testCase8() throws MalformedURLException, IOException {
				SSHFileStorage sshFileStorage0 = new SSHFileStorage();
				sshFileStorage0.open("ssh://user@host:80/path/", (LagoonContext) null, "");
				OutputHandler outputHandler0 = sshFileStorage0.createFile("");
				outputHandler0.discard();
				sshFileStorage0.close();
		}
		
		@Test
		void testCase9() throws MalformedURLException, IOException {
				SSHFileStorage sshFileStorage0 = new SSHFileStorage();
				sshFileStorage0.open("ssh://user@host:80/path/", (LagoonContext) null, "");
				OutputHandler outputHandler0 = sshFileStorage0.createFile("");
				outputHandler0.commit();
				sshFileStorage0.close();
		}
		
		@Test
		void testCase10() throws MalformedURLException, IOException {
				SSHFileStorage sshFileStorage0 = new SSHFileStorage();
				sshFileStorage0.open("ssh://user@host:80/path/", (LagoonContext) null, "");
				OutputHandler outputHandler0 = sshFileStorage0.createFile("");
				outputHandler0.discard();
				sshFileStorage0.close();
		}
}