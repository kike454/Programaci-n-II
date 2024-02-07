public class SumaEnesimo {
    //suma de 5: 0 + 1 +2 + 3 + 4 + 5
    public static int sumaIterativa(int num){
        int suma=0;   
        for(int i=0; i<=num;i++){
                //int suma=0;
                 suma +=i;
            }
            return suma;
    }
    public static int sumaRecursiva(int num){
        if(num==1){
            return 1;
        }else{
            return num + sumaRecursiva(num -1);//hasta que llegue a 1 no se sabe le valor de la llamda recuisva 
        }
    }

    public static void main(String[] args){
            System.out.println(sumaIterativa(5));
            System.out.println(sumaRecursiva(5));
    }
}
