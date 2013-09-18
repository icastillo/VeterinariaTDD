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
public class PerroTest {

    Perro perro;

    public PerroTest() {
        perro = new Perro("fifi");
        perro.setTamanho(2);
    }

    @Test
    public void todoPerroDebeTenerUnTamanho() {
        int tamanho = perro.getTamanho();

        perro.getTamanho();
        Assert.assertTrue(tamanho == 0 ? false : true);
    }

    @Test
    public void todoPerroDebeTenerUnTamanhoDeUnMini() {

        perro.setTamanho(1);
        Assert.assertEquals(15.00, perro.costoBanho(),0);
    }

    @Test
    public void todoPerroDebeTenerUnTamanhoDeUnMedio() {

        perro.setTamanho(2);
        Assert.assertEquals(30.00, perro.costoBanho(),0);
    }

    @Test
    public void todoPerroDebeTenerUnTamanhoDeUnGrande() {

        perro.setTamanho(3);
        Assert.assertEquals(45.00, perro.costoBanho(),0);
    }

    @Test
    public void deboPoderCalcularElCostoDelBanho() {
        Assert.assertEquals(15.00, perro.precioBanho(), 15.00);
    }
}