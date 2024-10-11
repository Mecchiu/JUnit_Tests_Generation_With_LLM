// ClassInfo_6Test.java
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassInfo}.
* It contains one unit test case for the {@link ClassInfo#getData(Class[])} method.
*/
class ClassInfo_6Test {
// ArrayLengthTest.java
		/**
		 * GetDataTest.java
		 * <p>
		 * Tests the ArrayLength constructor of a ClassInfo class.
		*/
		@Test
		public void ArrayLengthTest() {
			Class[] m = new Class[]{
				ArrayList.class
			};
			ClassInfo jvmObj = new ClassInfo(m);
			assertEquals(new Integer(m.length).intValue(), jvmObj.getData(m).length);
		}
}


// DataViewTest.java

/**
 * Returns test data for {@link ClassInfo}.
 * In the past, this class had a lot of data that was not a reference to the ClassInfo class
 * and was just used to test the default constructor. This class just keeps data that does not
 * need it. That's probably not desirable, but this means that some people
 * will want to run the tests with this because they can create an object of its own.
 */
class DataViewTest extends JFrame {

	private JPanel basePane;
	private AbstractButton searchButton;
	private JList classList;
	private JScrollPane scrollPane;

	public DataViewTest(String aClassName) {
		setTitle("test "+ aClassName);
		addClassToTest(aClassName);
	}

	/**
	 * Test the getData(Class[] ) method of a class that has one method. This method is to
	 * check for different implementations of Class. For a given Class object, the
	 * {@link ClassInfo#getData(Class[])} method returns a string array of names. This
	 * string array just contains the name of the method. It is expected that the names
	 * in the getData(Class[] ) are in the following order:
	 * <ol>
	 * <li><em>the name of the class name (e.g., foo.bar)</em></li>
	 * <li><em>name of the constructor of the class</em></li>
	 * <li><em>the name of the class' constructor</em></li>
	 * <li><em>the name of the class' field</em></li>
	 * <li><em>the name of the class' data</em></li>
	 * </ol>
	 */
	private void testGetData(Class[] m) {
		String name, data;
		for (int count = 0; count < m.length; count++) {
			name = m[count].getName();
			String method = name.substring(0, name.indexOf("."));
			data = m[count].getDeclaredMethod(method).invoke(null).toString();
			assertTrue(name, name.equals(data.trim()));
		}
	}

	/**
	 * Return the first name of a class that is public.
	 */
	public final void addClassToTest(String aClassName) {
		final Class clazz = Class.forName(className);
		ClassInfo classInfo = (ClassInfo) clazz.newInstance();
		classList.setListData(classList.getModel().toArray());
		new Thread(new Runnable() {
			public void run() {
				basePane = new JPanel();
				JButton searchButton = new JButton("Search Class...");
				searchButton.addActionListener(null);
				searchButton.setOpaque(false);
				searchButton.setEnabled(false);
				basePane.setLayout(new BoxLayout(basePane, BoxLayout.LINE_AXIS));
				basePane.add(searchButton);
				JPanel dataPane = new JPanel();
				basePane.add(dataPane);
				JList classDataList = new JList();
				classDataList.setCellRenderer(new ClassDataRenderer());
				templateList = new JList();
				classDataList.setVisibleRowCount(10);
				for (int count = 0; count < classList.getModel().size(); count++) {
					Class currentClass = (Class) classList.getModel().getElementAt(count);
					classDataList.setListData(
							new ClassInfo[currentClass.getSuperclass().getInterfaces().length+1]);
					if (count == 0) {
						dataPane.setOpaque(false);
					} else {
						dataPane.setOpaque(true);
					}
					dataPane.add(new JLabel(""));
					dataPane.add(classInfo.getData(currentClass.getInterfaces()));
					templateList.setListData(currentClass.getClassData().getClassData());
					dataPane.add(new JLabel(""));
					dataPane.add(classDataList);
					templateList.addListData(new ParameterizedDataInfo["classDataList"]);
					classDataList.setSelectedIndex(count);
				}
				scrollPane = new JScrollPane(templateList);
				scrollPane.setMaximumSize(new Dimension(300, 300));
				scrollPane.setOpaque(false);
				scrollPane.setViewportBorder(new EmptyBorder(3, 3, 3, 3));
				basePane.add(scrollPane);
				searchButton.setText(" Search Class...");
				searchButton.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
			}
		}).start();
	}

	/**
	 * Shows the class details.
	 */
	public final void showDisplay() {
		basePane.removeAll();
		JPanel dataPanel = new JPanel();
		JPanel header = new JPanel();
		JPanel headerLabel = new JPanel();
		JPanel buttons = new JPanel();
		headerLabel.setLayout(new BorderLayout());
		headerLabel.setLayout(new GridBagLayout());
		headerLabel.add(displayArea, BorderLayout.CENTER);
		header.add(headerLabel);
		headerPanel = new JPanel();
		headerPanel.setLayout(new GridLayout(3, 2));
		JPanel headerPanelContents = new JPanel();
		templateList = new JList();
		templateList.setOpaque(false);
		templateList.setCellRenderer(new TemplateListRenderer());
		headerPanelContents.setLayout(new BoxLayout(headerPanelContents, BoxLayout.PAGE_AXIS));
		headerPanelContents.setOpaque(false);
		headerPanelContents.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		showClassInfo(null);
		templateList.setSelectedIndex(0);
		header