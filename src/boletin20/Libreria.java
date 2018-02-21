package boletin20;

import java.util.ArrayList;
import java.util.Iterator;
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
    /**
     * Es un metodo estatico que recive un ArrayList y no devuelve nada.
     * Este metodo se encarga de comparar en el Arraylist el titulo introducido con algun titulo existente
     * @param nombre 
     */
    public static void consultar(ArrayList<Libro>nombre){
        String titulo=JOptionPane.showInputDialog("Introduce el nombre del Libro");
        for(int i=0;i<nombre.size();i++){
            if(titulo==nombre.get(i).getNombre()){
                System.out.println("Su precio es de :"+nombre.get(i).getPrecio());
            }else {
                System.out.println("El libro no está en la libreria");
            }
            
        }
    }

}
