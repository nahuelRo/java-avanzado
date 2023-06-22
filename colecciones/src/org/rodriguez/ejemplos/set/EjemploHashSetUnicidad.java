package org.rodriguez.ejemplos.set;

import org.rodriguez.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        /*
        *  El metodo equeals nos permite identificar el objeto que tiene
        *  los mismos valores o la misma instancia.
        */
        Set<Alumno> sa = new HashSet<>();
//        Set<Alumno> sa = new TreeSet<>();
//        List<Alumno> sa = new ArrayList<>();
//        List<Alumno> sa = new LinkedList<>();

        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 3));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus2", 2));
        sa.add(new Alumno("lucas", 2));
        sa.add(new Alumno("lucas", 3));

        System.out.println(sa);

//        System.out.println("Utilizando un for clásico (listas)");
//        for (int i = 0; i < sa.size(); i++) {
//            Alumno a = sa.get(i);
//            System.out.println(a.getNombre());
//        }

        System.out.println("Iterando usando un foreach");
        for (Alumno a: sa){
            System.out.println(a.getNombre());
        }


        System.out.println("Iterando usando while y iterator");
        Iterator<Alumno> it = sa.iterator();
        while(it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }


        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);
    }
}
