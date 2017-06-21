**Biblioteca de Bengalore**


**Recursos**

`usuario.txt`
Simula el ingreso de datos del usuario, en el orden de ejecucion y separando cada comando por líneas.
Para entrar a biblioteca, buscar un líbro, escojer la segunda opción, pedirlo prestado y salir de la biblioteca se ingresaría: `C` `B` `2` `P` `S`
_No es sensible a mayúsculas_ 

`cinco.txt` = 5 _creado con propósitos de prueba_

**Fuentes**

`Libro.java` Clase con la que se instancian libros, contiene solo 1 método que imprime los detalles, hereda las valores de Artículo

`Artículo.java` Clase abstracta con variables para posibles artículos, posibilidades enumeradas en CualArtículo

`CualArtículo.java` Enumera los artículos que podrían estar en la biblioteca como Libro o Revista.

`Biblioteca.java` Clase con la que se instancia toda la biblioteca enlista todos los artículos que posee.

`Editorial.java` Empresa que genera libros ficticios con el propósito de llenar la biblioteca.

`Imprenta.java` Imprime los mensajes del sistema en la consola.


**Pruebas**

`LibroTest.java`, `BibliotecaTest.java`, `EditorialTest.java` pruebas iniciales con las que se fueron creando las clases en **Fuentes**

`PrincipalTest.java`
esta clase es la que corre la aplicación, contiene todas las pruebas del hilo de ejecución principal.

Hilo de ejecución:

>Se declaran las variables de ingreso de datos y se lee el archivo.

>Before/prep(): instancia el lector (scanner) antes de la primera prueba, ya sea todo el thread o pruebas individuales, caso contrario leería todo el archivo desde el comienzo en cada prueba.

>inicio(): Muestra mensaje de bienvenida y espera la tecla 'c'
>>menú(): Muestra las opciones de buscar o salir.
>>>menú2(): Espera a que se ingrese el número del artículo.
>>>>detalle(): Muestra las opciones pedir, devolver y volver, las 3 opciones abren el primer menú.

>>menú(): De regreso se busca de nuevo y se repite o se sale.

>>>salir(): Mensaje despedida

Se utiliza loop infinito con **brakes** _do{...}while(true)_ para evitar que se generen nuevos threads al elegir opciones, 
cada vez que se repite el ciclo se imprime un mensaje de error; 
anteriormente usaba un verificador booleano que era **verdad** al entrar en una opción correcta y **falso** al entrar en otro ciclo, 
los cilos superiores no terminaban hasta no salir haciendo que _salir()_ se ejecute múltiples veces. 

Al final de cada impresión se muestra el ingreso que hizo el usuario, ejemplo: 
`U: c`


Cuando se producen excepciones
* _FileNotFoundException_: El nombre del archivo 'usuario' es incorrecto (throw)
* _java.lang.Exception_: Una prueba dentro de otra falla y hace fallar a la de arriba (throw)
* _NumberFormatException_: Se ingresa en un entero un caracter que no es un número. Se imprime un error informativo.

**Otros**

`cementerio.txt `y `cementerioTest.java` Aquí se encuentran las clases y métodos que ya no estan con nosotros. 


**Datos técnicos**

* Java: 1.8.0_131.jdk
* Gradle: gradle-4.1-milestone-1
* JUnit4: junit-4.12.jar + hamcrest-core-1.3.jar
