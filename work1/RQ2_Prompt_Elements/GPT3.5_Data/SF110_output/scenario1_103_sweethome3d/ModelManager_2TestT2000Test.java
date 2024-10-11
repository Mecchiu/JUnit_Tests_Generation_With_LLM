// ModelManager_2Test.java
package com.eteks.sweethome3d.j3d;

import javax.media.j3d.BoundingBox;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ModelManager}.
 * It contains ten unit test cases for the {@link ModelManager#getNormalizedTransform(Node, float[][], float)} method.
 */
class ModelManager_2Test {
    
    /**
     * Test case for a node with a bounding box of size 1 in all dimensions and no rotation.
     */
    @Test
    void testGetNormalizedTransform_noRotation() {
        TransformGroup node = new TransformGroup();
        node.setBoundingBox(new BoundingBox(new Point3d(0, 0, 0), new Point3d(1, 1, 1)));
        Transform3D transform = new ModelManager().getNormalizedTransform(node, null, 1);
        Vector3d scale = new Vector3d();
        transform.getScale(scale);
        assertEquals(1, scale.x, 0.001);
        assertEquals(1, scale.y, 0.001);
        assertEquals(1, scale.z, 0.001);
    }
    
    /**
     * Test case for a node with a bounding box of size 2 in all dimensions and no rotation.
     */
    @Test
    void testGetNormalizedTransform_noRotation_largeSize() {
        TransformGroup node = new TransformGroup();
        node.setBoundingBox(new BoundingBox(new Point3d(0, 0, 0), new Point3d(2, 2, 2)));
        Transform3D transform = new ModelManager().getNormalizedTransform(node, null, 1);
        Vector3d scale = new Vector3d();
        transform.getScale(scale);
        assertEquals(0.5, scale.x, 0.001);
        assertEquals(0.5, scale.y, 0.001);
        assertEquals(0.5, scale.z, 0.001);
    }
    
    /**
     * Test case for a node with a bounding box of size 1 in all dimensions and a 90 degree rotation around the Y axis.
     */
    @Test
    void testGetNormalizedTransform_rotationY() {
        TransformGroup node = new TransformGroup();
        node.setBoundingBox(new BoundingBox(new Point3d(0, 0, 0), new Point3d(1, 1, 1)));
        Transform3D rotation = new Transform3D();
        rotation.rotY(Math.PI / 2);
        node.setTransform(rotation);
        Transform3D transform = new ModelManager().getNormalizedTransform(node, null, 1);
        Vector3d scale = new Vector3d();
        transform.getScale(scale);
        assertEquals(1, scale.x, 0.001);
        assertEquals(1, scale.y, 0.001);
        assertEquals(1, scale.z, 0.001);
    }
    
    /**
     * Test case for a node with a bounding box of size 1 in all dimensions and a 90 degree rotation around the X axis.
     */
    @Test
    void testGetNormalizedTransform_rotationX() {
        TransformGroup node = new TransformGroup();
        node.setBoundingBox(new BoundingBox(new Point3d(0, 0, 0), new Point3d(1, 1, 1)));
        Transform3D rotation = new Transform3D();
        rotation.rotX(Math.PI / 2);
        node.setTransform(rotation);
        Transform3D transform = new ModelManager().getNormalizedTransform(node, null, 1);
        Vector3d scale = new Vector3d();
        transform.getScale(scale);
        assertEquals(1, scale.x, 0.001);
        assertEquals(1, scale.y, 0.001);
        assertEquals(1, scale.z, 0.001);
    }
    
    /**
     * Test case for a node with a bounding box of size 1 in all dimensions and a 90 degree rotation around the Z axis.
     */
    @Test
    void testGetNormalizedTransform_rotationZ() {
        TransformGroup node = new TransformGroup();
        node.setBoundingBox(new BoundingBox(new Point3d(0, 0, 0), new Point3d(1, 1, 1)));
        Transform3D rotation = new Transform3D();
        rotation.rotZ(Math.PI / 2);
        node.setTransform(rotation);
        Transform3D transform = new ModelManager().getNormalizedTransform(node, null, 1);
        Vector3d scale = new Vector3d();
        transform.getScale(scale);
        assertEquals(1, scale.x, 0.001);
        assertEquals(1, scale.y, 0.001);
        assertEquals(1, scale.z, 0.001);
    }
    
    /**
     * Test case for a node with a bounding box of size 1 in all dimensions and a 45 degree rotation around the Y axis.
     */
    @Test
    void testGetNormalizedTransform_rotationY_45() {
        TransformGroup node = new TransformGroup();
        node.setBoundingBox(new BoundingBox(new Point3d(0, 0, 0), new Point3d(1, 1, 1)));
        Transform3D rotation = new Transform3D();
        rotation.rotY(Math.PI / 4);
        node.setTransform(rotation);
        Transform3D transform = new ModelManager().getNormalizedTransform(node, null, 1);
        Vector3d scale = new Vector3d();
        transform.getScale(scale);
        assertEquals(Math.sqrt(2), scale.x, 0.001);
        assertEquals(1, scale.y, 0.001);
        assertEquals(Math.sqrt(2), scale.z, 0.001);
    }
    
    /**
     * Test case for a node with a bounding box of size 1 in all dimensions and a 45 degree rotation around the X axis.
     */
    @Test
    void testGetNormalizedTransform_rotationX_45() {
        TransformGroup node = new TransformGroup();
        node.setBoundingBox(new BoundingBox(new Point3d(0, 0, 0), new Point3d(1, 1, 1)));
        Transform3D rotation = new Transform3D();
        rotation.rotX(Math.PI / 4);
        node.setTransform(rotation);
        Transform3D transform = new ModelManager().getNormalizedTransform(node, null, 1);
        Vector3d scale = new Vector3d();
        transform.getScale(scale);
        assertEquals(1, scale.x, 0.001);
        assertEquals(Math.sqrt(2), scale.y, 0.001);
        assertEquals(Math.sqrt(2), scale.z, 0.001);
    }
    
    /**
     * Test case for a node with a bounding box of size 1 in all dimensions and a 45 degree rotation around the Z axis.
     */
    @Test
    void testGetNormalizedTransform_rotationZ_45() {
        TransformGroup node = new TransformGroup();
        node.setBoundingBox(new BoundingBox(new Point3d(0, 0, 0), new Point3d(1, 1, 1)));
        Transform3D rotation = new Transform3D();
        rotation.rotZ(Math.PI / 4);
        node.setTransform(rotation);
        Transform3D transform = new ModelManager().getNormalizedTransform(node, null, 1);
        Vector3d scale = new Vector3d();
        transform.getScale(scale);
        assertEquals(Math.sqrt(2), scale.x, 0.001);
        assertEquals(Math.sqrt(2), scale.y, 0.001);
        assertEquals(1, scale.z, 0.001);
    }
    
    /**
     * Test case for a node with a bounding box of size 1 in all dimensions and a 90 degree rotation around the Y axis and a 45 degree rotation around the X axis.
     */
    @Test
    void testGetNormalizedTransform_rotationYX() {
        TransformGroup node = new TransformGroup();
        node.setBoundingBox(new BoundingBox(new Point3d(0, 0, 0), new Point3d(1, 1, 1)));
        Transform3D rotation = new Transform3D();
        rotation.rotY(Math.PI / 2);
        Transform3D rotation2 = new Transform3D();
        rotation2.rotX(Math.PI / 4);
        rotation.mul(rotation2);
        node.setTransform(rotation);
        Transform3D transform = new ModelManager().getNormalizedTransform(node, null, 1);
        Vector3d scale = new Vector3d();
        transform.getScale(scale);
        assertEquals(Math.sqrt(2), scale.x, 0.001);
        assertEquals(1, scale.y, 0.001);
        assertEquals(Math.sqrt(2), scale.z, 0.001);
    }
    
    /**
     * Test case for a node with a bounding box of size 1 in all dimensions and a 90 degree rotation around the Y axis and a 45 degree rotation around the X axis and a 30 degree rotation around the Z axis.
     */
    @Test
    void testGetNormalizedTransform_rotationYXZ() {
        TransformGroup node = new TransformGroup();
        node.setBoundingBox(new BoundingBox(new Point3d(0, 0, 0), new Point3d(1, 1, 1)));
        Transform3D rotation = new