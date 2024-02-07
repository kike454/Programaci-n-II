public class PotenciaRecursiva {
    public static int potencia (int n){
        int potencia=2;
        
        if(n==1){
            return potencia;//caso base, el parmetro permite devolver un resultado directo
        }
            else{
                return potencia*potencia(n-1);//llamda recur, si no cumple la condicion, se llmam recursivamente al metodo
                //valor parametro se modifica hasta que llegue al valor del caso base
                //lo que hace es 2*2*2*2*2*2*2*2*2*2. Multiplica el 2 10 veces


            }
        
    }
    public static void main(String[] args){
        int n=8;
        System.out.println(potencia(n));
    }
}
