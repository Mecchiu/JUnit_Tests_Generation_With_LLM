// _RequestTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Request}.
* It contains one unit test case for the {@link _Request#getTypeDesc()} method.
*/
class _RequestTest {
		
	/**
	* Tests the constructor of {@link _Request}.
	*/
	@Test
     public void testConstructor(){
         mygrid.web.Request request = new mygrid.web.Request();
         assertNull(request.getTypeDesc());
     }
    

	/**
	* Tests the method of {@link _Request#getJob()}.
	*/
	@Test
     public void testGetJob(){
         mygrid.web.Request request = new mygrid.web.Request();
         mygrid.web.Job job = request.getJob();
         assertNotNull(job);
     }
	
	/**
	* Tests the method of {@link _Request#setJob(mygrid.web.Job)}.
	*/
	@Test
     public void testSetJob(){
         mygrid.web.Request request = new mygrid.web.Request();
         mygrid.web.Job job = new mygrid.web.Job();
         request.setJob(job);
         assertNotNull(job);
     }
	

	/**
	* Tests the method of {@link _Request#getId()}.
	*/
	@Test
     public void testGetId(){
         mygrid.web.Request request = new mygrid.web.Request();
         mygrid.web.Id id = request.getId();
         assertNull(id);
     }
	
	/**
	* Tests the method of {@link _Request#getUuid()}.
	*/
	@Test
     public void testGetUuid(){
         mygrid.web.Request request = new mygrid.web.Request();
         mygrid.web.Uuid uuid = request.getUuid();
         assertNull(uuid);
     }
	

	/**
	* Tests the method of {@link _Request#setUuid(mygrid.web.Uuid)}.
	*/
	@Test
     public void testSetUuid(){
         mygrid.web.Request request = new mygrid.web.Request();
         mygrid.web.Uuid uuid = new mygrid.web.Uuid();
         request.setUuid(uuid);
         assertNotNull(uuid);
     }
	

	/**
	* Tests the method of {@link _Request#getName()}.
	*/
	@Test
     public void testGetName(){
         mygrid.web.Request request = new mygrid.web.Request();
         mygrid.web.NameName name = request.getName();
         assertNotNull(name);
     }
	
	
	
}