// _AvailableJobs_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobs}.
* It contains one unit test case for the {@link _AvailableJobs#getTypeDesc()} method.
*/
class _AvailableJobs_1Test {
		/**
		 * Run the _AvailableJobs() method test.
		 *
		 * @throws Exception
		 */
		@Test
		public void testGetTypeDesc() throws Exception {
			// BEGIN: com.hp.oo.sdk.elements.Element.testGetTypeDesc
			java.lang.Class<_AvailableJobs> _TestType = _AvailableJobs.class;
			
			// BEGIN: com.hp.oo.sdk.elements.Element.testGetTypeDesc
			assertNotNull(_TestType);
			// END: com.hp.oo.sdk.elements.Element.testGetTypeDesc
			
			java.lang.Class<_AvailableJobs.Builder> _BuilderType = _TestType.getDeclaredClasses()[0];
			
			// BEGIN: com.hp.oo.sdk.elements.Element.testGetTypeDesc
			assertNotNull(_BuilderType);
			// END: com.hp.oo.sdk.elements.Element.testGetTypeDesc
			
			java.lang.Class<_AvailableJobs.Builder> _BuilderBuilderType = _BuilderType.getSuperclass();
			
			// BEGIN: com.hp.oo.sdk.elements.OOMarshaller.testGetTypeDesc
			assertNotNull(_BuilderBuilderType);
			// END: com.hp.oo.sdk.elements.OOMarshaller.testGetTypeDesc
			
			java.lang.Class<_AvailableJobs_Builder> _BuilderClass = null;
			if (_BuilderType == java.lang.String.class) {
				_BuilderClass = _BuilderBuilderType;
			} else if (_BuilderType == java.lang.Boolean.class) {
				_BuilderClass = Boolean.class;
			} else if (_BuilderType == java.lang.Integer.class) {
				_BuilderClass = java.lang.Integer.class;
			}
			
			// BEGIN: com.hp.oo.sdk.elements.Element.testGetTypeDesc
			assertNotNull(_BuilderClass);
			// END: com.hp.oo.sdk.elements.Element.testGetTypeDesc
			
			final String _TestMethodName = "testGetTypeDesc";
			// BEGIN: com.hp.oo.sdk.elements.Element.testGetTypeDesc_1TestMethod.test
			testGetTypeDesc(java.lang.Class.class, false, String.class, int.class);
			// END: com.hp.oo.sdk.elements.Element.testGetTypeDesc_1TestMethod.test
			
		}

		/**
		 * Run the void testGetTypeDesc(Class<T>, boolean)
		 *
		 * @throws Exception
		 */
		public void testGetTypeDesc_BoolBoolean() throws Exception {
			// BEGIN: com.hp.oo.sdk.elements.Element.testGetTypeDesc_BoolBoolean
			testGetTypeDesc(java.lang.Boolean.class, true, java.util.Class.class, int.class);
			// END: com.hp.oo.sdk.elements.Element.testGetTypeDesc_BoolBoolean
		}

		/**
		 * Run the void testGetTypeDesc(Class<T>, boolean)
		 *
		 * @throws Exception
		 */
		public void testGetTypeDesc_CharChar() throws Exception {
			// BEGIN: com.hp.oo.sdk.elements.Element.testGetTypeDesc_CharChar
			testGetTypeDesc(java.lang.Character.class, true, java.lang.Class.class, int.class);
			// END: com.hp.oo.sdk.elements.Element.testGetTypeDesc_CharChar
		}

		/**
		 * Run the void testGetTypeDesc(Class<T>, boolean)
		 *
		 * @throws Exception
		 */
		public void testGetTypeDesc_LongLong() throws Exception {
			// BEGIN: com.hp.oo.sdk.elements.Element.testGetTypeDesc_LongLong
			testGetTypeDesc(java.lang.Long.class, true, java.lang.Class.class, int.class);
			// END: com.hp.oo.sdk.elements.Element.testGetTypeDesc_LongLong
		}

		/**
		 * Run the void testGetTypeDesc(Class<T>, boolean)
		 *
		 * @throws Exception
		 */
		public void testGetTypeDesc_Object() throws Exception {
			// BEGIN: com.hp.oo.sdk.elements.Element.testGetTypeDesc_Object
			testGetTypeDesc(java.lang.Object.class, true, java.lang.Class.class, int.class);
			// END: com.hp.oo.sdk.elements.Element.testGetTypeDesc_Object
		}

		/**
		 * Run the void testGetTypeDesc(Class<T>, boolean)
		 *
		 * @throws Exception
		 */
		public void testGetTypeDesc_ShortShort() throws Exception {
			// BEGIN: com.hp.oo.sdk.elements.Element.testGetTypeDesc_ShortShort
			testGetTypeDesc(java.lang.Short.class, true, java.lang.Class.class, int.class);
			// END: com.hp.oo.sdk.elements.Element.testGetTypeDesc_ShortShort
		}

}