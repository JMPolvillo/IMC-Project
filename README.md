Para este proyecto he estructurado los objetivos de esta forma:

1) Necesitamos que el programa muestre un mensaje para que el usuario introduzca peso y altura.
2) Que el programa calcule el IMC y lo muestre.
3) Que a través del IMC diga el tipo de peso que tiene el usuario según la tabla.

Para construirlo en java he seguido los siguientes pasos:

1) He incluido un package, un import para scanner y hemos nombrado al proyecto "impcproject" con un public class.
2) Se ha iniciado un main con "public static void main(String[] args) {"
3) Para poder usar scanner, hemos creado un objeto de la clase scanner con: "Scanner scanner = new Scanner(System.in);"
4) De la línea 8 a la 14 he usado println para que la aplicación pregunte por el peso y la altura.
5) Hemos usado float para que agregue los valores introducido por el usuario como variables "weight" y "height". He preferido usar "float" por encima de "double" porque no necesitamos tantos digitos para almacenar.
6) Para calcular el imc he vuelto a usar un "float". Que el peso divida al cuadrado de la altura, para calcular el cuadrado de la altura he usado un "math.pow".
7) Para el resto del código he usado un println para que indique el tipo de peso que tiene según el imc. Para ello he usado un else if. Como en los valores de la tabla aparecen corchetes y paréntesis, he usado mayor e igual para los valores que empiezan por [ y menor que para los valores que tengan ).