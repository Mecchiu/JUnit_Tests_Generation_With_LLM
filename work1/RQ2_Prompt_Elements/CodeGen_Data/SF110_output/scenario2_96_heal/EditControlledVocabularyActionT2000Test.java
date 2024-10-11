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
     * Test method for {@link EditControlledVocabularyAction#actionRequiresLogin()}
     * for case <code>1, 2</code> 
     */
    @Test
    public void test1() {
        final CompleteMetadataBean<TaxonBean> metadata =
                newCompleteMetadataBean(new TaxonBean("test1", 1, 1, "test1", 0, 0));
        EditControlledVocabularyAction
               .actionRequiresLogin(
                                metadata,
                                "http://www.heal.org/cataloger/taxon", 
                                HttpServletResponse.SC_OK);
        assertTrue("The action should be called to edit the correct taxon in the catalog",
                    EditControlledVocabularyAction.actionRequiresLogin("test1", metadata));
    }

    /**
     * Test method for {@link EditControlledVocabularyAction#actionRequiresLogin()}
     * for case <code>0, 1</code> 
     */
    @Test
    public void test2() {
		
        final CompleteMetadataBean<TaxonBean> metadata =
                newCompleteMetadataBean(new TaxonBean("test2", 1, 1, "test2", 0, 0));
        EditControlledVocabularyAction
               .actionRequiresLogin(
                                metadata,
                                "http://www.heal.org/cataloger/taxon", 
                                HttpServletResponse.SC_OK);
        assertTrue("The action should be called to edit the correct taxon in the catalog",
                    EditControlledVocabularyAction.actionRequiresLogin("test2", metadata));
    }
    
	/**
	 * Test method for {@link EditControlledVocabularyAction#actionRequiresLogin()}
	 * for case <code>2, 1</code>
	 */
	@Test
	public void test3() {
	
		final CompleteMetadataBean<TaxonBean> metadata =
				newCompleteMetadataBean(new TaxonBean("test2", 2, 1, "test2", 0, 0));
		EditControlledVocabularyAction
		               .actionRequiresLogin(
		                                metadata,
		                                "http://www.heal.org/cataloger/taxon", 
		                                HttpServletResponse.SC_OK);
		assertTrue("The action should be called to edit the correct taxon in the catalog",
				EditControlledVocabularyAction.actionRequiresLogin("test2", metadata));
	}

	/**
	 * Test method for {@link EditControlledVocabularyAction#actionRequiresLogin()}
	 * for case <code>-2, 0</code>
	 */
	@Test
	public void test4() {
	
		final CompleteMetadataBean<TaxonBean> metadata =
				newCompleteMetadataBean(new TaxonBean("test2", -2, 0, "test2", 0, 0));
		EditControlledVocabularyAction
				.actionRequiresLogin(
		                                metadata,
		                                "http://www.heal.org/cataloger/taxon", 
		                                HttpServletResponse.SC_OK);
		assertTrue("The action should be called to edit the correct taxon in the catalog",
				EditControlledVocabularyAction.actionRequiresLogin("test2", metadata));
	}

	@Test
	public void test5() throws Exception {
	
		final HttpServletRequest req = new FakeHttpServletRequest("get", "http://www.heal.org/cataloger");
		String csvFile = "../../../../../../../http://www.heal.org/cataloger/taxon/1";
		RequestDispatcher dispatcher = new SimpleHttpServletRequestWrapper(req)
		.addParameter("csvFile", csvFile).getDispatcher();
		TestServlet.getInstance().runAll();
		final Iterator<CompleteMetadataBean<TaxonBean>> expectedResult =
				new Iterable<CompleteMetadataBean<TaxonBean>>() {
						@Override
						public Iterator<CompleteMetadataBean<TaxonBean>>iterator() {
                            return new Iterator<CompleteMetadataBean<TaxonBean>>() {

                                @Override
                                public boolean hasNext() {
                                    return true;
                                }

                                @Override
                                public CompleteMetadataBean<TaxonBean> next() {
                                    return new CompleteMetadataBean<TaxonBean>() {
                                        @Override
                                        public String getAttribute(String key) {
                                            return null;
                                        }
                                    };
                                }

                                @Override
                                public void remove() {
                                    throw new UnsupportedOperationException();
                                }
                                
                            };
                        }
                    };
		assertTrue("Only one taxon should exist, " +
				   "but I got back a result of the following: " + 
				   expectedResult,
				   expectedResult.hasNext());
		
		expectedResult.next();
		expectedResult.close();
		
		final Iterator <CompleteMetadataBean<TaxonBean>> results = expectedResult.iterator();
	    assertTrue("The taxon data should NOT be deleted, but does not exist", 
	            results.hasNext());
	    results.next();
	    results.close();
		
		final CompleteMetadataBean<TaxonBean> taxonomy = results.next();
		assertTrue("The taxon data should be deleted, but does not exist", 
				taxonomy.getAttribute(CompleteMetadataBean.ATTRIBUTE_NAME_TAXON_PATH) == null);
	    assertFalse("The taxon data should NOT exist", taxonomy.getAttribute(CompleteMetadataBean.ATTRIBUTE_NAME_TAXON_PATH) == null);
		
		final Iterator<TaxonBean> taxonomies = 
		        new Iterator<TaxonBean>() {
			@Override public boolean hasNext() { return true; }
			@Override public TaxonBean next() { return new TaxonBean("foo", 1, 1, "", 0, 0); }
			@Override public void remove() { 
				throw new Un