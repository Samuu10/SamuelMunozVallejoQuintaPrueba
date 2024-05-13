package Singleton;

//Clase GestionRestaurantes que implementa el patrón Singleton y se encarga de gestionar los restaurantes
public class GestionRestaurantes {
    //Atributos
    private static GestionRestaurantes instancia;

    //Constructor
    private GestionRestaurantes() {}

    //Método para obtener la instancia
    public static GestionRestaurantes obtenerInstancia() {
        if (instancia == null) {
            instancia = new GestionRestaurantes();
        }
        return instancia;
    }
}