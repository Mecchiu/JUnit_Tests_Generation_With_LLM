// DownloadFolderTag_1Test.java
package org.heal.tag.download;

import org.heal.module.download.DownloadQueueBean;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.util.FileLocator;
import javax.servlet.jsp.tagext.TagSupport;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadFolderTag}.
* It contains one unit test case for the {@link DownloadFolderTag#doEndTag()} method.
*/
class DownloadFolderTag_1Test {

	/** Test file being used by the tag. */
	private static final FileLocator TEST_DIR = new FileLocator("jsp/temp", "tmp-test-tag");

	/**
	 * Tests for the tag.
	 */
	@Test
	public void testTag() {
		// First we need to see if the tag is being used by its components
		// and if so make sure it can be initialized properly with setText.
		boolean initialized = false;
		TEST_DIR.init();
		TEST_DIR.exists();
		DownloadFolderTag tag = new DownloadFolderTag();
		
		// Make sure it contains a file called test.TEST.DAT, which should be set to the testfile
		String text = tag.getText();
		String[] lines = text.split("\n");
		for (String line : lines) {
			if (line.endsWith("test.TEST.DAT")) {
				line = line.substring(0, line.indexOf('='));
				String[] fields = line.split("\\t");
				if (fields[0].equals("TESTFILE")) {
					break;
				}
			}
		}
		TEST_DIR.chdirToParent();
				
		if (!TEST_DIR.isDirectory()) {
			initialized = false;
		}
		// If the user changed to a new directory in the TEMP directory, it is fine
		// to just remove that directory (no matter what path) and make sure it is
		// still the new location.
		resetTag();
		initialized = false;
		// If we run into this problem, we need to figure out something else
		// and then bail without changing this value.
		// Otherwise on windows, only a single directory is created, as opposed to
		// N directories created by removing temp/foo/bar etc.
		String currentDir = System.getProperty("user.dir");
		String nextPath = System.getProperty("java.io.tmpdir");
		final int MAX_SIZE = 10;
		String[] paths = nextPath.split("/" + '/');
		int i = 0;
		while (i < MAX_SIZE && paths.length > i) {
			if (paths[i].equals(currentDir)) {
				//System.out.println(currentDir);
				//System.out.println(nextPath+" => " + paths[i]);
				break;
			}
			i++;
		}
		i++;
		if (i >= MAX_SIZE) {
			System.err.println("Could not find a new location to remove temp directory " + TEST_DIR.getName());
			System.setProperty("java.io.tmpdir", TEST_DIR.getName());
			i = 2;
		}

		resetTag();
		initialized = false;
		
		// The loop runs for one directory that is not removed.
		// This is a very important step to ensure that we are not
		// using a local directory that we are not using as this will
		// cause a very bad error.
		// Otherwise, as a result of this loop, we should be able to
		// still run on Windows, because, as long as both directories
		// remain on our local path, we can rely upon this.
		// If no local paths remain to be used, then this should not cause a hard error.
		// It is not a good way to test this, as in case of a windows system,
		// the directories are removed, and then the local are kept in the path.
		// So, when only a single directory remains, the current location can
		// no longer be used because it is not used. Thus we'll just test
		// for this.
		
		String[] temp = TEST_DIR.list();
		//System.out.println(temp);
		if (temp.length!= 0 ) {
			System.err.println("Could not remove temp directory ");
			System.err.println(TEST_DIR.getName());
			return;
		}
		
		// If no files remain then continue on to execute.
		resetTag();
		initialized = false;
		// Make sure all of the directories above do not exist yet
		for (int j = 2; j < temp.length; j++) {
			//System.out.println(temp[j]);
			String fname = temp[j];
			
			String[] fields = fname.split("\\t");
			if (fname.startsWith(currentDir)) {
				continue;
			}

			TEST_DIR.init();
			//System.out.println("Tried to stat testfile '" + fname + "'");
			String msg = "File '" + fname + "' does not exist. Skipped";
			String message = "  - ";
			String path = String.valueOf(j);
			if (fname.endsWith(".jar")) {
				status = SUCCESS;
				msg = ("  - file '" + fname + "' does not exist, continuing test");
				message = "  - file does not exist, continuing test";
			} else if (fname.endsWith(".zip")) {
				status = SUCCESS;
				msg = ("  - file '" + fname + "' is corrupt, continuing test");
				message = "  - file