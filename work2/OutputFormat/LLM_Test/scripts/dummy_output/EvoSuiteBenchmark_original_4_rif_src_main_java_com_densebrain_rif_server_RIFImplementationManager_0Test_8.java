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
		private static final String MESSAGE = "Hello World";
		private static final boolean A_BOOLEAN = true;
		private static final int A_LONG = 10;
		private static final Object A_OBJECT = new Object();
		private static final int A_FLOAT = 123.45f;
		private static final String A_STRING = "Hello World" + "!";
		private static final int CURRENT_MESSAGING_VERSION = 1;

		@Test
    public void testSet() throws Throwable {
		assertNotNull(RIFImplementationManager.getInstance());
    }

  /**
   *  The test code for {@link RIFLogic#registerImplementation(Class, Object)}
   */

  @Test
    public void testRegisterImplementation() throws Throwable {
		assertNotNull(RIFImplementationManager.getInstance().registerImplementation(RIFImpl.class, RIFImpl.getJvmInstance()));

    }

  /**
   *   The test code for {@link RIFLogic#invoke(String, Object[])}
   */

@Test
    public void testInvokeMethod() throws Throwable {
		// method that the instance needs
        assertNotNull(RIFImplementationManager.getInstance().invoke("RIFService", new Object[]{}));
    }
}