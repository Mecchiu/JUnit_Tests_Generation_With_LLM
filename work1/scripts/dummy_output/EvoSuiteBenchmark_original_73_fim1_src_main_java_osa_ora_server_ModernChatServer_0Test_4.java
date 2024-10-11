// ModernChatServer_0Test.java
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
* It contains one unit test case for the {@link ModernChatServer#getLogger()} method.
*/
class ModernChatServer_0Test {
		/**
		 * @throws RemoteException
		 */
	@Test
	public final void getLogger(){
            System.out.println("Running tests for the getLogger() method");
			ModernChatServer.getLogger(); //TODO
	}

	/**
	 * @throws RemoteException
	 */
	@Test
	public final void run_thread(java.util.Properties sp){
		//TODO
	}
}

// Test class of {@link Runnable}
class RunnableTest {
	/**
	 * @throws Exception
	 */
	@Test
	public final void run_byThread() throws Exception{
		System.out.println("Running tests for the Runnable class Thread");
		run_byThread(); //TODO
	}

	/**
	 * @throws Exception
	 */
	@Test
	public final void run_byThread_0() throws Exception {
		run_byThread(new Properties("mock.properties"));
	}

	/**
	 * @param sp
	 * @throws RemoteException
	 */
	private void run_byThread(java.util.Properties sp) throws RemoteException{
		final RunnableTest thread = new RunnableTest();
		thread.run_byThread(sp);
	}

        /**
		* Test class of {@link Runnable}
		* @throws Exception
		*/
        public void runThreadByThread(String name){
                RunnableTest thread = null;
                for(int i=0; i<5; i++){
                        if((i % 2)==0){
                                thread = new RunnableTest();
                        }
                        else{
                                thread = new RunnableTester(name);                        
                        }
                        Thread t = Thread.currentThread();
                        if(!t.isAlive()){
                                //TODO log error
                                Thread.sleep(250);
                                continue;
                        }
                        thread.run();
                }
        }
	private RunnableTest run_byThread(){
		/*
			This thread is executing the "run" method
			It executes the run() method within this thread
		*/
		/*
				This class is a subclass of the Runnable class but not the Runnable class itself
				It is used to run the threads
		 */
		final class RunnableTestRunnable implements Runnable {
			/**
			 * @throws java.lang.Exception
			 */
			public void run() throws Exception{
				run_byThread(new Properties("a.properties"));
			}
		}
//		return new RunnableTestRunnable();
		return new RunnableTestRunnable();
	}
}


class RunnableTest {
    /**
     * @throws Exception
     */
    @Test
    public final void run_byThread(){
        System.out.println("Running tests for the Executor of Runnable class Thread(Not Executor)");
        ExecutorThread e = null;
        for(int i=0; i<5; i++){
            if((i % 2)==0){
                    e = new ExecutorThread(new Properties("e.properties"));                        
            }
            else{
                    e = new ExecutorThread(new Properties("e2.properties"));                        
            }
            Thread t = Thread.currentThread();
            if(!t.isAlive()){
                    //TODO log remoteException
                    Thread.sleep(250);
            }
            e.run();
        }
    }

    /**
     * This thread is executing the "run" method
     * It executes the run() method within this thread
     * @param sp 
     * @throws Exception
     */
    class ExecutorThread extends Thread {
        /**
         * @param sp 
         * @throws RemoteException
         */
}
}