/*
 * This file was automatically generated by EvoSuite
 */

package net.sourceforge.shp2kml;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.CoordinateSequence;
import com.vividsolutions.jts.geom.CoordinateSequenceFactory;
import com.vividsolutions.jts.geom.DefaultCoordinateSequenceFactory;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryCollection;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.LinearRing;
import com.vividsolutions.jts.geom.MultiPoint;
import com.vividsolutions.jts.geom.Polygon;
import com.vividsolutions.jts.geom.PrecisionModel;
import net.sourceforge.shp2kml.GeomConverter;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class GeomConverterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Coordinate[] coordinateArray0 = new Coordinate[2];
      DefaultCoordinateSequenceFactory defaultCoordinateSequenceFactory0 = new DefaultCoordinateSequenceFactory();
      Coordinate coordinate0 = new Coordinate();
      coordinateArray0[0] = coordinate0;
      coordinateArray0[1] = coordinateArray0[0];
      GeometryFactory geometryFactory0 = new GeometryFactory((CoordinateSequenceFactory) defaultCoordinateSequenceFactory0);
      MultiPoint multiPoint0 = geometryFactory0.createMultiPoint(coordinateArray0);
      String string0 = GeomConverter.getPlacemarkKML((Geometry) multiPoint0);
      assertNotNull(string0);
      assertEquals("<Placemark><description><![CDATA[]]></description><name></name><Point><extrude>0.0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>0.0,0.0,0 0.0,0.0,0 </coordinates></Point></Placemark>", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      GeometryFactory geometryFactory0 = new GeometryFactory();
      DefaultCoordinateSequenceFactory defaultCoordinateSequenceFactory0 = DefaultCoordinateSequenceFactory.instance();
      CoordinateSequence coordinateSequence0 = defaultCoordinateSequenceFactory0.create(28, 28);
      LinearRing linearRing0 = geometryFactory0.createLinearRing(coordinateSequence0);
      String string0 = GeomConverter.getPlacemarkKML((Geometry) linearRing0);
      assertEquals("<Placemark><description><![CDATA[]]></description><name></name><LineString><extrude>0.0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 </coordinates></LineString></Placemark>", string0);
      assertNotNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      Coordinate[] coordinateArray0 = new Coordinate[37];
      // Undeclared exception!
      try {
        GeomConverter.convertPolygon(coordinateArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Coordinate[] coordinateArray0 = new Coordinate[4];
      // Undeclared exception!
      try {
        GeomConverter.convertLine(coordinateArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Coordinate[] coordinateArray0 = new Coordinate[2];
      // Undeclared exception!
      try {
        GeomConverter.convertPoint(coordinateArray0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      GeomConverter geomConverter0 = new GeomConverter();
      assertNotNull(geomConverter0);
  }

  @Test
  public void test6()  throws Throwable  {
      Coordinate[] coordinateArray0 = new Coordinate[6];
      Coordinate coordinate0 = new Coordinate();
      coordinateArray0[0] = coordinate0;
      coordinateArray0[1] = coordinate0;
      Coordinate coordinate1 = new Coordinate(0.0, 1500.4492359918947);
      coordinateArray0[2] = coordinate1;
      coordinateArray0[4] = coordinate0;
      Coordinate coordinate2 = new Coordinate((-27.258976637842338), (-27.258976637842338), (-27.258976637842338));
      coordinateArray0[3] = coordinate2;
      String string0 = GeomConverter.convertPolygonWithAltitude(coordinateArray0, (-27.258976637842338));
      assertNotNull(string0);
      assertEquals("<Polygon><extrude>-27.258976637842338</extrude><altitudeMode>relativeToGround</altitudeMode><innerBoundaryIs><LinearRing><coordinates>0.0,0.0,0 0.0,0.0,0 0.0,1500.4492359918947,0 -27.258976637842338,-27.258976637842338,0 0.0,0.0,0 </coordinates></LinearRing></innerBoundaryIs></Polygon>", string0);
  }

  @Test
  public void test7()  throws Throwable  {
      GeometryFactory geometryFactory0 = new GeometryFactory();
      DefaultCoordinateSequenceFactory defaultCoordinateSequenceFactory0 = DefaultCoordinateSequenceFactory.instance();
      CoordinateSequence coordinateSequence0 = defaultCoordinateSequenceFactory0.create(28, 28);
      LinearRing linearRing0 = geometryFactory0.createLinearRing(coordinateSequence0);
      PrecisionModel precisionModel0 = linearRing0.getPrecisionModel();
      Polygon polygon0 = new Polygon(linearRing0, precisionModel0, 28);
      String string0 = GeomConverter.getPlacemarkKML((Geometry) polygon0, "<Placemark><description><![CDATA[]]></description><name></name><LineString><extrude>0.0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 </coordinates></LineString></Placemark>", "<Placemark><description><![CDATA[]]></description><name></name><LineString><extrude>0.0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 </coordinates></LineString></Placemark>", (double) 28);
      assertEquals("<Placemark><description><![CDATA[<Placemark><description><![CDATA[]]></description><name></name><LineString><extrude>0.0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 </coordinates></LineString></Placemark>]]></description><name><Placemark><description><![CDATA[]]></description><name></name><LineString><extrude>0.0</extrude><altitudeMode>relativeToGround</altitudeMode><coordinates>0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 </coordinates></LineString></Placemark></name><Polygon><extrude>28.0</extrude><altitudeMode>relativeToGround</altitudeMode><outerBoundaryIs><LinearRing><coordinates>0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 </coordinates></LinearRing></outerBoundaryIs><outerBoundaryIs><LinearRing><coordinates>0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 </coordinates></LinearRing></outerBoundaryIs><outerBoundaryIs><LinearRing><coordinates>0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 </coordinates></LinearRing></outerBoundaryIs><outerBoundaryIs><LinearRing><coordinates>0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 </coordinates></LinearRing></outerBoundaryIs><outerBoundaryIs><LinearRing><coordinates>0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 </coordinates></LinearRing></outerBoundaryIs><outerBoundaryIs><LinearRing><coordinates>0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 </coordinates></LinearRing></outerBoundaryIs><outerBoundaryIs><LinearRing><coordinates>0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 0.0,0.0,0 </coordinates></LinearRing></outerBoundaryIs></Polygon></Placemark>", string0);
      assertNotNull(string0);
  }

  @Test
  public void test8()  throws Throwable  {
      PrecisionModel precisionModel0 = new PrecisionModel((-896.8833034491468), (-896.8833034491468), (-896.8833034491468));
      Polygon polygon0 = new Polygon((LinearRing) null, precisionModel0, (-313));
      GeometryCollection geometryCollection0 = (GeometryCollection)polygon0.buffer((-896.8833034491468), (-313));
      String string0 = GeomConverter.getPlacemarkKML((Geometry) geometryCollection0, "Tl6", "Tl6", (double) (-313));
      assertNotNull(string0);
      assertEquals("<Placemark><description><![CDATA[Tl6]]></description><name>Tl6</name></Placemark>", string0);
  }
}
