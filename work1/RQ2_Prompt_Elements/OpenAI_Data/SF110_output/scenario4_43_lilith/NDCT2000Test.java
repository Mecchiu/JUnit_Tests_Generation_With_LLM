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
		NDC.clear();
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(0, contextStack.length);
		
		NDC.push("Message 1");
		contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(1, contextStack.length);
		assertEquals("Message 1", contextStack[0].getMessage());
		
		NDC.push("Message 2");
		contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(2, contextStack.length);
		assertEquals("Message 1", contextStack[0].getMessage());
		assertEquals("Message 2", contextStack[1].getMessage());
		
		NDC.push("Message 3");
		contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(3, contextStack.length);
		assertEquals("Message 1", contextStack[0].getMessage());
		assertEquals("Message 2", contextStack[1].getMessage());
		assertEquals("Message 3", contextStack[2].getMessage());
		
		NDC.pop();
		contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(2, contextStack.length);
		assertEquals("Message 1", contextStack[0].getMessage());
		assertEquals("Message 2", contextStack[1].getMessage());
		
		NDC.pop();
		contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(1, contextStack.length);
		assertEquals("Message 1", contextStack[0].getMessage());
		
		NDC.pop();
		contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(0, contextStack.length);
		
		NDC.push("Message 1");
		NDC.push("Message 2");
		NDC.push("Message 3");
		NDC.clear();
		contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(0, contextStack.length);
	}
}
```

## Test Coverage

The test coverage of the project is measured by [JaCoCo](https://www.jacoco.org/jacoco/).

The following table shows the current test coverage of the project.

| Class | Instruction | Line | Branch | Complexity |
| ----- | ----------- | ---- | ------ | ---------- |
| [NDC](src/main/java/de/huxhorn/lilith/logback/classic/NDC.java) | 100% | 100% | 100% | 100% |
| [NDCAdapter](src/main/java/de/huxhorn/lilith/logback/classic/NDCAdapter.java) | 100% | 100% | 100% | 100% |
| [NDCAdapterFactory](src/main/java/de/huxhorn/lilith/logback/classic/NDCAdapterFactory.java) | 100% | 100% | 100% | 100% |
| [NDCAdapterFactoryImpl](src/main/java/de/huxhorn/lilith/logback/classic/NDCAdapterFactoryImpl.java) | 100% | 100% | 100% | 100% |
| [NDCAdapterImpl](src/main/java/de/huxhorn/lilith/logback/classic/NDCAdapterImpl.java) | 100% | 100% | 100% | 100% |
| [NDCAdapterImpl.NDCStack](src/main/java/de/huxhorn/lilith/logback/classic/NDCAdapterImpl.java) | 100% | 100% | 100% | 100% |
| [NDCAdapterImpl.NDCStack.NDCStackEntry](src/main/java/de/huxhorn/lilith/logback/classic/NDCAdapterImpl.java) | 100% | 100% | 100% | 100% |
| [NDCAdapterImpl.NDCStack.NDCStackEntry.NDCStackEntryMessage](src/main/java/de/huxhorn/lilith/logback/classic/NDCAdapterImpl.java) | 100% | 100% | 100% | 100% |
| [NDCAdapterImpl.NDCStack.NDCStackEntry.NDCStackEntryMessage.NDCStackEntryMessageArgument](src/main/java/de/huxhorn/lilith/logback/classic/NDCAdapterImpl.java) | 100% | 100% | 100% | 100% |
| [NDCAdapterImpl.NDCStack.NDCStackEntry.NDCStackEntryMessage.NDCStackEntryMessageArgument.NDCStackEntryMessageArgumentValue](src/main/java/de/huxhorn/lilith/logback/classic/NDCAdapterImpl.java) | 100% | 100% | 100% | 100% |
| [NDCAdapterImpl.NDCStack.NDCStackEntry.NDCStackEntryMessage.NDCStackEntryMessageArgument.NDCStackEntryMessageArgumentValue.NDCStackEntryMessageArgumentValueType](src/main/java/de/huxhorn/lilith/logback/classic/NDCAdapterImpl.java) | 100% | 100% | 100% | 100% |
| [NDCAdapterImpl.NDCStack.NDCStackEntry.NDCStackEntryMessage.NDCStackEntryMessageArgument.NDCStackEntryMessageArgumentValue.NDCStackEntryMessageArgumentValueType.NDCStackEntryMessageArgumentValueTypeEnum](src/main/java/de/huxhorn/lilith/logback/classic/NDCAdapterImpl.java) | 100% | 100% | 100% | 100% |
| [NDCAdapterImpl.NDCStack.NDCStackEntry.NDCStackEntryMessage.NDCStackEntryMessageArgument.NDCStackEntryMessageArgumentValue.NDCStackEntryMessageArgumentValueType.NDCStackEntryMessageArgumentValueTypeEnum.NDCStackEntryMessageArgumentValueTypeEnumConverter](src/main/java/de/huxhorn/lilith/logback/classic/NDCAdapterImpl.java) | 100% | 100% | 100% | 100% |
| [NDCAdapterImpl.NDCStack.NDCStackEntry.NDCStackEntryMessage.NDCStackEntryMessageArgument.NDCStackEntryMessageArgumentValue.NDCStackEntryMessageArgumentValueType.NDCStackEntryMessageArgumentValueTypeEnum.NDCStackEntryMessageArgumentValueTypeEnumConverter.NDCStackEntryMessageArgumentValueTypeEnumConverterFactory](src/main/java/de/huxhorn/lilith/logback/classic/NDCAdapterImpl.java) | 100% | 100% | 100% | 100% |
| [NDCAdapterImpl.NDCStack.NDCStackEntry.NDCStackEntryMessage.NDCStackEntryMessageArgument.NDCStackEntryMessageArgumentValue.NDCStackEntryMessageArgumentValueType.NDCStackEntryMessageArgumentValueTypeEnum.NDCStackEntryMessageArgumentValueTypeEnumConverter.NDCStackEntryMessageArgumentValueTypeEnumConverterFactory.NDCStackEntryMessageArgumentValueTypeEnumConverterFactoryImpl](src/main/java/de/huxhorn/lilith/logback/classic/NDCAdapterImpl.java) | 100% | 100% | 100% | 100% |
| [NDCAdapterImpl.NDCStack.NDCStackEntry.NDCStackEntryMessage.NDCStackEntryMessageArgument.NDCStackEntryMessageArgumentValue.NDCStackEntryMessageArgumentValueType.NDCStackEntryMessageArgumentValueTypeEnum.NDCStackEntryMessageArgumentValueTypeEnumConverter.NDCStackEntryMessageArgumentValueTypeEnumConverterFactory.NDCStackEntryMessageArgumentValueTypeEnumConverterFactoryImpl.NDCStackEntryMessageArgumentValueTypeEnumConverterImpl](src/main/java/de/huxhorn/lilith/logback/classic/NDCAdapter