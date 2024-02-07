import java.util.ArrayList;
import java.util.*;
import java.util.stream.*;
public class MediaListaNumeros {
    public static int mediaIt(List<Integer> array1){
        int resul=0;
        for(int num:array1){
            resul+=num;
        }
        return resul/array1.size();
    }
    public static int mediaR(List<Integer> array1, int posicion){
      int n = array1.get(posicion);
      if(posicion==-1){
          return n;
      }
        if(posicion ==0){
            return n;
        }else{
            return n+ mediaR(array1, posicion-1);
        }
    }
    public static int mediaSub(List<Integer> array1){
        //int n= array1.get(0);
        if(array1.isEmpty()){
            return 0;
        }else{
            return (array1.get(0) + mediaSub(array1.subList(1, array1.size())))/array1.size();
        }
        //return 0;
    }
    public static int mediaL(List<Integer> array1){
        int r = array1.stream().reduce(0,(acumulador,elemento)-> acumulador+ elemento)/array1.size();

        return r;
    }
    public static void main(String[] args){
        List<Integer> array1 = new ArrayList<>();
        array1.add(2);
        array1.add(4);
        array1.add(6);
        array1.add(8);
        System.out.println(mediaIt(array1));
        System.out.println(mediaR(array1, array1.size()-1));
        System.out.println(mediaSub(array1));
        System.out.println(mediaL(array1));
        
    }
}
