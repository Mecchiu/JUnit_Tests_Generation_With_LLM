// ModelManager_2Test.java
package com.eteks.sweethome3d.j3d;

import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Vector3d;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModelManager}.
* It contains ten unit test cases for the {@link ModelManager#getNormalizedTransform(Node, float[][], float)} method.
*/
class ModelManager_2Test {
    
    /**
     * Test case for a null node.
     */
    @Test
    void testGetNormalizedTransformWithNullNode() {
        Transform3D transform = ModelManager.getInstance().getNormalizedTransform(null, null, 1f);
        assertNull(transform, "Transform should be null");
    }
    
    /**
     * Test case for a node with no geometry.
     */
    @Test
    void testGetNormalizedTransformWithNodeWithoutGeometry() {
        TransformGroup node = new TransformGroup();
        Transform3D transform = ModelManager.getInstance().getNormalizedTransform(node, null, 1f);
        assertNull(transform, "Transform should be null");
    }
    
    /**
     * Test case for a node with a single point geometry.
     */
    @Test
    void testGetNormalizedTransformWithNodeWithSinglePointGeometry() {
        TransformGroup node = new TransformGroup();
        node.addChild(TestUtils.createGeometryNode(new float[] {0f, 0f, 0f}, new int[] {0}, null));
        Transform3D transform = ModelManager.getInstance().getNormalizedTransform(node, null, 1f);
        assertNull(transform, "Transform should be null");
    }
    
    /**
     * Test case for a node with a single line geometry.
     */
    @Test
    void testGetNormalizedTransformWithNodeWithSingleLineGeometry() {
        TransformGroup node = new TransformGroup();
        node.addChild(TestUtils.createGeometryNode(new float[] {0f, 0f, 0f, 1f, 1f, 1f}, new int[] {0, 1}, null));
        Transform3D transform = ModelManager.getInstance().getNormalizedTransform(node, null, 1f);
        assertNull(transform, "Transform should be null");
    }
    
    /**
     * Test case for a node with a single triangle geometry.
     */
    @Test
    void testGetNormalizedTransformWithNodeWithSingleTriangleGeometry() {
        TransformGroup node = new TransformGroup();
        node.addChild(TestUtils.createGeometryNode(new float[] {0f, 0f, 0f, 1f, 0f, 0f, 0f, 1f, 0f}, new int[] {0, 1, 2}, null));
        Transform3D transform = ModelManager.getInstance().getNormalizedTransform(node, null, 1f);
        assertNotNull(transform, "Transform should not be null");
        Vector3d scale = new Vector3d();
        transform.getScale(scale);
        assertEquals(1.0, scale.x, TestUtils.DELTA, "X scale should be 1");
        assertEquals(1.0, scale.y, TestUtils.DELTA, "Y scale should be 1");
        assertEquals(1.0, scale.z, TestUtils.DELTA, "Z scale should be 1");
    }
    
    /**
     * Test case for a node with a single quad geometry.
     */
    @Test
    void testGetNormalizedTransformWithNodeWithSingleQuadGeometry() {
        TransformGroup node = new TransformGroup();
        node.addChild(TestUtils.createGeometryNode(new float[] {0f, 0f, 0f, 1f, 0f, 0f, 1f, 1f, 0f, 0f, 1f, 0f}, new int[] {0, 1, 2, 3}, null));
        Transform3D transform = ModelManager.getInstance().getNormalizedTransform(node, null, 1f);
        assertNotNull(transform, "Transform should not be null");
        Vector3d scale = new Vector3d();
        transform.getScale(scale);
        assertEquals(1.0, scale.x, TestUtils.DELTA, "X scale should be 1");
        assertEquals(1.0, scale.y, TestUtils.DELTA, "Y scale should be 1");
        assertEquals(1.0, scale.z, TestUtils.DELTA, "Z scale should be 1");
    }
    
    /**
     * Test case for a node with a single polygon geometry.
     */
    @Test
    void testGetNormalizedTransformWithNodeWithSinglePolygonGeometry() {
        TransformGroup node = new TransformGroup();
        node.addChild(TestUtils.createGeometryNode(new float[] {0f, 0f, 0f, 1f, 0f, 0f, 1f, 1f, 0f}, new int[] {0, 1, 2, -1}, null));
        Transform3D transform = ModelManager.getInstance().getNormalizedTransform(node, null, 1f);
        assertNotNull(transform, "Transform should not be null");
        Vector3d scale = new Vector3d();
        transform.getScale(scale);
        assertEquals(1.0, scale.x, TestUtils.DELTA, "X scale should be 1");
        assertEquals(1.0, scale.y, TestUtils.DELTA, "Y scale should be 1");
        assertEquals(1.0, scale.z, TestUtils.DELTA, "Z scale should be 1");
    }
    
    /**
     * Test case for a node with a single triangle strip geometry.
     */
    @Test
    void testGetNormalizedTransformWithNodeWithSingleTriangleStripGeometry() {
        TransformGroup node = new TransformGroup();
        node.addChild(TestUtils.createGeometryNode(new float[] {0f, 0f, 0f, 1f, 0f, 0f, 0f, 1f, 0f, 1f, 1f, 0f}, new int[] {0, 1, 2, 3}, new int[] {3}));
        Transform3D transform = ModelManager.getInstance().getNormalizedTransform(node, null, 1f);
        assertNotNull(transform, "Transform should not be null");
        Vector3d scale = new Vector3d();
        transform.getScale(scale);
        assertEquals(1.0, scale.x, TestUtils.DELTA, "X scale should be 1");
        assertEquals(1.0, scale.y, TestUtils.DELTA, "Y scale should be 1");
        assertEquals(1.0, scale.z, TestUtils.DELTA, "Z scale should be 1");
    }
    
    /**
     * Test case for a node with a single triangle fan geometry.
     */
    @Test
    void testGetNormalizedTransformWithNodeWithSingleTriangleFanGeometry() {
        TransformGroup node = new TransformGroup();
        node.addChild(TestUtils.createGeometryNode(new float[] {0f, 0f, 0f, 1f, 0f, 0f, 0f, 1f, 0f, 1f, 1f, 0f}, new int[] {0, 1, 2, 3}, new int[] {3}));
        Transform3D transform = ModelManager.getInstance().getNormalizedTransform(node, null, 1f);
        assertNotNull(transform, "Transform should not be null");
        Vector3d scale = new Vector3d();
        transform.getScale(scale);
        assertEquals(1.0, scale.x, TestUtils.DELTA, "X scale should be 1");
        assertEquals(1.0, scale.y, TestUtils.DELTA, "Y scale should be 1");
        assertEquals(1.0, scale.z, TestUtils.DELTA, "Z scale should be 1");
    }
    
    /**
     * Test case for a node with a single indexed triangle geometry.
     */
    @Test
    void testGetNormalizedTransformWithNodeWithSingleIndexedTriangleGeometry() {
        TransformGroup node = new TransformGroup();
        node.addChild(TestUtils.createGeometryNode(new float[] {0f, 0f, 0f, 1f, 0f, 0f, 0f, 1f, 0f}, new int[] {0, 1, 2}, null));
        Transform3D transform = ModelManager.getInstance().getNormalizedTransform(node, null, 1f);
        assertNotNull(transform, "Transform should not be null");
        Vector3d scale = new Vector3d();
        transform.getScale(scale);
        assertEquals(1.0, scale.x, TestUtils.DELTA, "X scale should be 1");
        assertEquals(1.0, scale.y, TestUtils.DELTA, "Y scale should be 1");
        assertEquals(1.0, scale.z, TestUtils.DELTA, "Z scale should be 1");
    }
    
    /**
     * Test case for a node with a single indexed quad geometry.
     */
    @Test
    void testGetNormalizedTransformWithNodeWithSingleIndexedQuadGeometry() {
        TransformGroup node = new TransformGroup();
        node.addChild(TestUtils.createGeometryNode(new float[] {0f, 0f, 0f, 1f, 0f, 0f, 1f, 1f, 0f, 0f, 1f, 0f},