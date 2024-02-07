package pr2.org;

import static org.junit.Assert.*;
import java.util.*;
import java.beans.Transient;
import java.util.ArrayList;

import org.junit.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    private List<Integer> sistemaMonedas = new ArrayList<>();
    @Before
    public void setup(){
        this.sistemaMonedas.addAll(Arrays.asList(200, 100, 50, 20, 10, 5 , 2, 1));
    }
    @Test 
    public void testIter(){
        //List<Integer> expected = new ArrayList<>();
        int res = new App().cambioIt(67, sistemaMonedas);
        int numeroMonedas = 4;
        assertEquals(numeroMonedas,res);
    }
    @Test 
    public void testRecut(){
        int numeroMonedas =4;
        int res = new App().cambioRec(67, sistemaMonedas);
        assertEquals(numeroMonedas,res);
    }
 /*   @Test 
    public void testLam(){
        assertEquals(4,new App().cambioLam(67, sistemaMonedas));
    }*/
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
