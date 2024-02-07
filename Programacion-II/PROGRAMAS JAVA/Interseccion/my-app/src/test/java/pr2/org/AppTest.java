package pr2.org;
import java.util.*;

import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    List<Integer> array1 = new ArrayList<>();
    List<Integer> array2= new ArrayList<>();
    List<Integer> arrayEsperado = new ArrayList<>();

    @Before
    public void setup(){
        this.array1.addAll(Arrays.asList(1,2,3,4,2,6));
        this.array2.addAll(Arrays.asList(2,4,6));

    }
    @Test
    public void Vacio(){
        assertNotNull(array1.isEmpty());
        assertNotNull(array2.isEmpty());
    }
    @Test
    public void testItert(){
        List<Integer> expected = new ArrayList<>();
         List <Integer> resultadoObtenido = new App().Iterativo(array1, array2);
       expected.addAll(Arrays.asList(2,4,2,6));
        assertEquals(expected, resultadoObtenido);
    }
    @Test
    public void testRecur(){
        List<Integer> result = new ArrayList<>();
        result.addAll(Arrays.asList(2,4,2,6));
        List<Integer> klk = new App().calcularInterseccionRecursiva(array1, array2);
        assertEquals(result, klk);
    }

    
   
}
