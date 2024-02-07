import java.util.*;
public class SumaElementosArrays {
    
   
    static int suma =0;
    static ArrayList<Integer> array1 = new ArrayList<>();
    public static int sumaElementos(ArrayList<Integer> array1){
        array1.add(5);
        array1.add(6);
        array1.add(4);
        if(array1.isEmpty()){
            return 0;
        }else{    
            }
            return  suma += array1.remove(0) + sumaElementos(array1);
        }
        public static void main(String[] args){
            System.out.println(suma);
        }
        
    }
    

