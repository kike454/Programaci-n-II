import java.util.*;
public class obtenerListaPar {
    //dada una lista de eneteros,obtener otra con los numeros pares de la lista incial,
    //en el mismo orden y respetendo los elementos repetidos 
    public static ArrayList<Integer> listapar(ArrayList<Integer> lista){
        ArrayList<Integer> resultado = new ArrayList<>();//7array que contine los pares 
        if(lista.isEmpty()){
                return resultado;
            }else{
                int numero=lista.get(0);//almacenas numero 
                if(numero%2==0){
                    //resultado.add(numero);//lo añades al array resultado
                    lista.remove(0);//lo borras de la primera lista 
                     resultado = listapar(lista);//
                     resultado.add(numero);
                     return resultado;
                }else{
                    lista.remove(0);//el remove solo entiende de posiciones
                    return listapar(lista);

                }
            }
    }
    public static ArrayList<Integer> listaparNoDestructivo(ArrayList<Integer> lista){
        ArrayList<Integer> resultado = new ArrayList<>();//7array que contine los pares 
        if(lista.isEmpty()){
                return resultado;
            }else{
                int numero=lista.get(0);//almacenas numero 
                if(numero%2==0){
                    //resultado.add(numero);//lo añades al array resultado
                    lista.remove(0);
                     resultado = listaparNoDestructivo(lista);
                     resultado.add(numero);
                     
                     return resultado;
                }else{
                    lista.remove(0);//el remove solo entiende de posiciones
                        resultado = listaparNoDestructivo(lista);
                }
                lista.add(0,numero);//en la pos 0 añades el numero
                return resultado;
            }
    }
    public static void main(String[]args){
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(20);
        lista.add(20);
        lista.add(30);
        lista.add(4);
        lista.add(5);
        lista.add(5);
        lista.add(60);
       // System.out.println("obtener lista par " + listapar(lista));
        System.out.println("lista " + lista);
        System.out.println("obtener lista no destructiva " + listaparNoDestructivo(lista));
        System.out.println("lista 2 " + lista);
        

        
    }
}
