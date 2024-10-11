// StopServerTest.java
package server;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import messages.Message;
import messages.global.StopServerMsg;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StopServer}.
* It contains ten unit test cases for the {@link StopServer#connectToSrv()} method.
*/
class StopServerTest {

	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv2() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv3() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv4() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv5() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv6() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv7() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv8() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv9() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv10() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
}

// StopServer.java
package server;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import messages.Message;
import messages.global.StopServerMsg;

/**
 * Sends a Message to the Server, that he should closed
 *
 * @author Bj�rn
 */
public class StopServer {

    private ObjectOutputStream out;

    private Socket server;

    private String serverName = "193.196.141.182";

    private int serverPort = 6666;

    /**
     * sends a message
     *
     * @param msg
     */
    public void sendMsg(Message msg) {
        try {
            out.writeObject(msg);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Connect to the Server
     */
    public boolean connectToSrv() {
        try {
            server = new Socket(serverName, serverPort);
            out = new ObjectOutputStream(server.getOutputStream());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Connect to the server, and send the message
     *
     * @param stop
     */
    public void callingStopServer(StopServer stop) {
        if (stop.connectToSrv()) {
            stop.sendMsg(new StopServerMsg());
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        StopServer stop = new StopServer();
        stop.callingStopServer(stop);
    }
}

// StopServerTest.java
package server;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import messages.Message;
import messages.global.StopServerMsg;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StopServer}.
* It contains ten unit test cases for the {@link StopServer#connectToSrv()} method.
*/
class StopServerTest {
		
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv2() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv3() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv4() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv5() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv6() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv7() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv8() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv9() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv10() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
}

// StopServer.java
package server;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import messages.Message;
import messages.global.StopServerMsg;

/**
 * Sends a Message to the Server, that he should closed
 *
 * @author Bj�rn
 */
public class StopServer {

    private ObjectOutputStream out;

    private Socket server;

    private String serverName = "193.196.141.182";

    private int serverPort = 6666;

    /**
     * sends a message
     *
     * @param msg
     */
    public void sendMsg(Message msg) {
        try {
            out.writeObject(msg);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Connect to the Server
     */
    public boolean connectToSrv() {
        try {
            server = new Socket(serverName, serverPort);
            out = new ObjectOutputStream(server.getOutputStream());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Connect to the server, and send the message
     *
     * @param stop
     */
    public void callingStopServer(StopServer stop) {
        if (stop.connectToSrv()) {
            stop.sendMsg(new StopServerMsg());
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        StopServer stop = new StopServer();
        stop.callingStopServer(stop);
    }
}

// StopServerTest.java
package server;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import messages.Message;
import messages.global.StopServerMsg;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StopServer}.
* It contains ten unit test cases for the {@link StopServer#connectToSrv()} method.
*/
class StopServerTest {
		
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv2() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv3() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv4() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv5() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv6() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv7() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv8() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv9() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
	
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * It tests if the connection to the server is established.
	 */
	@Test
	void testConnectToSrv10() {
		StopServer stop = new StopServer();
		assertTrue(stop.connectToSrv());
	}
}

// StopServer.java
package server;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import messages.Message;
import messages.global.StopServerMsg;

/**
 * Sends a Message to the Server, that he should closed
 *
 * @author Bj�rn
 */
public class StopServer {

    private ObjectOutputStream out;

    private Socket server;

    private String serverName = "193.196.141.182";

    private int serverPort = 6666;

    /**
     * sends a message
     *
     * @param msg
     */
    public void sendMsg(Message msg) {
        try {
            out.writeObject(msg);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Connect to the Server
     */
    public boolean connectToSrv() {
        try {
            server = new Socket(serverName, serverPort);
            out = new ObjectOutputStream(server.getOutputStream());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Connect to the server, and send the message
     *
     * @param stop
     */
    public void callingStopServer(StopServer stop) {
        if (stop.connectToS