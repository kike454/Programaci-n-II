import java.util.*;
public class productoescalar {
    public static int producto2(ArrayList<Integer> lista1, ArrayList<Integer> lista2,int posicion){
        if(posicion == lista1.size() -1){//al ser de la misma dimension, con poner un caso base dale
            return lista1.get(posicion) * lista2.get(posicion);
        }else{
         int res = lista1.get(posicion) * lista2.get(posicion);
         posicion++;
         return res + producto2(lista1, lista2, posicion);

        }
    }
    public static int producto(ArrayList<Integer> lista1, ArrayList<Integer> lista2){
            if(lista1.isEmpty()){
                return 0;
            }else{
                if(lista2.isEmpty()){
                    return 0;
                }else{
                    int i = 0;//indice
                    int productoR =lista1.get(i) * lista2.get(i);//guardas el resultado del producto
                   lista1.remove(i);//los  eliminas hasta que la lista este vacia 
                   lista2.remove(i);
                    return productoR + producto(lista1,lista2);
                }
                
            }
    }
    public static void main(String[] args){
        
        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(20);
        lista1.add(20);
        lista1.add(30);
        
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(20);
        lista2.add(20);
        lista2.add(30);
        
        //System.out.println("producto escalar " + producto(lista1, lista2));
        System.out.println("producto esc 2 " + producto2(lista1, lista2, 0));

    }
}
