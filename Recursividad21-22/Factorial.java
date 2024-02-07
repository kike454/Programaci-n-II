public class Factorial {
    public static int factorialIterativo(int n){
        int sol =1;
        for(int i=1; i<=n;i++){
            sol *= i;
        }
        return sol;
    }
    public static int factorialRecursivo(int n){
        if(n==1){
            return 1;
        }else{
            return n * factorialRecursivo(n-1);
        }
    }
    public static void main(String[] args){
        System.out.println(factorialIterativo(5));
        System.out.println(factorialRecursivo(5));
    }
}
