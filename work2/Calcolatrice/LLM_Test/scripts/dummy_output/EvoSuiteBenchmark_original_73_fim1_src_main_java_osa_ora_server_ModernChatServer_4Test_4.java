// ModernChatServer_4Test.java
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
* It contains one unit test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
*/
class ModernChatServer_4Test {
		
    @Test
    void test() {
        String s = "\n@b" + new StringEncrypter().encrypt("test");
        String result =  StringEncrypter.plainEncryptString(s);
        String expected = "\nTEST" + new StringEncrypter().encrypt("test");
        assertEquals(expected,result);
        LoginBean lb = new LoginBean(new StringEncrypter().encrypt("test"), UsersBD.MY_USER_NAME);
        int loginStatus =  lb.login();
        String newPass = StringEncoder64.encode(new String(new StringEncrypter().encrypt(loginStatus.toString())));
        assertEquals(lb.getPassword(),newPass);
        
        //change admin password
        LoginBean.LogInBean loginBean = new LoginBean.LogInBean(lb.getEmail(), UsersBD.MY_USER_NAME);
        int res = loginBean.changePassword(newPass);
        if (res == 1) {
            //the current user should be logged in
            assertEquals(lb.getLoginStatus(),1);
        }
        else {
            jOptionPane.showMessageDialog(null, res);
            throw new Error("the current user is wrong");
        }
        
        String message = new StringEncrypter().decrypt(result);
        assertEquals("Hello,\n\nBye!", message);
        
    }
}

/**
* User registration
*/
class MyUser implements User {
    
    String name = null;
    String email = null;
    int phone = null;
    int gender = -1;
    
    public MyUser( String name, String email) {
        this.name = name;
        this.email = email;
    }
    /**
    * Gets user specific information.
    *
    * @return name : name
    */
    public String getName() {
        return this.name;
    }
    /**
    * Gets user specific information.
    *
    * @return email : email
    */
    public String getEmail() {
        return this.email;
    }
    /**
    * Gets user specific information.
    *
    * @return phone  : phone
    */
    public int getPhone() {
        return this.phone;
    }
    /**
    * Gets user specific information.
    *
    * @return gender  : gender
    */
    public int getGender() {
        return this.gender;
    }
    /**
    * Creates user.
    *
    * @return result : Result Bean
    */
    public ResultBean create() throws RemoteException {
    	throw new UnsupportedOperationException("Not supported yet.");
    }
    /**
    * Gets user's profile.
    *
    * @return result : result bean
    */
    public Hashtable<Object, Object> getUserProfile() throws RemoteException {
        Hashtable<Object, Object> result = new Hashtable<Object, Object>();
        Vector<Hashtable<String,String>> userProfiles = MyConstant.userProfiles.get(this.name);
        if (userProfiles == null) {
        	userProfiles = MyConstant.userProfiles.get(this.name);
        }
        if (userProfiles!= null) {
            for (Hashtable<String,String> prof : userProfiles) {
                result.putAll(prof);
            }
        }
        return result;
    }
}