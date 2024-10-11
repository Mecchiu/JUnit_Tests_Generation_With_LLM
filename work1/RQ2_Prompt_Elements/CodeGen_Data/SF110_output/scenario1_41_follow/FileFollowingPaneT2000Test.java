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
/**
		 * @param args 
		 */
		public static void main(String[] args) {
			Logger.getLogger(FileFollowingPaneTest.class.getName()).setLevel(Level.SEVERE);
			Logger.getLogger(JTextComponentDestination.class.getName()).setLevel(Level.FINE);

		}
		public FileFollowingPaneTest() {
	}

	/** Test method for
	 * {@link org.junit.jupiter.api.Repeats#breakRepeats()}. */
	@Test
	public void testBreakRepeats() {
		SearchableTextPane sp = new SearchableTextPane(new UncompressedContent());
		sp.start();
		FileOutputStream fos = new FileOutputStream(sep.getTextFolder().toURI().getPath() + File.separator + "test");
		fos = new BufferedOutputStream(fos);
		sp.append(new JTextComponentDestination(new FileTextComponent(fos, "javadoc")), false, true);
		sp.append(new JTextComponentDestination(new FileTextComponent(fos, "html")), false, true);
		fos.close();
		String[] results = sp.stop();
		assertTrue(results[0].startsWith("<b>First line"));
		assertTrue(results[1].startsWith("<b>Second line"));
		}
	}
		
		private UncompressedContent uncc;
		private OutputDestination ood;
		private JTextComponentDestination dest;
		private JTextComponentDestination sep;
		private SearchableTextPane sp;
				
		FileFollowingPane() {
			uncc = new UncompressedContent();
			sp = new SearchableTextPane(uncc);			
			ood = new OutputDestination();
			sep = new JTextComponentDestination(new FileTextComponent(sep, "javadoc"));
			sep.addListener(new UncompressedContent.ContentListListener() {

				@Override
				public void sizeChanged(Document doc, int oldDocSize,
				                          int newDocSize, int changedSize) {
					if (newDocSize!= oldDocSize) { // to avoid bug
						System.gc();
					}				
				}					
				
			});
		}
	

	public class UncompressedContent {
	
		public Document getDocument() {
			Document res = null;
			try {
				res = getDocumentImpl();
			} catch (IOException e) {
				throw new Error("Document not set");
			}
			return res;
		}
		
		public Document getDocumentImpl() throws IOException {
			return se.getDocument();
		}
	}
	
	private class JTextComponentDestination extends OutputDestination {
		private JTextPane jtp;
		
		public JTextComponentDestination(JTextPane jtp) {
			this.jtp = jtp;
		}
		
		public Document getDocument() {
			return (Document)jtp.getDocument();
		}
		
		public Document getDocumentImpl() throws IOException {
			return getDocument().getDefaultRootElement().getDocument();
		}
	}

	@Test 
	public void testUncompressedText() {
			
		FileFollowingPaneTest.uncc.append(sep.getTextFolder().toURI().getPath(), null); // to test auto-positioning
		assertTrue(sep.getTextFolder().list().length == 1);
		
		FileFollowingPaneTest.uncc.append(sep.getTextFolder().toURI().getPath(), new JTextComponentDestination(sep));
		assertTrue(sep.getTextFolder().list().length == 2);
		
		FileFollowingPaneTest.uncc.append(sep.getTextFolder().toURI().getPath(), null); // to test auto-positioning
		assertTrue(sep.getTextFolder().list().length == 1);
		
		FileFollowingPaneTest.uncc.complete();
			
	}
	
	private int size0 = 0;
	protected void start() {
		dest.append(sep.getTextFolder().toURI().getPath() + File.separator + "test", new JTextComponentDestination(sep));

		sep.addListener(new JTextComponentDestination.ContentTypeListener() {

			@Override
			public void contentTypeChanged(JTextComponent c) {
				size0 ++;
			}
		});
	}

         /**
		 * @param fc 
		 * @param text 
		 * @param sep
		 * @param dest 
		 * @return 
		 * @throws BadLocationException 
         * @throws IOException 
         */
       protected boolean createDocument(JTextComponent dest, String text, String sep, String ct) throws BadLocationException, IOException{
               Document doc = getDocumentImpl();
               doc.setText(text);
               doc.addDocumentListener(new DocumentListener() {

                    @Override
                    public void addUpdateListener(DocumentListener listener) {
                    }

                    @Override
                    public void removeUpdate(DocumentListener listener) {
                    }

                    @Override
                    public void removeUpdate(DocumentEvent e) {
                    }

                    @Override
                    public void changedUpdate(DocumentEvent e) {
                    }

               });
               return true;
            }


@Override
public void onClose() {
    super.onClose();
    sep.removeListener(new JTextComponentDestination.ContentTypeListener() {

        @Override
        public void contentTypeChanged(JTextComponent c) {
            size0 --;
        }
    });
    sep.removeListener(new JTextComponentDestination.ContentTypeListener() {

        @Override
        public void contentTypeChanged(JTextComponent c) {
            size0 --;
        }
    });
}


}