package pr2.org;

import static org.junit.Assert.assertTrue;

import java.beans.Transient;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    double COTA_SUPERIOR= 2.45;
    double COTA_INFERIOR= 2.25;
    Integer pasos = 10000;
    @Test
    public void testPi(){
        double cotaSup=3.07;
        double cotaInf =3.19;
        double res = new App().estimacionPi(pasos);
        System.out.println(new App().estimacionPi(pasos));
        assertTrue(cotaSup<= res && cotaInf>=res);
    }
    @Test
    public void DonutIterativo(){
       double resultado = new App().myDonutIterativo(pasos);
       assertTrue(COTA_SUPERIOR>= resultado && COTA_INFERIOR <=resultado);
    }
    @Test
    public void MyDonutRecur(){
        double res = new App().myDonutRecir(pasos);
        
        assertTrue(COTA_SUPERIOR>= res && COTA_INFERIOR <=res);
    }
    @Test
    public void MydonutLam(){
        double res = new App().myDonutLam(pasos);
        assertTrue(COTA_SUPERIOR>= res && COTA_INFERIOR <=res);
    }
}
