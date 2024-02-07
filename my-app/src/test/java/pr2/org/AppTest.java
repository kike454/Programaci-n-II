package pr2.org;
import java.util.*;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;


public class AppTest 
{
	private Graph<Integer> grafotest;
		/**
* Este test comprueba que el método ‘onePath(V v1, V v2)‘
* encuentra un camino entre ‘v1‘ y ‘v2‘ cuando existe.
*/
//este metodo comprueba que el metodo oneptah ecuenytrab un camino entre v1 y v2 cuando exite
@Before
public void Grafo(){
	grafotest = new Graph<Integer>();
}
@Test
public void graphexist(){
	assertNotNull(grafotest);
}
@Test
public void annadirV(){
	assertTrue(grafotest.addVertex(1));
}
@Test 
public void addDosverticesIguales(){
assertTrue(grafotest.addVertex(1));
assertFalse(grafotest.addVertex(1));
}

//con addedge y con contains

@Test //prueba end to end,verifica el flujo completo de la aplicacion, de principio a fin
public void onePathFindsAPath() throws Exception{
System.out.println("\nTest onePathFindsAPath");
System.out.println("----------------------");
// Se construye el grafo.
Graph<Integer> g = new Graph<>();
g.addEdge(1, 2);
g.addEdge(3, 4);
g.addEdge(1, 5);
g.addEdge(5, 6);
g.addEdge(6, 4);
// Se construye el camino esperado.
List<Integer> expectedPath = new ArrayList<>();
expectedPath.add(1);
expectedPath.add(5);
expectedPath.add(6);
expectedPath.add(4);
//Se comprueba si el camino devuelto es igual al esperado.
System.out.println(g.toString());
assertEquals(expectedPath, g.onePath(1, 4));
System.out.println(g.onePath(1,4).toString());


}


    
}
    
    





