package org.rodriguez.ejemplos.list;

import org.rodriguez.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparator {
    public static void main(String[] args) {

        /*
        *  Se guardan en el orden en el que se crean
        *
        */
        List<Alumno> sa = new ArrayList<>();


        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus2", 2));
        sa.add(new Alumno("lucas", 2));
        sa.add(new Alumno("lucas", 3));

        // Ordenar
        // Collections.sort(sa, (a,b) -> b.getNombre().compareTo(a.getNombre()));
        // sa.sort((a, b) -> b.getNombre().compareTo(a.getNombre()));
        sa.sort(Comparator.comparing(Alumno::getNota).reversed());
        System.out.println(sa);

        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);
    }
}
