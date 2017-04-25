package tp1ejer4;

import biblioteca.*;

/**
 *
 * @author Federico
 */
public class Tp1Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        Biblioteca bib = new Biblioteca();
        MenuBiblioteca m = new MenuBiblioteca("Gestión de Biblioteca", 2, bib);
        m.agregar(1, "Alta de Libro");
        m.agregar(2, "Devolucion Libro");
        m.ejecutar();
    }

}
