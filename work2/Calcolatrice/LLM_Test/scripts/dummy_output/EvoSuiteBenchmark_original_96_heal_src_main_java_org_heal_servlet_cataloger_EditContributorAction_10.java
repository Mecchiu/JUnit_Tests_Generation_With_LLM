// EditContributorActionTest.java
package org.heal.servlet.cataloger;

import org.heal.servlet.Action;
import org.heal.module.metadata.CompleteMetadataBean;
import org.heal.module.metadata.ContributorBean;
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
* Test class of {@link EditContributorAction}.
* It contains one unit test case for the {@link EditContributorAction#actionRequiresLogin()} method.
*/
class EditContributorActionTest {
		static class ContributorBeanTest {
	    private String name;
	    private String address;
	    private int rating;

	    ContributorBeanTest(String name, String address, int rating) {
	        this.name = name;
	        this.address = address;
	        this.rating = rating;
	    }

	    public String getName() {
	        return this.name;
	    }

	    public String getAddress() {
	        return this.address;
	    }

	    public int getRating() {
	        return this.rating;
	    }

	    public boolean actionRequiresLogin() {
	        return this.name.equals("John Doe");
	    }
		}

		public static Iterator<ContributorBeanTest> validIterator() {
			Iterator<ContributorBeanTest> iterator = new TestIterator();
			return iterator;
		}
    }

/**
* A unit test case for {@link EditContributorAction#validIterator()}.
* It generates two tests, test1 and test2.
*/
class TestIterator implements Iterator<ContributorBeanTest> {
		static class TestIterator extends java.util.Iterator<ContributorBeanTest> {
	    private ContributorBeanTest currentTest;

	    public TestIterator(){
	    }

	    TestIterator(Iterator<ContributorBeanTest> testIterator){
	        setContIterator(testIterator);
	    }

	    public Iterator<ContributorBeanTest> getContIterator() {
	        return this.currentTest.getContIterator();
	    }

	    public void setContIterator(Iterator<ContributorBeanTest> testIterator) {
	        this.currentTest = testIterator;
	    }

		public ContributorBeanTest next() {
			return this.currentTest;
		}

		public void remove() {
			this.currentTest = null;
		}
		}
    
/**
* Unit test case for {@link EditContributorAction#validIterator()}.
* It removes the tested iterator from the test set.

 */
			public void testClear() {
				assertTrue("Test remove should have failed, because there aren't test elements!", this.testIterator.hasNext());
				ContributorBeanTest tmpTest = this.testIterator.next();
				
				boolean removeSuccess = true;
				ListMetadataBean metaTest = tmpTest.getCompleteMetadata();
				Iterator<CompleteMetadataBean> it = metaTest.getCompleteMetadataIterator();
				
				List<CompleteMetadataBean> metaTest2 = new ListMetadataBean();
				it.add(metaTest2);
			
				for (Iterator<ContributorBeanTest> aTester = this.testIterator; aTester.hasNext(); ) {
					ContributorBeanTest tester = aTester.next();
					int cTest=tester.getName().equalsIgnoreCase(tmpTest.getName())? 2 : 1;
		        
					tester.getAddress().length();
		        
					tester.getRating().length();
					tester.getAddress();
		        
					tester.getAddress().equalsIgnoreCase(tmpTest.getAddress());
					tester.getAddress();
		        
					tester.getName();
					tester.getName().equalsIgnoreCase(tmpTest.getName());
		        
					tester.getRating();
					tester.getRating().equalsIgnoreCase(tmpTest.getRating());
					tester.getAddress();
					tester.getAddress();
		        
					tester.getName();
					tester.getRate();
					tester.getName();
					tester.getName();
		        
					tester.getAddress();
					tester.getName();
					tester.getName();
					tester.getName();
					tester.getName();
		        
					tester.getName();
					tester.getRate();
		        
					tester.getName();
					tester.getName();
					tester.getName();
		        
					tester.getAddress();
					tester.getRate();
		        
					tester.getAddress();
					tester.getRate();
					tester.getAddress();
					tester.getName();
					tester.getRate();
		        
					tester.getAddress();
					tester.getName();
					tester.getRate();
	        		removeSuccess = removeSuccess && removeSuccess;
	        }
				
				assertTrue("Test remove was not successful!", removeSuccess);
				
				this.testIterator.remove();

				assertFalse("Test should have no next", this.testIterator.hasNext());
				
				ListMetadataBean listMetadata = new ListMetadataBean();
				Iterator<CompleteMetadataBean> it2 = listMetadata.getCompleteMetadataIterator();

				Iterator<CompleteMetadataBean> it1 = listMetadata.getCompleteMetadataIterator();
				Iterator<CompleteMetadataBean> it3 = listMetadata.getCompleteMetadataIterator();

				int i1 = 0, i2 = 0;
				Iterator<ContributorBeanTest> aTester3 = it3;

				while (aTester3.hasNext()) {
					listMetadata.forEach(new ContributorBeanTest(aTester3.next(), null, 0));
					i1++;
					aTester3.next();
					i2++;
		        }
				
				int i2 = 0, i3 = 0;
				Iterator<ContributorBeanTest> aTester4 = it1;

				while (aTester4.hasNext()) {
					listMetadata.forEach(new ContributorBeanTest(aTester4.next(), null, 0));
					i3++;
					aTester4.next();
					i2++;
		        }

				listMetadata.foreach(new ContributorBeanTest(null, null, 0));
				i2 = 0;
				aTester4 = it1;
				while (aTester4.hasNext()) {
					i2++;
				}
		        
				assertTrue("Test 3 is not empty", listMetadata.getCompleteMetadata() == null || listMetadata.getCompleteMetadata().size() > 0);
				
}
}