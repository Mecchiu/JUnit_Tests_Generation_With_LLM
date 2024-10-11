// _LogonTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Logon}.
* It contains one unit test case for the {@link _Logon#getTypeDesc()} method.
*/
class _LogonTest {
		
    // instance variables
    
    private java.lang.String clusterUrl;
    private java.lang.String user;
    private java.lang.String password;
    
    /**
     * Method "getTypeDesc"
     * 
     * 
     * 
     * @return org.apache.axis.description.TypeDesc
     */
    public org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Method "getTypeDesc"
     * 
     * 
     * 
     * @return java.lang.Class
     */
    public java.lang.Class getTypeDesc1() {
        return _TypeDesc.class;
    }

    /**
     * Method "setClusterUrl"
     * 
     * 
     * 
     * @param clusterUrl
     */
    public void setClusterUrl(java.lang.String clusterUrl) {
        this.clusterUrl = clusterUrl;
    }

    /**
     * Method "setUser"
     * 
     * 
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }

    /**
     * Method "setPassword"
     * 
     * 
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }
    
    @Test
    public void test() {
    }

}