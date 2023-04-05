
## Proyecto Spring Boot

Este es un proyecto para construir un microservicio basado en **Spring Boot**. Este microservicio se observa en el formulario ya existente en versiones
anteriores de la página web. El usuario inserta una serie de datos de contacto y la página ,a través de un fetch, envía los datos al servidor, que los devueve inmediatamente confirmando que todo se ha realizado conrrectamente. Asimismo, se intenta hacer una validación de los datos mediante el comando @validated para 
que no haya contenido indeseado, estableciendo la obilgatoriedad de ciertos campos y limitando la longuitud. (Esto se puede observar tanto en el controller como en la clase "Persona.java". 

La estructura del proyecto es:

 - **/controller:** Paquete donde se almacenarán las clases que representan la API-REST del microservicio
 - **/service:** Declaración de la capa de Servicio que será invocada desde la capa API (Controller)
 - **/service/impl:**  Implementación de la capa de servicios. En estas clases se deberá implementar la capa de negocio de nuestros microservicios
 - **/resources/static:** Contenido del HTML, JS y CSS de nuestro portal Web
 
