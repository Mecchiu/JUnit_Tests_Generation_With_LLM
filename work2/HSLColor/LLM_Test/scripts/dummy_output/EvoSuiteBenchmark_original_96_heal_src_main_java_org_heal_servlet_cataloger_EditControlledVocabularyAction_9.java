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
		
	/**
	 * Test suite
	 * @param args test parameters
	 */
	public static void main(String[] args) {
		EditControlledVocabularyActionTest test = new EditControlledVocabularyActionTest();
		test.setUp();
	}
	
	/**
	 * Set up
	 */
	@Test
	public void setUp() {
		// create two Taxonomies
		CompleteMetadataBean taxon0 = new CompleteMetadataBean();
		taxon0.setName("T0");
		taxon0.addAuthority("a");
		CompleteMetadataBean taxon1 = new CompleteMetadataBean();
		taxon1.setName("T1");
		taxon1.setAuthors("a");
		CompleteMetadataBean taxon2 = new CompleteMetadataBean();
		taxon2.setName("T2");
		taxon2.setAuthors("b");

		CompleteMetadataBean taxon3 = new CompleteMetadataBean();
		taxon3.setName("T3");
		taxon3.setAuthors("b");
		CompleteMetadataBean taxon4 = new CompleteMetadataBean();
		taxon4.setName("T4");
		taxon4.setAuthors("c");
		// we will make two species entries using one taxonomikey and one entry
		CompleteMetadataBean taxon5 = new CompleteMetadataBean();
		taxon5.setName("T5");
		taxon5.setAuthors("d");

		CompleteMetadataBean taxon6 = new CompleteMetadataBean();
		taxon6.setName("T6");
		taxon6.setAuthors("d");
		
		// create four taxonomikes to the three Taxonomies
		Iterator<CompleteMetadataBean> i = CompleteMetadataBean.valuesFor(taxon0, taxon1, taxon2, taxon3, taxon5, taxon6, "a", "b");
		Iterator<CompleteMetadataBean> t = CompleteMetadataBean.valuesFor(taxon0, taxon2, taxon3, taxon5, taxon6, "a", "b");
		
		i.next();
		t.next();

		// create four taxonomikes to the four taxonomikes
		Iterator<CompleteMetadataBean> i2 = CompleteMetadataBean.valuesFor(taxon0, taxon1, taxon2, taxon3, taxon4, taxon5, taxon6, "a", "b");
		Iterator<CompleteMetadataBean> t2 = CompleteMetadataBean.valuesFor(taxon0, taxon2, taxon3, taxon5, taxon6, "a", "b");
		Iterator<CompleteMetadataBean> t3 = CompleteMetadataBean.valuesFor(taxon0, taxon2, taxon4, taxon5, taxon6, "a", "b");
		Iterator<CompleteMetadataBean> t4 = CompleteMetadataBean.valuesFor(taxon0, taxon4, taxon5, taxon6, "a", "b");

		// make a taxonomical entry for each taxonomike
		CompleteMetadataBean taxonomicalEntries[][] = new CompleteMetadataBean[4][];
		taxonomicalEntries[0] = new CompleteMetadataBean[4];
		taxonomicalEntries[1] = new CompleteMetadataBean[4];
		taxonomicalEntries[2] = new CompleteMetadataBean[4];
		taxonomicalEntries[3] = new CompleteMetadataBean[4];
		
		taxonomicalEntries[0][0] = new CompleteMetadataBean();
		taxonomicalEntries[0][0].setName("T0");
		taxonomicalEntries[0][0].addAuthority("a");
		taxonomicalEntries[0][1] = new CompleteMetadataBean();
		taxonomicalEntries[0][1].setName("T1");
		taxonomicalEntries[0][1].setAuthors("a");
		taxonomicalEntries[0][2] =  new CompleteMetadataBean();
		taxonomicalEntries[0][2].setName("T2");
		taxonomicalEntries[0][2].setAuthors("b");
		taxonomicalEntries[0][3] =  new CompleteMetadataBean();
		taxonomicalEntries[0][3].setName("T3");
		taxonomicalEntries[0][3].setAuthors("b");
		
		taxonomicalEntries[1][0] = new CompleteMetadataBean();
		taxonomicalEntries[1][0].setName("T0");
		taxonomicalEntries[1][0].addAuthority("a");
		taxonomicalEntries[1][1] = new CompleteMetadataBean();
		taxonomicalEntries[1][1].setName("T1");
		taxonomicalEntries[1][1].setAuthors("b");
		taxonomicalEntries[1][2] =  new CompleteMetadataBean();
		taxonomicalEntries[1][2].setName("T2");
		taxonomicalEntries[1][2].setAuthors("c");
		taxonomicalEntries[1][3] =  new CompleteMetadataBean();
		taxonomicalEntries[1][3].setName("T3");
		taxonomicalEntries[1][3].setAuthors("c");

		taxonomicalEntries[2][0] = new CompleteMetadataBean();
		taxonomicalEntries[2][0].setName("T0");
		taxonomicalEntries[2][0].addAuthority("a");
		taxonomicalEntries[2][1] = new CompleteMetadataBean();
		taxonomicalEntries[2][1].setName("T1");
		taxonomicalEntries[2][1].setAuthors("b");
		taxonomicalEntries[2][2] = new CompleteMetadataBean();
}
}