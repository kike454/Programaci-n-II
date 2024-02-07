
public class SumaEnesimo {
    //suma iterativa
    public static int sum(int x, int resultado){
                for(int i=0; i<=x;i++){
                    resultado += i;
                }
                return resultado;
            }
    public static int sumR(int y){
            if(y==1){
                    return 1;
            }else{
                return y + sumR(y-1);
            }
            }
    public static int sumCont(int n, int contador){
            if(n == 0){
                return contador;
            }else{
                return contador += n + sumCont(n-1, contador);
            }
        }
            public static void main(String[] args){
                int resultado=0;
                int contador=0;
                System.out.println("suma it " + sum(4,resultado));
                System.out.println("suma recur " + sumR(4));
                System.out.println("suma recur cont" + sumCont(4, contador));
            }
    
    }
    
    

