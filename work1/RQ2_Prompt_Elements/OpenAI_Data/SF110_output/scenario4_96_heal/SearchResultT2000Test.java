// SearchResultTest.java
package org.merlot.fedsearch.type;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResult}.
* It contains ten unit test cases for the {@link SearchResult#getTypeDesc()} method.
*/
class SearchResultTest {

	/**
	* Test case for {@link SearchResult#getTypeDesc()} method.
	*/
	@Test
	public void testGetTypeDesc() {
		// TODO: implement this test case
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}
}

// SearchResultElement.java
package org.merlot.fedsearch.type;

public class SearchResultElement implements java.io.Serializable {

    private java.lang.String description;

    private java.lang.String title;

    private java.lang.String url;

    public SearchResultElement() {
    }

    public SearchResultElement(java.lang.String description, java.lang.String title, java.lang.String url) {
    }

    /**
     * Gets the description value for this SearchResultElement.
     *
     * @return description
     */
    public java.lang.String getDescription();

    /**
     * Sets the description value for this SearchResultElement.
     *
     * @param description
     */
    public void setDescription(java.lang.String description);

    /**
     * Gets the title value for this SearchResultElement.
     *
     * @return title
     */
    public java.lang.String getTitle();

    /**
     * Sets the title value for this SearchResultElement.
     *
     * @param title
     */
    public void setTitle(java.lang.String title);

    /**
     * Gets the url value for this SearchResultElement.
     *
     * @return url
     */
    public java.lang.String getUrl();

    /**
     * Sets the url value for this SearchResultElement.
     *
     * @param url
     */
    public void setUrl(java.lang.String url);

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj);

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode();

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(SearchResultElement.class, true);

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

// SearchResultElementTest.java
package org.merlot.fedsearch.type;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchResultElement}.
* It contains ten unit test cases for the {@link SearchResultElement#getTypeDesc()} method.
*/
class SearchResultElementTest {
		
	/**
	* Test case for {@link SearchResultElement#getTypeDesc()} method.
	*/
	@Test
	public void testGetTypeDesc() {
		// TODO: implement this test case
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}
}

// SearchService.java
package org.merlot.fedsearch.service;

public interface SearchService extends java.rmi.Remote {

    public org.merlot.fedsearch.type.SearchResult search(java.lang.String query, java.lang.String category, int startIndex, int endIndex) throws java.rmi.RemoteException;
}

// SearchServiceLocator.java
package org.merlot.fedsearch.service;

public class SearchServiceLocator extends org.apache.axis.client.Service implements org.merlot.fedsearch.service.SearchService {

    public SearchServiceLocator() {
    }

    public SearchServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SearchServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SearchService
    private java.lang.String SearchService_address = "http://localhost:8080/axis/services/SearchService";

    public java.lang.String getSearchServiceAddress();

    // The WSDD service name defaults to the port name.
    private java.lang.String SearchServiceWSDDServiceName = "SearchService";

    public java.lang.String getSearchServiceWSDDServiceName();

    public void setSearchServiceWSDDServiceName(java.lang.String name);

    public org.merlot.fedsearch.service.SearchService getSearchService() throws javax.xml.rpc.ServiceException;

    public org.merlot.fedsearch.service.SearchService getSearchService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}

// SearchServiceSoapBindingStub.java
package org.merlot.fedsearch.service;

public class SearchServiceSoapBindingStub extends org.apache.axis.client.Stub implements org.merlot.fedsearch.service.SearchService {

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
        oper.setName("search");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "category"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startIndex"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "endIndex"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://service.fedsearch.merlot.org/", "SearchResult"));
