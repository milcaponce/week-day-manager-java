# Proyecto: DaysManager
Este proyecto es una aplicación de consola en Java para gestionar una lista de los días de la semana. Incluye una clase principal (DaysManager) que maneja las operaciones de la lista y un conjunto de pruebas unitarias para validar su correcto funcionamiento.

## Estructura del Proyecto
El proyecto sigue una estructura estándar de Maven, con el código fuente en src/main/java y las pruebas en src/test/java.

* src/main/java/dev/milca/: Contiene el código principal de la aplicación.

  - App.java: La clase principal que sirve como punto de entrada y demuestra las funcionalidades de DaysManager.

  - DaysManager.java: La clase que encapsula la lógica para gestionar la lista de días de la semana.

* src/test/java/dev/milca/: Contiene las pruebas unitarias.

  - DaysManagerTest.java: Contiene los tests para cada uno de los métodos de la clase DaysManager.

## Funcionalidades de DaysManager
La clase DaysManager implementa las siguientes operaciones sobre una lista de días:

* createListOfDays(): Añade los siete días de la semana a la lista.

* returnDays(): Devuelve la lista completa de días.

* getListSize(): Retorna el número de elementos en la lista.

* deleteDay(String day): Elimina un día específico de la lista.

* getDayByIndex(int index): Retorna el día en una posición dada.

* existsDay(String day): Verifica si un día existe en la lista.

* orderList(): Ordena la lista de días alfabéticamente.

* clearList(): Vacía la lista por completo.

## Pruebas Unitarias (JUnit 5)
El proyecto incluye un conjunto completo de pruebas unitarias que cubren todas las funcionalidades de la clase DaysManager. Se ha utilizado el patrón Arrange-Act-Assert para asegurar que cada test sea claro y legible.

Para ejecutar los tests, utiliza el siguiente comando de Maven:

mvn clean test 

## Cómo Ejecutar la Aplicación
Para ejecutar la demostración de la aplicación en la consola, utiliza el siguiente comando de Maven desde la raíz del proyecto:

 mvn exec:java -Dexec.mainClass="dev.milca.App" 

Esto ejecutará el método main de la clase App, que mostrará en la terminal una demostración paso a paso de cada funcionalidad implementada en DaysManager.
