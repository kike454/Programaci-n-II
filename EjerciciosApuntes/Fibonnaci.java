//calcular fibonnaci de manera recursiva
import java.util.Scanner;
public class Fibonnaci{
    static int fibonnaci(int n){//lo que buscas, es el elemento 12 de la sucesion, porque fibbonnaci siempre empieza en 1
    if(n>1){
        return fibonnaci(n-1) + fibonnaci(n-2); //funcion recursiva,
    }
    else if(n==0){ //caso base
        return 0;
    }
    else if(n==1){ //caso base
        return 1;
    }
    else{ 
        System.out.println("Debes ingresar un numero mayor o igual a 1");
        return -1;
    }
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println("El elemento " + num + " de la serie de Fibonacci es: " + fibonnaci(num));

    }
}