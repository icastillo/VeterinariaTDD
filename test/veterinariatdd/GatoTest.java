/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinariatdd;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author isaias
 */
public class GatoTest {

    Gato gato;

    public GatoTest() {
        gato = new Gato("Satán");
    }

    @Test
    public void deboPoderCalcularElCostoDelBahno() {
        Assert.assertEquals(80.00, gato.precioBanho(), 0.00);
    }
}