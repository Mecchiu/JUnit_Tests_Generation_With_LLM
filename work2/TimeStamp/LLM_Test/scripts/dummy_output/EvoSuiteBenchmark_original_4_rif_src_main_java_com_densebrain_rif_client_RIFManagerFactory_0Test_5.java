// RIFManagerFactory_0Test.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManagerFactory}.
* It contains one unit test case for the {@link RIFManagerFactory#getInstance()} method.
*/
class RIFManagerFactory_0Test {
		RIFManagerFactory_0Test() throws RemoteException, RemoteException {
			RIFManagerFactory.getInstance();
		}
}

//RIFManagerFactory.java
public class RIFManagerFactory_0Test {
     public static final RIFManagerFactory_0Test INSTANCE_ = new RIFManagerFactory_0Test();

     /**
      * Constructor for RIFManagerFactory_0Test.
      */
     public RIFManagerFactory_0Test() throws RemoteException {
         RIFManagerFactory.getManager(null);
     }
}