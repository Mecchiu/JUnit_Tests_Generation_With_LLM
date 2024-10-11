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
		public boolean pass = true;
		public boolean fail = false;
		
		private File outdir = null;
		private boolean noFile = true;
		private boolean noDir = true;
		private boolean dirSet = false;
		
		@Test
		public void testClear() throws Exception {
			outdir = new File("/tmp/testClear");
			if (noDir)
				noDir = true;
			try {
				DownloadQueueBean bean = new DownloadQueueBean();
				bean.setOutdir(outdir);
				bean.getContentSet().addAll(getContentIds());
				bean.getPackageFileLocation();
			}
			catch (Exception cause) {
				fail("cannot make sure outdir set properly - exception is" + cause.getMessage());
			}
		}
		@Test
		public void testSet() throws Exception {
			noDir = true;
			noFile = true;
			dirSet = false;
			try {
				DownloadQueueBean bean = new DownloadQueueBean();
				bean.clearPackageFileSettings();
				fail("expected to throw an exception");
			}
			catch (Exception cause) {
				fail("expected this to fail - " + cause.getMessage());
			}
			try {
				DownloadQueueBean bean = new DownloadQueueBean();
				bean.setOutdir(null);
				fail("expected to throw a IllegalArgument");
			}
			catch (IllegalArgumentException ctx) {
				// expected
			}
			try {
				DownloadQueueBean bean = new DownloadQueueBean();
				bean.addToQueue("");
				fail("expected to throw an IllegalArgument");
			}
			catch (IllegalArgumentException ctx) {
				// expected
			}
		}
	}