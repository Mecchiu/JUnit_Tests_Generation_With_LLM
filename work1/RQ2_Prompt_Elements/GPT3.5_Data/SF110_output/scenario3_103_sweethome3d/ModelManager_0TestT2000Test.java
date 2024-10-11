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
     * Test case to verify that the instance returned by {@link ModelManager#getInstance()} is not null.
     */
    @Test
    void testGetInstanceNotNull() {
        assertNotNull(ModelManager.getInstance());
    }
    
    /**
     * Test case to verify that the instance returned by {@link ModelManager#getInstance()} is always the same.
     */
    @Test
    void testGetInstanceSameInstance() {
        assertSame(ModelManager.getInstance(), ModelManager.getInstance());
    }
    
    /**
     * Test case to verify that the instance returned by {@link ModelManager#getInstance()} is an instance of {@link ModelManager}.
     */
    @Test
    void testGetInstanceInstanceOfModelManager() {
        assertTrue(ModelManager.getInstance() instanceof ModelManager);
    }
    
    /**
     * Test case to verify that the cache of the instance returned by {@link ModelManager#getInstance()} is not null.
     */
    @Test
    void testGetInstanceCacheNotNull() {
        assertNotNull(ModelManager.getInstance().getCache());
    }
    
    /**
     * Test case to verify that the cache of the instance returned by {@link ModelManager#getInstance()} is an instance of {@link Map}.
     */
    @Test
    void testGetInstanceCacheInstanceOfMap() {
        assertTrue(ModelManager.getInstance().getCache() instanceof Map);
    }
    
    /**
     * Test case to verify that the cache of the instance returned by {@link ModelManager#getInstance()} is empty at the beginning.
     */
    @Test
    void testGetInstanceCacheEmpty() {
        assertTrue(ModelManager.getInstance().getCache().isEmpty());
    }
    
    /**
     * Test case to verify that the executor of the instance returned by {@link ModelManager#getInstance()} is not null.
     */
    @Test
    void testGetInstanceExecutorNotNull() {
        assertNotNull(ModelManager.getInstance().getExecutor());
    }
    
    /**
     * Test case to verify that the executor of the instance returned by {@link ModelManager#getInstance()} is an instance of {@link ExecutorService}.
     */
    @Test
    void testGetInstanceExecutorInstanceOfExecutorService() {
        assertTrue(ModelManager.getInstance().getExecutor() instanceof ExecutorService);
    }
    
    /**
     * Test case to verify that the executor of the instance returned by {@link ModelManager#getInstance()} has a single thread.
     */
    @Test
    void testGetInstanceExecutorSingleThread() {
        assertEquals(1, ((ExecutorService) ModelManager.getInstance().getExecutor()).getMaximumPoolSize());
    }
    
    /**
     * Test case to verify that the executor of the instance returned by {@link ModelManager#getInstance()} is a cached thread pool.
     */
    @Test
    void testGetInstanceExecutorCachedThreadPool() {
        assertTrue(ModelManager.getInstance().getExecutor() instanceof Executors.CachedThreadPool);
    }
}

// ModelManager.java
package com.eteks.sweethome3d.j3d;

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
    private final Map<URL, Node> cache;
    private final ExecutorService executor;

    /**
     * Private constructor to prevent instantiation.
     */
    private ModelManager() {
        cache = new WeakHashMap<>();
        executor = Executors.newCachedThreadPool();
    }

    /**
     * Returns an instance of this singleton.
     */
    public static ModelManager getInstance() {
        if (instance == null) {
            instance = new ModelManager();
        }
        return instance;
    }

    /**
     * Returns the cache of this manager.
     */
    public Map<URL, Node> getCache() {
        return cache;
    }

    /**
     * Returns the executor of this manager.
     */
    public ExecutorService getExecutor() {
        return executor;
    }
}