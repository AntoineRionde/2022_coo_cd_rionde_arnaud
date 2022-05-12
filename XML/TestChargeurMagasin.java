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
        boolean exception = false;
        try
        {
            ChargeurMagasin chargeur = new ChargeurMagasin("musicbrainzzzzSimple/");
            Magasin m  = chargeur.chargerMagasin();
        }
        catch (FileNotFoundException e)
        {
            exception = true;
        }
        Assert.assertTrue(exception);
    }
}
