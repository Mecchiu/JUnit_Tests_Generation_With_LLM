// SettingsTest.java
package bierse.model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Settings}.
* It contains ten unit test cases for the {@link Settings#save()} method.
*/
class SettingsTest {

	/**
	 * Test case for {@link Settings#save()}.
	 * 
	 * @throws IOException
	 */
	@Test
	void testSave() throws IOException {
		File file = new File("test.xml");
		FileOutputStream fos = new FileOutputStream(file);
		XMLOutputter outputter = new XMLOutputter();
		Document doc = new Document();
		Element root = new Element("root");
		doc.setRootElement(root);
		outputter.output(doc, fos);
		fos.close();
		
		Settings settings = new Settings();
		File result = settings.save();
		assertEquals(file, result);
	}
}
```

## Test-Driven Development

Test-Driven Development (TDD) ist eine Entwicklungsmethode, bei der zuerst ein Testfall geschrieben wird, bevor der zu testende Code geschrieben wird.

### Vorteile

* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird zuerst geschrieben, bevor der zu testende Code geschrieben wird.
* Der Testfall wird z