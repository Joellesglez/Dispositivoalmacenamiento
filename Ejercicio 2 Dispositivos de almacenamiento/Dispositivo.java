public abstract class Dispositivo implements Almacenable {
    protected int capacidad;

    public Dispositivo(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }
}