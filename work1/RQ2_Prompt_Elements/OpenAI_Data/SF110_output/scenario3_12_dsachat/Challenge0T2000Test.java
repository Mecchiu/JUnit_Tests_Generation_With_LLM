// ChallengeTest.java
package dsachat.share;

import java.io.Serializable;
import java.util.Vector;
import dsachat.share.hero.Hero;
import dsachat.share.hero.Talent;
import dsachat.share.hero.Weapon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Challenge}.
* It contains ten unit test cases for the {@link Challenge#roll()} method.
*/
class ChallengeTest {

	/**
	 * Test of roll method, of class Challenge.
	 */
	@Test
	public void testRoll() {
		System.out.println("roll");
		Challenge instance = new Challenge();
		String expResult = "";
		String result = instance.roll();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}

// Client.java
package dsachat.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Vector;
import dsachat.share.hero.Hero;
import dsachat.share.hero.Talent;
import dsachat.share.hero.Weapon;

/**
 * This class represents a client.
 * It connects to the server and sends and receives messages.
 *
 * @author bernshausen
 */
public class Client {

    /**
     * the socket to connect to the server
     */
    private Socket socket;
    /**
     * the output stream to send messages to the server
     */
    private ObjectOutputStream out;
    /**
     * the input stream to receive messages from the server
     */
    private ObjectInputStream in;
    /**
     * the name of the client
     */
    private String name;
    /**
     * the hero of the client
     */
    private Hero hero;
    /**
     * the list of all heroes
     */
    private Vector<Hero> heroes;
    /**
     * the list of all weapons
     */
    private Vector<Weapon> weapons;
    /**
     * the list of all talents
     */
    private Vector<Talent> talents;

    /**
     * Constructor of the client.
     * It connects to the server and sends the name of the client.
     *
     * @param name the name of the client
     */
    public Client(String name) {
        this.name = name;
        try {
            socket = new Socket("localhost", 1234);
            out = new ObjectOutputStream(socket.getOutputStream());
            in = new ObjectInputStream(socket.getInputStream());
            out.writeObject(name);
            out.flush();
        } catch (UnknownHostException e) {
            System.out.println("Unknown host: localhost");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("No I/O");
            System.exit(1);
        }
    }

    /**
     * This method sends a message to the server.
     *
     * @param msg the message to send
     */
    public void send(Object msg) {
        try {
            out.writeObject(msg);
            out.flush();
        } catch (IOException e) {
            System.out.println("No I/O");
            System.exit(1);
        }
    }

    /**
     * This method receives a message from the server.
     *
     * @return the message from the server
     */
    public Object receive() {
        Object msg = null;
        try {
            msg = in.readObject();
        } catch (IOException e) {
            System.out.println("No I/O");
            System.exit(1);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
            System.exit(1);
        }
        return msg;
    }

    /**
     * This method closes the connection to the server.
     */
    public void close() {
        try {
            socket.close();
        } catch (IOException e) {
            System.out.println("No I/O");
            System.exit(1);
        }
    }

    /**
     * This method returns the name of the client.
     *
     * @return the name of the client
     */
    public String getName() {
        return name;
    }

    /**
     * This method returns the hero of the client.
     *
     * @return the hero of the client
     */
    public Hero getHero() {
        return hero;
    }

    /**
     * This method sets the hero of the client.
     *
     * @param hero the hero of the client
     */
    public void setHero(Hero hero) {
        this.hero = hero;
    }

    /**
     * This method returns the list of all heroes.
     *
     * @return the list of all heroes
     */
    public Vector<Hero> getHeroes() {
        return heroes;
    }

    /**
     * This method sets the list of all heroes.
     *
     * @param heroes the list of all heroes
     */
    public void setHeroes(Vector<Hero> heroes) {
        this.heroes = heroes;
    }

    /**
     * This method returns the list of all weapons.
     *
     * @return the list of all weapons
     */
    public Vector<Weapon> getWeapons() {
        return weapons;
    }

    /**
     * This method sets the list of all weapons.
     *
     * @param weapons the list of all weapons
     */
    public void setWeapons(Vector<Weapon> weapons) {
        this.weapons = weapons;
    }

    /**
     * This method returns the list of all talents.
     *
     * @return the list of all talents
     */
    public Vector<Talent> getTalents() {
        return talents;
    }

    /**
     * This method sets the list of all talents.
     *
     * @param talents the list of all talents
     */
    public void setTalents(Vector<Talent> talents) {
        this.talents = talents;
    }
}

// ClientTest.java
package dsachat.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Vector;
import dsachat.share.hero.Hero;
import dsachat.share.hero.Talent;
import dsachat.share.hero.Weapon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Client}.
* It contains ten unit test cases for the {@link Client#send(java.lang.Object)} method.
*/
class ClientTest {
		
	/**
	 * Test of send method, of class Client.
	 */
	@Test
	public void testSend() {
		System.out.println("send");
		Object msg = null;
		Client instance = null;
		instance.send(msg);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}

// ClientUI.java
package dsachat.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;