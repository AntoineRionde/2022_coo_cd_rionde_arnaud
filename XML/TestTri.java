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
    public void TestTriAlbum() throws FileNotFoundException, IOException {
        resultat = charge.chargerMagasin();

        resultat.trierAlbum();

        Assert.assertEquals("Believe",resultat.getCd(0).getNomCD());
        Assert.assertEquals("Whitney Houston",resultat.getCd(resultat.getNombreCds()-1).getNomCD());

    }

    @Test
    public void TestTriArtiste() throws FileNotFoundException, IOException {
        resultat = charge.chargerMagasin();
        CD cd = new ChargeurCD("musicbrainzSimple/Benabar_Benabar.xml").chargerCD();

        resultat.trierArtiste();

        Assert.assertEquals(cd.getNomArtiste(),resultat.getCd(0).getNomArtiste());
        Assert.assertEquals("Zebda",resultat.getCd(resultat.getNombreCds()-1).getNomArtiste());

    }

}