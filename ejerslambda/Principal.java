import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;

public class Principal{
//METODO COLLECT, se utiliza cunado queremos devolver una lista como resultado final
//METODO MAP, se utiliza cuando quieres aplicar una operacion en todos los elementos del arraylist

    public static List<Double> cuadrados(List<Double> lista)
    {
        /*1.Hallar una lista con sus cuadrados.

        return lista.stream().map(x-> x*x).collect(Collectors.toList());
           */


        //2.Hallar la suma de todos los elementos de la lista
        //METODO REDUCE: el 0.0 indica dedse ue posicion empezamos, el otro parametro es la expresion algebraica que quieres que haga
        return lista.stream().reduce(0.0,(a,b)-> a+b);
        }
        public static void main(String[] args)
        {
            ArrayList<Double> lista = new ArrayList<>();
            lista.add(1.0);
            lista.add(3.0);
            lista.add(5.0);
            System.out.println(cuadrados(lista));


        }

        

}