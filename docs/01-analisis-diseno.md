# Análisis y diseño

## 1. Descripción del problema
El sistema a representar consiste en un invernadero inteligente que monitoree temperatura del aire, humedad ambiental y humedad del suelo por medio de sensores. Tambien controlara un sistema de riego en base a las mediciones de las variables ambientales.
La informacion que necesita es la temperatura del aire, humedad ambiental, humedad del suelo, estado de los sensores, estado del sistema de riego, niveles deseados de las variables ambientales.
Los elementos que intervienen son las variables ambientales, los sensores, y el sistema de riego.
Debe poder encender y apagar sensores y obtener su medicion, y poder encender y apagar el sistema de riego.

## 2. Identificación de objetos
### Sensor
Representar a cualquier sensor del invernadero. Hay diferentes tipos de sensores, por lo que esta sera la clase padre y con ella se podra representar al sensor de cada variable ambiental, asi se podran controlar y usar sus mediciones de manera sencilla. Debe poder medir su variable correspondiente, la cual puede influenciar el encendido y apagado del sistema de riego, debe tener un ID, y una ubicacion.
### Sistema de riego
Representa al sistema de riego del invernadero. Debe poder recibir los datos medidos de los sensores y modificar su propio estado en base a esto.

## 3. Estado y comportamiento+
| Objeto propuesto | Responsabilidad                                                                                                               | Información que debe conservar | Comportamientos que debe realizar                                            |
|------------------|-------------------------------------------------------------------------------------------------------------------------------|-----------------------------|------------------------------------------------------------------------------|
| Sensor           | Medir una variable ambiental del inversadero                                                                                  | Medicion de la variable <br/> Estado actual <br/> Ubicacion <br/> ID | Obtener medicion <br/> Mandar valor medido <br/> Encenderse y apagarse       |
| Sistema de riego | Modificar el estado de su sistema de riego en base a las mediciones de los sensores | Estado del sistema de riego | Obtener datos de los sensores <br/> Modificar el estado del sistema de riego |

## 4. Características comunes y especialización
La informacion que tienen en comun es el identificador, ubicacion, medicion y estado.
Su comportamiento en comun es la obtencion del valor medido, el cambio de estado, obtencion de ID y ubicacion.
Para cada tipo de sensor, si bien los tres miden datos, cada uno tiene su propia unidad e interpreta el valor medido de diferente manera.
Para representar a todos los sensores, se usara una clase padre que contendra los campos y metodos comunes.
Las clases especializadas de esta clase padre representaran a cada tipo de sensor, depediendo de la variable que midan.

## 5. Relaciones entre objetos
Los sensores y el sistema de riego deben colaborar. El sistema de riego necesita los valores medidos de los sensores del invernadero para modificar su estado.
Con herencia se puede representar la relacion entre el sensor general y cada sensor especializado.
No deben duplicarse responsabilidades de almacenamiento de datos. El sistema de riego los recibe pero no los almacena.
El sistema de riego no debe ser subclase de sensor ya que no tienen campos ni metodos en comun.