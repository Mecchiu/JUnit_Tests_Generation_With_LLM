// MapPreviewTest.java
package common;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapPreview}.
* It contains one unit test case for the {@link MapPreview#getMapPreview(int)} method.
*/
class MapPreviewTest {
// MapPreview.java
package common;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.apache.log4j.Logger;

/**
 * create a ImageIcon Map Preview of a map object
 *
 * usage example: MapPreview mp = new MapPreview(map); mp.setImageSet("desert");
 * (optional) ImageIcon ii = mp.getMapPreview(150);!!
 *
 * @author christian
 */
public class MapPreview {

    private String mapImageSet;

    private Point mapArea;

    private ImageIcon mapPreviewIcon;

    private BufferedImage mapPreview;

    private Map mapMap;

    private String mapFile;

    // map tile Images, for caching purposes
    private static Image TILE_WALL_IMAGE;

    private static Image TILE_STONE_IMAGE;

    private static final Logger logger = Logger.getLogger(MapPreview.class);

    /**
     * class for creating map Preview of Map map
     *
     * @param map -
     *            map for which preview should be created
     */
    public MapPreview(Map map) {
    }

    /**
     * set imageSet, overrides default map imageSet
     *
     * @param imageSet -
     *            String, imageSet (-folder)
     */
    public void setImageSet(String imageSet);

    /**
     * returns preview of current map
     *
     * @param previewWidth -
     *            Width of preview. Proportions are constrained
     * @return BufferedImage with map preview
     */
    public ImageIcon getMapPreview(int previewWidth);

    /**
     * draws all map tiles to Graphics object
     */
    private void drawMap();

    /**
     * method for scaling/resizing BufferedImages to target width
     *
     * @param bi -
     *            BufferedImage
     * @param targetWidth -
     *            target width of resized image
     * @return BufferedImage - with map preview
     */
    private BufferedImage scale(BufferedImage bi, int targetWidth);

    public Image LoadImage(String fileName);

    /**
     * draws tile at specific position
     *
     * @param g2d -
     *            Graphics2D object
     * @param position -
     *            Point, coordinates
     * @param fileName -
     *            String, name of file, w/o path and ending
     * @param middle -
     *            is the position of element set to middle, correct the upper
     *            left coordinate
     */
    public void drawTile(Graphics g, Point position, String fileName, Boolean middle);
}

// MapPreviewTest.java
package common;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapPreview}.
* It contains one unit test case for the {@link MapPreview#getMapPreview(int)} method.
*/
class MapPreviewTest {
		private static Logger logger
		= Logger.getLogger(MapPreviewTest.class);
		private MapPreview mp;

		/**
		 * @return
		 * @throws Exception
		 */
    
    public MapPreviewTest() throws Exception {
        mp = new MapPreview(testMapFile());
    }

/**
* @author kosty
* @since
*/
    /**
    * set imageSet, overrides default map imageSet
    *
    * @param imageSet -
    *            String, imageSet (-folder)
    */
    public void SetImageSet(String imageSet) {
        this.mapImageSet = imageSet;
    }

    /**
    * returns preview of current map
    *
    * @return BufferedImage with map preview
    */
    public ImageIcon getMapPreview(int previewWidth);

/**
* @author kosty
* @since
*/
    /**
    * draws image to Graphics object
    *
    * @param g2d -
    *            Graphics2D object
    * @param position -
    *            Point, coordinates
    */
    public void DrawImage(Graphics g2d, Point position) {

        AffineTransform trans = AffineTransformOp.getInstance(AffineTransformOp.TYPE_BILINEAR);
        AffineTransformOp opacityOp = new AffineTransformOp(trans, AffineTransformOp.TYPE_ADD);
        affineTransform(mp.scale(g2d, 100), position, AffineTransformOp.TYPE_BILINEAR);
        AffineTransformOp opacity = new AffineTransformOp(trans, AffineTransformOp.TYPE_ADD);
        opacity.setAlpha(100);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        opacityOp.filter(g2d, opacity, 1);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
    }

/**
* @author kosty
* @since
*/
    /**
    * performs scaling operation on BufferedImage;
    * image may have more than one element
    * if element for map is empty, all will be removed
    * from the BufferedImage.
    */
    public BufferedImage scale(BufferedImage bi) {
        if (bi.getWidth() > BI_TILE_WIDTH) {
            logger.warn("scale: Width of image " + bi.getWidth() +
                    " is so wide that it should have multiple elements!");
            bi = scaleImage(bi, BI_TILE_WIDTH);
        }
        return bi;
    }

    /**
    * @param image
    *            Image to scale
    *
    * @return scaled image, can be null
    */
    private BufferedImage scaleImage(Image image, int width) {
        BufferedImage bi = null;


        if (width % 2 == 1) {
            // no-op
        } else {
            bi = scaleImage(image, bi, BI_TILE_WIDTH);
            bi = scaleImage(bi, width / 2);
        }

        return bi;
    }

    /**
    * scales image and adds new elements (if possible)
    *
    * @param image
    *            image to scale
    * @param elements -
    *            added element if possible
    * @param width
    *            remaining width
    */
    private BufferedImage scaleImage(BufferedImage image, int width) {
        if (width < image.getWidth()) {

            int index = 0;

            if (image.getWidth() > 4) {
               index += 4;
            }

            BufferedImage bi = new BufferedImage(width, image.getHeight(),
                    BufferedImage.TYPE_3BYTE_BGR);
            Graphics g = bi.getGraphics();
            g.drawImage(image, 0, 0, null);
            AffineTransform trans = TranslateOp.getInstance(AffineTransformOp.TYPE_TRANSLATION, 4, 4, 0, image.getHeight(), 0, 0);
            AffineTransformOp opacity = new AffineTransformOp(trans, AffineTransformOp.TYPE_SRC_OVER);
            g.drawImage(image, (image.getWidth() -
                    bi.getWidth()) / 2, 0, null);
            g.dispose();
            g = bi.getGraphics();
            g.draw