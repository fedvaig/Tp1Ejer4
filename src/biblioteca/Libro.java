package biblioteca;

/**
 *
 * @author Federico
 */
public class Libro {
    private String nombre;
    private String tipo;
    private String autor;
    private int paginas;
    private int cantEjemplares;

    
    public Libro(String nombre, String tipo, String autor, int paginas, int ejemplar) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.autor = autor;
        this.paginas = paginas;
        this.cantEjemplares = ejemplar;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    
    
}
