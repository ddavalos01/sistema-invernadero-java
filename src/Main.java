public class Main {

    public static void main(String[] args) {
        System.out.println("Sistema de invernadero inteligente");

        Sensor sensor1 = new SensorTemperatura("T1", "Pared lateral");
        Sensor sensor2 = new SensorHumedad("H1", "Pared superior");
        Sensor sensor3 = new SensorHumedadSuelo("HS1", "Pared inferior");
        Sensor[] sensores = new Sensor[3];
        sensores[0] = sensor1;
        sensores[1] = sensor2;
        sensores[2] = sensor3;
        sensor1.setUltimaMedicion(30.0);
        sensor2.setUltimaMedicion(65.0);
        sensor3.setUltimaMedicion(12.0);

        //Procesamiento polimorfico
        for (Sensor sensor : sensores) {
            sensor.evaluarMedicion();
            if (sensor instanceof SensorHumedadSuelo) {
                SensorHumedadSuelo humedadSuelo = (SensorHumedadSuelo) sensor;
                humedadSuelo.evaluarHumedadSuelo();
            }
        }
    }
}