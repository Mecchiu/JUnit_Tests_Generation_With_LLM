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
        oper.setReturnQName(new javax.xml.namespace.QName("", "getContextReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;
    }

    public ContextServiceSoapBindingStub() throws org.apache.axis.AxisFault {
        this(null);
    }

    public ContextServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public ContextServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service) super.service).setTypeMappingVersion("1.2");
    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName = (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class) cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class) cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        } else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory) cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory) cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        } catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public mygrid.web.ContextResponse getContext(java.lang.String contextName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://web.mygrid.org/", "getContext"));
        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            java.lang.Object _resp = _call.invoke(new java.lang.Object[] { contextName });
            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (mygrid.web.ContextResponse) _resp;
                } catch (java.lang.Exception _exception) {
                    return (mygrid.web.ContextResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mygrid.web.ContextResponse.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void setRequestHeaders(org.apache.axis.client.Call call) throws java.lang.Exception {
        call.setRequestHeader("Accept-Encoding", "gzip,deflate");
        call.setRequestHeader("Content-Type", "text/xml;charset=UTF-8");
    }

    public void setAttachments(org.apache.axis.client.Call call) throws java.lang.Exception {
    }

    public void extractAttachments(org.apache.axis.client.Call call) throws java.lang.Exception {
    }
}

// ContextServiceTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextService}.
* It contains ten unit test cases for the {@link ContextService#getContext(String)} method.
*/
class ContextServiceTest {
		
	/**
	* Test case for {@link ContextService#getContext(String)} method.
	*/
	@Test
	void testGetContext() {
		ContextService contextService = new ContextService();
		assertNotNull(contextService.getContext(""));
	}
}

// ContextServiceTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextService}.
* It contains ten unit test cases for the {@link ContextService#getContext(String)} method.
*/
class ContextServiceTest {
		
	/**
	* Test case for {@link ContextService#getContext(String)} method.
	*/
	@Test
	void testGetContext() {
		ContextService contextService = new ContextService();
		assertNotNull(contextService.getContext(""));
	}
}

// ContextServiceTest.java
package