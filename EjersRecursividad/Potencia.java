
public class Potencia {
    public static int potR(int base, int exponente){
            if(exponente==0){
                return 1;
            }else{
                return base *potR(base, exponente-1);
            }

    }
    public static int potCont(int base, int exponente,int contador){
        if(exponente==0){
            return contador;
        }else{
            return contador *= base *  potCont(base, exponente-1, contador);
        }
    }
    public static int potI(int base, int exponente){
        int resultado=0;
        for(int i=1; i<=exponente;i++){
                resultado += base * base;
        }
        return resultado;
    }
    public static void main(String[] args){
        int contador=1;

        System.out.println("potencia it " + potI(2, 4));
        System.out.println("potencia recur " + potR(2, 4));
        System.out.println("potencia recur contador " + potCont(2, 4, contador));
    }
    
}
