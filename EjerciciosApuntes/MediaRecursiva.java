
import java.util.*;

 
public class MediaRecursiva
{

    //media aritmetica


public  static float suma(ArrayList<Float>lista){//creamos un metodo ue haga la  media
    if(lista.size() ==0){
        return 0;
    }
    else{
        return lista.remove(0) + suma(lista);
    }

}
public static void main(String[] args){
    ArrayList<Float> lista2 = new ArrayList();
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero, para parar introduce una letra");
    try{
        while(true){//mientras introduzcas un float, un numero
            lista2.add(sc.nextFloat());
        }
    }catch(Exception e){
        System.out.println("Fin de la lista");

    }
    sc.close();
    float denominador = lista2.size();
    System.out.println("La media es " + suma(lista2)/denominador);



}

}

