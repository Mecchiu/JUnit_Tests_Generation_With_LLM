// CreateMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CreateMetadataAction}.
* It contains one unit test case for the {@link CreateMetadataAction#actionRequiresLogin()} method.
*/
class CreateMetadataActionTest {
		
    /**
     * Perform creation check of metadata record, the following is done in this manner:
     * 1) We need a valid user ID!
     * 2) We need a valid token
     * 3) We need an ID to look up record!
     *
     * @throws ServletException
     * @throws SQLException
     * @throws java.sql.SQLException
     */
    @Test
    public void testAction() throws ServletException, SQLException {
        
        System.err.println("creating metadata record");
        // Get ID of the user
        String userId = AuthenticationTools.getLoggedInUserId();
        // Get the ID to use for the record
        String idToUse = "testId";
        // Create the object
        CompleteMetadataBean metadata = new CompleteMetadataBean();
        metadata.setId(idToUse);
        assertEquals("metadataID", idToUse);
        assertEquals("userId",userId);

        // Fill the record
        metadata.setName("TestName1");
        metadata.setSsn("TestSsn1");
        metadata.setUpdatedDate(new Date(System.currentTimeMillis()));
        metadata.setOwner(AuthenticationTools.getLoggedInRole());
        assertEquals("metadataID", idToUse);
        assertEquals("metadataName", "TestName1");
        assertEquals("ssn", "TestSsn1");
        assertEquals("userId",userId);
        assertNotNull("metadata record", metadata);
    }
    
    @Test
    public void testActionNoUser(){
        
        // Get ID of the user
        String userId = AuthenticationTools.getLoggedInUserId();
        // Create the object
        String idToUse = "testId";
        Map parameters = new HashMap();
        parameters.put("id", "testId");
        parameters.put("name", "TestName2");
        parameters.put("ssn", "TestSsn2");
        parameters.put("createdDatetime", new Date(System.currentTimeMillis()));
        parameters.put("owner",AuthenticationTools.getLoggedInRole());
        assertTrue("failed to create metadata record", MetadataDAO.create(idToUse, parameters).size()>0);
        Action action = null;
        try {
            Class<?> actionClass = Class.forName("org.junit.jupiter.api.TestAction");
            Method createMetaDataMethod = actionClass.getMethod("createMetaData");
            Object result = createMetaDataMethod.invoke(action, null);
            
        }
        catch (Exception e){
            e.printStackTrace();
            fail("Invalid Class of MetaDataAction");
        }

        // Let user login
        WebDriver driver = new WebDriver();
        String url = "http://"+AuthenticationTools.getLoggedInUsername()+":"+AuthenticationTools.getLoggedInPort()+"/";
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        try {
            driver.get(url);
            driver.findElements(By.name("login")).get(0).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Thread.sleep((System.currentTimeMillis()+(1000*1000))-1000);
        
        // Validate that creation succeeds
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[3]/div[2]/h4")).click();
        driver.findElement(By.linkText("Metadata Creator")).click();
        assertEquals(2, driver.findElements(By.xpath("/html/body/div[1]/div[1]/div")).size());
        
        // Let user logout
        driver.findElement(By.linkText("Logout")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/h4")).click();
        driver.findElement(By.linkText("Logout")).click();
        driver.findElement(By.linkText("Logout")).click();
        driver.findElement(By.linkText("Logout")).click();
        
        driver.findElement(By.cssSelector(".icon-login")).click();
        Action action2 = null;
        try {
            action2 = (Action) Class.forName("org.junit.jupiter.api.TestAction").getConstructor(HttpSession.class, HttpServlet.class).newInstance(driver, driver.manage());
        } catch (Exception e){
            e.printStackTrace();
            fail("Invalid Class of MetaDataAction");
        }
}
}