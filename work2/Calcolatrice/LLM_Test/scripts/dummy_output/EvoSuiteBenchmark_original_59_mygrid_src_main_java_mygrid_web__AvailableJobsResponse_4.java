// _AvailableJobsResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobsResponse}.
* It contains one unit test case for the {@link _AvailableJobsResponse#getTypeDesc()} method.
*/
class _AvailableJobsResponseTest {
		ArrayOfJob _typeDesc;

		// _AvailableJobsResponseTest.java
		// class _TypeDesc implements java.io.Serializable {
			// field _value: mygrid.mygrid.ArrayOfJob
			// }
		/**
		 * @return _value
		 */
		public _ArrayOfJob getValue() { return _typeDesc; }

		/**
		 * @param _value
		 */
		public void setValue( _ArrayOfJob _value) {
			this._typeDesc = _value;
		}

		static {
			// - - - - - - - -
			//
			// _Serializers.resolved(_typeDesc);
			// - - - - - - - -
		}
}