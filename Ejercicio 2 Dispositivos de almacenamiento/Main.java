public class Main {
    public static void main(String[] args) {
        USB usb = new USB(32);
        DiscoDuro disco = new DiscoDuro(512);

        usb.guardarDatos("Fotos");
        disco.guardarDatos("Películas");
    }
}