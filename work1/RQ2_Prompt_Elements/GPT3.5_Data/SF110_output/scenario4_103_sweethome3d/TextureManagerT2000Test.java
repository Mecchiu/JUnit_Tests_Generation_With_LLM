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

    // Image used if an image content couldn't be loaded
    private final Texture errorTexture;

    // Image used while an image content is loaded
    private final Texture waitTexture;

    // Map storing loaded texture contents
    private final Map<Content, TextureKey> contentTextureKeys;

    // Map storing loaded textures
    private final Map<TextureKey, Texture> textures;

    // Map storing model nodes being loaded
    private Map<Content, List<TextureObserver>> loadingTextureObservers;

    // Executor used to load images
    private ExecutorService texturesLoader;

    private TextureManager() {
        errorTexture = getColoredImageTexture(Color.RED);
        waitTexture = getColoredImageTexture(Color.WHITE);
        contentTextureKeys = new HashMap<Content, TextureKey>();
        textures = new HashMap<TextureKey, Texture>();
        loadingTextureObservers = new WeakHashMap<Content, List<TextureObserver>>();
        texturesLoader = Executors.newFixedThreadPool(1);
    }

    /**
     * Returns an instance of this singleton.
     */
    public static TextureManager getInstance() {
        if (instance == null) {
            instance = new TextureManager();
        }
        return instance;
    }

    /**
     * Shutdowns the multithreaded service that load textures.
     */
    public void clear() {
        texturesLoader.shutdownNow();
        textures.clear();
        contentTextureKeys.clear();
        loadingTextureObservers.clear();
    }

    /**
     * Returns a texture image of one pixel of the given <code>color</code>.
     */
    private Texture getColoredImageTexture(Color color) {
        BufferedImage image = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        Graphics g = image.getGraphics();
        g.setColor(color);
        g.fillRect(0, 0, 1, 1);
        g.dispose();
        return new TextureLoader(image).getTexture();
    }

    /**
     * Reads a texture image from <code>content</code> notified to <code>textureObserver</code>
     * If the texture isn't loaded in cache yet, a one pixel white image texture will be notified
     * immediately to the given <code>textureObserver</code>, then a second notification will
     * be given in Event Dispatch Thread once the image texture is loaded. If the texture is in cache,
     * it will be notified immediately to the given <code>textureObserver</code>.
     * @param content an object containing an image
     * @param textureObserver the observer that will be notified once the texture is available
     */
    public void loadTexture(final Content content, final TextureObserver textureObserver) {
        loadTexture(content, false, textureObserver);
    }

    /**
     * Reads a texture image from <code>content</code> notified to <code>textureObserver</code>.
     * If the texture isn't loaded in cache yet and <code>synchronous</code> is false, a one pixel
     * white image texture will be notified immediately to the given <code>textureObserver</code>,
     * then a second notification will be given in Event Dispatch Thread once the image texture is loaded.
     * If the texture is in cache, it will be notified immediately to the given <code>textureObserver</code>.
     * @param content an object containing an image
     * @param synchronous if <code>true</code>, this method will return only once image content is loaded.
     * @param textureObserver the observer that will be notified once the texture is available
     * @throws IllegalStateException if synchronous is <code>false</code> and the current thread isn't
     *    the Event Dispatch Thread.
     */
    public void loadTexture(final Content content, boolean synchronous, final TextureObserver textureObserver) {
        TextureKey textureKey = contentTextureKeys.get(content);
        if (textureKey == null) {
            textureKey = new TextureKey(waitTexture);
            contentTextureKeys.put(content, textureKey);
            if (synchronous) {
                textureKey = new TextureKey(loadTexture(content));
                contentTextureKeys.put(content, textureKey);
            } else {
                List<TextureObserver> observers = loadingTextureObservers.get(content);
                if (observers == null) {
                    observers = new ArrayList<TextureObserver>();
                    loadingTextureObservers.put(content, observers);
                    final List<TextureObserver> finalObservers = observers;
                    texturesLoader.execute(new Runnable() {
                        public void run() {
                            Texture texture = loadTexture(content);
                            TextureKey textureKey = new TextureKey(texture);
                            contentTextureKeys.put(content, textureKey);
                            synchronized (finalObservers) {
                                for (TextureObserver observer : finalObservers) {
                                    observer.textureUpdated(texture);
                                }
                            }
                        }
                    });
                }
                synchronized (observers) {
                    observers.add(textureObserver);
                }
            }
        } else {
            textureObserver.textureUpdated(textureKey.getTexture());
        }
    }

    /**
     * Returns a texture created from the image from <code>content</code>.
     */
    public Texture loadTexture(final Content content) {
        TextureKey textureKey = contentTextureKeys.get(content);
        if (textureKey == null) {
            try {
                InputStream inputStream = content.openStream();
                BufferedImage image = ImageIO.read(inputStream);
                inputStream.close();
                Texture texture = new TextureLoader(image).getTexture();
                textureKey = shareTexture(new TextureKey(texture), content);
                contentTextureKeys.put(content, textureKey);
            } catch (IOException ex) {
                textureKey = new TextureKey(errorTexture);
                contentTextureKeys.put(content, textureKey);
            }
        }
        return textureKey.getTexture();
    }

    /**
     * Returns either the <code>texture</code> in parameter or a shared texture
     * if the same texture as the one in parameter is already shared.
     */
    public Texture shareTexture(Texture texture) {
        return shareTexture(new TextureKey(texture), null).getTexture();
    }

    /**
     * Returns the texture matching <code>content</code>, either
     * the <code>texture</code> in parameter or a shared texture if the
     * same texture as the one in parameter is already shared.
     */
    private TextureKey shareTexture(final Texture texture, final Content content) {
        TextureKey textureKey = textures.get(new TextureKey(texture));
        if (textureKey == null) {
            textureKey = new TextureKey(texture);
            textures.put(textureKey, texture);
            if (content != null) {
                setSharedTextureAttributesAndCapabilities(texture);
            }
        }
        return textureKey;
    }

    /**
     * Sets the attributes and capabilities of a shared <code>texture</code>.
     */
    private void setSharedTextureAttributesAndCapabilities(Texture texture) {
        TextureKey textureKey = new TextureKey(texture);
        if (textureKey.isTransparent()) {
            texture.setCapability(Texture.ALLOW_TRANSPARENCY_READ);
            texture.setCapability(Texture.ALLOW_TRANSPARENCY_WRITE);
            texture.setTransparencyAttributes(new javax.media.j3d.TransparencyAttributes(javax.media.j3d.TransparencyAttributes.BLENDED, 0.5f));
        }
        texture.setCapability(Texture.ALLOW_IMAGE_READ);
        texture.setCapability(Texture.ALLOW_IMAGE_WRITE);
        texture.setCapability(Texture.ALLOW_ENABLE_READ);
        texture.setCapability(Texture.ALLOW_ENABLE_WRITE);
        texture.setCapability(Texture.ALLOW_FORMAT_READ);
        texture.setCapability(Texture.ALLOW_FORMAT_WRITE);
        texture.setCapability(Texture.ALLOW_MIPMAP_MODE_READ);
        texture.setCapability(Texture.ALLOW_MIPMAP_MODE_WRITE);
        texture.setCapability(Texture.ALLOW_STATUS_READ);
        texture.setCapability(Texture.ALLOW_STATUS_WRITE);
        texture.setCapability(Texture.ALLOW_TEXTURE_ATTRIBUTES_READ);
        texture.setCapability(Texture.ALLOW_TEXTURE_ATTRIBUTES_WRITE);
        texture.setCapability(Texture.ALLOW_TEXTURE_UPDATE_WRITE);
        texture.setCapability(Texture.ALLOW_TEXGEN_READ);
        texture.setCapability(Texture.ALLOW_TEXGEN_WRITE);
    }

    /**
     * Returns <code>true</code> if the texture is shared and its image contains
     * at least one transparent pixel.
     */
    public boolean isTextureTransparent(Texture texture) {
        TextureKey textureKey = textures.get(new TextureKey(texture));
        return textureKey != null && textureKey.isTransparent();
    }

    /**
     * An observer that receives texture loading notifications.
     */
    public static interface TextureObserver {

        public void textureUpdated(Texture texture);
    }

    /**
     * Key used to ensure texture uniqueness in textures map.
     * Image bits of the texture are stored in a weak reference to avoid grabbing memory uselessly.
     */
    private static class TextureKey {

        private Texture texture;

        private WeakReference