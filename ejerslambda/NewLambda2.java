import java.util.Comparator;
import java.util.List;

public class Principal2 {

    public static void main(String[] args) {

        Persona personaA = new Persona("pedro", "perez", 20);
        Persona personaB = new Persona("ana", "blanco", 15);
        Persona personaC = new Persona("miguel", "alvarez", 50);

        List < Persona > lista = Arrays.asList(personaA, personaB, personaC);
        lista.sort(new Comparator < Persona > () {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getEdad() > p2.getEdad() ? 1 : -1;
            }
        });
        for (Persona p: lista) {
            System.out.println(p.getNombre() + " ," + p.getEdad());
        }

    }

}