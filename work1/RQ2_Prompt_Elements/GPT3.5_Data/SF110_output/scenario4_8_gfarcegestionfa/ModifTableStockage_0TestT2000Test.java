// ModifTableStockage.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;

public class ModifTableStockage {

    // dimension de la table
    private int nbColonnes = 0;

    // avec la ligne de description (les noms des colonnes)
    private int nbLignes = 0;

    // la table d'origine (String[] nomColonnes ; Object[][] matrice;)
    private TableStockage ts;

    /**
     * Constructeur : recuperation de la TableStockage et initialisation
     *
     * @param ts
     */
    public ModifTableStockage(TableStockage ts) {
        this.ts = ts;
        this.nbColonnes = ts.getNbColonnes();
        this.nbLignes = ts.getNbLignes();
    }

    /**
     * G&eacute;n&egrave;re en sortie une TableStockage &agrave; partir de la table d'origine, mais avec une colonne en plus.
     * Nouvelle colonne de nom "nomNouvelleColonne" et de type "type"
     * Colonne Ajoutee a la fin de la JTable
     * @param nomNouvelleColonne
     * @param type
     * @return TableStockage
     */
    public TableStockage ajouterColonne(String nomNouvelleColonne, Class<?> type) {
        String[] newNomColonnes = new String[nbColonnes + 1];
        Object[][] newMatrice = new Object[nbLignes][nbColonnes + 1];
        for (int i = 0; i < nbColonnes; i++) {
            newNomColonnes[i] = ts.getNomColonnes()[i];
            for (int j = 0; j < nbLignes; j++) {
                newMatrice[j][i] = ts.getMatrice()[j][i];
            }
        }
        newNomColonnes[nbColonnes] = nomNouvelleColonne;
        for (int j = 0; j < nbLignes; j++) {
            newMatrice[j][nbColonnes] = null;
        }
        return new TableStockage(newNomColonnes, newMatrice);
    }

    /**
     * Genere en sortie une TableStockage, a partir de la table d'origine, avec une ligne en plus.
     * Ligne ajoutee a la fin de la JTable
     * @return TableStockage
     */
    public TableStockage ajouterLigne() {
        String[] newNomColonnes = ts.getNomColonnes();
        Object[][] newMatrice = new Object[nbLignes + 1][nbColonnes];
        for (int i = 0; i < nbColonnes; i++) {
            for (int j = 0; j < nbLignes; j++) {
                newMatrice[j][i] = ts.getMatrice()[j][i];
            }
        }
        for (int i = 0; i < nbColonnes; i++) {
            newMatrice[nbLignes][i] = null;
        }
        return new TableStockage(newNomColonnes, newMatrice);
    }

    /**
     * Genere en sortie une TableStockage, a partir de la table d'origine
     * avec la colonne selectionnee en moins
     * colonne d'indice donne en parametre supprimee
     * @param indice
     * @return TableStockage
     */
    public TableStockage supprimerColonne(int indice) {
        String[] newNomColonnes = new String[nbColonnes - 1];
        Object[][] newMatrice = new Object[nbLignes][nbColonnes - 1];
        int k = 0;
        for (int i = 0; i < nbColonnes; i++) {
            if (i != indice) {
                newNomColonnes[k] = ts.getNomColonnes()[i];
                for (int j = 0; j < nbLignes; j++) {
                    newMatrice[j][k] = ts.getMatrice()[j][i];
                }
                k++;
            }
        }
        return new TableStockage(newNomColonnes, newMatrice);
    }

    /**
     * Genere en sortie une TableStockage, a partir de la table d'origine,
     * avec la ligne selectionnee en moins.
     * ligne d'indice donne en parametre supprimee
     * @param indice
     * @return TableStockage
     */
    public TableStockage supprimerLigne(int indice) {
        String[] newNomColonnes = ts.getNomColonnes();
        Object[][] newMatrice = new Object[nbLignes - 1][nbColonnes];
        int k = 0;
        for (int i = 0; i < nbLignes; i++) {
            if (i != indice) {
                for (int j = 0; j < nbColonnes; j++) {
                    newMatrice[k][j] = ts.getMatrice()[i][j];
                }
                k++;
            }
        }
        return new TableStockage(newNomColonnes, newMatrice);
    }

    /**
     * Genere en sortie une TableStockage, a partir de la table d'origine,
     * avec la colonne d'indice donne en parametre separee.
     * @param indice
     * @return TableStockage
     */
    public TableStockage separerColonne(int indice) {
        String[] newNomColonnes = new String[nbColonnes + 1];
        Object[][] newMatrice = new Object[nbLignes][nbColonnes + 1];
        int k = 0;
        for (int i = 0; i < nbColonnes; i++) {
            if (i != indice) {
                newNomColonnes[k] = ts.getNomColonnes()[i];
                for (int j = 0; j < nbLignes; j++) {
                    newMatrice[j][k] = ts.getMatrice()[j][i];
                }
                k++;
            } else {
                newNomColonnes[k] = ts.getNomColonnes()[i] + "_1";
                for (int j = 0; j < nbLignes; j++) {
                    newMatrice[j][k] = ts.getMatrice()[j][i];
                    newMatrice[j][k + 1] = null;
                }
                k += 2;
            }
        }
        return new TableStockage(newNomColonnes, newMatrice);
    }

    /**
     * Genere en sortie une TableStockage, a partir de la table d'origine,
     * avec la colonne d'indice donne en parametre fusionnee avec la colonne voisine de droite.
     * @param indice
     * @return TableStockage
     */
    public TableStockage fusionnerColonnes(int indice) {
        String[] newNomColonnes = new String[nbColonnes - 1];
        Object[][] newMatrice = new Object[nbLignes][nbColonnes - 1];
        int k = 0;
        for (int i = 0; i < nbColonnes; i++) {
            if (i != indice && i != indice + 1) {
                newNomColonnes[k] = ts.getNomColonnes()[i];
                for (int j = 0; j < nbLignes; j++) {
                    newMatrice[j][k] = ts.getMatrice()[j][i];
                }
                k++;
            } else if (i == indice) {
                newNomColonnes[k] = ts.getNomColonnes()[i] + "_" + ts.getNomColonnes()[i + 1];
                for (int j = 0; j < nbLignes; j++) {
                    newMatrice[j][k] = ts.getMatrice()[j][i] + " " + ts.getMatrice()[j][i + 1];
                }
                k++;
            }
        }
        return new TableStockage(newNomColonnes, newMatrice);
    }

    /**
     * Genere en sortie une TableStockage, a partir de la table d'origine,
     * avec une nouvelle colonne de nom "E-Mail"
     * Permettra a l'utilisateur de choisir a qui envoyer un mail pour la suite.
     * @return TableStockage
     */
    public TableStockage colonneMail() {
        String[] newNomColonnes = new String[nbColonnes + 1];
        Object[][] newMatrice = new Object[nbLignes][nbColonnes + 1];
        for (int i = 0; i < nbColonnes; i++) {
            newNomColonnes[i] = ts.getNomColonnes()[i];
            for (int j = 0; j < nbLignes; j++) {
                newMatrice[j][i] = ts.getMatrice()[j][i];
            }
        }
        newNomColonnes[nbColonnes] = "E-Mail";
        for (int j = 0; j < nbLignes; j++) {
            new