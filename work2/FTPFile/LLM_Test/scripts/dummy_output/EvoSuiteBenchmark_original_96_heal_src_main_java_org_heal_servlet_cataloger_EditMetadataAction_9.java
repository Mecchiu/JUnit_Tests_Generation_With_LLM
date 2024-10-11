// EditMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.TargetUserGroupBean;
import org.heal.module.metadata.ContributorBean;
import org.heal.module.metadata.CopyrightHolderBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import org.heal.util.VCardBean;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EditMetadataAction}.
* It contains one unit test case for the {@link EditMetadataAction#actionRequiresLogin()} method.
*/
class EditMetadataActionTest {
		
  @Test
  public void testGetters() {
    CompleteMetadataBean completeMetadata = new CompleteMetadataBean();
    CompleteMetadataBean completeMetadata2 = new CompleteMetadataBean();
    CompleteMetadataBean completeMetadata3 = new CompleteMetadataBean();
    Map<String, Copyable> m = new HashMap<String, SetCopyable>();
    m.put("myid", "1");
    CompleteMetadataBean completeMetadata4 = new CompleteMetadataBean();
    
    assertTrue(MetadataDAO.getCompleteMetadata(m).contains(completeMetadata));
    
    assertTrue(MetadataDAO.getCompleteMetadata(m, completeMetadata).contains(completeMetadata));
  }

  @Test
  public void testSetters() {
    CompleteMetadataBean completeMetadata = new CompleteMetadataBean();
    CompleteMetadataBean completeMetadata2 = new CompleteMetadataBean();
    CompleteMetadataBean completeMetadata3 = new CompleteMetadataBean();
    Map<String, Copyable> m = new HashMap<String, SetCopyable>();
    m.put("myid", "1");
    CompleteMetadataBean completeMetadata4 = new CompleteMetadataBean();
    
    completeMetadata.setCompleteMetadata(completeMetadata2);
    completeMetadata2.setCompleteMetadata(completeMetadata2);

    assertTrue(MetadataDAO.getCompleteMetadata(m).contains(completeMetadata2));
    
    completeMetadata.setCompleteMetadata(completeMetadata3);
    completeMetadata3.setCompleteMetadata(completeMetadata3);
    
    assertTrue(MetadataDAO.getCompleteMetadata(m).contains(completeMetadata3));

    completeMetadata1 = new CompleteMetadataBean();
    completeMetadata1.setCompleteMetadata(completeMetadata2);
    
    CompleteMetadataBean completeMetadata2n = new CompleteMetadataBean();
    completeMetadata2n.addCompleteMetadata(completeMetadata1);
    
    completeMetadata1.setCompleteMetadata(completeMetadata2n);
  
    assertTrue(MetadataDAO.getCompleteMetadata(m).contains(completeMetadata2));
    
    CompleteMetadataBean completeMetadata2e = new CompleteMetadataBean();
    completeMetadata2e.addCompleteMetadata(completeMetadata1);
    
    completeMetadata1.setCompleteMetadata(completeMetadata2e);
  
    assertTrue(MetadataDAO.getCompleteMetadata(m).contains(completeMetadata2));
    assertTrue(MetadataDAO.getCompleteMetadata(m, completeMetadata1).contains(completeMetadata1));
    assertNotNull(MetadataDAO.getCompleteMetadata(m, completeMetadata1), "the first call of getCompleteMetadata should return the complete metadata for the correct object");
    final Iterator it = MetadataDAO.getCompleteMetadata(m, completeMetadata1).iterator();
    if (!it.hasNext()) {
      fail("the object returned by the first call of getCompleteMetadata() does not contain the correct entry");
    }
  }

}