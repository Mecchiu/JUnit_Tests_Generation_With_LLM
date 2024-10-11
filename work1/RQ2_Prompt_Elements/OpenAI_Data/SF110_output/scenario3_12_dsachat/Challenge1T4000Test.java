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
* It contains ten unit test cases for the {@link Challenge#dice(int)} method.
*/
class ChallengeTest {

	/**
	 * Test of dice method, of class Challenge.
	 */
	@Test
	public void testDice() {
		System.out.println("dice");
		int sides = 0;
		int expResult = 0;
		int result = Challenge.dice(sides);
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
import java.util.logging.Level;
import java.util.logging.Logger;
import dsachat.share.Challenge;
import dsachat.share.Hero;
import dsachat.share.Message;
import dsachat.share.MessageType;
import dsachat.share.Talent;
import dsachat.share.Weapon;

/**
 * This class represents a client.
 * <br>
 * It connects to the server and sends messages to it.
 *
 * @author bernshausen
 */
public class Client {

    /**
     * the socket to the server
     */
    private Socket socket;
    /**
     * the output stream to the server
     */
    private ObjectOutputStream out;
    /**
     * the input stream from the server
     */
    private ObjectInputStream in;
    /**
     * the hero of this client
     */
    private Hero hero;
    /**
     * the name of this client
     */
    private String name;
    /**
     * the name of the server
     */
    private String server;
    /**
     * the port of the server
     */
    private int port;

    /**
     * creates a new client
     *
     * @param name the name of this client
     * @param server the name of the server
     * @param port the port of the server
     */
    public Client(String name, String server, int port) {
        this.name = name;
        this.server = server;
        this.port = port;
    }

    /**
     * connects to the server
     *
     * @throws UnknownHostException if the server is not found
     * @throws IOException if the connection fails
     */
    public void connect() throws UnknownHostException, IOException {
        socket = new Socket(server, port);
        out = new ObjectOutputStream(socket.getOutputStream());
        in = new ObjectInputStream(socket.getInputStream());
    }

    /**
     * disconnects from the server
     *
     * @throws IOException if the disconnection fails
     */
    public void disconnect() throws IOException {
        socket.close();
    }

    /**
     * sends a message to the server
     *
     * @param msg the message to send
     * @throws IOException if the sending fails
     */
    public void send(Message msg) throws IOException {
        out.writeObject(msg);
    }

    /**
     * receives a message from the server
     *
     * @return the message from the server
     * @throws IOException if the receiving fails
     * @throws ClassNotFoundException if the message is not known
     */
    public Message receive() throws IOException, ClassNotFoundException {
        return (Message) in.readObject();
    }

    /**
     * sends a challenge to the server
     *
     * @param ch the challenge to send
     * @throws IOException if the sending fails
     */
    public void sendChallenge(Challenge ch) throws IOException {
        send(new Message(MessageType.CHALLENGE, ch));
    }

    /**
     * sends a talent to the server
     *
     * @param t the talent to send
     * @throws IOException if the sending fails
     */
    public void sendTalent(Talent t) throws IOException {
        send(new Message(MessageType.TALENT, t));
    }

    /**
     * sends a weapon to the server
     *
     * @param w the weapon to send
     * @throws IOException if the sending fails
     */
    public void sendWeapon(Weapon w) throws IOException {
        send(new Message(MessageType.WEAPON, w));
    }

    /**
     * sends a hero to the server
     *
     * @param h the hero to send
     * @throws IOException if the sending fails
     */
    public void sendHero(Hero h) throws IOException {
        send(new Message(MessageType.HERO, h));
    }

    /**
     * sends a message to the server
     *
     * @param msg the message to send
     * @throws IOException if the sending fails
     */
    public void sendMessage(String msg) throws IOException {
        send(new Message(MessageType.MESSAGE, msg));
    }

    /**
     * sends a name to the server
     *
     * @param name the name to send
     * @throws IOException if the sending fails
     */
    public void sendName(String name) throws IOException {
        send(new Message(MessageType.NAME, name));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req) throws IOException {
        send(new Message(req));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, Object obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, String obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, int obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, boolean obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, Challenge obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, Talent obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, Weapon obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, Hero obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, MessageType obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, Vector obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, int[] obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, boolean[] obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, Challenge[] obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, Talent[] obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, Weapon[] obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, Hero[] obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, MessageType[] obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, Vector[] obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, int[][] obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, boolean[][] obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, Challenge[][] obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, Talent[][] obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, Weapon[][] obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, Hero[][] obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, MessageType[][] obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, Vector[][] obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, int[][][] obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, boolean[][][] obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, Challenge[][][] obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, Talent[][][] obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object to send
     * @throws IOException if the sending fails
     */
    public void sendRequest(MessageType req, Weapon[][][] obj) throws IOException {
        send(new Message(req, obj));
    }

    /**
     * sends a request to the server
     *
     * @param req the request to send
     * @param obj the object