// RIFImplementationManager_0Test.java
package com.densebrain.rif.server;

import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFImplementationManager}.
* It contains one unit test case for the {@link RIFImplementationManager#getInstance()} method.
*/
class RIFImplementationManager_0Test {
		
    public static void main(String[] args) throws RemoteException  {
        RIFImplementationManager.getInstance();
    }
    @Test
	public void test(){
	  RIFImplementationManager instance =	  RIFImplementationManager.getInstance();
	  
	  Map<Class, Object> map =  instance.getImplementations(new Class[] {RIFServiceImpl.class});
	  assertTrue(map!= null);

	  if(map!= null){System.out.println("MAP " + map.size());
	    testMap(map);}
	  RIFServiceImpl.testMethodInvoked =false;

	}
	
}