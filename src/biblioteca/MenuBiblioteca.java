package biblioteca;

import java.util.Scanner;
import utilidades.Menu;

/**
 *
 * @author Federico
 */
public class MenuBiblioteca extends Menu {

    private Biblioteca biblio;

    public MenuBiblioteca(String titulo, int elementos, Biblioteca x) {
        super(titulo, elementos);
        biblio = x;
    }

    private void altaLibro() {
        Scanner c = new Scanner(System.in);
        System.out.print("Nombre Libro: ");
        String nombre = c.nextLine();
        System.out.print("Tipo de Libro: ");
        String tipo = c.nextLine();
        System.out.print("Nombre Autor: ");
        String autor = c.nextLine();
        System.out.print("Cantidad de paginas del Libro: ");
        int numPag = c.nextInt();
        System.out.print("Cantidad de Ejemplares: ");
        int ejemplares = c.nextInt();
        Libro x = new Libro(nombre, tipo, autor, numPag, ejemplares);
        biblio.agregarLibro(x);
    }

    private void eliminarLibro() {
        Scanner c = new Scanner(System.in);
        System.out.print("Ingresa el nombre del libro a elminiar: ");
        String nombre = c.nextLine();
        Libro x = biblio.removerLibro(nombre);
        if (x == null) {
            System.out.println("");
            System.out.println("No existe el libro " + nombre.toUpperCase() + " en la biblioteca.");
        }else{
            System.out.println("");
            System.out.println("Se ha eliminado el siguiente Libro:");
            System.out.print("Nombre: ");System.out.println(x.getNombre());
            System.out.print("Autor: ");System.out.println(x.getAutor());
            System.out.print("Tipo: ");System.out.println(x.getTipo());
            System.out.print("Páginas: ");System.out.println(x.getPaginas());
        }
    }

    @Override
    public void ejecutar() {
        do {
            super.ejecutar();
            switch (op) {
                case 1:
                    altaLibro();
                    break;
                case 2:
                    eliminarLibro();
                    break;
            }
        } while (op != 0);
    }

}
