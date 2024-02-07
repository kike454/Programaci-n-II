public class Factorial {


    /** 
    public static int factIt(int n,int resultado){
        for(int i=1; i<=n;i++){
                resultado *= i;
        }
        return resultado;
     } 
    */
   /**  public static int factR(int x){
        if(x==1){
            return 1;
        }else{
            return x * factR(x-1);
        }
    } */
    public static int factCont(int y, int contador){
        if(y==1){
            return contador;
        }else{
            return contador * y * factCont(y-1, contador);

        }
    }
    public static  int facto(int num, int resultadoParcial){
        //resultadoParcial = 1;
        if(num==1){
            return resultadoParcial;
        }else{
            return facto(num-1,resultadoParcial*num);
        }
    }
    //fact(4,1) -> facto(3,4), -> facto(2,12), -> facto(1,24)
    
    public static void main(String[] args){
        int resultado =1;
        int contador=1;
        //System.out.println("fact it " + factIt(4, resultado));
        //System.out.println("fact recur " + factR(4));
        System.out.println("fact recur contador " + factCont(3, 4) );
        System.out.println(facto(4,1));

    }
}
