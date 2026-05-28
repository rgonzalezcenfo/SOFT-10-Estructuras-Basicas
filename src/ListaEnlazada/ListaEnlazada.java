package ListaEnlazada;

import java.util.Objects;

public class ListaEnlazada {

    //Atributo
    private NodoLista primero;

    //Constructor
    public ListaEnlazada() {
        primero = null;
    }

    //operaciones

    //Agregar a la lista una operación privada que evalúe si está vacía
    private boolean estaVacia() {
        return primero == null;
    }

    public void insertarInicio(String nombre, String pais, String continente, int poblacion, String idioma) {
        // Construir el nodo con los datos recibidos de parametros
        NodoLista nuevoNodo = new NodoLista(nombre, pais, continente, poblacion, idioma);
        //Hacer que el nuevo nodo apunte como siguiente al primero de la lista
        nuevoNodo.setSiguiente(primero);
        //Hacer que el primero de la lista sea el nuevo nodo
        primero = nuevoNodo;
    }

    public void insertarFinal(String nombre, String pais, String continente, int poblacion, String idioma) {
        // Construir el nodo con los datos recibidos de parametros
        NodoLista nuevoNodo = new NodoLista(nombre, pais, continente, poblacion, idioma);
        if (estaVacia()) {
            primero = nuevoNodo;
            return;
        }
        NodoLista temp = primero;
        while (temp.getSiguiente() != null) temp = temp.getSiguiente();
        temp.setSiguiente(nuevoNodo);
    }

    public NodoLista buscarXNombre(String nombre) {
        if (estaVacia()) {
            System.out.println("La lista esta vacía");
            return null;
        }

        NodoLista temp = primero;
        while (temp != null) {
            if (Objects.equals(temp.getNombre(), nombre)) {
                return temp;
            }

            temp = temp.getSiguiente();
        }
        System.out.println("El nombre buscado no está en la lista");
        return null;
    }

    public NodoLista buscarXPoblacion(int poblacion) {
        if (estaVacia()) {
            System.out.println("La lista esta vacía");
            return null;
        }

        NodoLista temp = primero;


        NodoLista resultado = primero;
        int diferenciaResultado = Math.abs(temp.getPoblacion() - poblacion);

        while (temp != null) {
            int diferenciaTemp = Math.abs(temp.getPoblacion() - poblacion);
            if (diferenciaTemp < diferenciaResultado) {
                resultado = temp;
                diferenciaResultado = diferenciaTemp;
            }
            temp = temp.getSiguiente();
        }

        return resultado;
    }

    public NodoLista eliminarNodo(String nombre) {
        if (estaVacia()) {
            System.out.println("La lista está vacía.\n");
            return null;
        }

        NodoLista temp = primero;
        NodoLista anterior = temp;
        while (temp != null && !temp.getNombre().equals(nombre)) {
            anterior = temp;
            temp = temp.getSiguiente();
        }
        if (temp == null) {
            System.out.println("El nombre buscado no está en la lista");
            return null;
        }
        anterior.setSiguiente(temp.getSiguiente());
        return temp;
    }

    public void mostrar(){
        NodoLista temp = primero;
        if (estaVacia()) System.out.println("La lista está vacía.\n");

        while (temp != null) {
            System.out.println(temp);
            temp = temp.getSiguiente();
        }
    }
}

