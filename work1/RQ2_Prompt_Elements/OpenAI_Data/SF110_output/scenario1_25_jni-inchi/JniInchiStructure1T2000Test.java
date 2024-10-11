// JniInchiStructureTest.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#addBond(JniInchiBond)} method.
*/
class JniInchiStructureTest {

	@Test
	void testAddBond() {
		JniInchiStructure structure = new JniInchiStructure();
		JniInchiAtom atom1 = new JniInchiAtom("C");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiBond bond = new JniInchiBond(atom1, atom2, JniInchiBond.BondType.SINGLE);
		JniInchiBond result = structure.addBond(bond);
		assertEquals(bond, result);
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