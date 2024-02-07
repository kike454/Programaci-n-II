/*Copyright [2022] [ENRIQUE COLLADO]
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
either express or implied. See the License for the specific
language governing permissions and limitations under the
License.
*/
package pr2.org;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
 * @throws Exception
     */
    /**
     * Este test comprueba si el vértice se ha añadido correctamente.
     */
    @Test
        public void verticeAnnadidoCorrectamente()
        {
	        Graph<Integer> g = new Graph<>();
            assertTrue( g.addVertex(1) ); 
        }
    /**
     * Este test comprueba si el método contains value funciona 
     * correctamente.
     */
     @Test
         public void containsValueOk()
    {
	    Graph<Integer> g = new Graph<>();
        g.addVertex(1);
	    assertTrue( g.containsVertex(1) );
    }

    @Test
    public void shortestPathFindsAPath() throws Exception{
        System.out.println("\nTest shortestPathFindsAPath");
        System.out.println("----------------------------");
// We build the graph
        Graph<Integer> g = new Graph<>();
             g.addEdge(1, 2);
             g.addEdge(1, 5);
             g.addEdge(2, 3);
             g.addEdge(3, 4);
             g.addEdge(5, 4);
        
        System.out.println("" + g);
        System.out.println("----------------------------");
// We build the expected path
        List<Integer> expectedPath = new ArrayList<>();
            expectedPath.add(1);
            expectedPath.add(5);
            expectedPath.add(4);
//We check if the returned path is equal to the expected one.
        assertEquals(expectedPath, g.shortestPath(1, 4));
}

@Test
public void shortestPathWithNewGraph() throws Exception{
    System.out.println("\nNew Test shortestPathWithNewGraph");
    System.out.println("----------------------------");
// We build the graph
    Graph<Integer> g = new Graph<>();
         g.addEdge(1, 2);
         g.addEdge(1, 5);
         g.addEdge(2,3);
         g.addEdge(2,6);
         g.addEdge(5, 6);
         g.addEdge(3, 6);
         g.addEdge(3, 4);
    
    
    System.out.println("" + g);
    System.out.println("----------------------------");
// We build the expected path
     List<Integer> expectedPath = new ArrayList<>();
        expectedPath.add(1);
        expectedPath.add(2);
        expectedPath.add(3);
        expectedPath.add(4);
//We check if the returned path is equal to the expected one.
    assertEquals(expectedPath, g.shortestPath(1, 4));
}

}
