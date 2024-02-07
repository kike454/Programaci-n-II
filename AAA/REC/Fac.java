import java.util.stream.*;

public class Fac {
    public static int factIt(int numero){
        int fact=1;
        for(int i=1;i<=numero;i++){
            fact*=i;
        }
        return fact;
    }
    public static int factRec(int numero){
        if(numero==0){
            return 1;
        }
        return numero * factRec(numero-1);
    }
    public static int factLam(int numero){
        Stream<Integer> iterateStr =  Stream.iterate(1,x -> x+1);
        int resul = iterateStr.limit(numero).reduce(1,(acumulador,elemento)-> acumulador*elemento );
        return resul;
    }
    public static void main(String[] args){
        System.out.println(factIt(8));
        System.out.println(factRec(8));
        System.out.println(factLam(8));
    }
}

