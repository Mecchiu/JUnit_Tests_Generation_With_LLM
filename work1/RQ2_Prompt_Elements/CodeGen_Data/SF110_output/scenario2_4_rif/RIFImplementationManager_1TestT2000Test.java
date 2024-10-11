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
/**
		* Test methods on implementation
		*/
		@Test
	    public void testMethods() throws RemoteException {
			String className = "com.densebrain.rif.server.RIFImplementationManager$1Test_One";
			ClassManager classManager = new ClassManager(className, ClassManager.INTR_CLASS_BASE_MODULE, ClassManager.IMPLEMENTATION_TYPE_IMPLEMENTATION, null);
			Map<String, Map<String, Method>> classMethods = classManager.getClassMethods(className);
			Object map = classMethods.get(RIFImplementationManager.class.getCanonicalName());
			Method[] methods = map.getClass().getMethods();

			for (int i = 0; i < methods.length; i++) {
				Method method = methods[i];
				String name = method.getName();
				String resultName = method.getResultType();
				methodNameResolutionService.getMethodNameResolutionService().resolveMethodName(name);

				// test the first case
				if (name.equals("invoke")) {
					Object[] args = {new Object()};
					Object result = invoke(name, resolver.resolve(map.getClass(), resultName, args, true), args);
					assertNotNull(result);
					assertTrue(result instanceof Map);
					assertEquals("Map result: " + resultName, resolver.getResultType(method.getDeclaringClass(),
					    method.getReturnType()), resultName);
				}
				// test the second case
				else if (name.equals("getName")) {
					assertEquals("" + resultName, resolver.getResultType(map.getClass(), resultName));
				}
				// test the third case
				else if (name.equals("getInterfaceName")) {
					assertEquals("" + resultName, resolver.getResultType(map.getClass(), resultName));
				}
				
				// Test the mapping of the interfaces of a mapped instance
				if (name.equals("getImplementationByName") && resolver.getModuleName().equals("com.densebrain.RIFImplementationManager")
				        && resultName.equals("MyImplementation")) {
						String className2 = "com.densebrain.rif.server.RIFImplementationManager$1TestImpl";
						ClassManager classManager2 = new ClassManager(className2, classManager.getPackageName(), map.getClass().getPackage().getName(), null);
						Map<String, Map<String, Method>> classMethodMap2 = classManager2.getClassMethodMap(map.getClass());
						if (classMethodMap2.size() > 0) {
							Map<String, Method> map2Method = classMethodMap2.get(className);
							ClassManager.InvokeInfo invokeInfo = resolver.map(map2Method, resultName, args).iterator().next();
							assertNotNull(invokeInfo);

							Method method2 = map2Method.get(method.getName());
							
							String invokeName2 = method2.getName().replace("$", "");
							assertNotNull(invokeName2);

							Object invokeObj2 = invoke2Service.invoke(invokeInfo);
							assertNotNull(invokeObj2);
							Map result2 = (Hashtable) invoke2Service.invoke(invokeObj2);
							assertNotNull(result2);
							String result2Name2 = result2.getClass().getName();
							int resultName2index = result2Name2.lastIndexOf(className2);
							if (resultName2index > 0) resultName2index = resultName2index + className2.length();
							assertEquals("" + result2Name2, ((Map)invokeObj2).get(invokeName2));
						}
				}
			}
	    }
}