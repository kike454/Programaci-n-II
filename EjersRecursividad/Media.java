import java.util.*;

public class Media {
    public static int mediaIt(ArrayList<Integer> lista){
        int suma=0;    
        for(int i=0;i<lista.size();i++){
                suma+= lista.get(i);
            }
            return suma/lista.size();
    }
    public static int mediaR(ArrayList<Integer> lista,int posicion){
            int resultado =0;
        if(posicion==0){
                return lista.get(posicion);
            }else{
                return resultado +=lista.get(posicion) + mediaR(lista, posicion-1);
            }
            
    }
    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(4);
        lista.add(8);
        lista.add(4);
        lista.add(8);
        int posicion = lista.size() -1;
        System.out.println("media it " + mediaIt(lista));
        System.out.println("media recur " + mediaR(lista, posicion)/lista.size());
    }
    
}
