import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class DesvTip {
    
    public static double dessvIt(List<Integer> array1){
        int sum=0;
        int media =0;
        double numerador=0;
        for(int i:array1){
            sum+=i;
        }
        media = sum/array1.size();

        for(int e:array1){
            numerador += Math.pow(e-media,2);
        }
        return Math.sqrt(numerador/array1.size());
    }
   /*  public static double mediaR(List<Integer> array1){
       double suma=0;
        if(array1.isEmpty()){
            return 0;
        }else{
            suma = array1.get(0) + mediaR(array1.subList(1, array1.size()));
           
        }
        return suma/array1.size();
       
    }*/
    public static double MediaLam(List<Integer> array1){
        int med = array1.stream().reduce(0,(acumulador,elemento)-> acumulador+elemento)/array1.size();
        return (double)med;
    }
    public static double desvRec(List<Integer> array1,double media){
        //double element=array1.get(0);  
        
        if(array1.isEmpty()){
                return 0;
            }else{
                return Math.pow(array1.get(0)-media,2) + desvRec(array1.subList(1, array1.size()),media);       
            }
            
    }
    public static double desvRecAux(List<Integer> array1){
        return Math.sqrt(desvRec(array1,MediaLam(array1))/array1.size());
    }
    public static double DesvLam(List<Integer> array1){
        double resul= Math.sqrt(array1.stream().mapToDouble(x -> Math.pow(x-MediaLam(array1),2)).reduce(0.0,(acumulador,elemento)-> acumulador+elemento)/array1.size());
        return resul;
    }
    public static void main(String[] args){
        List<Integer> array1 = new ArrayList<>();
        array1.add(9);
        array1.add(3);
        array1.add(8);
        array1.add(8);
        array1.add(9);
        array1.add(8);
        array1.add(9);
        array1.add(18);
        System.out.println(dessvIt(array1));
        //System.out.println(mediaR(array1));
        System.out.println(MediaLam(array1));
       // System.out.println(desvRec(array1));
        System.out.println(desvRecAux(array1));
        System.out.println(DesvLam(array1));
    
    }
}
