// ArrayOfContextElementTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfContextElement}.
* It contains ten unit test cases for the {@link ArrayOfContextElement#getTypeDesc()} method.
*/
class ArrayOfContextElementTest {

	/**
	* Test case for {@link ArrayOfContextElement#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		ArrayOfContextElement arrayOfContextElement = new ArrayOfContextElement();
		assertNotNull(arrayOfContextElement.getTypeDesc());
	}
}

// ContextElement.java
package mygrid.web;

public class ContextElement implements java.io.Serializable {

    private java.lang.String name;

    private java.lang.String type;

    private java.lang.String value;

    public ContextElement() {
    }

    public java.lang.String getName();

    public void setName(java.lang.String name);

    public java.lang.String getType();

    public void setType(java.lang.String type);

    public java.lang.String getValue();

    public void setValue(java.lang.String value);

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj);

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode();

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(ContextElement.class);

    static {
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc();

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType);

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType);
}

// ContextElementTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains ten unit test cases for the {@link ContextElement#getTypeDesc()} method.
*/
class ContextElementTest {
		
	/**
	* Test case for {@link ContextElement#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		ContextElement contextElement = new ContextElement();
		assertNotNull(contextElement.getTypeDesc());
	}
}

// ContextResponse.java
package mygrid.web;

public class ContextResponse implements java.io.Serializable {

    private mygrid.web.ArrayOfContextElement contextResponse;

    public ContextResponse() {
    }

    public mygrid.web.ArrayOfContextElement getContextResponse();

    public void setContextResponse(mygrid.web.ArrayOfContextElement contextResponse);

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj);

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode();

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(ContextResponse.class);

    static {
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc();

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType);

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType);
}

// ContextResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextResponse}.
* It contains ten unit test cases for the {@link ContextResponse#getTypeDesc()} method.
*/
class ContextResponseTest {
		
	/**
	* Test case for {@link ContextResponse#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		ContextResponse contextResponse = new ContextResponse();
		assertNotNull(contextResponse.getTypeDesc());
	}
}

// ContextService.java
package mygrid.web;

public interface ContextService extends java.rmi.Remote {

    public mygrid.web.ContextResponse getContext(java.lang.String contextName) throws java.rmi.RemoteException;
}

// ContextServiceLocator.java
package mygrid.web;

public class ContextServiceLocator extends org.apache.axis.client.Service implements mygrid.web.ContextService {

    public ContextServiceLocator() {
    }

    public ContextServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ContextServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ContextService
    private java.lang.String ContextService_address = "http://localhost:8080/wsrf/services/ContextService";

    public java.lang.String getContextServiceAddress();

    // The WSDD service name defaults to the port name.
    private java.lang.String ContextServiceWSDDServiceName = "ContextService";

    public java.lang.String getContextServiceWSDDServiceName();

    public void setContextServiceWSDDServiceName(java.lang.String name);

    public mygrid.web.ContextService getContextService() throws javax.xml.rpc.ServiceException;

    public mygrid.web.ContextService getContextService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;

    public static void usage();

    public static void main(java.lang.String[] args) throws Exception;
}

// ContextServiceSoapBindingStub.java
package mygrid.web;

public class ContextServiceSoapBindingStub extends org.apache.axis.client.Stub implements mygrid.web.ContextService {

    private java.util.Vector cachedSerClasses = new java.util.Vector();

    private java.util.Vector cachedSerQNames = new java.util.Vector();

    private java.util.Vector cachedSerFactories = new java.util.Vector();

    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc[] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[1];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getContext");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contextName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://web.mygrid.org/", "ContextResponse"));
        oper.setReturnClass(mygrid.web.ContextResponse.class);
        oper.setReturnQName(new javax