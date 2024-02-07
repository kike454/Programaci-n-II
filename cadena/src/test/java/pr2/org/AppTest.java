package pr2.org;

import static org.junit.Assert.*;

//import org.junit.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * El nombre y los apellidos van delimitados por comas 
     */
    @Test 
    public void CadenaResultadoOk(){
        String str = "FP";
        assertEquals( str , App.CadenaResultado("Fr4nc1sc0 jAvier,perez reverte"));     
    }
    @Test
    public void nombreVacio()
    {
        String str = ""; 
        assertEquals(str , App.CadenaResultado(""));
    }
    @Test 
    public void numero() {
        System.out.println("meter numero en vez string");
       assertEquals("", App.CadenaResultado("11,23"));
    }
    @Test 
    public void soloNombre(){
        String nm = "ramoi";
        assertEquals("R", App.CadenaResultado(nm));
    }
    @Test 
    public void nombreYapellidoSinComas(){
        String name = "miguel de Cervantes Garcia Lopez";
        assertEquals("M", App.CadenaResultado(name));
    }
}
