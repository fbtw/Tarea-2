**Biblioteca de Bengalore**

Esta es la biblioteca pública de Bengalore, el sistema descrito a continuación tiene varias funciones que facilitarán la vida del bibliotecario como buscar en una base de datos, pedir y devolver artículos disponibles,
 por el momento la biblioteca cuenta con libros y películas.
 

**resourse**

`usuario.txt`
Simula el ingreso de datos del usuario, en el orden de ejecución y separando cada comando por líneas.
Para entrar a biblioteca, buscar un libro, escoger la segunda opción, pedirlo prestado y salir de la biblioteca se ingresaría: `C` `B` `2` `P` `S`
_No es sensible a mayúsculas_ 

`ejemplo#.txt` archivos de salida de datos, muestran resultados de ejemplo para varias pruebas realizadas.

**java**

`Artículo.java` Clase con la que se instancia posibles artículos, los cuales pueden ser libros o películas

`Biblioteca.java` Clase con la que se instancia toda la biblioteca enlista todos los artículos que posee.

`Imprenta.java` Imprime los mensajes del sistema en la consola.

`Inventor.java` Clase que inventa libros, películas y usuarios ficticios con el propósito de llenar la biblioteca.

`Usuario.java` Persona registrada que va a acceder a los servicios de la biblioteca.

**prueba**

`ArtículoTest.java`, `BibliotecaTest.java`, `IngresoTest`, `InventorTest.java` y `UsuarioTest` pruebas iniciales con las que se fueron creando las clases.

`Principal.java`
esta clase es la que corre la aplicación, contiene los métodos que conforman el hilo de ejecución del programa, usa la consola para ingresar e imprimir datos.

`PrincipalTest.java`
clase que corre la aplicación pero a diferencia de `Principal.java` utiliza `Usuario.txt` como ingreso e imprime a un archivo de `ejemplo#.txt` en vez de la consola. 

Hilo de ejecución:

>Se crea una biblioteca y un usuario, se llenan los datos usando la clase Inventor.

>Prep(): instancia el lector (scanner) antes de la primera prueba, ya sea todo el thread o pruebas individuales,

>elegir(): Escoge el menú al cual se a a ingresar.

>>menúBienvenida(): Muestra mensaje de bienvenida.

>>menúUsuario()/menúContraseña(): Ingreso del usuario.

>>menúPrincipal(): Opciones: Buscar artículo, pedir, devolver, ver información y salir. 

>>>menúTipo(): Selecciona el tipo del artículo; libro o película.

>>>>menúArticulo(): Escoge el número de artículo de una lista.

>>>>>menúDetalle(): Pide o devuelve el articulo seleccionado.

>>menúPrestar(): Escoge el número a pedir entre todos los artículos.

>>menúDevolver(): Escoge el número a devolver entre todos los artículos.


Se utiliza loop infinito con **brakes** _do{...}while()_ que repite a _elegir()_ hasta que el menú sea _salir_, 


Cuando se imprimen las excepciones
* _Error_: La opción ingresada no existe.
* _ErrorNúmero_: Se ingresa un caracter que no es un número.
* _ErrorTamañoNúmero_: El número es mayor a la lista.
* _ErrorUsuario_: Nombre incorrecto.
* _ErrorContraseña_: Contraseña incorrecta.
* _ImprimirVacio_: La lista de artículos está vacía.



**Datos técnicos**

* Java: 1.8.0_131.jdk
* Gradle: gradle-4.1-milestone-1
* JUnit4: junit-4.12.jar + hamcrest-core-1.3.jar