// ModernChatServerTest.java
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
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModernChatServer}.
* It contains ten unit test cases for the {@link ModernChatServer#getLogger()} method.
*/
class ModernChatServerTest {

	/**
	* Test case for the {@link ModernChatServer#getLogger()} method.
	*/
	@Test
	void testGetLogger() {
		// TODO
	}
}

// ModernChatServer.java
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
     * @return the logger
     */
    public static Logger getLogger() {
        return logger;
    }

    /**
     * @param aLogger the logger to set
     */
    public static void setLogger(Logger aLogger) {
        logger = aLogger;
    }

    /**
     * @return the serverSetting
     */
    public static ServerSettingBean getServerSetting() {
        return serverSetting;
    }

    /**
     * @param aServerSetting the serverSetting to set
     */
    public static void setServerSetting(ServerSettingBean aServerSetting) {
        serverSetting = aServerSetting;
    }

    /**
     * @return the users
     */
    public static Hashtable<String, User> getUsers() {
        return users;
    }

    /**
     * @param aUsers the users to set
     */
    public static void setUsers(Hashtable<String, User> aUsers) {
        users = aUsers;
    }

    /**
     * @return the rooms
     */
    public static Hashtable<String, Room> getRooms() {
        return rooms;
    }

    /**
     * @param aRooms the rooms to set
     */
    public static void setRooms(Hashtable<String, Room> aRooms) {
        rooms = aRooms;
    }

    /**
     * @return the groups
     */
    public static Hashtable<String, Group> getGroups() {
        return groups;
    }

    /**
     * @param aGroups the groups to set
     */
    public static void setGroups(Hashtable<String, Group> aGroups) {
        groups = aGroups;
    }

    /**
     * @return the usersBD
     */
    public static UsersBD getUsersBD() {
        return usersBD;
    }

    /**
     * @param aUsersBD the usersBD to set
     */
    public static void setUsersBD(UsersBD aUsersBD) {
        usersBD = aUsersBD;
    }

    /**
     * @return the encrypter
     */
    public static StringEncrypter getEncrypter() {
        return encrypter;
    }

    /**
     * @param aEncrypter the encrypter to set
     */
    public static void setEncrypter(StringEncrypter aEncrypter) {
        encrypter = aEncrypter;
    }

    /**
     * @return the encoder64
     */
    public static StringEncoder64 getEncoder64() {
        return encoder64;
    }

    /**
     * @param aEncoder64 the encoder64 to set
     */
    public static void setEncoder64(StringEncoder64 aEncoder64) {
        encoder64 = aEncoder64;
    }

    /**
     * @return the server
     */
    public static ServerInterface getServer() {
        return server;
    }

    /**
     * @param aServer the server to set
     */
    public static void setServer(ServerInterface aServer) {
        server = aServer;
    }

    /**
     * @return the serverName
     */
    public static String getServerName() {
        return serverName;
    }

    /**
     * @param aServerName the serverName to set
     */
    public static void setServerName(String aServerName) {
        serverName = aServerName;
    }

    /**
     * @return the serverPort
     */
    public static int getServerPort() {
        return serverPort;
    }

    /**
     * @param aServerPort the serverPort to set
     */
    public static void setServerPort(int aServerPort) {
        serverPort = aServerPort;
    }

    /**
     * @return the serverURL
     */
    public static String getServerURL() {
        return serverURL;
    }

    /**
     * @param aServerURL the serverURL to set
     */
    public static void setServerURL(String aServerURL) {
        serverURL = aServerURL;
    }

    /**
     * @return the serverRegistry
     */
    public static Registry getServerRegistry() {
        return serverRegistry;
    }

    /**
     * @param aServerRegistry the serverRegistry to set
     */
    public static void setServerRegistry(Registry aServerRegistry) {
        serverRegistry = aServerRegistry;
    }

    /**
     * @return the serverStub
     */
    public static ServerInterface getServerStub() {
        return serverStub;
    }

    /**
     * @param aServerStub the serverStub to set
     */
    public static void setServerStub(ServerInterface aServerStub) {
        serverStub = aServerStub;
    }

    /**
     * @return the serverThread
     */
    public static Thread getServerThread() {
        return serverThread;
    }

    /**
     * @param aServerThread the serverThread to set
     */
    public static void setServerThread(Thread aServerThread) {
        serverThread = aServerThread;
    }

    /**
     * @return the serverThreadRunning
     */
    public static boolean isServerThreadRunning() {
        return serverThreadRunning;
    }

    /**
     * @param aServerThreadRunning the serverThreadRunning to set
     */
    public static void setServerThreadRunning(boolean aServerThreadRunning) {
        serverThreadRunning = aServerThreadRunning;
    }

    /**
     * @return the serverThreadSleepTime
     */
    public static int getServerThreadSleepTime() {
        return serverThreadSleepTime;
    }

    /**
     * @param aServerThreadSleepTime the serverThreadSleepTime to set
     */
    public static void setServerThreadSleepTime(int aServerThreadSleepTime) {
        serverThreadSleepTime = aServerThreadSleepTime;
    }

    /**
     * @return the serverThreadLastRun
     */
    public static Calendar getServerThreadLastRun() {
        return serverThreadLastRun;
    }

    /**
     * @param aServerThreadLastRun the serverThreadLastRun to set
     */
    public static void setServerThreadLastRun(Calendar aServerThreadLastRun) {
        serverThreadLastRun = aServerThreadLastRun;
    }

    /**
     * @return the serverThreadLastRunTime
     */
    public static long getServerThreadLastRunTime() {
        return serverThreadLastRunTime;
    }

    /**
     * @param aServerThreadLastRunTime the serverThreadLastRunTime to set
     */
    public static void setServerThreadLastRunTime(long aServerThreadLastRunTime) {
        serverThreadLastRunTime = aServerThreadLastRunTime;
    }

    /**
     * @return the serverThreadLastRunDuration
     */
    public static long getServerThreadLastRunDuration() {
        return serverThreadLastRunDuration;
    }

    /**
     * @param aServerThreadLastRunDuration the serverThreadLastRunDuration to set
     */
    public static void setServerThreadLastRunDuration(long aServerThreadLastRunDuration) {
        serverThreadLastRunDuration = aServerThreadLastRunDuration;
    }

    /**
     * @return the serverThreadLastRunDurationMax
     */
    public static long getServerThreadLastRunDurationMax() {
        return serverThreadLastRunDurationMax;
    }

    /**
     * @param aServerThreadLastRunDurationMax the serverThreadLastRunDurationMax to set
     */
    public static void setServerThreadLastRunDurationMax(long aServerThreadLastRunDurationMax) {
        serverThreadLastRunDurationMax = aServerThreadLastRunDurationMax;
    }

    /**
     * @return the serverThreadLastRunDurationMin
     */
    public static long getServerThreadLastRunDurationMin() {
        return serverThreadLastRunDurationMin;
    }

    /**
     * @param aServerThreadLastRunDurationMin the serverThreadLastRunDurationMin to set
     */
    public static void setServerThreadLastRunDurationMin(long aServerThreadLastRunDurationMin) {
        serverThreadLastRunDurationMin = aServerThreadLastRunDurationMin;
    }

    /**
     * @return the serverThreadLastRunDurationAvg
     */
    public static long getServerThreadLastRunDurationAvg() {
        return serverThreadLastRunDurationAvg;
    }

    /**
     * @param aServerThreadLastRunDurationAvg the serverThreadLastRunDurationAvg to set
     */
    public static void setServerThreadLastRunDurationAvg(long aServerThreadLastRunDurationAvg) {
        serverThreadLastRunDurationAvg = aServerThreadLastRunDurationAvg;
    }

    /**
     * @return the serverThreadLastRunDurationAvgCount
     */
    public static long getServerThreadLastRunDurationAvgCount() {
        return serverThreadLastRunDurationAvgCount;
    }

    /**
     * @param aServerThreadLastRunDurationAvgCount the serverThreadLastRunDurationAvgCount to set
     */
    public static void setServerThreadLastRunDurationAvgCount(long aServerThreadLastRunDurationAvgCount) {
        serverThreadLastRunDurationAvgCount = aServerThreadLastRunDurationAvgCount;
    }

    /**
     * @return the serverThreadLastRunDurationAvgSum
     */
    public static long getServerThreadLastRunDurationAvgSum() {
        return serverThreadLastRunDurationAvgSum;
    }

    /**
     * @param aServerThreadLastRunDurationAvgSum the serverThreadLastRunDurationAvgSum to set
     */
    public static void setServerThreadLastRunDurationAvgSum(long aServerThreadLastRunDurationAvgSum) {
        serverThreadLastRunDurationAvgSum = aServerThreadLastRunDurationAvgSum;
    }

    /**
     * @return the serverThreadLastRunDurationAvgSumCount
     */
    public static long getServerThreadLastRunDurationAvgSumCount() {
        return serverThreadLastRunDurationAvgSumCount;
    }

    /**
     * @param aServerThreadLastRunDurationAvgSumCount the serverThreadLastRunDurationAvgSumCount to set
     */
    public static void setServerThreadLastRunDurationAvgSumCount(long aServerThreadLastRunDurationAvgSumCount) {
        serverThreadLastRunDurationAvgSumCount = aServerThreadLastRunDurationAvgSumCount;
    }

    /**
     * @return the serverThreadLastRunDurationAvgSumCountMax
     */
    public static long getServerThreadLastRunDurationAvgSumCountMax() {
        return serverThreadLastRunDurationAvgSumCountMax;
    }

    /**
     * @param aServerThreadLastRunDurationAvgSumCountMax the serverThreadLastRunDurationAvgSumCountMax to set
     */
    public static void setServerThreadLastRunDurationAvgSumCountMax(long aServerThreadLastRunDurationAvgSumCountMax) {
        serverThreadLastRunDurationAvgSumCountMax = aServerThreadLastRunDurationAvgSumCountMax;
    }

    /**
     * @return the serverThreadLastRunDurationAvgSumCountMin
     */
    public static long getServerThreadLastRunDurationAvgSumCountMin() {
        return serverThreadLastRunDurationAvgSumCountMin;
    }

    /**
     * @param aServerThreadLastRunDurationAvgSumCountMin the serverThreadLastRunDurationAvgSumCountMin to set
     */
    public static void setServerThreadLastRunDurationAvgSumCountMin(long aServerThreadLastRunDurationAvgSumCountMin) {
        serverThreadLastRunDurationAvgSumCountMin = aServerThreadLastRunDurationAvgSumCountMin;
    }

    /**
     * @return the serverThreadLastRunDurationAvgSumCountAvg
     */
    public static long getServerThreadLastRunDurationAvgSumCountAvg() {
        return serverThreadLastRunDurationAvgSumCountAvg;
    }

    /**
     * @param aServerThreadLastRunDurationAvgSumCountAvg the serverThreadLastRunDurationAvgSumCountAvg to set
     */
    public static void setServerThreadLastRunDurationAvgSumCountAvg(long aServerThreadLastRunDurationAvgSumCountAvg) {
        serverThreadLastRunDurationAvgSumCountAvg = aServerThreadLastRunDurationAvgSumCountAvg;
    }

    /**
     * @return the serverThreadLastRunDurationAvgSumCountAvgCount
     */
    public static long getServerThreadLastRunDurationAvgSumCountAvgCount() {
        return serverThreadLastRunDurationAvgSumCountAvgCount;
    }

    /**
     * @param aServerThreadLastRunDurationAvgSumCountAvgCount the serverThreadLastRunDurationAvgSumCountAvgCount to set
     */
    public static void setServerThreadLastRunDurationAvgSumCountAvgCount(long aServerThreadLastRunDurationAvgSumCountAvgCount) {
        serverThreadLastRunDurationAvgSumCountAvgCount = aServerThreadLastRunDurationAvgSumCountAvgCount;
    }

    /**
     * @return the serverThreadLastRunDurationAvgSumCountAvgSum
     */
    public static long getServerThreadLastRunDurationAvgSumCountAvgSum() {
        return serverThreadLastRunDurationAvgSumCountAvgSum;
    }

    /**
     * @param aServerThreadLastRunDurationAvgSumCountAvgSum the serverThreadLastRunDurationAvgSumCountAvgSum to set
     */
    public static void setServerThreadLastRunDurationAvgSumCountAvgSum(long aServerThreadLastRunDurationAvgSumCountAvgSum) {
        serverThreadLastRunDurationAvgSumCountAvgSum = aServerThreadLastRunDurationAvgSumCountAvgSum;
    }

    /**
     * @return the serverThreadLastRunDurationAvgSumCountAvgSumCount
     */
    public static long getServerThreadLastRunDurationAvgSumCountAvgSumCount() {
        return serverThreadLastRunDurationAvgSumCountAvgSumCount;
    }

    /**
     * @param aServerThreadLastRunDurationAvgSumCountAvgSumCount the serverThreadLastRunDurationAvgSumCountAvgSumCount to set
     */
    public static void setServerThreadLastRunDurationAvgSumCountAvgSumCount(long aServerThreadLastRunDurationAvgSumCountAvgSumCount) {
        serverThreadLastRunDurationAvgSumCountAvgSumCount = aServerThreadLastRunDurationAvgSumCountAvgSumCount;
    }

    /**
     * @return the serverThreadLastRunDurationAvgSumCountAvgSumCountMax
     */
    public static long getServerThreadLastRunDurationAvgSum