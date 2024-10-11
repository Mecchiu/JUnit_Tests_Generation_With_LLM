package fr.unice.gfarce.interGraph;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import fr.unice.gfarce.main.*;
import javax.swing.JComboBox;

class FenetrePrincipale_0Test {

    @Test
    void testDateLimForm() {
        // Given
        FenetrePrincipale fenetrePrincipale = new FenetrePrincipale(new Controler());
        JComboBox comboBoxJourDLM = new JComboBox(new String[]{"1", "2", "3"});
        JComboBox comboBoxMoisDLM = new JComboBox(new String[]{"1", "2", "3"});
        JComboBox comboBoxAnneeDLM = new JComboBox(new String[]{"2021", "2022", "2023"});
        fenetrePrincipale.comboBoxJourDLM = comboBoxJourDLM;
        fenetrePrincipale.comboBoxMoisDLM = comboBoxMoisDLM;
        fenetrePrincipale.comboBoxAnneeDLM = comboBoxAnneeDLM;

        // When
        String dateLimForm = fenetrePrincipale.dateLimForm();

        // Then
        assertEquals("1232021", dateLimForm);
    }

    @Test
    void testDateLimFormWithEmptyComboBoxes() {
        // Given
        FenetrePrincipale fenetrePrincipale = new FenetrePrincipale(new Controler());
        JComboBox comboBoxJourDLM = new JComboBox();
        JComboBox comboBoxMoisDLM = new JComboBox();
        JComboBox comboBoxAnneeDLM = new JComboBox();
        fenetrePrincipale.comboBoxJourDLM = comboBoxJourDLM;
        fenetrePrincipale.comboBoxMoisDLM = comboBoxMoisDLM;
        fenetrePrincipale.comboBoxAnneeDLM = comboBoxAnneeDLM;

        // When
        String dateLimForm = fenetrePrincipale.dateLimForm();

        // Then
        assertEquals("", dateLimForm);
    }
}
