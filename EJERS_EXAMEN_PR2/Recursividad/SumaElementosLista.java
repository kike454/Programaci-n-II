import java.util.*;

public class SumaElementosLista {
    public static int sumaIt(List<Integer> array1){
        int resultado =0;
        for(int i: array1){
            int numero = array1.get(i);
            resultado += numero;
        }
        return resultado;
    }
    public static int sumaR(List<Integer>array1,int  posicion){
        if(posicion==0){
            return 0;
        }else{
           int number= array1.get(posicion);
            return  number + sumaR(array1,posicion-1);
        }
        //return 0;
    }
    public static int sumSub(List<Integer> array1){
        if(array1.isEmpty()){
            return 0;
        }else{
           // array1= array1.subList(1, array1.size());
            return array1.get(0) + sumSub(array1.subList(1, array1.size()));
        }
    }

    public static int sumaL(List<Integer>array1){
        int res = array1.stream().reduce(0,(acumulador,elemento) -> acumulador + elemento);
        return res;
    }
    public static void main(String[] args){
        List<Integer> array1 = new ArrayList<>();
        for(int i=0; i<=7;i++){
            array1.add(i);
        }
        System.out.println(sumaIt(array1));
        System.out.println(sumaR(array1, array1.size()-1));
        System.out.println(sumSub(array1));
        System.out.println(sumaL(array1));
    }
}
