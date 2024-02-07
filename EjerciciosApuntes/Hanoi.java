import java.util.*;
public class Hanoi{      //si introduces 4 discos, tendra que hacer 2^4 -1 movimientos  
    /*
        Entrada: Tres pilas de numeros origen, auxiliar, destino, con la pila origen ordenada
        Salida: La pila destino

        1. si origen==0 entonces terminar
        2. si no 
            2.1 mover todas las fichas menos la mas grande (n) a la varilla auxiliar
        3. mover la ficha grande hasta la varilla final
        4. mover todas las fichas restantes, 1...nâ€“1, encima de la ficha grande (n)
        5. terminar
    */
    public static void torresHanoi(int disco, char torre1, char torre2, char torre3){
        
        // Caso Base
        if (disco==0) return;//si el numero de discos es igual a 0, que pare
        else {
         
            // Llamamos a la funcion de tal forma que decrementamos el numero de discos, y seguimos el algoritmo
            // (origen, destino, auxiliar)
            torresHanoi(disco - 1, torre1, torre3, torre2);
            System.out.println("Mover disco de Torre " + torre1 + " a Torre " + torre3);
            // En esta ocasion siguiendo el algoritmo hacemos lo siguiente
            // (auxiliar, origen, destino)
            torresHanoi(disco - 1, torre2, torre1, torre3);
        }
     
    }

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero de discos: ");
        int num = sc.nextInt();
        torresHanoi(num, 'A', 'B', 'C');
    }

}

