public class USB extends Dispositivo {

    public USB(int capacidad) {
        super(capacidad);
    }

    @Override
    public void guardarDatos(String datos) {
        System.out.println("Guardando '" + datos + "' en el USB de " + capacidad + " GB.");
    }
}