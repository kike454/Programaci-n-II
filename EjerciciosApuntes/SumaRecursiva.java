//Ej: n=4, -> 4 +(1+2+3) -> 4+6=10.
public class SumaRecursiva {
    

    public static int suma(int n){ //sumatoria, suma consecutiva, 
        if (n == 1) { //caso base para que pare de sumar 0(1)

    return 1;
    }
    else{
    return n+suma(n-1); //O(n)
    }
    //return 1 + suma(n, m-1);

    }
    public static void main(String[] args){
        int  n=4;
        System.out.println(suma(n));
    }
}
