public class PotenciaEnesima {
    public static int potenciaIterativa(int base, int exponente){
        int resul =1;   
        for(int i=1; i<= exponente;i++){
                resul*=base;
            }
            return resul;
    }
    public static int potenciaRecursiva(int base, int exponente){
          
        if(exponente==0){
                return 1;
            }else{
                //System.out.println(potenciaRecursiva(base, exponente));
                return base  * potenciaRecursiva(base, exponente-1);
               
            }
    }
    public static void main(String[] args){
        System.out.println(potenciaIterativa(2, 6));
        System.out.println(potenciaRecursiva(2, 6));
    }
}
