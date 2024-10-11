// IconManager_5Test.java
package com.eteks.sweethome3d.swing;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.tools.ResourceURLContent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IconManager}.
* It contains ten unit test cases for the {@link IconManager#getIcon(Content, Component)} method.
*/
class IconManager_5Test {

		/**
		* Test case 1 for method {@link IconManager#getIcon(Content, Component)}.
		* Test case 1 for method {@link IconManager#getIcon(Content, int, Component)}.
		* Test case 1 for method {@link IconManager#getErrorIcon()}.
		* Test case 1 for method {@link IconManager#getErrorIcon(int)}.
		* Test case 1 for method {@link IconManager#getWaitIcon()}.
		* Test case 1 for method {@link IconManager#getWaitIcon(int)}.
		* Test case 1 for method {@link IconManager#isErrorIcon(Icon)}.
		* Test case 1 for method {@link IconManager#isWaitIcon(Icon)}.
		* Test case 1 for method {@link IconManager#createIcon(Content, int, Icon)}.
		* Test case 1 for method {@link IconManager#clear()}.
		* Test case 1 for method {@link IconManager#getInstance()}.
		* Test case 1 for method {@link IconManager#IconManager()}.
		* Test case 1 for method {@link IconManager#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#getIcon()}.
		* Test case 1 for method {@link IconManager#IconProxy#getIconWidth()}.
		* Test case 1 for method {@link IconManager#IconProxy#getIconHeight()}.
		* Test case 1 for method {@link IconManager#IconProxy#paintIcon(Component, Graphics, int, int)}.
		* Test case 1 for method {@link IconManager#IconProxy#run()}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content, int, Component, Icon, Icon)}.
		* Test case 1 for method {@link IconManager#IconProxy#IconProxy(Content