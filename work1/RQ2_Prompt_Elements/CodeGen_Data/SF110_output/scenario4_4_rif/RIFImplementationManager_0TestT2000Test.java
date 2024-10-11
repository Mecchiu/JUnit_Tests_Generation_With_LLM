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
	 * Default constructor for the test class.
	 */
	RIFImplementationManager_0Test() {
	}
	
	/**
	 * Test the class's methods returning a value.
	 * 
	 * @throws RemoteException
	 * @throws Exception
	 */
	@Test
	public void testMethods() throws RemoteException, Exception {
		RIFImplementationManager mgr = null;
		Class[] interfaces = new Class[3];
		interfaces[0] = RIFServiceImpl_0.class;
		interfaces[1] = RIFMRequestReceiver.class;
		interfaces[2] = RIFMRequestReceiver_0.class;
		boolean testResult = false;
		testResult = mgr = mgr.getInstance();

		assertNotNull("The RIFImplementationManager could not be created", mgr); 

		RIFServiceImpl rifServiceImpl = (RIFServiceImpl) mgr.getImplementedInterface(RIFServiceImpl.class);

		Map<String, Method> methodMap = testMethodMap(rifServiceImpl);
		String methodName = methodMap.get(rifServiceImpl.getImplementationName()).getName();
		System.out.println("The " + methodName + " method is being invoked by the implementation class:");
		System.out.println(methodMap);
		System.out.println("The RIFMRequestReceiver is returning a value: " + methodMap.get(rifServiceImpl.getImplementationName()).invoke(rifServiceImpl, new Object[0]));		
		
		Method method = rifServiceImpl.getImplementationName() + "." + rifServiceImpl.getImplementationMethodName(methodName);
		method = methodsMap.get(method);
		if (method == null) {
			method = methodsMap.get(methodName);
			System.out.println("Unable to find the implementation method: " + method);
		}

		assertNotNull("The RIFMRequestReceiver does not return a value ", method.invoke(method));	
	}
	
	private Map<String, Method> testMethodMap(RIFServiceImpl rifServiceImpl) throws Exception {
	
		Map<String, Method> methodMap = new Hashtable<String, Method>();
		Method method = rifServiceImpl.getImplementationName() + "." + rifServiceImpl.getImplementationDescr();
		method = methodsMap.get(method);
		if (method == null) {
			method = methodsMap.get(methodName);
			System.out.println("The implementation name is : " + rifServiceImpl.getImplementationName() + " and description is : " + rifServiceImpl.getImplementationDescr());
			method = methodsMap.get(method);
		}
		assertNotNull("The definition of the implementation has not been found in the classpath!");
		methodMap.put(rifServiceImpl.getImplementationName(), method);
		return methodMap;
	}
	
	/**
	 * Test the class's static methods in the service.
	 * 
	 * @throws RemoteException
	 * @throws Exception
	 */
	@Test
	public void testStaticMethods() throws RemoteException, Exception {
		RIFImplementationManager mgr = null;
		RIFServiceImpl rifServiceImpl = (RIFServiceImpl) mgr.getImplementedInterface(RIFServiceImpl.class);
		Class[] interfaces = new Class[2];
		interfaces[0] = RIFMRequestReceiver.class;
		interfaces[1] = RIFMRequestReceiver_0.class;
		Class[] testStaticMethods = null;
		testStaticMethods = new Class[34];
		testStaticMethods[0] = RIFInvocationHandler.class;
		testStaticMethods[1] = RIFRequestHandlerClassInvocationHandlerImpl.class;
		Class[] testStaticMethods2 = new Class[33];
		testStaticMethods2[0] = RIFMRequestReceiverImpl.class;
		testStaticMethods2[1] = RIFRequestHandlerImpl.class;
		testStaticMethods2[2] = RIFMRequestReceiver_0Impl.class;

		mgr = mgr.getInstance();
		RIFMRequestReceiver rifMRequestReceiver = (RIFMRequestReceiver) mgr.getImplementedInterface(RIFMRequestReceiver.class);
		RIFMRequestReceiverImpl rifMRequestReceiverImpl = (RIFMRequestReceiverImpl) rifMRequestReceiver;
		
		assertNotNull("The RIFMRequestReceiver could not be created", mgr); 
		
		rifMRequestReceiverImpl = new RIFMRequestReceiverImpl(rifMRequestReceiver.getSessionManager(), rifMRequestReceiver.getMappingService()); 

		Method[] methods = rifMRequestReceiverImpl.getImplementationMethodNames();
		Method method = rifMRequestReceiverImpl.getImplementationName();
		Object[] parameters = null;
		Object[] mapObjects = null;

		// Test that the array is not null
		assertNotNull("The array has not been created.", methods);
		assertNotNull("The array has not been created.", method);

		// Iterate through the array of the methods
		// Find all of the methods containing the RIFServiceImpl.class object
		for (int i = 0; i < methods.length; i++) {
			if (method.equals(methods[i])) {
				// Get the value of all the parameters
				parameters = rifMRequestReceiverImpl.getMethodsParameters(i);

				// Iterate through all of the parameters