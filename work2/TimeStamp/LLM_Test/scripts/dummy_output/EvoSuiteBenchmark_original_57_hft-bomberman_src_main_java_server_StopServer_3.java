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
* It contains one unit test case for the {@link StopServer#connectToSrv()} method.
*/
class StopServerTest {
		
    /**
     * Start the Server
     */
    @Test
    public void startServerTest() 
    {
        //Server does not listen any sockets, so we need to add it
        socket.listen(null);
        assertTrue(socket.isBound());
        server = socket.accept();
        
        //Connect to the Server
        connectToSrv();

        //check state of the Server
        assertTrue(server instanceof ServerChannel);
    }
    
    /**
     * Stop the server. 
     */
    private void stop() 
    {
        //Closes the socket
        server = null;
    }
        
    /**
     * @param args
     */
    public static void main(String[] args) {
		
		//Test for server start
		StopServerTest test = new StopServerTest();  
        try 
        {
            test.startServerTest();          
        } 
        catch (IOException e) 
        { //check exception on IOException
            e.printStackTrace();
        }
        
        //Stopping the Server
        test.stopServerTest();
        
        
	}
    
    
}