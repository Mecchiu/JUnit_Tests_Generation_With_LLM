// ExplorerModelBuilderTest.java
package de.paragon.explorer.model;

import de.paragon.explorer.figure.ExplorerFigure;
import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.gui.ExplorerDrawingPanel;
import de.paragon.explorer.util.ExplorerManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplorerModelBuilder}.
* It contains ten unit test cases for the {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()} method.
*/
class ExplorerModelBuilderTest {

	/**
	* Test case for {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()}.
	* It tests if the method returns a new {@link ExplorerModel} and {@link ExplorerFigure} object.
	*/
	@Test
	void testCreateNewExplorerModelWithFigure() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em);
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()}.
	* It tests if the method returns a new {@link ExplorerModel} and {@link ExplorerFigure} object.
	*/
	@Test
	void testCreateNewExplorerModelWithFigure2() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em);
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()}.
	* It tests if the method returns a new {@link ExplorerModel} and {@link ExplorerFigure} object.
	*/
	@Test
	void testCreateNewExplorerModelWithFigure3() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em);
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()}.
	* It tests if the method returns a new {@link ExplorerModel} and {@link ExplorerFigure} object.
	*/
	@Test
	void testCreateNewExplorerModelWithFigure4() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em);
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()}.
	* It tests if the method returns a new {@link ExplorerModel} and {@link ExplorerFigure} object.
	*/
	@Test
	void testCreateNewExplorerModelWithFigure5() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em);
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()}.
	* It tests if the method returns a new {@link ExplorerModel} and {@link ExplorerFigure} object.
	*/
	@Test
	void testCreateNewExplorerModelWithFigure6() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em);
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()}.
	* It tests if the method returns a new {@link ExplorerModel} and {@link ExplorerFigure} object.
	*/
	@Test
	void testCreateNewExplorerModelWithFigure7() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em);
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()}.
	* It tests if the method returns a new {@link ExplorerModel} and {@link ExplorerFigure} object.
	*/
	@Test
	void testCreateNewExplorerModelWithFigure8() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em);
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()}.
	* It tests if the method returns a new {@link ExplorerModel} and {@link ExplorerFigure} object.
	*/
	@Test
	void testCreateNewExplorerModelWithFigure9() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em);
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()}.
	* It tests if the method returns a new {@link ExplorerModel} and {@link ExplorerFigure} object.
	*/
	@Test
	void testCreateNewExplorerModelWithFigure10() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em);
		assertNotNull(em.getExplorerFigure());
	}
}

// ExplorerModelTest.java
package de.paragon.explorer.model;

import de.paragon.explorer.figure.ExplorerFigure;
import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.gui.ExplorerDrawingPanel;
import de.paragon.explorer.util.ExplorerManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplorerModel}.
* It contains ten unit test cases for the {@link ExplorerModel#getExplorerFigure()} method.
*/
class ExplorerModelTest {
		
	/**
	* Test case for {@link ExplorerModel#getExplorerFigure()}.
	* It tests if the method returns a new {@link ExplorerFigure} object.
	*/
	@Test
	void testGetExplorerFigure() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModel#getExplorerFigure()}.
	* It tests if the method returns a new {@link ExplorerFigure} object.
	*/
	@Test
	void testGetExplorerFigure2() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModel#getExplorerFigure()}.
	* It tests if the method returns a new {@link ExplorerFigure} object.
	*/
	@Test
	void testGetExplorerFigure3() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModel#getExplorerFigure()}.
	* It tests if the method returns a new {@link ExplorerFigure} object.
	*/
	@Test
	void testGetExplorerFigure4() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModel#getExplorerFigure()}.
	* It tests if the method returns a new {@link ExplorerFigure} object.
	*/
	@Test
	void testGetExplorerFigure5() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModel#getExplorerFigure()}.
	* It tests if the method returns a new {@link ExplorerFigure} object.
	*/
	@Test
	void testGetExplorerFigure6() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModel#getExplorerFigure()}.
	* It tests if the method returns a new {@link ExplorerFigure} object.
	*/
	@Test
	void testGetExplorerFigure7() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModel#getExplorerFigure()}.
	* It tests if the method returns a new {@link ExplorerFigure} object.
	*/
	@Test
	void testGetExplorerFigure8() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModel#getExplorerFigure()}.
	* It tests if the method returns a new {@link ExplorerFigure} object.
	*/
	@Test
	void testGetExplorerFigure9() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModel#getExplorerFigure()}.
	* It tests if the method returns a new {@link ExplorerFigure} object.
	*/
	@Test
	void testGetExplorerFigure10() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em.getExplorerFigure());
	}
}

// ExplorerModelTest.java
package de.paragon.explorer.model;

import de.paragon.explorer.figure.ExplorerFigure;
import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.gui.ExplorerDrawingPanel;
import de.paragon.explorer.util.ExplorerManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplorerModel}.
* It contains ten unit test cases for the {@link ExplorerModel#getExplorerFigure()} method.
*/
class ExplorerModelTest {
		
	/**
	* Test case for {@link ExplorerModel#getExplorerFigure()}.
	* It tests if the method returns a new {@link ExplorerFigure} object.
	*/
	@Test
	void testGetExplorerFigure() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModel#getExplorerFigure()}.
	* It tests if the method returns a new {@link ExplorerFigure} object.
	*/
	@Test
	void testGetExplorerFigure2() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModel#getExplorerFigure()}.
	* It tests if the method returns a new {@link ExplorerFigure} object.
	*/
	@Test
	void testGetExplorerFigure3() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModel#getExplorerFigure()}.
	* It tests if the method returns a new {@link ExplorerFigure} object.
	*/
	@Test
	void testGetExplorerFigure4() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModel#getExplorerFigure()}.
	* It tests if the method returns a new {@link ExplorerFigure} object.
	*/
	@Test
	void testGetExplorerFigure5() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModel#getExplorerFigure()}.
	* It tests if the method returns a new {@link ExplorerFigure} object.
	*/
	@Test
	void testGetExplorerFigure6() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModel#getExplorerFigure()}.
	* It tests if the method returns a new {@link ExplorerFigure} object.
	*/
	@Test
	void testGetExplorerFigure7() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModel#getExplorerFigure()}.
	* It tests if the method returns a new {@link ExplorerFigure} object.
	*/
	@Test
	void testGetExplorerFigure8() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModel#getExplorerFigure()}.
	* It tests if the method returns a new {@link ExplorerFigure} object.
	*/
	@Test
	void testGetExplorerFigure9() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em.getExplorerFigure());
	}
	
	/**
	* Test case for {@link ExplorerModel#getExplorerFigure()}.
	* It tests if the method returns a new {@link ExplorerFigure} object.
	*/
	@Test
	void testGetExplorerFigure10() {
		ExplorerModelBuilder emb = ExplorerModelBuilder.getInstance();
		ExplorerModel em = emb.createNewExplorerModelWithFigure();
		assertNotNull(em.getExplorerFigure());
	}
}

// ExplorerModelTest.java
package de.paragon.explorer.model;

import de.paragon.explorer.figure.ExplorerFigure;
import de.