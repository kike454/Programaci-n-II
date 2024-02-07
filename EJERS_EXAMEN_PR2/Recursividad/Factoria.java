import java.util.stream.IntStream;

public class Factoria {
    public static int fact(int n){
       int resul=1;
        for(int i=1; i<=n;i++){
            resul *= i;
        }
        return resul;
    }
    public static int factR(int n){
        if(n==1){
            return 1;
        }else{
            return n * factR(n-1);
        }
    }
    public static Integer factL(int n){
        Integer fin = IntStream.range(1, n+1).reduce(1,(x,y)-> x*y);
        return fin;
    }
    public static void main(String[] args){
        System.out.println(fact(5));
        System.out.println(factR(5));
        System.out.println(factL(5));
    }
}
