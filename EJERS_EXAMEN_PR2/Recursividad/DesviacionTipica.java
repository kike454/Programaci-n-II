import java.util.*;
public class DesviacionTipica {
    public static double desvIt(List<Integer> array1){
        double sum=0;
        double media=0;
        int posicion =0;
        double sumaForm=0;
        for(int i: array1){
            sum+= i;
        }
        media =sum/array1.size();
        while(posicion< array1.size()){
         sumaForm +=   Math.pow(array1.get(posicion) - media,2);
         posicion++;
        }
        return Math.sqrt(sumaForm/array1.size());
    }
    public static double desvR(List<Integer> array1, int posicion){
       int sum =0;
        int media=0;
        if(posicion==0){
            return array1.get(posicion);  
        }else{
            return array1.get(posicion) + (desvR(array1, posicion-1));
        }
    }
   /* public static int desvSub(List<Integer> array1){
        if(array1.isEmpty()){
            return 0;
        }else{
            return array1.get(0) + desvSub(array1.subList(1, array1.size()));
        }
        return 0;
    }*/
    public static int desvLam(List<Integer> array1){
        return 0;
    }
    public static void main(String[] args){
        List<Integer> array1= new ArrayList<>();
        array1.add(9);
        array1.add(3);
        array1.add(8);
        array1.add(8);
        array1.add(9);
        array1.add(8);
        array1.add(9);
        array1.add(18);
        System.out.println(desvIt(array1));
        System.out.println(desvR(array1, array1.size()-1));
    }

}
