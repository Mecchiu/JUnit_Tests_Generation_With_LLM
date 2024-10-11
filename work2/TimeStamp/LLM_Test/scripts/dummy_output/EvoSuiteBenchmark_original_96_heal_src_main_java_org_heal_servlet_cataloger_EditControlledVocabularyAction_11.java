// EditControlledVocabularyActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.TaxonPathBean;
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
* Test class of {@link EditControlledVocabularyAction}.
* It contains one unit test case for the {@link EditControlledVocabularyAction#actionRequiresLogin()} method.
*/
class EditControlledVocabularyActionTest {
		
	@Test
	void test() throws IOException, ServletException {

		String root = "editControlled;";
		CompleteMetadataBean completeBean = new CompleteMetadataBean();
        //CompleteMetadataBean completeBean = new CompleteMetadataBean();

		CompleteMetadataBean completeBean1 = new CompleteMetadataBean();
		CompleteMetadataBean completeBean2 = new CompleteMetadataBean();
		CompleteMetadataBean completeBean3 = new CompleteMetadataBean();
		completeBean.setComplete(true);
		completeBean1.setComplete(true);
		completeBean2.setComplete(false);
		completeBean3.setComplete(false);

		CompleteMetadataBean completeB = new CompleteMetadataBean();
		completeB.setComplete(false);
		completeBean1.setComplete(true);
		CompleteMetadataBean completeC = new CompleteMetadataBean();
		completeB.setComplete(true);
		completeC.setComplete(true);
		completeBean2.setComplete(false);

		CompleteMetadataBean completeD = new CompleteMetadataBean();
		completeD.setComplete(false);
		CompleteMetadataBean completeE = new CompleteMetadataBean();
		completeE.setComplete(false);
		completeD.setComplete(true);
		completeE.setComplete(false);

		CompleteMetadataBean completeF = new CompleteMetadataBean();
		completeF.setComplete(false);
		CompleteMetadataBean completeG = new CompleteMetadataBean();
		completeG.setComplete(false);
		CompleteMetadataBean completeH = new CompleteMetadataBean();
		CompleteMetadataBean completeI = new CompleteMetadataBean();
		CompleteMetadataBean completeJ = new CompleteMetadataBean();
		CompleteMetadataBean completeK = new CompleteMetadataBean();
		CompleteMetadataBean completeL = new CompleteMetadataBean();
		CompleteMetadataBean completeM = new CompleteMetadataBean();
		CompleteMetadataBean completeN = new CompleteMetadataBean();
		CompleteMetadataBean completeO = new CompleteMetadataBean();
		CompleteMetadataBean completeP = new CompleteMetadataBean();
		CompleteMetadataBean completeQ = new CompleteMetadataBean();
		CompleteMetadataBean completeR = new CompleteMetadataBean();
		CompleteMetadataBean completeS = new CompleteMetadataBean();

		CompleteMetadataBean completeT = new CompleteMetadataBean();

		CompleteMetadataBean completeU = new CompleteMetadataBean();
		CompleteMetadataBean completeV = new CompleteMetadataBean();

		CompleteMetadataBean completeW = new CompleteMetadataBean();
		CompleteMetadataBean completeX = new CompleteMetadataBean();

		CompleteMetadataBean completeY = new CompleteMetadataBean();

		CompleteMetadataBean completeZ = new CompleteMetadataBean();

		CompleteMetadataBean completeZ2 = new CompleteMetadataBean();
		CompleteMetadataBean completeZ3 = new CompleteMetadataBean();
		CompleteMetadataBean completeZ4 = new CompleteMetadataBean();

		TaxonBean taxon = new TaxonBean();
		Iterator<String> iter = taxon.iterator();
		assertEquals("taxon",iter.next());
		assertEquals("a.a.a",iter.next());
		assertEquals("a.a.abcd",iter.next());
		assertEquals("a.b.a",iter.next());
		assertEquals("a.c.x",iter.next());

		
		
		assertNotEquals("taxon",taxon.iterator()
					.next());
		assertEquals("a.a.a",taxon.iterator()
					.next() );
		assertEquals("a.a.abcd",taxon.iterator()
					.next() );
		assertEquals("b.a.a",taxon.iterator()
					.next() );
		assertEquals("b.abcd",taxon.iterator()
					.next() );

		assertEquals(taxon.iterator()
							.next()
							.toString(),taxon.iterator()
							.next() );
		assertEquals("a.abbcd",taxon.iterator()
							.next() );
		
		assertEquals(taxon.iterator()
					.next()
					.toString(),taxon.iterator()
					.next() );
		assertEquals("c.a.a",taxon.iterator()
					.next() );

		assertEquals(taxon.iterator()
					.next()
					.toString(),taxon.iterator()
					.next() );
		assertEquals("c.abc",taxon.iterator()
					.next() );
		
		assertEquals(taxon.iterator()
					.next()
					.toString(),taxon.iterator()
					.next() );
		assertEquals("c.abcd",taxon.iterator()
					.next() );

		assertEquals(taxon.iterator()
					.next()
					.toString(),taxon.iterator()
					.next() );
		assertEquals("c.b.c",taxon.iterator()
					.next() );

		assertEquals(taxon.iterator()
					.next()
					.toString(),taxon.iterator()
					.next() );
		assertEquals("c.b",taxon.iterator()
					.next() );
		
		assertEquals(taxon.iterator()
					.next()
					.toString(),taxon.iterator()
					.next() );
		assertEquals("c.c.c",taxon.iterator()
					.next() );
		assertEquals("c.c",taxon.iterator()
					.next() );
		
		assertEquals(taxon.iterator()
					.next()
					.toString(),taxon.iterator()
					.next() );
		assertEquals("c.c",taxon.iterator()
					.next() );
}
}