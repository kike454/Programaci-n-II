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

import java.util.*;

/**
 * Hello world!
 *
 */
public class Graph<V>{
        //Lista de adyacencia.
        private Map<V, Set<V>> adjacencyList = new HashMap<>();
        
        /******************************************************************
        * Añade el vértice ` v` al grafo.
        *
        * @ param v vértice a añ adir.
        * @ return ` true` si no estaba anteriormente y ` false` en caso
        * contrario.
        ******************************************************************/
        public boolean addVertex(V v){
            if(!adjacencyList.containsKey(v)) {
                adjacencyList.put(v, new HashSet<V>());
                return true;
            }else return false;  
        }
        /******************************************************************
        * Añade un arco entre los vértices ` v1` y ` v2` al grafo. En
        * caso de que no exista alguno de los vértices, lo añade
        * también.
         * @throws Exception
        *
        * @ param v1 el origen del arco.
        * @ param v2 el destino del arco.
        * @ return ` true` si no existía el arco y ` false` en caso contrario.
        ******************************************************************/
        public boolean addEdge(V v1, V v2) throws Exception{
            addVertex(v1);
            addVertex(v2);
            Set <V> Vecinos1 = obtainAdjacents(v1);
		    Set <V> Vecinos2 = obtainAdjacents(v2);
        if(Vecinos1.contains(v2)) { 
			return false;
		}else {
			Vecinos1.add(v2);
			Vecinos2.add(v1);
			return true;//devuelve true si no existia el arco, y los añade
			}
        }
        /******************************************************************
        * Obtiene el conjunto de vértices adyacentes a ` v`.
        *
        * @ param v vértice del que se obtienen los adyacentes.
        * @ return conjunto de vértices adyacentes.
        ******************************************************************/
        public Set<V> obtainAdjacents(V v) throws Exception{
          return  adjacencyList.get(v);
       
        }
         /******************************************************************
         * Comprueba si el grafo contiene el vértice dado.
         *
         * @ param v vértice para el que se realiza la comprobación.
            * @ return ` true` si ` v` es un vértice del grafo.
        ******************************************************************/
        public boolean containsVertex(V v){
             return adjacencyList.containsKey(v);
            
        }
    /******************************************************************
    * Método ` toString()` reescrito para la clase ` Grafo. java`.
    * @ return una cadena de caracteres con la lista de
    * adyacencia.
    ******************************************************************/
    @Override
        public String toString(){
        return "Lista de adyacencia " + adjacencyList; 
    }
    /**
    * Obtiene, en caso de que exista, el camino más corto entre
    * ` v1` y ` v2`. En caso contrario, devuelve ` null`.
     * @throws Exception
    *
    * @ param v1 el vértice origen.
    * @ param v2 el vértice destino.
    * @ return lista con la secuencia de vértices del camino más corto
    * entre ` v1` y ` v2`
    */
    public List<V> shortestPath(V v1, V v2) throws Exception{
     
        ArrayList<V> camino = new ArrayList<>();//añadimos el camino encontrado
       // Stack<V> abierta = new Stack<>();
        Queue<V> cola = new LinkedList<>();
        Set<V> visitado = new HashSet<>();
        visitado.add(v1);

        //añadimos el primer vertice que extraeremos primero
		cola.add(v1);
		Map<V, V> traza = new HashMap<>();
        //añades el primer vertice 
		traza.put(v1, null);
		boolean encontrado = false;
		while(!cola.isEmpty() && !encontrado){
            //creas un vertice v el cual es el elemento que esta en el final de la cola
			V v = cola.poll();
            //si el vertice que esta al principio de la cola es igual que v2, significa que has encontrado el camino(condicion de parada) 
			encontrado = v.equals(v2);

			if (!encontrado){
				for (V s : obtainAdjacents(v)){
                    //metes los vertices adyacentes en la cola y en la traza para luego sacarlos
                    if(!visitado.contains(s)){
                        cola.add(s);
                        traza.put(s, v);
                        visitado.add(s);
                    } 	
				}
			}
		}
        if(encontrado){
            // Añades V2, el vértice destino
            camino.add(v2);
            //Cuando v1 y v2 sean iguales has encontrado el camino mas corto
            while(v1 !=v2){
                camino.add(0,traza.get(v2));//empiezas a hacer el camino del reves, es decir, empezando por el ultimo vertice(el 4)
                // El método traza.get(v2) devuelve el siguiente vértice del camino
                v2 = traza.get(v2);
            }
            //devuelve el camino completo 
            return camino;
        }
        //si no encuentra el camino no devuelve nada 
         return null; 
    }
    
}        
    
