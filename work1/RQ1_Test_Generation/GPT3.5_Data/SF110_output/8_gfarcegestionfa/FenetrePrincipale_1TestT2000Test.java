```java
import static org.junit.jupiter.api.Assertions.assertEquals;

class FenetrePrincipale_1Test {

    @Test
    void testDateDeNaiss() {
        FenetrePrincipale fenetre = new FenetrePrincipale(new Controler());
        
        // Test case 1: Date de naissance is 01/01/2000
        fenetre.comboBoxJourDDNEtu.setSelectedItem("1");
        fenetre.comboBoxMoisDDNEtu.setSelectedItem("1");
        fenetre.comboBoxAnneeDDNEtu.setSelectedItem("2000");
        assertEquals("01012000", fenetre.dateDeNaiss());
        
        // Test case 2: Date de naissance is 15/06/1995
        fenetre.comboBoxJourDDNEtu.setSelectedItem("15");
        fenetre.comboBoxMoisDDNEtu.setSelectedItem("6");
        fenetre.comboBoxAnneeDDNEtu.setSelectedItem("1995");
        assertEquals("15061995", fenetre.dateDeNaiss());
        
        // Test case 3: Date de naissance is 31/12/1988
        fenetre.comboBoxJourDDNEtu.setSelectedItem("31");
        fenetre.comboBoxMoisDDNEtu.setSelectedItem("12");
        fenetre.comboBoxAnneeDDNEtu.setSelectedItem("1988");
        assertEquals("31121988", fenetre.dateDeNaiss());
    }
}
```