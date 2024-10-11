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
class Response implements Closeable {
			private final BufferedReader _reader = new BufferedReader(new InputStreamReader(
		    		store("1.2.3.4").getInputStream()));
			private final OutputStream _output = store("5.6.7.8.d.");
		    private volatile String _string;
		    private final StringBuffer _buffer = new StringBuffer();

		    Response(String s) {
		        try {
		            String[] temp = s.split("\\.");
		            _buffer.append(temp[0]);
		            _buffer.append('.');
		            for (int i=1; i<temp.length; i++) {
		                _buffer.append(temp[i]);
		                _buffer.append('/');
		            }
		            _content = _buffer.toString();
		        }
		        catch (Exception ex) {
		            throw new IllegalArgumentException("Exception in Response: " + s);
		        }
        		_string = this;
				return;
		    }

		    public String getString() {
					return _string;
		    }

		    public void close() {
					_content = null;
		    }

        };	

        /**
        * Create a new test client, and connect to some hosts.
        * No password is necessary.
        *
        * @param hosts hosts to connect to
        * @return a new FTPClient
        * @throws FTPException if some FTP protocol error occurs
        * @throws IOException if any other IO error occurs
        */
		public FTPClient connect(String hosts[]) throws ConnectionFailure, IOException {
		    FTPClient client = new FTPClient();
			for (int i=0; i<hosts.length; i++) {
				client.connect(hosts[i], 21, 3);
				Thread.sleep(50);
				client.login();
			}
			return client;
        }
}