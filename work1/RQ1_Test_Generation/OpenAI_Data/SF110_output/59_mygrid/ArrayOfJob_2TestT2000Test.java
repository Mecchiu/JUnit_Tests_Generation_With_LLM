// ArrayOfJob_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfJob}.
* It contains ten unit test cases for the {@link ArrayOfJob#getTypeDesc()} method.
*/
class ArrayOfJob_2Test {

	/**
	* Test case for the {@link ArrayOfJob#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		ArrayOfJob arrayOfJob = new ArrayOfJob();
		assertNotNull(arrayOfJob.getTypeDesc());
	}
}

// ArrayOfJob_3Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfJob}.
* It contains ten unit test cases for the {@link ArrayOfJob#getSerializer(String, Class, QName)} method.
*/
class ArrayOfJob_3Test {
		
	/**
	* Test case for the {@link ArrayOfJob#getSerializer(String, Class, QName)} method.
	*/
	@Test
	void testGetSerializer() {
		ArrayOfJob arrayOfJob = new ArrayOfJob();
		assertNotNull(arrayOfJob.getSerializer("", null, null));
	}
}

// ArrayOfJob_4Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfJob}.
* It contains ten unit test cases for the {@link ArrayOfJob#getDeserializer(String, Class, QName)} method.
*/
class ArrayOfJob_4Test {
		
	/**
	* Test case for the {@link ArrayOfJob#getDeserializer(String, Class, QName)} method.
	*/
	@Test
	void testGetDeserializer() {
		ArrayOfJob arrayOfJob = new ArrayOfJob();
		assertNotNull(arrayOfJob.getDeserializer("", null, null));
	}
}

// ArrayOfJob_5Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfJob}.
* It contains ten unit test cases for the {@link ArrayOfJob#equals(Object)} method.
*/
class ArrayOfJob_5Test {
		
	/**
	* Test case for the {@link ArrayOfJob#equals(Object)} method.
	*/
	@Test
	void testEquals() {
		ArrayOfJob arrayOfJob = new ArrayOfJob();
		assertTrue(arrayOfJob.equals(arrayOfJob));
	}
}

// ArrayOfJob_6Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfJob}.
* It contains ten unit test cases for the {@link ArrayOfJob#hashCode()} method.
*/
class ArrayOfJob_6Test {
		
	/**
	* Test case for the {@link ArrayOfJob#hashCode()} method.
	*/
	@Test
	void testHashCode() {
		ArrayOfJob arrayOfJob = new ArrayOfJob();
		assertNotNull(arrayOfJob.hashCode());
	}
}

// ArrayOfJob_7Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfJob}.
* It contains ten unit test cases for the {@link ArrayOfJob#getJob()} method.
*/
class ArrayOfJob_7Test {
		
	/**
	* Test case for the {@link ArrayOfJob#getJob()} method.
	*/
	@Test
	void testGetJob() {
		ArrayOfJob arrayOfJob = new ArrayOfJob();
		assertNotNull(arrayOfJob.getJob());
	}
}

// ArrayOfJob_8Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfJob}.
* It contains ten unit test cases for the {@link ArrayOfJob#setJob(Job[])} method.
*/
class ArrayOfJob_8Test {
		
	/**
	* Test case for the {@link ArrayOfJob#setJob(Job[])} method.
	*/
	@Test
	void testSetJob() {
		ArrayOfJob arrayOfJob = new ArrayOfJob();
		arrayOfJob.setJob(new Job[0]);
	}
}

// ArrayOfJob_9Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfJob}.
* It contains ten unit test cases for the {@link ArrayOfJob#getJob(int)} method.
*/
class ArrayOfJob_9Test {
		
	/**
	* Test case for the {@link ArrayOfJob#getJob(int)} method.
	*/
	@Test
	void testGetJob() {
		ArrayOfJob arrayOfJob = new ArrayOfJob();
		assertNotNull(arrayOfJob.getJob(0));
	}
}

// ArrayOfJob_10Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfJob}.
* It contains ten unit test cases for the {@link ArrayOfJob#setJob(int, Job)} method.
*/
class ArrayOfJob_10Test {
		
	/**
	* Test case for the {@link ArrayOfJob#setJob(int, Job)} method.
	*/
	@Test
	void testSetJob() {
		ArrayOfJob arrayOfJob = new ArrayOfJob();
		arrayOfJob.setJob(0, new Job());
	}
}

// ArrayOfJob_11Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfJob}.
* It contains ten unit test cases for the {@link ArrayOfJob#ArrayOfJob()} method.
*/
class ArrayOfJob_11Test {
		
	/**
	* Test case for the {@link ArrayOfJob#ArrayOfJob()} method.
	*/
	@Test
	void testArrayOfJob() {
		ArrayOfJob arrayOfJob = new ArrayOfJob();
		assertNotNull(arrayOfJob);
	}
}

// ArrayOfJob_12Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfJob}.
* It contains ten unit test cases for the {@link ArrayOfJob#ArrayOfJob(Job[])} method.
*/
class ArrayOfJob_12Test {
		
	/**
	* Test case for the {@link ArrayOfJob#ArrayOfJob(Job[])} method.
	*/
	@Test
	void testArrayOfJob() {
		ArrayOfJob arrayOfJob = new ArrayOfJob(new Job[0]);
		assertNotNull(arrayOfJob);
	}
}

// ArrayOfJob_13Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfJob}.
* It contains ten unit test cases for the {@link ArrayOfJob#ArrayOfJob(Job[])} method.
*/