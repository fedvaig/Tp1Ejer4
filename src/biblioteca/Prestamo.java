package biblioteca;

import java.time.LocalDateTime;

/**
 *
 * @author Federico
 */
public class Prestamo {
    
    private int codigoLibro;
    private int codigoSocio;
    private LocalDateTime fecha;
    private LocalDateTime devuelto;

    public Prestamo(int codigoLibro, int codigoSocio) {
        this.codigoLibro = codigoLibro;
        this.codigoSocio = codigoSocio;
        fecha = LocalDateTime.now();
    }
    
    public void devolver(){
        this.devuelto= LocalDateTime.now();
    }

    /**
     * @return the codigoLibro
     */
    public int getCodigoLibro() {
        return codigoLibro;
    }

    /**
     * @return the codigoSocio
     */
    public int getCodigoSocio() {
        return codigoSocio;
    }

    /**
     * @param codigoSocio the codigoSocio to set
     */
    public void setCodigoSocio(int codigoSocio) {
        this.codigoSocio = codigoSocio;
    }

    /**
     * @return the fecha
     */
    public LocalDateTime getFecha() {
        return fecha;
    }

    /**
     * @return the devuelto
     */
    public LocalDateTime getDevuelto() {
        return devuelto;
    }
    
    
}
