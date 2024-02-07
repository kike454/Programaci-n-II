import java.util.stream.*;
public class Poten {
public static int PotenIt(int base, int exponente){
   int i=1;
   int res =1;
    while(i<=exponente){
        i++;
        res*=base;
    }
    return res;
}
public static int PotenRec(int base, int exponente){
    if(exponente==0){
        return 1;
    }
    return base * PotenRec(base, exponente-1);
}
public static int potenLam(int base, int exponente){
    Stream<Integer> iterateStream = Stream.iterate(1,x-> x+1);
    int result = iterateStream.limit(exponente).reduce(1,(acumulador,elemento)-> acumulador*base);
    return result;
}
    public static void main(String[] args){
        System.out.println(PotenIt(2, 6));
        System.out.println(PotenRec(2, 6));
        System.out.println(potenLam(2, 6));
    }
}
