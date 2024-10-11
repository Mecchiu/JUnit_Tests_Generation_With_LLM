// TreeBuilder_1Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TreeBuilder}.
* It contains one unit test case for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
*/
class TreeBuilder_1Test {
private TreeBuilder myTreeBuilder;

	@Test
	public void parseXML() throws XMLParsingException, IOException, SAXException {
		myTreeBuilder = new TreeBuilder();
		
		File testDataFile = new File("../../xml/myxml.xml");
		myTreeBuilder.parseXML(new FileInputStream(testDataFile), false);
		System.out.println("Test xml content: " + testDataFile + "\n");
		assertTrue(testDataFile + " is not a parsable xml.", testDataFile.exists());

		File testProjFolder = new File("../../proj2"); // + "/test-xml-tree-builder-1.12/"
		File newProjectFolder = new File("../testProject/target/proj2"); // "target/testProject/test-xml-tree-builder-1.12/"
		if (testProjFolder.exists()) {
			FileUtils.deleteDirectory(testProjFolder);
		}
		FileUtils.copyDirectory(new ProjectFolder(new ProjectFolder(testProjFolder), testProjFolder), newProjectFolder);
		assertTrue("Project folder is not created", newProjectFolder + " does not exist.", testProjFolder + " not created.");
				
		File testProjRoot = new File("../../testProject/target/proj2/src");
		FileUtils.deleteDirectory(new File("../testProject/target/proj2"));

		Properties props = new Properties();
		HashMap<String, String> additionalPropsParsedXml = new HashMap<>();
		FileUtils.readProperties(new File(projRoot, "AdditionalProperties.properties"), "UTF-8",
				FileUtils.getInputStream(new File(projFolder, "AdditionalProperties.properties")), null, props, additionalPropsParsedXml);
		List<File> additionalFileList = FileUtils.findFiles(new File(newProjectFolder, "AdditionalProperties.properties"), "utf-8", null);
		List<File> additionalDirList = FileUtils.findFiles(new File(testProjRoot, "AdditionalProperties"), "utf-8", null);
		List<File> additionalDirAndFileList = new ArrayList<>(additionalDirList.size());
		List<String> additionalFileListKeys = new ArrayList<>(additionalFileList.size());
		for (final File additionalDirectory : new ArrayList<>(additionalDirList)) {
			additionalDirAndFileList.add(additionalDirectory);
			additionalFileListKeys.add(additionalDirectory.getName().replace("src", ""));
		}
		for (final File additionalFile : new ArrayList<>(additionalFileList)) {
			additionalDirAndFileList.add(additionalFileListKeys.get(additionalFile.getName().replace("src", "")));
		}
		for (final File additionalFile : additionalDirList) {
			additionalDirAndFileList.add(additionalDirList.get(additionalFile.getName().replace("src", "")));
		}

		for (final File additionalFile : additionalFileList) {
			assertEquals(testProjRoot, additionalFile.getParentFile());
			assertEquals("XML should have no attribute 'file'", additionalFileListKeys.get(additionalFile.getName().replace("src", "")), additionalFile.getName());
		}

		props = new Properties();
		if (additionalPropsParsedXml.size() > 0) {
			FileUtils.readProperties(new File(projRoot, "AdditionalProperties.properties"), "UTF-8", additionalPropsParsedXml, props, null);
		}
		else {
			props = new Properties();
			FileUtils.readProperties(new File(projRoot, "AdditionalProperties.properties"), "UTF-8", additionalPropsParsedXml, props);
		}
		HashMap<String, String> additionalPropsDefaultKeyParsedXml = new HashMap<>(additionalPropsParsedXml);
		additionalPropsDefaultKeyParsedXml.remove("file.default.key");
		for (final String key : additionalPropsDefaultKeyParsedXml.keySet()) {
			FileUtils.deleteDirectory(new File(testProjRoot, "AdditionalProperties.properties"));
			FileUtils.deleteDirectory(new File(newProjectFolder, "testProject/test-xml-tree-builder-1.12"));
		}
		FileUtils.copyDirectory(new ProjectFolder(new ProjectFolder(testProjFolder), testProjFolder), newProjectFolder);
		assertTrue("Properties file is not created", newProjectFolder + " does not exist.", testProjFolder + " does not exist.");
	}

	@Test
	public void tree() throws SAXException, IOException {
		myTreeBuilder = new TreeBuilder();
		File inputFile = new File("../../xml/myxml.xml");
		myTreeBuilder.parseXML(inputFile, false);
		System.out.println("test xml content: " + inputFile + "\n");
		String xml = myTreeBuilder.getXML();
		// The XML should contain a "<tree>" element which includes an <annotation> element with a name "tree" and its root tag "tree".
		assertTrue("No tree tag with name \"tree\" in output", xml.contains("<tree"));
		assertTrue("Output of output tag in output contains a root of <annotation> tag", xml.contains("\"tree\""));
		
		File outputFile = new File("../../proj2/tests/test-xml-tree-builder-1.12/projRoot/src/file.proj");
		assertTrue("Output of output tag in output contains an <annotation> tag", xml.contains("\""));
		assertTrue("ProjRoot does not have a subfolder", outputFile.getParentFile().listFiles()[0]!= null);
		System.out.println("XML in " + outputFile + " contents:\n" + xml);
	}

	public void setTreeBuilder(TreeBuilder aTreeBuilder) {
		myTreeBuilder = aTreeBuilder;
	}

	@Override
	public void error(SAXParseException ex) throws SAXException {
		System.err.println(ex.getMessage());
	}
 
}
