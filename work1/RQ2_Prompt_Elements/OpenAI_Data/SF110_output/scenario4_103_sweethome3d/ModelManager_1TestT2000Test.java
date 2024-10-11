// ModelManager_1Test.java
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
* It contains ten unit test cases for the {@link ModelManager#getNormalizedTransformGroup(Node, float[][], float)} method.
*/
class ModelManager_1Test {

	/**
	 * Test method for {@link ModelManager#getNormalizedTransformGroup(Node, float[][], float)}.
	 */
	@Test
	public void testGetNormalizedTransformGroup() throws FileNotFoundException, IOException {
		// 1. Create a model manager
		ModelManager modelManager = ModelManager.getInstance();
		// 2. Load a model
		BranchGroup modelRoot = modelManager.loadModel(new URLContent(getClass().getResource("resources/test.obj")));
		// 3. Get the transform group that will normalize the model
		TransformGroup transformGroup = modelManager.getNormalizedTransformGroup(modelRoot, null, 1);
		// 4. Check the transform group is correct
		assertEquals(new Vector3f(0.5f, 0.5f, 0.5f), transformGroup.getTransform().getScale());
		assertEquals(new Vector3f(-0.5f, -0.5f, -0.5f), transformGroup.getTransform().getTranslation());
	}
	
	/**
	 * Test method for {@link ModelManager#getNormalizedTransformGroup(Node, float[][], float)}.
	 */
	@Test
	public void testGetNormalizedTransformGroupWithRotation() throws FileNotFoundException, IOException {
		// 1. Create a model manager
		ModelManager modelManager = ModelManager.getInstance();
		// 2. Load a model
		BranchGroup modelRoot = modelManager.loadModel(new URLContent(getClass().getResource("resources/test.obj")));
		// 3. Get the transform group that will normalize the model
		TransformGroup transformGroup = modelManager.getNormalizedTransformGroup(modelRoot, new float [][] {{0, 1, 0}, {1, 0, 0}, {0, 0, 1}}, 1);
		// 4. Check the transform group is correct
		assertEquals(new Vector3f(0.5f, 0.5f, 0.5f), transformGroup.getTransform().getScale());
		assertEquals(new Vector3f(-0.5f, -0.5f, -0.5f), transformGroup.getTransform().getTranslation());
	}
	
	/**
	 * Test method for {@link ModelManager#getNormalizedTransformGroup(Node, float[][], float)}.
	 */
	@Test
	public void testGetNormalizedTransformGroupWithRotationAndScale() throws FileNotFoundException, IOException {
		// 1. Create a model manager
		ModelManager modelManager = ModelManager.getInstance();
		// 2. Load a model
		BranchGroup modelRoot = modelManager.loadModel(new URLContent(getClass().getResource("resources/test.obj")));
		// 3. Get the transform group that will normalize the model
		TransformGroup transformGroup = modelManager.getNormalizedTransformGroup(modelRoot, new float [][] {{0, 1, 0}, {1, 0, 0}, {0, 0, 1}}, 2);
		// 4. Check the transform group is correct
		assertEquals(new Vector3f(1, 1, 1), transformGroup.getTransform().getScale());
		assertEquals(new Vector3f(-1, -1, -1), transformGroup.getTransform().getTranslation());
	}
	
	/**
	 * Test method for {@link ModelManager#getNormalizedTransformGroup(Node, float[][], float)}.
	 */
	@Test
	public void testGetNormalizedTransformGroupWithRotationAndScale2() throws FileNotFoundException, IOException {
		// 1. Create a model manager
		ModelManager modelManager = ModelManager.getInstance();
		// 2. Load a model
		BranchGroup modelRoot = modelManager.loadModel(new URLContent(getClass().getResource("resources/test.obj")));
		// 3. Get the transform group that will normalize the model
		TransformGroup transformGroup = modelManager.getNormalizedTransformGroup(modelRoot, new float [][] {{0, 1, 0}, {1, 0, 0}, {0, 0, 1}}, 0.5f);
		// 4. Check the transform group is correct
		assertEquals(new Vector3f(0.25f, 0.25f, 0.25f), transformGroup.getTransform().getScale());
		assertEquals(new Vector3f(-0.25f, -0.25f, -0.25f), transformGroup.getTransform().getTranslation());
	}
	
	/**
	 * Test method for {@link ModelManager#getNormalizedTransformGroup(Node, float[][], float)}.
	 */
	@Test
	public void testGetNormalizedTransformGroupWithRotationAndScale3() throws FileNotFoundException, IOException {
		// 1. Create a model manager
		ModelManager modelManager = ModelManager.getInstance();
		// 2. Load a model
		BranchGroup modelRoot = modelManager.loadModel(new URLContent(getClass().getResource("resources/test.obj")));
		// 3. Get the transform group that will normalize the model
		TransformGroup transformGroup = modelManager.getNormalizedTransformGroup(modelRoot, new float [][] {{0, 1, 0}, {1, 0, 0}, {0, 0, 1}}, 0.25f);
		// 4. Check the transform group is correct
		assertEquals(new Vector3f(0.125f, 0.125f, 0.125f), transformGroup.getTransform().getScale());
		assertEquals(new Vector3f(-0.125f, -0.125f, -0.125f), transformGroup.getTransform().getTranslation());
	}
	
	/**
	 * Test method for {@link ModelManager#getNormalizedTransformGroup(Node, float[][], float)}.
	 */
	@Test
	public void testGetNormalizedTransformGroupWithRotationAndScale4() throws FileNotFoundException, IOException {
		// 1. Create a model manager
		ModelManager modelManager = ModelManager.getInstance();
		// 2. Load a model
		BranchGroup modelRoot = modelManager.loadModel(new URLContent(getClass().getResource("resources/test.obj")));
		// 3. Get the transform group that will normalize the model
		TransformGroup transformGroup = modelManager.getNormalizedTransformGroup(modelRoot, new float [][] {{0, 1, 0}, {1, 0, 0}, {0, 0, 1}}, 0.125f);
		// 4. Check the transform group is correct
		assertEquals(new Vector3f(0.0625f, 0.0625f, 0.0625f), transformGroup.getTransform().getScale());
		assertEquals(new Vector3f(-0.0625f, -0.0625f, -0.0625f), transformGroup.getTransform().getTranslation());
	}
	
	/**
	 * Test method for {@link ModelManager#getNormalizedTransformGroup(Node, float[][], float)}.
	 */
	@Test
	public void testGetNormalizedTransformGroupWithRotationAndScale5() throws FileNotFoundException, IOException {
		// 1. Create a model manager
		ModelManager modelManager = ModelManager.getInstance();
		// 2. Load a model
		BranchGroup modelRoot = modelManager.loadModel(new URLContent(getClass().getResource("resources/test.obj")));
		// 3. Get the transform group that will normalize the model
		TransformGroup transformGroup = modelManager.getNormalizedTransformGroup(modelRoot, new float [][] {{0, 1, 0}, {1, 0, 0}, {0, 0, 1}}, 0.0625f);
		// 4. Check the transform group is correct
		assertEquals(new Vector3f(0.03125f, 0.03125f, 0.03125f), transformGroup.getTransform().getScale());
		assertEquals(new Vector3f(-0.03125f, -0.03125f, -0.03125f), transformGroup.getTransform().getTranslation());
	}
	
	/**
	 * Test method for {@link ModelManager#getNormalizedTransformGroup(Node, float[][], float)}.
	 */
	@Test
	public