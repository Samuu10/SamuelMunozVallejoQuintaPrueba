package Composite;
import java.util.ArrayList;
import java.util.List;

//Clase JerarquiaRestaurantes que implementa la interfaz ComponenteRestaurante (Composite)
public class JerarquiaRestaurantes implements ComponenteRestaurante{
    //Atributos
    private List<ComponenteRestaurante> restaurantes;

    //Constructor
    public JerarquiaRestaurantes(){
        this.restaurantes = new ArrayList<>();
    }

    @Override
    public void agregar(ComponenteRestaurante componente) {
        restaurantes.add(componente);
    }

    @Override
    public void eliminar(ComponenteRestaurante componente) {
        restaurantes.remove(componente);
    }
}