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
		public static void main(String[] args) {
			
				try {
					XmlElement_2Test e1 = new XmlElement_2Test();
					e1.setChanged("changed");
					assertEquals(1,e1.elements());
				} catch(Exception e) {
					e.printStackTrace();
				}
				
			}
		
		public void setChanged() {
			changed=true;
		}
		public boolean changed() {
			return changed;
		}
}

/**
 * Test class of {@link XmlElement}.
 * It contains one unit test case for the {@link XmlElement#addSubElement(String)} method.
 */
class XmlElement_4Test extends XmlElement_2Test {
		public XmlElement_4Test()
		{
			super.setChanged();
		}
		
		public void setChanged() {
			super.setChanged();
			changed=true;
		}
		
}
/**
* Test class of {@link XmlElement}.
* It contains one unit test case for the {@link XmlElement#addSubElement(String)} method.
 */
class XmlElement_1Test extends XmlElement_4Test {
		public XmlElement_1Test()
		{
			super.setChanged();
		}
		
		public void setChanged() {
			super.setChanged();
			changed=true;
		}
}

public class XmlElement {
	private Hashtable<String,XmlElement> subNodes = new Hashtable<String,XmlElement>();
	private Vector<XmlElement> children = new Vector<XmlElement>();

	public boolean added() {
		return this.children.size()>0;
	}

	public XmlElement get(String path) {
    	return this.subNodes.get(path);
    }

    public void set(String path, XmlElement child) {
    	this.children.add(child);
    	this.subNodes.put(path, child);
    }

    public int size() {
		return this.children.size();
	}

	public XmlElement addSubElement(String path, XmlElement cv) {
    	XmlElement e = new XmlElement(path, cv);
    	this.children.add(e);
    	this.subNodes.put(path, e);

		return e;
	}

	public List<XmlElement> getAllElements() {
		List<XmlElement> cv = new Vector<XmlElement>();
		Iterator iter = this.children.iterator();
		while (iter.hasNext()){
			XmlElement f= (XmlElement) iter.next();
			cv.add(new XmlElement(f.getPath(),f.getCV()));
		}

		return cv;
	}

	public XmlElement[] getAllElements(){
		List<XmlElement> cv = new Vector<XmlElement>();
		Iterator iter = this.children.iterator();
		while (iter.hasNext()){
			XmlElement f= (XmlElement) iter.next();
			cv.add(new XmlElement(f.getPath(),f.getCV()));
		}

		return cv.toArray(new XmlElement[cv.size()]);
	}

	public Iterator<XmlElement> i(){
		return this.children.iterator();
	}

	public XmlElement addSubElement(XmlElement path,
            XmlElement cv) {
		assertNotNull(cv);
//		XmlElement e= (XmlElement)cv.addSubElement(this,path);
    	XmlElement e = new XmlElement(path,cv);

		if (cv.added()){
			this.children.add(e);
		}
		this.subNodes.put(path, e);

		return e;
	}

	public XmlElement addSubElement(String path,
		XmlElement cv) {
		assertNotNull(cv);
//    	XmlElement e= (XmlElement)cv.addSubElement(this,path);
		XmlElement e = new XmlElement(path,cv);

		if (cv.added()){
			this.children.add(e);
		}
		this.subNodes.put(path, e);

		return e;
	}

	public void clear() {
		this.subNodes.clear();
		this.children.clear();
	}
	private String parentId = null;
	private String path = null;
	private boolean changed = true;
	public void setChanged(boolean value) {
		this.changed = value;
	}
	public boolean changed() {
		return this.changed;
	}
	public void setParentId(String id) {
		this.parentId = id;
	}
	public String getParentId() {
		return this.parentId;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getPath() {
		return this.path;
	}
	public void setChanged() {
		this.changed=true;
	}

	/**
	 * The elements have been added to the XmlElement.
	 */
    public void notifyAdded() {
        this.children.clear();
        if (this.parentId!=null) {
        	Object o = this.subNodes.remove(parentId);
            if (o!=null) {
                this.children.add((XmlElement) o);
                return;
            }
        }

        Iterator iter = this.children.iterator();
        while (iter.hasNext()){
            XmlElement se = (XmlElement)iter.next();

            se.notifyAdd();
        }
        this.changed();
    }
}