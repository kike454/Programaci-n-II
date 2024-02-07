import java.util.stream.IntStream;

public class SumaPar1 {
    public static int sumparIt(int n){
        int sum=0;
        for(int i=0; i<=n;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        return sum;
    }
    public static int sumaparR(int n){
       // int aux = n;
        //int sum =0;
        if(n==2){
            return 2;
        }else{
            if(n%2==0)
                return n + sumaparR(n-2);
              else return sumaparR(n-1);
        }
    }
    public static int sumaparL(int n){
        int r = IntStream.range(1,n).filter(p-> p%2==0).sum();
        return r;
    }
    public static void main(String[] args){
        System.out.println(sumparIt(9));
        System.out.println(sumaparR(9));
        System.out.println(sumaparL(9));
    }


}
