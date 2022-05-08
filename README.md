# **Cimarron Cancionero**

Cancionero Cimarron es una aplicacion de escritorio, escrita en Java SE para almacenar acordes y letras facilitando su manipulación

## ***Principales Caracteristicas de la Aplicación***

- Permite almacenar letras de canciones asi como cualquier anotacion en texto que esta tenga.
- Permite generar un imprimible de la cancion almacenada.
- [X] Realiza reconocimiento de acordes y permite su manipulacion.

## ***Requisitos de la Aplicación***

Para compilar correctamente la aplicación se necesita: 

- Las librerias que se adjutan en la carpeta ***lib***
- Minimo el ***OpenJDK 16***

Para ejecutar la aplicacion compilada o el JAR comprimido hace falta:

- Como minimo ***Java Runtime 16***

## ***Compilacion y Ejecución***

### **_Compilar la Aplicación_**

Reemplazar en la siguiente sentencia el parametro {All} con el carater * antes de ejecutar.

> javac -cp ./lib/{All}:./src/main/cancionero/ ./src/main/cancionero/{All}/{All} -d ./bin/

### **_Correr la Aplicación_**

Para ejecutar la aplicación se debe primero ingresar al directorio que se elige como destino ...

> cd bin 

... y luego proceder a llamar la maquina virtual de Java.

> java -cp ../bin/*:. cancionero/control/Launcher



