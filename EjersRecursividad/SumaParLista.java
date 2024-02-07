import java.util.ArrayList;

public class SumaParLista {
    public static int sumaList(ArrayList<Integer> lista){
        
        
        if(lista.isEmpty()){
            return 0;
        }else{
            int primerElemento = lista.get(0);//guardas la variable antes de quitarla
            if(primerElemento%2==0){
                lista.remove(0);
             return primerElemento + sumaList(lista);
            }else{
                lista.remove(0);
                return sumaList(lista);
            }
             

        }
    }
    public static int sumaPosicion(ArrayList<Integer> lista , int posicion){
        if(posicion==-1){
            return 0;
        }else{
            if(lista.get(posicion)%2==0){
                return lista.get(posicion) + sumaPosicion(lista, posicion-1);
            }else{
                return sumaPosicion(lista, posicion-1);
            }
        }
    }
    public static int suma1param(ArrayList<Integer> lista){//separamos el calculo del retorno para poder dejar la lista como estaba
       int resultado=0;
        if(lista.isEmpty()){
            return 0;
        }else{
            int elemento0= lista.get(0);
               if(elemento0%2==0){
                   lista.remove(0);
                   resultado = elemento0 + suma1param(lista);//guardas el resultado  
               }else{
                   lista.remove(0);
                resultado = suma1param(lista);
               }
               lista.add(0,elemento0);//metes elementos posicion 0,en su posicion correspondiente
         return resultado;      
        }

        
    }

    public static void main(String[]args){
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(20);
        lista.add(30);
        lista.add(4);
        lista.add(5);
        lista.add(60);
        int posicion = lista.size() -1;
        //System.out.println("suma pares lista con remove " + sumaList(lista));
        System.out.println("suma pares con posicion " + sumaPosicion(lista, posicion));
        System.out.println("suma  1 param " + suma1param(lista));
        System.out.println("lista final " );
        for (int i  : lista) {
            System.out.print((i) + " , " );
        }

    }
}