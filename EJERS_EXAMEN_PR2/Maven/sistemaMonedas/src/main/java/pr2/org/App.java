package pr2.org;
import java.util.*;
import java.time.format.SignStyle;

/**Dado un cambio de dinero y un sistema de monedas ordenado  de mayor a menor, 
     * (todo en centimos), devolver el minimo numero de monedas correspondiente al cambio.
     * La tecnica debe ser iterativa
     * @param cambio
     * @param sistemaMonedas
     * @return el numero minimo de monedas **/
public class App 
{
    public int cambioIt(int cambio, List<Integer> sistemaMonedas){
       int numeroMonedas =0;
       
       for(int moneda: sistemaMonedas){
           
           while(cambio>=moneda){
               cambio-=moneda;
               numeroMonedas++;
           }
       }
        return numeroMonedas;
    }
    public int cambioRec(int cambio,List<Integer> sistemaMonedas){
       int numeroMonedas =0;
        if(cambio<=0){
            return 0;
        }else{
                int moneda = sistemaMonedas.get(0);
                if(cambio< moneda){//como esta ordenado de mayor a menor, tienes que hacer que itere borrando elementos
                    sistemaMonedas.remove(0);    
                    return cambioRec(cambio, sistemaMonedas);
                }else{
                    cambio-=moneda;
                    return numeroMonedas+1 + cambioRec(cambio, sistemaMonedas);

                }
            }
    }
   /* public int cambioLam(int cambio, List<Integer> sistemaMonedas){
        //int cambioAux = cambio;
       // int res = sistemaMonedas.stream().forEach( moneda ->{
           // while(cambio>=moneda){
            Stream<Integer> iterateS = 
            int numeroMonedas = (int)sistemaMonedas.stream().filter(p-> cambio<=p).map(x -> cambio-=x).count();
            int numero = 
                
            
                //}    
        //});
        return numeroMonedas;
    }*/

}
