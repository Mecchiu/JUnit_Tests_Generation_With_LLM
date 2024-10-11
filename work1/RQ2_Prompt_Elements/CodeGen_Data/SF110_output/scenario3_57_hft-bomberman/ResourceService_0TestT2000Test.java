// ResourceService_0Test.java
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
* It contains one unit test case for the {@link ResourceService#getImage(String)} method.
*/
class ResourceService_0Test {

    /**
     * Test method for {@link java.io.Resource#getResource(String)}.
     */
    @Test
    public void testGetResource() {
        // No parameter.
        Assert.assertNull(ResourceService.getImage(""));

        // One parameter.
        String expected = ".png";
        String result = ResourceService.getImage(expected);
        Assert.assertNotNull(result);
        assertEquals(expected, result);
    }

    /**
     * Test method for {@link java.io.File#getAbsolutePath()}.
     */
    @Test
    public void testGetAbsolutePath() {
        String expected = ".png";
        String result = FileService.getAbsolutePath(expected);
        assertEquals(expected, result);
    }

    /**
     * Test method for {@link java.io.InputStream#getCode()}.
     */
    @Test
    public void testGetCode() throws IOException {
        InputStream os = ResourceService.getImage("abc.png");
        assertNotNull(os);
        byte[] readBuffer = new byte[100];
        assertEquals("ABC.png", new String(readBuffer));
    }

    /**
     * Test method for
     * {@link java.io.InputStream#isReadingFromJar()}
     *.
     */
    @Test
    public void testIsReadingFromJar() throws IOException {
//        InputStream is = this.getClass().getResource("test.jar").getInputStream();
//        
//        byte[] readBuffer = new byte[200]; 
//        InputStreamReader isr = new InputStreamReader(is);

        // No parameter.
//        ResourceService.isReadingFromJar(isr);
//        
//        isr = new InputStreamReader(is);
//
//        FileInputStream in = new FileInputStream("test.jar");
//        assertEquals("test.jar", ResourceService.getFileFromJar(in));
    }

    /**
     * Test method for {@link ResourceService#getFileFromJar(javax.imageio.ImageReader)}.
     */
    @Test
    public void testGetFileFromJar() throws IOException {
        ImageIcon imageIcon = new ImageIcon("abc.png");
        InputStream is = this.getClass().getResource("test.jar").getInputStream();
        assertNotNull(is);
        BufferedImage img = ImageIO.read(is);

        assertEquals(img.getColorModel(), isr.getFallbackColorModel());
        ImageIcon result = ResourceService.getFileFromJar(isr);
        assertNotNull(result);
        inputStreamToImage(is, img);
    }
    
    /** @return the inputstream to the image. */
    private static void inputstreamToImage(InputStream is, BufferedImage img) throws IOException {
        BufferedImageReader isr = new BufferedImageReader(is);
        
        int[] color = new int[1];
        Color c = isr.readColor(color);
        double[] rgb = new double[3]; // RGB is a 3x2-matrix.
        rgb = isr.getRGB();
        int w = isr.getWidth();
        int h = isr.getHeight();
        switch (c) {
            case WHITE:
                img.setRGB(0, 0, w, h, rgb, 0, w);
                break;
            case BLACK:
                img.setRGB(rgb[0], rgb[1], rgb[2], w, h, rgb, 0, w);
                break;
            case RED:
                img.setRGB(rgb[0], rgb[1], rgb[2], w, h, rgb, w, h);
                break;
            case GREEN:
                img.setRGB(rgb[0], rgb[1], rgb[2], w, h, rgb, 0, h);
                break;
            case BLUE:
                img.setRGB(rgb[0], rgb[1], rgb[2], w, h, rgb, w, h);
                break;
        }
        assertTrue(boundedValue(w));
        assertTrue(boundedValue(h));
    }

    /** @return true if the number is bounded. */
    private static boolean boundedValue(int i) {
        if (i == 1) return true;
        if (i == 2) return true;
        if (i == 3) return true;
        return false;
    }
}
