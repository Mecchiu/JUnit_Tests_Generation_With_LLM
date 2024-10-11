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
	public void testGetTypeDesc() {
		_FailResponse _FailResponse = new _FailResponse();
		assertNotNull(_FailResponse.getTypeDesc());
	}
}

// _SuccessResponse.java
package mygrid.web;

public class _SuccessResponse implements java.io.Serializable {

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc();
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
	public void testGetTypeDesc() {
		_SuccessResponse _SuccessResponse = new _SuccessResponse();
		assertNotNull(_SuccessResponse.getTypeDesc());
	}
}

// _TestResponse.java
package mygrid.web;

public class _TestResponse implements java.io.Serializable {

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc();
}

// _TestResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _TestResponse}.
* It contains ten unit test cases for the {@link _TestResponse#getTypeDesc()} method.
*/
class _TestResponseTest {
		
	/**
	* Test case for the {@link _TestResponse#getTypeDesc()} method.
	*/
	@Test
	public void testGetTypeDesc() {
		_TestResponse _TestResponse = new _TestResponse();
		assertNotNull(_TestResponse.getTypeDesc());
	}
}

// _TestResponse_SOAPStub.java
package mygrid.web;

public class _TestResponse_SOAPStub implements mygrid.web.TestResponse, org.apache.axis.client.Stub {
    private org.apache.axis.client.Call _call;
    private java.lang.String _endpoint = null;
    private java.util.Vector _any;

    public _TestResponse_SOAPStub() {
        _call = new org.apache.axis.client.Call();
        _any = new java.util.Vector();
    }

    public _TestResponse_SOAPStub(java.lang.String endpoint) {
        _call = new org.apache.axis.client.Call();
        _any = new java.util.Vector();
        _endpoint = endpoint;
    }

    public java.lang.String getEndpoint() {
        return _endpoint;
    }

    public void setEndpoint(java.lang.String endpoint) {
        _endpoint = endpoint;
        if (_call != null) {
            _call.setTargetEndpointAddress(endpoint);
        }
    }

    public void setOperationTimeout(int timeout) {
        if (_call != null) {
            _call.setTimeout(timeout);
        }
    }

    public int getOperationTimeout() {
        if (_call != null) {
            return _call.getTimeout();
        }
        return 0;
    }

    public void _setProperty(java.lang.String name, java.lang.Object value) {
        if (_call != null) {
            _call.setProperty(name, value);
        }
    }

    public java.lang.Object _getProperty(java.lang.String name) {
        if (_call != null) {
            return _call.getProperty(name);
        }
        return null;
    }

    public mygrid.web.TestResponseResponse testResponse(mygrid.web.TestResponseRequest testResponseRequest) throws java.rmi.RemoteException {
        if (_call != null) {
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.timeout != null) {
                _call.setTimeout(super.timeout);
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
            return (mygrid.web.TestResponseResponse) _call.invoke(new java.lang.Object[] { testResponseRequest });
        } else {
            throw new org.apache.axis.NoEndPointException();
        }
    }

    public mygrid.web.TestResponseResponse testResponse(mygrid.web.TestResponseRequest testResponseRequest, java.lang.String testResponseRequest_type_info) throws java.rmi.RemoteException {
        if (_call != null) {
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.timeout != null) {
                _call.setTimeout(super.timeout);
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
            return (mygrid.web.TestResponseResponse) _call.invoke(new java.lang.Object[] { testResponseRequest, testResponseRequest_type_info });
        } else {
            throw new org.apache.axis.NoEndPointException();
        }
    }

    public mygrid.web.TestResponseResponse testResponse(mygrid.web.TestResponseRequest testResponseRequest, java.lang.String testResponseRequest_type_info, java.lang.String testResponseRequest_type_info2) throws java.rmi.RemoteException {
        if (_call != null) {
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.timeout != null) {
                _call.setTimeout(super.timeout);
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
            return (mygrid.web.TestResponseResponse) _call.invoke(new java.lang.Object[] { testResponseRequest, testResponseRequest_type_info, testResponseRequest_type_info2 });
        } else {
            throw new org.apache.axis.NoEndPointException();
        }
    }

    public mygrid.web.TestResponseResponse testResponse(mygrid.web.TestResponseRequest testResponseRequest, java.lang.String testResponseRequest_type_info, java.lang.String testResponseRequest_type_info2, java.lang.String testResponseRequest_type_info3) throws java.rmi.RemoteException {
        if (_call != null) {
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.timeout != null) {
                _call.setTimeout(super.timeout);
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
                            org.apache.