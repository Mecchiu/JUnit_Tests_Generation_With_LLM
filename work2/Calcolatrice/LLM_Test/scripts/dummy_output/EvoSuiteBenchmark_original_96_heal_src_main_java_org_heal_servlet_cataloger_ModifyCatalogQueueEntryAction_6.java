// ModifyCatalogQueueEntryActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.catalog.QueueDAO;
import org.heal.module.catalog.QueuedRecordBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import org.heal.util.FileLocator;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifyCatalogQueueEntryAction}.
* It contains one unit test case for the {@link ModifyCatalogQueueEntryAction#actionRequiresLogin()} method.
*/
class ModifyCatalogQueueEntryActionTest {
		ModifyCatalogQueueEntryAction(String name) {
		}
	}

// ModifyCatalogQueueEntryActionTest.java

/*
* Test class of {@link Action}
*/
class ActionTest {
		EventHandler e1;
		EventHandler e2;

		private void testEventHandler(int event) {
		}

		/**
     * @return <code>true</code>
    */
    public boolean actionRequiresLogin() {
        return true;
    }


		/**
     * @param t
     */
    public void setTestEventHandler(EventHandler t) {
        e1 = t;
        e2 = t;
	}



		public boolean requiresLogin() {
		    return false;
	}

	@Test
        public void testEventHandler() {
	    testEventHandler(1);
	}

	@Test
    public void testEventHandler2() {
	    testEventHandler(3);
	}

	@Test
    public void testUpdateMetadata() {
	    e1.setUpMeta(ShortMetadataBean.SOME_SHORT, false);
	    assertFalse(e1.isUpdatesAllowed());

	    e2.setUpMeta(ShortMetadataBean.SOME_SHORT, true);
	    assertTrue(e2.isUpdatesAllowed());
	    e2.addMeta(ShortMetadataBean.SOME_SHORT.getId(), ShortMetadataBean.SOME_SHORT.getValue());
	    assertTrue(e2.isUpdatesAllowed());
	    e2.removeMeta(ShortMetadataBean.SOME_SHORT);
	    assertFalse(e2.isUpdatesAllowed());
	    e2.clearAllMeta();
	    assertTrue(e2.isUpdatesAllowed());
	    e2.setUpMeta(ShortMetadataBean.NULL, true);
	    assertFalse(e2.isUpdatesAllowed());
	    e2.setUpMeta(ShortMetadataBean.BOAR, true);
	    assertTrue(e2.isUpdatesAllowed());
	    e2.setUpMeta(ShortMetadataBean.NULL.getId(), true);
	    assertTrue(e2.isUpdatesAllowed());
	    e2.removeMeta(ShortMetadataBean.BOAR);
	    assertFalse(e2.isUpdatesAllowed());
	    e2.setUpMeta(ShortMetadataBean.NULL.getId(), false);
	    assertFalse(e2.isUpdatesAllowed());
	    e2.setUpMeta(ShortMetadataBean.BOAR.getId(), false);
	    assertTrue(e2.isUpdatesAllowed());
	}


	@Test
	public void testEventHandler3() {
		/*
	    testEventHandler(1);
	*/
	}

        @Test
	public void testEventHandler4() {
	    testEventHandler(1);
	}

        @Test
	public void testEventHandler5() {
	    testEventHandler(1);
	}

	@Test
	public void testEventHandler6() {
	    testEventHandler(1);
	}

	@Test
	public void testEventHandler7() {
	    testEventHandler(1);
	}

	@Test
	public void testEventHandler8() {
	    testEventHandler(1);
	    testEventHandler(2);
	    testEventHandler(3);
	}

       public void testEventHandler10() {
       testEventHandler(0);
       testEventHandler(1);
       testEventHandler(2);
       testEventHandler(3);
       testEventHandler(4);
     }

      @Test
	public void testEventHandler11() {
		testEventHandler(0);
	}

   @Test
   public void testEventHandler12() {
	testEventHandler(0);
	testEventHandler(2);
   }

	@Test
     public void testEventHandler13() {
		testEventHandler(0);
	}

	@Test
	public void testDontAllowDeleteFromCatalog() {
	    testEventHandler(1);

            FileLocator.deleteFromCatalog(new File("TEST"));
            assertTrue(false);
	}

       @Test
	public void testResetCatches()
           throws IOException, ExceptionInInitializerError {
		    QueueDAO.getMetadatas();
	}

       @Test
        public void testCatchNoMetadata() throws ExceptionInInitializerError {
	    try {
		QueueDAO.getMetadatas();
		assertTrue(false);
	    } catch (ExceptionInInitializerError e) {
		    assertTrue(e.getMessage().equals("No metadata in queue.\n"));
	    }
	}




	@Test
	public void testCatchNoFile() throws ExceptionInInitializerError {

}
}