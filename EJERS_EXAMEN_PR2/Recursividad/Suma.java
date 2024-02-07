import java.util.stream.IntStream;
import java.util.stream.*;

public class Suma {
    public static int SumaIt(int numero){
        int result=0;
        for(int i=1; i<=numero;i++){
            result +=i;
        }
        return result;
    }
    public static int SumaRecur(int numero){    
        //int res=0;
        if(numero==0){
            return 0;
        }else{
            return numero + SumaRecur(numero-1);
        }  
    }
    public static int Lambda(Integer numero){
        int res = IntStream.range(0,numero+1).sum();
       Integer res1 = IntStream.range(0,numero+1).reduce(0,(x,y)-> x +y);

        return res1;
    }
    public static void main(String[]args){
        System.out.println(SumaIt(8));
        System.out.println(SumaRecur(8));
        System.out.println(Lambda(8));
    }
}
