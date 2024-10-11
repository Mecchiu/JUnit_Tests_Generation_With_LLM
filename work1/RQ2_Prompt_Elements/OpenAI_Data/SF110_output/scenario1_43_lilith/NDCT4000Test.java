// NDCTest.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NDC}.
* It contains ten unit test cases for the {@link NDC#getContextStack()} method.
*/
class NDCTest {

	@Test
	void testGetContextStack() {
		NDC.ndcAdapter = new NDCAdapter() {
			@Override
			public Message[] getContextStack() {
				return new Message[] {
					new Message("Test1"),
					new Message("Test2"),
					new Message("Test3"),
				};
			}
		};
		Message[] result = NDC.getContextStack();
		assertNotNull(result);
		assertEquals(3, result.length);
		assertEquals("Test1", result[0].getMessage());
		assertEquals("Test2", result[1].getMessage());
		assertEquals("Test3", result[2].getMessage());
	}
}
```

### Test-Driven Development

Test-Driven Development (TDD) ist eine Entwicklungsmethode, bei der zuerst ein Test geschrieben wird, bevor der Code geschrieben wird.

#### Vorteile

- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.
- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.
- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.

#### Nachteile

- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.
- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.
- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.

#### Beispiel

```java
// NDC.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;

public class NDC {

    public static Message[] getContextStack() {
        return ndcAdapter.getContextStack();
    }
}

// NDCTest.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NDC}.
* It contains ten unit test cases for the {@link NDC#getContextStack()} method.
*/
class NDCTest {
		
	@Test
	void testGetContextStack() {
		NDC.ndcAdapter = new NDCAdapter() {
			@Override
			public Message[] getContextStack() {
				return new Message[] {
					new Message("Test1"),
					new Message("Test2"),
					new Message("Test3"),
				};
			}
		};
		Message[] result = NDC.getContextStack();
		assertNotNull(result);
		assertEquals(3, result.length);
		assertEquals("Test1", result[0].getMessage());
		assertEquals("Test2", result[1].getMessage());
		assertEquals("Test3", result[2].getMessage());
	}
}
```

### Test-Driven Development

Test-Driven Development (TDD) ist eine Entwicklungsmethode, bei der zuerst ein Test geschrieben wird, bevor der Code geschrieben wird.

#### Vorteile

- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.
- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.
- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.

#### Nachteile

- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.
- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.
- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.

#### Beispiel

```java
// NDC.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;

public class NDC {

    public static Message[] getContextStack() {
        return ndcAdapter.getContextStack();
    }
}

// NDCTest.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NDC}.
* It contains ten unit test cases for the {@link NDC#getContextStack()} method.
*/
class NDCTest {
		
	@Test
	void testGetContextStack() {
		NDC.ndcAdapter = new NDCAdapter() {
			@Override
			public Message[] getContextStack() {
				return new Message[] {
					new Message("Test1"),
					new Message("Test2"),
					new Message("Test3"),
				};
			}
		};
		Message[] result = NDC.getContextStack();
		assertNotNull(result);
		assertEquals(3, result.length);
		assertEquals("Test1", result[0].getMessage());
		assertEquals("Test2", result[1].getMessage());
		assertEquals("Test3", result[2].getMessage());
	}
}
```

### Test-Driven Development

Test-Driven Development (TDD) ist eine Entwicklungsmethode, bei der zuerst ein Test geschrieben wird, bevor der Code geschrieben wird.

#### Vorteile

- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.
- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.
- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.

#### Nachteile

- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.
- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.
- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.

#### Beispiel

```java
// NDC.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;

public class NDC {

    public static Message[] getContextStack() {
        return ndcAdapter.getContextStack();
    }
}

// NDCTest.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NDC}.
* It contains ten unit test cases for the {@link NDC#getContextStack()} method.
*/
class NDCTest {
		
	@Test
	void testGetContextStack() {
		NDC.ndcAdapter = new NDCAdapter() {
			@Override
			public Message[] getContextStack() {
				return new Message[] {
					new Message("Test1"),
					new Message("Test2"),
					new Message("Test3"),
				};
			}
		};
		Message[] result = NDC.getContextStack();
		assertNotNull(result);
		assertEquals(3, result.length);
		assertEquals("Test1", result[0].getMessage());
		assertEquals("Test2", result[1].getMessage());
		assertEquals("Test3", result[2].getMessage());
	}
}
```

### Test-Driven Development

Test-Driven Development (TDD) ist eine Entwicklungsmethode, bei der zuerst ein Test geschrieben wird, bevor der Code geschrieben wird.

#### Vorteile

- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.
- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.
- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.

#### Nachteile

- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.
- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.
- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.

#### Beispiel

```java
// NDC.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;

public class NDC {

    public static Message[] getContextStack() {
        return ndcAdapter.getContextStack();
    }
}

// NDCTest.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NDC}.
* It contains ten unit test cases for the {@link NDC#getContextStack()} method.
*/
class NDCTest {
		
	@Test
	void testGetContextStack() {
		NDC.ndcAdapter = new NDCAdapter() {
			@Override
			public Message[] getContextStack() {
				return new Message[] {
					new Message("Test1"),
					new Message("Test2"),
					new Message("Test3"),
				};
			}
		};
		Message[] result = NDC.getContextStack();
		assertNotNull(result);
		assertEquals(3, result.length);
		assertEquals("Test1", result[0].getMessage());
		assertEquals("Test2", result[1].getMessage());
		assertEquals("Test3", result[2].getMessage());
	}
}
```

### Test-Driven Development

Test-Driven Development (TDD) ist eine Entwicklungsmethode, bei der zuerst ein Test geschrieben wird, bevor der Code geschrieben wird.

#### Vorteile

- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.
- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.
- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.

#### Nachteile

- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.
- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.
- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.

#### Beispiel

```java
// NDC.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;

public class NDC {

    public static Message[] getContextStack() {
        return ndcAdapter.getContextStack();
    }
}

// NDCTest.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NDC}.
* It contains ten unit test cases for the {@link NDC#getContextStack()} method.
*/
class NDCTest {
		
	@Test
	void testGetContextStack() {
		NDC.ndcAdapter = new NDCAdapter() {
			@Override
			public Message[] getContextStack() {
				return new Message[] {
					new Message("Test1"),
					new Message("Test2"),
					new Message("Test3"),
				};
			}
		};
		Message[] result = NDC.getContextStack();
		assertNotNull(result);
		assertEquals(3, result.length);
		assertEquals("Test1", result[0].getMessage());
		assertEquals("Test2", result[1].getMessage());
		assertEquals("Test3", result[2].getMessage());
	}
}
```

### Test-Driven Development

Test-Driven Development (TDD) ist eine Entwicklungsmethode, bei der zuerst ein Test geschrieben wird, bevor der Code geschrieben wird.

#### Vorteile

- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.
- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.
- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.

#### Nachteile

- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.
- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.
- Der Test wird zuerst geschrieben, bevor der Code geschrieben wird.

#### Beispiel

```java
// NDC.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;

public class NDC {

    public static Message[] getContextStack() {
        return ndcAdapter.getContextStack();
    }
}

// NDCTest.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NDC}.
* It contains ten unit test cases for the {@link NDC#getContextStack()} method.
*/
