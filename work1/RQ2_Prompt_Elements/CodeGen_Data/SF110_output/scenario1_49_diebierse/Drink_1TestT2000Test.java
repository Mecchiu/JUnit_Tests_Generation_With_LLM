// Drink_1Test.java
package bierse.model;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import bierse.view.MyKeyMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Drink}.
* It contains one unit test case for the {@link Drink#save()} method.
*/
class Drink_1Test {

	/**
	* Test of save() method, of class Drink.
	*/
	@Test
    public void testSave() {
    	model.getLog().debug("testSave()");
        // Build JDOM document representing the settings
        Element root = new Element("drink");
        Element minPriceElem = new Element("minPrice");
        minPriceElem.setText("0");
        root.addContent(minPriceElem);
        Element maxPriceElem = new Element("maxPrice");
        maxPriceElem.setText("0");
        root.addContent(maxPriceElem);
        Element startPriceElem = new Element("startPrice");
        startPriceElem.setText("0");
        root.addContent(startPriceElem);
        Element targetAmountElem = new Element("targetAmount");
        targetAmountElem.setText("0");
        root.addContent(targetAmountElem);
        Element deltaAmountElem = new Element("deltaAmount");
        deltaAmountElem.setText("0");
        root.addContent(deltaAmountElem);
        Element maxStepElem = new Element("maxStep");
        maxStepElem.setText("0");
        root.addContent(maxStepElem);
        Element usedElem = new Element("used");
        usedElem.setText("0");
        root.addContent(usedElem);
        Element keyElem = new Element("key");
        keyElem.setText("0");
        root.addContent(keyElem);
        
        // Create folder
        File folder = new File("Drinks/" + name);
        if (!folder.exists()) {
            folder.mkdirs();
        }
	
        // Save JDOM document to file system
        File file = new File(Drinky.DRINKS_FOLDER + name + ".xml");
        Document settingsDoc = new Document(root);
        try {
            FileWriter fos = new FileWriter(file);
            XMLOutputter serializer = new XMLOutputter();
            serializer.output(settingsDoc, fos);
            fos.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            fos.close();
            fos = null;
        } catch (Exception e) {
            model.getLog().error(this, e);
        }
		
  		/* Save drink to file: 
			 * drink.xml<br/><br/>Drinks.xml	*#>##	    <![CDATA[
		 * 
		 * 
	 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * ]]>##</br>

		 * New drink.xml:	
		 * 
		 * 		&lt;Drink id="1" name="Tester" startPrice="0.01"&gt;
		 * 		&lt;MinPrice value="0"/&gt;
		 * 		&lt;MaxPrice value="0"/&gt;
		 * 		&lt;StartPrice value="0"&gt;
		 * 			&lt;DeltaValue value="0"/&gt;
		 * 			&lt;MaxStep&gt;0&lt;/DeltaValue&gt;
		 * 			&lt;TargetAmount value="0"/&gt;
		 * 		&lt;/MinPrice&gt;
		 * 		&lt;/MaxPrice&gt;
		 * 		&lt;MaxStep value="0"/&gt;
		 * 		&lt;StartPrice value="0"/&gt;
		 * 		&lt;DeltaAmount value="0"/&gt;
		 * 		&lt;TargetAmount value="0"/&gt;
    		* </br>
  		 * 
		 * 
		 * 
		 * 
	 * 	  </br>
	 * </br>
	 * 
	 */
    		
        // Get the file
        File drinkXML = new File("Drinks.xml");
        File fileDrinkXML = new File("Drinks.xml");
        if (drinkXML.exists()) {
	        assertFalse(fileDrinkXML.delete());
        }
        
        Document docDrinkXML = null;
        try {
	        document = new Document(root);
            docDrinkXML = new SAXBuilder().build(new File(Drinks.DRINK_XML_SRC));
	        if (docDrinkXML.getRootElement().get