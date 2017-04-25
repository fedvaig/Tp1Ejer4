package biblioteca;

/**
 *
 * @author Federico
 */
public class Socio {
    
    private int codigo;
    private String Nombre;
    private String Apellido;

    public Socio(int codigo, String Nombre, String Apellido) {
        this.codigo = codigo;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    
}
