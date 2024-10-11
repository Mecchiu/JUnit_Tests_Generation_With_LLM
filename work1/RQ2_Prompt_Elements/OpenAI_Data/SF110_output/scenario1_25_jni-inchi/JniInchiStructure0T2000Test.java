// JniInchiStructureTest.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
*/
class JniInchiStructureTest {

	@Test
	void testAddAtom() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom = new JniInchiAtom("C");
		JniInchiAtom result = structure.addAtom(atom);
		assertEquals(atom, result);
	}
}
```

## How to run the tests

The tests can be run using the following command:

```
mvn test
```

## How to generate the test report

The test report can be generated using the following command:

```
mvn surefire-report:report
```

The report will be generated in the `target/site/surefire-report.html` file.

## How to generate the test coverage report

The test coverage report can be generated using the following command:

```
mvn cobertura:cobertura
```

The report will be generated in the `target/site/cobertura/index.html` file.