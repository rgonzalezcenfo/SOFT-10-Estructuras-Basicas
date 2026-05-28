package ListaEnlazada;

public class NodoLista {

    //Atributos
    private String nombre;
    private String pais;
    private String continente;
    private int poblacion;
    private String idioma;
    private NodoLista siguiente;


    //Constructor


    public NodoLista(String nombre, String pais, String continente, int poblacion, String idioma) {
        this.nombre = nombre;
        this.pais = pais;
        this.continente = continente;
        this.poblacion = poblacion;
        this.idioma = idioma;
    }

    //getter


    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public String getContinente() {
        return continente;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public String getIdioma() {
        return idioma;
    }

    public NodoLista getSiguiente() {
        return siguiente;
    }

    //setter


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setSiguiente(NodoLista siguiente) {
        this.siguiente = siguiente;
    }

    //toString
    public String toString() {
        return "\nCiudad: " + nombre + "\nPais: " + pais + "\nContinente: " + continente + "\nPoblación: " + poblacion + "\nIdioma: " + idioma;
    }
}