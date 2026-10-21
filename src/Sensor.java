public class Sensor {
    private static String id;
    private static String ubicacion;
    private static boolean estado;
    private static double ultimaMedicion;

    public Sensor(String id, String ubicacion){
        this.id = id;
        this.ubicacion = ubicacion;
        estado = false;
        ultimaMedicion = 0.0;
    }

    public static String getId() {
        return id;
    }

    public static String getUbicacion() {
        return ubicacion;
    }

    public static boolean isEstado() { return estado; }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public static double getUltimaMedicion() {
        return ultimaMedicion;
    }

    public void setUltimaMedicion(double ultimaMedicion) {
        this.ultimaMedicion = ultimaMedicion;
    }

    public void interpretacionMedicion() {
        System.out.println("Valor medido por el sensor "+ id +": " + ultimaMedicion);
    }

}