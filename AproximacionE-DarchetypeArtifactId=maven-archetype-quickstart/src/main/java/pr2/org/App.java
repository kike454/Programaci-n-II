package pr2.org;
import java.util.stream.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static int factIt(int numero){
        int fact=1;
        for(int i=1;i<=numero;i++){
            fact*=i;
        }
        return fact;
    }
    public static double PotenIt(double base, int exponente){
        int i=1;
        double res =1;
         while(i<=exponente){
             i++;
             res*=base;
         }
         return res;
     }// el exponete de e^x lo elevas al nuemro de iteraciones del sumatorio /entre el factorial 
     //del nuemro de las iteraciones del sumatorio
     public static double aproxIt(double x,int limiteSumatorio){
        double sumatorio=0;
            for(int i=0;i<=limiteSumatorio;i++){
                sumatorio+=(PotenIt(x, i)/factIt(i));
            }
        return sumatorio;
     }

    public static int factRec(int numero){
        if(numero==0){
            return 1;
        }
        return numero * factRec(numero-1);
    }
    public static double PotenRec(double base, int exponente){
        if(exponente==0){
            return 1;
        }
        return base * PotenRec(base, exponente-1);
    }
    public static double aproxRec(double x ,int limiteSumatorio){
            if(limiteSumatorio<=0){
                return 1.0;//
            }else{
                return (PotenRec(x, limiteSumatorio)/factRec(limiteSumatorio)) + aproxRec(x,limiteSumatorio-1);
            }
        //return 0;
    }
    public static int factLam(int numero){
        Stream<Integer> iterateStr =  Stream.iterate(1,x -> x+1);
        int resul = iterateStr.limit(numero).reduce(1,(acumulador,elemento)-> acumulador*elemento );
        return resul;
    }
    
     public static double potenLam(double base, int exponente){
         Stream<Double> iterateStream = Stream.iterate(1.0,z-> z+1);
         double result = iterateStream.limit(exponente).reduce(1.0,(acumulador,elemento)-> acumulador*base);
         return result;
     }
      public static double aproxlam(double x,int limiteSumatorio){
         Stream<Integer> iterate = Stream.iterate(0,y-> y+1);
         double sumatorioLam= iterate.limit(limiteSumatorio+1).map(p-> potenLam(x,  p)/factLam(p)).reduce(0.0,(acumulador,elemento)-> acumulador + elemento);
         return sumatorioLam;
     }
}
