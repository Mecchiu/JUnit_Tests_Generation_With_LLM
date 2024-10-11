// ResourceService_2Test.java
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
* It contains one unit test case for the {@link ResourceService#getInputStream(String)} method.
*/
class ResourceService_2Test {
		private BufferedImage bi = null;
		/**
		* Get a BufferedImage object by the specified path.
		* @param path The location of the resource within the classpath.
		* @return A {@link BufferedImage} object.
		*/
		public static BufferedImage getImage(String path) {
			bi = getImage(path);
			return bi;
		}

		/**
		* Get the Path name for the specified {@link BufferedImage} Object, relative from the specified
		* location.
		* @param bi The BufferedImage object (getImage(...))
		* @param relativeName The path for the specified {@link BufferedImage} object (getImage(...), getImage(String))
		* @return The Path name for the specified {@link BufferedImage} object
		*/
		public static String getPath(BufferedImage bi, String relativeName) {
			return getPath(bi, null, relativeName);
		}

		/**
		* Get the Path name for the specified {@link BufferedImage} Object.
		* @param bi The BufferedImage object (getImage(...))
		* @return The Path name or null if it is not a image object or if an error occurred.
		*/
		public static String getPath(BufferedImage bi) {
			return getPath(bi, null);
		}

		/**
		* Get the Pathname for a given path, relative to the specified location.
		* @param path The path
		* @param relativeName The relative part of the path
		* @return The Pathname for a specified path, relative to the specified location.
		*/
		public static String getPath(String path, String relativeName) {
			return getPath(getImage(path), getImage(relativeName)
));
	}

		/**
		* Get the Stream for the specified {@link BufferedImage} Object.
		* @param bi The BufferedImage object (getImage(...))
		* @return The Stream for the Specified {@link BufferedImage} Object.
		*/
		public static InputStream getInputStream(BufferedImage bi) {
			return (InputStream)bi.getProperty("ImageBytes");
		}

		/**
		* Get the Stream for a given location.
		* @param path The location
		* @return The Stream for a specified location.
		*/
		public static InputStream getInputStream(String path) {
			return getInputStream(getImage(path));
		}
}