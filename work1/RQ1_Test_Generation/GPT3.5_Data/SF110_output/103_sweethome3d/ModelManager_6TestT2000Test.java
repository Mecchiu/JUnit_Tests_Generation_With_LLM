```java
package com.eteks.sweethome3d.j3d;

import javax.media.j3d.Node;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Vector3f;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ModelManager_6Test {

    @Test
    public void testGetNormalizedTransform() {
        // Create a dummy Node for testing
        Node node = new TransformGroup();

        // Define model rotation
        float[][] modelRotation = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};

        // Define width of the box
        float width = 1.0f;

        // Get the normalized transform
        ModelManager modelManager = ModelManager.getInstance();
        Transform3D transform = modelManager.getNormalizedTransform(node, modelRotation, width);

        // Check if the transform is not null
        assertNotNull(transform);

        // Check if the transform is an instance of Transform3D
        assertTrue(transform instanceof Transform3D);

        // Check if the translation part of the transform is correct
        Vector3f translation = new Vector3f();
        transform.get(translation);
        assertEquals(-0.5f, translation.x, 0.001);
        assertEquals(-0.5f, translation.y, 0.001);
        assertEquals(-0.5f, translation.z, 0.001);

        // Check if the scale part of the transform is correct
        Vector3f scale = new Vector3f();
        transform.getScale(scale);
        assertEquals(1.0f, scale.x, 0.001);
        assertEquals(1.0f, scale.y, 0.001);
        assertEquals(1.0f, scale.z, 0.001);
    }
}
```
