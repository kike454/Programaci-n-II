import java.util.*;
import java.io.*;
public class lkk  {
  public  List<Integer> Iterativo(List<Integer> array1, List<Integer> array2){
    //quiero recorrer la lista y ver si la contiene
    List<Integer> arrayEsperado = new ArrayList();
    for(int i: array1){
        if(array2.contains(i))
         arrayEsperado.add(i);
         System.out.println("Resultado" + arrayEsperado);
    }
    return arrayEsperado;
   
}  
    public static void main(String[] args){   
      List<Integer> array1 = new ArrayList();
      List<Integer> array2 = new ArrayList();
      array1.addAll(Arrays.asList(1,2,3,4,2,6));
      array2.addAll(Arrays.asList(2,4,6));
      System.out.println("Resultado" + Iterativo(arrayEsperado));
  
    }  
    
}
        
    