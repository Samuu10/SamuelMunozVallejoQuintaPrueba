package Composite;

//Interface ComponenteRestaurante que define los métodos a implementar por las clases que la implementen (Componente)
public interface ComponenteRestaurante {
    void agregar(ComponenteRestaurante componente);
    void eliminar(ComponenteRestaurante componente);
}