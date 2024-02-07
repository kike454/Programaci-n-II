package dominio;
import java.util.*;
/**
* Esta clase es responsable de leer el tablero de un
* fichero en forma de ceros y unos, ir transitando de
* estados e ir mostrando dichos estados.
*/
public class Tablero{
private static int DIMENSION = 30;//especificas que le tablero es de 30x30
private int[][] estadoActual; //matriz que representa el estado actual
private int[][] estadoSiguiente = new int[DIMENSION][DIMENSION];  //30x30
// Matriz que representa el
// estado
// siguiente.
/********************************************************
* Lee el estado inicial de un fichero llamado ‘matriz‘.
********************************************************/
public void leerEstadoActual(){
Scanner fichero = new Scanner(new File("matriz")); //lee el estado inicial del File matriz
//for(int x=0; x< DIMENSION; x++){//lees el estado siguiente que se llama dimension,lee las filas, el eje x
    String fila = fichero.nextLine();
   // for(int y=0; y< DIMENSION; y++){//lee las columnas, el eje y
     //   estadoActual[x+1][y+1] =Integer.parseInt(String.valueOf(fila.charAt(y)));//que devuelva un int despues de haber
        //obtenido el valor string de la columna 
        //charAt de String devuelve el caracter en el indice especificado en una cadena, basicamente,
        // devuelve la celula en su posicion correspondiente
   // }

//}
for(int x=0; x<DIMENSION +1; x++){//lo que haces es comprobar si la celula que esta en la posicion 29, en la 30 puede tener vecinaViva
    for(int y=0; y<DIMENSION+1; y++){
         int vecinasVivas = estadoActual[x-1][y+1] + estadoActual[x][y+1] + estadoActual[x+1][y+1] + estadoActual[x +1][y] +
         estadoActual[x+1][y-1] + estadoActual[x][y -1] + estadoActual[x-1][y-1] + estadoActual[x-1][y] ;//recorrer las celulas que 
         //tienes alrededor de la celula que estas comprobando en cada momento
        if (estadoActual[x][y]==1 && (vecinasVivas==2 || vecinasVivas==3)){
            estadoSiguiente[x][y] =1;//si la celula esta viva y tiene 2 o 3 vecinas vivas, esta viva en el estadoSiguiente
        
        }else if(estadoActual[x][y] == 0 && (vecinasVivas==3)){
            estadoSiguiente[x][y] = 1;//si la celula esta muerta y tiene 3 vecinas vivas, pasa a estar viva en el estadoSiguiente
        }else{
            estadoSiguiente[x][y] = 0;//si no cumple ninguno de los dos requisitos anteriores, en el estadoSiguiente esta muerta
        }
    }

}
}
// La secuencia de ceros y unos del fichero es guardada
// en ‘estadoActual‘ y, utilizando las reglas del juego
// de la vida, se insertan los ceros y unos
// correspondientes en ‘estadoSiguiente‘.
/********************************************************
* Genera un estado inicial aleatorio. Para cada celda
* genera un número aleatorio en el intervalo [0, 1). Si
* el número es menor que 0,5, entonces la celda está
* inicialmente viva. En caso contrario, está muerta.
*******************************************************/
public void generarEstadoActualPorMontecarlo(){


}
// La secuencia de ceros y unos generada es guardada
// en ‘estadoActual‘ y, utilizando las reglas del juego
// de la vida, se insertan los ceros y unos
// correspondientes en ‘estadoSiguiente‘.
/********************************************************
* Transita al estado siguiente según las reglas del
* juego de la vida.
********************************************************/
public void transitarAlEstadoSiguiente(){


}
// La variable ‘estadoActual‘ pasa a tener el contenido
// de ‘estadoSiguiente‘ y, éste útimo atributo pasar a
// reflejar el siguiente estado.
/*******************************************************
* Devuelve, en modo texto, el estado actual.
* @return el estado actual.
*******************************************************/
@Override
public String toString(){
return ""; // Esta línea hay que modificarla.
}
}
