package biblioteca;

/**
 *
 * @author Federico
 */
public class Biblioteca {

    private Libro[] coleccion;
    private int cantCol;
    private Prestamo[] prestamos;
    private int cantPrest;
    private Socio[] socios;
    private int cantSoc;

    public Biblioteca() {
        this.coleccion = new Libro[100];
        this.prestamos = new Prestamo[100];
        this.socios = new Socio[10];
        cantCol = cantPrest = cantSoc = 0;
    }

    public boolean agregarLibro(Libro x) {
        if (cantCol == coleccion.length) {
            return false;
        } else {
            coleccion[cantCol] = x;
            cantCol++;
            return true;
        }
    }

    private int buscarLibro(String nom) {
        for (int i = 0; i < coleccion.length; i++) {
            if (coleccion[i].getNombre().equals(nom)) {
                return i;
            }
        }
        return -1;
    }

    public Libro removerLibro(String nom) {
        int x = buscarLibro(nom);
        Libro l = null;
        if (x != -1) {
            l = coleccion[x];
            for (int i = x; i < cantCol - 1; i++) {
                coleccion[i] = coleccion[i + 1];
            }
            coleccion[x] = null;
            cantCol--;
        }
        return l;
    }
}
