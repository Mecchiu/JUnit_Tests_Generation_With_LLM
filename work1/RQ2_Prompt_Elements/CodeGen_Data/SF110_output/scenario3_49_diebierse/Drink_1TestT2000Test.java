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
    * Method called for all tests in this class.
    */
    @Test
    public void test() throws Exception {

        String drinkDescription=
                "A drink on which the user drinks something.\n"
                        + "The drink's owner must provide one and only one thing on the shelf.\n\n"
                        + "The drink's owner must use the same barcode as the rest of the items and must be one with one thing on the shelf.\n\n"
                        + "The drink's owner must supply at least one thing on the shelf. Some other thing on the shelf and one thing with the same barcode as the rest of the items must do nothing in order for this drink to be picked."
                  + "<br>Note: <li>When this drink's description is updated, the drink must also be updated because if the drink has no owner, it cannot provide anything and the owner and its owner must always provide one thing with one thing on the shelf.</li> \n\n"
                  + "<li>\n"
                        + "<ul>"
                          + "<li>The shelf must provide one barcode and one thing without any item on the shelf.</li>"
                          + "<li>The shelf should start with a barcode, and a lot of items in the shelf must be one thing with one thing on the shelf.</li>"
                          + "<li>The items in the shelf should either be on the shelf or not.</li>"
                          + "</ul>"
                        + "</li>\r\n"
                        + "</ul>"
                  + "The drink's owner must allow you to create one thing at one time, or have it update. To create and update an item, press the following keys: \r\n\n"
                  + "<ul>"
                    + "<li>Press <b>0</b> to create it</li>"
                    + "<li>Press <b>1</b> to add that something to your shelf</li>"
                    + "<li>Press <b>2</b> to update that thing</li>"
                  + "</ul>",
                  drinkDescription,
                    MyKeyMap.getInstance().keyBases.get(1));
    Document drinkDoc=
                new SAXBuilder().build(new File("src/test/resources/bierse/model/Drink_1Test.xml"));
    Element rootElement=
                drinkDoc.getRootElement();
    assertEquals(1, rootElement.getAttributeCount());

    KeyMap keyMap = new MyKeyMap()
       .addKey("0")
       .addKey("1")
       .addKey("2")
    ;

    Document savedDoc=
                new SAXBuilder().build(new File("src/test/resources/bierse/model/Drink_1Test.xml"));
    Element savedNode=
                new SAXBuilder().build(new File("src/test/resources/bierse/model/Drink_1Test.xml")).getRootElement();

    MyKeyMap.setRootElement(drinkDoc.getRootElement());
    assertEquals(3, rootElement.getAttributeCount());

    assertTrue("key:0.", rootElement.hasAttribute("key"));

    Element item= rootElement.getChild("item");
    Item i = new Item(item.getAttributeValue("name"),
                        item.getChild("barCode"),
                        keyMap);

    assertEquals(i.getItemID(), item.getAttributeValue("itemID"));
    assertEquals(i.getBarCode(), item.getChild("barCode"));
    assertNull(i.getOwner());
    assertFalse(rootElement.hasChild("owner"));
    assertTrue(rootElement.getChild("owner").hasAttribute("barCode"));

    boolean isValid=false;
    boolean isDone=false;
    assertNull(rootElement.getChild("owner"));
    while (*keyMap.keyIter!= null) {
        isValid= i.validate(new Runnable(){
            public void run(){
                throw new AssertionError("This should be overriden by an override method.");
            }
        });

        if (isDone ||!isValid) {
            isDone= i.ready();
            break;
        }
        keyMap.keyIter++;
    }

    assertTrue(isDone);

    assertTrue(i.getBarCode().equals("10"));
    i.setOwner("10");

    // Save
    File target= new File("src/test/resources/bierse/model/Drink_1Test.xml");
    assertNotEquals(target.exists(), this.save().exists());
    target.setLastModified(System.currentTimeMillis());
    assertTrue((new FileOutputStream(target)).exists());

    boolean isValid1= isDone;
    i.save();

    // Validate whether the element was written properly, and the last modification time didn't change
    assertTrue(i.validate(new Runnable(){
        public void run(){
            throw new AssertionError("TODO: This should be overriden by a default method.");
        }
    }).isDone());
   assertFalse(isValid1);
    File root= new File("src/test/resources/bierse/model/Drink_1Test.xml");
    XMLOutputter output = new XMLOutputter();
    FileWriter outFile;

    try {
        outFile = new FileWriter(root,true);
        output.output(new Document(new File(root,"data/bierse.xml")), outFile);
        outFile.close();
    } catch(Exception exc){
        exc.printStackTrace();
    }
    assertTrue(hasKeyMap(drinkDoc.getRootElement(),"owner"));
  }

  /**
   * Test if no item can be chosen as well as providing or asking a user for.
   */
  @Test
  public void test2() throws Exception {

    String drinkDescription=
        "A drink on which the user drinks something.\n\n"
			+ "The drink's owner must provide one and only one thing on the shelf.\n\n"
			+ "If none of the items can be used, no drink is generated.\n\n"
			+ "If no items are not placed, nothing is returned.\n\n"
			+ "You will be asked for the number of available items to create and a response is sent back to the user. "
              + "For help, visit the page <a href=\"http://bierse.fr\/">Bierse</a>.",
            drinkDescription,keyMap.keyBases.get(0));

    File target = new File("src/test/resources/bierse/model/Drink_2.xml");
    assertNotNull(target);

    Document drinkDoc=
        new SAXBuilder().build(new File("src/test/resources/bierse/model/Drink_2.xml"));

    Element rootElement = drinkDoc.getRootElement();
    assertEquals(0, rootElement.getAttributeCount());
  }
}
