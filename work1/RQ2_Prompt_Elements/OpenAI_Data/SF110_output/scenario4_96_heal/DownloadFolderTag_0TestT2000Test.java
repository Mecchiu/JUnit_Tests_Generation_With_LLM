// DownloadFolderTag_0Test.java
package org.heal.tag.download;

import org.heal.module.download.DownloadQueueBean;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.util.FileLocator;
import javax.servlet.jsp.tagext.TagSupport;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadFolderTag}.
* It contains ten unit test cases for the {@link DownloadFolderTag#doStartTag()} method.
*/
class DownloadFolderTag_0Test {

	/**
	* Test case 1 for method doStartTag.
	* The test case aims to test the situation when the following input parameters are valid:
	* <ul>
	* <li>downloadQueue = new DownloadQueueBean();</li>
	* <li>shortMetadata = new ShortMetadataBean();</li>
	* </ul>
	* The expected result is that the method returns TagSupport.EVAL_BODY_INCLUDE.
	*/
	@Test
	public void testDoStartTag_1() {
		DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
		downloadFolderTag.setDownloadQueue(new DownloadQueueBean());
		downloadFolderTag.setShortMetadata(new ShortMetadataBean());
		int result = downloadFolderTag.doStartTag();
		assertEquals(TagSupport.EVAL_BODY_INCLUDE, result);
	}
	
	/**
	* Test case 2 for method doStartTag.
	* The test case aims to test the situation when the following input parameters are valid:
	* <ul>
	* <li>downloadQueue = new DownloadQueueBean();</li>
	* <li>shortMetadata = null;</li>
	* </ul>
	* The expected result is that the method returns TagSupport.EVAL_BODY_INCLUDE.
	*/
	@Test
	public void testDoStartTag_2() {
		DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
		downloadFolderTag.setDownloadQueue(new DownloadQueueBean());
		downloadFolderTag.setShortMetadata(null);
		int result = downloadFolderTag.doStartTag();
		assertEquals(TagSupport.EVAL_BODY_INCLUDE, result);
	}
	
	/**
	* Test case 3 for method doStartTag.
	* The test case aims to test the situation when the following input parameters are valid:
	* <ul>
	* <li>downloadQueue = null;</li>
	* <li>shortMetadata = new ShortMetadataBean();</li>
	* </ul>
	* The expected result is that the method returns TagSupport.EVAL_BODY_INCLUDE.
	*/
	@Test
	public void testDoStartTag_3() {
		DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
		downloadFolderTag.setDownloadQueue(null);
		downloadFolderTag.setShortMetadata(new ShortMetadataBean());
		int result = downloadFolderTag.doStartTag();
		assertEquals(TagSupport.EVAL_BODY_INCLUDE, result);
	}
	
	/**
	* Test case 4 for method doStartTag.
	* The test case aims to test the situation when the following input parameters are valid:
	* <ul>
	* <li>downloadQueue = null;</li>
	* <li>shortMetadata = null;</li>
	* </ul>
	* The expected result is that the method returns TagSupport.EVAL_BODY_INCLUDE.
	*/
	@Test
	public void testDoStartTag_4() {
		DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
		downloadFolderTag.setDownloadQueue(null);
		downloadFolderTag.setShortMetadata(null);
		int result = downloadFolderTag.doStartTag();
		assertEquals(TagSupport.EVAL_BODY_INCLUDE, result);
	}
	
	/**
	* Test case 5 for method doStartTag.
	* The test case aims to test the situation when the following input parameters are valid:
	* <ul>
	* <li>downloadQueue = new DownloadQueueBean();</li>
	* <li>shortMetadata = new ShortMetadataBean();</li>
	* </ul>
	* The expected result is that the method returns TagSupport.EVAL_BODY_INCLUDE.
	*/
	@Test
	public void testDoStartTag_5() {
		DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
		downloadFolderTag.setDownloadQueue(new DownloadQueueBean());
		downloadFolderTag.setShortMetadata(new ShortMetadataBean());
		int result = downloadFolderTag.doStartTag();
		assertEquals(TagSupport.EVAL_BODY_INCLUDE, result);
	}
	
	/**
	* Test case 6 for method doStartTag.
	* The test case aims to test the situation when the following input parameters are valid:
	* <ul>
	* <li>downloadQueue = new DownloadQueueBean();</li>
	* <li>shortMetadata = new ShortMetadataBean();</li>
	* </ul>
	* The expected result is that the method returns TagSupport.EVAL_BODY_INCLUDE.
	*/
	@Test
	public void testDoStartTag_6() {
		DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
		downloadFolderTag.setDownloadQueue(new DownloadQueueBean());
		downloadFolderTag.setShortMetadata(new ShortMetadataBean());
		int result = downloadFolderTag.doStartTag();
		assertEquals(TagSupport.EVAL_BODY_INCLUDE, result);
	}
	
	/**
	* Test case 7 for method doStartTag.
	* The test case aims to test the situation when the following input parameters are valid:
	* <ul>
	* <li>downloadQueue = new DownloadQueueBean();</li>
	* <li>shortMetadata = new ShortMetadataBean();</li>
	* </ul>
	* The expected result is that the method returns TagSupport.EVAL_BODY_INCLUDE.
	*/
	@Test
	public void testDoStartTag_7() {
		DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
		downloadFolderTag.setDownloadQueue(new DownloadQueueBean());
		downloadFolderTag.setShortMetadata(new ShortMetadataBean());
		int result = downloadFolderTag.doStartTag();
		assertEquals(TagSupport.EVAL_BODY_INCLUDE, result);
	}
	
	/**
	* Test case 8 for method doStartTag.
	* The test case aims to test the situation when the following input parameters are valid:
	* <ul>
	* <li>downloadQueue = new DownloadQueueBean();</li>
	* <li>shortMetadata = new ShortMetadataBean();</li>
	* </ul>
	* The expected result is that the method returns TagSupport.EVAL_BODY_INCLUDE.
	*/
	@Test
	public void testDoStartTag_8() {
		DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
		downloadFolderTag.setDownloadQueue(new DownloadQueueBean());
		downloadFolderTag.setShortMetadata(new ShortMetadataBean());
		int result = downloadFolderTag.doStartTag();
		assertEquals(TagSupport.EVAL_BODY_INCLUDE, result);
	}
	
	/**
	* Test case 9 for method doStartTag.
	* The test case aims to test the situation when the following input parameters are valid:
	* <ul>
	* <li>downloadQueue = new DownloadQueueBean();</li>
	* <li>shortMetadata = new ShortMetadataBean();</li>
	* </ul>
	* The expected result is that the method returns TagSupport.EVAL_BODY_INCLUDE.
	*/
	@Test
	public void testDoStartTag_9() {
		DownloadFolderTag downloadFolderTag = new DownloadFolderTag();
		downloadFolderTag.setDownloadQueue(new DownloadQueueBean());
		downloadFolderTag.setShortMetadata(new ShortMetadataBean());
		int result = downloadFolderTag.doStartTag();
		assertEquals(TagSupport.EVAL_BODY_INCLUDE, result);
	}
	
	/**
	* Test case 10 for method doStartTag.
	* The test case aims to test the situation when the following input parameters are valid:
	* <ul>
	* <li>download