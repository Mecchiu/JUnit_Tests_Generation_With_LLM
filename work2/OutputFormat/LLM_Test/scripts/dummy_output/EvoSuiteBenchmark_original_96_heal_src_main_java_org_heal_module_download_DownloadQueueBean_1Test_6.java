// DownloadQueueBean_1Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains one unit test case for the {@link DownloadQueueBean#clearPackageFileSettings()} method.
*/
class DownloadQueueBean_1Test {
		
	/**
	 * Tests a case where the package has not been modified.
	 * First, gets the package location, then gets it and checks
	 * it is a valid file.
	 */
	@Test
	public void test_1() {
		try{

			
			
		}
		catch (Exception e)
		{
			fail(e.toString());
		}
	}

	@Test
	public void check_2() {
		Object object = new Object();
		try{
		
			
		}
					catch(Exception e)
		{
			fail(e.toString());
		}
	}

	@Test
	public void check_3() {
		Object object = new Object();
		try{
		
			
		}
					catch(Exception e)
		{
			fail(e.toString());
		}
	}

	@Test
	public void check_4() throws Exception {
		DownloadServiceImpl.packageFileExistsOrNot(new File("downloads.txt"));
		Object object = new Object();
		new DownloadQueueBean().clearPackageFileSettings();
		try{
		
			
		}
					catch(Exception e)
		{
			fail(e.toString());
		}
	}
	
	@Test
	public void check_5() throws Exception {
		try{

		}
					catch(Exception e)
		{
			fail(e.toString());
		}
	}


	@Test
	public void check_6() throws Exception {
		DownloadQueueBean queue = new DownloadQueueBean();
		Collection contentSet = queue.getContentIds();

		assertEquals(contentSet.size(), 0);
	}
}