// ResourceService_1Test.java
package common;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ResourceService}.
* It contains one unit test case for the {@link ResourceService#getImageIcon(String)} method.
*/
class ResourceService_1Test {
		// It is convenient to have a separate resource and another class.
		
    // The two test cases below are for testing the functionality of
    // ResourceService.
    
    private static final int WIDTH = 64;
    private static final int HEIGHT = 16;
    private static final int BYTES_PER_BIT = 3;

    // private InputStream in= null;
    private final Object lock = new Object(); // A lock object because the class doesn't access
    private InputStream in=null;
    private long cur=0l;
    private String curStr=null;
    private Image curImage = null;

	ResourceService_1Test() {
		try {
			final java.net.URL url = Thread.currentThread().getContextClassLoader()
					.getResource("dummy.jar");
            in = url.openStream();
            curStr = null;
		} catch(final java.io.IOException exc) {
            System.err.println(exc);
        }
	}

    /**
     * This starts to create a new instance of the class using
     * the default {@link ClassLoader} and {@link InputStream} as the classpath. To know,
     * this class also contains one public {@link #main(java.lang.String[])} method that
     * gives the user the possibility of launching the test class.
     * @throws IOException The IOException to be thrown when attempting to read the image file from an InputStream
     * @throws IllegalStateException The IllegalStateException to be thrown when the thread
     * is not allowed to initialize, or start the thread when it does.
     */
    @Test
    public void testInit_1() throws IOException, RuntimeException {
		// We do not add a new instance of this test class.
		// We add a new instance one each time because it does not do anything and
		// this way we can reuse the test image.
		final MainService provider = new MainService(1);
    	provider.start();
    	try {
			curStr = null;
			curImage = null;
    		new Thread(new Runnable() {
	
				@Override
				public void run() {
					curStr = null;
					curImage = null;
					try {
						final int result = provider.getImage(in, cur, WIDTH, HEIGHT);
						curStr = provider.getCurString();
						curImage = new BufferedImage();
						curImage.createImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_ARGB);
	
						final ImageIcon resultIcon = new ImageIcon(curImage);
						assertTrue("The result icon must ofe equal", resultIcon.getImage() == result);
						final String imageName = resultIcon.getImagePath();
						resultIcon.paint(curImage);
						assertTrue(imageName + " must be the same", curString.contains(imageName));
					} catch(final RuntimeException | IOException exc) {
					} finally {
						if (curImage!= null) {
							curImage.dispose();
							curImage = null;
						}
						if (curStr!= null && curStr.length() > 0) {
							final ImageIcon resultIcon = new ImageIcon(curStr);
							wait(100, 100);
							assertTrue(curStr + " must be the same", resultIcon.getImage() == cur);
							curStr = null;
						}
					}
				}

				private void wait(final int time, final int timeOut) throws InterruptedException {
					final int startTime = cur;
					final String currentTime = "<html><p>time: "+ cur+ "<br>timeOut: "+timeOut+"<br><p>("+time+", "+timeOut+")</p></html>";
					wait(timeOut, time);
					wait(timeOut, time);
					final int endTime = cur;
					final String endTimeStr = "<html><p>time: " + endTime.substring(0, endTime.indexOf(":")) + "</p><p>timeOut: "+ timeOut + "</p></html>";
	
					// Make sure that the thread did not initialize
					assertTrue(currentTime + " must not be equal", cur == startTime);
					assertTrue(endTime + " must not be equal", endTime == endTimeStr.indexOf(endTime));
				}
			}).start();

        } catch(final RuntimeException | InterruptedException noExc) {
        }
    }

	/**
	 * This starts to create a new instance of the class using
	 * an {@link InputStream} based on the resource location.
	 * @throws IOException The IOException to be thrown when attempting to read the image file from an InputStream.
	 * @throws IllegalStateException The IllegalStateException to be thrown when the thread
	 * is not allowed to initialize, or start the thread when it does.
	 */
    public static void main(final String[] args) throws IOException, IllegalStateException {
    
    	// This object must not be used until the constructor completes.
    	ResourceService_1Test test = null;
    	
    	// Test case for an incorrect class loader
    	test = new ResourceService_1Test();
    	test.run();
    	
    	// Test case for the same class but an incorrect stream
    	test = new ResourceService_1Test();
    	test.run();
    	ClassLoader old = null;
    	try {
    		old = Thread.currentThread().getContextClassLoader();
    		Thread.currentThread().setContextClassLoader(test.getClass().getClassLoader());
    		test =  new ResourceService_1Test();
    		test.run();
    		assertEquals(old.getParent(), test.getClass().getClassLoader());
    	}finally {
    		Thread.currentThread().setContextClassLoader(old);
    	}
    }
    
    /**
     * This method uses java.lang.System.arraycopy to copy the bytes from the reader
     * to the given array of bytes.
     * @param src The original source byte array.
     * @param dest The expected destination byte array.
     * @param n The number of bytes to copy.
     */
    private static void copy(final byte[] src, final byte[] dest, final int n) {
        System.arraycopy(src, 0, dest, 0, n);
    }
}