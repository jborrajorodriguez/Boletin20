package boletin20;

import java.io.File;
import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Boletin20 {

    public static void main(String[] args) {
        int m;
        Libreria a=new Libreria();
        a.archivoAArray();
        do {
            m=Integer.parseInt(JOptionPane.showInputDialog("*******Menu******\n1 Engadir libro a la Libreria\n2 Consultar datos por Titulo\n3 Visualizar todos los datos de la Libreria\n4 Borrar libros con 0 unidades \n5 Modificar el Precio de un Libro\n0 Salir"));

            switch (m) {

                case 1:

                    a.engadir();
                    a.escribirFichero();
                    System.out.println("\n\n");

                    break;
                case 2:;
                   
                    a.consultar();
                    System.out.println("\n\n");
                    break;

                case 3:
                    a.leerLibreria();
                    System.out.println("\n\n");
                    break;
                case 4:
                    a.borrado0();
                    System.out.println("\n\n");
                    break;

                case 5:
                    
                    a.modificarPrecio();
                    System.out.println("\n\n");
                    break;

            }

        }
        while (m!=0);

    }

}
