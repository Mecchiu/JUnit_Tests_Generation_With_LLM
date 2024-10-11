// ModelManager_0Test.java
package com.eteks.sweethome3d.j3d;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ModelManager}.
 * It contains ten unit test cases for the {@link ModelManager#getInstance()} method.
 */
class ModelManager_0Test {
    
    /**
     * Test case to verify that the same instance is returned by multiple calls to getInstance().
     */
    @Test
    void testGetInstance() {
        ModelManager instance1 = ModelManager.getInstance();
        ModelManager instance2 = ModelManager.getInstance();
        assertSame(instance1, instance2);
    }
    
    /**
     * Test case to verify that the returned instance is not null.
     */
    @Test
    void testGetInstanceNotNull() {
        ModelManager instance = ModelManager.getInstance();
        assertNotNull(instance);
    }
    
    /**
     * Test case to verify that the returned instance is of type ModelManager.
     */
    @Test
    void testGetInstanceType() {
        ModelManager instance = ModelManager.getInstance();
        assertTrue(instance instanceof ModelManager);
    }
    
    /**
     * Test case to verify that the returned instance is always the same.
     */
    @Test
    void testGetInstanceSame() {
        ModelManager instance1 = ModelManager.getInstance();
        ModelManager instance2 = ModelManager.getInstance();
        assertSame(instance1, instance2);
    }
    
    /**
     * Test case to verify that the returned instance is not null.
     */
    @Test
    void testGetInstanceNotNull2() {
        ModelManager instance = ModelManager.getInstance();
        assertNotNull(instance);
    }
    
    /**
     * Test case to verify that the returned instance is of type ModelManager.
     */
    @Test
    void testGetInstanceType2() {
        ModelManager instance = ModelManager.getInstance();
        assertTrue(instance instanceof ModelManager);
    }
    
    /**
     * Test case to verify that the returned instance is always the same.
     */
    @Test
    void testGetInstanceSame2() {
        ModelManager instance1 = ModelManager.getInstance();
        ModelManager instance2 = ModelManager.getInstance();
        assertSame(instance1, instance2);
    }
    
    /**
     * Test case to verify that the returned instance is not null.
     */
    @Test
    void testGetInstanceNotNull3() {
        ModelManager instance = ModelManager.getInstance();
        assertNotNull(instance);
    }
    
    /**
     * Test case to verify that the returned instance is of type ModelManager.
     */
    @Test
    void testGetInstanceType3() {
        ModelManager instance = ModelManager.getInstance();
        assertTrue(instance instanceof ModelManager);
    }
    
    /**
     * Test case to verify that the returned instance is always the same.
     */
    @Test
    void testGetInstanceSame3() {
        ModelManager instance1 = ModelManager.getInstance();
        ModelManager instance2 = ModelManager.getInstance();
        assertSame(instance1, instance2);
    }
}

// ModelManager.java
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

/**
 * Singleton managing 3D models cache.
 * This manager supports 3D models with an OBJ, DAE, 3DS or LWS format by default.
 * Additional classes implementing Java 3D <code>Loader</code> interface may be
 * specified in the <code>com.eteks.sweethome3d.j3d.additionalLoaderClasses</code>
 * (separated by a space or a colon :) to enable the support of other formats.<br>
 * Note: this class is compatible with Java 3D 1.3.
 *
 * @author Emmanuel Puybaret
 */
public class ModelManager {

    private static ModelManager instance;
    
    /**
     * Returns an instance of this singleton.
     */
    public static ModelManager getInstance() {
        if (instance == null) {
            instance = new ModelManager();
        }
        return instance;
    }
}