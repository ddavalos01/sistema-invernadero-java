public class SistemaRiego {
    private String id;
    private String ubicacion;
    private boolean estado;

    public SistemaRiego(String id, String ubicacion) {
        this.id = id;
        this.ubicacion = ubicacion;
        estado = false;
    }

    public String getId() { return id; }

    public String getUbicacion() { return ubicacion; }

    public boolean isEstado() { return estado; }

    public void activarRiego() { estado = true; }

    public void desactivarRiego() { estado = false; }

    public void evaluarRegar(SensorHumedadSuelo sensorHS) {
        if (sensorHS.getUltimaMedicion() < 30.0) {
            System.out.println("Sistema de riego activado.");
            activarRiego();
        } else if (sensorHS.getUltimaMedicion() < 80.0){
            System.out.println("Sistema de riego desactivado.");
            desactivarRiego();
        }
    }
}