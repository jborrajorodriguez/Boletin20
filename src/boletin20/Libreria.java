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

    public Libreria() {
        try {
            sc=new Scanner(new File("Libreria.txt"));
        } catch (FileNotFoundException ex) {
            System.out.println("No lo encuentra");;
        }
    }
    

    /**
     * Metodo que no recibe ni devuelve nada. Este metodo se encarga de añadir
     * unos valores al ArrayList.
     */
    public void archivoAArray() {

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
            System.out.println("Erro1 Non se atopa o ficheiro");
        } catch (NullPointerException ex) {
            System.out.println("No se puede leer de un fichero vacio");
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
            System.out.println("Error 1 ");
        } catch (NullPointerException ex) {
            System.out.println("No se puede leer de un fichero vacio");
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
     * Es un metodo que no recive nada y no devuelve nada. Este metodo se
     * encarga de comparar en el Arraylist el titulo introducido con algun
     * titulo existente
     *
     * @param libreria
     */
    public void consultar() {
        String titulo=JOptionPane.showInputDialog("Introduce el titulo del Libro");
        int m=0;
        for (int i=0; i<libreria.size(); i++) {
            if (libreria.get(i).getNombre().equalsIgnoreCase(titulo)) {
                System.out.println("Su precio es de :"+libreria.get(i).getPrecio());
                m=1;
            }

        }
        if (m==0) {
            System.out.println("Este libro no se encuentra");
        }
    }

    /**
     * Metodo que no recibe ni devuelve nada que se encarga de leer el fichero.
     */
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

//    public void comprobarFichero() {
//        if (fich.exists()) {
//            this.archivoAArray();
//        }
//        else {fich.e
//            fich=new File("Libreria.txt");
//            
//
//        }
//    }
    /**
     * Este metodo no recibe ni devuelve nada.Se encarga de borrar de el fichero
     * los libros que no tengan unidades.
     */
    public void borrado0() {
        for (int i=0; i<libreria.size(); i++) {
            if (libreria.get(i).getUnidades()==0) {
                libreria.remove(i);
            }

        }
        this.escribirFichero();
    }
    /**
     * Este metodo no recibe nada y devuelve nada.Se encarga de modificar el precio de un libro.
     */
    public void modificarPrecio(){
        String titulo=JOptionPane.showInputDialog("Introduce el titulo del Libro");
        int m=0;
        for (int i=0; i<libreria.size(); i++) {
            if (libreria.get(i).getNombre().equalsIgnoreCase(titulo)) {
                float nprecio=Float.parseFloat(JOptionPane.showInputDialog("Nuevo precio"));
                libreria.get(i).setPrecio(nprecio);
                this.escribirFichero();
                m=1;
            }

        }
        if (m==0) {
            System.out.println("Este libro no se encuentra");
        }
    }

}
