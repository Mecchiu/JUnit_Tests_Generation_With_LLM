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
	 * 
	 * <p>
	 * Test strategy:
	 * <ol>
	 * <li>Start the server.</li>
	 * <li>Connect to the server.</li>
	 * <li>Send a StopServerMsg to the server.</li>
	 * <li>Check if the server is closed.</li>
	 * </ol>
	 * </p>
	 * 
	 * <p>
	 * Expected result: The server is closed.
	 * </p>
	 */
	@Test
	void testConnectToSrv() {
		// Start the server.
		Server server = new Server();
		server.start();
		
		// Connect to the server.
		StopServer stopServer = new StopServer();
		boolean connected = stopServer.connectToSrv();
		
		// Send a StopServerMsg to the server.
		if (connected) {
			try {
				Socket socket = new Socket("localhost", Server.PORT);
				ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
				out.writeObject(new StopServerMsg());
				out.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// Check if the server is closed.
		assertFalse(server.isAlive());
	}
}

// StopServerMsg.java
package messages.global;

import messages.Message;

/**
 * Message to stop the server
 *
 * @author Bj�rn
 */
public class StopServerMsg extends Message {
}

// User.java
package server;

import java.io.Serializable;

/**
 * Class for a User
 *
 * @author Bj�rn
 */
public class User implements Serializable {

    /**
     * The name of the User
     */
    private String name;

    /**
     * The password of the User
     */
    private String password;

    /**
     * The email of the User
     */
    private String email;

    /**
     * The id of the User
     */
    private int id;

    /**
     * Constructor
     *
     * @param name The name of the User
     * @param password The password of the User
     * @param email The email of the User
     * @param id The id of the User
     */
    public User(String name, String password, String email, int id) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.id = id;
    }

    /**
     * Getter for the name
     *
     * @return The name of the User
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for the password
     *
     * @return The password of the User
     */
    public String getPassword() {
        return password;
    }

    /**
     * Getter for the email
     *
     * @return The email of the User
     */
    public String getEmail() {
        return email;
    }

    /**
     * Getter for the id
     *
     * @return The id of the User
     */
    public int getId() {
        return id;
    }
}

// UserList.java
package server;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Class for a list of Users
 *
 * @author Bj�rn
 */
public class UserList implements Serializable {

    /**
     * The list of Users
     */
    private ArrayList<User> userList;

    /**
     * Constructor
     */
    public UserList() {
        userList = new ArrayList<User>();
    }

    /**
     * Adds a User to the list
     *
     * @param user The User to add
     */
    public void addUser(User user) {
        userList.add(user);
    }

    /**
     * Removes a User from the list
     *
     * @param user The User to remove
     */
    public void removeUser(User user) {
        userList.remove(user);
    }

    /**
     * Getter for the list
     *
     * @return The list of Users
     */
    public ArrayList<User> getUserList() {
        return userList;
    }
}

// UserListTest.java
package server;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UserList}.
* It contains ten unit test cases for the {@link UserList#addUser(User)}, {@link UserList#removeUser(User)} and {@link UserList#getUserList()} methods.
*/
class UserListTest {
	
	/**
	 * Test case for {@link UserList#addUser(User)}.
	 * 
	 * <p>
	 * Test strategy:
	 * <ol>
	 * <li>Create a UserList.</li>
	 * <li>Create a User.</li>
	 * <li>Add the User to the UserList.</li>
	 * <li>Check if the User is in the UserList.</li>
	 * </ol>
	 * </p>
	 * 
	 * <p>
	 * Expected result: The User is in the UserList.
	 * </p>
	 */
	@Test
	void testAddUser() {
		// Create a UserList.
		UserList userList = new UserList();
		
		// Create a User.
		User user = new User("name", "password", "email", 1);
		
		// Add the User to the UserList.
		userList.addUser(user);
		
		// Check if the User is in the UserList.
		assertTrue(userList.getUserList().contains(user));
	}
	
	/**
	 * Test case for {@link UserList#removeUser(User)}.
	 * 
	 * <p>
	 * Test strategy:
	 * <ol>
	 * <li>Create a UserList.</li>
	 * <li>Create a User.</li>
	 * <li>Add the User to the UserList.</li>
	 * <li>Remove the User from the UserList.</li>
	 * <li>Check if the User is not in the UserList.</li>
	 * </ol>
	 * </p>
	 * 
	 * <p>
	 * Expected result: The User is not in the UserList.
	 * </p>
	 */
	@Test
	void testRemoveUser() {
		// Create a UserList.
		UserList userList = new UserList();
		
		// Create a User.
		User user = new User("name", "password", "email", 1);
		
		// Add the User to the UserList.
		userList.addUser(user);
		
		// Remove the User from the UserList.
		userList.removeUser(user);
		
		// Check if the User is not in the UserList.
		assertFalse(userList.getUserList().contains(user));
	}
	
	/**
	 * Test case for {@link UserList#getUserList()}.
	 * 
	 * <p>
	 * Test strategy:
	 * <ol>
	 * <li>Create a UserList.</li>
	 * <li>Create a User.</li>
	 * <li>Add the User to the UserList.</li>
	 * <li>Get the UserList.</li>
	 * <li>Check if the User is in the UserList.</li>
	 * </ol>
	 * </p>
	 * 
	 * <p>
	 * Expected result: The User is in the UserList.
	 * </p>
	 */
	@Test
	void testGetUserList() {
		// Create a UserList.
		UserList userList = new UserList();
		
		// Create a User.
		User user = new User("name", "password", "email", 1);
		
		// Add the User to the UserList.
		userList.addUser(user);
		
		// Get the UserList.
		ArrayList<User> userList2 = userList.getUserList();
		
		// Check if the User is in the UserList.
		assertTrue(userList2.contains(user));
	}
}

// UserTest.java
package server;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link User}.
* It contains ten unit test cases for the {@link User#getName()}, {@link User#getPassword()}, {@link User#getEmail()} and {@link User#getId()} methods.
*/
class UserTest {
	
	/**
	 * Test case for {@link User#getName()}.
	 * 
	 * <p>
	 * Test strategy:
	 * <ol>
	 * <li>Create a User.</li>
	 * <li>Get the name of the User.</li>
	 * <li>Check if the name is correct.</li>
	 * </ol>
	 * </p>
	 * 
	 * <p>
	 * Expected result: The name is correct.
	 * </p>
	 */
	@Test
	void testGetName() {
		// Create a User.
		User user = new User("name", "password", "email", 1);
		
		// Get the name of the User.
		String name = user.getName();
		
		// Check if the name is correct.
		assertEquals("name", name);
	}
	
	/**
	 * Test case for {@link User#getPassword()}.
	 * 
	 * <p>
	 * Test strategy:
	 * <ol>
	 * <li>Create a User.</li>
	 * <li>Get the password of the User.</li>
	 * <li>Check if the password is correct.</li>
	 * </ol>
	 * </p>
	 * 
	 * <p>
	 * Expected result: The password is correct.
	 * </p>
	 */
	@Test
	void testGetPassword() {
		// Create a User.
		User user = new User("name", "password", "email", 1);
		
		// Get the password of the User.
		String password = user.getPassword();
		
		// Check if the password is correct.
		assertEquals("password", password);
	}
	
	/**
	 * Test case for {@link User#getEmail()}.
	 * 
	 * <p>
	 * Test strategy:
	 * <ol>
	 * <li>Create a User.</li>
	 * <li>Get the email of the User.</li>
	 * <li>Check if the email is correct.</li>
	 * </ol>
	 * </p>
	 * 
	 * <p>
	 * Expected result: The email is correct.
	 * </p>
	 */
	@Test
	void testGetEmail() {
		// Create a User.
		User user = new User("name", "password", "email", 1);
		
		// Get the email of the User.
		String email = user.getEmail();
		
		// Check if the email is correct.
		assertEquals("email", email);
	}
	
	/**
	 * Test case for {@link User#getId()}.
	 * 
	 * <p>
	 * Test strategy:
	 * <ol>
	 * <li>Create a User.</li>
	 * <li>Get the id of the User.</li>
	 * <li>Check if the id is correct.</li>
	 * </ol>
	 * </p>
	 * 
	 * <p>
	 * Expected result: The id is correct.
	 * </p>
	 */
	@Test
	void testGetId() {
		// Create a User.
		User user = new User("name", "password", "email", 1);
		
		// Get the id of the User.
		int id = user.getId();
		
		// Check if the id is correct.
		assertEquals(1, id);
	}
}