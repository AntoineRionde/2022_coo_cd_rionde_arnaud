package donnees;

import java.util.ArrayList;

/**
 * La classe Magasin represente un magasin qui vend des CDs.</p>
 * <p>
 * cette classe est caracterisee par un ensemble de CDs correspondant aux CDS
 * vendus dans ce magasin.
 */
public class Magasin {

    /**
     * la liste des CDs disponibles en magasin
     */
    private ArrayList<CD> listeCds;

    /**
     * construit un magasin par defaut qui ne contient pas de CD
     */
    public Magasin() {
        listeCds = new ArrayList<CD>();
    }

    /**
     * ajoute un cd au magasin
     *
     * @param cdAAjouter le cd a ajouter
     */
    public void ajouteCd(CD cdAAjouter) {
        listeCds.add(cdAAjouter);
    }

    @Override
    /**
     * affiche le contenu du magasin
     */
    public String toString() {
        String chaineResultat = "";
        //parcours des Cds
        for (int i = 0; i < listeCds.size(); i++) {
            chaineResultat += listeCds.get(i);
        }
        chaineResultat += "nb Cds: " + listeCds.size();
        return (chaineResultat);

    }

    /**
     * @return le nombre de Cds du magasin
     */
    public int getNombreCds() {
        return listeCds.size();
    }

    /**
     * permet d'acceder à un CD
     *
     * @return le cd a l'indice i ou null si indice est non valide
     */
    public CD getCd(int i) {
        CD res = null;
        if ((i >= 0) && (i < this.listeCds.size()))
            res = this.listeCds.get(i);
        return (res);
    }
    /*Le problème avec cette méthode de tri est qu'elle ne fonctionne qu'avec des Strings il faudrait changer la
    4ème ligne de la méthode pour qu'elle fonctionne avec des int**/
    /**
     * trie les Cds du magasin par ordre alphabétique en fonction du titre
     */
    public void trierAlbum() {
        for (int i = 0; i < this.listeCds.size()-1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (this.listeCds.get(j-1).getNomCD().compareTo(this.listeCds.get(j).getNomCD()) > 0) {
                    CD cd = this.listeCds.get(j);
                    this.listeCds.set(j, this.listeCds.get(j-1));
                    this.listeCds.set(j-1, cd);
                }
            }
        }
    }

    /**
     * trie les Cds du magasin par ordre croissant en fonction de l'artiste
     */
    public void trierArtiste() {
        for (int i = 0; i < this.listeCds.size()-1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (this.listeCds.get(j-1).getNomArtiste().compareTo(this.listeCds.get(j).getNomArtiste()) > 0) {
                    CD cd = this.listeCds.get(j);
                    this.listeCds.set(j, this.listeCds.get(j-1));
                    this.listeCds.set(j-1, cd);
                }
            }
        }
    }

}
