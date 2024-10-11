// JVCRequestContext_8Test.java
package com.pmdesigns.jvc;

import java.io.*;
import java.util.*;
import java.net.HttpURLConnection;
import javax.servlet.*;
import javax.servlet.http.*;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.util.Streams;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JVCRequestContext}.
* It contains one unit test case for the {@link JVCRequestContext#makeLink(String, String, String)} method.
*/
class JVCRequestContext_8Test {

	private Integer _status;
    private Map<String,Object> _properties;
	
	/**
    * Constructor for JVCRequestContext_8Test.
	*/
    public JVCRequestContext_8Test() {
    }
    
    /**
     * Creates a new instance of this JVCRequestContext test.
     * @return a create JVC request context.
	 */
    public static JVCRequestContext createContext() {
        return new JVCRequestContext();
    }
    /**
	 * Set a status to this request.
	 * @param status a new status for the request.
	 * @exception Exception if there was an actionable error.
	 */
    public void setStatus(Integer status) {
        _status = status;
    }
	
	/**
    * Get a status from the request context.<br>
    * This method returns null as the values are irrelevant unless the 
    * value of the property is null.  If it returns a property-value a 
    * IllegalArgumentException will be caught.
	* @return a value from the request context. 
	*/
    public Integer getStatus(){
    	this._properties = (Map<String,Object>) _properties.get("status");
		return null;
	}
	
	/**
    * Set a property from this request context.  If a new status is found
    * this property value will be set.
	* @param key the new property key that will cause the value of the 
	* current status to be set.  This value is used for the 
	* "status".
	* @param value a new value for the property.
	*/
    public void setProperty(String key, Object value) {
    	_properties.put(key, value);
    }

	/**
	 * Set a property from this request context.  If the property is
	 * a parameter this will set the value according an <CODE>String</CODE> value.
	 * @param key the property key that will be set.
	 * @param value a <CODE>String</CODE> to set the property value.
	 */
    public void setProperty(String key, String value) {
    	this.setProperty(key, value.toCharArray());
    }
	
	/**
    * Get a property value for the request context.  If no property is defined
    * this will return null as the property value.
	* @return a <CODE>String</CODE> value from the request context.
	*/
    public String getProperty(String key) {
    	return (String) _properties.get(key);
	}
	
	/**
    * Get a property value for the request context.  If no property is defined
    * this will return <CODE>null</CODE> as the property value.
	* @return an <CODE>Object</CODE> value from the request context.
	*/
    public Object getProperty(String key, Object def) {
		return (Object) _properties.get(key, def);
	}
		
    /**
     * Retrieves the map that provides the current status for the request.
     * @return the map that provides the current status.
    */
    public Map getPropertyMap() {
        return _properties;
    }
	
  	/**
    * Retrieves the Map that provides the current status for the request.  The map can
    * either be a Map of a property key to a object to retrieve the property-value as
    * a String, or a List of property key-values to retrieve a List of String values.
    * If the property was set to Object this will return the value of that property.
    * If it was set to String this will return the value of that property as the value.
    * @return the Map that provides the current status.
    */
    public Map getStatusMap() {
        Map currentStatus = (Map) getProperty("status");
		if (currentStatus == null)
			return getPropertyMap();
		return (Map)currentStatus;
	}
	
	/**
	 * Get the path variable for this request context.
	 * @return the path for this request context.
	 * @exception Exception if there was an actionable error.
	 */
    public String getPath() {
    	if (_status == null)
    		return getProperty("path");
    	return (String) _status;
    }
	
	/**
    * This method returns <CODE>null</CODE> as the value of the property map.
    * @return <CODE>null</CODE> as the value of the property map.
	 */
    public Map<String,Object> getPropertyMap() {
    	return _properties;
    }	
	
	/**
	 * Get the content type for this request context.
	 * @return the content type for this request context.
	 */
    public String getContentType() {
    	return (String) _properties.get("contenttype");
	}
	
  	/**
    * Returns the current HTTP request object.  This will always contain the
    * servlet request object set in this test or one of the other parent 
    * class methods.
    * @return a <CODE>HttpServletRequest</CODE> object.
	*/
    public HttpServletRequest getRequest() {
    	return (HttpServletRequest) _properties.get("request");
    }	
    /**
    * Get an integer value that is the status from the request context.  This is
    * never <CODE>null</CODE>.
    * @return An integer value that is the status from this object.  Returns
	* zero as it always returns <CODE>null</CODE>.
    * @exception Exception if there was an actionable error in the request.
	*/
	public Integer getStatus() throws Exception {
    	return _status;
	}
	
	/**
    * Returns the <CODE>Writer</CODE> attached to the request object.
    * @return the <CODE>Writer</CODE> this object's attached to.
	 */
    public File getOutputWriter() {
    	return (File) _properties.get("outputwriter");
	}
	
	/**
    * Gets the outputstream attached to the request object.
    * @return the outputstream this object's attached to.
	 */
    public OutputStream getOutputStream() 
    