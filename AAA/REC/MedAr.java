import java.util.*;
import java.util.stream.*;

public class MedAr {
    public static double medIt(List<Double> array1){
       double sum=0;
        for(double num:array1){
            sum+=num;
        }
        return sum/array1.size();
    }
    public static double MedRec(List<Double> array1){
        if(array1.isEmpty()){
            return 0;
        }else{
           return array1.get(0) + MedRec(array1.subList(1, array1.size()));
        }
 
    }  
    public static double medRecAux(List<Double> array1){
        return MedRec(array1)/array1.size();
    }
    public static double MedLam(List<Double> array1){
        //DoubleStream stream = DoubleStream.of(array1);
        double r = array1.stream().reduce(0.0,(acumulador,elemento)-> acumulador + elemento)/array1.size();
        return r;
    }
    public static void main(String[] args ){
            List<Double> array1 = new ArrayList<>();
            for(double i=1;i<=10;i++){
                array1.add(i);
            }
            System.out.println(array1);
            System.out.println(medIt(array1));
            System.out.println(medRecAux(array1));
            System.out.println(MedLam(array1));
    }   
}
