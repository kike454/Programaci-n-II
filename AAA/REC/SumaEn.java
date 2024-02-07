import java.util.stream.*;

public class SumaEn {
    public static int sumaIt(int numero){
        int sum=0;
        for(int i=0;i<=numero;i++){
            sum+=i;
        }
        return sum;
    }
    public static int sumRec(int numero){
      
        if(numero==0){
            return 0;
        }else{
            return numero + sumRec(numero-1);
        }

    }
    public static int sumLam(int numero){
        Stream<Integer> iterateStream = Stream.iterate(0, x -> x + 1);
        int res = iterateStream.limit(numero+1).reduce(0,(acumulador,elemento)-> acumulador+elemento);
        return res;
    }
    public static void main(String[] args){
        System.out.println("Suma Enesima It" + sumaIt(8));
        System.out.println("Suma Enesima Recur" + sumRec(8));
        System.out.println("Suma Enesima Lam" + sumLam(8));
    }
}
