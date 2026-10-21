public class SensorTemperatura extends Sensor{
    private final String unidadMedida;

    public SensorTemperatura(String id, String ubicacion){
        super(id, ubicacion);
        unidadMedida = "°C";
    }

    @Override
    public void evaluarMedicion() {
        System.out.println("Valor medido por el sensor "+ getId() +": " + getUltimaMedicion() + unidadMedida);
        if (getUltimaMedicion() < 18.0) {
            System.out.println("Temperatura baja.");
        } else if (getUltimaMedicion() > 30.0){
            System.out.println("Temperatura alta.");
        } else{
            System.out.println("Temperatura adecuada.");
        }
    }
}
