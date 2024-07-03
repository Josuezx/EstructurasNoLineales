package main.Materia.Controlador;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {

    public Sets(){
        construirHashSet();
        System.out.println();
        construirLinkedHashSet();
        System.out.println();
        construirTreeSet();
        System.out.println();
        construirTreeSetConComparador();
    }

    //construir y mostrar un HashSet
    public void construirHashSet(){
        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana");
        conjunto.add("Uvas");
        conjunto.add("Piña");
        System.out.println("HashSet: "+conjunto);
        conjunto.remove("Banana");
        System.out.println("HashSet despues de eliminar Banana: "+conjunto);
        conjunto.remove("Uvas");
        conjunto.remove("Piña");
        System.out.println("HashSet despues de eliminar Uva, Pina: "+conjunto);

        //obtener el tamano del conjunto
        int tamano = conjunto.size();
        System.out.println("Tamano del HashSet: "+tamano);
         //verifica si un elemento existe
        boolean contieneNaranja = conjunto.contains("Naranja");
        System.out.println("HashSet contiene Naranja?"+conjunto);

    }

   

    //Construir y mostrar un LinkedHashSet
    public void construirLinkedHashSet(){
        LinkedHashSet<String> conjunto = new LinkedHashSet<>();
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana");
        conjunto.add("Uvas");
        conjunto.add("Piña");
        System.out.println("LinkedHashSet: "+conjunto);


    }

    //Construir y mostrar un TreeSet
    //imprime en orden alfabeticamente
    public void construirTreeSet(){
        TreeSet<String> conjunto = new TreeSet<>();
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana");
        conjunto.add("Uvas");
        conjunto.add("Piña");
        System.out.println("TreeSet: "+conjunto);


    }

    

    //Construir y mostrar un TreeSetComparador
    public void construirTreeSetConComparador(){
        //comparador personalizados que ordena las cadenas
        Comparator<String> comparadorOrdenInverso =
        new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                return s2.compareTo(s1);
            }
        };

        TreeSet<String> conjunto = new TreeSet<>(comparadorOrdenInverso);
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana");//Duplicado 
        conjunto.add("Uvas");
        conjunto.add("Piña");
        System.out.println("TreeSetConComparador: "+conjunto);


    }

}   

