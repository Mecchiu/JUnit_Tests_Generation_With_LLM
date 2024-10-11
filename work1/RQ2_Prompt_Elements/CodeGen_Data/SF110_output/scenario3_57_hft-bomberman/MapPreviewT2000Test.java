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

    /**
     * returns preview of current map
     *
     * @param previewWidth -
     *            Width of preview. Proportions are constrained
     * @return BufferedImage with map preview
     */
    public ImageIcon getMapPreview(int previewWidth);
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
		
    /**
     * Creates a new instance of {@link MapPreviewTest}
     * This constructor is for test cases ONLY.
     *
     * @param map - the map object to be used for preview
     */
    public MapPreviewTest(Map map) {
            this.map = map;
    }
    
    /**
     * creates a new ImageIcon for a preview
     */
    public ImageIcon getMapPreview(int previewWidth);


    /**
     * The Map object
     */
    private Map map = new Map();
    /**
     * The name to be used for preview
     */
    private String name = "New Preview";
    /**
     * Reference to test data to be used in creating preview
     */
    private Vector<String> stringData = new Vector<String>();
    /**
     * Constructor of MapPreviewTest
     *
     * @param previewWidth the width of the image set to be used for preview
     */
    @Test
    public void testCreateMapPreview(int previewWidth)
    {
        log = Logger.getLogger(this.getClass());
        int mapWidth = 300;
        String dataFileName = String.format(
        		"%s.map.%d",
                name,
                mapWidth
        );

        // we create a new map preview and add this testcase to the vector
        image = new ImageIcon(mapWidth, 300);
        map.addNewMapPreview(image, mapWidth, mapWidth);

        // and we create a preview of the test data
        previewWidth = previewWidth;
        if(previewWidth >= 600)
        {
            String testData1 = "The Test Data";
            stringData.add("The Test Data");
            stringData.add(testData1);
            stringData.add("The Test Data with spaces");
            stringData.add(testData1);
        }
        previewWidth = previewWidth / 2;
        while(previewWidth < 300)
        {
        	 // add some test data
        	String testData1 = "The Test Data";
        	stringData.add("The Test Data");
        		stringData.add(testData1);
        	stringData.add("The Test Data with spaces");
        		stringData.add(testData1);
            log.setLevel(Logger.LEVEL_WARNING);
            log.setLevel(Logger.LEVEL_INFO);

            if(!previewWidth.equals(250) &&!previewWidth.equals(200) &&
              !previewWidth.equals(600) &&
              !previewWidth.equals(500) &&
              !previewWidth.equals(650) &&
              !previewWidth.equals(700) &&
              !previewWidth.equals(750))
            {
                System.out.println("Test imageWidth wrong!" + previewWidth);
                System.out.println(stringData);
                fail("Test imageWidth wrong!" + previewWidth);
            }
            previewWidth = previewWidth + 1;
        }
        int previewWidth2 = 0;
        while(previewWidth2 < 100)
        {
       	 // some test data
	String testData1 = "The Test Data";
	stringData.add("The Test Data");
	stringData.add(testData1);
        	stringData.add("The Test Data with spaces");
        		stringData.add(testData1);
            log.setLevel(Logger.LEVEL_INFO);
        		log.setLevel(Logger.LEVEL_INFO);
        		try
        		{
        			previewWidth2 = (previewWidth - 2);
        		}
        		catch (Exception e)
        		{
        			// System.out.print(e.getMessage())
        			log.info(e);
        		}
        }
        log.setLevel(Logger.LEVEL_WARNING);
        // now some more tests!
        log.setLevel(Logger.LEVEL_INFO);

        for(int i = 0; i < stringData.size(); i+= 2)
        {
                String testData = stringData.get(i);

                // we save the name to avoid a crash
                if(stringData.size()!= i+ 1)
                {
    				map.setName(i+ 1, stringData.get(i+ 1));
                }
                else
                {
    				map.setName(i+ 1, stringData.get(i)+ "  - Test");
                }
                Image testDataImage = dataFileName.replace(i, 2, testData).getImage();
                log.info(i + " : Preview image width = " + testDataImage.getWidth()
                    + ", height = " + testDataImage.getHeight());
        }
        MapPreview mp = new MapPreview(map);
		assertTrue("Map preview is not available", mp.getMapPreview(previewWidth)!= null);
		assertTrue("All expected results are available", mp.getName()
				.equals(map.getName()));

    }

    /**
     * Creates a new ImageIcon for image data to be used in creating a preview
     */
    private ImageIcon image = null;
    private int imageWidth;
    private int imageHeight;

    /**
     * Create map preview of width = 500
     *
     * @param width
     * @return
     */
    ImageIcon getNewMapPreview(int width) {

        log.setLevel(Logger.LEVEL_INFO);

        /* Creating the new ImageIcon for the image data
        */
    	try
        {
            File imageFile = new File(dataFileName + "_" + mapWidth + ".map.bmp");
            ImageIcon result = new ImageIcon(ImageIO.read(imageFile));
            imageHeight = result.getIconHeight();
			imageWidth = result.getIconWidth();
		}
        catch (IOException e)
        {
            log.setLevel(Logger.LEVEL_ERROR);
        }
    	return image;

        //return new ImageIcon(new BufferedImage
        //(imageHeight, imageWidth, BufferedImage.TYPE_INT_RGB));
    }
}
