// Menu_1Test.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FilenameFilter;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Menu}.
* It contains one unit test case for the {@link Menu#createXML()} method.
*/
class Menu_1Test {

	// Method to create xml file
	
	public boolean createXML() throws FileNotFoundException, FileAccessException {
		
		// Write out xml
		
		try {
			writeXML();
																					
		} catch (IOException io) {
			System.out.println("IO Exception occured..."); io.printStackTrace();
		}
								 
		System.out.println("Test completed");
		
		return true;
	}
	
	// Method to write out the xml
	
	public void writeXML() throws IOException {
				
		// Get dvdauthor inputstream		
				
		File dvdauth = new File("dvdauthor.in");
				
		// Get dvdauthor outputstream		
		
		FileWriter fo = new FileWriter("out"+".html");
				
		// Write out xml
		FileInputStream fi = new FileInputStream(dvdauth);
		File file = new File(dvdauth.getParent()+"/"+dvdauth.getName().replace(".in", ".html"));
		BufferedInputStream bis = new BufferedInputStream(fi);
		BufferedOutputStream bo = new BufferedOutputStream(fo);
				
		// Close stream
		 
		bo.close();
		
		// Close file
		
		bo.close();
		fi.close();
		
		
		System.out.println("Write out xml Success");
	}
		  
	
	// Test for method "void Menu_1Test()"
	// Test for method "void addVideo("int,String,boolean)..."
	@Test public void test1() {
		System.out.println("Test 1");
		int video1 = 12345;
		String title1 = "Title of first video clip";
		boolean isLast = true;
		
		StringTokenizer st = new StringTokenizer(title1,"_");
		while (st.hasMoreTokens()) st.nextToken();
		String videoclip = "";
		
		for (int i=0;i<st.countTokens();i++) videoclip += st.nextToken();
		
		MenuItem item = new Menu_1TestItem();
		Menu.addVideo(video1,videoclip,isLast,item);
		
		String output = menu1("VIDEO",item);
	   	assertEquals("Return value of menu1 does not match video1", menu1(item,new String[]{"VIDEO",videoclip},isLast,item),output);
		assertEquals("Return value for addVideo", menu1(item, new String[]{"VIDEO",videoclip,isLast},isLast,item),output);
	}
	
	

	public void test2() throws FileNotFoundException, IOException, ClassNotFoundException{
				
		String xmlFileName = new File("xmlFileName").toString();
		File file = new File(xmlFileName);
		
		// Write out the Xml File
		
		FileInputStream fi = new FileInputStream(file) ;
		FileWriter fo = new FileWriter("out"+".html");
		
		// Write out the Xml File
		
		BufferedInputStream bis = new BufferedInputStream(fi);
		
		String xml = getXML(bis, fo);
		
		// Clean up		
		
		fi.close();
		
		
		System.out.println("Test 2");
		
	}

	/**
	 * This is the method name used in the menu.xml
     *
	 * @param is InputStream created from a BufferedInputStream
	 * @return InputStream generated from buffered file
	 *
	 */
    
    protected InputStream getXML(InputStream is, FileOutputStream fo) throws FileNotFoundException, IOException {
	BufferedInputStream bis = new BufferedInputStream(is) ;
        FileInputStream fi = new FileInputStream(fo) ;
        File xml = new File("Menu_xmlFileName.nfo");
        
        // Write the title to the FileOutputStream
	  
	  BufferedWriter bw = new BufferedWriter(
	    new FileWriter(xml.getAbsolutePath())) ;
	  
	  bw.write(bw.getBuffer()+"</doc>");
	  bw.close() ;
        bw = null;
	  
        // Now write out the menu content
        
	  String s = getXML(bis,fo);
        
	  return new ByteArrayInputStream(s.getBytes(),"UTF-8","menu" ) ;
    }
    
	public String getXML(InputStream is) throws FileNotFoundException, IOException{
		return getXML(is,null);
	}
    
	
		
		
	// Test for method "void Menu_1Test()"
	// Method: addVideo("java.lang.String,java.lang.String,boolean)..."
	
	
	public void test4() throws FileNotFoundException, IOException, ClassNotFoundException{
		String xmlFileName = new File("menu.xml").toString();
		
	File menu = new File(xmlFileName);
	
	String xml = getXML(new FileInputStream(menu),null);
	
	assertEquals("Return value for getXML:  menu.xml does not match menu content", menu.getAbsolutePath(), xml);
	}

}
