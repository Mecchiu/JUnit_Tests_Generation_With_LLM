// ModifTableStockage_1Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains one unit test case for the {@link ModifTableStockage#colonneMail()} method.
*/
class ModifTableStockage_1Test {
		private final int NOME = NOM_TAK;
        private final int NOM_TAK = Integer.MAX_VALUE;
		final static String TEST_ENTRE_NOM_TAK = "testNom";
        final static int TEST_ENDPOINT = 10000;
        final static String TEST_DESTINACAO = "test.destination";

		private String nom = "";

		@Test
        public void testInit() {
                boolean cont = true;
                
                try {
                    JOptionPane.showMessageDialog(null, "Pour que vous vous indique que vous choisie la destination...", 
                            "Vérifier la taille de la table", JOptionPane.INFORMATION_MESSAGE);
					
                    nom = JOptionPane.showInputDialog("Voulez-vous une destination pour les personnels" +
                            "  (voir le formulaire 'choi.destination'). Si vous souhaitez " +
                            "vous placénez l'examen, vous puede entrer une destination vivant de ce type et " +
                            "vitez aussi le nouvelle destination de votre carte de résidence.\n" +
                            "Le formulaire n'être pas vidé.", NOM_TAK.toString(), 
                            JOptionPane.QUESTION_MESSAGE);
                    
                    if(cont == true) {
                        System.out.println(TEST_DESTINACAO);
                        fail();
                    }
                    
                    nom = nom.substring(0, (int)nom.length());
                }
                catch (Exception e) {
                    System.err.println("Exception : " + e);
                    e.printStackTrace();
                    
                    JOptionPane.showMessageDialog(null, 
                            "La ligne de destination est incorrecte", 
                            "Vérifier la ligne de destination",
                            JOptionPane.ERROR_MESSAGE);
                    
                    System.exit(1);
                }
				
                try {
                    new ModifTableStockage(TEST_DESTINACAO, TEST_ENDPOINT, NOM_TAK).colonneMail();
		        }
		        catch (Exception e) {
		            System.err.println("Exception : " + e);
			        System.exit(1);
				}
        }

        @Test
        public void testSauce() {
                boolean cont = true;

                try {
                    new ModifTableStockage(NOME, TEST_DESTINACAO, NOM_TAK).colonneMail();
		        }
		        catch (Exception e) {
		            System.err.println("Exception : " + e);
			        System.exit(1);
			}

                try {
                    new ModifTableStockage(TEST_DESTINACAO.getLength()+1,"",NOM_TAK).colonneMail();
		        }
		        catch (Exception e) {
		            System.err.println("Exception : " + e);
			        System.exit(1);
		 
			} catch (Exception e) {
			    System.err.println("Exception : " + e);
			    System.exit(1);
		 
		}
        }
}