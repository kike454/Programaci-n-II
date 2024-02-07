/*Copyright [2021] [ENRIQUE COLLADO MUÑOZ]
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing,
software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
implied.
See the License for the specific language governing permissions
and
limitations under the License.*/
package pr2.org;
import java.util.*;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;


public class AppTest 
{
	private Graph<Integer> grafotest;
	//private boolean addEdge;
	//private boolean addEdge2;
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
	assertFalse(grafotest.addVertex(1));
}
@Test 
public void addDosverticesIguales(){
assertTrue(grafotest.addVertex(1));
assertFalse(grafotest.addVertex(1));
}

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
    
    





