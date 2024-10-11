// ModelManager_2Test.java
package com.eteks.sweethome3d.j3d;

import javax.media.j3d.*;
import javax.vecmath.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ModelManager}.
 * It contains ten unit test cases for the {@link ModelManager#getNormalizedTransform(Node, float[][], float)} method.
 */
class ModelManager_2Test {
    
    /**
     * Test case for a model with a single point.
     */
    @Test
    void testSinglePoint() {
        Point3f[] vertices = {new Point3f(0, 0, 0)};
        GeometryArray geometry = new PointArray(vertices.length, GeometryArray.COORDINATES);
        geometry.setCoordinates(0, vertices);
        Shape3D shape = new Shape3D(geometry);
        Transform3D transform = new ModelManager().getNormalizedTransform(shape, null, 1);
        Point3d point = new Point3d();
        transform.transform(new Point3d(0, 0, 0), point);
        assertEquals(0, point.x, 0.001);
        assertEquals(0, point.y, 0.001);
        assertEquals(0, point.z, 0.001);
    }
    
    /**
     * Test case for a model with a single line.
     */
    @Test
    void testSingleLine() {
        Point3f[] vertices = {new Point3f(0, 0, 0), new Point3f(1, 0, 0)};
        GeometryArray geometry = new LineArray(vertices.length, GeometryArray.COORDINATES);
        geometry.setCoordinates(0, vertices);
        Shape3D shape = new Shape3D(geometry);
        Transform3D transform = new ModelManager().getNormalizedTransform(shape, null, 1);
        Point3d point = new Point3d();
        transform.transform(new Point3d(0, 0, 0), point);
        assertEquals(-0.5, point.x, 0.001);
        assertEquals(0, point.y, 0.001);
        assertEquals(0, point.z, 0.001);
        transform.transform(new Point3d(1, 0, 0), point);
        assertEquals(0.5, point.x, 0.001);
        assertEquals(0, point.y, 0.001);
        assertEquals(0, point.z, 0.001);
    }
    
    /**
     * Test case for a model with a single triangle.
     */
    @Test
    void testSingleTriangle() {
        Point3f[] vertices = {new Point3f(0, 0, 0), new Point3f(1, 0, 0), new Point3f(0, 1, 0)};
        int[] indices = {0, 1, 2};
        GeometryArray geometry = new TriangleArray(vertices.length, GeometryArray.COORDINATES, new int[] {3});
        geometry.setCoordinates(0, vertices);
        geometry.setCoordinateIndices(0, indices);
        Shape3D shape = new Shape3D(geometry);
        Transform3D transform = new ModelManager().getNormalizedTransform(shape, null, 1);
        Point3d point = new Point3d();
        transform.transform(new Point3d(0, 0, 0), point);
        assertEquals(-0.5, point.x, 0.001);
        assertEquals(-0.5, point.y, 0.001);
        assertEquals(0, point.z, 0.001);
        transform.transform(new Point3d(1, 0, 0), point);
        assertEquals(0.5, point.x, 0.001);
        assertEquals(-0.5, point.y, 0.001);
        assertEquals(0, point.z, 0.001);
        transform.transform(new Point3d(0, 1, 0), point);
        assertEquals(-0.5, point.x, 0.001);
        assertEquals(0.5, point.y, 0.001);
        assertEquals(0, point.z, 0.001);
    }
    
    /**
     * Test case for a model with a single quad.
     */
    @Test
    void testSingleQuad() {
        Point3f[] vertices = {new Point3f(0, 0, 0), new Point3f(1, 0, 0), new Point3f(1, 1, 0), new Point3f(0, 1, 0)};
        int[] indices = {0, 1, 2, 3};
        GeometryArray geometry = new QuadArray(vertices.length, GeometryArray.COORDINATES, new int[] {4});
        geometry.setCoordinates(0, vertices);
        geometry.setCoordinateIndices(0, indices);
        Shape3D shape = new Shape3D(geometry);
        Transform3D transform = new ModelManager().getNormalizedTransform(shape, null, 1);
        Point3d point = new Point3d();
        transform.transform(new Point3d(0, 0, 0), point);
        assertEquals(-0.5, point.x, 0.001);
        assertEquals(-0.5, point.y, 0.001);
        assertEquals(0, point.z, 0.001);
        transform.transform(new Point3d(1, 0, 0), point);
        assertEquals(0.5, point.x, 0.001);
        assertEquals(-0.5, point.y, 0.001);
        assertEquals(0, point.z, 0.001);
        transform.transform(new Point3d(1, 1, 0), point);
        assertEquals(0.5, point.x, 0.001);
        assertEquals(0.5, point.y, 0.001);
        assertEquals(0, point.z, 0.001);
        transform.transform(new Point3d(0, 1, 0), point);
        assertEquals(-0.5, point.x, 0.001);
        assertEquals(0.5, point.y, 0.001);
        assertEquals(0, point.z, 0.001);
    }
    
    /**
     * Test case for a model with a single polygon.
     */
    @Test
    void testSinglePolygon() {
        Point3f[] vertices = {new Point3f(0, 0, 0), new Point3f(1, 0, 0), new Point3f(1, 1, 0), new Point3f(0.5f, 1.5f, 0), new Point3f(0, 1, 0)};
        int[] indices = {0, 1, 2, 3, 4};
        GeometryArray geometry = new PolygonArray(vertices.length, GeometryArray.COORDINATES, new int[] {5});
        geometry.setCoordinates(0, vertices);
        geometry.setCoordinateIndices(0, indices);
        Shape3D shape = new Shape3D(geometry);
        Transform3D transform = new ModelManager().getNormalizedTransform(shape, null, 1);
        Point3d point = new Point3d();
        transform.transform(new Point3d(0, 0, 0), point);
        assertEquals(-0.5, point.x, 0.001);
        assertEquals(-0.25, point.y, 0.001);
        assertEquals(0, point.z, 0.001);
        transform.transform(new Point3d(1, 0, 0), point);
        assertEquals(0.5, point.x, 0.001);
        assertEquals(-0.25, point.y, 0.001);
        assertEquals(0, point.z, 0.001);
        transform.transform(new Point3d(1, 1, 0), point);
        assertEquals(0.5, point.x, 0.001);
        assertEquals(0.25, point.y, 0.001);
        assertEquals(0, point.z, 0.001);
        transform.transform(new Point3d(0.5, 1.5, 0), point);
        assertEquals(0, point.x, 0.001);
        assertEquals(0.5, point.y, 0.001);
        assertEquals(0, point.z, 0.001);
        transform.transform(new Point3d(0, 1, 0), point);
        assertEquals(-0.5, point.x, 0.001);
        assertEquals(0.25, point.y, 0.001);
        assertEquals(0, point.z, 0.001);
    }
    
    /**
     * Test case for a model with a single triangle strip.
     */
    @Test
    void testSingleTriangleStrip() {
        Point3f[] vertices = {new Point3f(0, 0, 0), new Point3f(1, 0, 0), new Point3f(0, 1, 0), new Point3f(1, 1, 0)};
        int[] indices = {0, 1, 2, 3};
        GeometryArray geometry = new TriangleStripArray(vertices.length, GeometryArray.COORDINATES, new int[] {4});
        geometry.setCoordinates(0, vertices);
        geometry.setCoordinateIndices(0, indices);
        Shape3D shape = new Shape