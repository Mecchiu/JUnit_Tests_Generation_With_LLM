// FileFollowingPaneTest.java
package ghm.follow.gui;

import ghm.follow.FileFollower;
import ghm.follow.io.JTextComponentDestination;
import ghm.follow.io.OutputDestination;
import ghm.follow.search.SearchableTextPane;
import java.awt.Font;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JScrollPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileFollowingPane}.
* It contains one unit test case for the {@link FileFollowingPane#autoPositionCaret()} method.
*/
class FileFollowingPaneTest {
		 class FileTextPaneTestCases extends FileReadingAndWritingTest{

				FileTextPaneTestCases(Class testClass,int latency) {
					super(testClass,latency);
				}

				protected Document getDocumentForReadingAndWriting(File f) throws BadLocationException {
					return DocumentBuilderFactory.newInstance().
							newDocumentBuilder().newDocument();
				}

				public File getFollowedFile();

				protected boolean isFollowing() {
					return true;
				}
		}

		 class FileFollowingPaneTestCases extends FileReadingAndWritingTest{

				FileFollowingPaneTestCases(Class testClass,int latency) {
					super(testClass,latency);
				}

				protected void setUpDocument(File f) throws Exception {
					fileFollower = new FileFollower(f);
					textArea = new SearchableTextPane();
					destination = new JTextComponentDestination(fileFollower);
				}
				protected void test_autoPositionCaret(){
					try {
						searchingForFile_autoPositionCaret();
						//TODO FAIL - this test is NOT supposed to use the autoselposCaret
					} catch (IOException &e){
						fail("Did not expect " + e.getClass() + " to be thrown.");
					}
				}
				protected void testing_followingFile_autoPositionCaret() throws Exception {
					followingFile_autoPositionCaret();
				}
				protected void testing_nextFile_autoPositionCaret() throws Exception {
					nextFile_autoPositionCaret();
				}

				public File getFollowedFile();

				protected boolean isFollowing() {
					return false;
				}
		}
	


}