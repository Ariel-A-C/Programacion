#P1: Arrays

### Ex 1

Se van introduciendo los números escritos por el usuario a un array que luego es transformado en List para poder usar `Collections.shuffle()`. Después se recorre el array reordenado y con tres if (en vez de elif y else porque me ahorraba unas líneas al evitar las llaves {} van aumentando tres contadores según si los números son menores, iguales o superiores a 0.
La única dificultad ha sido buscar cómo ordenar un array, y aunque hay algoritmos que no usan listas he preferido esta manera.

### Ex 2

En el enunciado realmente no se pide nada, solo se da información sobre los DNI españoles. He supuesto que la idea era poner valores de ejemplo y ver si eran válidos. Con esa idea, se le pide al usuario un DNI sin comprobar el formato, se guardan el número y la letra por separado, se calcula el residuo de la operación y se ve si coincide o no correctamente.
Solo ha habido un inconveniente, formatear el array de values, que he pedido a ChatGPT que hiciera para no cansarme de poner comas y comillas.

### Ex 3

Primero se crea la matriz completa aunque a continuación solo se edita una parte añadiendo los números al azar. Después, se van sumando los valores de cada fila, se guarda la suma de todos ellos, y se hace lo propio con las columnas. Al final se suman las sumas y se dibuja una tabla cutre.
He tenido que buscar cómo generar números enteros al azar porque nunca me acuerdo.