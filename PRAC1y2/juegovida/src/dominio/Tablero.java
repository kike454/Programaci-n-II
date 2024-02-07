import java.util.*;
import java.io.*;
    
/**
* Esta clase es responsable de leer el tablero de un
* fichero en forma de ceros y unos, ir transitando de
* estados e ir mostrando dichos estados.
*/
public class Tablero{
private static int DIMENSION = 30;
private int[][] estadoActual; //matriz que representa el
// estado actual.
private int[][] estadoSiguiente = new int[DIMENSION][DIMENSION]; // Matriz que
// representa el
// estado
// siguiente.
/********************************************************
* Lee el estado inicial de un fichero llamado ‘matriz‘.
********************************************************/
public void leerEstadoActual(){
    estadoActual= new int [DIMENSION] [DIMENSION];//le asiganas diemnsion al estadoActual, por esto arriba esta incializado sin nada, 
    String nombreFichero = "matriz.txt"; //creamos el nombre del fichero que nos dice el enunciado
   try{//que intente crear el fichero y posteriormente leer las filas y las columnas de la matriz
    File fichero = new File(nombreFichero);//creamos el fichero con el nombre
    Scanner sc = new Scanner(fichero);//creamos un scanner que lea el file donde se alamcena las celulas que vamos leyendo
    while(sc.hasNextLine()){ //mientras que haya una linea mas que leer, que siga leyendo
            for(int x = 0; x<DIMENSION; x++){//que lea la primera linea
                String str = sc.nextLine();//que lea la siguiente linea,rellenas la matriz del estado actual, caracter a caracter
                //fila por fila
                    for(int y=0; y<DIMENSION;y++){
                        estadoActual = Integer.parseInt(String.valueOf(str.charAt(y)));//pa leer columnas
                    }
                
                }
                }     
    }catch(IOException e){
        System.out.println("Hay problemas al leer el fichero" + nombreFichero);
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
    estadoActual = new int[DIMENSION][DIMENSION];
		//Para cada casilla en la matriz estado actual generamos un número aleatorio entre 0 y 1,
		//si es menor que 0.5 valdrá 1, si es mayor valdrá 0.
		for(int x = 0; x < DIMENSION; x++){
			for(int y = 0; y < DIMENSION; y++)
				estadoActual[x][y] = (Math.random() < 0.5)? 1 : 0;//genera numero menor que 0.5, entonces la celda esta viva,1
		}//si no esta muerta, que es 0
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
    int valor = 0;
		for(int i = 0; i < DIMENSION; i++){
			for(int j = 0; j < DIMENSION; j++){
				if(x == 0){//si en el eje x esta en la primera celda
					if(y == 0){//y si en eje y esta tambien en la primera celda
						valor = estadoActual[x][y+1] + estadoActual[x+1][y] + estadoActual[x+1][y+1];
					}else if(y == 29){
						valor = estadoActual[x][y-1] + estadoActual[x+1][y] + estadoActual[x+1][y-1];
					}else{
						valor = estadoActual[x][y-1] + estadoActual[x][y+1] + estadoActual[x+1][y-1] + 
							estadoActual[x+1][y] + estadoActual[x+1][y+1];
					}
				}else if(i == 29){
					if(j == 0){
						valor = estadoActual[i][j+1] + estadoActual[i-1][j] + estadoActual[i-1][j+1];
					}else if(j == 29){
						valor = estadoActual[i][j-1] + estadoActual[i-1][j] + estadoActual[i-1][j-1];
					}else{
						valor = estadoActual[i-1][j-1] + estadoActual[i-1][j] + estadoActual[i-1][j+1] + 
							estadoActual[i][j-1] + estadoActual[i][j+1];
					}
				}else if(j == 0){
					valor = estadoActual[i-1][j] + estadoActual[i-1][j+1] + estadoActual[i][j+1] +
						estadoActual[i+1][j] + estadoActual[i+1][j+1];
				}else if(j == 29){
					valor = estadoActual[i-1][j-1] + estadoActual[i-1][j] + estadoActual[i][j-1] + 
						estadoActual[i+1][j-1] + estadoActual[i+1][j];
				}else{
					valor = estadoActual[i-1][j-1] + estadoActual[i-1][j] + estadoActual[i-1][j+1] + 
						estadoActual[i][j-1] + estadoActual[i][j+1] +
						estadoActual[i+1][j-1] + estadoActual[i+1][j] + estadoActual[i+1][j+1];
				}



				if(estadoActual[i][j] == 1){
					estadoSiguiente[i][j] = (valor == 2 || valor == 3)? 1 : 0;
				}else if(estadoActual[i][j] == 0)
					estadoSiguiente[i][j] = (valor == 3)? 1 : 0;
			}
		}
		for(int i = 0; i < DIMENSION; i++)
			for(int j = 0; j < DIMENSION; j++)
				estadoActual[i][j] = estadoSiguiente[i][j];
		//estadoActual = estadoSiguiente;
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


