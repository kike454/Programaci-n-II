package pr2.org;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    double limiteSuperior= 150.0;
    double limiteInferior= 140.0;
    @Test
    public void aproxItOk()
    {
        double resultado = new App().aproxIt(5, 10);
        assertTrue(limiteSuperior>= resultado && limiteInferior <=resultado);
    }
    @Test
    public void aproxRec(){
        double resultado1 = new App().aproxRec(5, 10);
        assertTrue(limiteSuperior>= resultado1 && limiteInferior <=resultado1);
    }
    @Test
    public void aproxLam(){
        double resultado2 = new App().aproxlam(5, 10);
        assertTrue(limiteSuperior>= resultado2 && limiteInferior <=resultado2);
    }
}
