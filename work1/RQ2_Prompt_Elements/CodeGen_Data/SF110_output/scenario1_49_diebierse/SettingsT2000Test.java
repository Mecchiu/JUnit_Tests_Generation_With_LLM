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
* It contains one unit test case for the {@link Settings#save()} method.
*/
class SettingsTest {

	/**
	 * Creates a JDOM document representing the settings.
	 * @return Document representing the settings
	 */
    public Document setup() {
        final Element settings = new Element(DOM_SETTINGS);
        final Element msg = new Element(DOM_MESSAGE);
        final Element speed = new Element(DOM_MESSAGE_SPEED);
        final Element type = new Element(DOM_MODEL);	
        final Element value = new Element(DOM_VALUE);
        final Element valueType = new Element(DOM_VALUE_TYPE);
        final Element valueSize = new Element(DOM_VALUE_SIZE);
        final Element valueStr = new Element(DOM_VALUE_STR);
        final Element valueStrType = new Element(DOM_VALUE_STR_TYPE);
        final Element keyValue = new Element(DOM_KEY_VALUE);
        
        type.setText(DOM_VALUE_STR);
        value.setText("My value is " + DOM_VALUE_SIZES.get(DOM_VALUE_SIZE.getText()));
        value.addContent(DOM_VALUE_SIZES.get(DOM_VALUE_SIZE.getText()));
        valueStr.setText(DOM_VALUE_STR);
        valueStrType.setText("Numberer");
        keyValue.setText("Numberer");
        
        if (isYes(DOM_YES)) {
        	keyValue.addContent(DOM_KEY_VALUE_YES);
        } else if (isNo(DOM_YES)) {
        	keyValue.addContent(DOM_KEY_VALUE_NO);
        }        
        
        final Element root = new Element(DOM_EVENT_ROUTE);
        
        final Element eventRoot = new Element(DOM_EVENT_META_ROUTE);
        final Element eventRoot2 = new Element(DOM_EVENT_META_ROUTE2);
        final Element eventRoot3 = new Element(DOM_EVENT_META_ROUTE3);
        
        eventRoot2.setText(DOM_EVENT_META_ROUTE_PATH);
        eventRoot.addContent(eventRoot2);
        eventRoot3.setText("Event root event");
        
        final Element action = new Element(DOM_EVENT_TARGET);
        final Element action2 = new Element(DOM_EVENT_TARGET2);
        final Element action3 = new Element(DOM_EVENT_TARGET3);
        
        final Element msg2 = new Element(DOM_EVENT_TEXT);
        final Element msg3 = new Element(DOM_EVENT_TEXT);
        msg2.setText("This is a message");
        
        action2.setText("Button action 2");
        action2.addContent(DOM_EVENT_PATH_MESSAGE);
        action3.setText("Button action");
        action3.addContent("It is a action");

        final Element text1 = new Element(DOM_EVENT_TEXT);
        final Element text2 = new Element(DOM_EVENT_TEXT);
        final Element text3 = new Element(DOM_EVENT_TEXT);
        text1.setText("The message text");
        text2.setText("This is the reply to the message");
        text3.setText("It is the reply message");
        
        final Element root2 = new Element(DOM_EVENT_HAS_MESSAGE);
        final Element root3 = new Element(DOM_EVENT_HAS_MESSAGE2);
        final Element root4 = new Element(DOM_EVENT_HAS_MESSAGE3);
        
        final Element rootAction = new Element(DOM_EVENT_ROUTE_ACTION);
        final Element rootAction1 = new Element(DOM_EVENT_ROUTE_ACTION1);
        final Element rootAction2 = new Element(DOM_EVENT_ROUTE_ACTION2);
        final Element rootAction3 = new Element(DOM_EVENT_ROUTE_ACTION3);
        final Element rootAction4 = new Element(DOM_EVENT_ROUTE_ACTION4);
        
        final Element eventRootAction = new Element(DOM_EVENT_ROUTE_ACTION_SUBMITTED);
        final Element eventRootAction1 = new Element(DOM_EVENT_ROUTE_ACTION_PRE_SUBMITTED);
        final Element eventRootAction2 = new Element(DOM_EVENT_ROUTE_ACTION_SUBMITTED);
        final Element eventRootAction3 = new Element(DOM_EVENT_ROUTE_ACTION_SUBMITTED);
        final Element eventRootAction4 = new Element(DOM_EVENT_ROUTE_ACTION_RECEIVED);
        
        eventRootAction2.setText(DOM_ROUTE_ACTION_CANCEL);
        eventRootAction1.setText(DOM_ROUTE_ACTION_CANCEL);
        eventRootAction3.setText(DOM_ROUTE_ACTION_CANCEL);
            
        final Element elementList = new Element(DOM_DATA_TABLE