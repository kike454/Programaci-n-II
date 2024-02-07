/*Copyright [2022] [ENRIQUE COLLADO MUÑOZ]
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing,
import java.util.ArrayList;software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
either express or implied. See the License for the specific
language governing permissions and limitations under the
License.*/

import java.util.*;
/**
 * @author Enrique Collado
 */
public class DistanciaEdicion {
    /**
* Calcula la distancia de edición, tal y como la expone
* Jurafsky entre las cadenas ` s1` y ` s2`.
*@param patron primer string a analizar
*@param cadena segundo string a analizar
*@return devuelve el último elemento del array bidimensional, es decir, su distancia 
*/
public static int calcularDistancia(String patron, String cadena){
    int saltoDiagonal=0;
    int min=0;
    int[][] Distancia = new int[patron.length() +1][cadena.length() +1];// quieres coger a partir del uno
     //inicializamos el array con la longitud de los strings
   for(int i=0; i<= patron.length() ; i++){ //columnas
        Distancia[i][0] = i;
   }
   for(int j=0; j <= cadena.length();j++){//filas
        Distancia[0][j] = j; 
   }
   //anidamos los for para recorrer el array bidimensional
   for(int x =1; x <= patron.length()  ;x++){
       for(int y =1; y <= cadena.length() ;y++){
            if(Distancia[x-1][y] < Distancia[x][y-1] ){
              min=   Distancia[x-1][y] +1 ; //minimo entre los 2 de las esquinas
            }
            else{
                min = Distancia[x][y-1] + 1;
            }
            if(patron.charAt(x-1)  != cadena.charAt(y-1)){
                    saltoDiagonal=  2;   
            }
           if(patron.charAt(x-1) ==cadena.charAt(y-1)){
                saltoDiagonal =0;
            }
            
            if((Distancia[x-1][y-1] + saltoDiagonal) < min){
                min = Distancia[x-1][y-1] + saltoDiagonal;
            }
            Distancia[x][y] = min;
       }
   }
   //imprimimos matriz 
   for(int p=0; p<=patron.length();p++){
        for(int z =0; z<=cadena.length();z++){
            System.out.print(Distancia[p][z]  + " ");
        }
        System.out.println("");
   }
   //System.out.println("Antes del retorno: " + Distancia[patron.length()][cadena.length()]);
    return Distancia[patron.length() ][cadena.length() ]; 
    }
    public static void main(String[] args){
     //int input = calcularDistancia("Papa",  "Mama");
     //int input = calcularDistancia("tele",  "television");
    // int input = calcularDistancia("igual",  "igual");
    // int input = calcularDistancia("coco",  "loco");
     int input = calcularDistancia("intention",  "execution");
    System.out.println("Distancia Edicion :" + input);
    }
}
