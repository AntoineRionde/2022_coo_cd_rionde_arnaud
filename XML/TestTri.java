package XML;

import donnees.CD;
import donnees.ComparateurAlbum;
import donnees.ComparateurArtiste;
import donnees.Magasin;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestTri {

    private ChargeurMagasin charge = new ChargeurMagasin("musicbrainzSimple");

    private Magasin resultat;

    @Test
    public void TestTriAlbum() throws FileNotFoundException {
        resultat = charge.chargerMagasin();
        resultat.trier(new ComparateurAlbum());
        Assert.assertEquals(resultat.getCd(0).getNomCD(), "Believe");
        Assert.assertEquals(resultat.getCd(resultat.getNombreCds()-1).getNomCD(), "Whitney Houston");
    }

    @Test
    public void testTriArtiste() throws IOException {
        resultat = charge.chargerMagasin();
        ChargeurCD chargeurCd = new ChargeurCD("musicbrainzSimple/Benabar_Benabar.xml");
        CD cd = chargeurCd.chargerCD();

        resultat.trier(new ComparateurArtiste());


        Assert.assertEquals(resultat.getCd(1).getNomArtiste(), cd.getNomArtiste());
        Assert.assertEquals(resultat.getCd(resultat.getNombreCds()-1).getNomArtiste(), "Zebda");
    }

}