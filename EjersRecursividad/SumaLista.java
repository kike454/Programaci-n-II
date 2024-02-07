import java.util.*;

public class SumaLista {
    public static int sumaIt(ArrayList<Integer> array1 ){
        int resultado=0;
        for(int i=0;i<array1.size();i++){
            resultado += array1.get(i);
        }
        return resultado;
    }
    public static int sumaR(ArrayList<Integer> array1,int posicion){
        //int resultado=0;    
        if(posicion==0){
                return array1.get(posicion);
            }else{
                    return array1.get(posicion) + sumaR(array1, posicion -1);
            }
    }
    public static void main(String[] args){
       
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(1);
        array1.add(2);
        array1.add(3);
        array1.add(4);
        array1.add(5);
        int posicion = array1.size() -1;//0-4,posiciones donde se almacenan los elementos
        System.out.println("suma it " + sumaIt(array1));    
        System.out.println("suma recur " + sumaR(array1, posicion));
    }
}
