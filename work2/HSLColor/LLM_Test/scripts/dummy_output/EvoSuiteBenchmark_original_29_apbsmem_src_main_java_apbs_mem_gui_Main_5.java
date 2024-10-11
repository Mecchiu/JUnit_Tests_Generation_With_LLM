// MainTest.java
package apbs_mem_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import com.jgoodies.forms.layout.*;
import com.jgoodies.forms.builder.*;
import org.jmol.api.JmolViewer;
import org.jmol.api.JmolAdapter;
import org.jmol.popup.JmolPopup;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Main}.
* It contains one unit test case for the {@link Main#SaveData()} method.
*/
class MainTest {
		public static final String OUTPUT_EXTENSION = ".out";

    /**
     * This set of tests exercises the functionality of the form builder.
     *
     * @author Keith Callenberg, Gabriel de Forest
     */
    public class TestFormBuilder extends SimpleBuilder implements ActionListener {

    /**
     * This test is designed to be run in a child thread,
     * but the JGViewer is running in the main thread.
     *
     * @return True if the test could be run, false if not.
     */
    public boolean run();

		public static TestFormBuilder theTestFormBuilder = null;   // use if we want to run in thread

		private static JmolAdapter theAdapter = null;
		private final boolean theDebug;
		private final static long theDuration;
    	private JApplet a;
    	
    	public TestFormBuilder(JApplet app, boolean debug) {
            a = app;
            theDebug = debug;
            theDuration = 1L;
            theAdapter = new JmolAdapter();
    	}
		public void run() {
    	theAdapter.create();
        if (theDebug) {
            System.out.println("Starting JB_1");
            Thread.currentThread();
        }
		}
		public synchronized boolean run() {
			theTestFormBuilder = this;
			theAdapter.create();
			try {
				if (theDebug) {
					System.out.println("Starting JB_2");
					Thread.sleep(50);
				}
				waitForNextStep();
				return true;
			} catch (InterruptedException ie) {
				return false;
			}
		}
		public void waitForNextStep() throws InterruptedException {
			long startTime = System.nanoTime();
			long millisToWait = theDuration;
			while (millisToWait > 0) {
				if (theDebug) {
					System.out.println("Waiting for data...");
				}
				if ( (System.nanoTime() - startTime) > theDuration) {
					if (theDebug) {
						System.out.println("Waiting for " + theDuration / 1000000 + " milliseconds");
					}
					Thread.sleep(millisToWait);
					millisToWait = (millisToWait/1000+1);
				}
			}
			try { Thread.sleep(theDuration); } catch (InterruptedException ie) { }
			assertTrue("", run());	
		}
		synchronized void update() {
			start();
		}
		protected void start() {
			if (theAdapter.getDataWriter().write()) {
				//System.out.println("Done saving files.");
			} else {
				//System.out.println("Test failed." + a.getStatusMessage()+" : "+theAdapter.getErrorMessage());
			}
		}
		@Override
		protected JPopupMenu createPopupMenu() {
			return new JPopupMenu();
		}

		@Override
		protected boolean getLayoutNever() {
			theAdapter.update(new HashMap<String, JmolViewer.OutputModeMapper>());
			return true;
		}

    }

	@Test
    public void testFormBuilder() {

        TestFormBuilder theFormBuilder = new TestFormBuilder(new JApplet(), true);
        theFormBuilder.run();

        if (theFormBuilder.run()) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED\nwith the error:");
            System.err.println(theFormBuilder.getErrorMessage());
        }
    }
	@Test
	public void testFormBuilder_thread() {

		JFrame jFrame1 = null;
		JFrame jFrame2 = null;
		TestFormBuilder theFormBuilder = new TestFormBuilder(jFrame1, true);
		for(int loop = 1; loop < 3; loop++) {
			theFormBuilder.start();
		}

		theFormBuilder.stop();
		theFormBuilder.join();

		if (theFormBuilder.run()) {
			System.out.println("PASSED");
		} else {
			System.out.println("FAILED\nwith the error:");
			System.err.println(theFormBuilder.getErrorMessage());
		}
	}

	public static void main(String args[]) {
		JApplet app = new JApplet();
		System.out.println("Starting main with args:");
		for (int i = 0; i < args.length; ++i) {
			System.out.println("Arg: " + args[i]);
		}
		Main.testFormBuilder();

		JFrame jFrame1 = new JFrame("Jmol_Test_App");
		jFrame1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		ArrayList<String> args1 = new ArrayList<String>();
		args1.add("-v");
		args1.add("-d");
		args1.add("-f");
		jFrame1.addWindowListener(new MyWindowListener());
		jDialogJmol jd = new jDialogJmol();
		jd.createAndShow(app, jFrame1, args1);
		jFrame1.setVisible(true);
		app.start();
	}

	enum OutputMode {

		STANDARD, OUT_FORMAT, OUT_XML, OUT_XML_2D

	}

	class jDialogJmol extends JDialog {

		private final JDialog dialog_;
		private TextArea theOutputArea = new TextArea();
		private Button b;
		private JPopupMenu popupM;

		public jDialogJmol(JDialog jd, InputHandler.Input input, OutputMode mode) {
			super(jd, outputMode1(mode));
			dialog_ = jd;
			setLayout(new BorderLayout());
			popupM = new JPopupMenu();
			this.add(theOutputArea, BorderLayout.CENTER);
			add(popupM, BorderLayout.NORTH);
            theOutputArea.setDisabledTextColor(java.beans.Color.black);
        }

}
}