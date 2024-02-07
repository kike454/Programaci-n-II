import java.util.*;
import java.util.stream.LongStream;
public class Prueba{
    
   
   public static void main(String[] args){ 
        
    int arr[] = {3, 1, 2, 5, 4};
         
    // pasar array al método sum
    sum(arr);
 
}

public static void sum(int[] arr) 
{
    // obtener suma de valores del array
    int sum = 0;
     
    for (int i = 0; i < arr.length; i++)
        sum+=arr[i];
     
    System.out.println("Suma de valores del array: " + sum);
}
}           
    

