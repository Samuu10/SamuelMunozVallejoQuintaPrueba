package Factory;

public class FabricaRestaurantesComidaRapida implements FabricaRestaurantes{
    @Override
    public Restaurante crearRestaurante() {
        return new RestauranteComidaRapida();
    }
}