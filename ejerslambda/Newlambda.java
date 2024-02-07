package com.arquitecturajava;

import java.util.Arrays;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Persona personaA = new Persona("pedro", "perez", 20);
        Persona personaB = new Persona("ana", "blanco", 15);
        Persona personaC = new Persona("miguel", "alvarez", 50);

        List < Persona > lista = Arrays.asList(personaA, personaB, personaC);

        lista.sort(new PersonaEdadComparator());
        for (Persona p: lista) {

            System.out.println(p.getNombre() + " ," + p.getEdad());
            



        }

    }

}