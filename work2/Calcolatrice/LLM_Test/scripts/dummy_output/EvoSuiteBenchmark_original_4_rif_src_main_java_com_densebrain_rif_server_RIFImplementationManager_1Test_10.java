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
		
    @Test
    public void invoke_Test(){
        RIFImplementationManager rifInstance =  RIFImplementationManager.getInstance();
        Object serviceInstance = null;
        Map<String,Hashtable<String,Object>> implementationsMap = new Hashtable<String, Hashtable<String,Object>>();
        Hashtable<Object, Map<String, Method>> methodsMap = new Hashtable<Object, Map<String, Method>>();
        serviceInstance = rifInstance.getRIFServiceImplIfItExists();
        assertNotNull(serviceInstance);

        // add existing implementation and method
        implementationsMap.put((String) rifInstance.getClass().getName(), new Hashtable<String,Object>());
        Method method = methodsMap.get((String) serviceInstance).get( (String) rifInstance.getClass().getName());
        methodsMap.put( (String) serviceInstance, new Hashtable<String,Method>());
        Method method2 = methodsMap.get((String) serviceInstance).get( (String) rifInstance.getClass().getName());

        assertNotNull(method);
        assertNotNull(method2);
        int callCount = 0;
        try {  // Invoke the method, passing parameters
            callCount ++;
            method2.invoke(serviceInstance, (Object)new Object[]{"Hello World"});
            method.invoke(serviceInstance, new Object[]{"Hello World"});

            assertEquals("Hello World",rifInstance.invoke(serviceInstance, (String) "Hello Test"));

            assertEquals("Hello World",rifInstance.invoke(serviceInstance, (String) "Hello Test"));

            assertEquals("Hello World",rifInstance.invoke(serviceInstance, new String[]{"Hello Test"}));

            assertEquals("Hello World",rifInstance.invoke(serviceInstance, new String[]{"Hello Test"}));

            assertNotNull(rifInstance.invoke(serviceInstance,(String) new Object[]{"Hello Test"}));
        } catch (Exception e) {
            fail(e.getMessage());
        }

        assertEquals("Hello World", (String) rifInstance.invoke(serviceInstance, "Hello Test"));

        try {
            callCount ++;
            method2.invoke(serviceInstance, new Object[]{"Hello World"});
        } catch (Exception e) {
            fail(e.getMessage());
        }

        assertNotNull(callCount);

        Method methods[] = methodsMap.get(serviceInstance).get( (String) rifInstance.getClass().getName());
        Map map = methodsMap.get(serviceInstance);
        assertNotNull(map);
        assertNotNull(methods);
        assertEquals(callCount, map.size());
    }
    @Test
    public void executeImplementations_Test(){
        RIFImplementationManager rifInstance =  RIFImplementationManager.getInstance();
        rifInstance.registerImplementation("com.densebrain.rif.server.MyFault", new MyFaultImpl());
        rifInstance.registerImplementation("com.densebrain.rif.server.MyImpl", new MyImplImpl());
        Method methods[] = methodsMap.get("com.densebrain.rif.server.MyImpl").get( (String) rifInstance.getClass().getName());
        assertEquals(1, methods.length);
        Map map = methodsMap.get("com.densebrain.rif.server.MyFault");
        Method method = map.get("fault");
        Class[] interfaces = methods[0].getParameterTypes();
        assertEquals(3, interfaces.length);
    }
}

/**
* @author Michael Wiesavelt (michael.wiesavelt@densebrain.org)
*/
class MyFaultImpl implements Fault{
    Object object;
    public MyFaultImpl(Object object){
        this.object = object;
    }
    public void invoke() throws Fault{
        throw object;
    }

    public void throwImplementationsException(String message){
        throw new Fault(message);
    }

    public void throwLocalFault(String message){
        throw new Fault(message);
    }
}

class MyImplImpl implements IMyImpl{
	public void invoke(){
		throw new MyFaultImpl("Hello World");
	}
}

/**
* @author Michael Wiesavelt (michael.wiesavelt@densebrain.org)
*/
class MyFaultImpl implements Fault{
    Object object;
    public MyFaultImpl(Object object){
        this.object = object;
    }

    public void invoke(){
        throw new Fault("Hello World");
    }
}