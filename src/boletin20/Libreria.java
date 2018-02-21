package boletin20;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Libreria {
    /**
     * Es un metodo estatico que recibe un arraylist y no devuelve nada.
     * Este método se encarga de añadir al ArrayList un objecto de tipo Libro
     * @param nombre 
     */
    public static void engadir(ArrayList<Libro>nombre){
        String titulo=JOptionPane.showInputDialog("Introduce el nombre del Libro");
        String aut=JOptionPane.showInputDialog("Introduce el nombre del Autor");
        float pre=Float.parseFloat(JOptionPane.showInputDialog("Introduce el precio del libro"));
        int uni=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de unidades del libro"));
        nombre.add(new Libro(titulo,aut,pre,uni));
        
    }

}
