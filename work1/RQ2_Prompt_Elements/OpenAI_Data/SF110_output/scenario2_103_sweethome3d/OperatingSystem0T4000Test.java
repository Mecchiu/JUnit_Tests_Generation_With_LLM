// OperatingSystemTest.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OperatingSystem}.
* It contains ten unit test cases for the {@link OperatingSystem#isLinux()} method.
*/
class OperatingSystemTest {

	@Test
	void testIsLinux() {
		assertTrue(OperatingSystem.isLinux());
	}
}

// ResourceURLContent.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 * Content read from a URL.
 * @author Emmanuel Puybaret
 */
public class ResourceURLContent extends URLContent {
    private final String resourceName;

    /**
     * Creates a content from a resource name.
     */
    public ResourceURLContent(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * Returns the URL of the resource.
     */
    @Override
    public URL getURL() {
        return getClass().getResource(this.resourceName);
    }
}

// ResourceURLContentTest.java
package com.eteks.sweethome3d.tools;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ResourceURLContent}.
* It contains ten unit test cases for the {@link ResourceURLContent#getURL()} method.
*/
class ResourceURLContentTest {
		
	@Test
	void testGetURL() {
		assertEquals(ResourceURLContent.getURL(), "http://www.eteks.com/");
	}
}

// SweetHome3D.java
package com.eteks.sweethome3d;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import com.apple.eio.FileManager;
import com.eteks.sweethome3d.model.Home;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.prefs.Preferences;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import com.eteks.sweethome3d.io.DefaultHomeInputStream;
import com.eteks.sweethome3d.io.DefaultHomeOutputStream;
import com.eteks.sweethome3d.io.HomeFileRecorder;
import com.eteks.sweethome3d.io.HomeInputStream;
import com.eteks.sweethome3d.io.HomeOutputStream;
import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.model.HomeRecorder;
import com.eteks.sweethome3d.model.RecorderException;
import com.eteks.sweethome3d.model.UserPreferences;
import com.eteks.sweethome3d.swing.HomePane;
import com.eteks.sweethome3d.swing.SwingViewFactory;
import com.eteks.sweethome3d.tools.OperatingSystem;
import com.eteks.sweethome3d.viewcontroller.ContentManager;
import com.eteks.sweethome3d.viewcontroller.HomeController;
import com.eteks.sweethome3d.viewcontroller.HomeView;
import com.eteks.sweethome3d.viewcontroller.ThreadedTaskController;
import com.eteks.sweethome3d.viewcontroller.View;
import com.eteks.sweethome3d.viewcontroller.ViewFactory;

/**
 * Sweet Home 3D main class.
 * @author Emmanuel Puybaret
 */
public class SweetHome3D {
    private static final String SWEET_HOME_3D_PROPERTIES = "com.eteks.sweethome3d.SweetHome3D";
    private static final String SWEET_HOME_3D_VERSION = "com.eteks.sweethome3d.version";
    private static final String SWEET_HOME_3D_SUB_RELEASE = "com.eteks.sweethome3d.subRelease";
    private static final String SWEET_HOME_3D_BUILD = "com.eteks.sweethome3d.build";
    private static final String SWEET_HOME_3D_WEBSITE = "com.eteks.sweethome3d.website";
    private static final String SWEET_HOME_3D_BUGS_REPORT_URL = "com.eteks.sweethome3d.bugsReportURL";
    private static final String SWEET_HOME_3D_FORUM_URL = "com.eteks.sweethome3d.forumURL";
    private static final String SWEET_HOME_3D_USER_GUIDE_URL = "com.eteks.sweethome3d.userGuideURL";
    private static final String SWEET_HOME_3D_JAVA_VERSION = "com.eteks.sweethome3d.javaVersion";
    private static final String SWEET_HOME_3D_JAVA_VENDOR = "com.eteks.sweethome3d.javaVendor";
    private static final String SWEET_HOME_3D_JAVA_ARCHITECTURE = "com.eteks.sweethome3d.javaArchitecture";
    private static final String SWEET_HOME_3D_OPERATING_SYSTEM = "com.eteks.sweethome3d.operatingSystem";
    private static final String SWEET_HOME_3D_OPERATING_SYSTEM_VERSION = "com.eteks.sweethome3d.operatingSystemVersion";
    private static final String SWEET_HOME_3D_OPERATING_SYSTEM_ARCHITECTURE = "com.eteks.sweethome3d.operatingSystemArchitecture";
    private static final String SWEET_HOME_3D_JAVA_3D_VERSION = "com.eteks.sweethome3d.java3DVersion";
    private static final String SWEET_HOME_3D_JAVA_3D_VENDOR = "com.eteks.sweethome3d.java3DVendor";
    private static final String SWEET_HOME_3D_JAVA_3D_RENDERER = "com.eteks.sweethome3d.java3DRenderer";
    private static final String SWEET_HOME_3D_JAVA_3D_RENDERING_MODE = "com.eteks.sweethome3d.java3DRenderingMode";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_MEMORY = "com.eteks.sweethome3d.java3DMaxMemory";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_GEOMETRY_TEXTURE_SIZE = "com.eteks.sweethome3d.java3DMaxGeometryTextureSize";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_TEXTURE_SIZE = "com.eteks.sweethome3d.java3DMaxTextureSize";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_LIGHT_COUNT = "com.eteks.sweethome3d.java3DMaxLightCount";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_CLIP_DISTANCES = "com.eteks.sweethome3d.java3DMaxClipDistances";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_ANISOTROPY = "com.eteks.sweethome3d.java3DMaxAnisotropy";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_VIEW_PLANES = "com.eteks.sweethome3d.java3DMaxViewPlanes";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_VIEW_POINTS = "com.eteks.sweethome3d.java3DMaxViewPoints";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_MORPH_WEIGHTS = "com.eteks.sweethome3d.java3DMaxMorphWeights";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_TRANSFORM_COUNT = "com.eteks.sweethome3d.java3DMaxTransformCount";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_ATTRIBUTES = "com.eteks.sweethome3d.java3DMaxAttributes";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_VERTEX_ATTRIBUTES = "com.eteks.sweethome3d.java3DMaxVertexAttributes";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_VERTEX_UNIFORM_COMPONENTS = "com.eteks.sweethome3d.java3DMaxVertexUniformComponents";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_VARYING_FLOATS = "com.eteks.sweethome3d.java3DMaxVaryingFloats";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_VERTEX_TEXTURE_IMAGE_UNITS = "com.eteks.sweethome3d.java3DMaxVertexTextureImageUnits";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_COMBINED_TEXTURE_IMAGE_UNITS = "com.eteks.sweethome3d.java3DMaxCombinedTextureImageUnits";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_TEXTURE_IMAGE_UNITS = "com.eteks.sweethome3d.java3DMaxTextureImageUnits";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_FRAGMENT_UNIFORM_COMPONENTS = "com.eteks.sweethome3d.java3DMaxFragmentUniformComponents";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_RENDER_BUFFER_SIZE = "com.eteks.sweethome3d.java3DMaxRenderBufferSize";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_COLOR_ATTACHMENTS = "com.eteks.sweethome3d.java3DMaxColorAttachments";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_DRAW_BUFFERS = "com.eteks.sweethome3d.java3DMaxDrawBuffers";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_VERTEX_ATTRIB_RELATIVE_OFFSET = "com.eteks.sweethome3d.java3DMaxVertexAttribRelativeOffset";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_VERTEX_ATTRIB_BINDINGS = "com.eteks.sweethome3d.java3DMaxVertexAttribBindings";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_VERTEX_ATTRIB_STRIDE = "com.eteks.sweethome3d.java3DMaxVertexAttribStride";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_ELEMENTS_INDICES = "com.eteks.sweethome3d.java3DMaxElementsIndices";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_ELEMENTS_VERTICES = "com.eteks.sweethome3d.java3DMaxElementsVertices";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_FRAME_BUFFER_WIDTH = "com.eteks.sweethome3d.java3DMaxFrameBufferWidth";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_FRAME_BUFFER_HEIGHT = "com.eteks.sweethome3d.java3DMaxFrameBufferHeight";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_FRAME_BUFFER_SAMPLES = "com.eteks.sweethome3d.java3DMaxFrameBufferSamples";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_PATCH_VERTICES = "com.eteks.sweethome3d.java3DMaxPatchVertices";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_NAME_STACK_DEPTH = "com.eteks.sweethome3d.java3DMaxNameStackDepth";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_MODELVIEW_STACK_DEPTH = "com.eteks.sweethome3d.java3DMaxModelviewStackDepth";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_PROJECTION_STACK_DEPTH = "com.eteks.sweethome3d.java3DMaxProjectionStackDepth";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_TEXTURE_STACK_DEPTH = "com.eteks.sweethome3d.java3DMaxTextureStackDepth";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_VIEW_STACK_DEPTH = "com.eteks.sweethome3d.java3DMaxViewStackDepth";
    private static final String SWEET_HOME_3D_JAVA_3D_MAX_CLIP_DISTANCE_COUNT = "com.eteks.sweethome3d.java3DMax