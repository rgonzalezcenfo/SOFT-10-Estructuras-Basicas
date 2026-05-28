import ListaEnlazada.ListaEnlazada;

public class Main {

    public static void main(String[] args){

        ListaEnlazada miListaCiudades = new ListaEnlazada();

        miListaCiudades.insertarInicio("Heredia", "Costa Rica", "America", 118000, "Español");
        miListaCiudades.insertarInicio("Berlin", "Alemania", "Europa", 3769495, "Alemán");
        miListaCiudades.insertarInicio("Nairobi", "Kenya", "Africa", 5545000, "Suajili");

        miListaCiudades.insertarFinal("Tokio", "Japon", "Asia", 14215906, "Japones");


        System.out.println(miListaCiudades.buscarXNombre("Tokio"));
        System.out.println(miListaCiudades.buscarXPoblacion(3000000));
        System.out.println(miListaCiudades.eliminarNodo("Heredia"));
        System.out.println(miListaCiudades.buscarXNombre("Heredia"));

        miListaCiudades.mostrar();
    }
}