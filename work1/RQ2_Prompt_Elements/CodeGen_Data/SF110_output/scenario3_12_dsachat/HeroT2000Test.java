// HeroTest.java
package dsachat.share.hero;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Vector;
import org.dom4j.Document;
import org.dom4j.Element;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Hero}.
* It contains one unit test case for the {@link Hero#getAttrValue(String)} method.
*/
class HeroTest {
/**
		* Test of the getAttrValue method, of class Hero.
		*/
		@Test
		public void testGetAttrValue() {
	}
	
	/** 
	* Test of getAttributes method, of class Hero. 
	* and
	** @throws Exception
	*/
	@Test
	public void testGetAttributes() throws Exception {
        /*
        System.out.println("getAttributes");
        int i=1;
        String short_name = "test";
        String test_short_name = "test";
        int j=3;
        String test = "test";
        String test2="test";

        //System.out.println(test);
        //System.out.println(test);//this is error because a short_name should not be part of the short name:
        //System.out.println("1. short_name("+short_name+")");
        //System.out.println("5. short_name("+short_name+")");
	System.out.println(1. getAttrValue(short_name));
        String value = "5.getAttrValue(short_name)";//this does do the castings because it uses int
        System.out.println(5.getAttrValue(short_name));
        System.out.println(value);//-1.getAttrValue(short_name)//we have a short name, we should get it from short_name in value
        System.out.println(1+5.getAttrValue(short_name));
 */
        
        //System.out.println("1. getAttrValue(" + short_name + ")");
	Vector names=new Vector();
	Vector values=new Vector();
	    
	Iterator it = names.iterator();
	Element element;
	String name;
	String s=String.valueOf(i++);
	while(it.hasNext()){
		element = (Element) it.next();
		
		name = element.attributeValue("short_name");//this does do the castings because it uses int
		name = element.attributeValue("name");
		System.out.println("test " + name + " is " + element.attributeValue("attrs_str"));
		
		if(element.attributeValue("attrs_str")==null){
			break;
		}else{
			System.out.println(name + ": <"+element.attributeValue("attrs_str")+">");	
		}
	 }

	//try to find all attributes of the short name 
	//System.out.println("2. getAttrValue("+short_name+")");		



	int value=0;
	
	values.addElement( s );
	names.addElement(Short.toString(short_name) + ": " + s );
	names.addElement( "test: " + test );
	name =Short.toString(short_name);//this does do the castings because it uses int
//		names.addElement( name );//this does do the castings because it uses int
	while(names.size()>0){
        	
        	  value=0;
//        	  value = Integer.parseInt(names.elementAt(0).getLocalName());
		value = Integer.parseInt(values.elementAt(0).getLocalName() + ":" + values.elementAt(0).getText());
        	if(Short.parseShort(names.elementAt(0).getSimpleValue())==short_name){
        		name = names.get( 0 ) ;
        		break;
			}
		}	
	}

	
	System.out.println("3. getAttrValue("+short_name+')');//this prints for the short name value
	System.out.println("---");	
		
		try{
			System.out.println(Integer.parseInt(value) );
		}catch(Exception e){
			//caught exception while geting value
		}



	}





	/**
	* Test of hasAttributes method, of class Hero.
	* test case 1 
	* and
	** @throws Exception
	*/
	@Test
	public void testIsAttributes() throws Exception {
	//test case 1
	
        System.out.println("hasAttribute(short_name)");
	
        Vector names=new Vector();
        names.addElement(Short.toString(short_name));

        Vector values;
	
		values=new Vector();
		
        Element element;
	
        Iterator it = names.iterator();
	Iterator it2 = values.iterator();

		while( it.hasNext()) {
			element = (Element) it.next();
			
			System.out.println(element.attributeValue("short_name"));
			System.out.println(values.elementAt(1));
				
		}

	}



	}
	/** 
	* Test of setCharacteristicValue method, of class Hero. 
	*/
	/* 
	{ 
  	
 		System.out.println("setCharacteristicValue(Characteristic, double)");
 		System.out.println("setCharacteristicValue(short_name, double)");
 		System.out.println("setCharacteristicValue(char, double)");
 		System.out.println("setCharacteristicValue(char[], double)");
 		System.out.println("setCharacteristicValue(double, double)");

 		
 		Vector attributes=new Vector();
		
		System.out.println("attributes");
		attributes.addElement( Double.toString(Characteristic));//this does do the castings because it uses double
		attributes.addElement( Double.toString(Characteristics[0]));
		System.out.println(attributes.size());
		
		attributes.addElement("char");
		System.out.println(attributes.size());
		System.out.println("setCharacteristicValue(Characteristic, double)");
  		
		System.out.println("setCharacteristicValue(char[], double)");
  		
  		System.out.println("attributes.size()");
 		System.out.println(attributes.size());
 		System.out.println("System.out.println(attributes[0])");
	}
 */

