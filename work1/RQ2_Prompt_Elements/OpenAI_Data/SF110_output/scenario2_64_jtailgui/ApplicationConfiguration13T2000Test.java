// ApplicationConfigurationTest.java
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
* It contains ten unit test cases for the {@link ApplicationConfiguration#openFileDialog()} method.
*/
class ApplicationConfigurationTest {

	@Test
	void test_openFileDialog_returns_a_non_null_value() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog = applicationConfiguration.openFileDialog();
		
		// Then
		assertNotNull(openFileDialog);
	}
	
	@Test
	void test_openFileDialog_returns_a_non_null_value_when_called_twice() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog1 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog2 = applicationConfiguration.openFileDialog();
		
		// Then
		assertNotNull(openFileDialog1);
		assertNotNull(openFileDialog2);
	}
	
	@Test
	void test_openFileDialog_returns_a_non_null_value_when_called_ten_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog1 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog2 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog3 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog4 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog5 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog6 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog7 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog8 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog9 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog10 = applicationConfiguration.openFileDialog();
		
		// Then
		assertNotNull(openFileDialog1);
		assertNotNull(openFileDialog2);
		assertNotNull(openFileDialog3);
		assertNotNull(openFileDialog4);
		assertNotNull(openFileDialog5);
		assertNotNull(openFileDialog6);
		assertNotNull(openFileDialog7);
		assertNotNull(openFileDialog8);
		assertNotNull(openFileDialog9);
		assertNotNull(openFileDialog10);
	}
	
	@Test
	void test_openFileDialog_returns_a_non_null_value_when_called_a_hundred_times() {
		// Given
		ApplicationConfiguration applicationConfiguration = new ApplicationConfiguration();
		
		// When
		OpenFileDialog openFileDialog1 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog2 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog3 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog4 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog5 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog6 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog7 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog8 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog9 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog10 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog11 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog12 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog13 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog14 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog15 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog16 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog17 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog18 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog19 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog20 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog21 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog22 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog23 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog24 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog25 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog26 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog27 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog28 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog29 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog30 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog31 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog32 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog33 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog34 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog35 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog36 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog37 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog38 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog39 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog40 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog41 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog42 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog43 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog44 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog45 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog46 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog47 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog48 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog49 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog50 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog51 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog52 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog53 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog54 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog55 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog56 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog57 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog58 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog59 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog60 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog61 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog62 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog63 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog64 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog65 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog66 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog67 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog68 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog69 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog70 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog71 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog72 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog73 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog74 = applicationConfiguration.openFileDialog();
		OpenFileDialog openFileDialog75 = applicationConfiguration.open