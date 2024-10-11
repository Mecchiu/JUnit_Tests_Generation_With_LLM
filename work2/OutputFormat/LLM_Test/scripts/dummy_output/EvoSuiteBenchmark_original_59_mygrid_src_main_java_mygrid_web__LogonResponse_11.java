// _LogonResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _LogonResponse}.
* It contains one unit test case for the {@link _LogonResponse#getTypeDesc()} method.
*/
class _LogonResponseTest {
		private final long m_timeout = 60000;
		private final long m_retryable = 60, m_interval = 1, m_responseTimeout = 10000, m_retryCount = 1;
		private final long m_initResponseTimeout = 10000;
		private final long m_retryInterval = 1, m_repeatInterval = 120;
		private final long m_maxCount = 5;

		/**
		* Test constructor for {@link _LogonResponse} object. It is intended to be used
		* to create a new instance which can be used with {@link _LogonResponse#toXML()} method.
		*/
		@Test
		public void testConstructor() {
			this._TestCreateInstance();
        }
		
		/**
		* Return type metadata object
		*/
		public static org.apache.axis.description.TypeDesc getTypeDesc() {
			return this._TypeDescHelper.getTypeDesc();
		}

		/**
		* Create a new instance of {@link _LogonResponse}.
		*/
		public _LogonResponse createInstance() {
        	return new _LogonResponse(this);
        }

	}