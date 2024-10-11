// QSAdminAPITest.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminAPI}.
* It contains one unit test case for the {@link QSAdminAPI#logon()} method.
*/
class QSAdminAPITest {
		final Logger logger  = Logger.getAnonymousLogger();

		final String server = "10.4.60.26";
		
    static final Logger logger = Logger.getLogger("QSAdmin");
    
    /** Create and register qsadmin objects */
    private QSAdminA api = null;
    
    /** Create a QSAdmin server using {@link #server} as its {@link URL} and the same for both methods */
    static QSAdministatorAPI api = new QSAdministatorAPI(server, 20000);

    /**
     * Creates the test classes and registers them
     * @param method the test class name.
     * @throws IOException thrown when QSAdmin cannot be connected to the remote Qsadmin server.
     */    
    private void register(final String method) throws IOException {
		// Get a new instance of {@link Class}
		final Class clazz = Class.forName(method);
		
		// Check if it is a class using QSAdmin with QSAdmin specific server.
		{
			try {
				final Field qsAdminField = 
					clazz.getDeclaredField("api");
				
				final Field typeField = qsAdminField.getType();
				if(typeField!= null) {
					// Set the target field value
					if(typeField.isEnum()) {
						// Get name of the field from enum
						final int enumValue = typeField.getInt(null);
						final String name = enumValue == 0? clazz.getName() : "";
						
						// Create a new instance of QSAdministator
						final QSAdministatorAPI a = (QSAdministatorAPI)
							clazz.getDeclaredField(typeField.getName()).newInstance(new Object[] { null });
						
						// Register the QSAdmin API.
						api = a;
					} else {
						// Create a new instance of QSAdmin
						final QSAdministatorAPI a = (QSAdministatorAPI) 
							clazz.getDeclaredMethod(typeField.getName(), 
									(Class[]) null).newInstance(new Object[] { new Object[0] });

						// Register the QSAdmin server.
						if(logger.isLoggable(Level.FINE)) {
							api.addServer(new Server(a));
							logger.log(Level.FINE, "QSAdmin registered");
						}
					}
				} else {
					throw new IllegalAccessException("Enclosing Class is not a subclass of QSAdmin class");
				}
				
			} catch (Throwable ex) {
				// Do nothing
			}
		}
    }    

    private String sendCommand(final String method) throws IOException {
		// Gets the object to which command is to be sent.
		final String serverAddr = server;
				
		// Create a command String from method name and command string.
		final String cmdString =  "cmd("  + method + "," + method + ")";
		
		// Creates the server command String using {@link QSAdminApi} and command string.
		final String serverCommand = api.sendCommand(
			new ServerRequest(serverAddr,
				QSAdminCommands.CMD_COMMAND_SERVER,
				cmdString
			)   );
					
        // Create a QSAdmin API request object.
		QSAdminApiCommandResponse qsAdminCommandResponse = api.sendCommand(
				new QSAdminCommands.CommandRequest(QSAdminCommands.CMD_COMMAND_SERVER, 
				serverCommand));
		
		// Creates a QSAdmin response from {@link QSAdminCommands} object.
		return qsAdminCommandResponse.getAsString();
	}
		
    @Test
    public void canNotConnectToQsadminServer() throws Exception {
        final int rtt = sendCommand("info server");
        assertEquals(401, rtt);
    }

    @Test
    public void canNotLogonToQsadmin() throws Exception {
        final boolean rtt = logon();
        assertEquals(200, rtt);
    }

}