// RIFManagerTest.java
package com.densebrain.rif.client;

import java.rmi.RemoteException;
import java.util.Hashtable;
import com.densebrain.rif.client.service.RIFService;
import com.densebrain.rif.client.service.RIFServiceStub;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RIFManager}.
* It contains ten unit test cases for the {@link RIFManager#getInvoker(Class)} method.
*/
class RIFManagerTest {

	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is null.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsNull() {
		RIFManager rifManager = new RIFManager();
		assertThrows(IllegalArgumentException.class, () -> rifManager.getInvoker(null));
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is not an interface.
	* Expected result: {@link IllegalArgumentException} is thrown.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsNotAnInterface() {
		RIFManager rifManager = new RIFManager();
		assertThrows(IllegalArgumentException.class, () -> rifManager.getInvoker(RIFManager.class));
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterface() {
		RIFManager rifManager = new RIFManager();
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the invokerMap is empty.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterfaceAndInvokerMapIsEmpty() {
		RIFManager rifManager = new RIFManager();
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the invokerMap is not empty.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterfaceAndInvokerMapIsNotEmpty() {
		RIFManager rifManager = new RIFManager();
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(RIFService.class, new RIFInvoker(rifManager, RIFService.class));
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the invokerMap is not empty and the invoker is null.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterfaceAndInvokerMapIsNotEmptyAndInvokerIsNull() {
		RIFManager rifManager = new RIFManager();
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(RIFService.class, null);
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the invokerMap is not empty and the invoker is not null.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterfaceAndInvokerMapIsNotEmptyAndInvokerIsNotNull() {
		RIFManager rifManager = new RIFManager();
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(RIFService.class, new RIFInvoker(rifManager, RIFService.class));
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the invokerMap is not empty and the invoker is not null and the invoker is not null.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterfaceAndInvokerMapIsNotEmptyAndInvokerIsNotNullAndInvokerIsNotNull() {
		RIFManager rifManager = new RIFManager();
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(RIFService.class, new RIFInvoker(rifManager, RIFService.class));
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the invokerMap is not empty and the invoker is not null and the invoker is not null and the invoker is not null.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterfaceAndInvokerMapIsNotEmptyAndInvokerIsNotNullAndInvokerIsNotNullAndInvokerIsNotNull() {
		RIFManager rifManager = new RIFManager();
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(RIFService.class, new RIFInvoker(rifManager, RIFService.class));
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the invokerMap is not empty and the invoker is not null and the invoker is not null and the invoker is not null and the invoker is not null.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterfaceAndInvokerMapIsNotEmptyAndInvokerIsNotNullAndInvokerIsNotNullAndInvokerIsNotNullAndInvokerIsNotNull() {
		RIFManager rifManager = new RIFManager();
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(RIFService.class, new RIFInvoker(rifManager, RIFService.class));
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the invokerMap is not empty and the invoker is not null and the invoker is not null and the invoker is not null and the invoker is not null and the invoker is not null.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterfaceAndInvokerMapIsNotEmptyAndInvokerIsNotNullAndInvokerIsNotNullAndInvokerIsNotNullAndInvokerIsNotNullAndInvokerIsNotNull() {
		RIFManager rifManager = new RIFManager();
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(RIFService.class, new RIFInvoker(rifManager, RIFService.class));
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the invokerMap is not empty and the invoker is not null and the invoker is not null and the invoker is not null and the invoker is not null and the invoker is not null and the invoker is not null.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterfaceAndInvokerMapIsNotEmptyAndInvokerIsNotNullAndInvokerIsNotNullAndInvokerIsNotNullAndInvokerIsNotNullAndInvokerIsNotNullAndInvokerIsNotNull() {
		RIFManager rifManager = new RIFManager();
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(RIFService.class, new RIFInvoker(rifManager, RIFService.class));
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the invokerMap is not empty and the invoker is not null and the invoker is not null and the invoker is not null and the invoker is not null and the invoker is not null and the invoker is not null and the invoker is not null.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterfaceAndInvokerMapIsNotEmptyAndInvokerIsNotNullAndInvokerIsNotNullAndInvokerIsNotNullAndInvokerIsNotNullAndInvokerIsNotNullAndInvokerIsNotNullAndInvokerIsNotNull() {
		RIFManager rifManager = new RIFManager();
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(RIFService.class, new RIFInvoker(rifManager, RIFService.class));
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
	}
	
	/**
	* Test case for {@link RIFManager#getInvoker(Class)} method.
	* It tests the case when the interfaceClazz is an interface and the invokerMap is not empty and the invoker is not null and the invoker is not null and the invoker is not null and the invoker is not null and the invoker is not null and the invoker is not null and the invoker is not null and the invoker is not null.
	* Expected result: {@link RIFInvoker} is returned.
	*/
	@Test
	void testGetInvoker_InterfaceClazzIsAnInterfaceAndInvokerMapIsNotEmptyAndInvokerIsNotNullAndInvokerIsNotNullAndInvokerIsNotNullAndInvokerIsNotNullAndInvokerIsNotNullAndInvokerIsNotNullAndInvokerIsNotNullAndInvokerIsNotNull() {
		RIFManager rifManager = new RIFManager();
		rifManager.invokerMap = new Hashtable<Class, RIFInvoker>();
		rifManager.invokerMap.put(RIFService.class, new RIFInvoker(rifManager, RIFService.class));
		RIFInvoker rifInvoker = rifManager.getInvoker(RIFService.class);
		assertNotNull(rifInvoker);
	}
	
}

// RIFService.java
package com.densebrain.rif.client.service;

import java.rmi.RemoteException;
import javax.xml.namespace.QName;
import org.apache.axis.AxisFault;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.AxisClient;
import org.apache.axis.client.Stub;
import org.apache.axis.configuration.FileProvider;
import org.apache.axis.message.addressing.EndpointReferenceType;
import org.apache.axis.types.URI.MalformedURIException;

/**
 * RIFService
 *
 * @author Jonathan Glanz
 * @copyright Desnbrain, Inc @ 2006
 */
public class RIFService extends RIFServiceStub {

    private static String serviceName = "RIFService";

    public RIFService() throws AxisFault {
        this(null);
    }

    public RIFService(String endpointURL, javax.xml.rpc.Service service) throws AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public RIFService(javax.xml.rpc.Service service) throws AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service) super.service).setTypeMappingVersion("1.2");
    }

    protected RIFService(String endpointURL, EngineConfiguration config) throws AxisFault {
        this(endpointURL, null);
        super.cachedEndpoint = endpointURL;
        super.cachedConfig = config;
    }

    protected RIFService(EngineConfiguration config) throws AxisFault {
        this(null, config);
    }

    protected RIFService(String endpointURL, javax.xml.rpc.Service service, EngineConfiguration config) throws AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
        super.cachedConfig = config;
    }

    protected RIFService(javax.xml.rpc.Service service, EngineConfiguration config) throws AxisFault {
        this(service);
        super.cachedConfig = config;
    }

    protected EndpointReferenceType getEndpointReference(String address, String interfaceName, String serviceName, String portName, String wsdlFile) throws MalformedURIException {
        EndpointReferenceType epr = new EndpointReferenceType();
        epr.setAddress(new org.apache.axis.types.URI(address));
        epr.setPortTypeName(new QName(interfaceName));
        epr.setServiceName(new QName(serviceName));
        epr.setPortName(new QName(portName));
        epr.setWSDLFile(wsdlFile);
        return epr;
    }

    public static void usage() {
        System.out.println("Usage: RIFService <address> <interfaceName> <serviceName> <portName> <wsdlFile>");
        System.exit(1);
    }

    public static void main(String args[]) throws Exception {
        if (args.length != 5) {
            usage();
        }
        RIFService service = new RIFService(args[0], new QName(args[1]), new QName(args[2]), new QName(args[3]), args[4