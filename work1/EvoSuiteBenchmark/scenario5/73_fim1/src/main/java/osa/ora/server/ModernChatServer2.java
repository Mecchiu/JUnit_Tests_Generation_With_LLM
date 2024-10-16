package osa.ora.server;

import java.net.URISyntaxException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.JOptionPane;
import osa.ora.server.bd.UsersBD;
import osa.ora.server.beans.BinaryMessage;
import osa.ora.server.beans.Group;
import osa.ora.server.beans.IConstant;
import osa.ora.server.beans.LoginBean;
import osa.ora.server.beans.ResultBean;
import osa.ora.server.beans.Room;
import osa.ora.server.beans.ServerSettingBean;
import osa.ora.server.beans.TextMessage;
import osa.ora.server.beans.User;
import osa.ora.server.client.ClientInterface;
import osa.ora.server.threads.SendKickOffByLoginMessageThread;
import osa.ora.server.threads.SendKickOffMessageThread;
import osa.ora.server.threads.SendRefreshContactThread;
import osa.ora.server.threads.SendUserUpdatedStatusThread;
import osa.ora.server.utils.StringEncoder64;
import osa.ora.server.utils.StringEncrypter;

/**
 * @author ooransa
 * Class implements 2 interfaces:
 * 1.Runnable for ping users thread : that ping users periodically to check if they are still connected or not.
 * 2.ServerInterface that extends 2 other interfaces : Admin Interface and Client Interface , both used
 * As the RMI view of the server for the connected client.
 */
public class ModernChatServer implements ServerInterface, Runnable {

    /**
     * Method to sing in ..
     *
     * @param cf : user client interface to communicate with the client
     * @param emailAddr : user email
     * @param password : user password
     * @param ipAddress : user ip address
     * @return User object if authentication correctly , or null if not exist.
     * @throws RemoteException
     */
    public LoginBean signIn(ClientInterface cf, String emailAddr, String password, String ipAddress) throws RemoteException {
        LoginBean loginBean = null;
        //authenticate User
        //DB authentication....
        if (emailAddr != null && password != null && ipAddress != null) {
            String email = StringEncoder64.decodeStringUTF8(emailAddr);
            //System.out.println("email="+email);
            User user = authenticateUser(email, password);
            if (user != null) {
                ipAddress = StringEncoder64.decodeStringUTF8(ipAddress);
                //System.out.println("ip="+ipAddress);
                ClientInterface oldOne = connectedClients.get(user.getId());
                if (oldOne != null) {
                    String ipAdd = connectedClientsIPs.get(user.getId());
                    if (ipAdd != null && ipAdd.equals(ipAddress)) {
                        SendKickOffByLoginMessageThread sendKickOffByLoginMessageThread = new SendKickOffByLoginMessageThread(oldOne, true);
                        sendKickOffByLoginMessageThread.start();
                    } else {
                        SendKickOffByLoginMessageThread sendKickOffByLoginMessageThread = new SendKickOffByLoginMessageThread(oldOne, false);
                        sendKickOffByLoginMessageThread.start();
                    }
                }
                connectedClients.put(user.getId(), cf);
                connectedClientsIPs.put(user.getId(), ipAddress);
                getLogger().log(Level.FINE, "User " + email + " has logged in.");
                loginBean = new LoginBean();
                loginBean.setUser(user);
                String orignalPass = passwordEnc.decrypt(passwords.get(user.getId()));
                String tokenUsed = StringEncrypter.getInstance(orignalPass).encrypt(secToken);
                loginBean.setSecureToken(tokenUsed);
                loginBean.setAuthToken(clientAuthToken);
                return loginBean;
            } else {
                getLogger().log(Level.FINE, "User " + email + " is not valid!");
                return null;
            }
        } else {
            getLogger().log(Level.WARNING, "Credentials is null!");
            return null;
        }
    }

    /**
     * private method to authenticate the user and return its full detailed bean.
     * @param emailAddr : email of the user
     * @param password  : password of the user.
     * @return User or Null according to the authentication results.
     */
    private User authenticateUser(String emailAddr, String password);

    /**
     * @return the logger
     */
    public static Logger getLogger();
}

/**
 * @author ooransa
 */
public class LoginBean implements Serializable {

    /**
     * @param user the user to set
     */
    public void setUser(User user);

    /**
     * @param secureToken the secureToken to set
     */
    public void setSecureToken(String secureToken);

    /**
     * @param authToken the authToken to set
     */
    public void setAuthToken(String authToken);
}

public class StringEncoder64 {

    public static String decodeStringUTF8(String data);
}

/**
 * @author ooransa
 */
public class User implements Serializable {

    public int getId();
}

public class StringEncrypter {

    /**
     * Takes a encrypted String as an argument, decrypts and returns the
     * decrypted String.
     *
     * @param str Encrypted String to be decrypted
     * @return <code>String</code> Decrypted version of the provided String
     */
    public String decrypt(String str);

    /**
     * Takes a single String as an argument and returns an Encrypted version
     * of that String.
     * @param str String to be encrypted
     * @return <code>String</code> Encrypted version of the provided String
     */
    public String encrypt(String str);

    /**
     * Singleton
     */
    public static StringEncrypter getInstance(String initKey);
}
