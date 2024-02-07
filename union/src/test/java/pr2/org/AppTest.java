package pr2.org;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import java.util.*;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 * @param <E>
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    List<Integer> array1 = new ArrayList<>();
    List<Integer> array2= new ArrayList<>();
    List<Integer> arrayRes = new ArrayList<>();

    @Before
    public void setup(){
        this.array1.addAll(Arrays.asList(1,2,3,4,2,6));
        this.array2.addAll(Arrays.asList(2,4,6,7));

    }
    @Test 
    public void testItert(){
        List<Integer> expected = new ArrayList<>();
        List <Integer> resultadoObtenido = new App().unionIterativo(array1, array2);
      expected.addAll(Arrays.asList(1,2,3,4,6,7));
       assertEquals(expected, resultadoObtenido);
    }
    /*@Test 
    public void testRe(){
        List<Integer> expected1 = new ArrayList<>();
        
        List <Integer> resultadoObtenido1 = new App().unionRecursivo(array1, array2,array1.size()-1,array2.size()-1,arrayRes);
      expected1.addAll(Arrays.asList(1,2,3,4,6,7));
       assertEquals(expected1, resultadoObtenido1);
    }*/
    @Test
    public void testMetodo(){
        List<Integer> expected3 = new ArrayList<>();
        List<Integer> resultadoObtenido = new App().metodo(array1,array2);
        expected3.addAll(Arrays.asList(2, 4, 6, 7, 3, 1));
        assertEquals(expected3,resultadoObtenido );
    }
    @Test
    public void testMetodo2(){
        List<Integer> expected4 = new ArrayList<>();
        List<Integer> resultadoObtenido1 = new App().metodo2(array1,array2);
        expected4.addAll(Arrays.asList(6, 2, 4, 3, 1));
        assertEquals(expected4,resultadoObtenido1 );
    }
    @Test
    public void intacto(){
        List<Integer> resul = new ArrayList<> (array1); // hago copia del array
        List<Integer> resul2 = new ArrayList<>(array2);
        List<Integer> funcion = new App().metodo2(array1, array2);
        assertEquals(array1, resul);
        assertEquals(array2, resul2);
    }
    @Test
    public void intacto2(){
        List<Integer> resul = new ArrayList<> (array1); // hago copia del array
        List<Integer> resul2 = new ArrayList<>(array2);
         new App().metodo(array1, array2);
        assertEquals(array1, resul);
        assertEquals(array2, resul2);
    }
  /*  @Test
    public void lmbda(){
        List<Integer> resultMetodo = new App().unionLambda(array1, array2);
        List<Integer> expeceted = new ArrayList<>();
        expeceted.addAll (Arrays.asList(2, 4, 6, 7, 3, 1));
        assertEquals(expeceted, resultMetodo);
    }*/

}
