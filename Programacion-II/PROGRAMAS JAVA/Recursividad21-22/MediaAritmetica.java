import java.util.ArrayList;

public class MediaAritmetica {
    public static int mediaIt(ArrayList<Integer> lista){
        int result=0;  
        for(int i=0; i< lista.size();i++){
                
            result+=lista.get(i);

            }
            return result/lista.size();
    }
    public static float mediaRecur(ArrayList<Integer> lista, int posicion){
        //int posicion = lista.size() -1;
        //int res=0;
        if(posicion == -1){
            return 0;
        }else{
           // posicion--;
           if(posicion == lista.size() -1){
            return (lista.get(posicion) + mediaRecur(lista,posicion-1))/(lista.size());//hasta que mediaRecur no se termine de ejecutar, no hace la division,es decir, hasta que se sumen todos los elemento sde la lista 
           }else{
            return lista.get(posicion) + mediaRecur(lista,posicion-1);
           }
           //return lista.get(posicion) + mediaRecur(lista,posicion-1);
            
        }
    }
       public static float mediaRemove(ArrayList<Integer> lista, float tamano){
        //int divisor=lista.size();  
        if(lista.isEmpty()){
                return 0;
            }else{
                int num=lista.get(0);
                lista.remove(0);
                System.out.println("*******" + num/tamano);
                return (num/tamano) + mediaRemove(lista,tamano);
            }
        }
       
    
    public static void main(String[] args){
        
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(20);
        lista.add(30);
        lista.add(4);
        lista.add(5);
        lista.add(60);
        int posicion = lista.size() -1;
        System.out.println(mediaIt(lista));
        System.out.println(lista);
       System.out.println(mediaRecur(lista,posicion));
       System.out.println(mediaRemove(lista, 6));
        System.out.println(lista);
    }
}

