package org.rodriguez.ejemplos.list;

import org.rodriguez.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {

        // Metodos importantes
        List<Alumno> al = new ArrayList<>();
        System.out.println(al + ",  = " + al.size());
        System.out.println("está vacía = " + al.isEmpty());

        al.add(new Alumno("Pato", 5));
        al.add(new Alumno("Cata", 6));
        al.add(new Alumno("Luci", 4));
        al.add(2, new Alumno("Jano", 7));

        al.set(3, new Alumno("Andres", 3));

        System.out.println(al + ", size = " + al.size());

        // Utiliza el equals
        //al.remove(new Alumno("Jano", 7));
        al.remove(2);
        System.out.println(al + ", size = " + al.size());

        // Alumno existe?
        boolean b = al.contains(new Alumno("Jano", 7));
        System.out.println("La lista contiene a Jano = " + b);

        Object a[] = al.toArray();
        for (int i = 0; i < a.length; i++){
            System.out.println("Desde el arreglo = " + a[i]);
        }
    }
}
