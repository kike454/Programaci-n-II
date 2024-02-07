import java.util.*;

public class Criba {
   
   public static int criba(boolean m[], int tam){
        m[0] = false;
        m[1] = false;
        for(int i = 2; i <= tam; i++) 
            m[i] = true;
    
        for(int i = 2; i*i <= tam; i++) {//iteracione sneceasarias 
                System.out.println("priemr for " + i );
            if(m[i]) {
                for(int h = 2; i*h <= tam; h++){//en rojo
                System.out.println("no primo" + i*h);
                    m[i*h] = false;
            }
        }
        }
        return 0;
    }
    public static void main(String[] args){
    boolean[] array1 = new boolean[50];
        System.out.println(criba(array1, 49));
    }
    
}