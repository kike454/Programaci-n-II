import java.util.ArrayList;
import java.util.List;

public class SumaParLista1 {
    public static int sumIt(List<Integer> array1){
        int sum =0;
        for(int i=0;i<array1.size();i++){
            if(array1.get(i)%2==0){
                sum+=array1.get(i);
            }   
        }
        return sum;
    }
    public static int sumR(List<Integer> array1, int posicion){
        //int posicion = array1.size()-1;
        if(posicion==0){
            return array1.get(posicion);
        }else{
            if(array1.get(posicion)%2==0)
            return array1.get(posicion) + sumR(array1, posicion-1);
            else return sumR(array1,posicion-1);
        }
    }
    public static int subl(List<Integer> array1){
        if(array1.isEmpty()){
            return 0;
        }else{
            if(array1.get(0)%2==0) return array1.get(0)+ subl(array1.subList(1, array1.size()));
            else return subl(array1.subList(1, array1.size()));
        }
    }
    public static int sumL(List<Integer> array1){
        int res = array1.stream().filter(p-> p%2==0).reduce(0,(acumulador,elemento)-> acumulador + elemento);
        return res;
    }
    public static void main(String[] args){
        List<Integer> array1 = new ArrayList<>();
        for(int i=0;i<=10;i++){
            array1.add(i);
        }
        System.out.println(sumIt(array1));
        System.out.println(sumR(array1,array1.size()-1));
        System.out.println(subl(array1));
        System.out.println(sumL(array1));
    }
}
