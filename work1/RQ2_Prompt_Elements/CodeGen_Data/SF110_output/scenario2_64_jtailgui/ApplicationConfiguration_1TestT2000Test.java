// ApplicationConfiguration_1Test.java
package fr.pingtimeout.jtail.configuration;

import fr.pingtimeout.jtail.gui.action.*;
import fr.pingtimeout.jtail.gui.controller.SelectIndexTypeListener;
import fr.pingtimeout.jtail.gui.model.JTailMainModel;
import fr.pingtimeout.jtail.gui.model.OpenFileModel;
import fr.pingtimeout.jtail.gui.view.JTailMainFrame;
import fr.pingtimeout.jtail.gui.view.OpenFileDialog;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import java.util.ResourceBundle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ApplicationConfiguration}.
* It contains one unit test case for the {@link ApplicationConfiguration#openFileModel()} method.
*/
class ApplicationConfiguration_1Test {

	/**
	 * Create an default instance of the "open file" model.
	 *
	 * @return the default instance
	*/
	public OpenFileModel openFileModel() {
		OpenFileModel model = new OpenFileModel();
		model.setMainModel(new JTailMainModel());
                model.addDataType("JTail");
				model.addColumn("name", ResourceBundle.getBundle("Bundle")
	                       .getString("fileName"));
	            model.addColumn("typeFile", ResourceBundle.getBundle("Bundle")
	                       .getString("fileType"));
	            model.addColumn("lastDate", ResourceBundle.getBundle("Bundle")
	                       .getString("lastFileDate"));
	            model.addColumn("nameLastDate", ResourceBundle.getBundle("Bundle")
	                       .getString("fileNameLastDate"));
                return model; 
        }
		
        /**
	 * @see ApplicationConfiguration_1Test#openFileModel()
         */
        @Test
        @SuppressWarnings("unchecked")
		public void openFileModel() {
                OpenFileObject openFileObject = new OpenFileObject();
        	JTailMainFrame mainFrame = new JTailMainFrame();

        	
        	assertEquals(OpenFileModel.class, openFileObject.getClass());
		}
		
		@Test
	public void selectFileType() {
		
		OpenFileModel model = new OpenFileModel();
		
		model.addSelectListener(new SelectIndexTypeListener("fileType:Ceiling"));
		
		OpenFileDialog dialog = new OpenFileDialog();
		
		boolean result = dialog.execute(model, null);
		assertTrue(result);
		assertTrue(String.valueOf(model.getTableName()), model.getFileName().equals("test"));
		assertTrue(String.valueOf(model.getTableType()), model.getTypeFile().equals("ceiling"));
		assertEquals(String.valueOf(model.getFileNameLastDate()), model.getLastFileDate());
		assertEquals(String.valueOf(model.getFileName()), model.getFileName());
		assertEquals(String.valueOf(model.getNameLastDate()),  model.getNameLastDate());
		
		result = dialog.execute(model, null);
		assertFalse(result);
		
		dialog = new OpenFileDialog();
		dialog.setName("Test");
		result = dialog.execute(model,null);
		assertFalse(result);
	}
		
	@Test
	public void selectFileTypeAndName() {
		SelectIndexTypeListener indexTypeListener1 = new SelectIndexTypeListener("fileType:Ceiling");
		SelectIndexTypeListener indexTypeListener2 = new SelectIndexTypeListener("FILETYPE:BAR");
		
		SelectIndexTypeListener2 list = new SelectIndexTypeListener2();
		
		list.addListener(indexTypeListener1);
		list.addListener(indexTypeListener2);
		
		OpenFileModel model = new OpenFileModel();
		
		model.addSelectListener(indexTypeListener1);
		model.addSelectListener(list);
		model.addSelectListener(list);
		model.setFileName("myfile");
		model.addColumn("fileType", ResourceBundle.getBundle("Bundle")
               .getString("fileType"));
		model.addColumn("name", ResourceBundle.getBundle("Bundle")
               .getString("fileName"));
		model.addColumn("lastDate", ResourceBundle.getBundle("Bundle")
               .getString("lastFileDate"));
		
		
		OpenFileDialog dialog = new OpenFileDialog();
		dialog.setName("Tester");
		dialog.setFileName("MyFile");
		dialog.setLastFileDate("2005-12-07");
		
		
		boolean result = dialog.execute(model,null);
		assertTrue(result);
		assertTrue(String.valueOf(model.getTableName()), model.getFileName().equals("MyFile"));
		assertTrue(String.valueOf(model.getTableType()), model.getTypeFile().equals("ceiling"));
		assertEquals(String.valueOf(model.getFileName()), "myfile");
		assertEquals(String.valueOf(model.getFileNameLastDate()), "2005-12-07");
		assertEquals(String.valueOf(model.getNameLastDate()), "2005-12-07");
		assertEquals(String.valueOf(model.getLastFileDate()), "2005-12-07");
	}

}
