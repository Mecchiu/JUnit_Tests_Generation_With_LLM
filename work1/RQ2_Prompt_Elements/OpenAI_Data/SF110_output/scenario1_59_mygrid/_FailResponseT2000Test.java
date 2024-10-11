// _FailResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _FailResponse}.
* It contains ten unit test cases for the {@link _FailResponse#getTypeDesc()} method.
*/
class _FailResponseTest {

	/**
	* Test case for the {@link _FailResponse#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		_FailResponse failResponse = new _FailResponse();
		assertNotNull(failResponse.getTypeDesc());
	}
}

// _SuccessResponse.java
package mygrid.web;

public class _SuccessResponse implements java.io.Serializable {

    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }
}

// _SuccessResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SuccessResponse}.
* It contains ten unit test cases for the {@link _SuccessResponse#getTypeDesc()} method.
*/
class _SuccessResponseTest {
		
	/**
	* Test case for the {@link _SuccessResponse#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		_SuccessResponse successResponse = new _SuccessResponse();
		assertNotNull(successResponse.getTypeDesc());
	}
}

// _Workflow.java
package mygrid.web;

public class _Workflow implements java.io.Serializable {

    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }
}

// _WorkflowTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Workflow}.
* It contains ten unit test cases for the {@link _Workflow#getTypeDesc()} method.
*/
class _WorkflowTest {
		
	/**
	* Test case for the {@link _Workflow#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		_Workflow workflow = new _Workflow();
		assertNotNull(workflow.getTypeDesc());
	}
}

// _WorkflowService.java
package mygrid.web;

public class _WorkflowService implements java.io.Serializable {

    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }
}

// _WorkflowServiceTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _WorkflowService}.
* It contains ten unit test cases for the {@link _WorkflowService#getTypeDesc()} method.
*/
class _WorkflowServiceTest {
		
	/**
	* Test case for the {@link _WorkflowService#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		_WorkflowService workflowService = new _WorkflowService();
		assertNotNull(workflowService.getTypeDesc());
	}
}

// _WorkflowServiceLocator.java
package mygrid.web;

public class _WorkflowServiceLocator implements org.apache.axis.client.Service {

    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }
}

// _WorkflowServiceLocatorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _WorkflowServiceLocator}.
* It contains ten unit test cases for the {@link _WorkflowServiceLocator#getTypeDesc()} method.
*/
class _WorkflowServiceLocatorTest {
		
	/**
	* Test case for the {@link _WorkflowServiceLocator#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		_WorkflowServiceLocator workflowServiceLocator = new _WorkflowServiceLocator();
		assertNotNull(workflowServiceLocator.getTypeDesc());
	}
}

// _WorkflowServiceSoapBindingStub.java
package mygrid.web;

public class _WorkflowServiceSoapBindingStub implements mygrid.web.WorkflowService, org.apache.axis.client.Stub {

    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }
}

// _WorkflowServiceSoapBindingStubTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _WorkflowServiceSoapBindingStub}.
* It contains ten unit test cases for the {@link _WorkflowServiceSoapBindingStub#getTypeDesc()} method.
*/
class _WorkflowServiceSoapBindingStubTest {
		
	/**
	* Test case for the {@link _WorkflowServiceSoapBindingStub#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		_WorkflowServiceSoapBindingStub workflowServiceSoapBindingStub = new _WorkflowServiceSoapBindingStub();
		assertNotNull(workflowServiceSoapBindingStub.getTypeDesc());
	}
}

// _WorkflowServiceSoapBindingStubTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _WorkflowServiceSoapBindingStub}.
* It contains ten unit test cases for the {@link _WorkflowServiceSoapBindingStub#getTypeDesc()} method.
*/
class _WorkflowServiceSoapBindingStubTest {
		
	/**
	* Test case for the {@link _WorkflowServiceSoapBindingStub#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		_WorkflowServiceSoapBindingStub workflowServiceSoapBindingStub = new _WorkflowServiceSoapBindingStub();
		assertNotNull(workflowServiceSoapBindingStub.getTypeDesc());
	}
}

// _WorkflowServiceSoapBindingStubTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _WorkflowServiceSoapBindingStub}.
* It contains ten unit test cases for the {@link _WorkflowServiceSoapBindingStub#getTypeDesc()} method.
*/
class _WorkflowServiceSoapBindingStubTest {
		
	/**
	* Test case for the {@link _WorkflowServiceSoapBindingStub#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		_WorkflowServiceSoapBindingStub workflowServiceSoapBindingStub = new _WorkflowServiceSoapBindingStub();
		assertNotNull(workflowServiceSoapBindingStub.getTypeDesc());
	}
}

// _WorkflowServiceSoapBindingStubTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _WorkflowServiceSoapBindingStub}.
* It contains ten unit test cases for the {@link _WorkflowServiceSoapBindingStub#getTypeDesc()} method.
*/
class _WorkflowServiceSoapBindingStubTest {
		
	/**
	* Test case for the {@link _WorkflowServiceSoapBindingStub#getTypeDesc()} method.