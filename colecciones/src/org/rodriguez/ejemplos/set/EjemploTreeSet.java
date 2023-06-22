package org.rodriguez.ejemplos.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        /*
        * Tienen un costo de rendimiento
        * Estan ordenados de forma alfabetica
        * Estan ordenados de menor a mayor
        * Tiene que implementar el metodo Comparable con el metodo compareTo
        * Por argumento pasamos el comparator
        */
        Set<String> ts = new TreeSet<>(Comparator.reverseOrder());

        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");

        System.out.println("ts = " + ts);

        Set<Integer> numeros = new TreeSet<>();

        numeros.add(1);
        numeros.add(5);
        numeros.add(4);
        numeros.add(2);
        numeros.add(3);
        numeros.add(10);

        System.out.println("numeros = " + numeros);

    }
}
