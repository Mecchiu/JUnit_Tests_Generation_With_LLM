// _AvailableJobsResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobsResponse}.
* It contains one unit test case for the {@link _AvailableJobsResponse#getTypeDesc()} method.
*/
class _AvailableJobsResponseTest {
		
	int count;

	String name;

	String description;

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			_AvailableJobsResponse.class);

	static org.apache.axis.description.ElementDesc elemField;

	/**
	 * Create a new instance of the _AvailableJobsResponseTest class.
	 */
	_AvailableJobsResponseTest() {
	}

	/**
	 * Get a bean from a host object.
	 * It is just a bean that implements most methods of java.lang.Object.
	 * Therefore, it can be used as a bean in its own set of generic method calls.
	 * The exception in this case is "parameter count" which is only of type 1
	 * and it can be used on any subclass of java.lang.Object.
	 * @param hostBean is the host object
	 * @return the bean
	 */
	public static _AvailableJobsResponseBean getBean(javax.ws.rs.core.Application hostBean) {
		try {
			java.lang.Object bean = hostBean.getClass().getDeclaredMethod("getBean").invoke(hostBean);
			if (bean instanceof java.lang.Object) {
				return (AbstractTestBean)(java.lang.Object)bean;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return new _AvailableJobsResponseBean();
	}

	/**
	 * This method tests the functionality of _AvailableJobsResponse.getTypeDesc().
	 */
	@Test
	void getTypeDesc() {

		_AvailableJobsResponse testObject = new _AvailableJobsResponse();

		assertSame("Incorrect object type", _AvailableJobsResponse.class, testObject.getClass());
	}

	/**
	 * This method tests the functionality of _AvailableJobsResult.getTypeDesc().
	 */
	@Test
	void getTypeDescString() {

		_AvailableJobsResponse testObject = new _AvailableJobsResponse();

		assertSame("Incorrect object type", _AvailableJobsResponse.StringType, testObject.getTypeDesc());
	}

	/**
	 * This method tests the functionality of _AvailableJobsResult.getTypeDesc().
	 */
	@Test
	void getTypeDescName() {

		_AvailableJobsResponse testObject = new _AvailableJobsResponse();

		assertSame("Incorrect object type", java.lang.StringType, testObject.getTypeDesc("name"));
	}

	/**
	 * This method tests the functionality of _AvailableJobsResult.getTypeDesc("title").
	 */
	@Test
	public void getTypeDescTitle() {

		_AvailableJobsResponse testObject = new _AvailableJobsResponse();

		testObject.setCount(5);

		assertSame("Incorrect object type", java.lang.StringType, testObject.getTypeDesc("title"));
	}

	/**
	 * This method tests the functionality of _AvailableJobsResult.getTypeDesc("description").
	 */
	@Test
	public void getTypeDescDescription() {

		_AvailableJobsResponse testObject = new _AvailableJobsResponse();

		testObject.setAvailableJobsResult(testObject);

		assertSame("Incorrect object type", java.lang.StringType, testObject.getTypeDesc("description"));
	}





}