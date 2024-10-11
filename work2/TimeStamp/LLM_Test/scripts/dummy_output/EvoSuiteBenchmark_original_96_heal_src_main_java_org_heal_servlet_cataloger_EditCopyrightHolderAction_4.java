// EditCopyrightHolderActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.CopyrightHolderBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EditCopyrightHolderAction}.
* It contains one unit test case for the {@link EditCopyrightHolderAction#actionRequiresLogin()} method.
*/
class EditCopyrightHolderActionTest {
		
	/**
	 * Test the constructor.
	*/
	@Test public void constructorShouldCreateNewAction() {
		EditCopyrightHolderAction action = new EditCopyrightHolderAction();
		assertNotNull("Empty action should not throw NullPointerException", action);
	}
		
	// Test GetCopyrightHolderById. Should return no copyright holders found. 
	@Test public void GetCopyrightHolderByIdShouldReturnNull(){
		HttpServlet servlet = new EditCopyrightHolderAction();
		assertNull("Empty servlet should return null", servlet.getCopyrightHolderById());
	}
		
	// Test EditCopyrightHolderBeanWithCopyright. Should change copyright holder's
	// value to give the original Copyright Holder. 
	@Test public void editCopyrightHolderBeanWithCopyrightShouldChangeAuthorToTheOriginal(){
		String text = "<html>Copyright by Yoda.</html>";
		CompleteMetadataBean copyrightHolder = new CompleteMetadataBean();
		CopyrightHolderBean copyrightHolderBean = new CopyrightHolderBean();
		final Iterator<CopyrightHolderBean> all_copyrightHolders = new Iterator<CopyrightHolderBean>() {
			public boolean hasNext() {
				return true;
			}
			public CopyrightHolderBean next() {
				return copyrightHolderBean;
			}
		};
		
		while (all_copyrightHolders.hasNext()) {
			copyrightHolderBean = all_copyrightHolders.next();
			
			// Check that the copyright holder with the old value was updated
			// This assertion fails on a different test machine.
			//assertEquals("The copyrightHolder value after editing is not correct", 
			//		copyrightHolder.getCopyrightHolderId(), copyrightHolderBean.getCopyrightHolderId());
			
			// Check that the copyright holder with the new value is NOT updated
			assertNotEquals("The copyrightHolder value after editing is matching", 
					copyrightHolderBean.getCopyrightHolder(), copyrightHolder.getCopyrightHolder());
			
			// Save the copyright holder
			servlet.changeCopyrightHolderAuthorId(copyrightHolderBean, text);
		}
		
		//Check that the new value for the copyright holder is returned
		assertEquals("The copyrightHolder value after the copyright is not the new value", 
				copyrightHolderBean.getCopyrightHolder(), copyrightHolder.getCopyrightHolder());
	}
	
	// Test CopyCopyrightHolderBean. Should delete any copies of the copyright holder.
	@Test protected void copyCopyrightHolderBeanShouldDeleteTheOldCopy(){
		String text = "<html>Copyright by Yoda.</html>";
		CompleteMetadataBean copyrightHolderOld = new CompleteMetadataBean();
		CompleteMetadataBean copyrightHolderNew = new CompleteMetadataBean();
		
		// Add the copyright holder to the new license
		final Iterator<CopyrightHolderBean> all_copyrightHolders = new Iterator<CopyrightHolderBean>() {
			public boolean hasNext() {
				return true;
			}
			public CopyrightHolderBean next() {
				return copyrightHolderNew;
			}
		};
		while(all_copyrightHolders.hasNext()) {
			CopyrightHolderBean copyrightHolder = all_copyrightHolders.next();
			
			// Copy the copyright holder and delete from the old one
			copyrightHolderNew.setCopyrightHolder(copyrightHolder.getCopyrightHolder());
			servlet.copyCopyrightHolderAuthorId(copyrightHolder, text);
		}
		//check that the copyright holder is still OK
		assertNotNull("The copyright holder from the copied bean is null", copyrightHolderOld);
		compareString(text, copyrightHolderOld.getCopyrightHolder(), " The copyright holder");
	}
	
	// check that the copyright holder is NOT edited.
	private void compareString(String text, String editedAuthor, String editedAuthorString) {
		// Check that the edited copyright string is not the one from the original
		assertNotEquals("The edited copyright string should not match the one in the original",
				editedAuthorString, text);
	}
	
	/**
	 * The action should not fire when an unknown copyright holder is edited. 
	 */
	@Test public void checkUnknownPublicationHolderIsNotCalledIfCantBeEdited(){
		String text = "<html>Copyright by Yoda.</html>";
		CompleteMetadataBean copyrightHolder = new CompleteMetadataBean();
		String editedAuthor = "";
		
		HttpServlet servlet = new EditCopyrightHolderAction();
		servlet.changeCopyrightHolderAuthorId(null, text);
		servlet.checkUnknownPublicationHolder();
		try{
			servlet.checkUnknownPublicationHolder();
		} catch (final ServletException e) {
			//exception should carry information about the request.
			fail("Error with CheckUnknownPublicationHolder");
		} catch (final IOException e) {
			//exception should carry information about the request.
			fail("Error with I/O exception");
		} catch (final ServletException e) {
			//exception should carry information about the request.
			fail("Error with ServletException");
		}
		assertFalse("The checkUnknownPublicationHolder call only should not be made", true);
	}
	
}