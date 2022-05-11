package XML;

import donnees.Magasin;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

public class TestChargeurMagasin {

    @Test
    public void testChargeurMagasin_Valide() throws FileNotFoundException {
        ChargeurMagasin chargeur = new ChargeurMagasin("musicbrainzSimple/");
        Magasin m  = chargeur.chargerMagasin();
        Assert.assertEquals(12, m.getNombreCds());
    }

    @Test
    public void testChargeurMagasin_NonValide() {
        try
        {
            ChargeurMagasin chargeur = new ChargeurMagasin("musicbrainzzzzSimple/");
            Magasin m  = chargeur.chargerMagasin();
            Assert.assertEquals(12, m.getNombreCds());
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

    }
}
