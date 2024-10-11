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
		/**
		 * The test suite constructor.
		 */
		public ResourceService_1Test() {
			// intentionally empty
		}
	}

// ImageIconTest.java
/* The location of the image from a client jar file is relative to the classpath. */
public class ImageIconTest {
	public static void main(String args[]) {
		ResourceService resourceService = new ResourceService();
		BufferedImage loadedImage = resourceService.getImage(resourceService.getInputStream("src\\resourceStore\\resource.jpg"));

		ImageIcon loadedIcon = new ImageIcon(loadedImage);
		System.out.println(loadedIcon);

		ImageIcon read = resourceService.getImageIcon(loadedIcon);
		if(!(ImageIcon)read==null) {
			Image loadedImage = read.getImage();
			if(!(loadedImage instanceof BufferedImage)) {
				System.out.println("image "+ loadedImage);
				continue;
			}else {
				System.out.println("the image is already loaded:"+ loadedImage.getWidth(Image.SCALE_FILL)+" "+loadedImage.getHeight(Image.SCALE_FILL));
			}
		}
		System.out.println("loaded "+loadedImage.getWidth(Image.SCALE_FILL)+" "+loadedImage.getHeight(Image.SCALE_FILL));

/*		InputStream inputStream=null;
		try {
			inputStream = resourceService.getInputStream("src\\resourceStore\\resource.jpg");
		} catch (IOException e) {}
		System.out.println("input stream"+inputStream+"; "+resourceService.getInputStream(path));*/
	}
}

// BufferedImageTest.java
class BufferedImageTest {
	public static void main(String args[]) {
		ImageIcon imageIcon = new ImageIcon(getImage("src\\resourceStore\\resource.jpg"));
		BufferedImage image = (BufferedImage)imageIcon.getImage();
		if(image!=null && image.getHeight(Image.SCALE_FILL)>200) {
			if(imageIcon.getImage().getHeight(Image.SCALE_FILL)==200 && null!=imageIcon.getImage().getGraphics()) {
				imageIcon.getImage().scaleCopy(1/2, 1/2, Image.SCALE_FILL);
			}//if()
		}//if
		
		System.out.println(image.getHeight(Image.SCALE_FILL));
	}
}

// IconTest.java
class IconTest {
	public static void main(String args[]) {
		try {
			//System.out.println("icon loaded via getImageIcon");
			//Icon icon = resourceService.getImageIcon(resourceService.getInputStream("src\\resourceStore\\resource.jpg"));
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
// BufferedImage_1Test.java
class BufferedImage_1Test {
	public static void main(String[] args) {
		BufferedImage bimage = null;
		try {
		
			InputStream inputStream=null;
			if(args[0].compareTo("src\\resourceStore\\resource.jpg")==0) {
				inputStream = resourceService.getInputStream("src\\resourceStore\\resource.jpg");
			}//if

			inputStream=null;
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}

		if(bimage!=null) {
			bimage.flush();

			if(bimage.getWidth(Image.SCALE_FILL)>200 && null!=bimage.getGraphics()) {
				bimage.getGraphics().drawImage(getImage("src\\resourceStore\\resource.jpg"), 0, 0, 200, 200, null);
			}//if
		}//if
		if(inputStream!=null) {
			while(true) {
				try {
					bimage = ImageIO.read(inputStream);
					inputStream.close();
				} catch(IOException ioe) {
					continue;
				}

				break;
			}
		}//while


		if(bimage!=null && bimage.getWidth(Image.SCALE_FILL)==200 && null!=bimage.getGraphics()) {
				//bimage.scaleCopy(1/2, 1/2, Image.SCALE_FILL);
				if(bimage.getWidth(Image.SCALE_FILL)<200) {
					bimage.flip(Image.SCALE_FILL);
					bimage.flush();
					continue;
				}else {
					bimage.flush();
					if(bimage.getHeight(Image.SCALE_FILL)>500) {
						bimage.scaleCopy(1.0f/(2.0f-bimage.getHeight(Image.SCALE_FILL)), 1.0f/(2.0f-bimage.getHeight(Image.SCALE_FILL)), Image.SCALE_FILL);
						bimage.flush();
						System.out.println("fliped with "+bimage.getWidth("RGB")+"x"+bimage.getHeight("RGB"));
					}else {
						if(null!=bimage.getHeight()) {
							bimage.scaleCopy(bimage.getHeight(), bimage.getHeight());
							bimage.flush();
							System.out.println("fliped with "+bimage.getHeight("RGB")+"x"+bimage.getHeight("RGB"));
						}
					}
				}
		}// if
		if(bimage!=null && bimage.getHeight(Image.SCALE_FILL)==500) {
			bimage.flush();
			for(int i=0; i<50; i++) {
				bimage = getTransformedImage(bimage);
			}
		}

		BufferedImageTest bi = new BufferedImageTest();
		bi.img = bimage;
		System.out.println(bi.img);

		//bi.img.flush();
	}
	// Fliped Image
	private static BufferedImage getTransformedImage(BufferedImage img) {
}
}