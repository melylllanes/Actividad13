/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad13;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author melissa.a.lopez
 */
public class Actividad13 {

    private static final ArrayList<String> listaNombres = new ArrayList<String>() {
        {
            add("Melissa");
            add("Isela");
            add("Luis");
            add("Amy");
            add("Abner");
            add("Gloria");
            add("Luke");
            add("Leia");
            add("Anakin");
            add("Sam");

        }
    };

    public static void main(String[] args) {
        System.out.println("Lista original: " + listaNombres);

        //<----Orden Alfabetico---->   
        Comparator<String> anonima_Alfabetico;
        listaNombres.sort(anonima_Alfabetico = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });

        System.out.println("");
        System.out.println("------------------------Orden alfabetico------------------------");
        System.out.println("Clase Anonima:" + listaNombres.toString());

        listaNombres.sort((String a, String b) -> a.compareTo(b));
        System.out.println("Lambda:" + listaNombres.toString());

        listaNombres.sort(String::compareTo);
        System.out.println("Referencia:" + listaNombres.toString());

        //<----Orden Por Longitud---->   
        Comparator<String> anonima_longitud;
        listaNombres.sort(anonima_longitud = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return Integer.compare(a.length(), b.length());
            }
        });

        System.out.println("");
        System.out.println("------------------------Por Longitud------------------------");
        System.out.println("Clase Anonima:" + listaNombres.toString());

        listaNombres.sort((String a, String b) -> Integer.compare(a.length(), b.length()));
        System.out.println("Lambda:" + listaNombres.toString());

        listaNombres.sort(Comparator.comparingInt(String::length));
        System.out.println("Referencia:" + listaNombres.toString());

    }

}
