// _CompleteTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Complete}.
* It contains one unit test case for the {@link _Complete#getTypeDesc()} method.
*/
class _CompleteTest {
private _Complete testee;
		
		
			public _CompleteTest( String testName ) {
				this.testee = new _Complete( testName );
			}
			@Test
			public void testSimpleField() {
				String testName = "testSimpleField";
				testee.setValue( 123 );
				String str = testee.getValue();
				assertEquals( "123",str );
			}
			@Test
			public void testSimpleField_1() {
				String testName = "testSimpleField_1";
				testee.setValue( 123, 1 );
				String str = testee.getValue();
				assertEquals( "123",str );
			}
			@Test
			public void testSimpleField_2() {
				String testName = "testSimpleField_2";
				testee.setValue( 123, 1, 3 );
				String str = testee.getValue();
				assertEquals( "123",str );
			}
			@Test
			public void testSimpleField_3() {
				String testName = "testSimpleField_3";
				testee.setValue( 123, 1, 3, 5);
				String str = testee.getValue();
				assertEquals( "123",str );
			}
			@Test
			public void testComplexField() {
				String testName = "testComplexField";
				testee.setValue( 123, 123, 0, 0, 1, 1000 );
				long lv = testee.getValue( 1 );
				assertEquals( 123L,lv );
				lv = testee.getValue( 1, 3000 );
				assertEquals( 123L, lv );
				lv = testee.getValue( 0, 1000 );
				assertEquals( 1L, lv );
				lv = testee.getValue( 9, 9997 );
				assertEquals( 9L, lv );
				lv = testee.getValue( null );
				assertEquals( null, lv );
				
			}
			@Test
			public void testComplexField_1() {
				String testName = "testComplexField_1";
				testee.setValue( 123, 123, 0, 0, 1, 1000 );
				long lv = testee.getValue( 1, 3000 );
				assertEquals( 123L,lv );
				lv = testee.getValue( 1, 3000, 3000, 5000, 10000, 10000000 );
				assertEquals( 123L,lv );
				lv = testee.getValue( 1, 3000, 3000, 5000, 10000, 10000000, 100000000 );
				assertEquals( 123L,lv );
				lv = testee.getValue( 1, 3000, 3000, 5000, 10000, 0, 10000 );
				assertEquals( 123L,lv );
				lv = testee.getValue( 1, 3000, 3000, 5000, 10000 );
				assertEquals( 8L,lv );
				lv = testee.getValue( 9, 9997, 9997, 10000000 );
				assertEquals( 9L,lv );
				lv = testee.getValue( 9, 9997, 9997, 10000000, 100000000 );
				assertEquals( 9L,lv );
				lv = testee.getValue( null, 99L );
				assertEquals( 99L,lv );
			}
			@Test
			public void testComplexField_2() {
				String testName = "testComplexField_2";
				testee.setValue( 123, 123, 0, 0, 1, 0, 0, 0 );
				long lv = testee.getValue( 0 );
				assertEquals( 0L,lv );
				lv = testee.getValue( 1 );
				assertEquals( 1L,lv );
				lv = testee.getValue( 1, 3000 );
				assertEquals( 1L,lv );
				lv = testee.getValue( 1000, 1200, 0 );
				assertEquals( 4L,lv );
				lv = testee.getValue( 1200, 1250, 0 );
				assertEquals( 15L,lv );
				lv = testee.getValue( null, 0 );
				assertEquals( 20L, lv );
				lv = testee.getValue( null, 10000000 );
				assertEquals( 1000000L, lv );
				lv = testee.getValue( null, 100000000 );
				assertEquals( 100000000L, lv );
				lv = testee.getValue( null, 10000000 );
				assertEquals( 4000000L, lv );
				lv = testee.getValue( null, 0 );
				assertEquals( 2000000L, lv );
			}
		public String getName() {
			return testee.getName();
		}
		public int getValue() {
			return testee.getValue();
		}
		public void setValue(int value) {
			testee.setValue(value);
		}
		
}
