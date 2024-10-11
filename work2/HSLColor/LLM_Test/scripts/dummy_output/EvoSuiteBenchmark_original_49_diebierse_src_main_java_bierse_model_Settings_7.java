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
     * Test of the {@link Settings#save()} method, of class {@link Settings}.
     */
    @Test
    void saveTest() {
    
        System.out.println("saveTest");
       
        Settings s = new Settings(new Model());
        
        Model m = new Model(s.getCurrency());
        
        Document d = new SAXBuilder().build();
        d.createChild("test");
        Element e = d.getRootElement();
        
        e.setAttribute("currency", s.getCurrency());
        
       
        if (!s.isStandardLogic()) {
            d.setContent(this.model.toString());
        }
        
        s.setStandardLogic(s.isStandardLogic());
        
    }

}

//SettingsTest.java