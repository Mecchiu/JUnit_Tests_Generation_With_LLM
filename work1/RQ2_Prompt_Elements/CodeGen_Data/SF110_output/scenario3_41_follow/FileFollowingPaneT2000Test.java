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
class AutoPositioningTextPanel extends SearchableTextPane {
				/**
				 * Constructor.
				 *
				 * @param document the document to which text is to be appended
				 */
				public AutoPositioningTextPanel(Document document) {
					super(document);
				}
				protected void autoPositionCaret() {
					try {
						int current = getDocument().getLength();
						Document doc = getDocument();
						int first = doc.getLength();
						doc.insertString(current, " ", null);
						doc.setText(0, getDocument().getLength());
						assertNotNull("setLength(false) should not have failed!", current);
						assertTrue("document text should not have been cleared", first > 0);
						assertTrue("document should have just been added!", getDocument().getLength() == current);
						doc.getText(++current, 1);
						assertTrue("document text should have been updated", getDocument().getLength() == current - 1);
						assertTrue("document text should be empty", doc.getText(new Integer(first)) == "");
					}
					catch (BadLocationException e) {
						fail("setLineSeparator(false) should not have failed!", e);
					}
				}
				public AutoPositioningTextPanel(Document document, Font font) {
					super(document, font);
				}
				public AutoPositioningTextPanel(Document document, Font font, int size) throws BadLocationException {
					super(document, font, size);
				}
				protected AutoPositioningTextPanel(Document document, Font font, int size, boolean vertical) throws BadLocationException {
					super(document, font, size, vertical);
				}
				public AutoPositioningTextPanel(Document document, Font font, int size, boolean vertical, int startline, int endline) throws BadLocationException {
					super(document, font, size, vertical, startline, endline);
				}
		}

		// Constructor for following Pane, which does the real work.
		public FileFollowingPaneTest(FileFollower ff, OutputDestination od) {
		  	super();
		  	this.fileFollower = ff;
		  	this.od = od;
		  	this.init();
		}
		public void init() {
			try {
				fileFollower.start();
				this.fileFollowingTextPane
						.setInputDestination(new JTextComponentDestination(fileFollower.getOutputFile()));
				FileOutputStream fo = new FileOutputStream(fileFollowingTextPane.getCurrentOutputFile());
				long[] bytesToWrite = new long[(sizeHint.width+sizeHint.height)/2];
				for (long i = 0; i < sizeHint.width; i++) {
					for (long j = 0; j < sizeHint.height; j++) {
						long l = 0;
				    	l = i;
				    	l = l << 32;
				    	l = l | j;
				    	l = l << 32;
				    	l = l | (i-l)+l;
				    	fo.write(l);
					}
					l = bytesToWrite[0];
					l = l << 32;
					l = l | i;
					l = l << 32;
					l = l | (i-l)+l;
					fo.write(l);
					bytesToWrite[0] = l;
					bytesToWrite[1] = bytesToWrite[1] << 32;
					bytesToWrite[1] = bytesToWrite[1] | i;
					fo.write(bytesToWrite);
				}
				fo.flush();
				fo.close();
				assertTrue("Output file should be written!", fileFollowingTextPane.getTextFile().exists());
				assertTrue("Output file should be closed!", fileFollowingTextPane.getTextFile().isNonStrictModeEnabled());
			}
			catch (IOException e) {
				fail("Unable to create output file!");
			}
		}
		/**
		 * This method should throw {@link BadLocationException} when autoPositioning the appended
		 *  file position is beyond the end of the text area.
		 */
		public boolean autoPositionCaret(){
			try {
				this.fileFollowingTextPane.getText().delete(getDocument().getLength(),
						getDocument().getLength());
				this.fileFollowingTextPane.getScrollPane().getHorizontalScrollBar().setValue(0);
				this.fileFollowingTextPane.getScrollPane().setHorizontalScrollBarPolicy(
						JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
				JTextComponentDestination outputDestination =
						(JTextComponentDestination)fileFollower.getOutputFile();
				outputDestination.setOutputFile(this.fileFollowingTextPane.getCurrentOutputFile());
				if (!autoPositionCaret()) {
					assertTrue("Output text should have been appended!", this.fileFollowingTextPane.getTextFile().exists());
					Document document = getDocument();
					AutoPositioningTextPanel textPanel = new AutoPositioningTextPanel(document, Font.decode("Courier 710, MS Sans Serif"));
					try {
						long p = textPanel.findPosition(document.getLength());
						throw new RuntimeException("BadPositionException should have been thrown for the auto position, but was not");
					}
					catch (RuntimeException t) {
						String msg = "The autoPositionCaret should have failed, but got the exception: ";
						msg += t.getMessage();
						Logger.getLogger("hg4hm").log(Level.SEVERE, msg);
					}
				}
			} catch (BadLocationException e) {
			}
			return autoPositionCaret();
		}
		FileFollowingTextPane fileFollowingTextPane;
		OutputDestination fileFollowingTextPane;
		FileFollower fileFollower;
		OutputDestination fileFollowerOutputd;
		OutputDestination od;
		FileFollowingTextPane fileFollowingTextPane;
		OutputDestination fileFollowingTextPaneOutputd;
		Logger logger = Logger