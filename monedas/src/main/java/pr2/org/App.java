package pr2.org;

import java.util.List;



public class App 
{
    /**Dado un cambio de dinero y un sistema de monedas ordenado  de mayor a menor, 
     * (todo en centimos), devolver el minimo numero de monedas correspondiente al cambio.
     * La tecnica debe ser iterativa
     * @param cambio
     * @param sistemaMonedas
     * @return el numero minimo de monedas **/
    public static int cambioIterativo(int cambio, List<Integer> sistemaMonedas ){
        int monedas = 0;//es el contador que contiene el numeo minimo de monedas
        for(int i: sistemaMonedas){
            while(cambio >= i){
                cambio-=i;
                monedas++;
            }
            
        }
        return monedas;

    }
    /**dado un cambio de dinero y un sistema de monedas ordenado, de mayor a menor, 
     devolver el nunmero de monedas minimo corrsspondiente al cambio.
    La tecnica tiene que ser recursiva con caso base,
    @param cambio
    @param sistemaMonedas;
    @return el numero minimo de monedas
    */
    
    
    public static int cambioRecursivo(int cambio, List<Integer> sistemaMonedas){
        int contador = 0;
       if(cambio==0)
           return 0;
    else{
        for(int x: sistemaMonedas){
                while(cambio >= x){
                    cambio-=x;
                    contador++;
                }
        }
    }
    return contador;

 }
        /**
         * Dado un cambio de dinero y un sistema de monedas ordeando de mayor a menor, 
         * devolver el nunero minimo de monedas correspondiente al cambio
         * Latecnica de esta funcion debe ser con expresiones lambda
         * */
       /* public static int cambioLambda(int cambio, List<Integer> sistemaMonedas ){
           
           

        }*/

    }

