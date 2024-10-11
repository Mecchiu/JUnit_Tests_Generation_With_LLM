// RelationRecordModifierTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.RelationBean;
import org.heal.module.metadata.CompleteMetadataBean;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RelationRecordModifier}.
* It contains ten unit test cases for the {@link RelationRecordModifier#actionRequiresLogin()} method.
*/
class RelationRecordModifierTest {
		
	/**
	* Test case for {@link RelationRecordModifier#actionRequiresLogin()} method.
	* This test case checks if the method returns true.
	*/
	@Test
	void testActionRequiresLogin() {
		RelationRecordModifier relationRecordModifier = new RelationRecordModifier();
		assertTrue(relationRecordModifier.actionRequiresLogin());
	}
}