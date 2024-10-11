// XmlElement_2Test.java
package com.allenstudio.ir.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlElement}.
* It contains one unit test case for the {@link XmlElement#addSubElement(String)} method.
*/
class XmlElement_2Test {
		
    /**
     * A test element.
     */
    private XmlElement xmlElement;
    
    
    /**
     * test initialization of an XmlElement.
     * <p>
     * test creates an empty element, adds it to the XML and waits for its
     * appearance.
     */
    @Test
    public void testInit(){
        
        xmlElement = new XmlElement("test",0);
        assertTrue("test element is not an instance of XmlElement", 
            xmlElement instanceof XmlElement);

        xmlElement.addSubElement("test");
        xmlElement.startParsing();

        xmlElement.endParsing();
        
        assertTrue("test element has no children", 
            xmlElement.getChildCount() == 0);

    }


    /**
     * test adding an element with a unique key value.
     * <p>
     * test add element using a unique key with a default value
     * of 0 and a path of {"text":{"text1"}}
     */
    @Test
    public void testAddElement(){
        
        XmlElement newElement = new XmlElement("test",0);
        newElement.addChild("text",new Hashtable<String,Object>());
        
        String path = new ElementPath("text",0) ;
        ElementPath ePath = new ElementPath("text1","text",0);
        newElement.addSubElement(i2jPathList(path,ePath.getName()));
        
        ElementPath pathRef = new ElementPath("text",4,path);
        
        String path1 = new ElementPath(x2jPathList(pathRef),ePath.getKey()).getPath();
        
        XmlElement xmlElem1 = getXmlElement("test",path1,ePath.getChildCount());
        
        assertNotNull("xmlElement is null", xmlElem1);
        assertEquals("Element's key is not equal",path,"text");
        assertEquals("Element's children not equal",ePath.getChildCount()+1,xmlElem1.getChildCount());
        
        String childPath = xmlElem1.getChild(0).getKey();
        String newChildPath = xmlElem1.getChild(ePath.getChildCount()).getKey();
        int childIndex = ePath.getChildCount()+1;
        
        ePath = new ElementPath(x2jPathList("text",childIndex,0),ePath.getName());
        
        newChildIndex = ePath.getChildCount()+1;
        newChildKey = newChildIndex+1;
        
        xmlElem1 = getXmlElement("test",path1,ePath.getChild(newChildIndex));
        
        newElement = getXmlElement("test",path1,ePath.getChildCount());
        newElement.addChild(x2jPathList(newChildIndex),new Hashtable<String,Object>());
        
        int oldChildIndex = new ElementPath(xmlElem1.getPath(),newChildKey).getChildCount();
        
        newElement.addSubElement(x2jPathList("text",newChildIndex+oldChildIndex),"text");
        xmlElem1 = xmlElem1.clone();
        
        pathRef = new ElementPath(x2jPathList("text1",childIndex,ePath.getKey()));
        xmlElem1 = xmlElem1.clone();
        
        xmlElem1.addSubElement(x2jPathList(pathRef));
        
        assertNotNull("cloned xmlElement is not null", xmlElem1);
    }
    
    
    /**
     * test getChildElement for a sub element.
     *
     */
    @Test
    public void testGetChildElement(){
        
        XmlElement currElement = xmlElement;
        assertTrue("getChildElement for an empty sub element null",
            currElement.getChild(0) == null);
        // this element has children as well
        assertTrue("getChildElement for an element with no children", 
            currElement.getChildCount() > 0);
        
    }


    /**
     * gets the elements which are referred by a path.
     *
     */
    private List<XmlElement> i2jPathList(String ele, String subEle){
        
        XmlElement[] eleArray = new XmlElement[0];
        
        XmlElement_2Test ele2jPathList = new XmlElement_2Test(ele,subEle);
        
        ElementPath ePath = new ElementPath("text1","text",0);
        
        ele2jPathList.parseEle(ePath);
        
        eleArray = ele2jPathList.i2jArray();
        
        return eleArray;
        
    }
    
    
    //@Test
    public void testSetChangedEnum( ){
        
        assertThat("test set changed to false by default", xmlElement.getChanged(), 
                new EqualsPredicate<Boolean>(), "false");
        xmlElement.setChanged(true);
        assertFalse("test set changed to true by default", xmlElement.getChanged());
        
    }
    
    public XmlElement getXmlElement(String element, String path, int count){
        XmlElement xmlElement = new XmlElement("test",0);
        Vector<ElementPath> elePathv = new Vector<ElementPath>();
        Hashtable<String,ElementPath> eleHash = new Hashtable<String,ElementPath>();

        String key = path;"text1"+String.valueOf(count);
        
        ElementPath childPath = new ElementPath(key,Integer.valueOf(count));
        elePathv.addElement(childPath);
        
        Iterator<ElementPath> iterator = elePathv.iterator();
        while(iterator.hasNext()){
            ElementPath childPath1 = iterator.next();
            eleHash.put(childPath1.getName(),childPath1);
        }
        
}
}