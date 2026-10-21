public class Sensor {
    private String id;
    private String ubicacion;
    private boolean estado;
    private double ultimaMedicion;

    public Sensor(String id, String ubicacion){
        this.id = id;
        this.ubicacion = ubicacion;
        estado = false;
        ultimaMedicion = 0.0;
    }

    public String getId() {
        return id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getUltimaMedicion() {
        return ultimaMedicion;
    }

    public void setUltimaMedicion(double ultimaMedicion) {
        this.ultimaMedicion = ultimaMedicion;
    }
}