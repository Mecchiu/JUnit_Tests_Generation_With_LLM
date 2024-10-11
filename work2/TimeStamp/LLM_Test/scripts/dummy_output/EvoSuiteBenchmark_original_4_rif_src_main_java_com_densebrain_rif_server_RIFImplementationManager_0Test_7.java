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
		
	/**
	 *
	 * @throws NoSuchMethodException
	 * @throws ClassNotFoundException
	 * @throws NullPointerException
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @throws InvocationTargetException
	 */
	@Test
	public final void testInvoke() throws RemoteException {

		RIFImplementationManager implManager = RIFImplementationManager.getInstance();

		String interfaceClazzName = "MyInterfaceClasses";
		String serviceName = "MyService";

		implManager.registerImplementation(interfaceClazzName, interfaceClazzName);
		implManager.registerImplementation(serviceName, serviceName);

		String[] methodsParameter = new String[2];
		methodsParameter[0] = "MyMethod";
		methodsParameter[1] = "MyMethod2";

		Map<String, Method> methodMap = implManager.methodsMap.get(serviceName);
		if(methodMap == null) {
			methodMap = new Hashtable<String, Method>();
		}
		Method methodToInvoke = null;
		if(methodMap.containsKey(methodsParameter[0].toString())) {
			methodToInvoke = methodMap.get(methodsParameter[0].toString());
		}

		if(methodToInvoke == null) {
			throw new RemoteException("Can't find method in map!");
		}

		assertTrue(methodToInvoke.getParameterTypes().length == 2);

		Object returnValue = null;
		if(methodToInvoke instanceof Remote) {
			returnValue = methodToInvoke.invoke(null, new Object[]{methodsParameter, 1});
		} else if(methodToInvoke instanceof Throwable) {
			returnValue = methodToInvoke.invoke(null, new Object[]{methodsParameter});
		} else {
			returnValue = methodToInvoke.invoke(null);
		}
		assertTrue(returnValue instanceof Integer);
		assertTrue(returnValue == 1);
	}
}