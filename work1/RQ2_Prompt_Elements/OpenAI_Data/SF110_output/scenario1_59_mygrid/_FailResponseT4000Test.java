// _FailResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _FailResponse}.
* It contains ten unit test cases for the {@link _FailResponse#getTypeDesc()} method.
*/
class _FailResponseTest {

	/**
	* Test case for the {@link _FailResponse#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		assertNotNull(_FailResponse.getTypeDesc());
	}
}

// _SuccessResponse.java
package mygrid.web;

public class _SuccessResponse implements java.io.Serializable {

    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }
}

// _SuccessResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SuccessResponse}.
* It contains ten unit test cases for the {@link _SuccessResponse#getTypeDesc()} method.
*/
class _SuccessResponseTest {
		
	/**
	* Test case for the {@link _SuccessResponse#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		assertNotNull(_SuccessResponse.getTypeDesc());
	}
}

// _Workflow.java
package mygrid.web;

public class _Workflow implements java.io.Serializable {

    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }
}

// _WorkflowTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Workflow}.
* It contains ten unit test cases for the {@link _Workflow#getTypeDesc()} method.
*/
class _WorkflowTest {
		
	/**
	* Test case for the {@link _Workflow#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		assertNotNull(_Workflow.getTypeDesc());
	}
}

// _WorkflowResponse.java
package mygrid.web;

public class _WorkflowResponse implements java.io.Serializable {

    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }
}

// _WorkflowResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _WorkflowResponse}.
* It contains ten unit test cases for the {@link _WorkflowResponse#getTypeDesc()} method.
*/
class _WorkflowResponseTest {
		
	/**
	* Test case for the {@link _WorkflowResponse#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		assertNotNull(_WorkflowResponse.getTypeDesc());
	}
}

// _WorkflowService.java
package mygrid.web;

public class _WorkflowService implements java.io.Serializable {

    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }
}

// _WorkflowServiceTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _WorkflowService}.
* It contains ten unit test cases for the {@link _WorkflowService#getTypeDesc()} method.
*/
class _WorkflowServiceTest {
		
	/**
	* Test case for the {@link _WorkflowService#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		assertNotNull(_WorkflowService.getTypeDesc());
	}
}

// _WorkflowServiceLocator.java
package mygrid.web;

public class _WorkflowServiceLocator extends org.apache.axis.client.Service implements mygrid.web.WorkflowService {

    public _WorkflowServiceLocator() {
    }


    public _WorkflowServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public _WorkflowServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for WorkflowServicePort
    private java.lang.String WorkflowServicePort_address = "http://localhost:8080/axis/services/WorkflowService";

    public java.lang.String getWorkflowServicePortAddress() {
        return WorkflowServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String WorkflowServicePortWSDDServiceName = "WorkflowServicePort";

    public java.lang.String getWorkflowServicePortWSDDServiceName() {
        return WorkflowServicePortWSDDServiceName;
    }

    public void setWorkflowServicePortWSDDServiceName(java.lang.String name) {
        WorkflowServicePortWSDDServiceName = name;
    }

    public mygrid.web.WorkflowService getWorkflowServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(WorkflowServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWorkflowServicePort(endpoint);
    }

    public mygrid.web.WorkflowService getWorkflowServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mygrid.web.WorkflowServiceSoapBindingStub _stub = new mygrid.web.WorkflowServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getWorkflowServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWorkflowServicePortEndpointAddress(java.lang.String address) {
        WorkflowServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mygrid.web.WorkflowService.class.isAssignableFrom(serviceEndpointInterface)) {
                mygrid.web.WorkflowServiceSoapBindingStub _stub = new mygrid.web.WorkflowServiceSoapBindingStub(new java.net.URL(WorkflowServicePort_address), this);
                _stub.setPortName(getWorkflowServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("WorkflowServicePort".equals(inputPortName)) {
            return getWorkflowServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.mygrid.org.uk/axis/services/WorkflowService", "WorkflowService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.mygrid.org.uk/axis/services/WorkflowService", "WorkflowServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("WorkflowServicePort".equals(portName)) {
            setWorkflowServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }
}

// _WorkflowServiceLocatorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _WorkflowServiceLocator}.
* It contains ten unit test cases for the {@link _WorkflowServiceLocator#getWorkflowServicePort()} method.
*/
class _WorkflowServiceLocatorTest {
		
	/**
	* Test case for the {@link _WorkflowServiceLocator#getWorkflowServicePort()} method.
	*/
	@Test
	void testGetWorkflowServicePort() {
		assertNotNull(_WorkflowServiceLocator.getWorkflowServicePort());
	}
}

// _WorkflowServiceSoapBindingStub.java
package mygrid.web;

public class _WorkflowServiceSoapBindingStub extends org.apache.axis.client.Stub implements mygrid.web.WorkflowService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[2];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWorkflow");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.mygrid.org.uk/axis/services/WorkflowService", ">getWorkflowResponse"));
        oper.setReturnClass(mygrid.web.GetWorkflowResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getWorkflowReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWorkflowAsXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getWorkflowAsXMLReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

    }

    public _WorkflowServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public _WorkflowServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public _WorkflowServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName