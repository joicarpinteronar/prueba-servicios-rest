## Proyecto: com.rest.automation

En la siguiente sección se describen los módulos que abarca el proyecto de automatización de Apis, la mayoría de los cuales forman parte de la arquitectura propuesta por el patrón de ScreenPlay:

* ```src/main/java```

``` 

+ com.rest.automation.interactions
    
     Clases que realizan las acciones o interacciones que el usuario realiza sobre el servicio, y que el framework SerenityBDD ejecuta las operaciones.
	
+ com.rest.automation.models
    Clases que definen objetos de negocio abstraídos en una entidad real, modelados por atributos y métodos.

+ com.rest.automation.questions
    Clases con las que se hacen preguntas al sistema para luego ser verificadas en las definiciones de pasos  (asserts).

+ com.rest.automation.tasks
    Clases que representan las tareas realizadas por el actor a nivel de proceso de negocio.   


+ com.rest.automation.utils
    
Clases que contienen utilidades o funcionalidades comunes, enums, constantes manejadas en el proyecto
``` 

* ```src/test/java```

``` 
+ com.rest.automation.runners
    
Clases que representan a los runners para ejecutar la automatización con los escenarios indicados en la función.
    
+ com.rest.automation.stepdefinitions
     
Clases que son el punto de entrada de la característica para la ejecución de la automatización.
``` 

* ```src/test/resources```

``` 
+ dataDriven
     Archivos donde se encuentra el conjunto de datos utilizados para la automatización.
    
+ features
     
Representación de los escenarios de prueba en lenguaje Gherkin a través de archivos de Cucumber.
    
* ```Herramientas```

+ Framework: Serenity
+ Patron de Diseño: ScreenPlay
+ Lenguaje: Java 1.8
+ Gestor de Dependencias: Gradle
+ Runner: JUnit


* ```Ejecucion```

Se puede ejecutar desde un IDE de desarrollo, compilando con Gradle o JUnit

Tambien se puede ejecutar desde el achivos raiz ejecutando el comando:

gradle clean test aggregate

* ```Reporte```

Una vez Ejecutado los test se genera un reporte en la ruta: target/site/serenity --> archivo index.html