import java.util.stream.IntStream;
import java.util.stream.DoubleStream;
import java.util.stream.*;


public class Potencia {
    public static int pot(int base, int exponente){
        int resul=1;
        for(int i=1; i<=exponente;i++){
           resul= resul*base;
        }
        return resul;
    }
    public static int potR(int base, int exponente){
        if(exponente==0){
            return 1;
        }else{
            return  base * potR(base,exponente-1);
        }
    }
    public static Integer potL(int base, int exponente){
        Stream<Integer> iterateStream = Stream.iterate(0, x -> x + 1);
       Integer r = iterateStream.limit(exponente).reduce(0,(acumulador,elemento) -> base*base);
    //Integer r =  IntStream.range(1, exponente+1).reduce(0,(aumulador,elemento)-> base * base);
        return r;
    }
    public static void main(String[] args){
        System.out.println(pot(2,4));
        System.out.println(potR(2,4));
        System.out.println(potL(2,4));
    }
}
