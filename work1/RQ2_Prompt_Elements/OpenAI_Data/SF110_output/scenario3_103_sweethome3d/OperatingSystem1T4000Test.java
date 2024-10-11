// OperatingSystemTest.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OperatingSystem}.
* It contains ten unit test cases for the {@link OperatingSystem#isWindows()} method.
*/
class OperatingSystemTest {

	@Test
	void testIsWindows() {
		assertTrue(OperatingSystem.isWindows());
	}
}

// ResourceURLContent.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.model.Content;

/**
 * Content that references a resource.
 * @author Emmanuel Puybaret
 */
public class ResourceURLContent implements Content {

    /**
     * Creates a content object that references a resource.
     * @param resource the name of the resource.
     */
    public ResourceURLContent(String resource);

    /**
     * Returns <code>true</code> if this content is a temporary one.
     */
    public boolean isTemporary();

    /**
     * Returns the name of this content.
     */
    public String getName();

    /**
     * Returns the input stream of this content.
     */
    public InputStream getInputStream() throws IOException;

    /**
     * Returns the URL of this content.
     */
    public URL getURL();

    /**
     * Returns the file of this content.
     */
    public File getFile();

    /**
     * Returns the length in bytes of this content.
     */
    public long getLength();

    /**
     * Returns the content type of this content.
     */
    public String getContentType();

    /**
     * Returns the content of this content as a string.
     */
    public String getContentString();

    /**
     * Returns the content of this content as a byte array.
     */
    public byte [] getContentBytes();

    /**
     * Returns the content of this content as a reader.
     */
    public Reader getContentReader();

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage();

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async, boolean forceLoad);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async, boolean forceLoad, boolean forceReload);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async, boolean forceLoad, boolean forceReload, boolean forceTransparent);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async, boolean forceLoad, boolean forceReload, boolean forceTransparent, boolean forceBackground);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async, boolean forceLoad, boolean forceReload, boolean forceTransparent, boolean forceBackground, boolean forceAlpha);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async, boolean forceLoad, boolean forceReload, boolean forceTransparent, boolean forceBackground, boolean forceAlpha, boolean forceColor);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async, boolean forceLoad, boolean forceReload, boolean forceTransparent, boolean forceBackground, boolean forceAlpha, boolean forceColor, boolean forceGray);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async, boolean forceLoad, boolean forceReload, boolean forceTransparent, boolean forceBackground, boolean forceAlpha, boolean forceColor, boolean forceGray, boolean forceBW);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async, boolean forceLoad, boolean forceReload, boolean forceTransparent, boolean forceBackground, boolean forceAlpha, boolean forceColor, boolean forceGray, boolean forceBW, boolean forceInvert);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async, boolean forceLoad, boolean forceReload, boolean forceTransparent, boolean forceBackground, boolean forceAlpha, boolean forceColor, boolean forceGray, boolean forceBW, boolean forceInvert, boolean forceFlip);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async, boolean forceLoad, boolean forceReload, boolean forceTransparent, boolean forceBackground, boolean forceAlpha, boolean forceColor, boolean forceGray, boolean forceBW, boolean forceInvert, boolean forceFlip, boolean forceRotate);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async, boolean forceLoad, boolean forceReload, boolean forceTransparent, boolean forceBackground, boolean forceAlpha, boolean forceColor, boolean forceGray, boolean forceBW, boolean forceInvert, boolean forceFlip, boolean forceRotate, boolean forceCrop);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async, boolean forceLoad, boolean forceReload, boolean forceTransparent, boolean forceBackground, boolean forceAlpha, boolean forceColor, boolean forceGray, boolean forceBW, boolean forceInvert, boolean forceFlip, boolean forceRotate, boolean forceCrop, boolean forceResize);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async, boolean forceLoad, boolean forceReload, boolean forceTransparent, boolean forceBackground, boolean forceAlpha, boolean forceColor, boolean forceGray, boolean forceBW, boolean forceInvert, boolean forceFlip, boolean forceRotate, boolean forceCrop, boolean forceResize, boolean forceScale);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async, boolean forceLoad, boolean forceReload, boolean forceTransparent, boolean forceBackground, boolean forceAlpha, boolean forceColor, boolean forceGray, boolean forceBW, boolean forceInvert, boolean forceFlip, boolean forceRotate, boolean forceCrop, boolean forceResize, boolean forceScale, boolean forceSharpen);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async, boolean forceLoad, boolean forceReload, boolean forceTransparent, boolean forceBackground, boolean forceAlpha, boolean forceColor, boolean forceGray, boolean forceBW, boolean forceInvert, boolean forceFlip, boolean forceRotate, boolean forceCrop, boolean forceResize, boolean forceScale, boolean forceSharpen, boolean forceBlur);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async, boolean forceLoad, boolean forceReload, boolean forceTransparent, boolean forceBackground, boolean forceAlpha, boolean forceColor, boolean forceGray, boolean forceBW, boolean forceInvert, boolean forceFlip, boolean forceRotate, boolean forceCrop, boolean forceResize, boolean forceScale, boolean forceSharpen, boolean forceBlur, boolean forceEdge);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async, boolean forceLoad, boolean forceReload, boolean forceTransparent, boolean forceBackground, boolean forceAlpha, boolean forceColor, boolean forceGray, boolean forceBW, boolean forceInvert, boolean forceFlip, boolean forceRotate, boolean forceCrop, boolean forceResize, boolean forceScale, boolean forceSharpen, boolean forceBlur, boolean forceEdge, boolean forceEmboss);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async, boolean forceLoad, boolean forceReload, boolean forceTransparent, boolean forceBackground, boolean forceAlpha, boolean forceColor, boolean forceGray, boolean forceBW, boolean forceInvert, boolean forceFlip, boolean forceRotate, boolean forceCrop, boolean forceResize, boolean forceScale, boolean forceSharpen, boolean forceBlur, boolean forceEdge, boolean forceEmboss, boolean forceOil);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async, boolean forceLoad, boolean forceReload, boolean forceTransparent, boolean forceBackground, boolean forceAlpha, boolean forceColor, boolean forceGray, boolean forceBW, boolean forceInvert, boolean forceFlip, boolean forceRotate, boolean forceCrop, boolean forceResize, boolean forceScale, boolean forceSharpen, boolean forceBlur, boolean forceEdge, boolean forceEmboss, boolean forceOil, boolean forceNegate);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async, boolean forceLoad, boolean forceReload, boolean forceTransparent, boolean forceBackground, boolean forceAlpha, boolean forceColor, boolean forceGray, boolean forceBW, boolean forceInvert, boolean forceFlip, boolean forceRotate, boolean forceCrop, boolean forceResize, boolean forceScale, boolean forceSharpen, boolean forceBlur, boolean forceEdge, boolean forceEmboss, boolean forceOil, boolean forceNegate, boolean forceGrayScale);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async, boolean forceLoad, boolean forceReload, boolean forceTransparent, boolean forceBackground, boolean forceAlpha, boolean forceColor, boolean forceGray, boolean forceBW, boolean forceInvert, boolean forceFlip, boolean forceRotate, boolean forceCrop, boolean forceResize, boolean forceScale, boolean forceSharpen, boolean forceBlur, boolean forceEdge, boolean forceEmboss, boolean forceOil, boolean forceNegate, boolean forceGrayScale, boolean forceSepia);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async, boolean forceLoad, boolean forceReload, boolean forceTransparent, boolean forceBackground, boolean forceAlpha, boolean forceColor, boolean forceGray, boolean forceBW, boolean forceInvert, boolean forceFlip, boolean forceRotate, boolean forceCrop, boolean forceResize, boolean forceScale, boolean forceSharpen, boolean forceBlur, boolean forceEdge, boolean forceEmboss, boolean forceOil, boolean forceNegate, boolean forceGrayScale, boolean forceSepia, boolean forceSolarize);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async, boolean forceLoad, boolean forceReload, boolean forceTransparent, boolean forceBackground, boolean forceAlpha, boolean forceColor, boolean forceGray, boolean forceBW, boolean forceInvert, boolean forceFlip, boolean forceRotate, boolean forceCrop, boolean forceResize, boolean forceScale, boolean forceSharpen, boolean forceBlur, boolean forceEdge, boolean forceEmboss, boolean forceOil, boolean forceNegate, boolean forceGrayScale, boolean forceSepia, boolean forceSolarize, boolean forceContrast);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async, boolean forceLoad, boolean forceReload, boolean forceTransparent, boolean forceBackground, boolean forceAlpha, boolean forceColor, boolean forceGray, boolean forceBW, boolean forceInvert, boolean forceFlip, boolean forceRotate, boolean forceCrop, boolean forceResize, boolean forceScale, boolean forceSharpen, boolean forceBlur, boolean forceEdge, boolean forceEmboss, boolean forceOil, boolean forceNegate, boolean forceGrayScale, boolean forceSepia, boolean forceSolarize, boolean forceContrast, boolean forceBrightness);

    /**
     * Returns the content of this content as a buffered image.
     */
    public BufferedImage getContentImage(int width, int height, boolean proportional, boolean maximumSize, boolean smooth, boolean cache, boolean hiDPI, boolean wait, boolean async,