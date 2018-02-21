package boletin20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Libreria {

    private Scanner sc;
    private File fich;
    private FileWriter f1;
    private PrintWriter escribir;
    ArrayList<Libro> libreria=new ArrayList();

    /**
     * Metodo que no recibe ni devuelve nada. Este metodo se encarga de añadir
     * unos valores al ArrayList.
     */
    public void librosPorDefecto() {
//        libreria.add(new Libro("Marca","Jose",1.5F,100));
//        libreria.add(new Libro("AS","Antonio",2.5F,160));
//        libreria.add(new Libro("EL Pais","PEPE",1.5F,20));
        fich=new File("Libreria.txt");
        String linea;
        String[] lista=new String[4];
        Libro a=null;
        try {
            sc=new Scanner(new File("Libreria.txt"));
            while (sc.hasNextLine()) {
                linea=sc.nextLine();
                lista=linea.split(",");
                a=new Libro(lista[0],lista[1],Float.parseFloat(lista[2]),Integer.parseInt(lista[3]));
                libreria.add(a);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro1"+ex.getMessage());
        }
        sc.close();

    }

    /**
     * Metodo que crea y escribe en un fichero
     */
    public void escribirFichero() {
        try {
            fich=new File("Libreria.txt");
            escribir=new PrintWriter(fich);
            for (int i=0; i<libreria.size(); i++) {
                escribir.println(libreria.get(i).getNombre()+","+libreria.get(i).getAutor()+","+libreria.get(i).getPrecio()+","+libreria.get(i).getUnidades());
            }
            escribir.close();
        } catch (IOException ex) {
            System.out.println("Error 1");;
        }
    }

    /**
     * Es un metodo que recibe un arraylist y no devuelve nada. Este método se
     * encarga de añadir al ArrayList un objecto de tipo Libro
     *
     * @param libreria
     */
    public void engadir() {
        String titulo=JOptionPane.showInputDialog("Introduce el nombre del Libro");
        String aut=JOptionPane.showInputDialog("Introduce el nombre del Autor");
        float pre=Float.parseFloat(JOptionPane.showInputDialog("Introduce el precio del libro"));
        int uni=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de unidades del libro"));
        libreria.add(new Libro(titulo,aut,pre,uni));

    }

    /**
     * Es un metodo que recive un ArrayList y no devuelve nada. Este metodo se
     * encarga de comparar en el Arraylist el titulo introducido con algun
     * titulo existente
     *
     * @param libreria
     */
    public void consultar(ArrayList<Libro> libreria) {
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

    public void leerLibreria() {
        String linea;
        String[] lista=new String[4];
        Libro a=null;
        try {
            sc=new Scanner(new File("Libreria.txt"));
            while (sc.hasNextLine()) {
                linea=sc.nextLine();
                lista=linea.split(",");
                a=new Libro(lista[0],lista[1],Float.parseFloat(lista[2]),Integer.parseInt(lista[3]));
                System.out.println(a.toString());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro1"+ex.getMessage());
        }
        sc.close();
    }

}
