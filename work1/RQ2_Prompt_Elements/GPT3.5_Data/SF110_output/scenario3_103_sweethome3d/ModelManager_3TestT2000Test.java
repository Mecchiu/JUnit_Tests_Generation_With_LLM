// ModelManager_3Test.java
package com.eteks.sweethome3d.j3d;

import com.eteks.sweethome3d.model.Content;
import org.junit.jupiter.api.Test;

import javax.media.j3d.BranchGroup;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test class of {@link ModelManager}.
 * It contains ten unit test cases for the {@link ModelManager#loadModel(Content)} method.
 */
class ModelManager_3Test {

    /**
     * Test loading a null content.
     */
    @Test
    void testLoadModelWithNullContent() {
        assertThrows(NullPointerException.class, () -> ModelManager.getInstance().loadModel(null));
    }

    /**
     * Test loading a content with a null URL.
     */
    @Test
    void testLoadModelWithNullURL() {
        Content content = new Content(null, null);
        assertThrows(IOException.class, () -> ModelManager.getInstance().loadModel(content));
    }

    /**
     * Test loading a content with an unsupported format.
     */
    @Test
    void testLoadModelWithUnsupportedFormat() {
        Content content = new Content("unsupportedFormat.xyz", getClass().getResourceAsStream("/unsupportedFormat.xyz"));
        assertThrows(IOException.class, () -> ModelManager.getInstance().loadModel(content));
    }

    /**
     * Test loading a content with an empty stream.
     */
    @Test
    void testLoadModelWithEmptyStream() {
        Content content = new Content("emptyStream.obj", getClass().getResourceAsStream("/emptyStream.obj"));
        assertThrows(IOException.class, () -> ModelManager.getInstance().loadModel(content));
    }

    /**
     * Test loading a content with an invalid stream.
     */
    @Test
    void testLoadModelWithInvalidStream() {
        Content content = new Content("invalidStream.obj", getClass().getResourceAsStream("/invalidStream.obj"));
        assertThrows(IOException.class, () -> ModelManager.getInstance().loadModel(content));
    }

    /**
     * Test loading a content with a valid OBJ format.
     */
    @Test
    void testLoadModelWithValidOBJFormat() throws IOException {
        Content content = new Content("validOBJFormat.obj", getClass().getResourceAsStream("/validOBJFormat.obj"));
        BranchGroup branchGroup = ModelManager.getInstance().loadModel(content);
        assertNotNull(branchGroup);
    }

    /**
     * Test loading a content with a valid DAE format.
     */
    @Test
    void testLoadModelWithValidDAEFormat() throws IOException {
        Content content = new Content("validDAEFormat.dae", getClass().getResourceAsStream("/validDAEFormat.dae"));
        BranchGroup branchGroup = ModelManager.getInstance().loadModel(content);
        assertNotNull(branchGroup);
    }

    /**
     * Test loading a content with a valid 3DS format.
     */
    @Test
    void testLoadModelWithValid3DSFormat() throws IOException {
        Content content = new Content("valid3DSFormat.3ds", getClass().getResourceAsStream("/valid3DSFormat.3ds"));
        BranchGroup branchGroup = ModelManager.getInstance().loadModel(content);
        assertNotNull(branchGroup);
    }

    /**
     * Test loading a content with a valid LWS format.
     */
    @Test
    void testLoadModelWithValidLWSFormat() throws IOException {
        Content content = new Content("validLWSFormat.lws", getClass().getResourceAsStream("/validLWSFormat.lws"));
        BranchGroup branchGroup = ModelManager.getInstance().loadModel(content);
        assertNotNull(branchGroup);
    }

    /**
     * Test loading a content with a valid URL.
     */
    @Test
    void testLoadModelWithValidURL() throws IOException {
        Content content = new Content("validURL.obj", getClass().getResource("/validOBJFormat.obj"));
        BranchGroup branchGroup = ModelManager.getInstance().loadModel(content);
        assertNotNull(branchGroup);
    }
}