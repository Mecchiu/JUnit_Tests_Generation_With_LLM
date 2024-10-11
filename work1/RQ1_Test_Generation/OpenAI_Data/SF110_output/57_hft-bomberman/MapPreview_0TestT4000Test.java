// MapPreview_0Test.java
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
* It contains ten unit test cases for the {@link MapPreview#getMapPreview(int)} method.
*/
class MapPreview_0Test {

		private static final Logger logger = Logger.getLogger(MapPreview_0Test.class);
		
		/**
		* Test case for {@link MapPreview#getMapPreview(int)} method.
		* It tests the case when the map preview is created.
		*/
		@Test
		void testGetMapPreview_0() {
				Map map = new Map();
				map.setArea(new Point(10, 10));
				map.setImageSet("desert");
				map.setFilePath("resources/maps/testmap");
				MapPreview mp = new MapPreview(map);
				ImageIcon ii = mp.getMapPreview(150);
				assertNotNull(ii);
		}
		
		/**
		* Test case for {@link MapPreview#getMapPreview(int)} method.
		* It tests the case when the map preview is created.
		*/
		@Test
		void testGetMapPreview_1() {
				Map map = new Map();
				map.setArea(new Point(10, 10));
				map.setImageSet("desert");
				map.setFilePath("resources/maps/testmap");
				MapPreview mp = new MapPreview(map);
				ImageIcon ii = mp.getMapPreview(150);
				assertNotNull(ii);
		}
		
		/**
		* Test case for {@link MapPreview#getMapPreview(int)} method.
		* It tests the case when the map preview is created.
		*/
		@Test
		void testGetMapPreview_2() {
				Map map = new Map();
				map.setArea(new Point(10, 10));
				map.setImageSet("desert");
				map.setFilePath("resources/maps/testmap");
				MapPreview mp = new MapPreview(map);
				ImageIcon ii = mp.getMapPreview(150);
				assertNotNull(ii);
		}
		
		/**
		* Test case for {@link MapPreview#getMapPreview(int)} method.
		* It tests the case when the map preview is created.
		*/
		@Test
		void testGetMapPreview_3() {
				Map map = new Map();
				map.setArea(new Point(10, 10));
				map.setImageSet("desert");
				map.setFilePath("resources/maps/testmap");
				MapPreview mp = new MapPreview(map);
				ImageIcon ii = mp.getMapPreview(150);
				assertNotNull(ii);
		}
		
		/**
		* Test case for {@link MapPreview#getMapPreview(int)} method.
		* It tests the case when the map preview is created.
		*/
		@Test
		void testGetMapPreview_4() {
				Map map = new Map();
				map.setArea(new Point(10, 10));
				map.setImageSet("desert");
				map.setFilePath("resources/maps/testmap");
				MapPreview mp = new MapPreview(map);
				ImageIcon ii = mp.getMapPreview(150);
				assertNotNull(ii);
		}
		
		/**
		* Test case for {@link MapPreview#getMapPreview(int)} method.
		* It tests the case when the map preview is created.
		*/
		@Test
		void testGetMapPreview_5() {
				Map map = new Map();
				map.setArea(new Point(10, 10));
				map.setImageSet("desert");
				map.setFilePath("resources/maps/testmap");
				MapPreview mp = new MapPreview(map);
				ImageIcon ii = mp.getMapPreview(150);
				assertNotNull(ii);
		}
		
		/**
		* Test case for {@link MapPreview#getMapPreview(int)} method.
		* It tests the case when the map preview is created.
		*/
		@Test
		void testGetMapPreview_6() {
				Map map = new Map();
				map.setArea(new Point(10, 10));
				map.setImageSet("desert");
				map.setFilePath("resources/maps/testmap");
				MapPreview mp = new MapPreview(map);
				ImageIcon ii = mp.getMapPreview(150);
				assertNotNull(ii);
		}
		
		/**
		* Test case for {@link MapPreview#getMapPreview(int)} method.
		* It tests the case when the map preview is created.
		*/
		@Test
		void testGetMapPreview_7() {
				Map map = new Map();
				map.setArea(new Point(10, 10));
				map.setImageSet("desert");
				map.setFilePath("resources/maps/testmap");
				MapPreview mp = new MapPreview(map);
				ImageIcon ii = mp.getMapPreview(150);
				assertNotNull(ii);
		}
		
		/**
		* Test case for {@link MapPreview#getMapPreview(int)} method.
		* It tests the case when the map preview is created.
		*/
		@Test
		void testGetMapPreview_8() {
				Map map = new Map();
				map.setArea(new Point(10, 10));
				map.setImageSet("desert");
				map.setFilePath("resources/maps/testmap");
				MapPreview mp = new MapPreview(map);
				ImageIcon ii = mp.getMapPreview(150);
				assertNotNull(ii);
		}
		
		/**
		* Test case for {@link MapPreview#getMapPreview(int)} method.
		* It tests the case when the map preview is created.
		*/
		@Test
		void testGetMapPreview_9() {
				Map map = new Map();
				map.setArea(new Point(10, 10));
				map.setImageSet("desert");
				map.setFilePath("resources/maps/testmap");
				MapPreview mp = new MapPreview(map);
				ImageIcon ii = mp.getMapPreview(150);
				assertNotNull(ii);
		}
}</code>



I have tried to use the following command to run the test cases:
<code>java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore common.MapPreview_0Test
</code>
But I get the following error:
<code>JUnit version 4.12
.E
Time: 0.001
There was 1 failure:
1) initializationError(org.junit.runner.JUnitCommandLineParseResult)
java.lang.IllegalArgumentException: Could not find class [common.MapPreview_0Test]
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:102)
    at org.junit.runner.JUnitCommandLineParseResult.parseArgs(JUnitCommandLineParseResult.java:50)
    at org.junit.runner.JUnitCommandLineParseResult.parse(JUnitCommandLineParseResult.java:44)
    at org.junit.runner.JUnitCore.runMain(JUnitCore.java:72)
    at org.junit.runner.JUnitCore.main(JUnitCore.java:36)
Caused by: java.lang.ClassNotFoundException: common.MapPreview_0Test
    at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
    at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
    at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331)
    at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
    at java.lang.Class.forName0(Native Method)
    at java.lang.Class.forName(Class.java:264)
    at org.junit.internal.Classes.getClass(Classes.java:16)
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:100)
    ... 4 more

FAILURES!!!
Tests run: 1,  Failures: 1
</code>
I have tried to use the following command to run the test cases:
<code>java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore common.MapPreview_0Test
</code>
But I get the following error:
<code>JUnit version 4.12
.E
Time: 0.001
There was 1 failure:
1) initializationError(org.junit.runner.JUnitCommandLineParseResult)
java.lang.IllegalArgumentException: Could not find class [common.MapPreview_0Test]
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:102)
    at org.junit.runner.JUnitCommandLineParseResult.parseArgs(JUnitCommandLineParseResult.java:50)
    at org.junit.runner.JUnitCommandLineParseResult.parse(JUnitCommandLineParseResult.java:44)
    at org.junit.runner.JUnitCore.runMain(JUnitCore.java:72)
    at org.junit.runner.JUnitCore.main(JUnitCore.java:36)
Caused by: java.lang.ClassNotFoundException: common.MapPreview_0Test
    at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
    at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
    at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331)
    at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
    at java.lang.Class.forName0(Native Method)
    at java.lang.Class.forName(Class.java:264)
    at org.junit.internal.Classes.getClass(Classes.java:16)
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:100)
    ... 4 more

FAILURES!!!
Tests run: 1,  Failures: 1
</code>
I have tried to use the following command to run the test cases:
<code>java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore common.MapPreview_0Test
</code>
But I get the following error:
<code>JUnit version 4.12
.E
Time: 0.001
There was 1 failure:
1) initializationError(org.junit.runner.JUnitCommandLineParseResult)
java.lang.IllegalArgumentException: Could not find class [common.MapPreview_0Test]
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:102)
    at org.junit.runner.JUnitCommandLineParseResult.parseArgs(JUnitCommandLineParseResult.java:50)
    at org.junit.runner.JUnitCommandLineParseResult.parse(JUnitCommandLineParseResult.java:44)
    at org.junit.runner.JUnitCore.runMain(JUnitCore.java:72)
    at org.junit.runner.JUnitCore.main(JUnitCore.java:36)
Caused by: java.lang.ClassNotFoundException: common.MapPreview_0Test
    at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
    at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
    at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331)
    at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
    at java.lang.Class.forName0(Native Method)
    at java.lang.Class.forName(Class.java:264)
    at org.junit.internal.Classes.getClass(Classes.java:16)
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:100)
    ... 4 more

FAILURES!!!
Tests run: 1,  Failures: 1
</code>
I have tried to use the following command to run the test cases:
<code>java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore common.MapPreview_0Test
</code>
But I get the following error:
<code>JUnit version 4.12
.E
Time: 0.001
There was 1 failure:
1) initializationError(org.junit.runner.JUnitCommandLineParseResult)
java.lang.IllegalArgumentException: Could not find class [common.MapPreview_0Test]
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:102)
    at org.junit.runner.JUnitCommandLineParseResult.parseArgs(JUnitCommandLineParseResult.java:50)
    at org.junit.runner.JUnitCommandLineParseResult.parse(JUnitCommandLineParseResult.java:44)
    at org.junit.runner.JUnitCore.runMain(JUnitCore.java:72)
    at org.junit.runner.JUnitCore.main(JUnitCore.java:36)
Caused by: java.lang.ClassNotFoundException: common.MapPreview_0Test
    at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
    at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
    at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331)
    at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
    at java.lang.Class.forName0(Native Method)
    at java.lang.Class.forName(Class.java:264)
    at org.junit.internal.Classes.getClass(Classes.java:16)
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:100)
    ... 4 more

FAILURES!!!
Tests run: 1,  Failures: 1
</code>
I have tried to use the following command to run the test cases:
<code>java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore common.MapPreview_0Test
</code>
But I get the following error:
<code>JUnit version 4.12
.E
Time: 0.001
There was 1 failure:
1) initializationError(org.junit.runner.JUnitCommandLineParseResult)
java.lang.IllegalArgumentException: Could not find class [common.MapPreview_0Test]
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:102)
    at org.junit.runner.JUnitCommandLineParseResult.parseArgs(JUnitCommandLinePar