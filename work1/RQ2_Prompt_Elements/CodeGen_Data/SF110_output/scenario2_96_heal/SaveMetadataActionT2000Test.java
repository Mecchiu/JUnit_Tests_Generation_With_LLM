// SaveMetadataActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.ContextURLBean;
import org.heal.module.metadata.CopyrightHolderBean;
import org.heal.module.metadata.ContributorBean;
import org.heal.module.metadata.TaxonPathBean;
import org.heal.module.metadata.TaxonBean;
import org.heal.module.metadata.RequirementBean;
import org.heal.module.metadata.RelationBean;
import org.heal.module.metadata.MetametadataIdentifierBean;
import org.heal.module.metadata.MetametadataContributorBean;
import org.heal.module.catalog.QueueDAO;
import org.heal.servlet.Action;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SaveMetadataAction}.
* It contains one unit test case for the {@link SaveMetadataAction#actionRequiresLogin()} method.
*/
class SaveMetadataActionTest {

	/**
	 * This operation runs to the "Save Metadata" page.
	 * @exception ServletException if something goes wrong.
	 */
	@Test
	void run() throws ServletException {

		// Run operation with given arguments
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/test/SaveMetadataAction.do");
		HttpServletRequest request = getRequest();
		HttpServletResponse response = getResponse();
			
		// Call save operation using given parameters
		Iterator<SaveMetadataAction.Parameter> parameters = new SaveMetadataAction.ParamIterator(parameters());
		while(parameters.hasNext()) {
			request.setAttribute(parameters.next().attribute, parameters.next().value);
		}

		rd.forward(request, response);

	}
	
	private HttpServletRequest getRequest() throws ServletException {
		ContextURLBean contextURLBean = new ContextURLBean();
		contextURLBean.contextURL = "http://catalog.catheories.seaweed.org";
		
		
		HeraldMetaData metadata = new HeraldMetaData();
		metadata.metadataContributor.metadataContributorId = "haldem1";
		metadata.metadataContributor.metadataContributors = new String[] { "aljh"};
		metadata.metadataContributor.authorId = "aljh";
		metadata.metadataContributor.authorName = "aljh";
		metadata.metadataContributor.contributors = new String[] { "aljh"};
		metadata.metadataContributor.taxons = new String[] { "aljh"};
		metadata.metadataContributor.taxPaths = new String[] {"aljh"};
		
		QueueDAO queueDAO = new QueueDAO();
		queueDAO.insertQueue(QueueDAO.QueueType.CONQUESTION);

		
		ContributorBean contributorBean = new ContributorBean();
		contributorBean.title = "contr1";
		contributorBean.author = "aljh";
		contributorBean.description = "";
		
		ContributorBean contributorBean1 = new ContributorBean();
		contributorBean1.title = "contr2";
		contributorBean1.author = "aljh";
		contributorBean1.description = "";
		
		ContributorBean contributorBean2 = new ContributorBean();
		contributorBean2.title ="contr3";
		contributorBean2.author ="aljh";
		contributorBean2.description = "";

		ContributorBean contributorBean3 = new ContributorBean();
		contributorBean3.title ="contr4";
		contributorBean3.author ="aljh";
		contributorBean3.description = "";
		
		ContributorBean contributorBean4 = new ContributorBean();
		contributorBean4.title = "contr5";
		contributorBean4.author ="aljh";
		contributorBean4.description = "";
		
		
		
		TaxonBean taxon = new TaxonBean();
		taxon.taxId = "TaxId0";
		taxon.taxName = "Tax Name0";
		
		
		
		taxonPathBean = new TaxonPathBean();
		taxPathBean.taxonPath = new String[] { "TaxonPath1" };
		
		TaxonBean taxonBean = new TaxonBean();
		taxonBean.taxonName = "taxName2";
		
		RequirementBean requirement = new RequirementBean();
		requirement.name = "RequirementName2";
		requirement.content = "";
		
		
		TaxonPathBean taxonPathBean1 = new TaxonPathBean();
		taxonPathBean1.taxonPath = new String[] { "TaxonPath1" };
		
		
		TaxonBean taxBean1 = new TaxonBean();
		taxBean1.taxonName = "taxName2";
		
	
				
		TaxonPathBean taxPathBean2 = new TaxonPathBean();
		taxPathBean2.taxonPath = new String[] { "TaxonPath2" };
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		

		CompleteMetadataBean metadataBean = new CompleteMetadataBean();
		metadataBean.taxopath = new String[] { "Taxopath3" };
		
		contributorBean.taxBean = new TaxBean();
		contributorBean1.taxBean = new TaxBean();
		contributorBean2.taxBean = new TaxBean();
		
		
