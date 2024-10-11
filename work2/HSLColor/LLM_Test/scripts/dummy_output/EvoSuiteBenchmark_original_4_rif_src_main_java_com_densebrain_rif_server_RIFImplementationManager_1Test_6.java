// RIFImplementationManager_1Test.java
package com.densebrain.rif.server;

import java.lang.reflect.Method;
import java.rmi.RemoteException;
import java.util.Hashtable;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFImplementationManager}.
* It contains one unit test case for the {@link RIFImplementationManager#invoke(String, String, Object[])} method.
*/
class RIFImplementationManager_1Test {
		static Object testObject = new Object() {
		};

	Class interfaceClass;
	Object implementation;
	@Test
	void testServeRIFServices();

	/**
	 * 	Tests the call to invoke() on an implementation.
	 * @throws RemoteException Throws Remote exceptions while calling the invoke method.
	 */
	@Test
	void testCallInvoke() throws RemoteException {
		Class interfaceClazz = RIFImplementationManager_1Test.class;
		try {
			Class implementClass = this.getClass();

			Method[] methods = implementClass.getDeclaredMethods();
			Object[] args = new Object[methods.length];

			for (int i=0; i < methods.length; i++) {
				args[i] = this.interfaceClass;
			}

		  invoke(interfaceClazz.getName(), "testServeRIFServices", 
				args);
/*
		  System.out.print("Invoke: "+ args);
		  System.out.print("Method: [");
		   Method method = implementClass.getDeclaredMethod("testServeRIFServices");
		  String argsName = method.getName() + "(";
		  Object argsArray [] = new Object[0];
		  if (args.length > 0) {
		  	argsArray = Arrays.copyOf(args, args.length);
		   	for (int j=0;j < argsArray.length;j++) {
		   	   argsName += argsArray[j] + " ";
		   	}
		  }
		  method.invoke(this);
		  System.out.print(")");
		  System.out.println(argsName + ", ");
		  java.rmi.RMIClassLoader loader = java.rmi.RMIClassLoader.getRMIClassLoader();
		  String className = loader.getName();

		  ClassLoader loaderClass = RIFImplementationManager_1Test.class.getClassLoader();

		  Class aClazz = Class.forName(className);
		  if (aClazz.isArray()) {
		  for (int j=0;j < aClazz.length;j++) {
		  	  System.out.println(j);
		  }
		    System.out.println(aClazz.getComponentType().getName() + " Class (array)");
		  } else {
          System.out.println(aClazz.getName() + " Class (no array)");
		  }
		  System.out.println();

		  int j = 0;
		  Method [] methods = implementClass.getDeclaredMethods();
		  String argsName1 = "testServeRIFServices";

		  for (Method method : methods) {
		   if (method.getName().equals(argsName)) {
		   	System.out.println(argsName + " invoked by " + method.getName());
		   	if (j++ == 0) {
		   	  argsArray = Arrays.copyOf(args, args.length);
	          Class paramClass = method.getParameterTypes()[0];
	          System.out.println("param: " + paramClass.getName());
		   	  //System.out.println(params);
	      	  this.invoke(interfaceClazz.getName(), argsName + args.length,
	                      new Object[]{},
	                      new Hashtable<String, Object>());
	      	}
		    method.invoke(this, argsArray);
		  }
		}
*/
	} catch (RemoteException ex) {
		ex.printStackTrace();
		System.out.println("RIF.Exception: "+ ex.getMessage());
	}

}
}