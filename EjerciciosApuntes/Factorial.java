import java.util.Scanner;
//n!, 4!=4*3*2*1
public class Factorial{
   
    

    public static int factorial(int n){
        
        if(n==1){ //caso base, si es igual a 1, que devuelva 1 y acabe, los parametros de entrada deben devolver un resultado directo
            return 1;

        }
        else{
            return n*factorial(n-1);//si no cumple la condicion, se llama recursivamente al metodo /lo que hace el ordena es=
            // 10*9*8*7*6*5*4*3*2*1
            //El valor del parametro ha de modicicarse hasta que  se aproxime hasta alcanza el valor del caso base

        }

    }
    public static void  main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = sc.nextInt();
        sc.close();
         
        System.out.println("El factorial de " + num + " es: " + factorial(num));
    }
}

