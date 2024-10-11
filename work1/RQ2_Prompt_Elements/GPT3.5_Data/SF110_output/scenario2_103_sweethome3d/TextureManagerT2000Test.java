// TextureManager.java
package com.eteks.sweethome3d.j3d;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;
import javax.media.j3d.ImageComponent;
import javax.media.j3d.ImageComponent2D;
import javax.media.j3d.Texture;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.tools.URLContent;
import com.sun.j3d.utils.image.TextureLoader;

/**
 * Singleton managing texture image cache.
 *
 * @author Emmanuel Puybaret
 */
public class TextureManager {

    private static TextureManager instance;

    /**
     * Returns an instance of this singleton.
     */
    public static TextureManager getInstance() {
        if (instance == null) {
            instance = new TextureManager();
        }
        return instance;
    }

    // Rest of the class implementation
}

// TextureManagerTest.java
package com.eteks.sweethome3d.j3d;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.imageio.ImageIO;
import javax.media.j3d.ImageComponent;
import javax.media.j3d.ImageComponent2D;
import javax.media.j3d.Texture;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.tools.URLContent;
import com.sun.j3d.utils.image.TextureLoader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TextureManager}.
* It contains ten unit test cases for the {@link TextureManager#getInstance()} method.
*/
class TextureManagerTest {

    @Test
    void testGetInstanceReturnsNonNull() {
        assertNotNull(TextureManager.getInstance());
    }

    @Test
    void testGetInstanceReturnsSameInstance() {
        TextureManager instance1 = TextureManager.getInstance();
        TextureManager instance2 = TextureManager.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    void testGetInstanceReturnsSingleton() {
        TextureManager instance1 = TextureManager.getInstance();
        TextureManager instance2 = new TextureManager();
        assertSame(instance1, instance2);
    }

    @Test
    void testGetInstanceReturnsThreadSafeSingleton() throws InterruptedException {
        List<TextureManager> instances = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> instances.add(TextureManager.getInstance()));
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {
            Thread.sleep(100);
        }
        assertEquals(1, instances.stream().distinct().count());
    }

    @Test
    void testGetInstanceReturnsSameInstanceAfterNullification() {
        TextureManager instance1 = TextureManager.getInstance();
        TextureManager.instance = null;
        TextureManager instance2 = TextureManager.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    void testGetInstanceReturnsSameInstanceAfterDeserialization() throws IOException, ClassNotFoundException {
        TextureManager instance1 = TextureManager.getInstance();
        // Serialize and deserialize the instance
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(instance1);
        oos.close();
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        TextureManager instance2 = (TextureManager) ois.readObject();
        ois.close();
        // Test that the deserialized instance is the same as the original one
        assertSame(instance1, instance2);
    }

    @Test
    void testGetInstanceReturnsSameInstanceAfterCloning() throws CloneNotSupportedException {
        TextureManager instance1 = TextureManager.getInstance();
        TextureManager instance2 = (TextureManager) instance1.clone();
        assertSame(instance1, instance2);
    }

    @Test
    void testGetInstanceReturnsSameInstanceAfterReflection() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        TextureManager instance1 = TextureManager.getInstance();
        Constructor<TextureManager> constructor = TextureManager.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        TextureManager instance2 = constructor.newInstance();
        assertSame(instance1, instance2);
    }

    @Test
    void testGetInstanceReturnsSameInstanceAfterMultithreadedInitialization() throws InterruptedException {
        List<TextureManager> instances = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.execute(() -> instances.add(TextureManager.getInstance()));
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {
            Thread.sleep(100);
        }
        assertEquals(1, instances.stream().distinct().count());
    }
}