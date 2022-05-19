package main;

import XML.ChargeurMagasin;
import donnees.ComparateurAlbum;
import donnees.ComparateurArtiste;
import donnees.ComparateurPistes;
import donnees.Magasin;

import java.io.IOException;

/**
 * permet de charger un magasin de test
 */
public class MainChargeurMagasin {

    /**
     * methode principale
     *
     * @param args inutilise
     * @throws IOException en cas de probleme de lecture entree/sortie
     */
    public static void main(String args[]) throws IOException {

        String repertoire = "musicbrainzSimple";
        ChargeurMagasin charge = new ChargeurMagasin(repertoire);
        Magasin resultat = charge.chargerMagasin();
        //System.out.println(resultat);
        System.out.println("----------RESULTAT ALBUM-----------\n\n\n");
        resultat.trier(new ComparateurAlbum());
        System.out.println(resultat);
        System.out.println("----------RESULTAT ARTISTE-----------\n\n\n");
        resultat.trier(new ComparateurArtiste());
        System.out.println(resultat);
        System.out.println("----------RESULTAT PISTES-----------\n\n\n");
        resultat.trier(new ComparateurPistes());
        System.out.println(resultat);

    }

}
