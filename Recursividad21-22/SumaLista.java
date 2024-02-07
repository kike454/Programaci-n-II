import java.util.*;
public class SumaLista {
    public static int sumaIt(ArrayList<Integer> lista){
        int result=0;   
        for(int i=0; i< lista.size();i++){
                result+=lista.get(i);
            }
            return result;
    }
    public static int sumaRecur(ArrayList<Integer> lista){
        int numero =lista.get(0);
        if(numero == lista.get(lista.size()-1)) {
            return lista.get(0);

        }else{
            lista.remove(0);
            return numero + sumaRecur(lista);
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(20);
        lista.add(30);
        lista.add(4);
        lista.add(5);
        lista.add(50);
        System.out.println(sumaIt(lista));
        System.out.println(lista);
        System.out.println(sumaRecur(lista));
        System.out.println(lista);
    }
}
