package pr2.org;
import java.util.stream.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public double estimacionPi(long pasos){
        double pi;
        double x=0;
        double y=0;
        int aciertos =0;
            for(int i=0;i<=pasos;i++){
                x = Math.random();
                y= Math.random();
                if((x*x) + (y*y) <=1){
                    aciertos++;
                }
            }
            pi= 4*(double)aciertos/pasos;
            return pi;
    }
    public double myDonutIterativo(long pasos){

        double estimac = estimacionPi(pasos);
        double radioExt = 2.18;
        double radioInf = 2.00;
        System.out.println((estimac * Math.pow(radioExt,2)) - (estimac*Math.pow(radioInf, 2)));
        return (estimac * Math.pow(radioExt,2)) - (estimac*Math.pow(radioInf, 2)) ;
        
    }
    public double myDonutRecir(long pasos){
        double estimac = estimacionPi(pasos);
        double radioExt = 2.18;
        double radioInf = 2.00;
        int contador=0;
        if(contador<=1){
            System.out.println((estimac * Math.pow(radioExt, 2)) - (estimac*Math.pow(radioInf, 2)));
           return (estimac * Math.pow(radioExt, 2)) - (estimac*Math.pow(radioInf, 2));
        }else{
            
            return contador+1 + myDonutIterativo(pasos);
        }
        //return 0;
    }
    public double myDonutLam(long pasos){
        double estimac = estimacionPi(pasos);
        double radioExt = 2.18;
        double radioInf = 2.00;
        Stream <Double> iterate = Stream.iterate(0.0,x -> x+1);
        double resul = iterate.limit(1).reduce(0.0,(cumulador,elemento) ->(estimac * Math.pow(radioExt, 2)) - (estimac*Math.pow(radioInf, 2)));
        return resul;
    }
}
