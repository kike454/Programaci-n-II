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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Graph<V> {

	private Map<V, Set<V>> adjacencyList = new HashMap<>();
/******************************************************************
* Añade el vértice ‘v‘ al grafo.
*
* @param v vértice a añadir.
* @return ‘true‘ si no estaba anteriormente y ‘false‘ en caso * contrario.
******************************************************************/
	public boolean addVertex(V v){
		if(!adjacencyList.containsKey(v)) {
			adjacencyList.put(v, new HashSet<V>());
			return true;
		}else return false;
		
		}
 /******************************************************************
* Añade un arco entre los vértices ‘v1‘ y ‘v2‘ al grafo. En
* caso de que no exista alguno de los vértices, lo añade
* también.
*
* @param v1 el origen del arco.
* @param v2 el destino del arco.
* @return ‘true‘ si no existía el arco y ‘false‘ en caso
contrario.
******************************************************************/
	public boolean addEdge(V v1, V v2) throws Exception{
//		if(!adjacencyList.containsKey(v1)) {
//			adjacencyList.put(v1, new HashSet<V>());
//		}
		addVertex(v1);//anades el value v1 para obtener sus adyacentes
//		if(!adjacencyList.containsKey(v2)) {
//			adjacencyList.put(v2, new HashSet<V>());
//		}
		addVertex(v2);//anandes el value v2 para obtener sus adyacentes
		
		Set <V> Vecinos1 = obtainAdjacents(v1);
		Set <V> Vecinos2 = obtainAdjacents(v2);
		
		
		if(Vecinos1.contains(v2)) { //si vecinos 1 contiene v2, devuelva false
			return false;
		}else {
			Vecinos1.add(v2);
			Vecinos2.add(v1);
			return true;//devuelve true si no existia el arco, y los añade
			}
		}
		/******************************************************************
* Obtiene el conjunto de vértices adyacentes a ‘v‘.
*
* @param v vértice del que se obtienen los adyacentes.
* @return conjunto de vértices adyacentes.
******************************************************************/
	public Set<V> obtainAdjacents(V v) throws Exception{
		
		return adjacencyList.get(v); //devuelve donde se almacena el conjunto de vertices y obtiene el conjunto de vertices adyacentes
		}
		/******************************************************************
* Comprueba si el grafo contiene el vértice dado.
*
* @param v vértice para el que se realiza la comprobación.
* @return ‘true‘ si ‘v‘ es un vértice del grafo.
******************************************************************/
	public boolean containsVertex(V v){
		return adjacencyList.containsKey(v); 
		}
	/******************************************************************
* Método ‘toString()‘ reescrito para la clase ‘Grafo.java‘.
* @return una cadena de caracteres con la lista de adyacencia
.
******************************************************************/
	@Override
	public String toString(){
	return  "" + adjacencyList; //no puedes devolver mapa, si abro comillas es un String
	}
	/******************************************************************
* Obtiene, en caso de que exista, un camino entre ‘v1‘ y ‘v2
‘. En
* caso contrario, devuelve ‘null‘.
*
* @param v1 el vértice origen.
* @param v2 el vértice destino.
* @return lista con la secuencia de vértices desde ‘v1‘ hasta
‘v2‘
* pasando por arcos del grafo.
******************************************************************/
	public List<V> onePath(V v1, V v2) throws Exception{
		List<V> path = new ArrayList<>();
		Stack<V> abierta = new Stack<>();
		V lastValue = null;
		V lastKey = null;//inicializadas a null, simplemente para incializar, para que no tengan valor
		int counter = 0;//incializas a 0 , en este grafo al  menos hay 2 adyacentes, el bucle for se recorre 3 veces, cuando las vueltas son impares, que guarde la key
		LinkedHashMap<V,V> traza = new LinkedHashMap<>();//utilizamos Linked HashMap porque inserta los elementos en funcion del orden de su inserccion
	
		boolean encontrado = false; //varibales
		abierta.push(v1);//metes en la pila el vertice
		traza.put(v1,null); //las claves, son los vertices, el value e de donde vienen
		traza.put(v1, null);//inicializas el primer vertice cuyo padre es null
		
		while(!abierta.isEmpty() && !encontrado) { //nunca va estar vacia la pila hasta el ultimo elemento, el v2,hasta que llegue al 4, que es el ultimo vertice
			V v = abierta.pop();//desapilas
			
			if(v.equals(v2)) encontrado = true; //si el vertice que tenemos ahora es el ultimo vertice, es decir  v2, el camino ya esta terminado
			if(!encontrado) { //mientras que v no sea igual el ultimo vertice, ejecuta el for
				for (V adjacent : obtainAdjacents(v)) { //recorrer los adyacentes del vertice que estamos analizando, que son 2, el 2 y el 5
					counter ++;
					//System.out.println(obtainAdjacents(v).size()+ " HERE");
						if(!(traza.containsKey(adjacent))) {
						abierta.push(adjacent);//anade el adyacente en la pila
						traza.put(adjacent, v);//anade el adyacente y su padre correspondiente
						if(traza.get(adjacent) == lastValue) {//si es el last value del camino 1,2 que hemos tomado anteriormente, que lo borre 
							traza.remove(lastKey);//si el ultimo value almacenado es igual al que esta recorriendo ahora, lo borra y sigue por el camino del 5
						}else lastValue = traza.get(adjacent);
						if(counter%2 ==1) { //counter mod 2= 1; cuando es impar te coge la ultima key, en la primera y la tercera vuelta del bucle for 
								lastKey = adjacent;//almacenamos las keys cuando counter es impar,quieres que vaya del 1 al 2, lo guarda, el valor que acaba de guardar es el mismo que el anterior valor, entonces cuando el for se recorra por segunda vez,  lo borra y pasa al camino del 4
						}
					}
						   
				}
				
					}
		}
		if(encontrado) {
			for(Map.Entry<V,V> entry : traza.entrySet()) { //for que recorre el linkedHashMap traza
				path.add(entry.getKey());
				
			}
			//System.out.println(path);
		}else return null;
		
		return path; 
	}
		

}
