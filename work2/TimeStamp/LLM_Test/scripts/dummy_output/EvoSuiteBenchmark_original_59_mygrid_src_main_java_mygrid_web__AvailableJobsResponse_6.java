// _AvailableJobsResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobsResponse}.
* It contains one unit test case for the {@link _AvailableJobsResponse#getTypeDesc()} method.
*/
class _AvailableJobsResponseTest {
		
    private mygrid.web.AvailableJobsResponse result = null;
    
    /**
     * Test init method.
     */
    @Test
    public void testInit() {
        int i = 0;
        result = new _AvailableJobsResponse();
        java.lang.String s = result.getTypeDesc();
        java.lang.String ss = "No Available Job for Group : \u001B\u001A(0);\u0000";
        assertEquals(s, "No Available Job for Group : \u001B\u001A(0);\u0000");
        assertEquals(ss, "An Error has occurred. Please contact support");
        try {
            result = new _AvailableJobsResponse("No Available Job for Group : \"\", 0, 3,");
        } catch (exception ex) {
            assertTrue(ex instanceof SystemException);
        }
        try {
            result = new _AvailableJobsResponse(null);
        } catch (exception ex) {
            assertTrue(ex instanceof NullPointerException);
        }
        try {
            result = new _AvailableJobsResponse("Error Message!!!!!!", null, null);
        } catch (exception ex) {
            assertTrue(ex instanceof java.io.IOException);
        }
        try {
            result = new _AvailableJobsResponse("Error Message!!!!!!", "", null);
        } catch (exception ex) {
            assertTrue(ex instanceof java.io.IOException);
        }
        try {
            result = new _AvailableJobsResponse("Error Message!!!!!!", (java.util.Iterator<java.lang.String>)null, null);
        } catch (java.io.IOException ex) {
			assertTrue(ex instanceof org.apache.axiom.om.OMException);
        }
        try {
            result = new _AvailableJobsResponse("No Available Job for Group : \"\", 0, 3","This message cannot be generated correctly");
        } catch (java.io.IOException ex) {
        	assertTrue(ex instanceof org.apache.axiom.om.OMException);
        }
    }

   

    /**
     * Test stringConverter
     */
    @Test
    public void testStringConverter() throws java.io.IOException {
        // create mygrid.web.arrayOfJob
        @com.fasterxml.jackson.annotation.JsonProperty("AvailableJob.group")
                public java.lang.String getAvailableJobsResult_group() throws java.io.IOException;
        @com.fasterxml.jackson.annotation.JsonProperty("AvailableJobsResult")
                public java.lang.String getAvailableJobsResultString();
    }

    /**
     * Test arrayOfJob
     */
   @Test
   public void testArrayOfJob() throws java.io.IOException {
   
       String s = "No Available Job for Group : \u001B\u001A(0);\u0000" + "An Error has occurred. Please contact support"; 
       // assertEquals("No Available Job for Group : \u001B\u001A(0);\u0000", "No Available Job for Group : \"\"", s);
       assertEquals("No Available Job for Group : \u001B\u001A(0);\u0000", "No Available Job for Group : \"\"", s);
       assertThrows(java.io.IOException.class,"Error occurred converting ","Error Message!!!"); 
    
    }

    /**
     * Test arrayOfJob
     */
   @Test
   public void testArrayOfJobDefault() throws java.io.IOException {
   
       String s = "No Available Job for Group : \"\", 0, 3 ; An Error has occurred. Please contact support"; 
       // assertEquals("No Available Job for Group : \"\"", "No Available Job for Group : \"\", 0, 3", s);
       assertEquals("No Available Job for Group : \"\"", "No Available Job for Group : \"\"", s);
       assertThrows(java.io.IOException.class,"Error occurred converting ","Error Message!!!"); 
    
    }
}