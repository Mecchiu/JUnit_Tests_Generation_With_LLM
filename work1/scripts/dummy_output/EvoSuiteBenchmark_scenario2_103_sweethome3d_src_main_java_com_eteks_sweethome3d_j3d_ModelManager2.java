// ModelManagerTest.java
package com.eteks.sweethome3d.j3d;

import java.awt.EventQueue;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.GeneralPath;
import java.awt.geom.PathIterator;
import java.awt.geom.Rectangle2D;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingBox;
import javax.media.j3d.Bounds;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Geometry;
import javax.media.j3d.GeometryArray;
import javax.media.j3d.GeometryStripArray;
import javax.media.j3d.Group;
import javax.media.j3d.IndexedGeometryArray;
import javax.media.j3d.IndexedGeometryStripArray;
import javax.media.j3d.IndexedQuadArray;
import javax.media.j3d.IndexedTriangleArray;
import javax.media.j3d.IndexedTriangleFanArray;
import javax.media.j3d.IndexedTriangleStripArray;
import javax.media.j3d.Light;
import javax.media.j3d.Link;
import javax.media.j3d.Material;
import javax.media.j3d.Node;
import javax.media.j3d.QuadArray;
import javax.media.j3d.RenderingAttributes;
import javax.media.j3d.Shape3D;
import javax.media.j3d.SharedGroup;
import javax.media.j3d.Texture;
import javax.media.j3d.TextureAttributes;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.TransparencyAttributes;
import javax.media.j3d.TriangleArray;
import javax.media.j3d.TriangleFanArray;
import javax.media.j3d.TriangleStripArray;
import javax.vecmath.Color3f;
import javax.vecmath.Matrix3f;
import javax.vecmath.Point3d;
import javax.vecmath.Point3f;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;
import org.apache.batik.parser.AWTPathProducer;
import org.apache.batik.parser.ParseException;
import org.apache.batik.parser.PathParser;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.model.HomePieceOfFurniture;
import com.eteks.sweethome3d.tools.TemporaryURLContent;
import com.eteks.sweethome3d.tools.URLContent;
import com.microcrowd.loader.java3d.max3ds.Loader3DS;
import com.sun.j3d.loaders.IncorrectFormatException;
import com.sun.j3d.loaders.Loader;
import com.sun.j3d.loaders.ParsingErrorException;
import com.sun.j3d.loaders.Scene;
import com.sun.j3d.loaders.lw3d.Lw3dLoader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModelManager}.
* It contains ten unit test cases for the {@link ModelManager#getNormalizedTransform(Node, float[][], float)} method.
*/
class ModelManagerTest {
		
		@Test
		void testGetNormalizedTransform() {
				// Test 1
				Node node = new BranchGroup();
				float[][] modelRotation = null;
				float width = 1;
				Transform3D expected = new Transform3D();
				expected.setScale(new Vector3d(1, 1, 1));
				Transform3D actual = ModelManager.getNormalizedTransform(node, modelRotation, width);
				assertEquals(expected, actual);
				
				// Test 2
				node = new BranchGroup();
				modelRotation = new float[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
				width = 1;
				expected = new Transform3D();
				expected.setScale(new Vector3d(1, 1, 1));
				actual = ModelManager.getNormalizedTransform(node, modelRotation, width);
				assertEquals(expected, actual);
				
				// Test 3
				node = new BranchGroup();
				modelRotation = new float[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
				width = 2;
				expected = new Transform3D();
				expected.setScale(new Vector3d(2, 2, 2));
				actual = ModelManager.getNormalizedTransform(node, modelRotation, width);
				assertEquals(expected, actual);
				
				// Test 4
				node = new BranchGroup();
				modelRotation = new float[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
				width = 0.5f;
				expected = new Transform3D();
				expected.setScale(new Vector3d(0.5, 0.5, 0.5));
				actual = ModelManager.getNormalizedTransform(node, modelRotation, width);
				assertEquals(expected, actual);
				
				// Test 5
				node = new BranchGroup();
				modelRotation = new float[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
				width = 0.5f;
				expected = new Transform3D();
				expected.setScale(new Vector3d(0.5, 0.5, 0.5));
				actual = ModelManager.getNormalizedTransform(node, modelRotation, width);
				assertEquals(expected, actual);
				
				// Test 6
				node = new BranchGroup();
				modelRotation = new float[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
				width = 0.5f;
				expected = new Transform3D();
				expected.setScale(new Vector3d(0.5, 0.5, 0.5));
				actual = ModelManager.getNormalizedTransform(node, modelRotation, width);
				assertEquals(expected, actual);
				
				// Test 7
				node = new BranchGroup();
				modelRotation = new float[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
				width = 0.5f;
				expected = new Transform3D();
				expected.setScale(new Vector3d(0.5, 0.5, 0.5));
				actual = ModelManager.getNormalizedTransform(node, modelRotation, width);
				assertEquals(expected, actual);
				
				// Test 8
				node = new BranchGroup();
				modelRotation = new float[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
				width = 0.5f;
				expected = new Transform3D();
				expected.setScale(new Vector3d(0.5, 0.5, 0.5));
				actual = ModelManager.getNormalizedTransform(node, modelRotation, width);
				assertEquals(expected, actual);
				
				// Test 9
				node = new BranchGroup();
				modelRotation = new float[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
				width = 0.5f;
				expected = new Transform3D();
				expected.setScale(new Vector3d(0.5, 0.5, 0.5));
				actual = ModelManager.getNormalizedTransform(node, modelRotation, width);
				assertEquals(expected, actual);
				
				// Test 10
				node = new BranchGroup();
				modelRotation = new float[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
				width = 0.5f;
				expected = new Transform3D();
				expected.setScale(new Vector3d(0.5, 0.5, 0.5));
				actual = ModelManager.getNormalizedTransform(node, modelRotation, width);
				assertEquals(expected, actual);
		}
}