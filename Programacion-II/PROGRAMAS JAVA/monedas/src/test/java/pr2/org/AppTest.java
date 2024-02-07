package pr2.org;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private List<Integer> sistemaMonedas = new ArrayList<>();
    @Before
    public void setup(){
        this.sistemaMonedas.addAll(Arrays.asList(200, 100, 50, 20, 10, 5 , 2, 1));
    }
    @Test
   public void cambioIterativoOk(){
    assertEquals(2, App.cambioIterativo(400, sistemaMonedas));
   }
   @Test
   public void cambioItFail(){
       assertEquals(0, App.cambioIterativo(-1, sistemaMonedas));
   }
   @Test
   public void recurOk(){
       assertEquals(9, App.cambioRecursivo(589, (sistemaMonedas)));
   }
   @Test
   public void cambioReurFail(){
    assertEquals(0, App.cambioRecursivo(-1, sistemaMonedas));
   }
   
}
