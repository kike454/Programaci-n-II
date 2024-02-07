import java.util.*;

public class SumElList {
        public static int sumIt(List<Integer> array1){
            int sum=0;   
            for(int e: array1){
                sum+=e;
                }
            return sum;
        }
        public static int sumRec(List<Integer> array1){
                if(array1.isEmpty()){
                    return 0;
                }else{
                    return array1.get(0) + sumRec(array1.subList(1, array1.size()));
                }
           // return 9;
        }
        public static int sumLam(List<Integer> array1){
            int res= array1.stream().reduce(0,(acumulador,elemento)-> acumulador+elemento);
            return res;
        }    
    public static void main(String[] args){
        List<Integer> array1 =  new ArrayList<>();
        for(int i=1;i<=9;i++){
            array1.add(i);
        }
        System.out.println(sumIt(array1));
        System.out.println(sumRec(array1));
        System.out.println(sumLam(array1));
    }
}
