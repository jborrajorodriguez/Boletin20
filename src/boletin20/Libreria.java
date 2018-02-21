package boletin20;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Libreria {

    ArrayList<Libro> libreria=new ArrayList();
    /**
     * Metodo que no recibe ni devuelve nada.
     * Este metodo se encarga de añadir unos valores al ArrayList.
     */
    public void librosPorDefecto() {
        libreria.add(new Libro("Marca","Jose",1.5F,100));
        libreria.add(new Libro("AS","Antonio",2.5F,160));
        libreria.add(new Libro("EL Pais","PEPE",1.5F,20));
    }

    /**
     * Es un metodo estatico que recibe un arraylist y no devuelve nada. Este
     * método se encarga de añadir al ArrayList un objecto de tipo Libro
     *
     * @param libreria
     */
    public static void engadir(ArrayList<Libro> libreria) {
        String titulo=JOptionPane.showInputDialog("Introduce el nombre del Libro");
        String aut=JOptionPane.showInputDialog("Introduce el nombre del Autor");
        float pre=Float.parseFloat(JOptionPane.showInputDialog("Introduce el precio del libro"));
        int uni=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de unidades del libro"));
        libreria.add(new Libro(titulo,aut,pre,uni));

    }

    /**
     * Es un metodo estatico que recive un ArrayList y no devuelve nada. Este
     * metodo se encarga de comparar en el Arraylist el titulo introducido con
     * algun titulo existente
     *
     * @param libreria
     */
    public static void consultar(ArrayList<Libro> libreria) {
        String titulo=JOptionPane.showInputDialog("Introduce el nombre del Libro");
        for (int i=0; i<libreria.size(); i++) {
            if (titulo==libreria.get(i).getNombre()) {
                System.out.println("Su precio es de :"+libreria.get(i).getPrecio());
            }
            else {
                System.out.println("El libro no está en la libreria");
            }

        }
    }

}
