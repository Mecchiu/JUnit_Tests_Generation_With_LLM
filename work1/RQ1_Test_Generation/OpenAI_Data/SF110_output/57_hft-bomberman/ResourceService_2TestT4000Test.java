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
* It contains ten unit test cases for the {@link ResourceService#getInputStream(String)} method.
*/
class ResourceService_2Test {

	/**
	 * Test of getInputStream method, of class ResourceService.
	 * This test case tests the functionality of the getInputStream method
	 * when the path is null.
	 */
	@Test
	public void testGetInputStream_NullPath() {
		System.out.println("getInputStream");
		String path = null;
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -&gt; {
			ResourceService.getInputStream(path);
		});
		assertEquals("No such resource: null", exception.getMessage());
	}
	
	/**
	 * Test of getInputStream method, of class ResourceService.
	 * This test case tests the functionality of the getInputStream method
	 * when the path is empty.
	 */
	@Test
	public void testGetInputStream_EmptyPath() {
		System.out.println("getInputStream");
		String path = "";
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -&gt; {
			ResourceService.getInputStream(path);
		});
		assertEquals("No such resource: ", exception.getMessage());
	}
	
	/**
	 * Test of getInputStream method, of class ResourceService.
	 * This test case tests the functionality of the getInputStream method
	 * when the path is a whitespace.
	 */
	@Test
	public void testGetInputStream_WhitespacePath() {
		System.out.println("getInputStream");
		String path = " ";
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -&gt; {
			ResourceService.getInputStream(path);
		});
		assertEquals("No such resource:  ", exception.getMessage());
	}
	
	/**
	 * Test of getInputStream method, of class ResourceService.
	 * This test case tests the functionality of the getInputStream method
	 * when the path is a tab.
	 */
	@Test
	public void testGetInputStream_TabPath() {
		System.out.println("getInputStream");
		String path = "\t";
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -&gt; {
			ResourceService.getInputStream(path);
		});
		assertEquals("No such resource: \t", exception.getMessage());
	}
	
	/**
	 * Test of getInputStream method, of class ResourceService.
	 * This test case tests the functionality of the getInputStream method
	 * when the path is a new line.
	 */
	@Test
	public void testGetInputStream_NewLinePath() {
		System.out.println("getInputStream");
		String path = "\n";
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -&gt; {
			ResourceService.getInputStream(path);
		});
		assertEquals("No such resource: \n", exception.getMessage());
	}
	
	/**
	 * Test of getInputStream method, of class ResourceService.
	 * This test case tests the functionality of the getInputStream method
	 * when the path is a carriage return.
	 */
	@Test
	public void testGetInputStream_CarriageReturnPath() {
		System.out.println("getInputStream");
		String path = "\r";
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -&gt; {
			ResourceService.getInputStream(path);
		});
		assertEquals("No such resource: \r", exception.getMessage());
	}
	
	/**
	 * Test of getInputStream method, of class ResourceService.
	 * This test case tests the functionality of the getInputStream method
	 * when the path is a form feed.
	 */
	@Test
	public void testGetInputStream_FormFeedPath() {
		System.out.println("getInputStream");
		String path = "\f";
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -&gt; {
			ResourceService.getInputStream(path);
		});
		assertEquals("No such resource: \f", exception.getMessage());
	}
	
	/**
	 * Test of getInputStream method, of class ResourceService.
	 * This test case tests the functionality of the getInputStream method
	 * when the path is a backspace.
	 */
	@Test
	public void testGetInputStream_BackspacePath() {
		System.out.println("getInputStream");
		String path = "\b";
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -&gt; {
			ResourceService.getInputStream(path);
		});
		assertEquals("No such resource: \b", exception.getMessage());
	}
	
	/**
	 * Test of getInputStream method, of class ResourceService.
	 * This test case tests the functionality of the getInputStream method
	 * when the path is a vertical tab.
	 */
	@Test
	public void testGetInputStream_VerticalTabPath() {
		System.out.println("getInputStream");
		String path = "\u000B";
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -&gt; {
			ResourceService.getInputStream(path);
		});
		assertEquals("No such resource: \u000B", exception.getMessage());
	}
	
	/**
	 * Test of getInputStream method, of class ResourceService.
	 * This test case tests the functionality of the getInputStream method
	 * when the path is a file separator.
	 */
	@Test
	public void testGetInputStream_FileSeparatorPath() {
		System.out.println("getInputStream");
		String path = "/";
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -&gt; {
			ResourceService.getInputStream(path);
		});
		assertEquals("No such resource: /", exception.getMessage());
	}
}</code>





A:

I think you are looking for something like this:
<code>public static InputStream getInputStream(String path) {
    InputStream resourceAsStream = ResourceService.class.getResourceAsStream(path);
    if (resourceAsStream == null) {
        throw new IllegalArgumentException("No such resource: " + path);
    }
    return resourceAsStream;
}
</code>
