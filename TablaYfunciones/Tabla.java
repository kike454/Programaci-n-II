import java.util.*;
import java.util.stream.*;

public class Tabla {
    //static int mayor = 0;
    public static ArrayList<Integer> dimension(ArrayList<Integer> array){
    
     for(int i= 0; i<10;i++){
        array.add((int)(Math.random() * 50));
        System.out.println(array.get(i));
     }
        return array;
    }
    public static int mayorTabla(ArrayList<Integer> array){
        int mayor = 0;
        for(int i=0; i<array.size();i++){
            if(array.get(i) > mayor){
                mayor = array.get(i);
            }
        }
        return mayor; 
    }
    public static void main(String[] args){
        
        
        System.out.print(mayorTabla(dimension(new ArrayList<Integer>())));
      // int res = mayorTabla(array);
       //System.out.println(mayor);
    }
}
