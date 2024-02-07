package pr2.org;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    /**
     * Rigorous Test :-)
     */
    List<Integer> array1 = new ArrayList<>();
    List<Integer> array2 = new ArrayList<>();
    @Before
    public void setup(){
        this.array1.addAll(Arrays.asList(1,2,3,4));
        this.array2.addAll(Arrays.asList(3,7,1,5));
    }
    @Test
    public void diferenciait(){
        List<Integer> res = new App().diferenciaArrays(array1, array2);
        List<Integer> expected = new ArrayList<>();
        expected.addAll(Arrays.asList(2,4,7,5));
        assertEquals(expected,res);
    }
    @Test
    public void diferenciaR(){
        List<Integer> res = new App().diferenciaRecur(array1, array2);
        List<Integer> expected = new ArrayList<>();
        expected.addAll(Arrays.asList(2,4,7,5));
        assertEquals(expected,res);
    }
}
