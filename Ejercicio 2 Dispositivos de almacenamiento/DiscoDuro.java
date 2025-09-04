public class DiscoDuro extends Dispositivo {

    public DiscoDuro(int capacidad) {
        super(capacidad);
    }

    @Override
    public void guardarDatos(String datos) {
        System.out.println("Almacenando '" + datos + "' en el disco duro de " + capacidad + " GB.");
    }
}