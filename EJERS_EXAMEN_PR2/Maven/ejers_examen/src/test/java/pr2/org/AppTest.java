package pr2.org;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

import org.junit.*;
import org.junit.Test;




/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    List<Integer> array1 = new ArrayList<>();
    List<Integer> array2 = new ArrayList<>();
  

    @Before
    public void setup(){
        this.array1.addAll(Arrays.asList(1,2,3,4,2,6));
        this.array2.addAll(Arrays.asList(2,4,6,11,13));
    }
    @Test
    public void noVaccio(){
        assertNotNull(array1.isEmpty());
        assertNotNull(array2.isEmpty());
    }
    @Test
    public void testIntIter(){
        List<Integer> expected = new ArrayList<>();
        List<Integer> resultado = new App().interseccionIt(array1, array2);
        expected.addAll(Arrays.asList(2,4,2,6));
        assertEquals(expected, resultado);
    }
    @Test
    public void testIntRecur(){
        List<Integer> expected = new ArrayList<>();
        List<Integer> resul1 = new App().interseccionRecur(array1, array2);
        expected.addAll(Arrays.asList(2,4,2,6));
        assertEquals(expected,resul1);
    }
    @Test
    public void testintersecLambda(){
        List<Integer> expected= new ArrayList<>();
        expected.addAll(Arrays.asList(2,4,2,6));
        List<Integer> resul2 = new App().interseccionLam(array1, array2);
        assertEquals(expected, resul2);
    }
    @Test
    public void testUnionIt(){
        List<Integer> expected = new ArrayList<>();
        expected.addAll(Arrays.asList(1,2,3,4,6,11,13));
        List<Integer> resultado =new App().unionIt(array1, array2);
        assertEquals(expected,resultado);
    }
    @Test
    public void testUnionRec(){
        List<Integer> expected = new ArrayList<>();
        expected.addAll(Arrays.asList(1,2,3,4,6,11,13));
        List<Integer> resul = new App().unionRec(array1, array2);
        assertEquals(expected, resul);
    }
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
