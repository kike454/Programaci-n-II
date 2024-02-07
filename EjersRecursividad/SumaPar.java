public class SumaPar {
    //suma(9):8+6+4+2
    public static int sumaPar(int numero,int suma){
        if(numero<2){
            return 0;
        }
        else if(numero==2){
            return 2 + suma; 
        }else{
            if(numero%2==0){
            return sumaPar(numero-2, suma + numero);
            //(6,8),
        }else{
            return sumaPar(numero-1,suma);
        }
    }
}
public static int sumaParB(int n){
    if(n<2){
        return 0;
        
    }else{
        if(n%2==0){
            return n + sumaParB(n-2);
        }else{
            return sumaParB(n-1);
        }
        
    }

}

    public static void main(String [] args){
for(int i=0; i<100;i++){
    //System.out.println("la suma de los pares hasta el " + i + " es " + sumaPar(i,0));
    System.out.println("suma b " + i + " es " + sumaParB(i));
}
   
    }
}