import java.util.stream.*;

public class SumaVarPar {
    
    public static int sumaPares(int num){
       int sum=0;
        for(int i=0;i<=num;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static int sumaParRec(int num){
        if(num==0){
            return 0;
        }else{
            if(num%2==0) return num + sumaParRec(num-1);
            else return sumaParRec(num-1);
        }
        
    }
    public static int sumaParLam(int num){
        Stream<Integer> iterate = Stream.iterate(0,x-> x+1);
        int res = iterate.limit(num).filter(p-> p%2==0).reduce(0,(acumulador,elemento)-> acumulador+elemento);
        return res;
    }
    public static void main(String[] args){
        System.out.println(sumaPares(9));
        System.out.println(sumaParRec(9));
        System.out.println(sumaParLam(9));
    }
}
