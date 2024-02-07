package mates;

public class Matematicas {
    public static double generarNumeroPiIterativo(long pasos){
        int aciertos = 0;//numero de puntos dentro del circulo
        double pi = 0;
        double x = 0;
        double y = 0;
                for(int i =0; i<=pasos;i++){//recorres todos los puntos para comprobar cuales estan dentro del circulo
                        x = Math.random();
                        y = Math.random();
                        if((x*x) + (y*y) <= 1){
                                aciertos++;
                        }
                }
        pi = 4*((double)aciertos/pasos);
        return pi;
    }
}




