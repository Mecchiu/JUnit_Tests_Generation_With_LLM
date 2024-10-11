// ModifyMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifyMetadataAction}.
* It contains one unit test case for the {@link ModifyMetadataAction#actionRequiresLogin()} method.
*/
class ModifyMetadataActionTest {
		static final int N = 10;
	public static ModifyMetadataActionTest instance = new ModifyMetadataActionTest();

	
	@Test
	public void testActionRequiresLogin() throws ServletException, IOException {
		instance.checkLoginOnly();
	}

  
  @Test
  public void checkLogout() throws IOException {
  	try {
      // 1. Login should fail
      instance.checkLoginOnly();
  	} catch (ServletException | IOException e) {
  		assertEquals(401, instance.getStatusCode());
  	}
  }

  
  @Test
  public void checkLoginOnly() throws ServletException, IOException {
  	System.err.println("================== Starting ModifyMetadataActionTest");
  	instance.checkLoginOnly();
  	System.err.println("================== Successfully Finished ModifyMetadataActionTest");
  }

  
  @Test
  public void mapContainsValueWithCorrectFields() throws ServletException, IOException {
  	System.err.println("================== Starting ModifyMetadataActionTest");
  	instance.checkLoginOnly();

  	int num = 0;
  	Map map = new HashMap();
  	map.put("field1", N);
  	map.put("field2", N);
  	map.put("field3", N);
  	map.put("field4", N);
  	map.put("field5", N);
  	map.put("field6", N);
  	map.put("field7", N);
  	instance.modifyResponseMap(map, Collections.emptyList());

  	assertEquals(15, instance.getNumFieldsModified());
  	assertNotNull(instance.getModifiedMetadata());
  	assertEquals("field1", instance.getModifiedMetadata().getField(0));
  	assertNotNull(instance.getModifiedMetadata().getField(1));
  	assertNotNull(instance.getModifiedMetadata().getField(2));
  	assertNotNull(instance.getModifiedMetadata().getField(3));
  	assertNotNull(instance.getModifiedMetadata().getField(4));
  	assertNotNull(instance.getModifiedMetadata().getField(5));
  	assertNotNull(instance.getModifiedMetadata().getField(6));
  	assertNotNull(instance.getModifiedMetadata().getField(7));
  	assertEquals("field3", instance.getModifiedMetadata().getField(8));
  	assertNotNull(instance.getModifiedMetadata().getField(9));
  	assertNotNull(instance.getModifiedMetadata().getField(10));
  	assertNotNull(instance.getModifiedMetadata().getField(11));
  	assertNotNull(instance.getModifiedMetadata().getField(12));
  	assertEquals("field5", instance.getModifiedMetadata().getField(13));
  	assertNotNull(instance.getModifiedMetadata().getField(14));
  	assertNotNull(instance.getModifiedMetadata().getField(15));
  }
}