package boletin20;
/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Libro {
    public String nombre,autor;
    public float precio;
    public int unidades;

    public Libro() {
    }

    public Libro(String nombre,String autor,float precio,int unidades) {
        this.nombre=nombre;
        this.autor=autor;
        this.precio=precio;
        this.unidades=unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor=autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio=precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades=unidades;
    }
    
    

}
