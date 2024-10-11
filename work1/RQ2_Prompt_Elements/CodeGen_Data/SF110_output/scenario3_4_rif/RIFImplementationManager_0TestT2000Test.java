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

	/*
	 * Test public static RIFImplementationManager getInstance() method
	 */
	@Test 
	void testGetInstance() {
		RIFImplementationManager instance = RIFImplementationManager.getInstance();
		assertEquals("getInstance()", instance.getInstance(), instance);
	}
	
	/*
	 * Test public void registerImplementation(Class<?>, Your implementation) method
	 */
	@Test
	void testRegisterImplementation() {
		try {
			getInstance().registerImplementation(com0.YouImplementedClass.class, new YouImplementedYourImplementation());
		} catch (RemoteException e) {
			fail("Expected RemoteException but was: " + e.getClass().getName() + ", " + e.getMessage());
		}
		
	}	

	/*
	 * Test public void unregisterImplementation(Class<?>) method
	 */
	@Test
	void testUnregisterImplementation() {
		assertNotEquals("UnregisterImplementation", null, getInstance().unregisterImplementation(com0.YouImplementedClass.class));
	}
	
	
	public static Map<Class<?>, Map<String,Class<? extends RemoteException>>> tests;	
	/**
	 * Add two map containing the two classes, one being from the superclass for example, the second one is the one that
	 * implements the interface.
	 * The superclasses of a class are the classes for a class that extends a super class 
	 * The testMap contains the classes for a class that implements a subclass of the interface.
	 * For a subclass the superclass is a class to extend, for example, the class com0.YouImplementedClass is a subclass of the interface com1.YourImplementedClass is one that extends a subclass of com1.YourImplementedClass
	 * @param superclasses the superclasses of a class
	 * @param testMap the map to add the classes to
	 */
	public static void addSubClasesToMap(Class<?> superclasses[], Map<Class<?>,Map<String, Class<? extends RemoteException>>> testMap) {
		testMap.put(superclasses[0], testMap);
		testMap.put(superclasses[1], testMap);
		for(int i=2;i<superclasses.length; i++) {
			addSubClasesToMap(superclasses[i], testMap);
		}
	}
	
	/**
	 * Retrieve the map containing classes for superclasses of the test
	 * @param testMap the map with the classes
	 */
	public static Map<Class<?>, Map<String, Class<? extends RemoteException>>> getSuperClassByInterfaceSubclasses(Map<Class<?>, Map<String, Class<? extends RemoteException>>> testMap) {
		return testMap.get(com0.YouImplementedSubclass.class);
	}
	
	/**
	 * Retrieve the map containing interfaces for superclasses of the test
	 * @param testMap the map with the interfaces
	 */
	public static Map<String, Class<? extends RemoteException>> getInterfacesSubclassByInterface(Map<String, Class<? extends RemoteException>> testMap) {
		return testMap.get(com0.YouImplementedIface.class);
	}
	
	public static class YouImplemetedYourImplementation implements RemoteException {
		String message = "Hello my implementation";
		public void writeObject(java.io.ObjectOutputStream oos) {
			oos.writeObject(message);
			
		}
	}
}
        
