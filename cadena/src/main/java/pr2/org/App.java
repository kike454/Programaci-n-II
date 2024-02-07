package pr2.org;



public class App 
{
    public static String CadenaResultado(String nombre1){
    //esta implementacion esta pensada para un nombre un apellido
        String inicialNombre="";
        String inicialApellido="";
        
        String[] partes = nombre1.split(",");//dividimos el string en tantas partes necesarias 
                                                  //como delimitaciones por , tenga 
                                                    
        if(nombre1 != null && partes[0]!= "" && Character.isLetter(partes[0].charAt(0))){
           
            inicialNombre = String.valueOf(partes[0].charAt(0)).toUpperCase();
           
            if(partes.length > 1){
            inicialApellido = String.valueOf(partes[1].charAt(0)).toUpperCase();
          
            } 
    }          
        return inicialNombre + inicialApellido;
    }
    
}
