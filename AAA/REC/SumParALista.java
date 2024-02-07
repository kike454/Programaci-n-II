import java.util.*;
import java.util.stream.Collectors;

public class SumParALista {
    
    public static List<Integer> sumIter(List<Integer> array1){
       List<Integer> resul = new ArrayList<>();
        for(int i:array1){
            if(i%2==0){// 0(1)
                resul.add(i);//O(1/2)
            }
        }
        return resul;
    }
    public static List<Integer> sumRec(List<Integer> array1){
       List<Integer> expected = new ArrayList<>();
        if(array1.isEmpty()){
            return expected;
        }else{
            if(array1.get(0)%2==0){//O(1)
                expected.add(array1.get(0));//0(1/2) estamicacion, caso peor(O(1))
              return sumIter(array1.subList(1, array1.size()));//O(N)
            }
            else return sumRec(array1.subList(1, array1.size()));//O(N)
        }//N1er sub o N2ndo sub:N + 1= 2N +1
    }
    public static List<Integer> sumLam(List<Integer> array1){
        List<Integer>  res = array1.stream().filter(p->p%2==0).collect(Collectors.toList());
        return res;
    }
    public static void main(String[] args){
        List<Integer> array1=new ArrayList<>();
        for(int i=0;i<=10;i++){
            array1.add(i);
        }
        array1.add(4);
        System.out.println(sumIter(array1));
        System.out.println(sumRec(array1));
        System.out.println(sumLam(array1));
    }
}
